package wurmcraft.wurmatron.common.recipes;

import cpw.mods.fml.common.Loader;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import wurmcraft.wurmatron.common.reference.Global;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.recipeHelper.RecipeCreator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RecipeStorage {

		public static final File location = new File(Loader.instance().getConfigDir() + File.separator + Global.NAME);
		public static final File recipeLocation = new File(location + File.separator + "Recipes.txt");

		public static void addLine (String[] args) {
				String line = "";
				for (int s = 0; s < args.length; s++) {
						if (line.length() != 0)
								line = line + "-" + args[s];
						else
								line = args[s];
				}
				try {
						PrintWriter output = new PrintWriter(new FileWriter(recipeLocation, true));
						output.append(line + "\n");
						output.close();
				} catch (IOException e) {
						e.printStackTrace();
				}
		}

		public static void loadRecipes () {
				LogHandler.info("Reloading WurmTweaks Recipes from Recipe.txt");
				if (recipeLocation.exists()) {
						List<String> lines = readAndSplitToLines();
						if (lines != null)
								for (String line : lines) {
										String[] temp = line.split("-");
										if (temp != null) {
												if (temp[0].equalsIgnoreCase("addRecipe") || temp[0].equalsIgnoreCase("addRec")) {
														if (temp[1].equalsIgnoreCase("shaped"))
																RecipeCreator.addShapedRecipe(temp, null, false);
														if (temp[1].equalsIgnoreCase("shapeless"))
																RecipeCreator.addShapelessRecipe(temp, null, false);
												} else if (temp[0].equalsIgnoreCase("removeRecipe") || temp[0].equalsIgnoreCase("removeRec") || temp[0].equalsIgnoreCase("remRec")) {
														ItemStack stack = RecipeCreator.getStackFromString(temp[1]);
														List recipes = CraftingManager.getInstance().getRecipeList();
														int index = 0;
														for (Object recipe : recipes) {
																if (recipe instanceof IRecipe) {
																		if (((IRecipe) recipe).getRecipeOutput() != null)
																				if (((IRecipe) recipe).getRecipeOutput().isItemEqual(stack)) {
																						CraftingManager.getInstance().getRecipeList().remove(index);
																						return;
																				}
																}
																index++;
														}
												}
										}
								}
				} else {
						try {
								location.mkdirs();
								recipeLocation.createNewFile();
						} catch (IOException e) {
								e.printStackTrace();
						}
				}
		}

		public static List<String> readAndSplitToLines () {
				try {
						return Files.readAllLines(Paths.get(recipeLocation.toURI()));
				} catch (IOException e) {
						e.printStackTrace();
				}
				return null;
		}
}

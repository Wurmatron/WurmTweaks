package wurmcraft.wurmatron.common.recipes.utils;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import fox.spiteful.avaritia.crafting.ExtremeShapedOreRecipe;
import fox.spiteful.avaritia.crafting.ExtremeShapelessRecipe;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import wurmcraft.wurmatron.common.config.Settings;
import wurmcraft.wurmatron.common.recipes.Recipes;
import wurmcraft.wurmatron.common.utils.LogHandler;

import java.util.ArrayList;
import java.util.List;

public class RecipeChecker {

		public static List<String> mods = new ArrayList<String>();

		public RecipeChecker () {
				for (ModContainer mod : Loader.instance().getActiveModList()) {
						mods.add(mod.getModId());
				}
				mods.add("minecraft");
		}

		public static boolean check (ShapedOreRecipe recipe) {
				if (checkStack(recipe.getRecipeOutput())) {
						for (Object input : recipe.getInput()) {
								if (input instanceof ItemStack) {
										if (!checkStack((ItemStack) input)) {
												LogHandler.debug("Error with recipe for " + recipe.getRecipeOutput().getItem().getUnlocalizedName());
												return false;
										}
								}

						}
						return true;
				}
				return false;
		}

		public static boolean check (ShapelessOreRecipe recipe) {
				if (checkStack(recipe.getRecipeOutput())) {
						for (Object input : recipe.getInput()) {
								if (input instanceof ItemStack) {
										if (!checkStack((ItemStack) input)) {
												return false;
										}
								}
								if (input instanceof Item) {
										if (!checkStack(new ItemStack((Item) input))) {
												return false;
										}
								}
								if (input instanceof Block) {
										if (!checkStack(new ItemStack((Block) input))) {
												return false;
										}
								}
						}
						return true;
				}
				return false;
		}

		@Optional.Method (modid = "Avaritia")
		public static boolean check9x (ExtremeShapelessRecipe recipe) {
				if (checkStack(recipe.func_77571_b())) {
						for (Object input : recipe.recipeItems) {
								if (input instanceof ItemStack) {
										if (!checkStack((ItemStack) input)) {
												return false;
										}
								}
								if (input instanceof Item) {
										if (!checkStack(new ItemStack((Item) input))) {
												return false;
										}
								}
								if (input instanceof Block) {
										if (!checkStack(new ItemStack((Block) input))) {
												return false;
										}
								}
						}
						return true;
				}
				return false;
		}

		@Optional.Method (modid = "Avaritia")
		public static boolean check9x (ExtremeShapedOreRecipe recipe) {
				if (checkStack(recipe.func_77571_b())) {
						for (Object input : recipe.getInput()) {
								if (input instanceof ItemStack) {
										if (!checkStack((ItemStack) input)) {
												return false;
										}
								}
								if (input instanceof Item) {
										if (!checkStack(new ItemStack((Item) input))) {
												return false;
										}
								}
								if (input instanceof Block) {
										if (!checkStack(new ItemStack((Block) input))) {
												return false;
										}
								}
						}
						return true;
				}
				return false;
		}

		@Optional.Method (modid = "Avaritia")
		public static void check9xAndHandle (ExtremeShapelessRecipe recipe) {
				if (check9x(recipe))
						ExtremeCraftingManager.getInstance().getRecipeList().add(recipe);
		}

		@Optional.Method (modid = "Avaritia")
		public static void check9xAndHandle (ExtremeShapedOreRecipe recipe) {
				if (check9x(recipe))
						ExtremeCraftingManager.getInstance().getRecipeList().add(recipe);
		}

		public static void checkAndHandle (ShapedOreRecipe recipe) {
				if (check(recipe)) {
						GameRegistry.addRecipe(recipe);
						Recipes.shapedRecipes.add(recipe);
				}
		}

		public static void checkAndHandle (ShapelessOreRecipe recipe) {
				if (check(recipe)) {
						GameRegistry.addRecipe(recipe);
						Recipes.shapelessRecipes.add(recipe);
				}
		}

		public static boolean checkStack (ItemStack stack) {
				if (stack != null)
						if (modExists(GameRegistry.findUniqueIdentifierFor(stack.getItem()).modId))
								return true;
				return false;
		}

		public static boolean modExists (String name) {
				return Settings.isModEnabled(name) && mods.contains(name);
		}
}

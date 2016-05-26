package wurmcraft.wurmatron.common.recipes;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import wurmcraft.wurmatron.common.config.Settings;

import java.util.List;

public class RecipeChecker {

		private static List<ModContainer> mods = Loader.instance().getActiveModList();

		public static boolean check (ShapedOreRecipe recipe) {
				if (checkStack(recipe.getRecipeOutput())) {
						for (Object obj : recipe.getInput()) {
								if (obj instanceof ItemStack) {
										ItemStack item = (ItemStack) obj;
										if (!checkStack(item))
												return false;
								}
						}
						return true;
				}
				return false;
		}

		public static boolean check (ShapelessOreRecipe recipe) {
				if (checkStack(recipe.getRecipeOutput())) {
						for (Object obj : recipe.getInput()) {
								if (obj instanceof ItemStack)
										if (!checkStack((ItemStack) obj))
												return false;
						}
						return true;
				}
				return false;
		}

		public static void checkAndHandle (ShapedOreRecipe recipe) {
				if (check(recipe)) {
						GameRegistry.addRecipe(recipe);
				}
		}

		public static void checkAndHandle (ShapelessOreRecipe recipe) {
				if (check(recipe)) {
						GameRegistry.addRecipe(recipe);
				}
		}

		public static boolean checkStack (ItemStack stack) {
				if (stack != null) {
						if (stack.getItem() != null)
								if (GameRegistry.findUniqueIdentifierFor(stack.getItem()).modId.equalsIgnoreCase("minecraft")) {
										return true;
								} else {
										for (ModContainer mod : mods) {
												if (modExists(GameRegistry.findUniqueIdentifierFor(stack.getItem()).modId))
														return true;
										}
								}
				}
				return false;
		}

		public static boolean modExists (String modid) {
				if (Settings.isModEnabled(modid))
						for (ModContainer mod : mods)
								if (mod.getModId().equalsIgnoreCase(modid))
										return true;
				return true;
		}
}
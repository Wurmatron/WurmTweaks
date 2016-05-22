package wurmcraft.wurmatron.common.recipes;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import wurmcraft.wurmatron.common.recipes.mods.AM2Recipes;
import wurmcraft.wurmatron.common.recipes.mods.AdvancedSolarPanelRecipes;
import wurmcraft.wurmatron.common.recipes.mods.TerrafirmacraftRecipes;
import wurmcraft.wurmatron.common.recipes.utils.RecipeChecker;
import wurmcraft.wurmatron.common.recipes.utils.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

import java.util.ArrayList;

public class Recipes {

		public static ArrayList<ShapedOreRecipe> shapedRecipes = new ArrayList<ShapedOreRecipe>();
		public static ArrayList<ShapelessOreRecipe> shapelessRecipes = new ArrayList<ShapelessOreRecipe>();

		public static void init () {
				LogHandler.info("Removing all the games recipes");
				CraftingManager.getInstance().getRecipeList().clear();
				OreDict.init();
				LogHandler.info("Adding custom recipes");
				TerrafirmacraftRecipes.addRecipes();
				if (RecipeChecker.modExists("AdvancedSolarPanel"))
						AdvancedSolarPanelRecipes.addRecipes();
				if (RecipeChecker.modExists("arsmagica2"))
						AM2Recipes.addRecipes();
		}

		public static void checkSettings () {
				LogHandler.info("Checking Recipes for issues");
				for (ShapedOreRecipe r : shapedRecipes)
						if (!CraftingManager.getInstance().getRecipeList().contains(r))
								RecipeHelper.instance.addShaped(r.getRecipeOutput(), r.getInput());
				for (ShapelessOreRecipe r : shapelessRecipes)
						if (!CraftingManager.getInstance().getRecipeList().contains(r))
								RecipeHelper.instance.addShapeless(r.getRecipeOutput(), r.getInput());
				LogHandler.info("Done checking recipes");
		}

}

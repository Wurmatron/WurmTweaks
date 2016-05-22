package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.Core.Recipes;
import cpw.mods.fml.common.Optional;
import wurmcraft.wurmatron.common.recipes.utils.RecipeHelper;

public class TerrafirmacraftRecipes {

		private static RecipeHelper r = RecipeHelper.instance;

		@Optional.Method(modid = "terrafirmacraft")
		public static void addRecipes() {
				Recipes.registerRecipes();
		}
}

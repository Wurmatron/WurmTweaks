package wurmcraft.wurmatron.common.recipes.mods;

import cpw.mods.fml.common.Optional;
import jds.bibliowood.tfcwood.WoodsLoader;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class BibliocraftTFCRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "BiblioWoodsTFC")
		public static void addRecipes() {
				WoodsLoader.initRecipes();
		}
}

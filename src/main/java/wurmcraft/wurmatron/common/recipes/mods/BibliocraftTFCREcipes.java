package wurmcraft.wurmatron.common.recipes.mods;

import cpw.mods.fml.common.Optional;
import jds.bibliowood.tfcwood.WoodsLoader;

/**
 * Recipes Verified by Wurmatron
 * on 6/9/2016 with v1.2
 */
public class BibliocraftTFCRecipes {

		@Optional.Method (modid = "BiblioWoodsTFC")
		public static void addRecipes () {
				WoodsLoader.initRecipes();
		}
}
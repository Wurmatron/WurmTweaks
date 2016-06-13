package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.Core.Recipes;
import com.bioxx.tfc.api.TFCBlocks;
import cpw.mods.fml.common.Optional;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class TerrafirmacraftRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "terrafirmacraft")
		public static void addRecipes () {
				Recipes.registerRecipes();
				// Recipe created by koolcrafter5 on 6/12/16
				r.addCircleWCenter(WurmTweaksItems.itemPumpkinBits, WurmTweaksItems.itemMixedSheet,"packSeed");
				r.addCircleWCenter(TFCBlocks.pumpkin, WurmTweaksItems.itemPumpkinBits, WurmTweaksItems.itemCraftingCore);
		}
}

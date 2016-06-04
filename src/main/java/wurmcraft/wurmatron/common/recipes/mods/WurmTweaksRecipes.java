package wurmcraft.wurmatron.common.recipes.mods;

import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class WurmTweaksRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				LogHandler.info("Adding WurmTweaks Recipes");
				r.addCrossWCenter(new ItemStack(WurmTweaksItems.itemAutoCore.getItem(), 4, 20), WurmTweaksItems.ingotFrancium, WurmTweaksItems.ingotEnergyReactor, "packCraftingTable");
		}
}

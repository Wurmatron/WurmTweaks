package wurmcraft.wurmatron.common.recipes.mods;

import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class WurmTweaksRecipes {

		private static RecipeHelper r = RecipeHelper.instance;

		public static void addRecipes () {
				r.addCrossWCenter(new ItemStack(WurmTweaksItems.itemAutoCore.getItem(),4,20), WurmTweaksItems.ingotFrancium, WurmTweaksItems.ingotEnergyReactor, "packCraftingTable");
		}
}

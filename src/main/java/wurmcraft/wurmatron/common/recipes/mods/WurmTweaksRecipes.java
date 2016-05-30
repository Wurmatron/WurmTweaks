package wurmcraft.wurmatron.common.recipes.mods;

import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.api.IModRecipes;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;

public class WurmTweaksRecipes implements IModRecipes {

		@Override
		public void addRecipes () {
				r.addCrossWCenter(new ItemStack(WurmTweaksItems.itemAutoCore.getItem(), 4, 20), WurmTweaksItems.ingotFrancium, WurmTweaksItems.ingotEnergyReactor, "packCraftingTable");
		}
}

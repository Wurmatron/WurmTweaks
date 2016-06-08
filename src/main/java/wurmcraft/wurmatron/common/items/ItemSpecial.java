package wurmcraft.wurmatron.common.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.HashMap;
import java.util.List;

public class ItemSpecial extends Item {

		private static HashMap<String, EnumChatFormatting> itemNames = new HashMap<String, EnumChatFormatting>();
		private IIcon[] icons;

		public ItemSpecial (HashMap<String, EnumChatFormatting> names) {
				setCreativeTab(CreativeTabs.tabMaterials);
				setUnlocalizedName("itemSpecial");
				setHasSubtypes(true);
				itemNames = names;
				icons = new IIcon[itemNames.size() + 1];
		}

		@Override
		public String getItemStackDisplayName (ItemStack stack) {
				return itemNames.get(itemNames.keySet().toArray()[stack.getItemDamage()]) + "item." + itemNames.keySet().toArray()[stack.getItemDamage()] + ".name";
		}

		@Override
		public void registerIcons (IIconRegister iicon) {
				for (int m = 0; m < itemNames.size(); m++)
						icons[m] = iicon.registerIcon(Global.MODID + ":" + itemNames.keySet().toArray()[m]);
		}

		@Override
		public IIcon getIconFromDamage (int meta) {
				if (meta > itemNames.size() + 1)
						meta = 0;
				return icons[meta];
		}

		@Override
		public void getSubItems (Item item, CreativeTabs tab, List sub) {
				for (int m = 0; m < itemNames.size(); m++)
						sub.add(new ItemStack(this, 1, m));
		}
}

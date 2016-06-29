package wurmcraft.wurmatron.common.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import wurmcraft.wurmatron.WurmTweaks;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ItemToken extends Item {

		private static HashMap<String, EnumChatFormatting> itemColors = new HashMap<String, EnumChatFormatting>();
		private static ArrayList<String> itemNames = new ArrayList<String>();
		private IIcon[] icons;

		public ItemToken (ArrayList<String> items, HashMap<String, EnumChatFormatting> names) {
				setCreativeTab(WurmTweaks.tabWurmTweaks);
				setHasSubtypes(true);
				itemColors = names;
				itemNames = items;
				icons = new IIcon[itemNames.size() + 1];
		}

		@Override
		public String getItemStackDisplayName (ItemStack stack) {
				return itemColors.get(itemNames.get(stack.getItemDamage())) + StatCollector.translateToLocal("item." + itemNames.get(stack.getItemDamage()) + ".name");
		}

		@Override
		public void registerIcons (IIconRegister iicon) {
				for (int m = 0; m < itemNames.size(); m++)
						icons[m] = iicon.registerIcon(Global.MODID + ":" + itemNames.get(m));
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

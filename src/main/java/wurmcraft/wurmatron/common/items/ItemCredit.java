package wurmcraft.wurmatron.common.items;


import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.List;

public class ItemCredit extends Item {

		private String name;
		private IIcon[] icons;
		public static int[] units = new int[] {30, 50, 70, 60, 100, 140};

		public ItemCredit (String creditName) {
				setCreativeTab(CreativeTabs.tabMaterials);
				setUnlocalizedName(creditName);
				setHasSubtypes(true);
				name = creditName;
				icons = new IIcon[7];
		}

		@Override
		public String getItemStackDisplayName (ItemStack stack) {
				return StatCollector.translateToLocal("item." + name + "-" + stack.getItemDamage() + ".name");
		}

		@Override
		public void registerIcons (IIconRegister iicon) {
				for (int i = 0; i < 6; i++)
						icons[i] = iicon.registerIcon(Global.MODID + ":" + name + "_" + i);
		}

		@Override
		public IIcon getIconFromDamage (int meta) {
				return icons[meta];
		}

		@Override
		public void getSubItems (Item item, CreativeTabs tab, List sub) {
				for (int m = 0; m < 6; m++)
						sub.add(new ItemStack(this, 1, m));
		}

		@Override
		public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean adv) {
				list.add(EnumChatFormatting.GRAY + "" + units[stack.getItemDamage()] + "units per piece");
				list.add(EnumChatFormatting.AQUA + "" + (units[stack.getItemDamage()] * stack.stackSize) + " units");
				list.add(EnumChatFormatting.AQUA + "" + ((units[stack.getItemDamage()] * stack.stackSize) / 100) + " ingots");
				list.add(EnumChatFormatting.AQUA + "" + ((units[stack.getItemDamage()] * stack.stackSize) * 10) + " mb");
				super.addInformation(stack, player, list, adv);
		}
}

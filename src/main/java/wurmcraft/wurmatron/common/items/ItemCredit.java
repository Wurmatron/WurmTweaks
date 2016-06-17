package wurmcraft.wurmatron.common.items;


import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import wurmcraft.wurmatron.WurmTweaks;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.List;

public class ItemCredit extends Item {

		private String name;
		private IIcon icon;
		public static final int[] units = new int[] {30, 50, 70, 60, 100, 140};

		public ItemCredit (String creditName) {
				setCreativeTab(WurmTweaks.tabWurmTweaks);
				setUnlocalizedName(creditName);
				setHasSubtypes(true);
				name = creditName;
		}

		@Override
		public String getItemStackDisplayName (ItemStack stack) {
				return StatCollector.translateToLocal("item." + name + "-" + stack.getItemDamage() + ".name");
		}

		@Override
		public void registerIcons (IIconRegister iicon) {
				icon = iicon.registerIcon(Global.MODID + ":" + name);
		}

		@Override
		public IIcon getIconFromDamage (int meta) {
				return icon;
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

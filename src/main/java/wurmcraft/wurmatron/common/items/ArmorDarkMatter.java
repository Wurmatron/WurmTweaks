package wurmcraft.wurmatron.common.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wurmcraft.wurmatron.WurmTweaks;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.List;

public class ArmorDarkMatter extends ItemArmor {

		public ArmorDarkMatter (ArmorMaterial material, int index, int type) {
				super(material, index, type);
				setCreativeTab(WurmTweaks.tabWurmTweaks);
				setTextureName(Global.MODID + ":" + "darkMatter_" + type);
		}

		@Override
		public void onArmorTick (World world, EntityPlayer player, ItemStack stack) {
				if (stack.getItemDamage() > 0)
						stack.setItemDamage(0);
				super.onArmorTick(world, player, stack);
		}

		@Override
		public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean adv) {
				list.add(EnumChatFormatting.GRAY + "You are starting too see the limits of mortal technology.");
				list.add(EnumChatFormatting.RED + "This armor will automatically feed and hydrate you.");
		}

		@Override
		public String getItemStackDisplayName (ItemStack stack) {
				return EnumChatFormatting.DARK_GRAY + (StatCollector.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
		}

		@Override
		public String getArmorTexture (ItemStack stack, Entity entity, int slot, String type) {
				if (slot == 0 || slot == 1 || slot == 3)
						return Global.MODID + ":textures/armor/darkMatter_0.png";
				if (slot == 2)
						return Global.MODID + ":textures/armor/darkMatter_1.png";
				return null;
		}
}

package wurmcraft.wurmatron.common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import wurmcraft.wurmatron.WurmTweaks;

import java.util.List;

public class ArmorRedMatter extends ItemArmor {

		public ArmorRedMatter (ArmorMaterial material, int index, int slot) {
				super(material, index, slot);
				setCreativeTab(WurmTweaks.tabWurmTweaks);
		}

		@Override
		public void onArmorTick (World world, EntityPlayer player, ItemStack stack) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 5, 5));
				if (stack.getItemDamage() > 0)
						stack.setItemDamage(0);
				super.onArmorTick(world,player,stack);
		}

		@Override
		public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean adv) {
				list.add(EnumChatFormatting.GRAY + "You Seem to be looking at the most advanced thing an mortal has created.");
		}
}

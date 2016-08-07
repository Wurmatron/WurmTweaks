package wurmcraft.wurmatron.common.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import wurmcraft.wurmatron.WurmTweaks;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.List;

public class ArmorRedMatter extends ItemArmor {

		public ArmorRedMatter (ArmorMaterial material, int index, int type) {
				super(material, index, type);
				setCreativeTab(WurmTweaks.tabWurmTweaks);
				setTextureName(Global.MODID + ":" + "redMatter_" + type);
		}

		@Override
		public void onArmorTick (World world, EntityPlayer player, ItemStack stack) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 20, 20));
				if (stack.getItemDamage() > 0)
						stack.setItemDamage(0);
				super.onArmorTick(world, player, stack);
		}

		@Override
		public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean adv) {
				list.add(EnumChatFormatting.RED + "You Seem to be looking at the most advanced thing an mortal has created.");
		}

		@Override
		public String getArmorTexture (ItemStack stack, Entity entity, int slot, String type) {
				if (slot == 0 || slot == 1 || slot == 3)
						return Global.MODID + ":textures/armor/redMatter_0.png";
				if (slot == 2)
						return Global.MODID + ":textures/armor/redMatter_1.png";
				return null;
		}
}

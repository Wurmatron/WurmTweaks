package wurmcraft.wurmatron.common.utils.nbt;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

import java.util.UUID;

public class ItemNBT {

		public final static UUID MODIFIER_UUID = UUID.fromString("294093da-54f0-4c1b-9dbb-13b77534a84c");

		public static ItemStack addDamage (ItemStack stack, int Damage) {
				AttributeModifier attackModifier = new AttributeModifier(MODIFIER_UUID, "Weapon Upgrade", 30 + Damage, 0);
				NBTTagCompound modifierNBT = writeAttributeModifierToNBT(SharedMonsterAttributes.attackDamage, attackModifier);
				NBTTagCompound stackTagCompound = new NBTTagCompound();
				NBTTagList list = new NBTTagList();
				list.appendTag(modifierNBT);
				stackTagCompound.setTag("AttributeModifiers", list);
				stack.setTagCompound(stackTagCompound);
				return stack;
		}

		private static NBTTagCompound writeAttributeModifierToNBT (IAttribute attribute, AttributeModifier modifier) {
				NBTTagCompound nbttagcompound = new NBTTagCompound();
				nbttagcompound.setString("AttributeName", SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName());
				nbttagcompound.setString("Name", modifier.getName());
				nbttagcompound.setDouble("Amount", modifier.getAmount());
				nbttagcompound.setInteger("Operation", modifier.getOperation());
				nbttagcompound.setLong("UUIDMost", modifier.getID().getMostSignificantBits());
				nbttagcompound.setLong("UUIDLeast", modifier.getID().getLeastSignificantBits());
				return nbttagcompound;
		}

		public static ItemStack addMaxHealth (ItemStack stack, int amount) {
				AttributeModifier healthMod = new AttributeModifier(MODIFIER_UUID, "MaxHealth", amount, 0);
				NBTTagCompound modifierNBT = writeAttributeModifierToNBT(SharedMonsterAttributes.maxHealth, healthMod);
				NBTTagList list = new NBTTagList();
				NBTTagCompound stackTagCompound = new NBTTagCompound();
				list.appendTag(modifierNBT);
				stackTagCompound.setTag("AttributeModifiers", list);
				stack.setTagCompound(stackTagCompound);
				return stack;
		}
}

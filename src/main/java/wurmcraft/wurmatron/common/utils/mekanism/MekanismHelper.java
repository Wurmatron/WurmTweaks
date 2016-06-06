package wurmcraft.wurmatron.common.utils.mekanism;

import mekanism.common.MekanismBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class MekanismHelper {

		public static ItemStack getCubeStatic (int type) {
				ItemStack stack = new ItemStack(MekanismBlocks.EnergyCube, 1, 100);
				NBTTagCompound tag = new NBTTagCompound();
				if (type == 0) {
						tag.setString("tier", "Basic");
						stack.setTagCompound(tag);
						return stack;
				}
				if (type == 1) {
						tag.setString("tier", "Advanced");
						stack.setTagCompound(tag);
						return stack;
				}
				if (type == 2) {
						tag.setString("tier", "Elite");
						stack.setTagCompound(tag);
						return stack;
				}
				if (type == 3) {
						tag.setString("tier", "Ultimate");
						stack.setTagCompound(tag);
						return stack;
				}
				return null;
		}

		public static ItemStack getBasic (int type) {
				ItemStack stack = new ItemStack(MekanismBlocks.MachineBlock, 1, 5);
				NBTTagCompound tag = new NBTTagCompound();
				if (type == 0)
						tag.setInteger("recipeType", 0);
				if (type == 1)
						tag.setInteger("recipeType", 1);
				if (type == 2)
						tag.setInteger("recipeType", 2);
				if (type == 3)
						tag.setInteger("recipeType", 3);
				if (type == 4)
						tag.setInteger("recipeType", 3);
				if (type == 5)
						tag.setInteger("recipeType", 5);
				if (type == 6)
						tag.setInteger("recipeType", 6);
				stack.setTagCompound(tag);
				return stack;
		}

		public static ItemStack getAdvanced (int type) {
				ItemStack stack = new ItemStack(MekanismBlocks.MachineBlock, 1, 6);
				NBTTagCompound tag = new NBTTagCompound();
				if (type == 0)
						tag.setInteger("recipeType", 0);
				if (type == 1)
						tag.setInteger("recipeType", 1);
				if (type == 2)
						tag.setInteger("recipeType", 2);
				if (type == 3)
						tag.setInteger("recipeType", 3);
				if (type == 4)
						tag.setInteger("recipeType", 3);
				if (type == 5)
						tag.setInteger("recipeType", 5);
				if (type == 6)
						tag.setInteger("recipeType", 6);
				stack.setTagCompound(tag);
				return stack;
		}

		public static ItemStack getElite (int type) {
				ItemStack stack = new ItemStack(MekanismBlocks.MachineBlock, 1, 7);
				NBTTagCompound tag = new NBTTagCompound();
				if (type == 0)
						tag.setInteger("recipeType", 0);
				if (type == 1)
						tag.setInteger("recipeType", 1);
				if (type == 2)
						tag.setInteger("recipeType", 2);
				if (type == 3)
						tag.setInteger("recipeType", 3);
				if (type == 4)
						tag.setInteger("recipeType", 3);
				if (type == 5)
						tag.setInteger("recipeType", 5);
				if (type == 6)
						tag.setInteger("recipeType", 6);
				stack.setTagCompound(tag);
				return stack;
		}

		public static ItemStack getInduction (int type) {
				ItemStack stack = new ItemStack(MekanismBlocks.BasicBlock2, 1, 3);
				NBTTagCompound tag = new NBTTagCompound();
				if (type == 0)
						tag.setInteger("tier", 0);
				if (type == 1)
						tag.setInteger("tier", 1);
				if (type == 2)
						tag.setInteger("tier", 2);
				if (type == 3)
						tag.setInteger("tier", 3);
				stack.setTagCompound(tag);
				return stack;
		}

		public static ItemStack getAdvancedInduction (int type) {
				ItemStack stack = new ItemStack(MekanismBlocks.BasicBlock2, 1, 4);
				NBTTagCompound tag = new NBTTagCompound();
				if (type == 0)
						tag.setInteger("tier", 0);
				if (type == 1)
						tag.setInteger("tier", 1);
				if (type == 2)
						tag.setInteger("tier", 2);
				if (type == 3)
						tag.setInteger("tier", 3);
				stack.setTagCompound(tag);
				return stack;

		}
}

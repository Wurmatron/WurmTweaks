package wurmcraft.wurmatron.common.utils.railcraft;

import cpw.mods.fml.common.Optional;
import mods.railcraft.api.crafting.IRockCrusherRecipe;
import mods.railcraft.api.crafting.RailcraftCraftingManager;
import mods.railcraft.common.blocks.RailcraftBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;

public class RailcraftHelper {

		@Optional.Method (modid = "Railcraft")
		public static ItemStack getTrack (int size, String name, int meta) {
				ItemStack track = new ItemStack(RailcraftBlocks.getBlockTrack(), size, meta);
				NBTTagCompound nbt = new NBTTagCompound();
				nbt.setString("track", name);
				track.setTagCompound(nbt);
				return track;
		}

		@Optional.Method (modid = "Railcraft")
		public static void addRollingMachineRecipe (ItemStack output, Object... recipe) {
				RailcraftCraftingManager.rollingMachine.addRecipe(output, recipe);
		}

		@Optional.Method (modid = "Railcraft")
		public static void addBlastFurnaceRecipe (ItemStack input, boolean matchDamage, boolean matchNBT, int cookTime, ItemStack output) {
				RailcraftCraftingManager.blastFurnace.addRecipe(input, matchDamage, matchNBT, cookTime, output);
		}

		@Optional.Method (modid = "Railcraft")
		public static void addCokeOvenRecipe (ItemStack input, boolean matchDamage, boolean matchNBT, ItemStack output, FluidStack fluid, int cookTime) {
				RailcraftCraftingManager.cokeOven.addRecipe(input, matchDamage, matchNBT, output, fluid, cookTime);
		}

		@Optional.Method (modid = "Railcraft")
		public static IRockCrusherRecipe addRockCrusherRecipe (ItemStack input, boolean matchDamage, boolean matchNBT) {
				return RailcraftCraftingManager.rockCrusher.createNewRecipe(input, matchDamage, matchNBT);
		}

		@Optional.Method (modid = "Railcraft")
		public static void addRockCrusherOutput (IRockCrusherRecipe recipe, ItemStack output, int chance) {
				recipe.addOutput(output, chance);
		}
}

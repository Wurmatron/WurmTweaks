package wurmcraft.wurmatron.common.utils.IE;

import blusunrize.immersiveengineering.api.crafting.BlastFurnaceRecipe;
import blusunrize.immersiveengineering.api.crafting.CokeOvenRecipe;
import blusunrize.immersiveengineering.api.crafting.CrusherRecipe;
import blusunrize.immersiveengineering.api.energy.DieselHandler;
import cpw.mods.fml.common.Optional;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class IEHelper {

		@Optional.Method (modid = "ImmersiveEngineering")
		public static void addCrusherRecipe (ItemStack output, ItemStack input, int power) {
				CrusherRecipe.addRecipe(output, input, power);
		}

		@Optional.Method (modid = "ImmersiveEngineering")
		public static void addFermenterRecipe (ItemStack output, ItemStack input, int time, FluidStack fluid) {
				DieselHandler.addFermenterRecipe(input, time, fluid, output);
		}

		@Optional.Method (modid = "ImmersiveEngineering")
		public static void addSqueezerRecipe (ItemStack output, ItemStack input, int time, FluidStack fluid) {
				DieselHandler.addSqueezerRecipe(input, time, fluid, output);
		}

		@Optional.Method (modid = "ImmersiveEngineering")
		public static void addBlastFurnaceRecipe (ItemStack output, ItemStack input, int time, ItemStack slag) {
				BlastFurnaceRecipe.addRecipe(output, input, time, slag);
		}

		@Optional.Method (modid = "ImmersiveEngineering")
		public static void addBlastFurnaceFuel (Object item, int time) {
				BlastFurnaceRecipe.addBlastFuel(item, time);
		}

		@Optional.Method (modid = "ImmersiveEngineering")
		public static void addCokeOvenRecipe (ItemStack output, ItemStack input, int time, int oil) {
				CokeOvenRecipe.addRecipe(output, input, time, oil);
		}
}

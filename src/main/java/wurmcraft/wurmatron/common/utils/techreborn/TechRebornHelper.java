package wurmcraft.wurmatron.common.utils.techreborn;

import cpw.mods.fml.common.Optional;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import techreborn.api.TechRebornAPI;
import techreborn.api.reactor.FusionReactorRecipe;
import techreborn.api.reactor.FusionReactorRecipeHelper;
import techreborn.api.recipe.RecipeHandler;
import techreborn.api.recipe.machines.*;

public class TechRebornHelper {

		@Optional.Method (modid = "techreborn")
		public static void addShapedRollingMachineRecipe (ItemStack output, Object... recipe) {
				TechRebornAPI.addRollingOreMachinceRecipe(output, recipe);
		}

		@Optional.Method (modid = "techreborn")
		public static void addShapelessRollingMachineRecipe (ItemStack output, Object... recipe) {
				TechRebornAPI.addShapelessOreRollingMachinceRecipe(output, recipe);
		}

		@Optional.Method (modid = "techreborn")
		public static void adAssemblingMachineRecipe (ItemStack input1, ItemStack input2, ItemStack output, int timeInTicks, int euTick) {
				RecipeHandler.addRecipe(new AssemblingMachineRecipe(input1, input2, output, timeInTicks, euTick));
		}

		@Optional.Method (modid = "techreborn")
		public static void addSawMillRecipe (ItemStack input1, ItemStack input2, FluidStack fluid, ItemStack output1, ItemStack output2, ItemStack output3, int timeInTicks, int euTick) {
				RecipeHandler.addRecipe(new IndustrialSawmillRecipe(input1, input2, fluid, output1, output2, output3, timeInTicks, euTick));
		}

		@Optional.Method (modid = "techreborn")
		public static void addImplosionCompressorRecipe (ItemStack input1, ItemStack input2, ItemStack output1, ItemStack output2, int timeInTicks, int euTick) {
				RecipeHandler.addRecipe(new ImplosionCompressorRecipe(input1, input2, output1, output2, timeInTicks, euTick));
		}

		@Optional.Method (modid = "techreborn")
		public static void addGrinderRecipe (ItemStack input1, ItemStack input2, FluidStack fluid, ItemStack output1, ItemStack output2, ItemStack output3, ItemStack output4, int timeInTicks, int euTick) {
				RecipeHandler.addRecipe(new GrinderRecipe(input1, input2, fluid, output1, output2, output3, output4, timeInTicks, euTick));
		}

		@Optional.Method (modid = "techreborn")
		public static void addVacuumeFreezerRecipe (ItemStack input, ItemStack output, int timeInTicks, int euTick) {
				RecipeHandler.addRecipe(new VacuumFreezerRecipe(input, output, timeInTicks, euTick));
		}

		@Optional.Method (modid = "techreborn")
		public static void addCentrifugeRecipe (ItemStack input1, ItemStack input2, ItemStack output1, ItemStack output2, ItemStack output3, ItemStack output4, int timeInTicks, int euTick) {
				RecipeHandler.addRecipe(new CentrifugeRecipe(input1, input2, output1, output2, output3, output4, timeInTicks, euTick));
		}

		@Optional.Method (modid = "techreborn")
		public static void addBlastFurnaceRecipe (ItemStack input1, ItemStack input2, ItemStack output1, ItemStack output2, int timeInTicks, int euTick, int neededHeat) {
				RecipeHandler.addRecipe(new BlastFurnaceRecipe(input1, input2, output1, output2, timeInTicks, euTick, neededHeat));
		}

		@Optional.Method (modid = "techreborn")
		public static void addAlloySmelterRecipe (ItemStack input1, ItemStack input2, ItemStack output1, int timeInTicks, int euTick) {
				RecipeHandler.addRecipe(new AlloySmelterRecipe(input1, input2, output1, timeInTicks, euTick));
		}

		@Optional.Method (modid = "techreborn")
		public static void addFusionReactoRecipe (ItemStack inputTop, ItemStack inputBottom, ItemStack output, int startEU, int euTick, int timeInTicks) {
				FusionReactorRecipeHelper.registerRecipe(new FusionReactorRecipe(inputTop, inputBottom, output, startEU, euTick, timeInTicks));
		}

		@Optional.Method (modid = "techreborn")
		public static void addIndustrialElectrolyzerRecipe (ItemStack input1, ItemStack input2, ItemStack output1, ItemStack output2, ItemStack output3, ItemStack output4, int timeInTicks, int euTick) {
				RecipeHandler.addRecipe(new IndustrialElectrolyzerRecipe(input1, input2, output1, output2, output3, output4, timeInTicks, euTick));
		}

		@Optional.Method (modid = "techreborn")
		public static void addChemicalReactorRecipe (ItemStack input1, ItemStack input2, ItemStack output1, int timeInTicks, int euTick) {
				RecipeHandler.addRecipe(new ChemicalReactorRecipe(input1, input2, output1, timeInTicks, euTick));
		}
}

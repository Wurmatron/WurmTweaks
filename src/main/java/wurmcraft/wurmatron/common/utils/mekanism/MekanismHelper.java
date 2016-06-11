package wurmcraft.wurmatron.common.utils.mekanism;

import cpw.mods.fml.common.Optional;
import mekanism.api.gas.GasStack;
import mekanism.api.infuse.InfuseType;
import mekanism.common.MekanismBlocks;
import mekanism.common.recipe.RecipeHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;

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

		@Optional.Method (modid = "Mekanism")
		public static void addEnrichmentChamberRecipe (ItemStack output, ItemStack input) {
				if (RecipeChecker.checkStack(output))
						RecipeHandler.addEnrichmentChamberRecipe(output, input);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addOsmiumCompressorRecipe (ItemStack output, ItemStack input) {
				if (RecipeChecker.checkStack(output))
						RecipeHandler.addOsmiumCompressorRecipe(output, input);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addCombinerRecipe (ItemStack output, ItemStack input) {
				if (RecipeChecker.checkStack(output))
						RecipeHandler.addCombinerRecipe(output, input);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addCrusherRecipe (ItemStack output, ItemStack input) {
				if (RecipeChecker.checkStack(output))
						RecipeHandler.addCrusherRecipe(output, input);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addPurificationChamberRecipe (ItemStack output, ItemStack input) {
				if (RecipeChecker.checkStack(output))
						RecipeHandler.addPurificationChamberRecipe(output, input);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addChemicalOxidizerRecipe (GasStack output, ItemStack input) {
				if (RecipeChecker.checkStack(input))
						RecipeHandler.addChemicalOxidizerRecipe(input, output);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addChemicalInfuserRecipe (GasStack output, GasStack input1, GasStack input2) {
				RecipeHandler.addChemicalInfuserRecipe(input1, input2, output);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addPrecisionSawmillRecipe (ItemStack input, ItemStack primaryOutput, ItemStack secondaryOutput, double chance) {
				if (RecipeChecker.checkStack(primaryOutput) && RecipeChecker.checkStack(secondaryOutput))
						RecipeHandler.addPrecisionSawmillRecipe(input, primaryOutput, secondaryOutput, chance);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addChemicalInjectionChamberRecipe (ItemStack output, String gasName, ItemStack input) {
				if (RecipeChecker.checkStack(output))
						RecipeHandler.addChemicalInjectionChamberRecipe(input, gasName, output);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addElectrolyticSeparatorRecipe (FluidStack input, double energy, GasStack leftOutput, GasStack rightOutput) {
				RecipeHandler.addElectrolyticSeparatorRecipe(input, energy, leftOutput, rightOutput);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addChemicalWasherRecipe (GasStack input, GasStack output) {
				RecipeHandler.addChemicalWasherRecipe(input, output);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addChemicalCrystallizerRecipe (GasStack input, ItemStack output) {
				if (RecipeChecker.checkStack(output))
						RecipeHandler.addChemicalCrystallizerRecipe(input, output);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addMetallurgicInfuserRecipe (InfuseType infuse, int amount, ItemStack input, ItemStack output) {
				if (RecipeChecker.checkStack(output))
						RecipeHandler.addMetallurgicInfuserRecipe(infuse, amount, input, output);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addPRCRecipe (ItemStack inputSolid, FluidStack inputFluid, GasStack inputGas, ItemStack outputSolid, GasStack outputGas, double extraEnergy, int ticks) {
				if (RecipeChecker.checkStack(outputSolid))
						RecipeHandler.addPRCRecipe(inputSolid, inputFluid, inputGas, outputSolid, outputGas, extraEnergy, ticks);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addThermalEvaporationRecipe (FluidStack input, FluidStack output) {
				RecipeHandler.addThermalEvaporationRecipe(input, output);
		}

		@Optional.Method (modid = "Mekanism")
		public static void addSolarNeutronRecipe (GasStack input, GasStack output) {
				RecipeHandler.addSolarNeutronRecipe(input, output);
		}
}

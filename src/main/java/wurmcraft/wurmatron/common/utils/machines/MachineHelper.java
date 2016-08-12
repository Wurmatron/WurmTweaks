package wurmcraft.wurmatron.common.utils.machines;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.ItemCredit;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.utils.CreditHelper;
import wurmcraft.wurmatron.common.utils.IE.IEHelper;
import wurmcraft.wurmatron.common.utils.ic2.ICHelper;
import wurmcraft.wurmatron.common.utils.mekanism.MekanismHelper;
import wurmcraft.wurmatron.common.utils.railcraft.RailcraftHelper;
import wurmcraft.wurmatron.common.utils.techreborn.TechRebornHelper;
import wurmcraft.wurmatron.common.utils.thermalexpansion.TEHelper;

public class MachineHelper {

		public static void addShapedRollingMachineRecipe (ItemStack output, Object... recipe) {
				if (RecipeChecker.checkStack(output)) {
						if (RecipeChecker.modExists("techreborn"))
								TechRebornHelper.addShapedRollingMachineRecipe(output, recipe);
						if (RecipeChecker.modExists("Railcraft"))
								RailcraftHelper.addRollingMachineRecipe(output, recipe);
				}
		}

		public static void addSawMillRecipe (ItemStack output, ItemStack output2, ItemStack input, double chance, int euTick, int timeinTicks) {
				if (RecipeChecker.checkStack(output)) {
						if (RecipeChecker.modExists("techreborn"))
								TechRebornHelper.addSawMillRecipe(input, null, null, output, output2, null, timeinTicks, euTick);
						if (RecipeChecker.modExists("Mekanism"))
								MekanismHelper.addPrecisionSawmillRecipe(input, output, output2, chance);
				}
		}

		public static void addAlloySmelterRecipe (ItemStack input1, ItemStack input2, ItemStack output, int euTick, int timeinTicks) {
				if (RecipeChecker.checkStack(output)) {
						if (RecipeChecker.modExists("techreborn"))
								TechRebornHelper.addAlloySmelterRecipe(input1, input2, output, euTick, timeinTicks);
						if(RecipeChecker.modExists("ThermalExpansion"))
								TEHelper.addSmelterRecipe(euTick*timeinTicks*20,input1,input2,output);
				}
		}

		public static void addPulveriserRecipes (ItemStack output, ItemStack input, int euTick, int timeInTicks, ItemStack secendary, int chance) {
				if (RecipeChecker.checkStack(output)) {
						if (RecipeChecker.modExists("ThermalExpansion")) {
								if (!(output.getItem() instanceof ItemCredit))
										TEHelper.addPulverizerRecipe(euTick * timeInTicks, input, output, secendary, chance);
								else
										TEHelper.addPulverizerRecipe(euTick * timeInTicks, input, CreditHelper.getCreditsFromTypeAndUnits(output.getItem(), ItemCredit.units[output.getItemDamage()]), secendary, chance);
						}
						if (RecipeChecker.modExists("Mekanism")) {
								if (!(output.getItem() instanceof ItemCredit))
										MekanismHelper.addEnrichmentChamberRecipe(output, input);
								else
										MekanismHelper.addEnrichmentChamberRecipe(CreditHelper.getCreditsFromTypeAndUnits(output.getItem(), ItemCredit.units[output.getItemDamage()]), input);
						}
						if (RecipeChecker.modExists("ImmersiveEngineering")) {
								if (!(output.getItem() instanceof ItemCredit))
										IEHelper.addCrusherRecipe(output, input, euTick * timeInTicks);
								else
										IEHelper.addCrusherRecipe(CreditHelper.getCreditsFromTypeAndUnits(output.getItem(), ItemCredit.units[output.getItemDamage()] * 2), input, euTick * timeInTicks);
						}
						if (RecipeChecker.modExists("IC2")) {
								if (!(output.getItem() instanceof ItemCredit))
										ICHelper.addMaceratorRecipe(input, output);
								else
										ICHelper.addMaceratorRecipe(input, CreditHelper.getCreditsFromTypeAndUnits(output.getItem(), ItemCredit.units[output.getItemDamage()]));
						}
				}
		}

		public static void addFurnaceRecipes (ItemStack output, ItemStack input) {
				if (RecipeChecker.checkStack(output)) {
						if (RecipeChecker.modExists("ThermalExpansion"))
								TEHelper.addFurnaceRecipe(8000, input, output);
						GameRegistry.addSmelting(input, output, 1f);
				}
		}
}

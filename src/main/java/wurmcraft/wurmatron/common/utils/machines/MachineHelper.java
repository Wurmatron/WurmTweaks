package wurmcraft.wurmatron.common.utils.machines;

import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.utils.railcraft.RailcraftHelper;
import wurmcraft.wurmatron.common.utils.techreborn.TechRebornHelper;

public class MachineHelper {

		public static void addShapedRollingMachineRecipe (ItemStack output, Object... recipe) {
				if (RecipeChecker.checkStack(output)) {
						if (RecipeChecker.modExists("techreborn"))
								TechRebornHelper.addShapedRollingMachineRecipe(output, recipe);
						if (RecipeChecker.modExists("Railcraft"))
								RailcraftHelper.addRollingMachineRecipe(output, recipe);
				}
		}

		public static void addSawMillRecipe (ItemStack output, ItemStack output2, ItemStack input, int euTick, int timeinTicks) {
				if (RecipeChecker.checkStack(output)) {
						if (RecipeChecker.modExists("techreborn"))
								TechRebornHelper.addSawMillRecipe(input, null, null, output, output2, null, timeinTicks, euTick);
				}
		}

		public static void addAlloySmelterRecipe (ItemStack input1, ItemStack input2, ItemStack output, int euTick, int timeinTicks) {
				if (RecipeChecker.checkStack(output)) {
						if (RecipeChecker.modExists("techreborn"))
								TechRebornHelper.addAlloySmelterRecipe(input1, input2, output, euTick, timeinTicks);
				}
		}
}

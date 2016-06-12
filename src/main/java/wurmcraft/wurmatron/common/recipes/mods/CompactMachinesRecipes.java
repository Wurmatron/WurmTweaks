package wurmcraft.wurmatron.common.recipes.mods;

import cpw.mods.fml.common.Optional;
import net.minecraft.item.ItemStack;
import org.dave.CompactMachines.init.ModBlocks;
import org.dave.CompactMachines.init.ModItems;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

// TODO Fix it like mining world
public class CompactMachinesRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "CompactMachines")
		public static void addRecipes () {
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.machine, 1, 0), WurmTweaksItems.itemQuantumSingularity, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotTitanium, WurmTweaksItems.itemSpaceModule);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.machine, 1, 1), WurmTweaksItems.itemQuantumSingularity, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotTitanium, new ItemStack(ModBlocks.machine, 1, 0));
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.machine, 1, 2), WurmTweaksItems.itemQuantumSingularity, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotTitanium, new ItemStack(ModBlocks.machine, 1, 1));
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.machine, 1, 3), WurmTweaksItems.itemQuantumSingularity, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotTitanium, new ItemStack(ModBlocks.machine, 1, 2));
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.machine, 1, 4), WurmTweaksItems.itemQuantumSingularity, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotTitanium, new ItemStack(ModBlocks.machine, 1, 3));
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.machine, 1, 5), WurmTweaksItems.itemQuantumSingularity, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotTitanium, new ItemStack(ModBlocks.machine, 1, 4));
				r.addCrossWCenter(new ItemStack(ModItems.psd, 1, 0), WurmTweaksItems.itemQuantumCore, WurmTweaksItems.ingotTitanium, WurmTweaksItems.itemNatureCore);
		}
}

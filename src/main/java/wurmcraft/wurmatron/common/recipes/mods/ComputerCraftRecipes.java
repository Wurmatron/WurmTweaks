package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import crazypants.enderio.EnderIO;
import dan200.computercraft.ComputerCraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class ComputerCraftRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "ComputerCraft")
		public static void addRecipes () {
				LogHandler.info("Adding Computercraft Recipes");
				r.addBasicMachineRecipe(new ItemStack(ComputerCraft.Blocks.computer, 1, 0), WurmTweaksItems.itemComputationalCore, "packSmoothStone", TFCItems.platinumSheet, Blocks.glass_pane);
				r.addBasicMachineRecipe(new ItemStack(ComputerCraft.Blocks.computer, 1, 16385), WurmTweaksItems.itemComputationalCore, TFCItems.goldSheet2x, TFCItems.platinumSheet, Blocks.glass_pane);
				r.addShaped(new ItemStack(ComputerCraft.Blocks.peripheral, 1, 0), "SSS", "SXS", "SRS", 'S', "packSmoothStone", 'X', WurmTweaksItems.itemComputationalCore, 'R', Items.redstone);
				r.addShaped(new ItemStack(ComputerCraft.Blocks.peripheral, 1, 3), "SSS", "SXS", "SRS", 'S', "packSmoothStone", 'X', WurmTweaksItems.itemComputationalCore, 'R', "dye");
				r.addShaped(new ItemStack(ComputerCraft.Blocks.peripheral, 1, 0), "SSS", "SXS", "SRS", 'S', "packSmoothStone", 'X', WurmTweaksItems.itemComputationalCore, 'R', Items.redstone);
				r.addCircleWCenter(new ItemStack(ComputerCraft.Blocks.peripheral, 4, 2), "packSmoothStone", EnderIO.blockFusedQuartz);
				r.addCircleWCenter(new ItemStack(ComputerCraft.Blocks.peripheral, 4, 4), TFCItems.goldSheet, EnderIO.blockFusedQuartz);
				r.addCircleWCenter(new ItemStack(ComputerCraft.Blocks.peripheral, 1, 1), "packStone", Items.ender_pearl);
				r.addCircleWCenter(new ItemStack(ComputerCraft.Blocks.cable, 1, 1), "packStone", Items.redstone);
				r.addShaped(new ItemStack(ComputerCraft.Blocks.cable, 6, 1),"SSS","RRR", "SSS", 'S', "packSmoothStone",'R', Items.redstone);
				r.addShapeless(ComputerCraft.Items.disk, WurmTweaksItems.itemComputationalCore, Items.paper);
				r.addShaped(new ItemStack(ComputerCraft.Items.pocketComputer, 1, 0), "SSS", "SAS", "RRR", 'S', "packStone", 'A', Items.golden_apple, 'R', Items.redstone);
				r.addShaped(new ItemStack(ComputerCraft.Items.pocketComputer, 1, 1), "SSS", "SAS", "RRR", 'S', TFCItems.goldSheet, 'A', Items.golden_apple, 'R', Items.redstone);
		}
}

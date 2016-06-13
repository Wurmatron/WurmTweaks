package wurmcraft.wurmatron.common.recipes.mods;

import buildcraft.BuildCraftSilicon;
import cofh.thermaldynamics.item.TDItems;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import ic2.api.item.IC2Items;
import logisticspipes.LogisticsPipes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class LogisticsPipesRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "LogisticsPipes")
		public static void addRecipes () {
				r.addBasicMachineRecipe(new ItemStack(LogisticsPipes.LogisticsSolidBlock, 1, 0), BuildCraftSilicon.redstoneChipset, Items.redstone, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(LogisticsPipes.LogisticsSolidBlock, 1, 1), BuildCraftSilicon.redstoneChipset, Items.glowstone_dust, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(LogisticsPipes.LogisticsSolidBlock, 1, 2), BuildCraftSilicon.redstoneChipset, WurmTweaksItems.itemComputationalCore, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(LogisticsPipes.LogisticsSolidBlock, 1, 3), BuildCraftSilicon.redstoneChipset, "packCraftingTable", WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMachineFrame);
				r.addShapeless(new ItemStack(LogisticsPipes.LogisticsSolidBlock, 1, 4), new ItemStack(LogisticsPipes.LogisticsSolidBlock, 1, 3), new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE));
				r.addBasicMachineRecipe(new ItemStack(LogisticsPipes.LogisticsSolidBlock, 1, 5), "packCraftingTable", WurmTweaksItems.itemComputationalCore, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(LogisticsPipes.LogisticsSolidBlock, 1, 11), TDItems.ductEnergyBasic, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.ingotOrangeSteel, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(LogisticsPipes.LogisticsSolidBlock, 1, 12), IC2Items.getItem("insulatedCopperCableItem"), WurmTweaksItems.itemMixedSheet, WurmTweaksItems.ingotOrangeSteel, WurmTweaksItems.itemMachineFrame);
				r.addShapeless(new ItemStack(LogisticsPipes.LogisticsRemoteOrderer, 1, 0), LogisticsPipes.logisticsRequestTable, WurmTweaksItems.gearMixedSheet);
				for (int d = 15; d < 0; d--)
						r.addShapeless(new ItemStack(LogisticsPipes.LogisticsRemoteOrderer, 1, 0), RecipeHelper.dye.get(d), new ItemStack(LogisticsPipes.LogisticsRemoteOrderer, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(LogisticsPipes.LogisticsCraftingSignCreator, 1, 0), Items.sign, WurmTweaksItems.itemMixedSheet);
				r.addBasicMachineRecipe(new ItemStack(LogisticsPipes.ModuleItem, 1, 0), TFCItems.wroughtIronSheet, Items.redstone, Items.paper, WurmTweaksItems.ingotGraySteel);
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 1), "packRock", Items.redstone, new ItemStack(LogisticsPipes.ModuleItem, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 2), "packRock", Items.redstone, new ItemStack(LogisticsPipes.ModuleItem, 1, 1));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 3), Blocks.piston, Items.redstone, new ItemStack(LogisticsPipes.ModuleItem, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 4), "packGemChipped", Items.redstone, new ItemStack(LogisticsPipes.ModuleItem, 1, 1));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 5), "packGemChipped", Items.paper, new ItemStack(LogisticsPipes.ModuleItem, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 6), "packGemChipped", Items.ender_pearl, new ItemStack(LogisticsPipes.ModuleItem, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 7), "packRock", Items.ender_pearl, new ItemStack(LogisticsPipes.ModuleItem, 1, 3));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 103), "packGem", Items.ender_pearl, new ItemStack(LogisticsPipes.ModuleItem, 1, 7));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 107), "packGemExquisite", Items.ender_pearl, new ItemStack(LogisticsPipes.ModuleItem, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 203), "packGemExquisite", Items.ender_pearl, new ItemStack(LogisticsPipes.ModuleItem, 1, 103));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 207), "packGemExquisite", Items.ender_pearl, new ItemStack(LogisticsPipes.ModuleItem, 1, 107));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 500), "packChest", Items.redstone, new ItemStack(LogisticsPipes.ModuleItem, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 501), "packChest", Items.redstone, new ItemStack(LogisticsPipes.ModuleItem, 1, 500));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 300), IC2Items.getItem("electronicCircuit"), Items.redstone, new ItemStack(LogisticsPipes.ModuleItem, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 301), IC2Items.getItem("reBattery"), Items.redstone, new ItemStack(LogisticsPipes.ModuleItem, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 13), "packGemChipped", "packIngot", new ItemStack(LogisticsPipes.ModuleItem, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 600), "packCraftingTable", "packIngot", new ItemStack(LogisticsPipes.ModuleItem, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 601), "packCraftingTable", "packIngot", new ItemStack(LogisticsPipes.ModuleItem, 1, 600));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.ModuleItem, 1, 602), "packCraftingTable", "packIngot", new ItemStack(LogisticsPipes.ModuleItem, 1, 601));
				r.addWrenchRecipe(new ItemStack(LogisticsPipes.LogisticsPipeControllerItem, 1, 0), new ItemStack(LogisticsPipes.ModuleItem, 1, 0));
				r.addBasicMachineRecipe(new ItemStack(LogisticsPipes.LogisticsBasicPipe, 8, 0), TFCItems.redSteelSheet, WurmTweaksItems.itemMagicChunk, Items.redstone, "packGlass");
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsRequestPipeMk1, 1, 0), "packCraftingTable", "packIngot", new ItemStack(LogisticsPipes.LogisticsBasicPipe, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsProviderPipeMk1, 1, 0), "packChest", WurmTweaksItems.itemQuantumFoam, new ItemStack(LogisticsPipes.LogisticsBasicPipe, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsCraftingPipeMk1, 1, 0), "packChest", "packCraftingTable", new ItemStack(LogisticsPipes.LogisticsBasicPipe, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsSatellitePipe, 1, 0), "packChest", Items.redstone, new ItemStack(LogisticsPipes.LogisticsBasicPipe, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsSupplierPipe, 1, 0), "packChest", Blocks.piston, new ItemStack(LogisticsPipes.LogisticsBasicPipe, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsChassisPipeMk1, 1, 0), TFCItems.steelIngot, "packChest", new ItemStack(LogisticsPipes.LogisticsBasicPipe, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsChassisPipeMk2, 1, 0), TFCItems.steelIngot, "packChest", new ItemStack(LogisticsPipes.LogisticsChassisPipeMk1, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsChassisPipeMk3, 1, 0), TFCItems.steelIngot, "packChest", new ItemStack(LogisticsPipes.LogisticsChassisPipeMk2, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsChassisPipeMk4, 1, 0), TFCItems.steelIngot, "packChest", new ItemStack(LogisticsPipes.LogisticsChassisPipeMk3, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsChassisPipeMk5, 1, 0), TFCItems.steelIngot, "packChest", new ItemStack(LogisticsPipes.LogisticsChassisPipeMk4, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsCraftingPipeMk2, 1, 0), "packChest", "packCraftingTable", new ItemStack(LogisticsPipes.LogisticsCraftingPipeMk1, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsCraftingPipeMk3, 1, 0), "packChest", "packCraftingTable", new ItemStack(LogisticsPipes.LogisticsCraftingPipeMk2, 1, 0));
				r.addCrossWCenter(new ItemStack(LogisticsPipes.LogisticsRequestPipeMk2, 1, 0), "packChest", WurmTweaksItems.itemQuantumSingularity, new ItemStack(LogisticsPipes.LogisticsRequestPipeMk1, 1, 0));
				r.addShapeless(new ItemStack(LogisticsPipes.BasicTransportPipe, 1, 0), new ItemStack(LogisticsPipes.LogisticsBasicPipe, 1, 0));
		}
}

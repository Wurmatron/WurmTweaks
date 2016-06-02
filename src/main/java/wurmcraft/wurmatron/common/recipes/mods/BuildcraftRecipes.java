package wurmcraft.wurmatron.common.recipes.mods;


import buildcraft.*;
import buildcraft.core.BCRegistry;
import buildcraft.core.lib.utils.NBTUtils;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.api.IModRecipes;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class BuildcraftRecipes implements IModRecipes {

		@Optional.Method (modid = "BuildCraft|Core")
		@Override
		public void addRecipes () {
				r.addEngineRecipe(new ItemStack(BuildCraftCore.engineBlock, 1, 0), BuildCraftCore.woodenGearItem, "packLog");
				r.addEngineRecipe(new ItemStack(BuildCraftCore.engineBlock, 1, 1), BuildCraftCore.stoneGearItem, "packSmoothStone");
				r.addEngineRecipe(new ItemStack(BuildCraftCore.engineBlock, 1, 2), BuildCraftCore.ironGearItem, TFCItems.wroughtIronSheet);
				// TODO Creative Engine
				r.addShaped(BuildCraftCore.markerBlock, "L", "T", 'L', "dyeBlue", 'T', Blocks.torch);
				r.addShaped(BuildCraftCore.pathMarkerBlock, "L", "T", 'L', "dyeGreen", 'T', Blocks.torch);
				r.addWrenchRecipe(BuildCraftCore.wrenchItem, TFCItems.wroughtIronSheet);
				r.addCircleWCenter(BuildCraftCore.mapLocationItem, TFCItems.juteFiber, "dyeYellow");
				r.addCircleWCenter(new ItemStack(BuildCraftCore.listItem, 1, 1), TFCItems.juteFiber, "dyeGreen");
				r.addShaped(BuildCraftCore.woodenGearItem, " S ", "SWS", " S ", 'S', "packStick", 'W', "packLog");
				r.addShaped(BuildCraftCore.stoneGearItem, " S ", "SWS", " S ", 'S', "packSmoothStone", 'W', BuildCraftCore.woodenGearItem);
				r.addShaped(BuildCraftCore.ironGearItem, " S ", "SWS", " S ", 'S', TFCItems.wroughtIronSheet, 'W', BuildCraftCore.stoneGearItem);
				r.addShaped(BuildCraftCore.goldGearItem, " S ", "SWS", " S ", 'S', TFCItems.goldSheet, 'W', BuildCraftCore.ironGearItem);
				r.addShaped(BuildCraftCore.diamondGearItem, " S ", "SWS", " S ", 'S', "packGemQxquisite", 'W', BuildCraftCore.goldGearItem);
				r.addShaped(BuildCraftCore.paintbrushItem, "C", "S", 'C', "packCloth", 'S', "packStick");
				for (int i = 0; i < 16; ++i) {
						ItemStack outputStack = new ItemStack(BuildCraftCore.paintbrushItem);
						NBTUtils.getItemData(outputStack).setByte("color", (byte) i);
						BCRegistry.INSTANCE.addShapelessRecipe(outputStack, new Object[] {new ItemStack(BuildCraftCore.paintbrushItem, 1, 32767), RecipeHelper.dye.get(i)});
				}
				addBuildersRecipes();
				addFactoryRecipes();
				addSiliconRecipes();
				addTransportRecipes();
		}

		@Optional.Method (modid = "BuildCraft|Builders")
		private static void addBuildersRecipes () {
				r.addShaped(BuildCraftBuilders.quarryBlock, "XAX", "BCB", "DGD", 'X', WurmTweaksItems.gearMixedSheet, 'A', TFCItems.redSteelPick, 'B', new ItemStack(ExtraUtils.cobblestoneCompr, 1, 7), 'A', WurmTweaksItems.itemQuarryCore, 'D', "packGemExquisite", 'G', WurmTweaksBlocks.blockCompressedRedstone);
				r.addBasicMachineRecipe(BuildCraftBuilders.fillerBlock, WurmTweaksItems.gearMixedSheet, BuildCraftCore.markerBlock, "dye", "packChest");
				r.addBasicMachineRecipe(BuildCraftBuilders.builderBlock, WurmTweaksItems.gearMixedSheet, BuildCraftCore.markerBlock, "dye", "packCraftingTable");
				r.addBasicMachineRecipe(BuildCraftBuilders.architectBlock, WurmTweaksItems.gearMixedSheet, BuildCraftCore.markerBlock, "dye", BuildCraftBuilders.blueprintItem);
				r.addBasicMachineRecipe(BuildCraftBuilders.libraryBlock, TFCItems.wroughtIronSheet2x, BuildCraftBuilders.blueprintItem, Blocks.bookshelf, Items.book);
				r.addShaped(BuildCraftBuilders.constructionMarkerBlock, "G", "R", 'G', BuildCraftCore.goldGearItem, 'R', Blocks.redstone_torch);
				r.addCircleWCenter(BuildCraftBuilders.templateItem, TFCItems.juteFiber, "dyeBlack");
				r.addCircleWCenter(BuildCraftBuilders.blueprintItem, TFCItems.juteFiber, "dyeBlue");
		}

		@Optional.Method (modid = "BuildCraft|Factory")
		private static void addFactoryRecipes () {
				r.addShaped(BuildCraftFactory.miningWellBlock, "SPS", "SCS", "SXS", 'X', Items.redstone, 'S', TFCItems.steelSheet, 'C', WurmTweaksItems.itemMiningCore, 'P', TFCItems.wroughtIronPick);
				r.addCrossWCenter(new ItemStack(BuildCraftFactory.autoWorkbenchBlock, 4), "packCraftingTable", BuildCraftCore.woodenGearItem, "packChest");
				r.addCircleWCenter(BuildCraftFactory.tankBlock, "packGlass", TFCItems.wroughtIronSheet);
				r.addBasicMachineRecipe(BuildCraftFactory.pumpBlock, TFCItems.blackSteelSheet2x, BuildCraftFactory.tankBlock, BuildCraftCore.ironGearItem, new ItemStack(ExtraUtils.transferNode, 1, 8));
				r.addShaped(BuildCraftFactory.floodGateBlock, "FIF", "FCF", "FBF", 'F', Blocks.iron_bars, 'I', BuildCraftCore.ironGearItem, 'C', BuildCraftFactory.tankBlock, 'B', Items.bucket);
				r.addShaped(BuildCraftFactory.refineryBlock, "GRG", "RCR", "GTG", 'G', BuildCraftCore.goldGearItem, 'R', BuildCraftFactory.tankBlock, 'R', WurmTweaksItems.ingotEnergyReactor, 'T', WurmTweaksItems.itemRefiningModule);
				r.addShaped(BuildCraftFactory.hopperBlock, "ICI", " I ", 'I', TFCItems.wroughtIronIngot, 'C', "packChest");
		}

		@Optional.Method (modid = "BuildCraft|Silicon")
		private static void addSiliconRecipes () {
				r.addShaped(BuildCraftSilicon.laserBlock, "BRR", "RGG", "BRR", 'B', Blocks.obsidian, 'R', Items.redstone, 'G', "packGemExquisite");
				r.addShaped(BuildCraftSilicon.laserBlock, "RRB", "GGR", "RRB", 'B', Blocks.obsidian, 'R', Items.redstone, 'G', "packGemExquisite");
				r.addShaped(BuildCraftSilicon.laserBlock, "RGR", "RGR", "BRB", 'B', Blocks.obsidian, 'R', Items.redstone, 'G', "packGemExquisite");
				r.addShaped(BuildCraftSilicon.laserBlock, "BRB", "RGR", "RGR", 'B', Blocks.obsidian, 'R', Items.redstone, 'G', "packGemExquisite");
				r.addShaped(BuildCraftSilicon.assemblyTableBlock, "OGO", "ORO", "OXO", 'O', Blocks.obsidian, 'G', "packGemExquisite", 'R', WurmTweaksBlocks.blockBlackSteel, 'X', WurmTweaksItems.gearMixedSheet);
				// TODO Assembling Machine Recipes
				r.addShaped(new ItemStack(BuildCraftSilicon.assemblyTableBlock, 1, 2), "OGO", "ORO", "OXO", 'O', "packCraftingTable", 'G', "packGemExquisite", 'R', WurmTweaksBlocks.blockBlackSteel, 'X', WurmTweaksItems.gearMixedSheet);
		}

		@Optional.Method (modid = "BuildCraft|Transport")
		private static void addTransportRecipes () {
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsWood, 2), "MGM", 'M', "packLog", 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsEmerald, 8), "MGM", 'M', new ItemStack(TFCItems.gemEmerald, 1, 2), 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsCobblestone, 2), "MGM", 'M', "packCobblestone", 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsStone, 2), "MGM", 'M', "packSmoothStone", 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsQuartz, 2), "MGM", 'M', Items.quartz, 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsIron, 8), "MGM", 'M', TFCItems.wroughtIronSheet, 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsGold, 16), "MGM", 'M', TFCItems.goldSheet, 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsDiamond, 12), "MGM", 'M', "packGemChipped", 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsObsidian, 4), "MGM", 'M', Blocks.obsidian, 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsLapis, 8), "MGM", 'M', "dyeBlue", 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsDaizuli, 12), "MGX", 'M', "packGemChipped", 'G', "packGlass", 'X', "dyeBlue");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsSandstone, 2), "MGM", 'M', Blocks.sandstone, 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsVoid, 2), "MGM", 'M', "dyeBlack", 'G', "packGlass");
				r.addShaped(new ItemStack(BuildCraftTransport.pipeItemsStripes, 2), "MGM", 'M', "dyeYellow", 'G', "packGlass");
				r.addShapeless(BuildCraftTransport.pipeFluidsWood, BuildCraftTransport.pipeItemsWood, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipeFluidsEmerald, BuildCraftTransport.pipeItemsEmerald, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipeFluidsCobblestone, BuildCraftTransport.pipeItemsCobblestone, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipeFluidsStone, BuildCraftTransport.pipeItemsStone, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipeFluidsQuartz, BuildCraftTransport.pipeItemsQuartz, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipeFluidsIron, BuildCraftTransport.pipeItemsIron, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipeFluidsQuartz, BuildCraftTransport.pipeItemsQuartz, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipeFluidsGold, BuildCraftTransport.pipeItemsGold, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipeFluidsDiamond, BuildCraftTransport.pipeItemsDiamond, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipeFluidsQuartz, BuildCraftTransport.pipeItemsQuartz, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipeFluidsSandstone, BuildCraftTransport.pipeItemsSandstone, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipeFluidsVoid, BuildCraftTransport.pipeItemsVoid, BuildCraftTransport.pipeWaterproof);
				r.addShapeless(BuildCraftTransport.pipePowerWood, BuildCraftTransport.pipeItemsWood, Items.redstone);
				r.addShapeless(BuildCraftTransport.pipePowerEmerald, BuildCraftTransport.pipeItemsEmerald, Items.redstone);
				r.addShapeless(BuildCraftTransport.pipePowerCobblestone, BuildCraftTransport.pipeItemsCobblestone, Items.redstone);
				r.addShapeless(BuildCraftTransport.pipePowerStone, BuildCraftTransport.pipeItemsStone, Items.redstone);
				r.addShapeless(BuildCraftTransport.pipePowerQuartz, BuildCraftTransport.pipeItemsQuartz, Items.redstone);
				r.addShapeless(BuildCraftTransport.pipePowerIron, BuildCraftTransport.pipeItemsIron, Items.redstone);
				r.addShapeless(BuildCraftTransport.pipePowerQuartz, BuildCraftTransport.pipeItemsQuartz, Items.redstone);
				r.addShapeless(BuildCraftTransport.pipePowerGold, BuildCraftTransport.pipeItemsGold, Items.redstone);
				r.addShapeless(BuildCraftTransport.pipePowerDiamond, BuildCraftTransport.pipeItemsDiamond, Items.redstone);
				r.addShapeless(BuildCraftTransport.pipePowerQuartz, BuildCraftTransport.pipeItemsQuartz, Items.redstone);
				r.addShapeless(BuildCraftTransport.pipePowerSandstone, BuildCraftTransport.pipeItemsSandstone, Items.redstone);
				r.addShapeless(BuildCraftTransport.gateCopier, BuildCraftCore.wrenchItem, "packGemChipped");
				r.addShapeless(new ItemStack(BuildCraftTransport.plugItem, 8), BuildCraftTransport.pipeItemsStone);
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import appeng.api.AEApi;
import appeng.api.util.AEColor;
import appeng.core.Api;
import appeng.recipes.game.FacadeRecipe;
import cofh.thermaldynamics.ThermalDynamics;
import cofh.thermaldynamics.duct.TDDucts;
import cofh.thermalexpansion.block.TEBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import extracells.registries.ItemEnum;
import fox.spiteful.avaritia.items.LudicrousItems;
import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.machines.MachineHelper;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

/**
 * Recipes Verified by Wurmatron
 * on 6/4/2016 with Rv3 beta 5
 * <p>
 * TODO Remove Grinder recipes from NEI
 * TODO Remove Inscriber Recipes from NEI
 */
public class AERecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "appliedenergistics2")
		public static void addRecipes () {
				LogHandler.info("Adding AE Recipes");
				r.addCross(Api.INSTANCE.blocks().blockQuartzGlass.stack(4), Blocks.glass, Items.quartz);
				r.addShapeless(Api.INSTANCE.blocks().blockQuartzVibrantGlass.stack(1), Api.INSTANCE.blocks().blockQuartzGlass.stack(1), Items.glowstone_dust);
				r.addShapeless(Api.INSTANCE.blocks().blockQuartzTorch.stack(1), Items.quartz, Items.glowstone_dust);
				r.addBasicMachineRecipe(Api.INSTANCE.blocks().blockSecurity.stack(1), ExtraUtils.bedrockium, WurmTweaksItems.itemMixedSheet, "packGemExquisite", WurmTweaksItems.ingotPurpleSteel);
				r.addCrossWCenter(Api.INSTANCE.blocks().blockQuantumRing.stack(1), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.itemQuantumCore, WurmTweaksItems.itemQuantumSingularity);
				r.addCrossWCenter(Api.INSTANCE.blocks().blockQuantumLink.stack(1), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.itemQuantumCore, "packGlass");
				r.addCrossWCenter(Api.INSTANCE.blocks().blockSpatialPylon.stack(1), WurmTweaksItems.itemQuantumFoam, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotEnergyReactor);
				r.addBasicMachineRecipe(Api.INSTANCE.blocks().blockController.stack(1), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.itemQuantumCore, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.ingotEnergyReactor);
				r.addShaped(Api.INSTANCE.blocks().blockDrive.stack(1), "XBX", "X X", "XBX", 'X', WurmTweaksItems.itemQuantumFoam, 'B', "packChest");
				r.addShaped(Api.INSTANCE.blocks().blockChest.stack(1), "GXG", "XCX", "SBS", 'G', Api.INSTANCE.blocks().blockQuartzVibrantGlass.stack(1), 'X', Api.INSTANCE.parts().partCableDense.stack(AEColor.Transparent, 1), 'C', "packChest", 'S', WurmTweaksItems.itemMixedSheet, 'B', new ItemStack(TEBlocks.blockStrongbox, 1, 4));
				r.addCross(Api.INSTANCE.blocks().blockInterface.stack(1), WurmTweaksItems.itemMixedSheet, WurmTweaksItems.ingotCyanSteel);
				r.addShaped(Api.INSTANCE.blocks().blockCellWorkbench.stack(1), "WCW", "XBX", "XXX", 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'C', Api.INSTANCE.materials().materialCalcProcessor.stack(1), 'B', "packChest", 'X', WurmTweaksItems.itemMixedSheet);
				r.addCrossWCenter(Api.INSTANCE.blocks().blockIOPort.stack(1), Api.INSTANCE.blocks().blockDrive.stack(1), WurmTweaksItems.ingotOrangeSteel, TFCHelper.getFood(TFCItems.sugar, 160));
				r.addCrossWCenter(Api.INSTANCE.blocks().blockEnergyAcceptor.stack(1), WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemQuantumCore, IC2Items.getItem("mfsUnit"));
				r.addShaped(Api.INSTANCE.blocks().blockVibrationChamber.stack(1), "SSS", "SES", "SFS", 'S', WurmTweaksItems.ingotYellowSteel, 'E', Api.INSTANCE.blocks().blockEnergyAcceptor.stack(1), 'F', new ItemStack(IC2Items.getItem("generator").getItem(), 1, 0));
				r.addCrossWCenter(Api.INSTANCE.blocks().blockEnergyCell.stack(1), TFCItems.redSteelSheet2x, TFCItems.blueSteelSheet2x, IC2Items.getItem("mfeUnit"));
				r.addCircleWCenter(Api.INSTANCE.blocks().blockEnergyCellDense.stack(1), Api.INSTANCE.blocks().blockEnergyCell.stack(1), WurmTweaksItems.ingotEnergyReactor);
				r.addShaped9X9Recipe(Api.INSTANCE.blocks().blockEnergyCellCreative.stack(1), "CIIIIIIIC", "IBBBBBBBI", "IBXXXXXBI", "IBXXXXXBI", "IBXXXXXBI", "IBXXXXXBI", "IBXXXXXBI", "IBBBBBBBI", "CIIIIIIIC", 'C', WurmTweaksItems.creativeCreativePartsEnergy, 'I', new ItemStack(LudicrousItems.resource, 1, 4), 'B', Api.INSTANCE.blocks().blockEnergyCellDense.stack(1), 'X', WurmTweaksItems.ingotEnergyReactor);
				r.addCross(Api.INSTANCE.blocks().blockCraftingUnit.stack(2), WurmTweaksItems.itemQuantumSingularity, WurmTweaksItems.itemCraftingCore);
				r.addShapeless(new ItemStack(Api.INSTANCE.blocks().blockCraftingUnit.item(), 1, 1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), Api.INSTANCE.materials().materialEngProcessor.stack(1));
				r.addShapeless(Api.INSTANCE.blocks().blockCraftingStorage1k.stack(1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), Api.INSTANCE.materials().materialCell1kPart.stack(1));
				r.addShapeless(Api.INSTANCE.blocks().blockCraftingStorage4k.stack(1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), Api.INSTANCE.materials().materialCell4kPart.stack(1));
				r.addShapeless(Api.INSTANCE.blocks().blockCraftingStorage16k.stack(1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), Api.INSTANCE.materials().materialCell16kPart.stack(1));
				r.addShapeless(Api.INSTANCE.blocks().blockCraftingStorage64k.stack(1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), Api.INSTANCE.materials().materialCell64kPart.stack(1));
				r.addShapeless(Api.INSTANCE.blocks().blockCraftingMonitor.stack(1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), "packIngot");
				r.addCrossWCenter(Api.INSTANCE.blocks().blockMolecularAssembler.stack(1), WurmTweaksItems.itemAutoCore, WurmTweaksItems.ingotCyanSteel, WurmTweaksItems.ingotTitanium);
				r.addShapeless(Api.INSTANCE.items().itemWirelessTerminal.stack(1), Api.INSTANCE.materials().materialWireless.stack(1), Api.INSTANCE.blocks().blockEnergyCellDense.stack(1), Api.INSTANCE.parts().partTerminal.stack(1), ExtraUtils.bedrockium, WurmTweaksItems.itemQuantumSingularity);
				r.addShaped(Api.INSTANCE.items().itemBiometricCard.stack(1), "SSS", "SPS", 'S', TFCItems.blackSteelSheet, 'P', TFCItems.juteFiber);
				r.addShaped(Api.INSTANCE.items().itemMassCannon.stack(1), "SSX", "CB ", "S  ", 'C', WurmTweaksItems.itemQuantumFoam, 'S', WurmTweaksItems.ingotFrancium, 'X', Api.INSTANCE.materials().materialFormationCore.stack(1), 'B', Api.INSTANCE.blocks().blockEnergyCell.stack(1));
				r.addShaped(Api.INSTANCE.items().itemMassCannon.stack(1), "XSS", " BC", "  S", 'C', WurmTweaksItems.itemQuantumFoam, 'S', WurmTweaksItems.ingotFrancium, 'X', Api.INSTANCE.materials().materialFormationCore.stack(1), 'B', Api.INSTANCE.blocks().blockEnergyCell.stack(1));
				r.addShaped(Api.INSTANCE.items().itemMemoryCard.stack(1), "SSS", "SPS", 'S', TFCItems.platinumSheet, 'P', TFCItems.juteFiber);
				r.addShaped(Api.INSTANCE.items().itemNetworkTool.stack(1), "Y Y", " Y ", " Y ", 'Y', WurmTweaksItems.itemQuantumFoam);
				r.addShapeless(Api.INSTANCE.items().itemPortableCell.stack(1), Api.INSTANCE.blocks().blockEnergyCellDense.stack(1), Api.INSTANCE.blocks().blockChest.stack(1), Api.INSTANCE.materials().materialCell1kPart.stack(1));
				r.addShaped9X9Recipe(Api.INSTANCE.items().itemCellCreative.stack(1), "CIIIIIIIC", "IBBBBBBBI", "IBXXXXXBI", "IBXXXXXBI", "IBXXXXXBI", "IBXXXXXBI", "IBXXXXXBI", "IBBBBBBBI", "CIIIIIIIC", 'C', WurmTweaksItems.creativeCreativeParts, 'I', new ItemStack(LudicrousItems.resource, 1, 5), 'B', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 3), 'X', Api.INSTANCE.blocks().blockController.stack(1));
				r.addShaped(Api.INSTANCE.items().itemViewCell.stack(1), "XAX", "ABA", "CCC", 'X', TFCItems.blackSteelSheet, 'A', WurmTweaksItems.itemQuantumFoam, 'C', TFCItems.wroughtIronSheet, 'B', "packChest");
				r.addShaped(Api.INSTANCE.items().itemCell1k.stack(1), "RXR", "XCX", "BBB", 'R', Items.redstone, 'X', WurmTweaksItems.itemQuantumFoam, 'C', Api.INSTANCE.materials().materialCell1kPart.stack(1), 'B', TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.items().itemCell4k.stack(1), "RXR", "XCX", "BBB", 'R', Items.redstone, 'X', WurmTweaksItems.itemQuantumFoam, 'C', Api.INSTANCE.materials().materialCell4kPart.stack(1), 'B', TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.items().itemCell16k.stack(1), "RXR", "XCX", "BBB", 'R', "packGem", 'X', WurmTweaksItems.itemQuantumFoam, 'C', Api.INSTANCE.materials().materialCell16kPart.stack(1), 'B', TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.items().itemCell64k.stack(1), "RXR", "XCX", "BBB", 'R', "packGemExquisite", 'X', WurmTweaksItems.itemQuantumFoam, 'C', Api.INSTANCE.materials().materialCell64kPart.stack(1), 'B', TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.items().itemColorApplicator.stack(1), "CB ", "BX ", "  V", 'C', Api.INSTANCE.materials().materialCalcProcessor.stack(1), 'B', WurmTweaksItems.itemQuantumFoam, 'X', WurmTweaksItems.itemMixedSheet, 'X', Api.INSTANCE.blocks().blockEnergyCellDense.stack(1));
				for (String dye : RecipeHelper.dye) {
						int f = 0;
						int l = 20;
						r.addCircleWCenter(new ItemStack(Api.INSTANCE.items().itemPaintBall.item(AEColor.Transparent), 8, f), Api.INSTANCE.materials().materialMatterBall.stack(1), dye);
						r.addCircleWCenter(new ItemStack(Api.INSTANCE.items().itemLumenPaintBall.item(AEColor.Transparent), 8, l), new ItemStack(Api.INSTANCE.items().itemPaintBall.item(AEColor.Transparent), 8, f), Items.glowstone_dust);
						l++;
						f++;
				}
				r.addCircleWCenter(new ItemStack(Api.INSTANCE.items().itemPaintBall.item(AEColor.Transparent), 8, 15), Api.INSTANCE.materials().materialMatterBall.stack(1), "dyeBlack");
				r.addCircleWCenter(new ItemStack(Api.INSTANCE.items().itemLumenPaintBall.item(AEColor.Transparent), 8, 35), new ItemStack(Api.INSTANCE.items().itemPaintBall.item(AEColor.Transparent), 8, 15), Items.glowstone_dust);
				r.addCrossWCenter(Api.INSTANCE.materials().materialAdvCard.stack(4), TFCItems.blackSteelSheet2x, WurmTweaksItems.itemQuantumFoam, "packIngot");
				r.addShapeless(Api.INSTANCE.materials().materialFormationCore.stack(1), TFCItems.blackSteelSheet, Api.INSTANCE.materials().materialLogicProcessor.stack(1));
				r.addShapeless(Api.INSTANCE.materials().materialAnnihilationCore.stack(1), TFCItems.blackSteelSheet, Api.INSTANCE.materials().materialLogicProcessor.stack(1));
				r.addCrossWCenter(Api.INSTANCE.materials().materialBasicCard.stack(4), TFCItems.blackSteelSheet, WurmTweaksItems.itemQuantumFoam, "packIngot");
				r.addShaped(Api.INSTANCE.materials().materialBlankPattern.stack(8), "XAX", "ABA", "CCC", 'X', TFCItems.bismuthSheet, 'A', Items.glowstone_dust, 'B', TFCItems.blackBronzeSheet, 'C', TFCItems.blackSteelSheet);
				r.addCrossWCenter(Api.INSTANCE.materials().materialCalcProcessor.stack(2), TFCItems.blackSteelSheet, TFCItems.redSteelSheet, IC2Items.getItem("advancedCircuit"));
				r.addCrossWCenter(Api.INSTANCE.materials().materialLogicProcessor.stack(2), TFCItems.blackSteelSheet, TFCItems.redSteelSheet, IC2Items.getItem("electronicCircuit"));
				r.addCrossWCenter(Api.INSTANCE.materials().materialEngProcessor.stack(2), TFCItems.blackSteelSheet, TFCItems.redSteelSheet, "packGemExquisite");
				r.addShapeless(Api.INSTANCE.materials().materialCardCrafting.stack(1), Api.INSTANCE.materials().materialBasicCard.stack(1), "packCraftingTable");
				r.addShapeless(Api.INSTANCE.materials().materialCardCapacity.stack(1), Api.INSTANCE.materials().materialBasicCard.stack(1), Items.redstone);
				r.addShapeless(Api.INSTANCE.materials().materialCardRedstone.stack(1), Api.INSTANCE.materials().materialBasicCard.stack(1), "packChest");
				r.addShapeless(Api.INSTANCE.materials().materialCardRedstone.stack(1), Api.INSTANCE.materials().materialAdvCard.stack(1), "packChest");
				r.addShapeless(Api.INSTANCE.materials().materialCardFuzzy.stack(1), Api.INSTANCE.materials().materialAdvCard.stack(1), new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(Api.INSTANCE.materials().materialCardInverter.stack(1), Api.INSTANCE.materials().materialAdvCard.stack(1), Blocks.redstone_torch);
				r.addShapeless(Api.INSTANCE.materials().materialCardSpeed.stack(1), Api.INSTANCE.materials().materialAdvCard.stack(1), TFCItems.platinumSheet);
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell128SpatialPart.stack(1), WurmTweaksItems.itemQuantumCore, Api.INSTANCE.materials().materialCell16SpatialPart.stack(1), Api.INSTANCE.materials().materialEngProcessor.stack(1));
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell16SpatialPart.stack(1), WurmTweaksItems.itemQuantumCore, Api.INSTANCE.materials().materialCell2SpatialPart.stack(1), Api.INSTANCE.materials().materialEngProcessor.stack(1));
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell2SpatialPart.stack(1), WurmTweaksItems.itemQuantumCore, Api.INSTANCE.materials().materialCell64kPart.stack(1), Api.INSTANCE.materials().materialEngProcessor.stack(1));
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell1kPart.stack(1), TFCItems.wroughtIronSheet, Items.redstone, Api.INSTANCE.materials().materialLogicProcessor.stack(1));
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell4kPart.stack(1), WurmTweaksItems.itemQuantumFoam, Api.INSTANCE.materials().materialCell1kPart.stack(1), Api.INSTANCE.materials().materialEngProcessor.stack(1));
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell16kPart.stack(1), WurmTweaksItems.itemQuantumFoam, Api.INSTANCE.materials().materialCell4kPart.stack(1), Api.INSTANCE.materials().materialEngProcessor.stack(1));
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell64kPart.stack(1), "packGemExquisite", Api.INSTANCE.materials().materialCell16kPart.stack(1), Api.INSTANCE.materials().materialEngProcessor.stack(1));
				r.addCircleWCenter(Api.INSTANCE.materials().materialWireless.stack(1), WurmTweaksItems.itemQuantumFoam, WurmTweaksItems.ingotPinkSteel);
				r.addShaped(Api.INSTANCE.materials().materialWirelessBooster.stack(2), "SSS", "XAX", "SSS", 'S', WurmTweaksItems.itemQuantumFoam, 'X', Items.ender_pearl, 'A', WurmTweaksItems.itemMixedSheet);
				r.addShaped(Api.INSTANCE.parts().partAnnihilationPlane.stack(1), "SSS", "XXX", 'S', WurmTweaksItems.itemQuantumSingularity, 'X', TFCItems.redSteelSheet);
				r.addShaped(Api.INSTANCE.parts().partFormationPlane.stack(1), "SSS", "XXX", 'S', WurmTweaksItems.itemQuantumSingularity, 'X', TFCItems.blueSteelSheet);
				r.addShaped(Api.INSTANCE.parts().partCableAnchor.stack(12), "SSS", "XXX", "SSS", 'S', Items.quartz, 'X', WurmTweaksItems.ingotYellowSteel);
				for (int i = 0; i < 15; i++)
						r.addCircleWCenter(new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 8, i), new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, 16), RecipeHelper.dye.get(i));
				for (int i = 0; i < 15; i++)
						r.addCircleWCenter(new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 8, 20 + i), new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, 36), RecipeHelper.dye.get(i));
				for (int i = 0; i < 15; i++)
						r.addCircleWCenter(new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 8, 40 + i), new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, 56), RecipeHelper.dye.get(i));
				for (int i = 0; i < 15; i++)
						r.addCircleWCenter(new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 8, 60 + i), new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, 76), RecipeHelper.dye.get(i));
				for (int i = 0; i < 15; i++)
						r.addCircleWCenter(new ItemStack(Api.INSTANCE.items().itemPaintBall.item(AEColor.Cyan), 8, i), new ItemStack(Api.INSTANCE.materials().materialEngProcessor.item(), 1, 6), RecipeHelper.dye.get(i));
				for (int i = 0; i < 15; i++)
						r.addCircleWCenter(new ItemStack(Api.INSTANCE.items().itemPaintBall.item(AEColor.Cyan), 8, 20 + i), new ItemStack(Api.INSTANCE.items().itemPaintBall.item(AEColor.Cyan), 8, i), new ItemStack(Items.glowstone_dust));
				for (int i = 0; i < 15; i++)
						r.addShapeless(new ItemStack(Api.INSTANCE.blocks().blockMultiPart.block(), 1, 60 + i), new Object[] {new ItemStack(Api.INSTANCE.materials().materialEngProcessor.item(), 1, 76), RecipeHelper.dye.get(i)});
				r.addShaped(Api.INSTANCE.parts().partConversionMonitor.stack(1), "XAX", 'X', "packGem", 'A', Api.INSTANCE.parts().partTerminal.stack(1));
				r.addShapeless(Api.INSTANCE.parts().partCraftingTerminal.stack(1), "packCraftingTable", Api.INSTANCE.parts().partTerminal.stack(1), WurmTweaksItems.itemAutoCore);
				r.addShapeless(Api.INSTANCE.parts().partExportBus.stack(2), WurmTweaksItems.itemMixedSheet, Blocks.piston, (new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, OreDictionary.WILDCARD_VALUE)));
				r.addShapeless(Api.INSTANCE.parts().partImportBus.stack(2), WurmTweaksItems.itemMixedSheet, Blocks.sticky_piston, new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(Api.INSTANCE.parts().partInterface.stack(1), Api.INSTANCE.blocks().blockInterface.stack(1), new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(Api.INSTANCE.parts().partMonitor.stack(1), Api.INSTANCE.blocks().blockInterface.stack(1), Api.INSTANCE.parts().partTerminal.stack(1), new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(Api.INSTANCE.parts().partInvertedToggleBus.stack(1), Api.INSTANCE.parts().partToggleBus.stack(1));
				r.addShapeless(Api.INSTANCE.parts().partToggleBus.stack(1), Api.INSTANCE.parts().partInvertedToggleBus.stack(1));
				r.addShapeless(Api.INSTANCE.parts().partLevelEmitter.stack(1), new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, OreDictionary.WILDCARD_VALUE), WurmTweaksItems.gearMixedSheet, Items.redstone);
				r.addBasicMachineRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(), 1, 465), "packCloth", TFCItems.leather, Items.redstone, IC2Items.getItem("glassFiberCableItem"));
				r.addBasicMachineRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(), 1, 462), "packCloth", TFCItems.leather, Items.redstone, "packStick");
				r.addBasicMachineRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(), 1, 467), "packCloth", TFCItems.leather, Items.redstone, Blocks.glowstone);
				r.addBasicMachineRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(), 1, 463), "packCloth", TFCItems.leather, Items.redstone, ThermalDynamics.itemRelay);
				r.addBasicMachineRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(), 1, 460), "packCloth", TFCItems.leather, Items.redstone, new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, OreDictionary.WILDCARD_VALUE));
				r.addBasicMachineRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(), 1, 466), "packCloth", TFCItems.leather, Items.redstone, new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 7));
				r.addBasicMachineRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(), 1, 461), "packCloth", TFCItems.leather, Items.redstone, WurmTweaksBlocks.blockCompressedRedstone);
				r.addBasicMachineRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(), 1, 466), "packCloth", TFCItems.leather, Items.redstone, new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 7));
				r.addBasicMachineRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(), 1, 467), "packCloth", TFCItems.leather, Items.redstone, Blocks.glowstone);
				r.addBasicMachineRecipe(new ItemStack(AEApi.instance().parts().partAnnihilationPlane.item(), 1, 468), "packCloth", TFCItems.leather, Items.redstone, li.cil.oc.api.Items.get("cable").createItemStack(1));
				r.addShapeless(Api.INSTANCE.parts().partStorageMonitor.stack(1), Api.INSTANCE.blocks().blockInterface.stack(1), WurmTweaksItems.itemQuantumFoam);
				r.addShapeless(Api.INSTANCE.parts().partTerminal.stack(1), WurmTweaksItems.itemQuantumSingularity, new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(Api.INSTANCE.parts().partToggleBus.stack(1), new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, OreDictionary.WILDCARD_VALUE), Items.redstone, Blocks.lever);
				r.addShapeless(Api.INSTANCE.parts().partStorageBus.stack(1), Api.INSTANCE.blocks().blockInterface.stack(1), "packChest", WurmTweaksItems.itemQuantumFoam);
				r.addBasicMachineRecipe(Api.INSTANCE.blocks().blockWireless.stack(1), WurmTweaksItems.ingotRainbowSteel, Api.INSTANCE.blocks().blockInterface.stack(1), Api.INSTANCE.materials().materialWireless.stack(1), WurmTweaksItems.itemQuantumFoam);
				r.addShaped(Api.INSTANCE.blocks().blockTinyTNT.stack(1), "XA", "AX", 'A', Items.gunpowder, 'X', "packSand");
				r.addShaped(Api.INSTANCE.blocks().blockTinyTNT.stack(1), "XA", "AX", 'A', Items.gunpowder, 'X', "packSand");
				r.addBasicMachineRecipe(Api.INSTANCE.blocks().blockSpatialIOPort.stack(1), WurmTweaksItems.itemQuantumSingularity, WurmTweaksItems.ingotRainbowSteel, Api.INSTANCE.materials().materialCell2SpatialPart.stack(1), WurmTweaksItems.ingotEnergyReactor);
				r.addCrossWCenter(Api.INSTANCE.blocks().blockCondenser.stack(1), new ItemStack(ExtraUtils.cobblestoneCompr, 1, 4), new ItemStack(ExtraUtils.cobblestoneCompr, 1, 3), WurmTweaksItems.ingotEnergyReactor);
				r.addShaped(Api.INSTANCE.items().itemSpatialCell2.stack(1), "RXR", "XCX", "BBB", 'R', Items.redstone, 'X', WurmTweaksItems.itemQuantumFoam, 'C', Api.INSTANCE.materials().materialCell2SpatialPart.stack(1), 'B', TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.items().itemSpatialCell16.stack(1), "RXR", "XCX", "BBB", 'R', Items.redstone, 'X', WurmTweaksItems.itemQuantumFoam, 'C', Api.INSTANCE.materials().materialCell16SpatialPart.stack(1), 'B', TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.items().itemSpatialCell128.stack(1), "RXR", "XCX", "BBB", 'R', Items.redstone, 'X', WurmTweaksItems.itemQuantumFoam, 'C', Api.INSTANCE.materials().materialCell128SpatialPart.stack(1), 'B', TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.parts().partCableGlass.stack(AEColor.Transparent, 4), "XXX", "AAA", "XXX", 'X', Api.INSTANCE.blocks().blockQuartzVibrantGlass.stack(1), 'A', TFCItems.platinumSheet);
				r.addShapeless(Api.INSTANCE.parts().partCableCovered.stack(AEColor.Transparent, 1), Api.INSTANCE.parts().partCableGlass.stack(AEColor.Transparent, 1), new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(Api.INSTANCE.parts().partCableSmart.stack(AEColor.Transparent, 1), Api.INSTANCE.parts().partCableCovered.stack(AEColor.Transparent, 1), Items.glowstone_dust, TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.parts().partCableDense.stack(AEColor.Transparent, 24), "XXX", "AAA", "XXX", 'X', WurmTweaksItems.ingotEnergyReactor, 'A', TFCItems.platinumSheet);
				r.addShaped(Api.INSTANCE.parts().partQuartzFiber.stack(8), "XXX", "GGG", "XXX", 'G', Items.quartz, 'X', "packGlass");
				r.addShapeless(Api.INSTANCE.parts().partPatternTerminal.stack(1), Api.INSTANCE.parts().partCraftingTerminal.stack(1), Api.INSTANCE.materials().materialBlankPattern.stack(1), WurmTweaksItems.ingotGreenSteel);
				GameRegistry.addRecipe(new FacadeRecipe());
				addMaceratorRecipes();
		}

		private static void addMaceratorRecipes () {
				MachineHelper.addPulveriserRecipes(Api.INSTANCE.materials().materialEnderDust.stack(1), new ItemStack(Items.ender_pearl, 2, 0), 32, 200, null, 0);
		}
}

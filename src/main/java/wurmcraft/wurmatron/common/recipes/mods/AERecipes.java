package wurmcraft.wurmatron.common.recipes.mods;

import appeng.api.util.AEColor;
import appeng.core.Api;
import cofh.thermalexpansion.block.TEBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import fox.spiteful.avaritia.items.LudicrousItems;
import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

public class AERecipes {

		private static RecipeHelper r = RecipeHelper.instance;

		@Optional.Method (modid = "appliedenergistics2")
		public static void addRecipes () {
				r.addCross(Api.INSTANCE.blocks().blockQuartzGlass.stack(4), Blocks.glass, Items.quartz);
				r.addShapeless(Api.INSTANCE.blocks().blockQuartzVibrantGlass.stack(1), Api.INSTANCE.blocks().blockQuartzGlass.stack(1), Items.glowstone_dust);
				r.addShapeless(Api.INSTANCE.blocks().blockQuartzTorch.stack(1), Items.quartz, Items.glowstone_dust);
				r.addBasicMachineRecipe(Api.INSTANCE.blocks().blockSecurity.stack(1), ExtraUtils.bedrockium, WurmTweaksItems.ingotRainbowSteel, Api.INSTANCE.items().itemCell16k.stack(1), Api.INSTANCE.blocks().blockChest);
				r.addCrossWCenter(Api.INSTANCE.blocks().blockQuantumRing.stack(1), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.itemQuantumCore, WurmTweaksItems.itemQuantumSingularity);
				r.addCrossWCenter(Api.INSTANCE.blocks().blockQuantumLink.stack(1), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.itemQuantumCore, "packGlass");
				r.addCrossWCenter(Api.INSTANCE.blocks().blockSpatialPylon.stack(1), WurmTweaksItems.itemQuantumFoam, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotEnergyReactor);
				r.addBasicMachineRecipe(Api.INSTANCE.blocks().blockController.stack(1), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.itemQuantumCore, WurmTweaksItems.itemCraftingCore, LudicrousItems.matter_cluster);
				r.addShaped(Api.INSTANCE.blocks().blockDrive.stack(1), "XBX", "X X", "XBX", 'X', WurmTweaksItems.itemQuantumFoam, 'B', "packChest");
				r.addShaped(Api.INSTANCE.blocks().blockChest.stack(1), "GXG", "XCX", "SBS", 'G', Api.INSTANCE.blocks().blockQuartzVibrantGlass.stack(1), 'X', Api.INSTANCE.parts().partCableDense.stack(AEColor.Transparent, 1), 'C', "packChest", 'S', WurmTweaksItems.itemMixedSheet, 'B', new ItemStack(TEBlocks.blockStrongbox), 1, 4);
				r.addCross(Api.INSTANCE.blocks().blockInterface.stack(1), WurmTweaksItems.itemMixedSheet, WurmTweaksItems.ingotCyanSteel);
				r.addShaped(Api.INSTANCE.blocks().blockCellWorkbench.stack(1), "WCW", "XBX", "XXX", 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'C', Api.INSTANCE.materials().materialCalcProcessor.stack(1), 'B', "packChest", 'X', WurmTweaksItems.itemMixedSheet);
				r.addCrossWCenter(Api.INSTANCE.blocks().blockIOPort.stack(1), Api.INSTANCE.blocks().blockDrive, WurmTweaksItems.ingotOrangeSteel, TFCHelper.getFood(TFCItems.sugar, 160));
				r.addBasicMachineRecipe(Api.INSTANCE.blocks().blockCondenser.stack(1), WurmTweaksItems.itemQuantumSingularity, ExtraUtils.bedrockium, Blocks.piston, WurmTweaksBlocks.blockPlatinum);
				r.addCrossWCenter(Api.INSTANCE.blocks().blockEnergyAcceptor.stack(1), WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemQuantumCore, IC2Items.getItem("mfsUnit"));
				r.addShaped(Api.INSTANCE.blocks().blockVibrationChamber.stack(1), "SSS", "SES", "SFS", 'S', WurmTweaksItems.ingotYellowSteel, 'E', Api.INSTANCE.blocks().blockEnergyAcceptor.stack(1), 'F', new ItemStack(IC2Items.getItem("generator").getItem(), 1, 0));
				r.addCrossWCenter(Api.INSTANCE.blocks().blockEnergyCell.stack(1), TFCItems.redSteelSheet2x, TFCItems.blueSteelSheet2x, IC2Items.getItem("mfeUnit"));
				r.addCircleWCenter(Api.INSTANCE.blocks().blockEnergyCellDense.stack(1), Api.INSTANCE.blocks().blockEnergyCell.stack(1), WurmTweaksItems.ingotEnergyReactor);
				// TODO Creative Energy Cell Recipe (Possible?)
				r.addCross(Api.INSTANCE.blocks().blockCraftingUnit.stack(2), WurmTweaksItems.itemQuantumSingularity, WurmTweaksItems.itemCraftingCore);
				r.addShapeless(new ItemStack(Api.INSTANCE.blocks().blockCraftingUnit.item(), 1, 1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), Api.INSTANCE.materials().materialEngProcessor);
				r.addShapeless(Api.INSTANCE.blocks().blockCraftingStorage1k.stack(1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), Api.INSTANCE.materials().materialCell1kPart);
				r.addShapeless(Api.INSTANCE.blocks().blockCraftingStorage4k.stack(1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), Api.INSTANCE.materials().materialCell4kPart);
				r.addShapeless(Api.INSTANCE.blocks().blockCraftingStorage16k.stack(1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), Api.INSTANCE.materials().materialCell16kPart);
				r.addShapeless(Api.INSTANCE.blocks().blockCraftingStorage64k.stack(1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), Api.INSTANCE.materials().materialCell64kPart);
				r.addShapeless(Api.INSTANCE.blocks().blockCraftingMonitor.stack(1), Api.INSTANCE.blocks().blockCraftingUnit.stack(1), "packIngot");
				r.addCrossWCenter(Api.INSTANCE.blocks().blockMolecularAssembler.stack(1), WurmTweaksItems.itemAutoCore, WurmTweaksItems.ingotCyanSteel, WurmTweaksItems.ingotTitanium);
				r.addShapeless(Api.INSTANCE.items().itemWirelessTerminal.stack(1), Api.INSTANCE.materials().materialWireless.stack(1), Api.INSTANCE.blocks().blockEnergyCellDense.stack(1), Api.INSTANCE.parts().partTerminal, ExtraUtils.bedrockium, WurmTweaksItems.itemQuantumSingularity);
				r.addShaped(Api.INSTANCE.items().itemBiometricCard.stack(1), "SSS", "SPS", 'S', TFCItems.blackSteelSheet, 'P', TFCItems.juteFiber);
				r.addShaped(Api.INSTANCE.items().itemMassCannon.stack(1), "SSX", "CB ", "S  ", 'S', WurmTweaksItems.ingotFrancium, 'X', Api.INSTANCE.materials().materialFormationCore, 'B', Api.INSTANCE.blocks().blockEnergyCell.stack(1));
				r.addShaped(Api.INSTANCE.items().itemMassCannon.stack(1), "XSS", " BC", "  S", 'S', WurmTweaksItems.ingotFrancium, 'X', Api.INSTANCE.materials().materialFormationCore, 'B', Api.INSTANCE.blocks().blockEnergyCell.stack(1));
				r.addShaped(Api.INSTANCE.items().itemMemoryCard.stack(1), "SSS", "SPS", 'S', TFCItems.platinumSheet, 'P', TFCItems.juteFiber);
				r.addShaped(Api.INSTANCE.items().itemNetworkTool.stack(1), "Y Y", " Y ", " Y ", 'Y', WurmTweaksItems.itemQuantumFoam);
				r.addShapeless(Api.INSTANCE.items().itemPortableCell.stack(1), Api.INSTANCE.blocks().blockEnergyCellDense.stack(1), Api.INSTANCE.blocks().blockChest.stack(1), Api.INSTANCE.materials().materialCell1kPart);
				// TODO Creative Drive
				r.addShaped(Api.INSTANCE.items().itemViewCell.stack(1), "XAX", "ABA", "CCC", 'X', TFCItems.blackSteelSheet, 'A', WurmTweaksItems.itemQuantumFoam, 'C', TFCItems.wroughtIronSheet);
				r.addShaped(Api.INSTANCE.items().itemCell1k.stack(1), "RXR", "XCX", "BBB", 'R', Items.redstone, 'X', WurmTweaksItems.itemQuantumFoam, 'C', Api.INSTANCE.materials().materialCell1kPart, 'B', TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.items().itemCell4k.stack(1), "RXR", "XCX", "BBB", 'R', Items.redstone, 'X', WurmTweaksItems.itemQuantumFoam, 'C', Api.INSTANCE.materials().materialCell4kPart, 'B', TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.items().itemCell16k.stack(1), "RXR", "XCX", "BBB", 'R', "packGem", 'X', WurmTweaksItems.itemQuantumFoam, 'C', Api.INSTANCE.materials().materialCell16kPart, 'B', TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.items().itemCell64k.stack(1), "RXR", "XCX", "BBB", 'R', "packGemQxquisite", 'X', WurmTweaksItems.itemQuantumFoam, 'C', Api.INSTANCE.materials().materialCell64kPart, 'B', TFCItems.blackSteelSheet);
				r.addShaped(Api.INSTANCE.items().itemSpatialCell2.stack(1), "RXR", "XCX", "BBB", 'R', "packGemBlock", 'X', WurmTweaksItems.itemQuantumSingularity, 'C', Api.INSTANCE.materials().materialCell2SpatialPart, 'B', WurmTweaksItems.ingotRainbowSteel);
				r.addShaped(Api.INSTANCE.items().itemSpatialCell16.stack(1), "RXR", "XCX", "BBB", 'R', "packGemBlock", 'X', WurmTweaksItems.itemQuantumSingularity, 'C', Api.INSTANCE.materials().materialCell16SpatialPart, 'B', WurmTweaksItems.ingotRainbowSteel);
				r.addShaped(Api.INSTANCE.items().itemSpatialCell128.stack(1), "RXR", "XCX", "BBB", 'R', "packGemBlock", 'X', WurmTweaksItems.itemQuantumSingularity, 'C', Api.INSTANCE.materials().materialCell128SpatialPart, 'B', WurmTweaksItems.ingotRainbowSteel);
				r.addShaped(Api.INSTANCE.items().itemColorApplicator.stack(1), "CB ", "BX ", "  V", 'C', Api.INSTANCE.materials().materialCalcProcessor, 'B', WurmTweaksItems.itemQuantumFoam, 'X', WurmTweaksItems.itemMixedSheet, 'X', Api.INSTANCE.blocks().blockEnergyCellDense.stack(1));
				for (String dye : RecipeHelper.dye) {
						int f = 0;
						int l = 20;
						r.addCircleWCenter(new ItemStack(Api.INSTANCE.items().itemPaintBall.item(AEColor.Transparent), 8, f), Api.INSTANCE.materials().materialMatterBall.stack(1), dye);
						r.addCircleWCenter(new ItemStack(Api.INSTANCE.items().itemLumenPaintBall.item(AEColor.Transparent), 8, l), new ItemStack(Api.INSTANCE.items().itemPaintBall.item(AEColor.Transparent), 8, f), Items.glowstone_dust);
						l++;
						f++;
				}
				r.addCrossWCenter(Api.INSTANCE.materials().materialAdvCard.stack(4), TFCItems.blackSteelSheet2x, WurmTweaksItems.itemQuantumFoam, "packIngot");
				r.addShapeless(Api.INSTANCE.materials().materialFormationCore.stack(1), TFCItems.blackSteelSheet, Api.INSTANCE.materials().materialLogicProcessor.stack(1));
				r.addShapeless(Api.INSTANCE.materials().materialAnnihilationCore.stack(1), TFCItems.blackSteelSheet, Api.INSTANCE.materials().materialLogicProcessor.stack(1));
				r.addCrossWCenter(Api.INSTANCE.materials().materialBasicCard.stack(4), TFCItems.blackSteelSheet, WurmTweaksItems.itemQuantumFoam, "packIngot");
				r.addShaped(Api.INSTANCE.materials().materialBlankPattern.stack(8), "XAX", "ABA", "CCC", 'X', TFCItems.bismuthSheet, 'A', Items.glowstone_dust, 'B', TFCItems.blackBronzeSheet, 'C', TFCItems.blackSteelSheet);
				r.addCrossWCenter(Api.INSTANCE.materials().materialCalcProcessor.stack(2), TFCItems.blackSteelSheet, TFCItems.redSteelSheet, WurmTweaksItems.ingotCyanSteel);
				r.addCrossWCenter(Api.INSTANCE.materials().materialLogicProcessor.stack(2), TFCItems.blackSteelSheet, TFCItems.redSteelSheet, WurmTweaksItems.ingotOrangeSteel);
				r.addCrossWCenter(Api.INSTANCE.materials().materialEngProcessor.stack(2), TFCItems.blackSteelSheet, TFCItems.redSteelSheet, "packGemQxquisite");
				r.addShapeless(Api.INSTANCE.materials().materialCardCrafting.stack(1), Api.INSTANCE.materials().materialBasicCard.stack(1), "packCraftingTable");
				r.addShapeless(Api.INSTANCE.materials().materialCardCapacity.stack(1), Api.INSTANCE.materials().materialBasicCard.stack(1), "packChest");
				r.addShapeless(Api.INSTANCE.materials().materialCardRedstone.stack(1), Api.INSTANCE.materials().materialBasicCard.stack(1), "packChest");
				r.addShapeless(Api.INSTANCE.materials().materialCardRedstone.stack(1), Api.INSTANCE.materials().materialAdvCard.stack(1), "packChest");
				r.addShapeless(Api.INSTANCE.materials().materialCardFuzzy.stack(1), Api.INSTANCE.materials().materialAdvCard.stack(1), new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(Api.INSTANCE.materials().materialCardInverter.stack(1), Api.INSTANCE.materials().materialAdvCard.stack(1), Blocks.redstone_torch);
				r.addShapeless(Api.INSTANCE.materials().materialCardSpeed.stack(1), Api.INSTANCE.materials().materialAdvCard.stack(1), TFCItems.platinumSheet);
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell128SpatialPart.stack(1), WurmTweaksItems.itemQuantumCore, Api.INSTANCE.materials().materialCell16SpatialPart.stack(1), Api.INSTANCE.materials().materialEngProcessor);
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell16SpatialPart.stack(1), WurmTweaksItems.itemQuantumCore, Api.INSTANCE.materials().materialCell2SpatialPart.stack(1), Api.INSTANCE.materials().materialEngProcessor);
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell2SpatialPart.stack(1), WurmTweaksItems.itemQuantumCore, Api.INSTANCE.materials().materialCell64kPart.stack(1), Api.INSTANCE.materials().materialEngProcessor);
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell1kPart.stack(1), TFCItems.wroughtIronSheet, Items.redstone, Api.INSTANCE.materials().materialLogicProcessor);
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell4kPart.stack(1), WurmTweaksItems.itemQuantumFoam, Api.INSTANCE.materials().materialCell1kPart.stack(1), Api.INSTANCE.materials().materialEngProcessor);
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell16kPart.stack(1), WurmTweaksItems.itemQuantumFoam, Api.INSTANCE.materials().materialCell1kPart.stack(1), Api.INSTANCE.materials().materialEngProcessor);
				r.addCrossWCenter(Api.INSTANCE.materials().materialCell64kPart.stack(1), "packGemQxquisite", Api.INSTANCE.materials().materialCell4kPart.stack(1), Api.INSTANCE.materials().materialEngProcessor);
				r.addCircleWCenter(Api.INSTANCE.materials().materialWireless.stack(1), WurmTweaksItems.itemQuantumFoam, WurmTweaksItems.ingotPinkSteel);
				r.addShaped(Api.INSTANCE.materials().materialWirelessBooster.stack(2), "SSS", "XAX", "SSS", 'S', WurmTweaksItems.itemQuantumFoam, 'X', Items.ender_pearl, 'A', WurmTweaksItems.itemMixedSheet);
				r.addShaped(Api.INSTANCE.parts().partAnnihilationPlane.stack(1), "SSS", "XXX", 'S', WurmTweaksItems.itemQuantumSingularity, 'X', TFCItems.redSteelSheet);
				r.addShaped(Api.INSTANCE.parts().partCableAnchor.stack(12), "SSS", "XXX", "SSS", 'S', Items.quartz, 'X', WurmTweaksItems.ingotYellowSteel);
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
		}
}

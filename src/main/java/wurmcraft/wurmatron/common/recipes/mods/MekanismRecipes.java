package wurmcraft.wurmatron.common.recipes.mods;

import buildcraft.BuildCraftBuilders;
import buildcraft.BuildCraftFactory;
import cofh.thermalexpansion.block.TEBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import ic2.api.item.IC2Items;
import mekanism.api.infuse.InfuseRegistry;
import mekanism.common.MekanismBlocks;
import mekanism.common.MekanismItems;
import mekanism.generators.common.GeneratorsBlocks;
import mekanism.generators.common.GeneratorsItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import solarexpansion.init.SEGameObjects;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.mekanism.MekanismHelper;
import wurmcraft.wurmatron.common.utils.nbt.ItemNBT;

public class MekanismRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "Mekanism")
		public static void addRecipes () {
				r.addCircleWCenter(new ItemStack(MekanismBlocks.BasicBlock, 1, 6), "packCobble", new ItemStack(MekanismItems.ControlCircuit, 1, 0));
				r.addCircleWCenter(new ItemStack(MekanismBlocks.BasicBlock, 1, 7), new ItemStack(MekanismItems.Ingot, 1, 0), WurmTweaksItems.itemQuantumCore);
				r.addSimpleCirc(new ItemStack(MekanismBlocks.BasicBlock, 8, 9), TEBlocks.blockTank, WurmTweaksBlocks.blockSteel);
				r.addSimpleCirc(new ItemStack(MekanismBlocks.BasicBlock, 1, 10), new ItemStack(MekanismBlocks.BasicBlock, 1, 7), "packGlass");
				r.addSimpleCirc(new ItemStack(MekanismBlocks.BasicBlock, 1, 11), new ItemStack(MekanismBlocks.BasicBlock, 1, 7), new ItemStack(MekanismItems.ControlCircuit, 1, 0));
				r.addBasicMachineRecipe(new ItemStack(MekanismBlocks.BasicBlock, 1, 14), new ItemStack(MekanismItems.ControlCircuit, 1, 3), WurmTweaksBlocks.blockCopper, WurmTweaksItems.ingotOrangeSteel, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(MekanismBlocks.BasicBlock, 1, 15), new ItemStack(MekanismItems.ControlCircuit, 1, 2), WurmTweaksItems.ingotGreenSteel, new ItemStack(MekanismBlocks.BasicBlock, 1, 10), WurmTweaksItems.itemMachineFrame);
				r.addCircleWCenter(new ItemStack(MekanismBlocks.BasicBlock2, 16, 0), WurmTweaksBlocks.blockCopper, WurmTweaksItems.itemMachineFrame);
				r.addSimpleCirc(new ItemStack(MekanismBlocks.BasicBlock2, 1, 1), WurmTweaksBlocks.blockSteel, new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE));
				r.addSimpleCirc(new ItemStack(MekanismBlocks.BasicBlock2, 1, 1), new ItemStack(MekanismBlocks.BasicBlock2, 1, 1), new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addShaped(MekanismHelper.getCubeStatic(0), "RXR", "XBX", "RXR", 'R', WurmTweaksBlocks.blockCompressedRedstone, 'X', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE), 'B', WurmTweaksBlocks.blockPlatinum);
				r.addShaped(MekanismHelper.getCubeStatic(1), "RXR", "XBX", "RXR", 'R', WurmTweaksBlocks.blockCompressedRedstone, 'X', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE), 'B', MekanismHelper.getCubeStatic(0));
				r.addShaped(MekanismHelper.getCubeStatic(2), "RXR", "XBX", "RXR", 'R', WurmTweaksBlocks.blockCompressedRedstone, 'X', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE), 'B', MekanismHelper.getCubeStatic(1));
				r.addShaped(MekanismHelper.getCubeStatic(3), "RXR", "XBX", "RXR", 'R', WurmTweaksBlocks.blockCompressedRedstone, 'X', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE), 'B', MekanismHelper.getCubeStatic(2));
				r.addShaped(MekanismHelper.getInduction(0), "XAX", "ACA", "XAX", 'X', new ItemStack(MekanismItems.OtherDust, 1, 4), 'A', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE), 'C', MekanismHelper.getCubeStatic(0));
				r.addShaped(MekanismHelper.getInduction(1), "XAX", "ACA", "XAX", 'X', new ItemStack(MekanismItems.OtherDust, 1, 4), 'A', MekanismHelper.getInduction(0), 'C', MekanismHelper.getCubeStatic(1));
				r.addShaped(MekanismHelper.getInduction(2), "XAX", "ACA", "XAX", 'X', new ItemStack(MekanismItems.OtherDust, 1, 4), 'A', MekanismHelper.getInduction(1), 'C', MekanismHelper.getCubeStatic(2));
				r.addShaped(MekanismHelper.getInduction(3), "XAX", "ACA", "XAX", 'X', new ItemStack(MekanismItems.OtherDust, 1, 4), 'A', MekanismHelper.getInduction(2), 'C', MekanismHelper.getCubeStatic(3));
				r.addShaped(MekanismHelper.getAdvancedInduction(0), "XAX", "ACA", "XAX", 'X', new ItemStack(MekanismItems.OtherDust, 1, 4), 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'C', MekanismHelper.getCubeStatic(0));
				r.addShaped(MekanismHelper.getAdvancedInduction(1), "XAX", "ACA", "XAX", 'X', new ItemStack(MekanismItems.OtherDust, 1, 4), 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'C', MekanismHelper.getCubeStatic(1));
				r.addShaped(MekanismHelper.getAdvancedInduction(2), "XAX", "ACA", "XAX", 'X', new ItemStack(MekanismItems.OtherDust, 1, 4), 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'C', MekanismHelper.getCubeStatic(3));
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 0), "RRR", "BCB", "GXG", 'R', new ItemStack(MekanismItems.ReinforcedAlloy), 'B', new ItemStack(Items.flint), 'C', WurmTweaksItems.itemMachineFrame, 'G', WurmTweaksItems.ingotPinkSteel, 'X', "packGemExquisite");
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 3), "RRR", "BCB", "GXG", 'R', new ItemStack(MekanismItems.ReinforcedAlloy), 'B', TFCItems.blueSteelBucketLava, 'C', WurmTweaksItems.itemMachineFrame, 'G', WurmTweaksItems.ingotGraySteel, 'X', "packGemExquisite");
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 8), "RRR", "BCB", "GXG", 'R', WurmTweaksItems.ingotPinkSteel, 'B', TFCItems.wroughtIronIngot, 'C', WurmTweaksItems.itemMachineFrame, 'G', WurmTweaksItems.ingotPinkSteel, 'X', "packGemExquisite");
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 3), "RRR", "BCB", "GXG", 'R', new ItemStack(MekanismItems.ReinforcedAlloy), 'B', TFCItems.blueSteelBucketLava, 'C', WurmTweaksItems.itemMachineFrame, 'G', WurmTweaksItems.ingotOrangeSteel, 'X', "packGemExquisite");
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 5), "RRR", "BCB", "GXG", 'R', new ItemStack(MekanismItems.ReinforcedAlloy), 'B', "wurmlog", 'C', WurmTweaksItems.itemMachineFrame, 'G', WurmTweaksItems.ingotPinkSteel, 'X', "packGemExquisite");
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 10), "RRR", "BCB", "GXG", 'R', new ItemStack(MekanismItems.ReinforcedAlloy), 'B', IC2Items.getItem("inductionFurnace"), 'C', WurmTweaksItems.itemMachineFrame, 'G', WurmTweaksItems.ingotPinkSteel, 'X', "packGemExquisite");
				r.addShaped(MekanismHelper.getBasic(0), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 0), 'B', new ItemStack(MekanismBlocks.MachineBlock, 1, 10));
				r.addShaped(MekanismHelper.getBasic(1), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 0), 'B', new ItemStack(MekanismBlocks.MachineBlock, 1, 0));
				r.addShaped(MekanismHelper.getBasic(2), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 0), 'B', new ItemStack(MekanismBlocks.MachineBlock, 1, 3));
				r.addShaped(MekanismHelper.getBasic(5), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 0), 'B', new ItemStack(MekanismBlocks.MachineBlock, 1, 9));
				r.addShaped(MekanismHelper.getBasic(6), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 0), 'B', new ItemStack(MekanismBlocks.MachineBlock, 1, 3));
				r.addShaped(MekanismHelper.getAdvanced(0), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 1), 'B', MekanismHelper.getBasic(0));
				r.addShaped(MekanismHelper.getAdvanced(3), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 1), 'B', MekanismHelper.getBasic(3));
				r.addShaped(MekanismHelper.getAdvanced(4), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 1), 'B', MekanismHelper.getBasic(4));
				r.addShaped(MekanismHelper.getAdvanced(5), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 1), 'B', MekanismHelper.getBasic(5));
				r.addShaped(MekanismHelper.getAdvanced(6), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 1), 'B', MekanismHelper.getBasic(6));
				r.addShaped(MekanismHelper.getElite(0), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 2), 'B', MekanismHelper.getAdvanced(0));
				r.addShaped(MekanismHelper.getElite(3), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 2), 'B', MekanismHelper.getAdvanced(3));
				r.addShaped(MekanismHelper.getElite(4), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 2), 'B', MekanismHelper.getAdvanced(4));
				r.addShaped(MekanismHelper.getElite(5), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 2), 'B', MekanismHelper.getAdvanced(5));
				r.addShaped(MekanismHelper.getElite(6), "XAX", "ABA", "XAX", 'X', WurmTweaksItems.itemMachineFrame, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 2), 'B', MekanismHelper.getAdvanced(6));
				for (int i = 16; i < 0; i--) {
						r.addShaped(new ItemStack(MekanismBlocks.PlasticBlock, 4, i), "XXX", "XAX", "XXX", 'X', new ItemStack(MekanismItems.Polyethene, 1, 2), 'A', RecipeHelper.dye.get(i));
						r.addShaped(new ItemStack(MekanismBlocks.PlasticBlock, 4, i), " X ", "XAX", " X ", 'X', new ItemStack(MekanismBlocks.PlasticBlock, 1, OreDictionary.WILDCARD_VALUE), 'A', RecipeHelper.dye.get(i));
						r.addShapeless(new ItemStack(MekanismBlocks.GlowPlasticBlock, 4, i), new ItemStack(MekanismBlocks.PlasticBlock, 1, i), Items.glowstone_dust, new ItemStack(MekanismBlocks.PlasticBlock, 1, i), new ItemStack(MekanismBlocks.PlasticBlock, 1, i));
						r.addShaped(new ItemStack(MekanismBlocks.GlowPlasticBlock, 4, i), " X ", "XAX", " X ", 'X', new ItemStack(MekanismBlocks.GlowPlasticBlock, 1, OreDictionary.WILDCARD_VALUE), 'A', RecipeHelper.dye.get(i));
						r.addShaped(new ItemStack(MekanismBlocks.RoadPlasticBlock, 3, i), "SSS", "BBB", "SSS", 'S', "packSand", 'B', new ItemStack(MekanismBlocks.SlickPlasticBlock, 1, i));
						r.addShaped(new ItemStack(MekanismItems.GlowPanel, 4, i), "GXG", "XBX", "AXA", 'G', "packGlass", 'X', new ItemStack(MekanismItems.Polyethene, 1, 2), 'B', RecipeHelper.dye.get(i), 'A', Items.glowstone_dust);
						r.addShaped(new ItemStack(MekanismItems.GlowPanel, 4, i), " X ", "XDX", " X ", 'X', new ItemStack(MekanismItems.GlowPanel, 1, OreDictionary.WILDCARD_VALUE), 'D', RecipeHelper.dye.get(i));
						r.addShapeless(new ItemStack(MekanismItems.Balloon, 1, i), new ItemStack(TFCItems.leather), new ItemStack(Items.string), RecipeHelper.dye.get(i));
						r.addShapeless(new ItemStack(MekanismItems.Balloon, 1, i), new ItemStack(MekanismItems.Balloon, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(i));
						r.addShapeless(new ItemStack(MekanismBlocks.PlasticFence, 1, i), Blocks.fence, RecipeHelper.dye.get(i));
				}
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 11), "III", "GBG", "III", 'I', TFCItems.blackSteelSheet, 'G', "packGlass", 'B', Items.bucket);
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 13), "IXI", "ICI", "III", 'I', TFCItems.blackSteelSheet, 'C', "packChest", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 2));
				r.addShaped(new ItemStack(MekanismItems.Dictionary, 1, 0), "XXX", "AXA", "XXX", 'X', TFCItems.bronzeSheet, 'A', TFCItems.zincSheet, 'X', Items.book);
				r.addShaped(new ItemStack(GeneratorsBlocks.Generator, 1, 1), "SSS", "IXI", "DED", 'S', WurmTweaksItems.itemSolarCore, 'I', TFCItems.blackBronzeSheet, 'D', new ItemStack(MekanismItems.EnrichedAlloy), 'X', WurmTweaksItems.itemQuantumFoam, 'E', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(MekanismItems.ControlCircuit, 1, 1), "XAX", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 0), 'A', new ItemStack(MekanismItems.EnrichedAlloy));
				r.addShaped(new ItemStack(MekanismItems.ControlCircuit, 1, 2), "XAX", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 1), 'A', new ItemStack(MekanismItems.ReinforcedAlloy));
				r.addShaped(new ItemStack(MekanismItems.ControlCircuit, 1, 3), "XAX", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 2), 'A', new ItemStack(MekanismItems.Ingot));
				r.addShaped(new ItemStack(MekanismItems.TeleportationCore, 1, 0), "XGX", "AXA", "XGX", 'X', "packGemExquisite", 'G', WurmTweaksItems.itemBloodInfused, 'A', WurmTweaksItems.itemQuantumSingularity);
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 15), "ICI", "IPI", "III", 'I', WurmTweaksItems.itemQuantumSingularity, 'C', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'P', Blocks.piston);
				r.addShaped(new ItemStack(MekanismItems.EnergyTablet, 1, 100), "RXR", "ACA", "RXR", 'R', Items.redstone, 'X', new ItemStack(MekanismItems.EnrichedAlloy), 'A', TFCItems.goldSheet, 'C', "dustSulfur");
				r.addShaped(new ItemStack(MekanismItems.SpeedUpgrade, 1, 0), " R ", "XAX", " R ", 'R', Blocks.redstone_block, 'X', "packGlass", 'A', MekanismItems.EnrichedAlloy);
				r.addShaped(new ItemStack(MekanismItems.EnergyUpgrade, 1, 0), " R ", "XAX", " R ", 'R', Blocks.redstone_block, 'X', "packGlass", 'A', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(MekanismItems.GasUpgrade, 1, 0), " R ", "XAX", " R ", 'R', Blocks.redstone_block, 'X', "packGlass", 'A', MekanismItems.ReinforcedAlloy);
				r.addShaped(new ItemStack(MekanismItems.FilterUpgrade, 1, 0), " R ", "XAX", " R ", 'R', Blocks.redstone_block, 'X', "packGlass", 'A', "dye");
				r.addShaped(new ItemStack(MekanismItems.PortableTeleporter, 1, 100), "XXX", "BAB", "XXX", 'X', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE), 'B', Items.redstone, 'A', MekanismItems.TeleportationCore);
				r.addShaped(new ItemStack(MekanismItems.Configurator, 1, 100), " X ", "ABC", " S ", 'S', "packStick", 'X', "dyeBlue", 'A', "packGemExquisite", 'C', "packGemExquisite", 'B', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(MekanismItems.Flamethrower, 1, 100), "III", "ICI", "BAB", 'I', TFCItems.bronzeSheet, 'C', new ItemStack(MekanismBlocks.GasTank, 1, OreDictionary.WILDCARD_VALUE), 'A', TFCItems.flintSteel);
				r.addShapeless(new ItemStack(MekanismItems.ArmoredJetpack, 1, 100), new ItemStack(MekanismItems.Jetpack, 1, OreDictionary.WILDCARD_VALUE), WurmTweaksItems.itemMachineFrame, WurmTweaksItems.itemCraftingCore);
				r.addShaped(new ItemStack(MekanismItems.GasMask, 1, 0), " G ", "GSG", "SSS", 'G', "packGlass", 'S', WurmTweaksItems.ingotPinkSteel);
				r.addShaped(new ItemStack(MekanismItems.PartTransmitter, 4, 0), "SGS", 'S', TFCItems.blackSteelIngot, 'G', Items.redstone);
				r.addCircleWCenter(new ItemStack(MekanismItems.PartTransmitter, 8, 1), new ItemStack(MekanismItems.PartTransmitter, 1, 0), new ItemStack(MekanismItems.EnrichedAlloy));
				r.addCircleWCenter(new ItemStack(MekanismItems.PartTransmitter, 8, 2), new ItemStack(MekanismItems.PartTransmitter, 1, 1), new ItemStack(MekanismItems.ReinforcedAlloy));
				r.addCircleWCenter(new ItemStack(MekanismItems.PartTransmitter, 8, 3), new ItemStack(MekanismItems.PartTransmitter, 1, 2), new ItemStack(MekanismItems.AtomicAlloy));
				r.addShaped(new ItemStack(MekanismItems.PartTransmitter, 4, 8), "SGS", 'S', TFCItems.blackSteelIngot, 'G', "packglass");
				r.addCircleWCenter(new ItemStack(MekanismItems.PartTransmitter, 8, 9), new ItemStack(MekanismItems.PartTransmitter, 1, 8), new ItemStack(MekanismItems.EnrichedAlloy));
				r.addCircleWCenter(new ItemStack(MekanismItems.PartTransmitter, 8, 10), new ItemStack(MekanismItems.PartTransmitter, 1, 9), new ItemStack(MekanismItems.ReinforcedAlloy));
				r.addCircleWCenter(new ItemStack(MekanismItems.PartTransmitter, 8, 11), new ItemStack(MekanismItems.PartTransmitter, 1, 10), new ItemStack(MekanismItems.AtomicAlloy));
				r.addShaped(new ItemStack(MekanismItems.PartTransmitter, 32, 4), "SGS", 'S', Items.bucket, 'G', "packGlass");
				r.addCircleWCenter(new ItemStack(MekanismItems.PartTransmitter, 8, 5), new ItemStack(MekanismItems.PartTransmitter, 1, 4), new ItemStack(MekanismItems.EnrichedAlloy));
				r.addCircleWCenter(new ItemStack(MekanismItems.PartTransmitter, 8, 6), new ItemStack(MekanismItems.PartTransmitter, 1, 5), new ItemStack(MekanismItems.ReinforcedAlloy));
				r.addCircleWCenter(new ItemStack(MekanismItems.PartTransmitter, 8, 7), new ItemStack(MekanismItems.PartTransmitter, 1, 6), new ItemStack(MekanismItems.AtomicAlloy));
				r.addShapeless(new ItemStack(MekanismBlocks.MachineBlock, 1, 12), new ItemStack(MekanismItems.AtomicAlloy), new ItemStack(BuildCraftFactory.pumpBlock));
				r.addShaped(new ItemStack(MekanismItems.ScubaTank, 1, 100), " X ", "T T", "SSS", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 1), 'T', new ItemStack(MekanismBlocks.GasTank, 1, OreDictionary.WILDCARD_VALUE), 'S', TFCItems.blueSteelIngot);
				r.addShaped(new ItemStack(MekanismItems.Robit, 1, 100), " A ", "XCX", "BBB", 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'X', new ItemStack(ExtraUtils.cobblestoneCompr, 1, 7), 'C', new ItemStack(MekanismBlocks.MachineBlock, 1, 13), 'B', new ItemStack(MekanismItems.Ingot));
				r.addShaped(new ItemStack(MekanismBlocks.GasTank, 1, 100), "III", "IXI", "III", 'I', TFCItems.blackBronzeSheet, 'X', "packGlass");
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 11), "XBX", "BXB", "XBX", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'B', WurmTweaksBlocks.blockBlackSteel, 'X', MekanismItems.TeleportationCore);
				r.addShaped(new ItemStack(MekanismItems.NetworkReader, 1, 100), " G ", "XAX", " I ", 'G', "wurmglass", 'I', TFCItems.steelIngot, 'X', MekanismItems.EnrichedAlloy, 'A', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(MekanismItems.FilterUpgrade, 1, 0), " X ", "XAX", " X ", 'X', new ItemStack(MekanismItems.ReinforcedAlloy), 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 0));
				r.addCross(new ItemStack(MekanismItems.ElectrolyticCore, 1, 0), new ItemStack(MekanismItems.AtomicAlloy, 1, 0), WurmTweaksItems.gearMixedSheet);
				r.addShaped(new ItemStack(MekanismItems.Jetpack, 1, 100), "ITI", "IGI", " I ", 'I', WurmTweaksItems.itemJetpackParts, 'T', new ItemStack(MekanismBlocks.GasTank, 1, OreDictionary.WILDCARD_VALUE), 'G', WurmTweaksItems.itemQuantumFoam);
				r.addShaped(new ItemStack(MekanismItems.FreeRunners, 1, 100), "X X", "BAB", "C C", 'B', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE), 'A', TFCItems.blueSteelBoots, 'X', new ItemStack(MekanismItems.AtomicAlloy, 1), 'C', WurmTweaksItems.itemMachineFrame);
				r.addShaped(ItemNBT.addDamage(new ItemStack(MekanismItems.AtomicDisassembler, 1, 4200), 400), " X ", "ABA", "ABA", 'X', WurmTweaksItems.itemAntiMatter, 'A', WurmTweaksItems.ingotTitanium, 'B', MekanismHelper.getCubeStatic(2));
				r.addShaped(new ItemStack(GeneratorsBlocks.Generator, 1, 0), "III", "PLP", "CFC", 'I', TFCItems.redSteelIngot2x, 'P', "packPlanks", 'L', TFCItems.blueSteelBucketLava, 'G', IC2Items.getItem("inductionFurnace"), 'C', WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 4), "IRI", "XCX", "IRI", 'I', WurmTweaksItems.ingotBrownSteel, 'R', "packGemExquisite", 'X', MekanismItems.AtomicAlloy, 'C', new ItemStack(MekanismItems.ElectrolyticCore));
				r.addShaped(new ItemStack(GeneratorsBlocks.Generator, 1, 5), "SXS", "SXS", "III", 'S', new ItemStack(GeneratorsBlocks.Generator, 1, 1), 'X', MekanismItems.AtomicAlloy, 'I', TFCItems.blackSteelSheet);
				r.addShaped(new ItemStack(GeneratorsBlocks.Generator, 1, 6), " X ", "XAX", "IXI", 'X', TFCItems.blueSteelIngot, 'A', MekanismItems.ReinforcedAlloy, 'I', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 14), "PPP", "XEX", 'P', Blocks.stone_pressure_plate, 'X', TFCItems.blackSteelSheet, 'E', new ItemStack(MekanismItems.EnergyTablet, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 2), "XAX", "GBG", "XAX", 'X', WurmTweaksItems.itemCraftingCore, 'A', "packGemExquisite", 'G', new ItemStack(MekanismBlocks.GasTank, 1, OreDictionary.WILDCARD_VALUE), 'B', WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock3, 1, 1), "CXC", "EBE", "III", 'C', MekanismItems.AtomicAlloy, 'X', new ItemStack(MekanismItems.Polyethene, 1, 2), 'E', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'B', "packGemBlock", 'I', WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 6), "XCX", "BAB", "XCX", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'A', WurmTweaksItems.ingotRainbowSteel, 'C', MekanismItems.AtomicAlloy, 'B', MekanismHelper.getCubeStatic(3));
				r.addShaped(new ItemStack(GeneratorsBlocks.Generator, 1, 3), "XAX", "BCB", "XAX", 'X', TFCItems.blueSteelSheet2x, 'A', WurmTweaksBlocks.blockSteel, 'B', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'C', MekanismItems.ElectrolyticCore);
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 13), "XA ", "XAC", "XA ", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'A', WurmTweaksItems.ingotTitanium, 'A', "packGemBlock");
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 1), "XAX", "ABC", "XAX", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 2), 'A', MekanismItems.AtomicAlloy, 'A', new ItemStack(MekanismBlocks.MachineBlock, 1, 13), 'B', WurmTweaksItems.itemMachineFrame, 'C', new ItemStack(MekanismBlocks.GasTank, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 7), "XAX", "ABC", "XAX", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 2), 'A', Items.bucket, 'A', new ItemStack(MekanismBlocks.MachineBlock, 1, 13), 'B', WurmTweaksItems.itemMachineFrame, 'C', new ItemStack(MekanismBlocks.GasTank, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 8), "XAX", "ABC", "XAX", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'A', MekanismItems.AtomicAlloy, 'A', new ItemStack(MekanismBlocks.MachineBlock, 1, 12), 'B', WurmTweaksItems.itemMachineFrame, 'C', new ItemStack(MekanismBlocks.GasTank, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 3), "XAX", "CBC", "XAX", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 2), 'X', "packGemExquisite", 'C', WurmTweaksItems.itemCraftingCore, 'B', WurmTweaksItems.itemMachineFrame);
				r.addShapeless(new ItemStack(MekanismBlocks.MachineBlock2, 1, 12), TFCItems.blackBronzeSheet2x, new ItemStack(MekanismBlocks.MachineBlock, 1, 12));
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 14), "III", "IBC", "III", 'I', WurmTweaksItems.itemAutoCore, 'B', "packGemBlock", 'C', new ItemStack(TFCItems.gemDiamond, 1, 3));
				r.addShapeless(new ItemStack(MekanismBlocks.MachineBlock2, 1, 15), new ItemStack(MekanismBlocks.MachineBlock2, 1, 14), WurmTweaksItems.itemAutoCore);
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 10), " X ", "TBT", "III", 'I', WurmTweaksItems.itemCraftingCore, 'T', MekanismItems.AtomicAlloy, 'B', WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock2, 1, 0), "GGG", "ABA", "GGG", 'G', "packGlass", 'A', new ItemStack(TEBlocks.blockTank, 1, 2), 'B', WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 9), "XCX", "IBI", "XCX", 'X', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'C', MekanismItems.AtomicAlloy, 'I', TFCItems.redSteelSheet2x, 'B', new ItemStack(MekanismBlocks.MachineBlock, 1, 0));
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 4), "ACA", "LQL", "BRB", 'Q', BuildCraftBuilders.quarryBlock, 'A', MekanismItems.AtomicAlloy, 'C', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'L', new ItemStack(MekanismBlocks.MachineBlock, 1, 15), 'B', MekanismItems.TeleportationCore, 'R', new ItemStack(MekanismItems.Robit, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(MekanismBlocks.MachineBlock, 1, 4), "ACA", "LQL", "BRB", 'Q', ExtraUtils.enderQuarry, 'A', MekanismItems.AtomicAlloy, 'C', new ItemStack(MekanismItems.ControlCircuit, 1, 3), 'L', new ItemStack(MekanismBlocks.MachineBlock, 1, 15), 'B', MekanismItems.TeleportationCore, 'R', new ItemStack(MekanismItems.Robit, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(GeneratorsBlocks.Reactor, 1, 4), " R ", "RBR", " R ", 'R', Items.nether_star, 'B', new ItemStack(GeneratorsBlocks.Reactor, 1, 1));
				r.addShaped(new ItemStack(GeneratorsBlocks.Reactor, 1, 1), " R ", "RBR", " R ", 'R', WurmTweaksItems.itemAutoCore, 'B', "packGemBlock");
				r.addShaped(new ItemStack(GeneratorsBlocks.ReactorGlass, 1, 0), " R ", "RBR", " R ", 'R', "packGlass", 'B', new ItemStack(GeneratorsBlocks.Reactor, 1, 1));
				r.addShaped(new ItemStack(GeneratorsBlocks.ReactorGlass, 1, 1), " R ", "RBR", " R ", 'R', new ItemStack(GeneratorsBlocks.ReactorGlass, 1, 0), 'B', WurmTweaksBlocks.blockCompressedRedstone);
				r.addShaped(new ItemStack(GeneratorsBlocks.Reactor, 1, 3), " R ", "RBR", " R ", 'R', new ItemStack(GeneratorsBlocks.Reactor, 1, 1), 'B', new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addShaped(new ItemStack(GeneratorsBlocks.Reactor, 1, 0), "RRR", "RBR", "RRR", 'R', new ItemStack(GeneratorsBlocks.Reactor, 1, 1), 'B', new ItemStack(SEGameObjects.SolarPanelUltimate));
				r.addBasicMachineRecipe(new ItemStack(MekanismBlocks.BasicBlock2, 1, 9), WurmTweaksItems.gearMixedSheet, Items.book, Items.redstone, new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addCrossWCenter(new ItemStack(MekanismBlocks.BasicBlock, 1, 8), TFCItems.steelSheet2x, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(MekanismBlocks.BasicBlock2, 1, 5), WurmTweaksBlocks.blockCompressedRedstone, TFCItems.blueSteelBucketLava, WurmTweaksBlocks.blockGold, WurmTweaksItems.itemMachineFrame);
				addMetallurgicInfuserRecipe();
				addEnrichmentChamberRecipes();
		}

		@Optional.Method (modid = "Mekanism")
		private static void addMetallurgicInfuserRecipe () {
				MekanismHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("REDSTONE"), 20, new ItemStack(TFCItems.steelIngot), new ItemStack(MekanismItems.EnrichedAlloy));
				MekanismHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("CARBON"), 50, new ItemStack(MekanismItems.EnrichedAlloy), new ItemStack(MekanismItems.ControlCircuit, 1, 0));
				MekanismHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("REDSTONE"), 100, new ItemStack(MekanismItems.EnrichedAlloy), new ItemStack(MekanismItems.ReinforcedAlloy));
				MekanismHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("CARBON"), 100, new ItemStack(MekanismItems.ReinforcedAlloy), new ItemStack(MekanismItems.AtomicAlloy));
				MekanismHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("CARBON"), 50, new ItemStack(Items.nether_star, 4, 0), new ItemStack(GeneratorsItems.Hohlraum, 1, 100));
		}

		@Optional.Method (modid = "Mekanism")
		private static void addEnrichmentChamberRecipes () {

		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import buildcraft.BuildCraftBuilders;
import buildcraft.BuildCraftFactory;
import cofh.thermalexpansion.block.TEBlocks;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import erogenousbeef.bigreactors.common.BigReactors;
import ic2.api.item.IC2Items;
import mekanism.api.gas.GasStack;
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
import wurmcraft.wurmatron.common.utils.machines.MachineHelper;
import wurmcraft.wurmatron.common.utils.mekanism.MekanismHelper;
import wurmcraft.wurmatron.common.utils.mekanism.MekanismRegistry;
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
				MekanismRegistry.addGases();
				addMetallurgicInfuserRecipe();
				addPulversiverRecipes();
				addCrusherRecipes();
				addPurificationChamberRecipes();
				addChemicalInjectorRecipes();
				addChemicalCrystallizerRecipes();
				addChemicalWasherRecipes();
				addChemicalDissolutionRecipes();
		}

		@Optional.Method (modid = "Mekanism")
		private static void addMetallurgicInfuserRecipe () {
				MekanismHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("REDSTONE"), 20, new ItemStack(TFCItems.steelIngot), new ItemStack(MekanismItems.EnrichedAlloy));
				MekanismHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("CARBON"), 50, new ItemStack(MekanismItems.EnrichedAlloy), new ItemStack(MekanismItems.ControlCircuit, 1, 0));
				MekanismHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("REDSTONE"), 100, new ItemStack(MekanismItems.EnrichedAlloy), new ItemStack(MekanismItems.ReinforcedAlloy));
				MekanismHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("CARBON"), 100, new ItemStack(MekanismItems.ReinforcedAlloy), new ItemStack(MekanismItems.AtomicAlloy));
				MekanismHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("CARBON"), 50, new ItemStack(Items.nether_star, 4, 0), new ItemStack(GeneratorsItems.Hohlraum, 1, 100));
		}

		private static void addPulversiverRecipes () {
				// Poor Ores
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditCopper30, new ItemStack(TFCItems.oreChunk, 1, 49), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditGold30, new ItemStack(TFCItems.oreChunk, 1, 50), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditPlatinum30, new ItemStack(TFCItems.oreChunk, 1, 51), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditIron30, new ItemStack(TFCItems.oreChunk, 1, 52), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditSilver30, new ItemStack(TFCItems.oreChunk, 1, 53), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditTin30, new ItemStack(TFCItems.oreChunk, 1, 54), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditLead30, new ItemStack(TFCItems.oreChunk, 1, 55), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditBismuth30, new ItemStack(TFCItems.oreChunk, 1, 56), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditNickel30, new ItemStack(TFCItems.oreChunk, 1, 57), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditCopper30, new ItemStack(TFCItems.oreChunk, 1, 58), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditIron30, new ItemStack(TFCItems.oreChunk, 1, 59), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditIron30, new ItemStack(TFCItems.oreChunk, 1, 60), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditZinc30, new ItemStack(TFCItems.oreChunk, 1, 61), 32, 300, null, 0);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditCopper30, new ItemStack(TFCItems.oreChunk, 1, 62), 32, 300, null, 0);
				// Regular Ores
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditCopper50, new ItemStack(TFCItems.oreChunk, 1, 0), 32, 400, WurmTweaksItems.creditCopper30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditGold50, new ItemStack(TFCItems.oreChunk, 1, 1), 32, 400, WurmTweaksItems.creditGold30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditPlatinum50, new ItemStack(TFCItems.oreChunk, 1, 2), 32, 400, WurmTweaksItems.creditPlatinum30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditIron50, new ItemStack(TFCItems.oreChunk, 1, 3), 32, 400, WurmTweaksItems.creditIron30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditSilver50, new ItemStack(TFCItems.oreChunk, 1, 4), 32, 400, WurmTweaksItems.creditSilver30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditTin50, new ItemStack(TFCItems.oreChunk, 1, 5), 32, 400, WurmTweaksItems.creditTin30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditLead50, new ItemStack(TFCItems.oreChunk, 1, 6), 32, 400, WurmTweaksItems.creditLead30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditBismuth50, new ItemStack(TFCItems.oreChunk, 1, 7), 32, 400, WurmTweaksItems.creditBismuth30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditNickel50, new ItemStack(TFCItems.oreChunk, 1, 8), 32, 400, WurmTweaksItems.creditNickel30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditCopper50, new ItemStack(TFCItems.oreChunk, 1, 9), 32, 400, WurmTweaksItems.creditCopper30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditIron50, new ItemStack(TFCItems.oreChunk, 1, 10), 32, 400, WurmTweaksItems.creditIron30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditIron50, new ItemStack(TFCItems.oreChunk, 1, 11), 32, 400, WurmTweaksItems.creditIron30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditZinc50, new ItemStack(TFCItems.oreChunk, 1, 12), 32, 400, WurmTweaksItems.creditZinc30, 5);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditCopper50, new ItemStack(TFCItems.oreChunk, 1, 13), 32, 400, WurmTweaksItems.creditCopper30, 5);
				// Rich Ores
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditCopper70, new ItemStack(TFCItems.oreChunk, 1, 35), 32, 400, WurmTweaksItems.creditCopper30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditGold70, new ItemStack(TFCItems.oreChunk, 1, 36), 32, 400, WurmTweaksItems.creditGold30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditPlatinum70, new ItemStack(TFCItems.oreChunk, 1, 37), 32, 400, WurmTweaksItems.creditPlatinum30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditIron70, new ItemStack(TFCItems.oreChunk, 1, 38), 32, 400, WurmTweaksItems.creditIron30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditSilver70, new ItemStack(TFCItems.oreChunk, 1, 39), 32, 400, WurmTweaksItems.creditSilver30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditTin70, new ItemStack(TFCItems.oreChunk, 1, 40), 32, 400, WurmTweaksItems.creditTin30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditLead70, new ItemStack(TFCItems.oreChunk, 1, 41), 32, 400, WurmTweaksItems.creditLead30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditBismuth70, new ItemStack(TFCItems.oreChunk, 1, 42), 32, 400, WurmTweaksItems.creditBismuth30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditNickel70, new ItemStack(TFCItems.oreChunk, 1, 43), 32, 400, WurmTweaksItems.creditNickel30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditCopper70, new ItemStack(TFCItems.oreChunk, 1, 44), 32, 400, WurmTweaksItems.creditCopper30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditIron70, new ItemStack(TFCItems.oreChunk, 1, 45), 32, 400, WurmTweaksItems.creditIron30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditIron70, new ItemStack(TFCItems.oreChunk, 1, 46), 32, 400, WurmTweaksItems.creditIron30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditZinc70, new ItemStack(TFCItems.oreChunk, 1, 47), 32, 400, WurmTweaksItems.creditZinc30, 20);
				MachineHelper.addPulveriserRecipes(WurmTweaksItems.creditCopper70, new ItemStack(TFCItems.oreChunk, 1, 48), 32, 400, WurmTweaksItems.creditCopper30, 20);
				// Misc Ores
				MachineHelper.addPulveriserRecipes(new ItemStack(Items.redstone, 12), new ItemStack(TFCItems.oreChunk, 1, 27), 32, 400, new ItemStack(Items.redstone), 25);
				MachineHelper.addPulveriserRecipes(new ItemStack(Items.redstone, 12), new ItemStack(TFCItems.oreChunk, 1, 28), 32, 400, new ItemStack(Items.redstone), 25);
				MachineHelper.addPulveriserRecipes(new ItemStack(Items.dye, 12, 4), new ItemStack(TFCItems.oreChunk, 1, 34), 32, 400, new ItemStack(Items.dye, 1, 4), 25);
				MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.coal, 8, 0), new ItemStack(TFCItems.oreChunk, 1, 14), 32, 400, new ItemStack(TFCItems.coal, 1, 0), 25);
				MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.coal, 8, 0), new ItemStack(TFCItems.oreChunk, 1, 15), 32, 400, new ItemStack(TFCItems.coal, 1, 0), 25);
				MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.powder, 6, 1), new ItemStack(TFCItems.oreChunk, 1, 16), 32, 400, null, 0);
				MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.powder, 6, 2), new ItemStack(TFCItems.oreChunk, 1, 20), 32, 400, null, 0);
				MachineHelper.addPulveriserRecipes(new ItemStack(TFItems.itemMaterial, 4, 17), new ItemStack(TFCItems.oreChunk, 1, 29), 32, 400, null, 0);
				MachineHelper.addPulveriserRecipes(new ItemStack(TFItems.itemMaterial, 12, 16), new ItemStack(TFCItems.oreChunk, 1, 23), 32, 400, null, 0);
				MachineHelper.addPulveriserRecipes(new ItemStack(BigReactors.ingotGeneric, 6, 0), new ItemStack(TFCItems.oreChunk, 1, 26), 32, 400, null, 0);
				// Dirty - > Credits
				MekanismHelper.addEnrichmentChamberRecipe(WurmTweaksItems.creditCopper100, WurmTweaksItems.dirtyCopper);
				MekanismHelper.addEnrichmentChamberRecipe(WurmTweaksItems.creditGold100, WurmTweaksItems.dirtyGold);
				MekanismHelper.addEnrichmentChamberRecipe(WurmTweaksItems.creditPlatinum100, WurmTweaksItems.dirtyPlatinum);
				MekanismHelper.addEnrichmentChamberRecipe(WurmTweaksItems.creditIron100, WurmTweaksItems.dirtyIron);
				MekanismHelper.addEnrichmentChamberRecipe(WurmTweaksItems.creditSilver100, WurmTweaksItems.dirtySilver);
				MekanismHelper.addEnrichmentChamberRecipe(WurmTweaksItems.creditTin100, WurmTweaksItems.dirtyTin);
				MekanismHelper.addEnrichmentChamberRecipe(WurmTweaksItems.creditLead100, WurmTweaksItems.dirtyLead);
				MekanismHelper.addEnrichmentChamberRecipe(WurmTweaksItems.creditBismuth100, WurmTweaksItems.dirtyBismuth);
				MekanismHelper.addEnrichmentChamberRecipe(WurmTweaksItems.creditNickel100, WurmTweaksItems.dirtyNickel);
				MekanismHelper.addEnrichmentChamberRecipe(WurmTweaksItems.creditIron100, WurmTweaksItems.dirtyIron);
				MekanismHelper.addEnrichmentChamberRecipe(WurmTweaksItems.creditZinc100, WurmTweaksItems.dirtyZinc);
		}

		private static void addCrusherRecipes () {
				MekanismHelper.addCrusherRecipe(WurmTweaksItems.dirtyCopper, WurmTweaksItems.clumpCopper);
				MekanismHelper.addCrusherRecipe(WurmTweaksItems.dirtyGold, WurmTweaksItems.clumpGold);
				MekanismHelper.addCrusherRecipe(WurmTweaksItems.dirtyPlatinum, WurmTweaksItems.clumpPlatinum);
				MekanismHelper.addCrusherRecipe(WurmTweaksItems.dirtyIron, WurmTweaksItems.clumpIron);
				MekanismHelper.addCrusherRecipe(WurmTweaksItems.dirtySilver, WurmTweaksItems.clumpSilver);
				MekanismHelper.addCrusherRecipe(WurmTweaksItems.dirtyTin, WurmTweaksItems.clumpTin);
				MekanismHelper.addCrusherRecipe(WurmTweaksItems.dirtyLead, WurmTweaksItems.clumpLead);
				MekanismHelper.addCrusherRecipe(WurmTweaksItems.dirtyBismuth, WurmTweaksItems.clumpBismuth);
				MekanismHelper.addCrusherRecipe(WurmTweaksItems.dirtyNickel, WurmTweaksItems.clumpNickel);
				MekanismHelper.addCrusherRecipe(WurmTweaksItems.dirtyIron, WurmTweaksItems.clumpIron);
				MekanismHelper.addCrusherRecipe(WurmTweaksItems.dirtyZinc, WurmTweaksItems.clumpZinc);
		}

		private static void addPurificationChamberRecipes () {
				MekanismHelper.addPurificationChamberRecipe(WurmTweaksItems.clumpCopper, WurmTweaksItems.shardCopper);
				MekanismHelper.addPurificationChamberRecipe(WurmTweaksItems.clumpGold, WurmTweaksItems.shardGold);
				MekanismHelper.addPurificationChamberRecipe(WurmTweaksItems.clumpPlatinum, WurmTweaksItems.shardPlatinum);
				MekanismHelper.addPurificationChamberRecipe(WurmTweaksItems.clumpIron, WurmTweaksItems.shardIron);
				MekanismHelper.addPurificationChamberRecipe(WurmTweaksItems.clumpSilver, WurmTweaksItems.shardSilver);
				MekanismHelper.addPurificationChamberRecipe(WurmTweaksItems.clumpTin, WurmTweaksItems.shardTin);
				MekanismHelper.addPurificationChamberRecipe(WurmTweaksItems.clumpLead, WurmTweaksItems.shardLead);
				MekanismHelper.addPurificationChamberRecipe(WurmTweaksItems.clumpBismuth, WurmTweaksItems.shardBismuth);
				MekanismHelper.addPurificationChamberRecipe(WurmTweaksItems.clumpNickel, WurmTweaksItems.shardNickel);
				MekanismHelper.addPurificationChamberRecipe(WurmTweaksItems.clumpIron, WurmTweaksItems.shardIron);
				MekanismHelper.addPurificationChamberRecipe(WurmTweaksItems.clumpZinc, WurmTweaksItems.shardZinc);
		}

		private static void addChemicalInjectorRecipes () {
				MekanismHelper.addChemicalInjectionChamberRecipe(WurmTweaksItems.shardCopper, "hydrogenChloride", WurmTweaksItems.crystalCopper);
				MekanismHelper.addChemicalInjectionChamberRecipe(WurmTweaksItems.shardGold, "hydrogenChloride", WurmTweaksItems.crystalGold);
				MekanismHelper.addChemicalInjectionChamberRecipe(WurmTweaksItems.shardPlatinum, "hydrogenChloride", WurmTweaksItems.crystalPlatinum);
				MekanismHelper.addChemicalInjectionChamberRecipe(WurmTweaksItems.shardIron, "hydrogenChloride", WurmTweaksItems.crystalIron);
				MekanismHelper.addChemicalInjectionChamberRecipe(WurmTweaksItems.shardSilver, "hydrogenChloride", WurmTweaksItems.crystalSilver);
				MekanismHelper.addChemicalInjectionChamberRecipe(WurmTweaksItems.shardTin, "hydrogenChloride", WurmTweaksItems.crystalTin);
				MekanismHelper.addChemicalInjectionChamberRecipe(WurmTweaksItems.shardLead, "hydrogenChloride", WurmTweaksItems.crystalLead);
				MekanismHelper.addChemicalInjectionChamberRecipe(WurmTweaksItems.shardBismuth, "hydrogenChloride", WurmTweaksItems.crystalBismuth);
				MekanismHelper.addChemicalInjectionChamberRecipe(WurmTweaksItems.shardNickel, "hydrogenChloride", WurmTweaksItems.crystalNickel);
				MekanismHelper.addChemicalInjectionChamberRecipe(WurmTweaksItems.shardIron, "hydrogenChloride", WurmTweaksItems.crystalIron);
				MekanismHelper.addChemicalInjectionChamberRecipe(WurmTweaksItems.shardZinc, "hydrogenChloride", WurmTweaksItems.crystalZinc);
		}

		public static void addChemicalCrystallizerRecipes () {
				MekanismHelper.addChemicalCrystallizerRecipe(new GasStack(MekanismRegistry.copperPure, 100), WurmTweaksItems.crystalCopper);
				MekanismHelper.addChemicalCrystallizerRecipe(new GasStack(MekanismRegistry.goldPure, 100), WurmTweaksItems.crystalGold);
				MekanismHelper.addChemicalCrystallizerRecipe(new GasStack(MekanismRegistry.platinumPure, 100), WurmTweaksItems.crystalPlatinum);
				MekanismHelper.addChemicalCrystallizerRecipe(new GasStack(MekanismRegistry.ironPure, 100), WurmTweaksItems.crystalIron);
				MekanismHelper.addChemicalCrystallizerRecipe(new GasStack(MekanismRegistry.silverPure, 100), WurmTweaksItems.crystalSilver);
				MekanismHelper.addChemicalCrystallizerRecipe(new GasStack(MekanismRegistry.tinPure, 100), WurmTweaksItems.crystalTin);
				MekanismHelper.addChemicalCrystallizerRecipe(new GasStack(MekanismRegistry.leadPure, 100), WurmTweaksItems.crystalLead);
				MekanismHelper.addChemicalCrystallizerRecipe(new GasStack(MekanismRegistry.bismuthPure, 100), WurmTweaksItems.crystalBismuth);
				MekanismHelper.addChemicalCrystallizerRecipe(new GasStack(MekanismRegistry.nickelPure, 100), WurmTweaksItems.crystalNickel);
				MekanismHelper.addChemicalCrystallizerRecipe(new GasStack(MekanismRegistry.ironPure, 100), WurmTweaksItems.crystalIron);
				MekanismHelper.addChemicalCrystallizerRecipe(new GasStack(MekanismRegistry.zincPure, 100), WurmTweaksItems.crystalZinc);
		}

		private static void addChemicalWasherRecipes () {
				MekanismHelper.addChemicalWasherRecipe(new GasStack(MekanismRegistry.copper, 100), new GasStack(MekanismRegistry.copperPure, 100));
				MekanismHelper.addChemicalWasherRecipe(new GasStack(MekanismRegistry.gold, 100), new GasStack(MekanismRegistry.goldPure, 100));
				MekanismHelper.addChemicalWasherRecipe(new GasStack(MekanismRegistry.platinum, 100), new GasStack(MekanismRegistry.platinumPure, 100));
				MekanismHelper.addChemicalWasherRecipe(new GasStack(MekanismRegistry.iron, 100), new GasStack(MekanismRegistry.ironPure, 100));
				MekanismHelper.addChemicalWasherRecipe(new GasStack(MekanismRegistry.silver, 100), new GasStack(MekanismRegistry.silverPure, 100));
				MekanismHelper.addChemicalWasherRecipe(new GasStack(MekanismRegistry.tin, 100), new GasStack(MekanismRegistry.tinPure, 100));
				MekanismHelper.addChemicalWasherRecipe(new GasStack(MekanismRegistry.lead, 100), new GasStack(MekanismRegistry.leadPure, 100));
				MekanismHelper.addChemicalWasherRecipe(new GasStack(MekanismRegistry.bismuth, 100), new GasStack(MekanismRegistry.bismuthPure, 100));
				MekanismHelper.addChemicalWasherRecipe(new GasStack(MekanismRegistry.nickel, 100), new GasStack(MekanismRegistry.nickelPure, 100));
				MekanismHelper.addChemicalWasherRecipe(new GasStack(MekanismRegistry.iron, 100), new GasStack(MekanismRegistry.ironPure, 100));
				MekanismHelper.addChemicalWasherRecipe(new GasStack(MekanismRegistry.zinc, 100), new GasStack(MekanismRegistry.zincPure, 100));
		}

		private static void addChemicalDissolutionRecipes () {
				// Poor Ores
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.copper, 75), new ItemStack(TFCItems.oreChunk, 1, 49));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.gold, 75), new ItemStack(TFCItems.oreChunk, 1, 50));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.platinum, 75), new ItemStack(TFCItems.oreChunk, 1, 51));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.iron, 75), new ItemStack(TFCItems.oreChunk, 1, 52));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.silver, 75), new ItemStack(TFCItems.oreChunk, 1, 53));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.tin, 75), new ItemStack(TFCItems.oreChunk, 1, 54));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.lead, 75), new ItemStack(TFCItems.oreChunk, 1, 55));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.bismuth, 75), new ItemStack(TFCItems.oreChunk, 1, 56));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.nickel, 75), new ItemStack(TFCItems.oreChunk, 1, 57));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.copper, 75), new ItemStack(TFCItems.oreChunk, 1, 58));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.iron, 75), new ItemStack(TFCItems.oreChunk, 1, 59));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.iron, 75), new ItemStack(TFCItems.oreChunk, 1, 60));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.zinc, 75), new ItemStack(TFCItems.oreChunk, 1, 61));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.copper, 75), new ItemStack(TFCItems.oreChunk, 1, 62));
				// Regular Ores
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.copper, 125), new ItemStack(TFCItems.oreChunk, 1, 0));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.gold, 125), new ItemStack(TFCItems.oreChunk, 1, 1));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.platinum, 125), new ItemStack(TFCItems.oreChunk, 1, 2));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.iron, 125), new ItemStack(TFCItems.oreChunk, 1, 3));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.silver, 125), new ItemStack(TFCItems.oreChunk, 1, 4));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.tin, 125), new ItemStack(TFCItems.oreChunk, 1, 5));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.lead, 125), new ItemStack(TFCItems.oreChunk, 1, 6));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.bismuth, 125), new ItemStack(TFCItems.oreChunk, 1, 7));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.nickel, 125), new ItemStack(TFCItems.oreChunk, 1, 8));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.copper, 125), new ItemStack(TFCItems.oreChunk, 1, 9));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.iron, 125), new ItemStack(TFCItems.oreChunk, 1, 10));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.iron, 125), new ItemStack(TFCItems.oreChunk, 1, 11));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.zinc, 125), new ItemStack(TFCItems.oreChunk, 1, 12));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.copper, 125), new ItemStack(TFCItems.oreChunk, 1, 13));
				// Rich Ores
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.copper, 175), new ItemStack(TFCItems.oreChunk, 1, 35));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.gold, 175), new ItemStack(TFCItems.oreChunk, 1, 36));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.platinum, 175), new ItemStack(TFCItems.oreChunk, 1, 37));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.iron, 175), new ItemStack(TFCItems.oreChunk, 1, 38));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.silver, 175), new ItemStack(TFCItems.oreChunk, 1, 39));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.tin, 175), new ItemStack(TFCItems.oreChunk, 1, 40));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.lead, 175), new ItemStack(TFCItems.oreChunk, 1, 41));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.bismuth, 175), new ItemStack(TFCItems.oreChunk, 1, 42));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.nickel, 175), new ItemStack(TFCItems.oreChunk, 1, 43));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.copper, 175), new ItemStack(TFCItems.oreChunk, 1, 44));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.iron, 175), new ItemStack(TFCItems.oreChunk, 1, 45));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.iron, 175), new ItemStack(TFCItems.oreChunk, 1, 46));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.zinc, 175), new ItemStack(TFCItems.oreChunk, 1, 47));
				MekanismHelper.addChemicalDissolutionRecipe(new GasStack(MekanismRegistry.copper, 175), new ItemStack(TFCItems.oreChunk, 1, 48));
		}
}

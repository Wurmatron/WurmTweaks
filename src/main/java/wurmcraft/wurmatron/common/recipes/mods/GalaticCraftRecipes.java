package wurmcraft.wurmatron.common.recipes.mods;

import buildcraft.BuildCraftFactory;
import buildcraft.BuildCraftTransport;
import cofh.thermaldynamics.duct.TDDucts;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import fox.spiteful.avaritia.items.LudicrousItems;
import ic2.api.item.IC2Items;
import micdoodle8.mods.galacticraft.api.recipe.CircuitFabricatorRecipes;
import micdoodle8.mods.galacticraft.api.recipe.CompressorRecipes;
import micdoodle8.mods.galacticraft.core.blocks.GCBlocks;
import micdoodle8.mods.galacticraft.core.items.GCItems;
import micdoodle8.mods.galacticraft.planets.asteroids.blocks.AsteroidBlocks;
import micdoodle8.mods.galacticraft.planets.asteroids.items.AsteroidsItems;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import mods.railcraft.common.blocks.RailcraftBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.handler.ArmorHandler;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class GalaticCraftRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				r.addCrossWCenter(new ItemStack(GCBlocks.landingPad, 9, 0), new ItemStack(ExtraUtils.cobblestoneCompr, 1, 7), "packGemBlock", WurmTweaksItems.ingotEnergyReactor);
				r.addCrossWCenter(new ItemStack(GCBlocks.landingPad, 9, 1), new ItemStack(ExtraUtils.cobblestoneCompr, 1, 6), "packGemBlock", WurmTweaksItems.ingotEnergyReactor);
				r.addBasicMachineRecipe(GCBlocks.oxygenCompressor, Blocks.piston, "packGemExquisite", WurmTweaksItems.gearMixedSheet, WurmTweaksItems.itemSpaceModule);
				r.addBasicMachineRecipe(new ItemStack(GCBlocks.oxygenCompressor, 1, 4), Blocks.sticky_piston, "packGemExquisite", WurmTweaksItems.gearMixedSheet, WurmTweaksItems.itemSpaceModule);
				r.addBasicMachineRecipe(GCBlocks.oxygenDistributor, WurmTweaksItems.itemRadiationShielding, "packGemExquisite", WurmTweaksItems.gearMixedSheet, WurmTweaksItems.itemSpaceModule);
				r.addBasicMachineRecipe(GCBlocks.oxygenSealer, WurmTweaksItems.itemRadiationShielding, TFCItems.mortar, WurmTweaksItems.gearMixedSheet, WurmTweaksItems.itemSpaceModule);
				r.addBasicMachineRecipe(GCBlocks.oxygenDetector, Items.redstone, "packGemExquisite", WurmTweaksItems.gearMixedSheet, WurmTweaksItems.itemSpaceModule);
				r.addShaped(new ItemStack(GCBlocks.oxygenPipe, 48), "SSS", "CCC", "SSS", 'S', WurmTweaksItems.itemRadiationShielding, 'C', TFCItems.clayBall);
				r.addShaped(GCBlocks.refinery, "RXR", "XAX", "BCB", 'R', BuildCraftFactory.refineryBlock, 'X', WurmTweaksItems.gearMixedSheet, 'A', WurmTweaksItems.itemRefiningModule, 'B', GCItems.heavyPlatingTier1, 'C', new ItemStack(GCItems.basicItem, 1, 14));
				r.addBasicMachineRecipe(GCBlocks.fuelLoader, WurmTweaksItems.gearMixedSheet, GCItems.heavyPlatingTier1, TDDucts.fluidBasic.itemStack, WurmTweaksItems.itemSpaceModule);
				r.addBasicMachineRecipe(GCBlocks.cargoLoader, WurmTweaksItems.gearMixedSheet, GCItems.heavyPlatingTier1, "packChest", WurmTweaksItems.itemSpaceModule);
				r.addBasicMachineRecipe(GCBlocks.cargoLoader, WurmTweaksItems.gearMixedSheet, "packChest", GCItems.heavyPlatingTier1, WurmTweaksItems.itemSpaceModule);
				r.addBasicMachineRecipe(GCBlocks.nasaWorkbench, WurmTweaksBlocks.blockRedSteel, WurmTweaksItems.itemSpaceModule, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.gearMixedSheet);
				r.addCross(GCBlocks.airLockFrame, WurmTweaksBlocks.blockBlackSteel, TFCItems.mortar);
				r.addCrossWCenter(GCBlocks.airLockSeal, WurmTweaksBlocks.blockRedSteel, TFCItems.mortar, WurmTweaksItems.itemRadiationShielding);
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 14), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', GCBlocks.aluminumWire);
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 15), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', new ItemStack(GCBlocks.aluminumWire, 1, 1));
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 1), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', new ItemStack(GCBlocks.oxygenPipe, 1, 0));
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 2), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', IC2Items.getItem("insulatedCopperCableItem"));
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 3), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', IC2Items.getItem("doubleInsulatedGoldCableItem"));
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 4), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', IC2Items.getItem("trippleInsulatedIronCableItem"));
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 5), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', IC2Items.getItem("glassFiberCableItem"));
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 6), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', IC2Items.getItem("insulatedTinCableItem"));
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 7), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', BuildCraftTransport.pipeItemsCobblestone);
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 8), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', BuildCraftTransport.pipeItemsStone);
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 9), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', BuildCraftTransport.pipeFluidsStone);
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 10), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', BuildCraftTransport.pipeFluidsCobblestone);
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 11), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', BuildCraftTransport.pipePowerStone);
				r.addShaped(new ItemStack(GCBlocks.sealableBlock, 1, 12), "TXT", "TCT", "TXT", 'T', TFCItems.tinSheet, 'X', TFCItems.mortar, 'C', BuildCraftTransport.pipePowerGold);
				r.addBasicMachineRecipe(new ItemStack(GCBlocks.solarPanel), TFCItems.platinumSheet2x, new ItemStack(GCItems.basicItem, 1, 1), WurmTweaksBlocks.blockCompressedRedstone, WurmTweaksItems.itemSolarCore);
				r.addBasicMachineRecipe(new ItemStack(GCBlocks.solarPanel, 1, 1), TFCItems.platinumSheet2x, new ItemStack(GCItems.basicItem, 1, 1), new ItemStack(GCBlocks.solarPanel), WurmTweaksItems.itemSolarCore);
				r.addShapeless(GCBlocks.machineBase, IC2Items.getItem("generator"), WurmTweaksItems.itemSpaceModule, WurmTweaksItems.gearMixedSheet);
				r.addShaped(new ItemStack(GCBlocks.machineBase, 1, 12), "SSS", "XCX", "SSS", 'S', WurmTweaksItems.ingotGreenSteel, 'X', WurmTweaksItems.gearMixedSheet, 'X', IC2Items.getItem("compressor"));
				r.addShaped(new ItemStack(GCBlocks.machineBase2, 1, 0), "SSS", "XCX", "SSS", 'S', WurmTweaksItems.itemSpaceModule, 'X', WurmTweaksItems.gearMixedSheet, 'X', new ItemStack(GCBlocks.machineBase, 1, 12));
				r.addShaped(new ItemStack(GCBlocks.machineBase2, 1, 4), "SSS", "XCX", "SSS", 'S', WurmTweaksItems.ingotBrownSteel, 'X', "packGemExquisite", 'X', WurmTweaksItems.itemSpaceModule);
				r.addShaped(new ItemStack(GCBlocks.machineBase2, 1, 8), "SSS", "XCX", "SSS", 'S', WurmTweaksItems.ingotBrownSteel, 'X', new ItemStack(GCItems.oxTankHeavy, 1, OreDictionary.WILDCARD_VALUE), 'X', WurmTweaksItems.itemSpaceModule);
				r.addShaped(new ItemStack(GCBlocks.machineTiered, 1, 0), "SSS", "XCX", "SSS", 'S', WurmTweaksItems.ingotBrownSteel, 'X', IC2Items.getItem("mfsUnit"), 'X', WurmTweaksItems.itemSpaceModule);
				r.addShaped(new ItemStack(GCBlocks.machineTiered, 1, 8), "SSS", "XCX", "SSS", 'S', WurmTweaksItems.ingotTitanium, 'X', new ItemStack(GCBlocks.machineTiered, 1, 0), 'X', WurmTweaksItems.itemSpaceModule);
				r.addShaped(new ItemStack(GCBlocks.aluminumWire, 6, 0), "WWW", "III", "WWW", 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'I', "ingotAluminum");
				r.addShaped(new ItemStack(GCBlocks.aluminumWire, 6, 1), "WWW", "III", "WWW", 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'I', new ItemStack(GCBlocks.aluminumWire, 1, 0));
				r.addBasicMachineRecipe(new ItemStack(GCBlocks.spinThruster, 1, 0), WurmTweaksItems.itemAntiMatter, WurmTweaksBlocks.blockCompressedRedstone, WurmTweaksItems.ingotTitanium, WurmTweaksBlocks.blockPlatinum);
				r.addCircleWCenter(GCBlocks.screen, TFCItems.blackSteelSheet2x, "packCloth");
				r.addCircleWCenter(GCBlocks.telemetry, WurmTweaksItems.ingotEnergyReactor, new ItemStack(GCItems.basicItem, 1, 19));
				r.addShaped(GCBlocks.brightLamp, "XXX", "ABA", "XXX", 'A', Blocks.glowstone, 'X', WurmTweaksBlocks.blockCompressedRedstone, 'B', WurmTweaksItems.itemSpaceModule);
				r.addShaped(GCItems.oxMask, "GGG", "XGX", "BCB", 'G', "packGlass", 'X', WurmTweaksItems.ingotCyanSteel, 'B', "packGemExquisite", 'C', GCBlocks.oxygenPipe);
				r.addShaped(GCItems.oxygenGear, "XXX", "X X", "X X", 'X', WurmTweaksItems.ingotCyanSteel);
				r.addBasicMachineRecipe(new ItemStack(GCItems.oxTankLight, 1, 900), "packGlass", "packCloth", "packGemExquisite", TFCItems.platinumSheet);
				r.addShapeless(new ItemStack(GCItems.oxTankMedium, 1, 1800), new ItemStack(GCItems.oxTankLight, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GCItems.oxTankLight, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(GCItems.oxTankHeavy, 1, 2700), new ItemStack(GCItems.oxTankMedium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GCItems.oxTankMedium, 1, OreDictionary.WILDCARD_VALUE));
				r.addCrossWCenter(GCItems.sensorLens, TFCItems.redSteelSheet, "packGemExquisite", "packGlass");
				r.addShaped(GCItems.sensorGlasses, "XAX", 'X', GCItems.sensorLens, 'A', new ItemStack(TFCItems.redSteelHelmet, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(GCItems.sensorGlasses, "XAX", 'X', GCItems.sensorLens, 'A', new ItemStack(TFCItems.blueSteelHelmet, 1, OreDictionary.WILDCARD_VALUE));
				r.addCircle(new ItemStack(GCItems.canister, 2, 0), TFCItems.tinSheet);
				r.addCircle(new ItemStack(GCItems.canister, 2, 1), TFCItems.bronzeSheet);
				r.addBasicMachineRecipe(new ItemStack(GCItems.rocketEngine, 1, 0), WurmTweaksItems.itemRadiationShielding, WurmTweaksItems.ingotRainbowSteel, ExtraUtils.bedrockiumBlock, WurmTweaksItems.ingotEnergyReactor);
				r.addBasicMachineRecipe(new ItemStack(GCItems.rocketEngine, 1, 1), WurmTweaksItems.ingotEnergyReactor, ExtraUtils.bedrockium, "packGemBlock", WurmTweaksItems.itemSpaceModule);
				r.addShaped(new ItemStack(GCItems.partNoseCone, 1, 0), " X ", "XCX", "CBC", 'X', new ItemStack(GCItems.heavyPlatingTier1, 1, 0), 'C', WurmTweaksItems.itemSpaceModule, 'B', "packGemBlock");
				r.addShaped(new ItemStack(GCItems.partFins, 1, 0), "BSB", "XXX", "BSB", 'B', WurmTweaksBlocks.blockPlatinum, 'S', WurmTweaksItems.itemRadiationShielding, 'X', IC2Items.getItem("iridiumPlate"));
				r.addShaped(new ItemStack(GCItems.flagPole), "S", "S", "S", 'S', TFCItems.steelSheet);
				r.add2X(GCItems.canvas, "packCloth");
				r.addSimpleCirc(GCItems.canister, "packGlass", TFCItems.silverSheet);
				r.addSimpleCirc(GCItems.partBuggy, TFCItems.blackSteelSheet2x, "packGemExquisite");
				r.addShaped(new ItemStack(GCItems.partBuggy, 1, 1), "X  ", "XX ", "XX ", 'X', TFCItems.blackSteelSheet2x);
				r.addShaped(new ItemStack(GCItems.partBuggy, 1, 2), "CSC", "CSC", "CSC", 'C', "packChest", 'S', "packCloth");
				r.addShaped(new ItemStack(GCItems.basicItem, 2, 0), "SXS", "SCS", "SXS", 'S', new ItemStack(GCItems.basicItem, 1, 12), 'X', TFCItems.platinumSheet, 'C', WurmTweaksItems.itemSolarCore);
				r.addShaped(new ItemStack(GCItems.basicItem, 1, 1), "SRS", "SRS", "SRS", 'R', Items.redstone, 'S', new ItemStack(GCItems.basicItem, 1, 0));
				r.addShapeless(new ItemStack(GCItems.basicItem, 1, 19), TFCItems.bismuthBronzeSheet, Items.redstone, WurmTweaksItems.itemQuantumFoam);
				r.addShaped(new ItemStack(GCItems.battery, 1, 100), "SRS", "SXS", "SSS", 'S', TFCItems.tinSheet, 'R', "dustSulfur", 'X', TFCItems.leadSheet2x);
				r.addShaped9X9Recipe(new ItemStack(GCItems.infiniteBatery, 1, 0), " IIIIIII ", "IMMMMMMI ", "IBBBXBBBI", "IBBBXBBBI", "IBBBBXBBI", "IBBBXBBBI", "IMMMMMMI ", " IIIIIII ", 'I', new ItemStack(LudicrousItems.resource, 1, 6), 'M', WurmTweaksItems.ingotRainbowSteel, 'B', new ItemStack(GCItems.battery, 1, OreDictionary.WILDCARD_VALUE), 'X', WurmTweaksItems.creativeCreativePartsEnergy);
				r.addShaped9X9Recipe(new ItemStack(GCItems.oxygenCanisterInfinite, 1, 0), " IIIIIII ", "IMMMMMMI ", "IBBBXBBBI", "IBBBXBBBI", "IBBBBXBBI", "IBBBXBBBI", "IMMMMMMI ", " IIIIIII ", 'I', new ItemStack(LudicrousItems.resource, 1, 6), 'M', WurmTweaksItems.ingotRainbowSteel, 'B', new ItemStack(GCItems.oxTankHeavy, 1, OreDictionary.WILDCARD_VALUE), 'X', WurmTweaksItems.creativeCreativeParts);
				r.addWrenchRecipe(GCItems.wrench, "ingotAluminum");
				r.addShaped(GCItems.flag, "WWW", "WWW", "  P", 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'P', GCItems.flagPole);
				r.addShaped(new ItemStack(GCItems.parachute, 1, 0), "WWW", "S S", "LLL", 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'S', TFCItems.silkCloth, 'L', TFCItems.leather);
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 1), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(15));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 2), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(3));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 3), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(5));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 4), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(12));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 5), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(11));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 6), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(7));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 7), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(13));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 8), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(8));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 9), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(2));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 10), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(1));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 11), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(6));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 12), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(10));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 13), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(14));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 14), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(9));
				r.addShapeless(new ItemStack(GCItems.parachute, 1, 15), new ItemStack(GCItems.parachute, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(4));
				r.addShaped(new ItemStack(AsteroidBlocks.beamReceiver, 4), "SSS", "SXS", "SSS", 'S', WurmTweaksItems.gearMixedSheet, 'X', new ItemStack(AsteroidsItems.basicItem, 1, 8));
				r.addShaped(new ItemStack(AsteroidBlocks.beamReflector, 2), "ASA", "SXS", "ASA", 'S', WurmTweaksItems.gearMixedSheet, 'X', new ItemStack(AsteroidsItems.basicItem, 1, 8), 'A', TFCItems.silverSheet);
				r.addShaped(new ItemStack(AsteroidBlocks.shortRangeTelepad, 1, 0), "XAX", "ACA", "XAX", 'X', WurmTweaksItems.itemQuantumSingularity, 'A', Items.ender_pearl, 'C', "packGemBlock");
				r.addCrossWCenter(AsteroidBlocks.blockMinerBase, WurmTweaksItems.ingotTitanium, WurmTweaksItems.ingotFrancium, "packGemBlock");
				r.addBasicMachineRecipe(new ItemStack(MarsBlocks.machine, 1, 4), WurmTweaksItems.ingotHalfium, "packCloth", WurmTweaksItems.itemUnstableMatter, Blocks.bed);
				r.addCircleWCenter(new ItemStack(MarsBlocks.machine, 1, 8), WurmTweaksBlocks.blockCompressedRedstone, new ItemStack(RailcraftBlocks.getBlockMachineAlpha(), 1, 0));
				r.addCrossWCenter(new ItemStack(MarsBlocks.machineT2, 1, 0), WurmTweaksItems.ingotTitanium, TFCItems.redSteelBucketWater, WurmTweaksItems.itemSpaceModule);
				r.addCrossWCenter(new ItemStack(MarsBlocks.machineT2, 1, 4), WurmTweaksItems.ingotTitanium, "dustCoal", WurmTweaksItems.itemSpaceModule);
				r.addCrossWCenter(new ItemStack(MarsBlocks.machineT2, 1, 8), WurmTweaksItems.ingotTitanium, TFCItems.redSteelSheet, WurmTweaksItems.itemSpaceModule);
				r.addShaped(new ItemStack(MarsBlocks.hydrogenPipe, 8), "GGG", "CCC", "GGG", 'G', Blocks.glass_pane, 'C', TFCItems.clayBall);
				r.addShapeless(AsteroidsItems.grapple, "packCloth", TFCItems.bow, Items.string);
				r.addArmorRecipes(new ItemStack(AsteroidsItems.thermalPadding, 1, 0), new ItemStack(AsteroidsItems.thermalPadding, 1, 1), new ItemStack(AsteroidsItems.thermalPadding, 1, 2), new ItemStack(AsteroidsItems.thermalPadding, 1, 3), new ItemStack(AsteroidsItems.basicItem, 1, 7));
				r.addBasicMachineRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 0), WurmTweaksBlocks.blockPlatinum, new ItemStack(MarsItems.marsItemBasic, 1, 3), IC2Items.getItem("iridiumPlate"), WurmTweaksItems.itemMixedSheet);
				r.addBasicMachineRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 1), new ItemStack(AsteroidsItems.basicItem, 1, 0), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotRainbowSteel, GCItems.rocketEngine);
				r.addCross(new ItemStack(AsteroidsItems.basicItem, 1, 7), "packCloth", WurmTweaksItems.ingotHalfium);
				r.addCrossWCenter(new ItemStack(AsteroidsItems.basicItem, 1, 8), WurmTweaksItems.itemQuantumCore, WurmTweaksItems.itemMixedSheet, "dyeRed");
				r.addShaped(new ItemStack(AsteroidsItems.heavyNoseCone, 1, 0), " X ", "XBX", "CAC", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 0), 'B', GCItems.partNoseCone, 'C', WurmTweaksItems.itemRadiationShielding, 'A', WurmTweaksBlocks.blockRedSteel);
				r.addBasicMachineRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 2), new ItemStack(AsteroidsItems.basicItem, 1, 0), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotRainbowSteel, GCItems.partFins);
				r.addArmorRecipes(AsteroidsItems.titaniumHelmet, AsteroidsItems.titaniumChestplate, AsteroidsItems.titaniumLeggings, AsteroidsItems.titaniumBoots, WurmTweaksItems.ingotTitanium);
				ArmorHandler.addArmorProtection(AsteroidsItems.titaniumHelmet, 3000, 3500, 2500);
				ArmorHandler.addArmorProtection(AsteroidsItems.titaniumChestplate, 3000, 3500, 2500);
				ArmorHandler.addArmorProtection(AsteroidsItems.titaniumLeggings, 3000, 3500, 2500);
				ArmorHandler.addArmorProtection(AsteroidsItems.titaniumBoots, 3000, 3500, 2500);
				addCompressorRecipes();
				addFabricatorRecipes();
		}

		private static void addCompressorRecipes () {
				CompressorRecipes.getRecipeList().clear();
				for (ItemStack gem : OreDictionary.getOres("packGemExquisite")) {
						CompressorRecipes.addRecipe(new ItemStack(GCItems.heavyPlatingTier1, 1, 0), "SSS", "BBB", "CCC", 'S', WurmTweaksItems.ingotYellowSteel, 'B', WurmTweaksItems.itemRadiationShielding, 'C', gem);
						CompressorRecipes.addRecipe(new ItemStack(MarsItems.marsItemBasic, 1, 3), "SSS", "BBB", "CCC", 'S', new ItemStack(GCItems.heavyPlatingTier1, 1, 0), 'B', WurmTweaksItems.itemRadiationShielding, 'C', gem);
				}
		}

		private static void addFabricatorRecipes () {
				CircuitFabricatorRecipes.addRecipe(new ItemStack(GCItems.basicItem, 4, 12), new ItemStack[] {WurmTweaksItems.itemCraftingCore, new ItemStack(TFCItems.platinumSheet), new ItemStack(TFCItems.platinumSheet), new ItemStack(Items.redstone), new ItemStack(Blocks.redstone_torch)});
				CircuitFabricatorRecipes.addRecipe(new ItemStack(GCItems.basicItem, 1, 13), new ItemStack[] {WurmTweaksItems.itemCraftingCore, new ItemStack(TFCItems.platinumSheet), new ItemStack(TFCItems.platinumSheet), new ItemStack(Items.redstone), new ItemStack(TFCItems.blackSteelSheet)});
				CircuitFabricatorRecipes.addRecipe(new ItemStack(GCItems.basicItem, 1, 14), new ItemStack[] {WurmTweaksItems.itemCraftingCore, new ItemStack(TFCItems.platinumSheet), new ItemStack(TFCItems.platinumSheet), new ItemStack(Items.redstone), new ItemStack(GCItems.basicItem, 1, 13)});
		}
}

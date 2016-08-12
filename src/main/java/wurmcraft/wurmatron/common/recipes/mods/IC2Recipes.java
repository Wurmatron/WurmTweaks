package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermaldynamics.duct.TDDucts;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.ic2.ICHelper;

public class IC2Recipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "IC2")
		public static void addRecipes () {
				r.addCircleWCenter(new ItemStack(IC2Items.getItem("reinforcedStone").getItem(), 8), "packSmoothStone", IC2Items.getItem("advancedAlloy"));
				r.addCircleWCenter(new ItemStack(IC2Items.getItem("reinforcedGlass").getItem(), 8), "packGlass", IC2Items.getItem("advancedAlloy"));
				r.addShaped(new ItemStack(IC2Items.getItem("scaffold").getItem(), 16, 0), "PPP", " S ", "S S", 'P', "packPlanks", 'S', "packStick");
				r.addShaped(new ItemStack(IC2Items.getItem("ironScaffold").getItem(), 16, 0), "III", " S ", "S S", 'I', TFCItems.wroughtIronIngot, 'S', "packStick");
				r.addBasicMachineRecipe(IC2Items.getItem("WindKineticGenerator"), IC2Items.getItem("carbonPlate"), WurmTweaksItems.ingotGreenSteel, TFCItems.platinumSheet, IC2Items.getItem("generator"));
				r.addBasicMachineRecipe(IC2Items.getItem("generator"), TFCItems.blueSteelSheet, new ItemStack(IC2Items.getItem("reBattery").getItem(), 1, OreDictionary.WILDCARD_VALUE), Blocks.coal_block, WurmTweaksItems.itemMachineFrame);
				r.addCrossWCenter(new ItemStack(IC2Items.getItem("generator").getItem(), 1, 1), TFCItems.redSteelSheet2x, TFCItems.blackSteelSheet2x, new ItemStack(IC2Items.getItem("generator").getItem(), 1, 0));
				r.addCrossWCenter(new ItemStack(IC2Items.getItem("generator").getItem(), 2, 2), "packPlanks", "packStick", new ItemStack(IC2Items.getItem("generator").getItem(), 1, 0));
				r.addBasicMachineRecipe(new ItemStack(IC2Items.getItem("generator").getItem(), 1, 3), "packGlass", TFCItems.wroughtIronSheet, TFCItems.platinumSheet2x, WurmTweaksItems.itemSolarCore);
				r.addCrossWCenter(new ItemStack(IC2Items.getItem("generator").getItem(), 2, 4), "packPlanks", IC2Items.getItem("carbonPlate"), new ItemStack(IC2Items.getItem("generator").getItem(), 1, 0));
				r.addCrossWCenter(new ItemStack(IC2Items.getItem("generator").getItem(), 1, 5), WurmTweaksItems.itemRadiationShielding, "packGemExquisitePure", new ItemStack(IC2Items.getItem("generator").getItem(), 1, 0));
				r.addShaped(IC2Items.getItem("semifluidGenerator"), "IFI", "FGF", "IFI", 'I', new ItemStack(TFCItems.wroughtIronSheet2x), 'F', IC2Items.getItem("FluidCell"), 'G', IC2Items.getItem("geothermalGenerator"));
				r.addShaped(IC2Items.getItem("stirlingGenerator"), "IFI", "IGI", "III", 'I', new ItemStack(TFCItems.wroughtIronSheet2x), 'F', IC2Items.getItem("heatconductor"), 'G', IC2Items.getItem("generator"));
				r.addShaped(IC2Items.getItem("kineticGenerator"), "III", "GMS", "III", 'I', new ItemStack(TFCItems.wroughtIronSheet2x), 'M', IC2Items.getItem("elemotor"), 'G', IC2Items.getItem("generator"), 'S', TFCItems.steelSheet2x);
				r.addBasicMachineRecipe(IC2Items.getItem("reactorFluidPort"), TFCItems.leadSheet2x, new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 1, 2), Blocks.piston, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(IC2Items.getItem("reactorAccessHatch"), TFCItems.leadSheet2x, WurmTweaksItems.itemRadiationShielding, "packChest", WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(IC2Items.getItem("reactorRedstonePort"), TFCItems.leadSheet2x, WurmTweaksItems.itemRadiationShielding, Items.redstone, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(IC2Items.getItem("reactorvessel"), TFCItems.leadSheet2x, WurmTweaksItems.itemRadiationShielding, TFCItems.roseGoldSheet, WurmTweaksItems.itemMachineFrame);
				r.addShaped(IC2Items.getItem("lvTransformer"), "WCW", "WOW", "WCW", 'W', "packPlanks", 'C', IC2Items.getItem("insulatedTinCableItem"), 'O', IC2Items.getItem("coil"));
				r.addShaped(IC2Items.getItem("mvTransformer"), "C", "M", "C", 'C', IC2Items.getItem("insulatedCopperCableItem"), 'M', IC2Items.getItem("advancedMachine"));
				r.addShaped(IC2Items.getItem("hvTransformer"), " C ", "EMB", " C ", 'C', IC2Items.getItem("doubleInsulatedGoldCableItem"), 'M', IC2Items.getItem("mvTransformer"), 'E', IC2Items.getItem("electronicCircuit"), 'B', IC2Items.getItem("advBattery"));
				r.addShaped(IC2Items.getItem("evTransformer"), " C ", "EMB", " C ", 'C', IC2Items.getItem("trippleInsulatedIronCableItem"), 'M', IC2Items.getItem("hvTransformer"), 'E', IC2Items.getItem("advancedCircuit"), 'B', new ItemStack(new ItemStack(IC2Items.getItem("lapotronCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE).getItem(), 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(IC2Items.getItem("batBox"), "WCW", "BBB", "WWW", 'W', "packPlanks", 'B', IC2Items.getItem("reBattery"), 'C', IC2Items.getItem("insulatedTinCableItem"));
				r.addShaped(IC2Items.getItem("cesuUnit"), "PCP", "BBB", "PPP", 'P', new ItemStack(TFCItems.bronzeSheet), 'B', IC2Items.getItem("advBattery"), 'C', IC2Items.getItem("insulatedCopperCableItem"));
				r.addShaped(IC2Items.getItem("mfeUnit"), "CBC", "BMB", "CBC", 'C', IC2Items.getItem("doubleInsulatedGoldCableItem"), 'B', new ItemStack(new ItemStack(IC2Items.getItem("energyCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE).getItem(), 1, OreDictionary.WILDCARD_VALUE), 'M', IC2Items.getItem("advancedMachine"));
				r.addShaped(IC2Items.getItem("mfsUnit"), "BAB", "BMB", "BAB", 'A', new ItemStack(TFCItems.redSteelSheet2x), 'B', new ItemStack(IC2Items.getItem("lapotronCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'M', IC2Items.getItem("mfeUnit"));
				r.addShaped(IC2Items.getItem("ChargepadbatBox"), "CPC", "IBI", 'I', new ItemStack(TFCItems.wroughtIronSheet), 'P', "packIngot", 'C', IC2Items.getItem("insulatedTinCableItem"), 'B', IC2Items.getItem("batBox"));
				r.addShaped(IC2Items.getItem("ChargepadcesuUnit"), "CPC", "IBI", 'I', new ItemStack(TFCItems.blackBronzeSheet), 'P', "packIngot", 'C', IC2Items.getItem("insulatedCopperCableItem"), 'B', IC2Items.getItem("cesuUnit"));
				r.addShaped(IC2Items.getItem("ChargepadmfeUnit"), "CPC", "IBI", 'I', new ItemStack(TFCItems.steelSheet), 'P', "packIngot", 'C', IC2Items.getItem("doubleInsulatedGoldCableItem"), 'B', IC2Items.getItem("mfeUnit"));
				r.addShaped(IC2Items.getItem("ChargepadmfsUnit"), "CPC", "IBI", 'I', new ItemStack(TFCItems.redSteelSheet), 'P', "packIngot", 'C', IC2Items.getItem("glassFiberCableItem"), 'B', IC2Items.getItem("mfsUnit"));
				r.addShaped(IC2Items.getItem("machine"), "III", "ICI", "III", 'I', new ItemStack(TFCItems.steelSheet2x), 'C', WurmTweaksItems.itemMachineFrame);
				r.addShaped(IC2Items.getItem("ironFurnace"), "III", "I I", "IFI", 'I', new ItemStack(TFCItems.wroughtIronSheet2x), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(IC2Items.getItem("electroFurnace"), "III", "ICI", "EFE", 'I', new ItemStack(TFCItems.steelSheet2x), 'C', WurmTweaksItems.itemMachineFrame, 'F', new ItemStack(Blocks.furnace), 'E', IC2Items.getItem("reBattery"));
				r.addShaped(IC2Items.getItem("macerator"), "GLG", "CBC", "RRR", 'G', "packGemExquisitePure", 'L', IC2Items.getItem("powerunit"), 'C', IC2Items.getItem("advancedCircuit"), 'B', WurmTweaksItems.itemMachineFrame, 'R', new ItemStack(TFCItems.redSteelSheet));
				r.addShaped(IC2Items.getItem("extractor"), "GLG", "CBC", "RRR", 'G', IC2Items.getItem("treetap"), 'L', IC2Items.getItem("powerunit"), 'C', IC2Items.getItem("advancedCircuit"), 'B', IC2Items.getItem("machine"), 'R', new ItemStack(TFCItems.redSteelSheet));
				r.addShaped(IC2Items.getItem("compressor"), "GLG", "CBC", "RRR", 'G', new ItemStack(TFCItems.leadSheet), 'L', IC2Items.getItem("powerunit"), 'C', IC2Items.getItem("advancedCircuit"), 'B', IC2Items.getItem("machine"), 'R', new ItemStack(TFCItems.redSteelSheet));
				r.addShaped(IC2Items.getItem("canner"), "TUT", "TBT", "TTT", 'T', new ItemStack(TFCItems.tinSheet), 'U', IC2Items.getItem("powerunit"), 'B', IC2Items.getItem("machine"));
				r.addShaped(IC2Items.getItem("magnetizer"), "RCR", "RBR", "RCR", 'R', new ItemStack(Blocks.redstone_block), 'C', IC2Items.getItem("advancedCircuit"), 'B', IC2Items.getItem("machine"), 'C', new ItemStack(TFCItems.copperSheet2x));
				r.addShaped(IC2Items.getItem("electrolyzer"), "C C", "CEC", "SSS", 'S', new ItemStack(TFCItems.silverSheet), 'E', IC2Items.getItem("advancedCircuit"), 'B', IC2Items.getItem("magnetizer"), 'C', IC2Items.getItem("doubleInsulatedGoldCableItem"));
				r.addShaped(IC2Items.getItem("recycler"), "SSS", "CBC", "SSS", 'S', new ItemStack(TFCItems.blackBronzeSheet2x), 'C', IC2Items.getItem("compressor"), 'B', IC2Items.getItem("advancedMachine"));
				r.addCrossWCenter(IC2Items.getItem("advancedMachine"), IC2Items.getItem("advancedAlloy"), IC2Items.getItem("carbonPlate"), IC2Items.getItem("machine"));
				r.addShaped(IC2Items.getItem("inductionFurnace"), "CCC", "CFC", "CBC", 'F', IC2Items.getItem("electroFurnace"), 'B', IC2Items.getItem("advancedMachine"), 'C', new ItemStack(TFCItems.blackBronzeSheet2x));
				r.addShaped(IC2Items.getItem("teleporter"), "CTC", "GBG", "CSC", 'C', IC2Items.getItem("advancedCircuit"), 'B', IC2Items.getItem("advancedMachine"), 'S', new ItemStack(TFCItems.blueSteelSheet2x), 'G', "packGemExquisitePure", 'T', IC2Items.getItem("frequencyTransmitter"));
				r.addShaped(IC2Items.getItem("teslaCoil"), "RRR", "CBC", "SGS", 'C', IC2Items.getItem("advancedCircuit"), 'B', IC2Items.getItem("hvTransformer"), 'S', new ItemStack(TFCItems.goldSheet2x), 'R', new ItemStack(Blocks.redstone_block), 'G', "packGemBlock");
				r.addShaped(IC2Items.getItem("metalformer"), " C ", "HBH", "SSS", 'C', WurmTweaksItems.ingotGraySteel, 'H', IC2Items.getItem("toolbox"), 'B', IC2Items.getItem("machine"), 'S', new ItemStack(TFCItems.steelSheet));
				r.addShaped(IC2Items.getItem("patternstorage"), "GGG", "MGM", "LBL", 'B', IC2Items.getItem("reinforcedStone"), 'M', IC2Items.getItem("crystalmemory"), 'G', IC2Items.getItem("reinforcedGlass"), 'L', IC2Items.getItem("miningLaser"), 'B', IC2Items.getItem("advancedMachine"), 'G', "packGemExquisitePure");
				r.addShaped(IC2Items.getItem("scanner"), "SGS", "MLM", "CBC", 'M', IC2Items.getItem("elemotor"), 'C', IC2Items.getItem("advancedCircuit"), 'G', IC2Items.getItem("reinforcedGlass"), 'S', new ItemStack(TFCItems.blueSteelSheet2x), 'B', IC2Items.getItem("advancedMachine"), 'L', IC2Items.getItem("miningLaser"));
				r.addShaped(IC2Items.getItem("replicator"), "GBG", "TTT", "VMV", 'G', "v", 'B', "packGemBlock", 'T', IC2Items.getItem("teleporter"), 'V', IC2Items.getItem("evTransformer"), 'M', IC2Items.getItem("advancedMachine"));
				r.addShaped(IC2Items.getItem("solidcanner"), "TUT", "TBT", "TTT", 'T', new ItemStack(TFCItems.tinSheet), 'U', IC2Items.getItem("powerunit"), 'B', IC2Items.getItem("canner"));
				r.addShaped(IC2Items.getItem("fluidbottler"), "GTG", "GTG", "CBC", 'G', "packGem", 'T', IC2Items.getItem("cell"), 'C', IC2Items.getItem("electronicCircuit"), 'B', IC2Items.getItem("machine"));
				r.addShaped(IC2Items.getItem("personalSafe"), "GCG", "IBI", " S ", 'G', "packChippedGem", 'C', IC2Items.getItem("electronicCircuit"), 'B', WurmTweaksBlocks.blockWroughtIron, 'S', "packChest");
				r.addShaped(IC2Items.getItem("nuke"), "RIR", "RBR", "RIR", 'R', IC2Items.getItem("reactorReflectorThick"), 'B', "packGemBlock", 'I', new ItemStack(TFCItems.redSteelSheet2x));
				r.addShaped(IC2Items.getItem("coil"), "CCC", "CIC", "CCC", 'C', IC2Items.getItem("copperCableItem"), 'I', new ItemStack(TFCItems.steelIngot));
				r.addShaped(IC2Items.getItem("elemotor"), " G ", "CIC", " G ", 'C', IC2Items.getItem("coil"), 'I', new ItemStack(TFCItems.blackSteelIngot), 'G', "packGemExquisitePure");
				r.addShaped(IC2Items.getItem("powerunit"), "BCP", "BEM", "BCP", 'B', IC2Items.getItem("reBattery"), 'C', IC2Items.getItem("insulatedCopperCableItem"), 'P', new ItemStack(TFCItems.steelSheet), 'E', IC2Items.getItem("advancedCircuit"), 'M', IC2Items.getItem("elemotor"));
				r.addShaped(IC2Items.getItem("powerunitsmall"), " CP", "BEM", " CP", 'B', IC2Items.getItem("reBattery"), 'C', IC2Items.getItem("insulatedCopperCableItem"), 'P', new ItemStack(TFCItems.steelSheet), 'E', IC2Items.getItem("advancedCircuit"), 'M', IC2Items.getItem("elemotor"));
				r.addShaped(IC2Items.getItem("rawcrystalmemory"), "EOE", "OEO", "EOE", 'E', IC2Items.getItem("energiumDust"), 'O', "packIngot");
				r.addShaped(IC2Items.getItem("rawcrystalmemory"), "OEO", "EOE", "OEO", 'E', IC2Items.getItem("energiumDust"), 'O', "packIngot");
				r.addShaped(IC2Items.getItem("heatconductor"), "RPR", "RPR", "RPR", 'R', "packRubber", 'P', new ItemStack(TFCItems.copperSheet2x));
				r.addShaped(IC2Items.getItem("woodrotor"), "WWW", "WPW", "WWW", 'W', "packPlanks", 'P', "packLog");
				r.addShaped(IC2Items.getItem("ironrotor"), "PIP", "PIP", "PIP", 'P', new ItemStack(TFCItems.wroughtIronSheet), 'I', new ItemStack(TFCItems.wroughtIronIngot));
				r.addShaped(IC2Items.getItem("carbonrotor"), "PIP", "PIP", "PIP", 'P', IC2Items.getItem("carbonPlate"), 'I', IC2Items.getItem("carbonMesh"));
				r.addShaped(IC2Items.getItem("steelrotor"), "PIP", "PIP", "PIP", 'P', new ItemStack(TFCItems.steelSheet), 'I', new ItemStack(TFCItems.steelIngot));
				r.addShaped(IC2Items.getItem("mixedMetalIngot"), "I", "T", "B", 'I', new ItemStack(TFCItems.wroughtIronSheet), 'T', new ItemStack(TFCItems.tinSheet), 'B', new ItemStack(TFCItems.bronzeSheet));
				r.addShaped(new ItemStack(IC2Items.getItem("electronicCircuit").getItem(), 1), "CCC", "RPR", "CCC", 'C', IC2Items.getItem("insulatedCopperCableItem"), 'P', new ItemStack(TFCItems.wroughtIronSheet), 'R', WurmTweaksItems.ingotPurpleSteel);
				r.addShaped(new ItemStack(IC2Items.getItem("electronicCircuit").getItem(), 1), "CRC", "CPC", "CRC", 'C', IC2Items.getItem("insulatedCopperCableItem"), 'P', new ItemStack(TFCItems.wroughtIronSheet), 'R', WurmTweaksItems.ingotPurpleSteel);
				r.addShaped(new ItemStack(IC2Items.getItem("advancedCircuit").getItem(), 1), "CPC", "CRC", "CPC", 'C', IC2Items.getItem("glassFiberCableItem"), 'P', new ItemStack(TFCItems.blueSteelSheet2x), 'R', WurmTweaksItems.ingotPurpleSteel);
				r.addShaped(new ItemStack(IC2Items.getItem("advancedCircuit").getItem(), 1), "CCC", "PRP", "CCC", 'C', IC2Items.getItem("glassFiberCableItem"), 'P', new ItemStack(TFCItems.blueSteelSheet2x), 'R', WurmTweaksItems.ingotPurpleSteel);
				r.addShaped(IC2Items.getItem("treetap"), " W ", "WWW", "W  ", 'W', "packPlanks");
				r.addWrenchRecipe(IC2Items.getItem("wrench"), TFCItems.bronzeIngot);
				r.addShaped(IC2Items.getItem("cutter"), "P P", " P ", "I I", 'P', new ItemStack(TFCItems.wroughtIronSheet), 'I', new ItemStack(TFCItems.wroughtIronIngot));
				r.addShaped(IC2Items.getItem("constructionFoamSprayer"), "P  ", " P ", " CP", 'P', new ItemStack(TFCItems.blueSteelSheet2x), 'C', IC2Items.getItem("cell"));
				r.addShaped(new ItemStack(IC2Items.getItem("energiumDust").getItem(), 5, 2), "GSX", 'G', Items.glowstone_dust, 'S', TFCItems.platinumIngot, 'X', Items.redstone);
				r.addShaped(IC2Items.getItem("toolbox"), "BCB", "BBB", 'C', "packChest", 'B', new ItemStack(TFCItems.bronzeSheet));
				r.addShaped(IC2Items.getItem("miningLaser"), "RRL", "AAM", " PP", 'R', new ItemStack(Blocks.redstone_block), 'L', new ItemStack(IC2Items.getItem("lapotronCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'A', IC2Items.getItem("advancedAlloy"), 'M', IC2Items.getItem("mfsUnit"), 'P', new ItemStack(TFCItems.redSteelSheet2x));
				r.addShaped(IC2Items.getItem("ecMeter"), "CGC", "PCP", "P P", 'C', new ItemStack(TFCItems.copperSheet), 'G', new ItemStack(Blocks.glowstone), 'C', IC2Items.getItem("advancedCircuit"), 'P', new ItemStack(TFCItems.silverSheet));
				r.addShaped(IC2Items.getItem("hazmatHelmet"), " O ", "RGR", "RGR", 'O', "dyeOrange", 'G', "packGlass", 'R', "packRubber");
				r.addShaped(IC2Items.getItem("hazmatChestplate"), "R R", "ROR", "ROR", 'O', "dyeOrange", 'R', "packRubber");
				r.addShaped(IC2Items.getItem("hazmatLeggings"), "R R", "ROR", "R R", 'O', "dyeOrange", 'R', "packRubber");
				r.addShaped(IC2Items.getItem("hazmatBoots"), "R R", "ROR", "RBR", 'O', "dyeOrange", 'R', "packRubber", 'B', IC2Items.getItem("staticBoots"));
				r.addShaped(new ItemStack(IC2Items.getItem("nanoHelmet").getItem(), 1, 27), "CGC", "CNC", " H ", 'C', IC2Items.getItem("carbonPlate"), 'G', new ItemStack(IC2Items.getItem("energyCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'N', new ItemStack(IC2Items.getItem("nightvisionGoggles").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'H', new ItemStack(TFCItems.redSteelHelmet));
				r.addShaped(new ItemStack(IC2Items.getItem("nanoBodyarmor").getItem(), 1, 27), "CGC", "CHC", "CCC", 'C', IC2Items.getItem("carbonPlate"), 'G', new ItemStack(IC2Items.getItem("energyCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'H', new ItemStack(TFCItems.redSteelChestplate));
				r.addShaped(new ItemStack(IC2Items.getItem("nanoLeggings").getItem(), 1, 27), "CGC", "CHC", "C C", 'C', IC2Items.getItem("carbonPlate"), 'G', new ItemStack(IC2Items.getItem("energyCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'H', new ItemStack(TFCItems.redSteelGreaves));
				r.addShaped(new ItemStack(IC2Items.getItem("nanoBoots").getItem(), 1, 27), "CGC", "CHC", " S ", 'C', IC2Items.getItem("carbonPlate"), 'G', new ItemStack(IC2Items.getItem("energyCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'H', new ItemStack(TFCItems.redSteelBoots), 'S', IC2Items.getItem("staticBoots"));
				r.addShaped(new ItemStack(IC2Items.getItem("quantumHelmet").getItem(), 1, 27), "GNG", "IQI", "CSC", 'G', "packGlass", 'N', IC2Items.getItem("nanoHelmet"), 'I', IC2Items.getItem("iridiumPlate"), 'C', IC2Items.getItem("advancedMachine"), 'S', new ItemStack(TFCItems.blueSteelSheet2x), 'Q', WurmTweaksItems.itemQuantumSingularity);
				r.addShaped(new ItemStack(IC2Items.getItem("quantumBodyarmor").getItem(), 1, 27), "GNG", "IQI", "ISI", 'G', IC2Items.getItem("carbonPlate"), 'N', new ItemStack(IC2Items.getItem("nanoBodyarmor").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'I', IC2Items.getItem("iridiumPlate"), 'C', IC2Items.getItem("advancedMachine"), 'S', new ItemStack(TFCItems.blueSteelSheet2x), 'Q', WurmTweaksItems.itemQuantumSingularity);
				r.addShaped(new ItemStack(IC2Items.getItem("quantumLeggings").getItem(), 1, 27), "GNG", "IQI", "CSC", 'G', IC2Items.getItem("carbonPlate"), 'N', new ItemStack(IC2Items.getItem("nanoLeggings").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'I', IC2Items.getItem("iridiumPlate"), 'C', IC2Items.getItem("advancedMachine"), 'S', new ItemStack(TFCItems.blueSteelSheet2x), 'Q', WurmTweaksItems.itemQuantumSingularity);
				r.addShaped(new ItemStack(IC2Items.getItem("quantumBoots").getItem(), 1, 27), "GNG", "IQI", "CSC", 'G', IC2Items.getItem("carbonPlate"), 'N', new ItemStack(IC2Items.getItem("nanoBoots").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'I', IC2Items.getItem("iridiumPlate"), 'C', IC2Items.getItem("advancedMachine"), 'S', new ItemStack(TFCItems.blueSteelSheet2x), 'Q', WurmTweaksItems.itemQuantumSingularity);
				r.addShaped(new ItemStack(IC2Items.getItem("jetpack").getItem(), 1, 27), "SCS", "SBS", "R R", 'S', new ItemStack(TFCItems.steelSheet), 'C', IC2Items.getItem("electronicCircuit"), 'B', IC2Items.getItem("cell"), 'R', new ItemStack(Blocks.redstone_block));
				r.addShaped(new ItemStack(IC2Items.getItem("electricJetpack").getItem(), 1, 27), "SCS", "SBS", "R R", 'S', new ItemStack(TFCItems.steelSheet2x), 'C', IC2Items.getItem("advancedCircuit"), 'B', new ItemStack(IC2Items.getItem("energyCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'R', new ItemStack(Blocks.redstone_block));
				r.addShaped(new ItemStack(IC2Items.getItem("batPack").getItem(), 1, 27), "RCR", "RSR", "R R", 'R', new ItemStack(IC2Items.getItem("reBattery").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'C', IC2Items.getItem("electronicCircuit"), 'S', new ItemStack(TFCItems.brassSheet));
				r.addShaped(new ItemStack(IC2Items.getItem("advbatPack").getItem(), 1, 27), "RCR", "RSR", "R R", 'R', new ItemStack(IC2Items.getItem("advBattery").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'C', IC2Items.getItem("advancedCircuit"), 'S', new ItemStack(TFCItems.bronzeSheet));
				r.addShaped(new ItemStack(IC2Items.getItem("energyPack").getItem(), 1, 27), "RCR", "RSR", "R R", 'R', new ItemStack(IC2Items.getItem("energyCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'C', IC2Items.getItem("advancedCircuit"), 'S', new ItemStack(TFCItems.blackSteelSheet));
				r.addShaped(IC2Items.getItem("cfPack"), "SAS", "CDC", "C C", 'D', new ItemStack(TFCItems.wroughtIronSheet), 'S', IC2Items.getItem("constructionFoamSprayer"), 'A', IC2Items.getItem("advancedCircuit"), 'C', IC2Items.getItem("cell"));
				r.addShaped(IC2Items.getItem("solarHelmet"), "ISI", "IHI", 'S', IC2Items.getItem("solarPanel"), 'H', new ItemStack(TFCItems.steelHelmet), 'I', new ItemStack(TFCItems.steelIngot));
				r.addShaped(IC2Items.getItem("staticBoots"), "I I", "I I", "WBW", 'I', new ItemStack(TFCItems.goldIngot), 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'B', new ItemStack(TFCItems.bronzeBoots));
				r.addShaped(IC2Items.getItem("nightvisionGoggles"), "SCS", "LGL", "BCB", 'S', new ItemStack(TFCItems.goldSheet2x), 'C', new ItemStack(IC2Items.getItem("energyCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'L', IC2Items.getItem("luminator"), 'G', "packGlass", 'B', new ItemStack(Blocks.redstone_block), 'C', IC2Items.getItem("advancedCircuit"));
				r.addShaped(IC2Items.getItem("reBattery"), " C ", "TRT", "TRT", 'C', IC2Items.getItem("insulatedTinCableItem"), 'R', new ItemStack(Items.redstone), 'T', new ItemStack(TFCItems.tinSheet));
				r.addShaped(IC2Items.getItem("advBattery"), "CTC", "TRT", "TRT", 'C', IC2Items.getItem("insulatedCopperCableItem"), 'R', "dustSulfur", 'T', new ItemStack(TFCItems.bronzeSheet));
				r.addShaped(new ItemStack(IC2Items.getItem("lapotronCrystal").getItem(), 1, 0), "LEL", "LCL", "LEL", 'L', "dyeBlue", 'E', new ItemStack(IC2Items.getItem("energyCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'C', IC2Items.getItem("advancedCircuit"));
				r.addShaped(new ItemStack(IC2Items.getItem("suBattery").getItem(), 4), "C", "R", "H", 'C', IC2Items.getItem("insulatedCopperCableItem"), 'R', new ItemStack(Items.redstone), 'H', "dustCoal");
				r.addShaped(new ItemStack(IC2Items.getItem("luminator").getItem(), 16), "GGG", "III", "LLL", 'G', "packGlass", 'I', new ItemStack(TFCItems.roseGoldIngot), 'L', new ItemStack(Items.glowstone_dust));
				r.addShaped(IC2Items.getItem("glassFiberCableItem"), "GGG", "EPE", "GGG", 'G', "packGlass", 'E', IC2Items.getItem("energiumDust"), 'P', new ItemStack(TFCItems.blackBronzeSheet));
				r.addShaped(IC2Items.getItem("detectorCableItem"), " R ", "RCR", " A ", 'R', new ItemStack(Items.redstone), 'C', IC2Items.getItem("trippleInsulatedIronCableItem"), 'A', IC2Items.getItem("advancedCircuit"));
				r.addShaped(IC2Items.getItem("splitterCableItem"), " L ", "RCR", " A ", 'R', new ItemStack(Items.redstone), 'C', IC2Items.getItem("trippleInsulatedIronCableItem"), 'A', IC2Items.getItem("advancedCircuit"), 'L', new ItemStack(Blocks.lever));
				r.addCircleWCenter(IC2Items.getItem("coalBall"), "dustCoal", new ItemStack(Items.flint));
				r.addCircleWCenter(IC2Items.getItem("coalChunk"), IC2Items.getItem("compressedCoalBall"), new ItemStack(Blocks.obsidian));
				r.add3X(IC2Items.getItem("scrapBox"), IC2Items.getItem("scrap"));
				r.addCircle(IC2Items.getItem("plantBall"), "packSapling");
				r.addShaped(IC2Items.getItem("painter"), " WW", " IW", "I  ", 'W', new ItemStack(Blocks.wool, 1, 0), 'I', new ItemStack(TFCItems.silverIngot));
				r.addShaped(IC2Items.getItem("overclockerUpgrade"), "WWW", "CAC", 'W', new ItemStack(TFCItems.redSteelBucketWater), 'C', IC2Items.getItem("doubleInsulatedGoldCableItem"), 'A', IC2Items.getItem("advancedCircuit"));
				r.addShaped(IC2Items.getItem("transformerUpgrade"), "GGG", "CTC", "GGG", 'G', "packPlanks", 'C', IC2Items.getItem("insulatedCopperCableItem"), 'T', IC2Items.getItem("hvTransformer"));
				r.addShaped(IC2Items.getItem("energyStorageUpgrade"), "PPP", "RCR", "PCP", 'P', "packPlanks", 'R', IC2Items.getItem("reBattery"), 'C', IC2Items.getItem("doubleInsulatedGoldCableItem"));
				r.addShaped(IC2Items.getItem("ejectorUpgrade"), "PHP", "CAC", 'P', Blocks.piston, 'H', new ItemStack(Blocks.hopper), 'C', IC2Items.getItem("doubleInsulatedGoldCableItem"), 'A', IC2Items.getItem("electronicCircuit"));
				r.addShaped(IC2Items.getItem("fluidEjectorUpgrade"), "PTP", "CAC", 'P', Blocks.piston, 'H', new ItemStack(TFCItems.silverSheet), 'C', IC2Items.getItem("doubleInsulatedGoldCableItem"), 'A', IC2Items.getItem("electronicCircuit"));
				r.addShaped(IC2Items.getItem("redstoneinvUpgrade"), "P P", " L ", "P P", 'P', new ItemStack(TFCItems.brassSheet), 'L', new ItemStack(Blocks.lever));
				r.addShaped(IC2Items.getItem("reinforcedDoor"), "BB", "BB", "BB", 'B', IC2Items.getItem("reinforcedStone"));
				r.addShaped(IC2Items.getItem("constructionFoamPowder"), "SBS", "SCS", "SBS", 'S', IC2Items.getItem("stoneDust"), 'C', new ItemStack(TFCItems.clayBall));
				r.addShaped(IC2Items.getItem("boatCarbon"), "W W", "WWW", 'W', IC2Items.getItem("carbonPlate"));
				r.addShaped(IC2Items.getItem("boatRubber"), "W W", "WWW", 'W', "packRubber");
				r.addShaped(IC2Items.getItem("boatElectric"), "WCW", "WWW", 'W', new ItemStack(TFCItems.wroughtIronIngot), 'C', IC2Items.getItem("electronicCircuit"));
				r.addShapeless(IC2Items.getItem("carbonMesh"), IC2Items.getItem("carbonFiber"), IC2Items.getItem("carbonFiber"));
				r.addShapeless(IC2Items.getItem("electricWrench"), IC2Items.getItem("advBattery"), IC2Items.getItem("wrench"), new ItemStack(TFCItems.redSteelSheet2x));
				r.addShapeless(IC2Items.getItem("electricTreetap"), IC2Items.getItem("advBattery"), IC2Items.getItem("treetap"), new ItemStack(TFCItems.redSteelSheet2x));
				r.addShapeless(IC2Items.getItem("electricHoe"), IC2Items.getItem("advBattery"), new ItemStack(TFCItems.blueSteelHoe), new ItemStack(TFCItems.redSteelSheet2x));
				r.addShapeless(IC2Items.getItem("frequencyTransmitter"), IC2Items.getItem("advancedCircuit"), IC2Items.getItem("insulatedCopperCableItem"), new ItemStack(TFCItems.bismuthBronzeSheet));
				r.addShapeless(IC2Items.getItem("insulatedCopperCableItem"), "packRubber", IC2Items.getItem("copperCableItem"));
				r.addShapeless(IC2Items.getItem("insulatedGoldCableItem"), "packRubber", IC2Items.getItem("goldCableItem"));
				r.addShapeless(IC2Items.getItem("doubleInsulatedGoldCableItem"), "packRubber", IC2Items.getItem("goldCableItem"), "itemRubber");
				r.addShapeless(IC2Items.getItem("insulatedIronCableItem"), "packRubber", IC2Items.getItem("ironCableItem"));
				r.addShapeless(IC2Items.getItem("doubleInsulatedIronCableItem"), "packRubber", "packRubber", IC2Items.getItem("ironCableItem"));
				r.addShapeless(IC2Items.getItem("trippleInsulatedIronCableItem"), "packRubber", "packRubber", "packRubber", IC2Items.getItem("ironCableItem"));
				r.addShapeless(IC2Items.getItem("insulatedTinCableItem"), "packRubber", IC2Items.getItem("tinCableItem"));
				r.addShapeless(IC2Items.getItem("copperCableItem"), TFCItems.copperIngot, new ItemStack(IC2Items.getItem("cutter").getItem(), 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(IC2Items.getItem("goldCableItem"), TFCItems.goldIngot, new ItemStack(IC2Items.getItem("cutter").getItem(), 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(IC2Items.getItem("tinCableItem"), TFCItems.tinIngot, new ItemStack(IC2Items.getItem("cutter").getItem(), 1, OreDictionary.WILDCARD_VALUE));
				r.add2X(IC2Items.getItem("carbonFiber"), "dustCoal");
				r.addShaped(IC2Items.getItem("FluidCell"), "GXG", "GXG", "GGG", 'G', "packGlass", 'X', TFCItems.clayBall);
				ICHelper.addCompressorRecipe(IC2Items.getItem("carbonMesh"), IC2Items.getItem("carbonPlate"));
				ICHelper.addCompressorRecipe(new ItemStack(IC2Items.getItem("energiumDust").getItem(), 9, 2), IC2Items.getItem("energyCrystal"));
				addExtrudingRecipes();
				addExtractor();
				addRolling();
				addCutting();
		}

		private static void addExtrudingRecipes () {
				ICHelper.addMetalFormerExtrudingRecipe(new ItemStack(TFCItems.tinIngot), new ItemStack(IC2Items.getItem("tinCableItem").getItem(), 4, 10));
				ICHelper.addMetalFormerExtrudingRecipe(new ItemStack(TFCItems.copperIngot), new ItemStack(IC2Items.getItem("copperCableItem").getItem(), 4, 1));
				ICHelper.addMetalFormerExtrudingRecipe(new ItemStack(TFCItems.goldIngot), new ItemStack(IC2Items.getItem("goldCableItem").getItem(), 4, 2));
				ICHelper.addMetalFormerExtrudingRecipe(new ItemStack(TFCItems.wroughtIronIngot), new ItemStack(IC2Items.getItem("ironCableItem").getItem(), 4, 5));
		}

		private static void addExtractor () {
				Recipes.extractor.getRecipes().clear();
				for (ItemStack sand : OreDictionary.getOres("packSand")) {
						if (!sand.isItemEqual(new ItemStack(Blocks.sand)))
								ICHelper.addExtractorRecipe(sand, new ItemStack(Blocks.sand));
				}
				for (ItemStack gravel : OreDictionary.getOres("packGravel")) {
						if (!gravel.isItemEqual(new ItemStack(Blocks.gravel)))
								ICHelper.addExtractorRecipe(gravel, new ItemStack(Blocks.gravel));
				}
				for (ItemStack dirt : OreDictionary.getOres("packDirt")) {
						if (!dirt.isItemEqual(new ItemStack(Blocks.dirt)))
								ICHelper.addExtractorRecipe(dirt, new ItemStack(Blocks.dirt));
				}
				for (ItemStack grass : OreDictionary.getOres("packGrass")) {
						if (!grass.isItemEqual(new ItemStack(Blocks.grass)))
								ICHelper.addExtractorRecipe(grass, new ItemStack(Blocks.grass));
				}
		}

		public static void addRolling () {
				ICHelper.addMetalFormerRollingRecipe(IC2Items.getItem("mixedMetalIngot"), IC2Items.getItem("advancedAlloy"));
				for (int i = 0; i < RecipeHelper.INGOTS.length; i++)
						ICHelper.addMetalFormerRollingRecipe(new ItemStack(RecipeHelper.INGOTS[i], 1), new ItemStack(RecipeHelper.SHEETS[i]));
		}

		public static void addCutting () {
				for (int i = 0; i < RecipeHelper.SHEETS.length; i++)
						ICHelper.addMetalFormerCuttingRecipe(new ItemStack(RecipeHelper.SHEETS[i], 2), new ItemStack(RecipeHelper.SHEETS2X[i]));
		}
}

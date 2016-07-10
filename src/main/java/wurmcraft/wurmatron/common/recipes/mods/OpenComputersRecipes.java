package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermalexpansion.item.TEItems;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.item.IC2Items;
import mods.railcraft.common.blocks.RailcraftBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.nbt.NBTOpenComputers;

public class OpenComputersRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "OpenComputers")
		public static void addRecipes () {
				r.addShaped(li.cil.oc.api.Items.get("accessPoint").createItemStack(1), "ICI", "ANA", "III", 'I', new ItemStack(TFCItems.blackSteelSheet), 'C', "oc:wlandCard", 'A', "oc:cable", 'N', "oc:lanCard");
				r.addShaped(li.cil.oc.api.Items.get("powerConverter").createItemStack(1), "ICI", "GMG", "ICI", 'I', new ItemStack(TFCItems.redSteelSheet), 'G', new ItemStack(TFCItems.blueSteelSheet), 'C', WurmTweaksItems.gearMixedSheet, 'M', ic2.api.item.IC2Items.getItem("mfsUnit"));
				r.addShaped(li.cil.oc.api.Items.get("redstoneCard2").createItemStack(1), "IXI", "BCB", "IAI", 'I', new ItemStack(TFCItems.roseGoldSheet), 'B', new ItemStack(Blocks.redstone_block), 'A', Blocks.lever, 'X', "oc:circuitChip3", 'C', li.cil.oc.api.Items.get("redstoneCard1").createItemStack(1));
				r.addShaped(li.cil.oc.api.Items.get("redstone").createItemStack(1), "IXI", "BCB", "IAI", 'I', new ItemStack(TFCItems.redSteelSheet), 'B', new ItemStack(Blocks.redstone_block), 'A', Blocks.lever, 'X', "oc:circuitChip3", 'C', li.cil.oc.api.Items.get("redstoneCard1").createItemStack(1));
				r.addShaped(li.cil.oc.api.Items.get("switch").createItemStack(1), "ICI", "CNC", "ICI", 'I', new ItemStack(TFCItems.blueSteelIngot), 'C', "oc:cable", 'N', "oc:lanCard");
				r.addShaped(li.cil.oc.api.Items.get("motionSensor").createItemStack(1), "GDG", "DCD", "GRG", 'G', new ItemStack(TFCItems.goldSheet), 'D', Blocks.daylight_detector, 'R', Items.redstone, 'C', "oc:cpu2");
				r.addShaped(li.cil.oc.api.Items.get("disassembler").createItemStack(1), "CGA", "P O", "IBI", 'C', "oc:materialALU", 'G', "packGlass", 'A', "oc:analyzer", 'P', Blocks.piston, 'O', Blocks.obsidian, 'I', TFCItems.platinumSheet, 'B', TFCItems.blueSteelBucketEmpty);
				r.addShaped(li.cil.oc.api.Items.get("assembler").createItemStack(1), "ICI", "PAP", "IPI", 'I', new ItemStack(TFCItems.blackSteelIngot), 'C', Blocks.crafting_table, 'P', Blocks.piston, 'A', "oc:circuitChip2");
				r.addShaped(li.cil.oc.api.Items.get("geolyzer").createItemStack(1), "ICI", "EAE", "IXI", 'I', new ItemStack(TFCItems.blackSteelSheet), 'E', Items.ender_eye, 'C', Items.compass, 'A', "oc:circuitChip2", 'X', Items.clock);
				r.addShaped(li.cil.oc.api.Items.get("hologram1").createItemStack(1), "EGE", "IXI", "OGO", 'I', new ItemStack(TFCItems.blackSteelSheet), 'E', "oc:circuitChip2", 'G', "packGlass", 'X', "packGemExquisite", 'O', Blocks.obsidian);
				r.addShaped(li.cil.oc.api.Items.get("hologram2").createItemStack(1), "EGE", "IXI", "OGO", 'I', new ItemStack(TFCItems.blackSteelSheet), 'E', "oc:circuitChip2", 'G', "packGlass", 'X', "oc:hologram1", 'O', Blocks.obsidian);
				r.addShaped(li.cil.oc.api.Items.get("keyboard").createItemStack(1), "BBB", "BAC", 'B', "oc:materialButtonGroup", 'A', "oc:materialArrowKey", 'C', "oc:materialNumPad");
				r.addShaped(li.cil.oc.api.Items.get("screen1").createItemStack(1), "IRI", "RXG", "IRI", 'I', TFCItems.blackSteelSheet, 'R', Items.redstone, 'G', "packGlass", 'X', "oc:circuitChip1");
				r.addShaped(li.cil.oc.api.Items.get("screen2").createItemStack(1), "IRI", "RXG", "IRI", 'I', TFCItems.blackSteelSheet, 'R', Items.redstone, 'G', "packGlass", 'X', "oc:screen1");
				r.addShaped(li.cil.oc.api.Items.get("screen2").createItemStack(1), "IRI", "RXG", "IRI", 'I', TFCItems.blackSteelSheet, 'R', Items.redstone, 'G', "packGlass", 'X', "oc:screen2");
				r.addShaped(li.cil.oc.api.Items.get("charger").createItemStack(1), "IGI", "CXC", "III", 'I', TFCItems.blackSteelSheet, 'G', TFCItems.goldSheet, 'C', "oc:capacitor", 'X', "oc:circuitChip2");
				r.addShaped(li.cil.oc.api.Items.get("case1").createItemStack(1), "ICI", "BGB", "IAI", 'I', TFCItems.platinumSheet, 'C', "oc:circuitChip1", 'B', Blocks.iron_bars, 'G', "packChest", 'A', TFCItems.goldSheet);
				r.addShaped(li.cil.oc.api.Items.get("case2").createItemStack(1), "ICI", "BGB", "IAI", 'I', TFCItems.platinumSheet, 'C', "oc:circuitChip1", 'B', Blocks.iron_bars, 'G', "oc:case1", 'A', TFCItems.goldSheet);
				r.addShaped(li.cil.oc.api.Items.get("case3").createItemStack(1), "ICI", "BGB", "IAI", 'I', TFCItems.platinumSheet, 'C', "oc:circuitChip1", 'B', Blocks.iron_bars, 'G', "oc:case2", 'A', TFCItems.goldSheet);
				r.addShaped(li.cil.oc.api.Items.get("adapter").createItemStack(1), "ICI", "IMI", "ICI", 'I', TFCItems.wroughtIronSheet, 'C', "oc:cable", 'M', "oc:circuitChip1");
				r.addShaped(li.cil.oc.api.Items.get("diskDrive").createItemStack(1), "IMI", "PS ", "IMI", 'I', TFCItems.wroughtIronSheet, 'M', "oc:circuitChip1", 'P', Blocks.piston, 'S', "packStick");
				r.addShaped(li.cil.oc.api.Items.get("capacitor").createItemStack(1), "ITI", "GBG", "ITI", 'I', TFCItems.wroughtIronSheet, 'T', "oc:materialTransistor", 'G', TFCItems.goldIngot, 'B', ic2.api.item.IC2Items.getItem("batBox"));
				r.addShaped(li.cil.oc.api.Items.get("powerDistributor").createItemStack(1), "IGI", "CMC", "IPI", 'I', TFCItems.blackSteelIngot, 'G', TFCItems.goldSheet, 'C', "oc:cable", 'M', "oc:circuitChip2", 'P', TFCItems.platinumSheet);
				r.addShaped(li.cil.oc.api.Items.get("raid").createItemStack(1), "ICI", "MRM", "III", 'I', TFCItems.blackSteelIngot, 'C', "oc:cpu2", 'M', "oc:ram1", 'R', "oc:diskDrive");
				r.addShaped(li.cil.oc.api.Items.get("printer").createItemStack(1), "IPI", "QCQ", "IPI", 'P', WurmTweaksItems.itemMachineFrame, 'I', Blocks.piston, 'Q', WurmTweaksItems.itemQuantumSingularity, 'C', "oc:cpu3");
				r.addShaped(li.cil.oc.api.Items.get("cable").createItemStack(8), " I ", "IRI", " I ", 'I', TFCItems.blackBronzeSheet, 'R', Items.redstone);
				r.addShaped(li.cil.oc.api.Items.get("hdd1").createItemStack(1), "MPI", "BPI", "MPI", 'M', "oc:circuitChip1", 'P', "oc:materialDisk", 'B', Blocks.piston, 'I', TFCItems.blackSteelSheet);
				r.addShaped(li.cil.oc.api.Items.get("hdd2").createItemStack(1), "MPI", "XPI", "MPI", 'M', "oc:circuitChip2", 'P', "oc:materialDisk", 'X', "oc:hdd1", 'B', Blocks.piston, 'I', TFCItems.blackSteelSheet);
				r.addShaped(li.cil.oc.api.Items.get("hdd3").createItemStack(1), "MPI", "XPI", "MPI", 'M', "oc:circuitChip3", 'P', "oc:materialDisk", 'X', "oc:hdd2", 'B', Blocks.piston, 'I', TFCItems.blackSteelSheet);
				r.addShaped(li.cil.oc.api.Items.get("cpu1").createItemStack(1), "IRI", "MUM", "IAI", 'I', WurmTweaksItems.itemComputationalCore, 'R', Items.redstone, 'M', "oc:circuitChip1", 'U', "oc:materialCU", 'A', "oc:materialALU");
				r.addShaped(li.cil.oc.api.Items.get("cpu2").createItemStack(1), "IRI", "MUM", "IAI", 'I', WurmTweaksItems.itemComputationalCore, 'R', "oc:cpu1", 'M', "oc:circuitChip2", 'U', "oc:materialCU", 'A', "oc:materialALU");
				r.addShaped(li.cil.oc.api.Items.get("cpu3").createItemStack(1), "IRI", "MUM", "IAI", 'I', WurmTweaksItems.itemComputationalCore, 'R', "oc:cpu2", 'M', "oc:circuitChip3", 'U', "oc:materialCU", 'A', "oc:materialALU");
				r.addShaped(li.cil.oc.api.Items.get("batteryUpgrade1").createItemStack(1), "IGI", "BCB", "IGI", 'I', TEItems.capacitorHardened, 'G', TFCItems.goldSheet, 'B', IC2Items.getItem("reBattery"), 'C', "oc:capacitor");
				r.addShaped(li.cil.oc.api.Items.get("batteryUpgrade2").createItemStack(1), "IGI", "BCB", "IGI", 'I', TEItems.capacitorReinforced, 'G', TFCItems.goldSheet, 'B', IC2Items.getItem("reBattery"), 'C', "oc:batteryUpgrade1");
				r.addShaped(li.cil.oc.api.Items.get("batteryUpgrade3").createItemStack(1), "IGI", "BCB", "IGI", 'I', TEItems.capacitorResonant, 'G', TFCItems.goldSheet, 'B', IC2Items.getItem("reBattery"), 'C', "oc:batteryUpgrade2");
				r.addShaped(li.cil.oc.api.Items.get("upgradeContainer1").createItemStack(1), "IMI", "PC ", "IMI", 'I', TFCItems.blackSteelIngot, 'M', "oc:circuitChip1", 'P', Blocks.piston, 'C', "packChest");
				r.addShaped(li.cil.oc.api.Items.get("upgradeContainer2").createItemStack(1), "IMI", "PC ", "IMI", 'I', TFCItems.blackSteelIngot, 'M', "oc:circuitChip2", 'P', Blocks.piston, 'C', "packChest");
				r.addShaped(li.cil.oc.api.Items.get("upgradeContainer3").createItemStack(1), "IMI", "PC ", "IMI", 'I', TFCItems.blackSteelIngot, 'M', "oc:circuitChip3", 'P', Blocks.piston, 'C', "packChest");
				r.addShaped(li.cil.oc.api.Items.get("cardContainer1").createItemStack(1), "IMI", "PC ", "IMI", 'I', TFCItems.blackSteelIngot, 'M', "oc:circuitChip1", 'P', Blocks.piston, 'C', "oc:materialCard");
				r.addShaped(li.cil.oc.api.Items.get("cardContainer2").createItemStack(1), "IMI", "PC ", "IMI", 'I', TFCItems.blackSteelIngot, 'M', "oc:circuitChip2", 'P', Blocks.piston, 'C', "oc:materialCard");
				r.addShaped(li.cil.oc.api.Items.get("cardContainer3").createItemStack(1), "IMI", "PC ", "IMI", 'I', TFCItems.blackSteelIngot, 'M', "oc:circuitChip3", 'P', Blocks.piston, 'C', "oc:materialCard");
				r.addShaped(li.cil.oc.api.Items.get("databaseUpgrade1").createItemStack(1), "IAI", "MDM", "III", 'I', TFCItems.bronzeSheet, 'A', "oc:analyzer", 'M', "oc:circuitChip1", 'D', "oc:hdd1");
				// TODO MicroChip Recipes
				r.addShaped(li.cil.oc.api.Items.get("databaseUpgrade2").createItemStack(1), "IAI", "MDM", "III", 'I', TFCItems.bronzeSheet, 'A', "oc:analyzer", 'M', "oc:circuitChip2", 'D', "oc:hdd2");
				r.addShaped(li.cil.oc.api.Items.get("databaseUpgrade3").createItemStack(1), "IAI", "MDM", "III", 'I', TFCItems.bronzeSheet, 'A', "oc:analyzer", 'M', "oc:circuitChip3", 'D', "oc:hdd3");
				r.addShaped(li.cil.oc.api.Items.get("server1").createItemStack(1), "OMO", "CXC", "OIO", 'O', Blocks.obsidian, 'I', TFCItems.steelSheet, 'C', "oc:circuitChip1", 'X', "oc:circuitChip2", 'M', "oc:ram4");
				r.addShaped(li.cil.oc.api.Items.get("server2").createItemStack(1), "OMO", "CXC", "OIO", 'O', Blocks.obsidian, 'I', TFCItems.steelSheet, 'C', "oc:circuitChip2", 'X', "oc:circuitChip3", 'M', "oc:ram5");
				r.addShaped(li.cil.oc.api.Items.get("server3").createItemStack(1), "OMO", "CXC", "OIO", 'O', Blocks.obsidian, 'I', TFCItems.steelSheet2x, 'C', "oc:circuitChip3", 'X', "oc:circuitChip3", 'M', "oc:ram6");
				r.addShaped(li.cil.oc.api.Items.get("tankUpgrade").createItemStack(1), "PIP", "DXD", "PBP", 'P', "packPlanks", 'I', TFCItems.blackBronzeSheet, 'B', Blocks.piston, 'D', Blocks.dispenser, 'X', Items.bucket);
				r.addShaped(li.cil.oc.api.Items.get("navigationUpgrade").createItemStack(1), "GCG", "XMX", "GWG", 'G', TFCItems.goldSheet, 'C', Items.compass, 'X', "oc:circuitChip2", 'M', Items.map, 'W', TFCItems.redSteelBucketSaltWater);
				r.addShaped(li.cil.oc.api.Items.get("componentBus1").createItemStack(1), "IRI", "XC ", "IRI", 'I', TFCItems.wroughtIronSheet, 'R', Items.redstone, 'X', "oc:circuitChip1", 'C', "oc:materialCU");
				r.addShaped(li.cil.oc.api.Items.get("componentBus2").createItemStack(1), "IRI", "XC ", "IRI", 'I', TFCItems.wroughtIronSheet, 'R', Items.redstone, 'X', "oc:circuitChip2", 'C', "oc:componentBus1");
				r.addShaped(li.cil.oc.api.Items.get("componentBus3").createItemStack(1), "IRI", "XC ", "IRI", 'I', TFCItems.wroughtIronSheet, 'R', Items.redstone, 'X', "oc:circuitChip3", 'C', "oc:componentBus2");
				r.addShaped(li.cil.oc.api.Items.get("droneCase1").createItemStack(1), "BCB", "MXM", "BAB", 'B', Blocks.end_stone, 'C', Items.compass, 'M', "oc:circuitChip2", 'X', "oc:microcontrollerCase1", 'A', "oc:componentBus2");
				r.addShaped(li.cil.oc.api.Items.get("droneCase2").createItemStack(1), "BCB", "MXM", "BAB", 'B', Blocks.end_stone, 'C', Items.compass, 'M', "oc:circuitChip3", 'X', "oc:microcontrollerCase2", 'A', "oc:componentBus3");
				r.addShaped(li.cil.oc.api.Items.get("pistonUpgrade").createItemStack(1), "IPI", "SMS", "IPI", 'I', TFCItems.wroughtIronSheet, 'P', Blocks.piston, 'S', "packStick", 'M', "oc:circuitChip2");
				r.addShaped(li.cil.oc.api.Items.get("generatorUpgrade").createItemStack(1), "I I", "MPM", "III", 'I', TFCItems.blackSteelSheet, 'M', Blocks.piston, 'P', new ItemStack(ExtraUtils.generator, 1, 2));
				r.addShaped(li.cil.oc.api.Items.get("tractorBeamUpgrade").createItemStack(1), "IGI", "XCX", "IAI", 'I', TFCItems.blackSteelSheet, 'G', Blocks.piston, 'X', TFCItems.zincSheet, 'A', "oc:circuitChip3", 'C', "oc:capacitor");
				r.addShaped(li.cil.oc.api.Items.get("chunkloaderUpgrade").createItemStack(1), "SSS", "SCS", "SAS", 'S', WurmTweaksItems.gearMixedSheet, 'C', RailcraftBlocks.getBlockMachineAlpha(), 'A', "oc:circuitChip3");
				r.addShaped(li.cil.oc.api.Items.get("craftingUpgrade").createItemStack(1), "I I", "ICI", "IXI", 'I', TFCItems.blackSteelSheet, 'C', Blocks.crafting_table, 'X', "oc:circuitChip2");
				r.addShaped(li.cil.oc.api.Items.get("experienceUpgrade").createItemStack(1), "I I", "XAX", "IXI", 'I', WurmTweaksItems.gearMixedSheet, 'X', "oc:circuitChip3", 'A', "packGemBlock");
				r.addShaped(li.cil.oc.api.Items.get("inventoryUpgrade").createItemStack(1), "IHI", "ICI", "III", 'I', TFCItems.blackSteelSheet, 'H', Blocks.hopper, 'C', "packChest");
				r.addShaped(li.cil.oc.api.Items.get("inventoryControllerUpgrade").createItemStack(1), "IAI", "XBX", "I I", 'I', TFCItems.blackSteelSheet, 'A', "oc:analyzer", 'X', "oc:circuitChip2", 'B', "oc:inventoryUpgrade");
				r.addShaped(li.cil.oc.api.Items.get("leashUpgrade").createItemStack(1), "ILI", "LCL", "ILI", 'I', TFCItems.blackSteelSheet, 'L', Items.lead, 'C', "oc:circuitChip1");
				r.addShaped(li.cil.oc.api.Items.get("signUpgrade").createItemStack(1), "IDI", "MSM", "IPI", 'I', TFCItems.blackSteelSheet, 'D', "dyeBlack", 'M', "oc:circuitChip1", 'S', "packStick", 'P', Blocks.piston);
				r.addShaped(li.cil.oc.api.Items.get("solarGeneratorUpgrade").createItemStack(1), "GGG", "XSX", "III", 'I', TFCItems.blackSteelSheet, 'G', "packGlass", 'X', "oc:circuitChip3", 'S', WurmTweaksItems.itemSolarCore);
				r.addShaped(li.cil.oc.api.Items.get("analyzer").createItemStack(1), "R  ", "TG ", "TG ", 'R', Blocks.redstone_torch, 'T', "oc:materialTransistor", 'G', TFCItems.platinumSheet);
				r.addShaped(li.cil.oc.api.Items.get("tabletCase1").createItemStack(1), "XBG", "BSX", "XGG", 'X', "oc:circuitChip3", 'B', Blocks.stone_button, 'G', TFCItems.goldSheet, 'B', "oc:componentBus2", 'S', "oc:screen2");
				r.addShaped(li.cil.oc.api.Items.get("tabletCase2").createItemStack(1), "XBG", "BSX", "XGG", 'X', "oc:circuitChip3", 'B', Blocks.stone_button, 'G', TFCItems.goldSheet2x, 'B', "oc:componentBus3", 'S', "oc:screen3");
				r.addShaped(li.cil.oc.api.Items.get("microcontrollerCase1").createItemStack(1), "IMI", "RCR", "III", 'I', TFCItems.blackSteelSheet, 'M', "oc:circuitChip2", 'R', Items.redstone, 'C', "packChest");
				r.addShaped(li.cil.oc.api.Items.get("microcontrollerCase2").createItemStack(1), "IMI", "RCR", "III", 'I', TFCItems.blackSteelSheet, 'M', "oc:circuitChip2", 'R', Items.redstone, 'C', "oc:microcontrollerCase1");
				r.addShaped(li.cil.oc.api.Items.get("chamelium").createItemStack(8), "GRG", "RCR", "GGG", 'G', "packGravel", 'R', Items.redstone, 'C', new ItemStack(TFCItems.coal, 1, 1));
				r.addShaped(li.cil.oc.api.Items.get("terminal").createItemStack(1), "ICI", "ISI", "NIX", 'I', TFCItems.blueSteelSheet, 'N', "oc:circuitChip3", 'X', "oc:wlanCard", 'C', "oc:solarGeneratorUpgrade", 'S', "oc:screen2");
				r.addShaped(li.cil.oc.api.Items.get("texturePicker").createItemStack(1), "ABC", "DEF", "GHI", 'A', "dyeBlack", 'B', "dyeRed", 'C', "dyeGreen", 'D', "dyeBlue", 'E', "oc:analyzer", 'F', "dyePurple", 'G', "dyeYellow", 'H', "dyePink", 'I', "dyeWhite");
				r.addShaped(li.cil.oc.api.Items.get("wlanCard").createItemStack(1), "CA", " X", 'C', "oc:materialInterweb", 'A', "oc:circuitChip2", 'X', "oc:materialCard");
				r.addShaped(li.cil.oc.api.Items.get("graphicsCard1").createItemStack(1), "ABC", " D ", 'A', "oc:circuitChip1", 'B', "oc:cpu1", 'C', "oc:ram1", 'D', "oc:materialCard");
				r.addShaped(li.cil.oc.api.Items.get("graphicsCard2").createItemStack(1), "ABC", " D ", 'A', "oc:circuitChip2", 'B', "oc:cpu2", 'C', "oc:ram3", 'D', "oc:materialCard");
				r.addShaped(li.cil.oc.api.Items.get("graphicsCard3").createItemStack(1), "ABC", " D ", 'A', "oc:circuitChip3", 'B', "oc:cpu3", 'C', "oc:ram5", 'D', "oc:materialCard");
				r.addShaped(li.cil.oc.api.Items.get("linkedCard").createItemStack(2), "X X", "CEC", 'X', Items.ender_eye, 'C', "oc:lanCard", 'E', "oc:materialInterweb");
				r.addShaped(li.cil.oc.api.Items.get("inkCartridgeEmpty").createItemStack(1), "IDI", "TBT", "IPI", 'I', TFCItems.wroughtIronIngot, 'D', Blocks.dispenser, 'T', "oc:materialTransistor", 'B', Items.bucket, 'P', Blocks.piston);
				r.addShaped(li.cil.oc.api.Items.get("floppy").createItemStack(1), "III", "PCP", "III", 'I', TFCItems.wroughtIronIngot, 'C', "oc:materialDisk", 'P', Items.paper);
				r.addShaped(li.cil.oc.api.Items.get("eeprom").createItemStack(1), "III", "PCP", "III", 'I', TFCItems.wroughtIronIngot, 'C', "oc:circuitChip1", 'P', Items.paper);
				r.addShaped(li.cil.oc.api.Items.get("interweb").createItemStack(1), "CCC", "CEC", "CCC", 'C', TFCItems.silkCloth, 'E', TFItems.ingotEnderium);
				r.addShaped(li.cil.oc.api.Items.get("card").createItemStack(1), "IT ", "IT ", "IGG", 'I', TFCItems.blackSteelSheet, 'T', "oc:materialTransistor", 'G', TFCItems.goldSheet);
				r.addShaped(li.cil.oc.api.Items.get("angelUpgrade").createItemStack(1), "I I", " B ", "I I", 'I', TFCItems.blackSteelSheet, 'B', ExtraUtils.angelBlock);
				// TODO Creative MicroControler Case
				// TODO Creative Tablet
				// TODO Creative Drone
				// TODO Creative ALU
				r.addBasicMachineRecipe(li.cil.oc.api.Items.get("nanomachines").createItemStack(1), WurmTweaksItems.itemAntiMatter, WurmTweaksItems.itemQuantumSingularity, WurmTweaksItems.itemBloodInfused, WurmTweaksItems.itemMachineFrame);
				// TODO Creative Server
				// TODO Creative PC Case
				// TODO r.addShaped(li.cil.oc.api.Items.get("worldSensorCard").createItemStack(1), "I I", " B ", "I I", 'I', TFCItems.blackSteelSheet, 'B', WurmTweaksItems.itemSpaceModule);
				r.addShaped(li.cil.oc.api.Items.get("tankControllerUpgrade").createItemStack(1), "PIP", "DXD", 'P', TFCItems.goldSheet, 'I', TFCItems.blackSteelSheet, 'B', Blocks.piston, 'D', Blocks.dispenser, 'X', Items.bucket);
				r.addShaped(li.cil.oc.api.Items.get("arrowKeys").createItemStack(1), " B ", "BBB", 'B', Blocks.stone_button);
				r.addShaped(li.cil.oc.api.Items.get("buttonGroup").createItemStack(1), "BBB", "BBB", 'B', Blocks.stone_button);
				r.addShaped(li.cil.oc.api.Items.get("wrench").createItemStack(1), " S ", "SSS", "XSX", 'S', TFCItems.blackSteelSheet, 'X', TFCItems.leather);
				r.addShapeless(li.cil.oc.api.Items.get("internetCard").createItemStack(1), "oc:materialInterweb", "oc:wlanCard");
				r.addShapeless(li.cil.oc.api.Items.get("inkCartridge").createItemStack(1), "oc:inkCartridgeEmpty", "dyeBlue", "dyePink", "dyeRed", "dyeYellow");
				r.addShapeless(NBTOpenComputers.getEEProm(), "oc:eeprom", Items.book);
				r.addShapeless(NBTOpenComputers.getDiskOS(), "oc:floppy", Items.book);
				r.addShapeless(li.cil.oc.api.Items.get("manual").createItemStack(1), Items.book, WurmTweaksItems.itemComputationalCore);
				r.addBasicMachineRecipe(li.cil.oc.api.Items.get("hoverBoots").createItemStack(1), WurmTweaksItems.itemQuantumFoam, WurmTweaksItems.ingotGreenSteel, WurmTweaksItems.ingotEnergyReactor, TFCItems.redSteelBoots);
				r.addBasicMachineRecipe(li.cil.oc.api.Items.get("hoverBoots").createItemStack(1), WurmTweaksItems.itemQuantumFoam, WurmTweaksItems.ingotGreenSteel, WurmTweaksItems.ingotEnergyReactor, TFCItems.blueSteelBoots);
				r.addBasicMachineRecipe(new ItemStack(GameRegistry.findItem("OpenComputers", "item"), 1, 24), new ItemStack(GameRegistry.findItem("OpenComputers", "item"), 1, 23), Items.redstone, "packIngot", TFCItems.blackSteelSheet);
				r.addBasicMachineRecipe(new ItemStack(GameRegistry.findItem("OpenComputers", "item"), 1, 25), new ItemStack(GameRegistry.findItem("OpenComputers", "item"), 1, 23), Items.redstone, TFCItems.platinumSheet, new ItemStack(GameRegistry.findItem("OpenComputers", "item"), 1, 24));
				r.addBasicMachineRecipe(new ItemStack(GameRegistry.findItem("OpenComputers", "item"), 1, 26), new ItemStack(GameRegistry.findItem("OpenComputers", "item"), 1, 23), Items.redstone, TFCItems.blueSteelSheet2x, new ItemStack(GameRegistry.findItem("OpenComputers", "item"), 1, 25));
				r.addCrossWCenter(new ItemStack(GameRegistry.findItem("OpenComputers", "item"), 1, 23), Items.redstone, TFCItems.blackSteelSheet, Items.glowstone_dust);
		}
}

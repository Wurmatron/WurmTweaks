package wurmcraft.wurmatron.common.recipes.mods;

import advsolar.common.AdvancedSolarPanel;
import buildcraft.BuildCraftEnergy;
import buildcraft.BuildCraftFactory;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import techreborn.init.ModBlocks;
import techreborn.init.ModItems;
import thaumcraft.common.config.ConfigItems;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.machines.MachineHelper;
import wurmcraft.wurmatron.common.utils.techreborn.TechRebornHelper;

public class TechRebornRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "techreborn")
		public static void addRecipes () {
				r.addShaped(new ItemStack(ModBlocks.thermalGenerator), "BBB", "BMB", "XXX", 'B', new ItemStack(TFCItems.blueSteelSheet2x), 'M', new ItemStack(ModBlocks.machineframe, 1, 5), 'X', WurmTweaksItems.gearMixedSheet);
				r.addShaped(new ItemStack(ModBlocks.quantumChest), "XXX", "CBC", "XXX", 'X', WurmTweaksItems.gearMixedSheet, 'C', "wurmchest", 'B', new ItemStack(ModBlocks.machineframe, 1, 5));
				r.addShaped(new ItemStack(ModBlocks.quantumChest), "XXX", "CBC", "XXX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(BuildCraftFactory.tankBlock), 'B', new ItemStack(ModBlocks.machineframe, 1, 5));
				r.addShaped(new ItemStack(ModBlocks.centrifuge), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 4), 'B', WurmTweaksItems.itemCraftingCore, 'A', "packPlanks");
				r.addShaped(new ItemStack(ModBlocks.RollingMachine), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', Blocks.piston);
				r.addShaped(new ItemStack(ModBlocks.BlastFurnace), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', TFCItems.copperSheet2x);
				r.addCrossWCenter(new ItemStack(ModBlocks.AlloySmelter), WurmTweaksItems.gearMixedSheet, new ItemStack(TFCItems.fireBrick, 1, 1), new ItemStack(ModBlocks.AlloyFurnace));
				r.addShaped(new ItemStack(ModBlocks.Grinder), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', Items.flint);
				r.addShaped(new ItemStack(ModBlocks.ImplosionCompressor), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 4), 'B', WurmTweaksItems.itemCraftingCore, 'A', Blocks.tnt);
				r.addShaped(new ItemStack(ModBlocks.MatterFabricator), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.itemCraftingCore, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', new ItemStack(IC2Items.getItem("iridiumPlate").getItem()));
				r.addShaped(new ItemStack(ModBlocks.BlastFurnace), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', TFCItems.copperSheet2x);
				r.addShaped(new ItemStack(ModBlocks.chargeBench), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', IC2Items.getItem("glassFiberCableItem"));
				r.addCrossWCenter(new ItemStack(ModBlocks.MachineCasing, 2, 0), WurmTweaksItems.gearMixedSheet, WurmTweaksItems.itemQuantumSingularity, new ItemStack(ModBlocks.machineframe, 1, 4));
				r.addCrossWCenter(new ItemStack(ModBlocks.MachineCasing, 1, 1), WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemQuantumSingularity, new ItemStack(ModBlocks.MachineCasing, 1, 0));
				r.addCrossWCenter(new ItemStack(ModBlocks.MachineCasing, 1, 2), WurmTweaksItems.ingotCyanSteel, WurmTweaksItems.itemQuantumSingularity, new ItemStack(ModBlocks.MachineCasing, 1, 1));
				r.addCrossWCenter(new ItemStack(ModBlocks.HighAdvancedMachineBlock), "packGemExquisite", WurmTweaksItems.ingotRainbowSteel, new ItemStack(ModBlocks.MachineCasing, 1, 2));
				r.addShaped(new ItemStack(ModBlocks.Magicenergeyconverter), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', new ItemStack(ConfigItems.itemResource, 1, 2));
				r.addShaped(new ItemStack(ModBlocks.AssemblyMachine), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', IC2Items.getItem("electronicCircuit"));
				r.addShaped(new ItemStack(ModBlocks.DieselGenerator), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', new ItemStack(BuildCraftEnergy.fuel));
				r.addShaped(new ItemStack(ModBlocks.IndustrialElectrolyzer), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', new ItemStack(ModBlocks.centrifuge));
				for (int i = 0; i <= 5; i++)
						r.addShaped(new ItemStack(ModBlocks.MagicalAbsorber), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', new ItemStack(ConfigItems.itemShard, 1, i));
				r.addShaped(new ItemStack(ModBlocks.DieselGenerator), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', new ItemStack(Items.bucket));
				r.addCircleWCenter(new ItemStack(ModBlocks.AlloyFurnace), new ItemStack(TFCItems.fireBrick, 1, 1), WurmTweaksItems.gearMixedSheet);
				r.addShaped(new ItemStack(ModBlocks.ChemicalReactor), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.gearMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', new ItemStack(Items.golden_apple, 1, 1));
				r.addCrossWCenter(new ItemStack(ModBlocks.Idsu), new ItemStack(techreborn.init.ModItems.lapotronicOrb), new ItemStack(ModBlocks.Aesu), new ItemStack(ModBlocks.HighAdvancedMachineBlock));
				r.addCrossWCenter(new ItemStack(ModBlocks.Lesu), new ItemStack(IC2Items.getItem("lapotronCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), WurmTweaksItems.gearMixedSheet, new ItemStack(ModBlocks.machineframe, 1, 4));
				r.addShaped(new ItemStack(ModBlocks.Supercondensator, 4), "SSS", "XXX", "SSS", 'S', WurmTweaksItems.itemElectroShielding, 'X', new ItemStack(TFCItems.platinumSheet2x));
				r.addCrossWCenter(new ItemStack(ModBlocks.LesuStorage), "dye", new ItemStack(IC2Items.getItem("energyCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModBlocks.machineframe, 1, 4));
				r.addShaped(new ItemStack(ModBlocks.VacuumFreezer), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.itemMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemMixedSheet, 'A', TFItems.ingotEnderium);
				r.addShaped(new ItemStack(ModBlocks.industrialSawmill), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.itemMixedSheet, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', "packLog");
				r.addCrossWCenter(new ItemStack(ModBlocks.machineframe, 1, 0), "ingotAluminum", new ItemStack(TFCItems.blackSteelSheet), new ItemStack(ModBlocks.machineframe, 1, 1));
				r.addCrossWCenter(new ItemStack(ModBlocks.machineframe, 1, 2), "ingotBronze", new ItemStack(TFCItems.blackSteelSheet), new ItemStack(ModBlocks.machineframe, 1, 1));
				r.addCrossWCenter(new ItemStack(ModBlocks.machineframe, 1, 3), TFCItems.brassIngot, new ItemStack(TFCItems.blackSteelSheet), new ItemStack(ModBlocks.machineframe, 1, 1));
				r.addCrossWCenter(new ItemStack(ModBlocks.machineframe, 1, 4), TFCItems.steelIngot, new ItemStack(TFCItems.blackSteelSheet), new ItemStack(ModBlocks.machineframe, 1, 1));
				r.addCrossWCenter(new ItemStack(ModBlocks.machineframe, 1, 5), WurmTweaksItems.ingotTitanium, new ItemStack(TFCItems.blackSteelSheet2x), new ItemStack(ModBlocks.machineframe, 1, 4));
				r.addCrossWCenter(new ItemStack(ModBlocks.machineframe, 1, 1), TFCItems.wroughtIronIngot, new ItemStack(TFCItems.blackSteelSheet), IC2Items.getItem("advancedMachine"));
				r.addCrossWCenter(new ItemStack(ModBlocks.Aesu), new ItemStack(techreborn.init.ModItems.parts, 1, 4), IC2Items.getItem("mfsUnit"), new ItemStack(ModBlocks.machineframe, 1, 5));
				r.addCross(new ItemStack(techreborn.init.ModItems.parts, 4, 4), IC2Items.getItem("advancedCircuit"), IC2Items.getItem("carbonMesh"));
				r.addCross(new ItemStack(techreborn.init.ModItems.parts, 1, 5), new ItemStack(TFCItems.blackSteelSheet), new ItemStack(techreborn.init.ModItems.parts, 1, 4));
				r.addCross(new ItemStack(techreborn.init.ModItems.parts, 1, 6), "packGemExquisite", new ItemStack(techreborn.init.ModItems.parts, 1, 5));
				r.addShaped(new ItemStack(techreborn.init.ModItems.parts, 1, 17), "XAX", "A A", "XAX", 'X', new ItemStack(TFCItems.goldSheet2x), 'A', new ItemStack(TFCItems.copperSheet2x));
				r.addCrossWCenter(new ItemStack(techreborn.init.ModItems.parts, 1, 18), new ItemStack(TFCItems.platinumSheet2x), WurmTweaksItems.itemCraftingCore, new ItemStack(techreborn.init.ModItems.parts, 1, 17));
				r.addCrossWCenter(new ItemStack(techreborn.init.ModItems.parts, 1, 19), AdvancedSolarPanel.itemSunnariumAlloy, WurmTweaksItems.itemCraftingCore, new ItemStack(techreborn.init.ModItems.parts, 1, 17));
				r.addCrossWCenter(new ItemStack(techreborn.init.ModItems.lapotronicOrb), WurmTweaksItems.itemCraftingCore, new ItemStack(IC2Items.getItem("lapotronCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), IC2Items.getItem("mfsUnit"));
				r.addShaped(new ItemStack(ModBlocks.ComputerCube), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.itemComputationalCore, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', new ItemStack(IC2Items.getItem("iridiumPlate").getItem()));
				r.addShaped(new ItemStack(ModBlocks.FusionControlComputer), "XCX", "XBX", "XCX", 'X', WurmTweaksItems.itemElectroMagneticShielding, 'C', new ItemStack(ExtraUtils.cobblestoneCompr, 1, 7), 'B', new ItemStack(ModBlocks.ComputerCube));
				r.addShaped(new ItemStack(ModBlocks.FusionCoil, 2), "XXX", "BFB", "XXX", 'X', WurmTweaksItems.itemElectroMagneticShielding, 'B', new ItemStack(ModBlocks.Supercondensator), 'F', new ItemStack(IC2Items.getItem("iridiumPlate").getItem()));
				r.addShaped(new ItemStack(ModBlocks.PlasmaGenerator), "XBX", "ACA", "XBX", 'X', WurmTweaksItems.itemMachineFrame, 'C', new ItemStack(ModBlocks.machineframe, 1, 5), 'B', WurmTweaksItems.itemCraftingCore, 'A', WurmTweaksItems.itemUnstableMatter);
				r.addShaped(new ItemStack(TFCItems.redSteelIngot, 4), "U U", " U ", "U U", 'U', new ItemStack(techreborn.init.ModItems.uuMatter));
				r.addShaped(new ItemStack(TFCItems.blueSteelIngot, 4), " U ", "UUU", " U ", 'U', new ItemStack(techreborn.init.ModItems.uuMatter));
				r.addShaped(new ItemStack(TFCItems.nickelIngot, 8), " U ", "U U", " U ", 'U', new ItemStack(techreborn.init.ModItems.uuMatter));
				r.addShaped(new ItemStack(TFCItems.silverIngot, 12), "U U", "   ", "U U", 'U', new ItemStack(techreborn.init.ModItems.uuMatter));
				r.addShaped(new ItemStack(TFCItems.copperIngot, 12), "U  ", " U ", "  U", 'U', new ItemStack(techreborn.init.ModItems.uuMatter));
				r.addShaped(new ItemStack(TFCItems.bismuthIngot, 12), "  U", " U ", "U  ", 'U', new ItemStack(techreborn.init.ModItems.uuMatter));
				r.addShaped(new ItemStack(TFCItems.zincIngot, 12), " U ", " U ", " U ", 'U', new ItemStack(techreborn.init.ModItems.uuMatter));
				r.addShaped(new ItemStack(TFCItems.wroughtIronIngot, 12), "U U", " U ", " U ", 'U', new ItemStack(techreborn.init.ModItems.uuMatter));
				r.addShaped(new ItemStack(TFCItems.steelIngot, 10), "U U", "U U", 'U', new ItemStack(techreborn.init.ModItems.uuMatter));
				r.addCrossWCenter(new ItemStack(ModItems.parts, 1, 23), ExtraUtils.bedrockium, WurmTweaksItems.ingotOrangeSteel, WurmTweaksItems.itemCraftingCore);
				addSawMillRecipes();
				addFusionReactorRecipes();
				addIndustrialElectrolyzerRecipes();
				addImplosionCompressorRecipes();
				addAlloySmelter();
				addBlastFurnaceRecipes();
				adAssemblingMachineRecipes();
		}

		private static void addSawMillRecipes () {
				for (int l = 0; l < 16; l++)
						MachineHelper.addSawMillRecipe(new ItemStack(TFCItems.singlePlank, 16, l), null, new ItemStack(TFCItems.logs, 1, l), 5, 32, 80);
		}

		private static void addFusionReactorRecipes () {
				TechRebornHelper.addFusionReactoRecipe(WurmTweaksItems.ingotTitanium, new ItemStack(TFCItems.redSteelIngot), WurmTweaksItems.itemAntiMatter, 9000000, 8192, 800);
		}

		private static void addIndustrialElectrolyzerRecipes () {
				TechRebornHelper.addIndustrialElectrolyzerRecipe(new ItemStack(TFCItems.leadIngot, 1, 0), null, new ItemStack(TFCItems.oreChunk, 1, 51), null, null, null, 100, 128);
		}

		private static void addImplosionCompressorRecipes () {
				TechRebornHelper.addImplosionCompressorRecipe(new ItemStack(ModItems.parts, 1, 23), new ItemStack(Blocks.tnt, 8), IC2Items.getItem("iridiumPlate"), null, 200, 512);
		}

		private static void addAlloySmelter () {
				TechRebornHelper.addAlloySmelterRecipe(new ItemStack(TFCItems.copperIngot, 11, 0), new ItemStack(TFCItems.zincIngot, 1, 0), new ItemStack(TFCItems.brassIngot, 12, 0), 80, 32);
				TechRebornHelper.addAlloySmelterRecipe(new ItemStack(TFCItems.copperIngot, 11, 0), new ItemStack(TFCItems.tinIngot, 1, 0), new ItemStack(TFCItems.bronzeIngot, 12, 0), 80, 32);
				TechRebornHelper.addAlloySmelterRecipe(new ItemStack(TFCItems.copperIngot, 2, 0), new ItemStack(TFCItems.goldIngot, 10, 0), new ItemStack(TFCItems.roseGoldIngot, 12, 0), 80, 32);
				TechRebornHelper.addAlloySmelterRecipe(new ItemStack(TFCItems.copperIngot, 3, 0), new ItemStack(TFCItems.goldIngot, 10, 0), new ItemStack(TFCItems.sterlingSilverIngot, 13, 0), 80, 32);
		}

		private static void addBlastFurnaceRecipes () {
				TechRebornHelper.addBlastFurnaceRecipe(new ItemStack(TFCItems.coal, 1, 1), new ItemStack(TFCItems.wroughtIronIngot), new ItemStack(TFCItems.steelIngot), null, 60, 32, 1200);
		}

		private static void adAssemblingMachineRecipes () {
				for (ItemStack chest : OreDictionary.getOres("packChest"))
						TechRebornHelper.adAssemblingMachineRecipe(new ItemStack(TFCItems.steelIngot), chest, new ItemStack(Blocks.chest), 80, 32);
				for (ItemStack stick : OreDictionary.getOres("packStick")) {
						TechRebornHelper.adAssemblingMachineRecipe(stick, new ItemStack(TFCItems.coal, 1, 1), new ItemStack(Blocks.torch), 80, 32);
						TechRebornHelper.adAssemblingMachineRecipe(stick, new ItemStack(TFCItems.coal, 1, 0), new ItemStack(Blocks.torch), 80, 32);
				}
				TechRebornHelper.adAssemblingMachineRecipe(new ItemStack(TFCItems.wool), null, new ItemStack(TFCItems.woolYarn, 8), 80, 32);
				TechRebornHelper.adAssemblingMachineRecipe(new ItemStack(TFCItems.woolYarn, 16), null, new ItemStack(TFCItems.woolCloth), 80, 32);
				TechRebornHelper.adAssemblingMachineRecipe(new ItemStack(Items.string, 24), null, new ItemStack(TFCItems.silkCloth), 80, 32);
				TechRebornHelper.adAssemblingMachineRecipe(new ItemStack(TFCItems.juteFiber, 12), null, new ItemStack(TFCItems.burlapCloth), 80, 32);
		}
}

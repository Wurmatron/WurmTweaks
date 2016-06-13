package wurmcraft.wurmatron.common.config;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import wurmcraft.wurmatron.common.reference.Global;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class ConfigHandler {

		public static Configuration config;

		private static Property debug;
		// Mods
		private static Property Avaritia;
		private static Property AdvancedSolarPanels;
		private static Property AM2;
		private static Property AE2;
		private static Property EnderIO;
		private static Property BigReactors;
		private static Property BloodMagic;
		private static Property Botania;
		private static Property BuildCraft;
		private static Property CarpentersBlocks;
		private static Property Chisel;
		private static Property ComputerCraft;
		private static Property CraftHeraldry;
		private static Property DraconicEvolution;
		private static Property IronChest;
		private static Property EnderStorage;
		private static Property ExtraCells;
		private static Property ExtraUtilities;
		private static Property GalaticCraft;
		private static Property GraviSuite;
		private static Property ImmersiveEngineering;
		private static Property IC2;
		private static Property JABBA;
		private static Property MalisisDoors;
		private static Property Mekanism;
		private static Property MineFactoryReloaded;
		private static Property OpenBlocks;
		private static Property OpenComputers;
		private static Property OpenModularTurrets;
		private static Property PowerConverters;
		private static Property QuarryPlus;
		private static Property Railcraft;
		private static Property TinkerIO;
		private static Property ShinColle;
		private static Property TFCScales;
		private static Property TFCCellars;
		private static Property SimplyJetpacks;
		private static Property TFCMisc;
		private static Property WirelessRedstone;
		private static Property SolarExpansion;
		private static Property TConstruct;
		private static Property TechReborn;
		private static Property Thaumcraft;
		private static Property ThermalDynamics;
		private static Property ThermalExpansion;
		private static Property BiblioWoodsTFC;
		private static Property Ztones;
		private static Property SoulShards;
		private static Property IC2NuclearControl;
		private static Property IronTank;
		private static Property CompactMachines;
		private static Property LogisticsPipes;
		private static Property ProjRed;
		private static Property powersuits;

		public static void init (FMLPreInitializationEvent e) {
				config = new Configuration(e.getSuggestedConfigurationFile());
				syncConfig();
		}

		public static void syncConfig () {
				debug = config.get(Configuration.CATEGORY_GENERAL, Global.DEBUG, Defaults.DEBUG, "Enable debug mode");
				Settings.debug = debug.getBoolean();
				// Mods
				Avaritia = config.get(Global.CATEGORY_MODS, "Avaritia", true);
				Settings.Avaritia = Avaritia.getBoolean();
				AdvancedSolarPanels = config.get(Global.CATEGORY_MODS, "AdvancedSolarPanels", true);
				Settings.AdvancedSolarPanels = AdvancedSolarPanels.getBoolean();
				AM2 = config.get(Global.CATEGORY_MODS, "ArsMagica2", true);
				Settings.AM2 = AM2.getBoolean();
				AE2 = config.get(Global.CATEGORY_MODS, "AppliedEnergistics", true);
				Settings.AE2 = AE2.getBoolean();
				EnderIO = config.get(Global.CATEGORY_MODS, "EnderIO", true);
				Settings.EnderIO = EnderIO.getBoolean();
				BigReactors = config.get(Global.CATEGORY_MODS, "BigReactors", true);
				Settings.BigReactors = BigReactors.getBoolean();
				BloodMagic = config.get(Global.CATEGORY_MODS, "BloodMagic", true);
				Settings.BloodMagic = BloodMagic.getBoolean();
				Botania = config.get(Global.CATEGORY_MODS, "Botania", true);
				Settings.Botania = Botania.getBoolean();
				BuildCraft = config.get(Global.CATEGORY_MODS, "Buildcraft", true);
				Settings.BuildCraft = BuildCraft.getBoolean();
				CarpentersBlocks = config.get(Global.CATEGORY_MODS, "CarpentersBlocks", true);
				Settings.CarpentersBlocks = CarpentersBlocks.getBoolean();
				Chisel = config.get(Global.CATEGORY_MODS, "Chisel", true);
				Settings.Chisel = Chisel.getBoolean();
				ComputerCraft = config.get(Global.CATEGORY_MODS, "ComputerCraft", true);
				Settings.ComputerCraft = ComputerCraft.getBoolean();
				CraftHeraldry = config.get(Global.CATEGORY_MODS, "CraftHeraldry", true);
				Settings.CraftHeraldry = CraftHeraldry.getBoolean();
				DraconicEvolution = config.get(Global.CATEGORY_MODS, "DraconicEvolution", true);
				Settings.DraconicEvolution = DraconicEvolution.getBoolean();
				IronChest = config.get(Global.CATEGORY_MODS, "IronChest", true);
				Settings.IronChest = IronChest.getBoolean();
				EnderStorage = config.get(Global.CATEGORY_MODS, "EnderStorage", true);
				Settings.EnderStorage = EnderStorage.getBoolean();
				ExtraCells = config.get(Global.CATEGORY_MODS, "ExtraCells", true);
				Settings.ExtraCells = ExtraCells.getBoolean();
				ExtraUtilities = config.get(Global.CATEGORY_MODS, "ExtraUtilities", true);
				Settings.ExtraUtilities = ExtraUtilities.getBoolean();
				GalaticCraft = config.get(Global.CATEGORY_MODS, "GalaticCraft", true);
				Settings.GalaticCraft = GalaticCraft.getBoolean();
				GraviSuite = config.get(Global.CATEGORY_MODS, "GraviSuite", true);
				Settings.GraviSuite = GraviSuite.getBoolean();
				ImmersiveEngineering = config.get(Global.CATEGORY_MODS, "ImmersiveEngineering", true);
				Settings.ImmersiveEngineering = ImmersiveEngineering.getBoolean();
				IC2 = config.get(Global.CATEGORY_MODS, "IndustrialCraft2", true);
				Settings.IC2 = IC2.getBoolean();
				JABBA = config.get(Global.CATEGORY_MODS, "JABBA", true);
				Settings.JABBA = JABBA.getBoolean();
				MalisisDoors = config.get(Global.CATEGORY_MODS, "MalisisDoors", true);
				Settings.MalisisDoors = MalisisDoors.getBoolean();
				Mekanism = config.get(Global.CATEGORY_MODS, "Mekanism", true);
				Settings.Mekanism = Mekanism.getBoolean();
				MineFactoryReloaded = config.get(Global.CATEGORY_MODS, "MineFactoryReloaded", true);
				Settings.MineFactoryReloaded = MineFactoryReloaded.getBoolean();
				OpenBlocks = config.get(Global.CATEGORY_MODS, "OpenBlocks", true);
				Settings.OpenBlocks = OpenBlocks.getBoolean();
				OpenComputers = config.get(Global.CATEGORY_MODS, "OpenComputers", true);
				Settings.OpenComputers = OpenComputers.getBoolean();
				OpenModularTurrets = config.get(Global.CATEGORY_MODS, "OpenModularTurrets", true);
				Settings.OpenModularTurrets = OpenModularTurrets.getBoolean();
				PowerConverters = config.get(Global.CATEGORY_MODS, "PowerConverters", true);
				Settings.PowerConverters = PowerConverters.getBoolean();
				QuarryPlus = config.get(Global.CATEGORY_MODS, "QuarryPlus", true);
				Settings.QuarryPlus = QuarryPlus.getBoolean();
				Railcraft = config.get(Global.CATEGORY_MODS, "Railcraft", true);
				Settings.Railcraft = Railcraft.getBoolean();
				TinkerIO = config.get(Global.CATEGORY_MODS, "tinker_io", true);
				Settings.TinkerIO = TinkerIO.getBoolean();
				ShinColle = config.get(Global.CATEGORY_MODS, "ShinColle", true);
				Settings.ShinColle = ShinColle.getBoolean();
				TFCScales = config.get(Global.CATEGORY_MODS, "TFC_Scales", true);
				Settings.TFCScales = TFCScales.getBoolean();
				TFCCellars = config.get(Global.CATEGORY_MODS, "TFCCellars", true);
				Settings.TFCCellars = TFCCellars.getBoolean();
				SimplyJetpacks = config.get(Global.CATEGORY_MODS, "SimplyJetpacks", true);
				Settings.SimplyJetpacks = SimplyJetpacks.getBoolean();
				TFCMisc = config.get(Global.CATEGORY_MODS, "tfcm", true);
				Settings.TFCMisc = TFCMisc.getBoolean();
				WirelessRedstone = config.get(Global.CATEGORY_MODS, "WR-CBE|Core", true);
				Settings.WirelessRedstone = WirelessRedstone.getBoolean();
				SolarExpansion = config.get(Global.CATEGORY_MODS, "SolarExpansion", true);
				Settings.SolarExpansion = SolarExpansion.getBoolean();
				TConstruct = config.get(Global.CATEGORY_MODS, "TConstruct", true);
				Settings.TConstruct = TConstruct.getBoolean();
				TechReborn = config.get(Global.CATEGORY_MODS, "TechReborn", true);
				Settings.TechReborn = TechReborn.getBoolean();
				Thaumcraft = config.get(Global.CATEGORY_MODS, "Thaumcraft", true);
				Settings.Thaumcraft = Thaumcraft.getBoolean();
				ThermalDynamics = config.get(Global.CATEGORY_MODS, "ThermalDynamics", true);
				Settings.ThermalDynamics = ThermalDynamics.getBoolean();
				ThermalExpansion = config.get(Global.CATEGORY_MODS, "ThermalExpansion", true);
				Settings.ThermalExpansion = ThermalExpansion.getBoolean();
				BiblioWoodsTFC = config.get(Global.CATEGORY_MODS, "BiblioWoodsTFC", true);
				Settings.BiblioWoodsTFC = BiblioWoodsTFC.getBoolean();
				Ztones = config.get(Global.CATEGORY_MODS, "Ztones", true);
				Settings.Ztones = Ztones.getBoolean();
				SoulShards = config.get(Global.CATEGORY_MODS, "SoulShards", true);
				Settings.SoulShards = SoulShards.getBoolean();
				IC2NuclearControl = config.get(Global.CATEGORY_MODS, "IC2NuclearControl", true);
				Settings.IC2NuclearControl = IC2NuclearControl.getBoolean();
				IronTank = config.get(Global.CATEGORY_MODS, "IronTank", true);
				Settings.IronTank = IronTank.getBoolean();
				CompactMachines = config.get(Global.CATEGORY_MODS, "CompactMachines", true);
				Settings.CompactMachines = CompactMachines.getBoolean();
				LogisticsPipes = config.get(Global.CATEGORY_MODS, "LogisticsPipes", true);
				Settings.LogisticsPipes = LogisticsPipes.getBoolean();
				ProjRed = config.get(Global.CATEGORY_MODS, "ProjectRed", true);
				Settings.ProjRed = ProjRed.getBoolean();
				powersuits = config.get(Global.CATEGORY_MODS, "powersuits", true);
				Settings.powersuits = powersuits.getBoolean();

				LogHandler.info("Loaded Config");
				if (config.hasChanged()) {
						config.save();
						LogHandler.info("Config Saved");
				}
		}

		private static class Defaults {
				private static final boolean DEBUG = false;
		}
}

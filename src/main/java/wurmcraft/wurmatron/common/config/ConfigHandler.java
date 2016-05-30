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

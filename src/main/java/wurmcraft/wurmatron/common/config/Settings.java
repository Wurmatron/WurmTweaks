package wurmcraft.wurmatron.common.config;

public class Settings {
		public static boolean debug;
		// Mods
		public static boolean Avaritia;
		public static boolean AdvancedSolarPanels;
		public static boolean AM2;
		public static boolean AE2;
		public static boolean EnderIO;
		public static boolean BigReactors;
		public static boolean BloodMagic;
		public static boolean Botania;
		public static boolean BuildCraft;
		public static boolean CarpentersBlocks;
		public static boolean Chisel;
		public static boolean ComputerCraft;
		public static boolean CraftHeraldry;
		public static boolean DraconicEvolution;
		public static boolean IronChest;
		public static boolean EnderStorage;

		public static boolean isModEnabled (String modid) {
				if (modid.equalsIgnoreCase("Minecraft")) return true;
				if (modid.equalsIgnoreCase("Avaritia")) return Avaritia;
				if (modid.equalsIgnoreCase("AdvancedSolarPanel")) return AdvancedSolarPanels;
				if (modid.equalsIgnoreCase("arsmagica2")) return AM2;
				if (modid.equalsIgnoreCase("appliedenergistics2")) return AE2;
				if (modid.equalsIgnoreCase("EnderIO")) return EnderIO;
				if (modid.equalsIgnoreCase("BigReactors")) return BigReactors;
				if (modid.equalsIgnoreCase("BloodMagic")) return BloodMagic;
				if (modid.equalsIgnoreCase("Botania")) return Botania;
				if (modid.equalsIgnoreCase("Buildcraft|Core")) return BuildCraft;
				if (modid.equalsIgnoreCase("CarpentersBlocks")) return CarpentersBlocks;
				if (modid.equalsIgnoreCase("chisel")) return Chisel;
				if (modid.equalsIgnoreCase("ComputerCraft")) return ComputerCraft;
				if (modid.equalsIgnoreCase("CraftHeraldry")) return CraftHeraldry;
				if(modid.equalsIgnoreCase("DraconicEvolution")) return DraconicEvolution;
				if(modid.equalsIgnoreCase("IronChest")) return IronChest;
				if(modid.equalsIgnoreCase("EnderStorage")) return EnderStorage;
				return false;
		}
}

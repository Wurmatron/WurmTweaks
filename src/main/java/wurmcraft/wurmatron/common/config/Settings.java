package wurmcraft.wurmatron.common.config;

public class Settings {
		public static boolean debug;
		// Mods
		public static boolean Avaritia;
		public static boolean AdvancedSolarPanels;
		public static boolean AM2;
		public static boolean AE2;
		public static boolean EnderIO;

		public static boolean isModEnabled(String modid) {
				if(modid.equalsIgnoreCase("Minecraft")) return true;
				if(modid.equalsIgnoreCase("Avaritia")) return Avaritia;
				if(modid.equalsIgnoreCase("AdvancedSolarPanel")) return AdvancedSolarPanels;
				if(modid.equalsIgnoreCase("arsmagica2")) return AM2;
				if(modid.equalsIgnoreCase("appliedenergistics2")) return AE2;
				if(modid.equalsIgnoreCase("EnderIO")) return EnderIO;
				return false;
		}
}

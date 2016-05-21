package wurmcraft.wurmatron.common.config;

public class Settings {
		public static boolean debug;
		// Mods
		public static boolean Avaritia;

		public static boolean isModEnabled(String modid) {
				if(modid.equalsIgnoreCase("Minecraft")) return true;
				if(modid.equalsIgnoreCase("Avaritia")) return true;
				return false;
		}
}

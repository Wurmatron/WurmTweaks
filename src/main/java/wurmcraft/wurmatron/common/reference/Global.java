package wurmcraft.wurmatron.common.reference;

import java.util.ArrayList;

public class Global {
		// @Mod
		public static final String MODID = "wurmtweaks";
		public static final String NAME = "WurmTweaks";
		public static final String VERSION = "@VERSION@";
		public static final String GUIFACTORY = "wurmcraft.wurmatron.common.config.GuiFactory";
		public static final String DEPENDENCIES = "required-after:terrafirmacraft";
		// Proxy
		public static final String COMMONPROXY = "wurmcraft.wurmatron.common.proxy.CommonProxy";
		public static final String CLIENTPROXY = "wurmcraft.wurmatron.client.proxy.ClientProxy";
		// Config
		public static final String CATEGORY_MODS = "Mods";
		public static final String DEBUG = "Debug";

		public static final ArrayList<String> GODS = new ArrayList<String>() {{
				add("Wurmatron");
				add("Ficisism");
				// Not an Modpack dev just server owner
				add("NinjaDjay ");
		}};
}
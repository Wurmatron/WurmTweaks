package wurmcraft.wurmatron.client.gui;

import cpw.mods.fml.client.config.DummyConfigElement;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import wurmcraft.wurmatron.common.config.ConfigHandler;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.ArrayList;
import java.util.List;

public class ConfigGui extends GuiConfig {

		public ConfigGui (GuiScreen ps) {
				super(ps, getConfigElements(), Global.NAME, false, false, ConfigHandler.config.getConfigFile().getName());
		}

		private static List<IConfigElement> getConfigElements () {
				List<IConfigElement> list = new ArrayList<IConfigElement>();
				list.add(new DummyConfigElement.DummyCategoryElement("General", ConfigHandler.config.getConfigFile().getName(), CategoryEntryGeneral.class));
				list.add(new DummyConfigElement.DummyCategoryElement("Mods", ConfigHandler.config.getConfigFile().getName(), CategoryEntryMods.class));
				return list;
		}

		public static class CategoryEntryGeneral extends GuiConfigEntries.CategoryEntry {

				public CategoryEntryGeneral (GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop) {
						super(owningScreen, owningEntryList, prop);
				}

				@Override
				protected GuiScreen buildChildScreen () {
						Configuration configuration = ConfigHandler.config;
						ConfigElement cat_general = new ConfigElement(configuration.getCategory(Configuration.CATEGORY_GENERAL));
						List<IConfigElement> propertiesOnThisScreen = cat_general.getChildElements();
						String windowTitle = configuration.toString();
						return new GuiConfig(owningScreen, propertiesOnThisScreen, owningScreen.modID, Configuration.CATEGORY_GENERAL, configElement.requiresWorldRestart() || owningScreen.allRequireWorldRestart, configElement.requiresMcRestart() || owningScreen.allRequireMcRestart, windowTitle);
				}
		}

		public static class CategoryEntryMods extends GuiConfigEntries.CategoryEntry {

				public CategoryEntryMods (GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop) {
						super(owningScreen, owningEntryList, prop);
				}

				@Override
				protected GuiScreen buildChildScreen () {
						Configuration configuration = ConfigHandler.config;
						ConfigElement cat_general = new ConfigElement(configuration.getCategory(Global.CATEGORY_MODS));
						List<IConfigElement> propertiesOnThisScreen = cat_general.getChildElements();
						String windowTitle = configuration.toString();
						return new GuiConfig(owningScreen, propertiesOnThisScreen, owningScreen.modID, Global.CATEGORY_MODS, configElement.requiresWorldRestart() || owningScreen.allRequireWorldRestart, configElement.requiresMcRestart() || owningScreen.allRequireMcRestart, windowTitle);
				}
		}
}

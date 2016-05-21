package wurmcraft.wurmatron.common.config;

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import wurmcraft.wurmatron.client.gui.ConfigGui;

import java.util.Set;

public class GuiFactory implements IModGuiFactory {
		@Override
		public void initialize (Minecraft minecraftInstance) {}

		@Override
		public Class<? extends GuiScreen> mainConfigGuiClass () {
				return ConfigGui.class;
		}

		@Override
		public Set<RuntimeOptionCategoryElement> runtimeGuiCategories () {
				return null;
		}

		@Override
		public RuntimeOptionGuiHandler getHandlerFor (RuntimeOptionCategoryElement element) {
				return null;
		}

}

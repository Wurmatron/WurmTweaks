package wurmcraft.wurmatron.common.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import org.lwjgl.input.Keyboard;
import wurmcraft.wurmatron.common.handler.ArmorHandler;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class ToolTipEvent {

		@SubscribeEvent
		public void onRenderTooltip (ItemTooltipEvent e) {
				if (e.itemStack != null && e.itemStack.getItem() instanceof ItemArmor) {
						if (ArmorHandler.armor.containsKey(e.itemStack.getItem())) {
								LogHandler.info("valid armor");
								if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
										LogHandler.info("Advanced");
										e.toolTip.add(EnumChatFormatting.GRAY + "Advanced: ");
										e.toolTip.add(EnumChatFormatting.GRAY + "" + EnumChatFormatting.ITALIC + "Pierce: " + EnumChatFormatting.AQUA + ArmorHandler.armor.get(e.itemStack.getItem())[0]);
										e.toolTip.add(EnumChatFormatting.GRAY + "" + EnumChatFormatting.ITALIC + "Slash: " + EnumChatFormatting.AQUA + ArmorHandler.armor.get(e.itemStack.getItem())[1]);
										e.toolTip.add(EnumChatFormatting.GRAY + "" + EnumChatFormatting.ITALIC + "Crush: " + EnumChatFormatting.AQUA + ArmorHandler.armor.get(e.itemStack.getItem())[2]);
								} else {
										e.toolTip.add(EnumChatFormatting.DARK_GRAY + "Advanced: (Hold " + EnumChatFormatting.GRAY + "Shift" + EnumChatFormatting.DARK_GRAY + ")");
								}
						}
				}
		}
}

package wurmcraft.wurmatron.common.events;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import org.lwjgl.input.Keyboard;
import wurmcraft.wurmatron.common.handler.ArmorHandler;

public class ToolTipEvent {

		@SubscribeEvent
		public void onRenderTooltip (ItemTooltipEvent e) {
				if (e.itemStack != null && e.itemStack.getItem() instanceof ItemArmor) {
						if (ArmorHandler.armor.containsKey(e.itemStack.getItem())) {
								if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
										e.toolTip.add(EnumChatFormatting.GRAY + "Advanced: ");
										e.toolTip.add(EnumChatFormatting.GRAY + "" + EnumChatFormatting.ITALIC + "Pierce: " + EnumChatFormatting.AQUA + ArmorHandler.armor.get(e.itemStack.getItem())[0]);
										e.toolTip.add(EnumChatFormatting.GRAY + "" + EnumChatFormatting.ITALIC + "Slash: " + EnumChatFormatting.AQUA + ArmorHandler.armor.get(e.itemStack.getItem())[1]);
										e.toolTip.add(EnumChatFormatting.GRAY + "" + EnumChatFormatting.ITALIC + "Crush: " + EnumChatFormatting.AQUA + ArmorHandler.armor.get(e.itemStack.getItem())[2]);
								} else {
										e.toolTip.add(EnumChatFormatting.DARK_GRAY + "Advanced: (Hold " + EnumChatFormatting.GRAY + "Shift" + EnumChatFormatting.DARK_GRAY + ")");
								}
						}
				}
				if (e.itemStack != null && e.itemStack.getItem().equals(TFCItems.looseRock))
						if (e.itemStack.getItemDamage() == 10 || e.itemStack.getItemDamage() == 8 || e.itemStack.getItemDamage() == 6 || e.itemStack.getItemDamage() == 20)
								e.toolTip.add(EnumChatFormatting.GRAY + "Used to make flux");
				if (e.itemStack != null && e.itemStack.getItem() == Item.getItemFromBlock(TFCBlocks.stoneIgIn) || e.itemStack.getItem() == Item.getItemFromBlock(TFCBlocks.stoneIgEx))
						e.toolTip.add(EnumChatFormatting.GRAY + "Used to make an stone anvil");
				if (e.itemStack != null && e.itemStack.getItem() == Item.getItemFromBlock(Blocks.bed) || e.itemStack == new ItemStack(Blocks.bed))
						e.toolTip.add(EnumChatFormatting.RED + "Place this below 128 for it to act correctly");
		}
}

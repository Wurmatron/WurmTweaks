package wurmcraft.wurmatron.common.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import mekanism.common.MekanismBlocks;
import net.minecraft.client.Minecraft;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class RightClickEvent {

		@SubscribeEvent
		public void onInteract (EntityInteractEvent e) {
				if (e.entityPlayer.getItemInUse() != null && e.entityPlayer.getItemInUse().getItem().equals(MekanismBlocks.MachineBlock) && e.entityPlayer.getItemInUse().getItemDamage() == 13) {
						LogHandler.debug("Dupe bug detected! Canceling the event");
						Minecraft.getMinecraft().currentScreen = null;
						e.setCanceled(true);
				}
		}
}

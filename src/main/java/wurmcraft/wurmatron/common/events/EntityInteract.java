package wurmcraft.wurmatron.common.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.event.entity.player.EntityInteractEvent;

public class EntityInteract {

		@SubscribeEvent
		public void onEntityInteract (EntityInteractEvent e) {
				if (e.target instanceof EntityVillager)
						e.setCanceled(true);
		}
}

package wurmcraft.wurmatron.common.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import wurmatron.alternateworld.common.AlternateWorld;

public class EntityInteract {

		@SubscribeEvent
		public void onEntityInteract (EntityInteractEvent e) {
				if (e.target instanceof EntityVillager)
						e.setCanceled(true);
				if (e.entityPlayer != null && e.entityPlayer.inventory != null && e.entityPlayer.inventory.getCurrentItem() != null)
						if (e.entityPlayer.inventory.getCurrentItem().getItem().equals(AlternateWorld.itemTeleporter))
								if (e.entityPlayer.dimension != 0)
										e.setCanceled(true);
		}
}

package wurmcraft.wurmatron.common.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class MiningWorldFix {

		@SubscribeEvent
		public void onLogout (PlayerEvent.PlayerLoggedOutEvent e) {
				if (e.player.dimension != 0) {
						e.player.travelToDimension(0);
						e.player.setLocationAndAngles((double) e.player.worldObj.getSpawnPoint().posX, (double) e.player.worldObj.getSpawnPoint().posY, (double) e.player.worldObj.getSpawnPoint().posZ, 0f, 0f);
				}
		}
}

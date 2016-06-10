package wurmcraft.wurmatron.common.events.bloodmagic;

import WayofTime.alchemicalWizardry.api.event.SacrificeKnifeUsedEvent;
import WayofTime.alchemicalWizardry.api.sacrifice.PlayerSacrificeHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class KnifeHandler {

		@SubscribeEvent
		public void onKnifeUsed (SacrificeKnifeUsedEvent e) {
				if (e.shouldDrainHealth) {
						if (e.healthDrained < 20)
								for (int i = 0; i < 49; i++)
										PlayerSacrificeHandler.sacrificePlayerHealth(e.player);
				}
		}
}

package wurmcraft.wurmatron.common.events.bloodmagic;

import WayofTime.alchemicalWizardry.api.event.SacrificeKnifeUsedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class KnifeHandler {

		@SubscribeEvent
		public void onKnifeUsed (SacrificeKnifeUsedEvent e) {
				if (e.shouldDrainHealth) {
						e.player.setHealth(e.player.getHealth() - 50);
				}
		}
}

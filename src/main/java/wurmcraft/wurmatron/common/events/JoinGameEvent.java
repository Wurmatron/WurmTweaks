package wurmcraft.wurmatron.common.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import wurmatron.voidrpg.network.client.SyncPlayerDataMessage;
import wurmcraft.wurmatron.common.network.PacketHandler;
import wurmcraft.wurmatron.common.network.server.UpdateRecipe;
import wurmcraft.wurmatron.common.recipes.RecipeStorage;

public class JoinGameEvent {

		@SubscribeEvent
		public void onJoinEvent (PlayerEvent.PlayerLoggedInEvent e) {
				PacketHandler.sendTo(new SyncPlayerDataMessage(e.player), (EntityPlayerMP) e.player);
				for (String command : RecipeStorage.readAndSplitToLines()) {
						String[] temp = command.split("-");
						PacketHandler.sendTo(new UpdateRecipe(temp), (EntityPlayerMP) e.player);
				}
		}
}

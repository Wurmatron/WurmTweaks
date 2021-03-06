package wurmcraft.wurmatron.common.events;

import com.bioxx.tfc.Core.Player.PlayerInfo;
import com.bioxx.tfc.Core.Player.PlayerManagerTFC;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Handlers.Network.AbstractPacket;
import com.bioxx.tfc.Handlers.Network.InitClientWorldPacket;
import com.bioxx.tfc.TerraFirmaCraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.player.PlayerEvent;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class PlayerClone {

		@SubscribeEvent
		public void onClonePlayer (PlayerEvent.Clone e) {
				LogHandler.info("Sycing Player Data");
				AbstractPacket pkt = new InitClientWorldPacket(e.entityPlayer);
				TerraFirmaCraft.PACKET_PIPELINE.sendTo(pkt, (EntityPlayerMP) e.entityPlayer);
//				AbstractPacket pkt = new PlayerUpdatePacket(e.entityPlayer, 3);
//				TerraFirmaCraft.PACKET_PIPELINE.sendTo(pkt, (EntityPlayerMP) e.entityPlayer);
				PlayerInfo pi = PlayerManagerTFC.getInstance().getPlayerInfoFromPlayer(e.entityPlayer);
				if (pi.tempSkills != null)
						TFC_Core.setSkillStats(e.entityPlayer, pi.tempSkills);
		}
}

package wurmcraft.wurmatron.client.proxy;

import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import wurmcraft.wurmatron.common.proxy.CommonProxy;

public class ClientProxy extends CommonProxy {

		@Override
		public EntityPlayer getPlayerEntity (MessageContext ctx) {
				return (ctx.side.isClient() ? Minecraft.getMinecraft().thePlayer : super.getPlayerEntity(ctx));
		}
}

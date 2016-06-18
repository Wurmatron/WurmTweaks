package wurmcraft.wurmatron.common.network;


import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import wurmcraft.wurmatron.common.network.server.SendConfigSettings;
import wurmcraft.wurmatron.common.network.server.UpdateRecipe;
import wurmcraft.wurmatron.common.reference.Global;

public class PacketHandler {

		private static byte ID = 0;
		private static final SimpleNetworkWrapper wrapper = NetworkRegistry.INSTANCE.newSimpleChannel(Global.MODID);

		/**
		 * Register Packets to Network Registry
		 */
		public static void registerPackets () {
				// Server - > Client
				registerMessage(SendConfigSettings.class);
				registerMessage(UpdateRecipe.class);
				// Client - > Server
		}

		/**
		 * Gets Side of Message and register's it
		 */
		private static <T extends CustomMessage<T> & IMessageHandler<T, IMessage>> void registerMessage (Class<T> msg) {
				if (CustomMessage.ClientMessage.class.isAssignableFrom(msg)) {
						PacketHandler.wrapper.registerMessage(msg, msg, ID++, Side.CLIENT);
				} else if (CustomMessage.ServerMessage.class.isAssignableFrom(msg)) {
						PacketHandler.wrapper.registerMessage(msg, msg, ID++, Side.SERVER);
				} else {
						PacketHandler.wrapper.registerMessage(msg, msg, ID, Side.CLIENT);
						PacketHandler.wrapper.registerMessage(msg, msg, ID++, Side.SERVER);
				}
		}

		/**
		 * Server - > Player
		 */
		public static void sendTo (IMessage msg, EntityPlayerMP player) {
				PacketHandler.wrapper.sendTo(msg, player);
		}

		/**
		 * Server- > All Players
		 */
		public static void sendToAll (IMessage msg) {
				PacketHandler.wrapper.sendToAll(msg);
		}

		/**
		 * Server - > Area (TargetPoint)
		 */
		public static void sendToAllAround (IMessage msg, NetworkRegistry.TargetPoint tp) {
				PacketHandler.wrapper.sendToAllAround(msg, tp);
		}

		/**
		 * Server - > Area (Cords)
		 */
		public static void sendToAllAround (IMessage msg, int dim, double x, double y, double z, double r) {
				PacketHandler.sendToAllAround(msg, new NetworkRegistry.TargetPoint(dim, x, y, z, r));
		}

		/**
		 * Server - > Area (Radius)
		 */
		public static void sendToAllAround (IMessage msg, EntityPlayer player, double r) {
				PacketHandler.sendToAllAround(msg, player.worldObj.provider.dimensionId, player.posX, player.posY, player.posZ, r);
		}

		/**
		 * Server - > Player in Dimension
		 */
		public static void sendToDimension (IMessage msg, int dimID) {
				PacketHandler.wrapper.sendToDimension(msg, dimID);
		}

		/**
		 * Client - > Server
		 */
		public static void sendToServer (IMessage msg) {
				PacketHandler.wrapper.sendToServer(msg);
		}
}

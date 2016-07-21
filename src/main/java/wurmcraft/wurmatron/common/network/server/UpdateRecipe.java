package wurmcraft.wurmatron.common.network.server;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import wurmcraft.wurmatron.common.network.CustomMessage;
import wurmcraft.wurmatron.common.utils.recipeHelper.RecipeCreator;

import java.io.IOException;

public class UpdateRecipe extends CustomMessage.ClientMessage<UpdateRecipe> {

		private NBTTagCompound data = new NBTTagCompound();

		public UpdateRecipe () {
		}

		public UpdateRecipe (String[] args) {
				String wurmCommand = "";
				for (String arg : args)
						wurmCommand = wurmCommand + "-" + arg;
				data.setString("Input", wurmCommand);
		}

		@Override
		protected void read (PacketBuffer buff) throws IOException {
				data = buff.readNBTTagCompoundFromBuffer();
		}

		@Override
		protected void write (PacketBuffer buff) throws IOException {
				buff.writeNBTTagCompoundToBuffer(data);
		}

		@Override
		public void process (EntityPlayer player, Side side) {
				if (side.isClient()) {
						String[] input = data.getString("Input").split("-");
						String[] args = new String[input.length];
						for (int l = 1; l < input.length; l++)
								args[l - 1] = input[l];
						if (args[1].equalsIgnoreCase("shapeless")) {
								RecipeCreator.addShapelessRecipe(args, null, false);
								player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA + "[Modpack]: " + EnumChatFormatting.DARK_GREEN + "my master has added an recipe."));
						}
						if (args[1].equalsIgnoreCase("shaped")) {
								RecipeCreator.addShapedRecipe(args, null, false);
								player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA + "[Modpack]: " + EnumChatFormatting.DARK_GREEN + "my master has added an recipe."));
						}
				}
		}
}

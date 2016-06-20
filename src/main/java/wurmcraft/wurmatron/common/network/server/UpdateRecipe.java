package wurmcraft.wurmatron.common.network.server;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import wurmcraft.wurmatron.common.network.CustomMessage;
import wurmcraft.wurmatron.common.utils.recipeHelper.RecipeCreator;

import java.io.IOException;
import java.util.List;

public class UpdateRecipe extends CustomMessage.ClientMessage<UpdateRecipe> {

		private NBTTagCompound data;

		public UpdateRecipe () {
		}

		public UpdateRecipe (String[] args) {
				String wurmCommand = "";
				for (String arg : args)
						wurmCommand = wurmCommand + "$" + arg;
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
				String[] args = data.getString("input").split("$");
				if (args[1].equalsIgnoreCase("shapeless")) {
						RecipeCreator.addShapelessRecipe(args, null);
						player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA + "[Modpack]: " + EnumChatFormatting.DARK_GREEN + "my master has added an recipe."));
				}
				if (args[1].equalsIgnoreCase("shaped")) {
						RecipeCreator.addShapedRecipe(args, null);
						player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA + "[Modpack]: " + EnumChatFormatting.DARK_GREEN + "my master has added an recipe."));
				}
				if (args[0].equalsIgnoreCase("removeRecipe") || args[0].equalsIgnoreCase("removeRec") || args[0].equalsIgnoreCase("remRec")) {
						ItemStack stack = RecipeCreator.getStackFromString(args[1]);
						List recipes = CraftingManager.getInstance().getRecipeList();
						int index = 0;
						for (Object recipe : recipes) {
								if (recipe instanceof IRecipe) {
										if (((IRecipe) recipe).getRecipeOutput() != null)
												if (((IRecipe) recipe).getRecipeOutput().isItemEqual(stack))
														CraftingManager.getInstance().getRecipeList().remove(index);
								}
								index++;
						}
				}
		}
}

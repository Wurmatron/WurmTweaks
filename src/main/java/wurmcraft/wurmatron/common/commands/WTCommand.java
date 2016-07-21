package wurmcraft.wurmatron.common.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import wurmcraft.wurmatron.common.network.PacketHandler;
import wurmcraft.wurmatron.common.network.server.UpdateRecipe;
import wurmcraft.wurmatron.common.reference.Global;
import wurmcraft.wurmatron.common.utils.recipeHelper.RecipeCreator;

import java.util.ArrayList;
import java.util.List;


// TODO Redo when its not 4AM
public class WTCommand extends CommandBase {

		private final List aliases;

		public WTCommand () {
				aliases = new ArrayList();
				aliases.add("wurmtweaks");
				aliases.add("wurm");
		}

		@Override
		public String getCommandName () {
				return "wt";
		}

		@Override
		public String getCommandUsage (ICommandSender sender) {
				return "wt <addRecipe | removeRecipe>";
		}

		@Override
		public List getCommandAliases () {
				return aliases;
		}

		@Override
		public void processCommand (ICommandSender sender, String[] argString) {
				EntityPlayer player = getCommandSenderAsPlayer(sender);
				if (player != null && !sender.getEntityWorld().isRemote) {
						if (Global.GODS.contains(sender.getCommandSenderName())) {
								if (argString.length == 0) {
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "Invalid Arguments"));
										return;
								}
								// Add Recipe
								if (argString[0].equalsIgnoreCase("addRecipe") || argString[0].equalsIgnoreCase("addRec")) {
										if (argString.length > 2 && argString[1] != null && argString[2] != null) {
												if (argString[1].equalsIgnoreCase("shaped")) {
														RecipeCreator.addShapedRecipe(argString, sender,true);
												}
												if (argString[1].equalsIgnoreCase("shapeless")) {
														RecipeCreator.addShapelessRecipe(argString, sender,true);
												}
										} else {
												sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "/wt addRecipe <shaped | shapeless> <output> ..."));
										}
								} else if (argString[0].equalsIgnoreCase("removeRecipe") || argString[0].equalsIgnoreCase("removeRec") || argString[0].equalsIgnoreCase("remRec")) {
										if (argString[1].contains(":")) {
												ItemStack stack = RecipeCreator.getStackFromString(argString[1]);
												List recipes = CraftingManager.getInstance().getRecipeList();
												int index = 0;
												for (Object recipe : recipes) {
														if (recipe instanceof IRecipe) {
																if (((IRecipe) recipe).getRecipeOutput() != null)
																		if (((IRecipe) recipe).getRecipeOutput().isItemEqual(stack)) {
																				CraftingManager.getInstance().getRecipeList().remove(index);
																				sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "Recipe removed for " + stack.getItem().getUnlocalizedName()));
																				PacketHandler.sendToAll(new UpdateRecipe(argString));
																				return;
																		}
														}
														index++;
												}
										} else {
												sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "/wt removeRecipe ItemStack"));
										}
								}
						} else {
								sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "You are not my master"));
								return;
						}
				}
		}

		@Override
		public boolean canCommandSenderUseCommand (ICommandSender sender) {
				return true;
		}

		@Override
		public List addTabCompletionOptions (ICommandSender sender, String[] input) {
				return null;
		}

		@Override
		public boolean isUsernameIndex (String[] name, int num) {
				return false;
		}

		@Override
		public int compareTo (Object o) {
				return 0;
		}
}

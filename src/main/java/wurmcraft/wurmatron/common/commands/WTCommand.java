package wurmcraft.wurmatron.common.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
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
				return "wt <addRecipe | removeRecipe | addFurnace>";
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
								if (argString[0].equalsIgnoreCase("addRecipe")) {
										if (argString.length > 2 && argString[1] != null && argString[2] != null) {
												if (argString[1].equalsIgnoreCase("shaped")) {
												}
												// TODO server/client support
												if (argString[1].equalsIgnoreCase("shapeless")) {
														RecipeCreator.addShapelessRecipe(argString, sender);
												}
										} else {
												sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "/wt addRecipe <shaped | shapeless> <output> ..."));
										}
								} else {}
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

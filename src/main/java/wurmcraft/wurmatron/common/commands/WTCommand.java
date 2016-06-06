package wurmcraft.wurmatron.common.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.ArrayList;
import java.util.List;

public class WTCommand extends CommandBase {

		private final List aliases;

		public WTCommand() {
				aliases = new ArrayList();;
				aliases.add("wurmtweaks");
				aliases.add("wurm");
		}

		@Override
		public String getCommandName () {
				return "wt";
		}

		@Override
		public String getCommandUsage (ICommandSender sender) {
				return "wt <addRecipe | removeRecipe | reload | setLocation";
		}

		@Override
		public List getCommandAliases () {
				return aliases;
		}

		@Override
		public void processCommand (ICommandSender sender, String[] argString) {
				EntityPlayer player = getCommandSenderAsPlayer(sender);
				if(player != null && !sender.getEntityWorld().isRemote) {
						if(Global.GODS.contains(sender.getCommandSenderName())) {
								if(argString.length == 0) {
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "Invalid Arguments"));
										return;
								}

								// TODO Finish Command

						}
				}
		}

		@Override
		public boolean canCommandSenderUseCommand (ICommandSender sender) {
				return true;
		}

		@Override
		public List addTabCompletionOptions (ICommandSender p_71516_1_, String[] p_71516_2_) {
				return null;
		}

		@Override
		public boolean isUsernameIndex (String[] p_82358_1_, int p_82358_2_) {
				return false;
		}

		@Override
		public int compareTo (Object o) {
				return 0;
		}
}

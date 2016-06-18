package wurmcraft.wurmatron.common.utils.recipeHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import wurmcraft.wurmatron.common.network.PacketHandler;
import wurmcraft.wurmatron.common.network.server.UpdateRecipe;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

import java.util.ArrayList;

public class RecipeCreator {

		public static boolean addShapelessRecipe (ItemStack output, ArrayList<Object> input, ICommandSender sender, String[] originalCommand) {
				if (output != null && input != null && input.size() > 0) {
						RecipeHelper r = new RecipeHelper();
						if (input.size() == 1) {
								r.addShapeless(output, input.get(0));
								PacketHandler.sendToAll(new UpdateRecipe(originalCommand));
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Output: " + output.getItem().getUnlocalizedName() + " M: " + output.getItemDamage() + " x" + output.stackSize));
								for (Object recipe : input) {
										if (recipe instanceof ItemStack) {
												ItemStack rec = (ItemStack) recipe;
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + rec.getItem().getUnlocalizedName() + " M: " + rec.getItemDamage() + " x" + rec.stackSize));
										}
										if (recipe instanceof String) {
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + "Ore: " + recipe));
										}
								}
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Added recipe for " + output.getItem().getUnlocalizedName()));
								return true;
						}
						if (input.size() == 2) {
								r.addShapeless(output, input.get(0), input.get(1));
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Output: " + output.getItem().getUnlocalizedName() + " M: " + output.getItemDamage() + " x" + output.stackSize));
								for (Object recipe : input) {
										if (recipe instanceof ItemStack) {
												ItemStack rec = (ItemStack) recipe;
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + rec.getItem().getUnlocalizedName() + " M: " + rec.getItemDamage() + " x" + rec.stackSize));
										}
										if (recipe instanceof String) {
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + "Ore: " + recipe));
										}
								}
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Added recipe for " + output.getItem().getUnlocalizedName()));
								return true;
						}
						if (input.size() == 3) {
								r.addShapeless(output, input.get(0), input.get(1), input.get(2));
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Output: " + output.getItem().getUnlocalizedName() + " M: " + output.getItemDamage() + " x" + output.stackSize));
								for (Object recipe : input) {
										if (recipe instanceof ItemStack) {
												ItemStack rec = (ItemStack) recipe;
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + rec.getItem().getUnlocalizedName() + " M: " + rec.getItemDamage() + " x" + rec.stackSize));
										}
										if (recipe instanceof String) {
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + "Ore: " + recipe));
										}
								}
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Added recipe for " + output.getItem().getUnlocalizedName()));
								return true;
						}
						if (input.size() == 4) {
								r.addShapeless(output, input.get(0), input.get(1), input.get(2), input.get(3));
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Output: " + output.getItem().getUnlocalizedName() + " M: " + output.getItemDamage() + " x" + output.stackSize));
								for (Object recipe : input) {
										if (recipe instanceof ItemStack) {
												ItemStack rec = (ItemStack) recipe;
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + rec.getItem().getUnlocalizedName() + " M: " + rec.getItemDamage() + " x" + rec.stackSize));
										}
										if (recipe instanceof String) {
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + "Ore: " + recipe));
										}
								}
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Added recipe for " + output.getItem().getUnlocalizedName()));
								return true;
						}
						if (input.size() == 5) {
								r.addShapeless(output, input.get(0), input.get(1), input.get(2), input.get(3), input.get(4));
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Output: " + output.getItem().getUnlocalizedName() + " M: " + output.getItemDamage() + " x" + output.stackSize));
								for (Object recipe : input) {
										if (recipe instanceof ItemStack) {
												ItemStack rec = (ItemStack) recipe;
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + rec.getItem().getUnlocalizedName() + " M: " + rec.getItemDamage() + " x" + rec.stackSize));
										}
										if (recipe instanceof String) {
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + "Ore: " + recipe));
										}
								}
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Added recipe for " + output.getItem().getUnlocalizedName()));
								return true;
						}
						if (input.size() == 6) {
								r.addShapeless(output, input.get(0), input.get(1), input.get(2), input.get(3), input.get(4), input.get(5));
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Output: " + output.getItem().getUnlocalizedName() + " M: " + output.getItemDamage() + " x" + output.stackSize));
								for (Object recipe : input) {
										if (recipe instanceof ItemStack) {
												ItemStack rec = (ItemStack) recipe;
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + rec.getItem().getUnlocalizedName() + " M: " + rec.getItemDamage() + " x" + rec.stackSize));
										}
										if (recipe instanceof String) {
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + "Ore: " + recipe));
										}
								}
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Added recipe for " + output.getItem().getUnlocalizedName()));
								return true;
						}
						if (input.size() == 7) {
								r.addShapeless(output, input.get(0), input.get(1), input.get(2), input.get(3), input.get(4), input.get(5), input.get(6));
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Output: " + output.getItem().getUnlocalizedName() + " M: " + output.getItemDamage() + " x" + output.stackSize));
								for (Object recipe : input) {
										if (recipe instanceof ItemStack) {
												ItemStack rec = (ItemStack) recipe;
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + rec.getItem().getUnlocalizedName() + " M: " + rec.getItemDamage() + " x" + rec.stackSize));
										}
										if (recipe instanceof String) {
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + "Ore: " + recipe));
										}
								}
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Added recipe for " + output.getItem().getUnlocalizedName()));
								return true;
						}
						if (input.size() == 8) {
								r.addShapeless(output, input.get(0), input.get(1), input.get(2), input.get(3), input.get(4), input.get(5), input.get(6), input.get(7));
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Output: " + output.getItem().getUnlocalizedName() + " M: " + output.getItemDamage() + " x" + output.stackSize));
								for (Object recipe : input) {
										if (recipe instanceof ItemStack) {
												ItemStack rec = (ItemStack) recipe;
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + rec.getItem().getUnlocalizedName() + " M: " + rec.getItemDamage() + " x" + rec.stackSize));
										}
										if (recipe instanceof String) {
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + "Ore: " + recipe));
										}
								}
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Added recipe for " + output.getItem().getUnlocalizedName()));
								return true;
						}
						if (input.size() == 9) {
								r.addShapeless(output, input.get(0), input.get(1), input.get(2), input.get(3), input.get(4), input.get(5), input.get(6), input.get(7), input.get(8));
								sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Output: " + output.getItem().getUnlocalizedName() + " M: " + output.getItemDamage() + " x" + output.stackSize));
								for (Object recipe : input) {
										if (recipe instanceof ItemStack) {
												ItemStack rec = (ItemStack) recipe;
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + rec.getItem().getUnlocalizedName() + " M: " + rec.getItemDamage() + " x" + rec.stackSize));
										}
										if (recipe instanceof String) {
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Input: " + "Ore: " + recipe));
										}
								}
								if (sender != null)
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Added recipe for " + output.getItem().getUnlocalizedName()));
								return true;
						}
				}
				return false;
		}

		public static boolean addShapelessRecipe (String[] args, ICommandSender sender) {
				if (args != null)
						if (args.length > 3) {
								if (args[0] != null && args[0].equalsIgnoreCase("addRecipe") && args[1] != null && args[1].equalsIgnoreCase("shapeless")) {
										if (args[2].contains(":")) {
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Output: " + args[2]));
												ItemStack output = getStackFromString(args[2]);
												ArrayList<Object> inputs = new ArrayList<Object>();
												for (int l = 3; l < args.length; l++) {
														if (args[l].contains(":"))
																inputs.add(getStackFromString(args[l]));
														if (args[l].startsWith("'"))
																inputs.add(args[l].substring(1, args[l].length() - 1));
												}
												return addShapelessRecipe(output, inputs, sender, args);
										}
								} else {
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "Error detecting recipe type"));
								}
						} else {
								if (sender != null) {
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Enter Valid shapeless recipe"));
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.AQUA + "/wt addRecipe shapeless output inputs..."));
										sender.addChatMessage(new ChatComponentText(EnumChatFormatting.AQUA + "/wt addRecipe shapeless minecraft:diamond minecraft:dirt"));
								}
						}
				return false;
		}

		public static ItemStack getStackFromString (String stack) {
				if (stack != null && stack.contains(":")) {
						if (stack.contains("@")) {
								if (stack.contains("%")) {
										String outputModid = stack.substring(0, stack.indexOf(":"));
										String outputName = stack.substring(stack.indexOf(":") + 1, stack.indexOf("@"));
										String outputMeta = stack.substring(stack.indexOf("@") + 1, stack.indexOf("%"));
										String outputSize = stack.substring(stack.indexOf("%") + 1, stack.length());
										return new ItemStack(GameRegistry.findItem(outputModid, outputName), Integer.parseInt(outputSize), Integer.parseInt(outputMeta));
								} else {
										// Invalid Stack
								}
						} else {
								String outputModid = stack.substring(0, stack.indexOf(":"));
								String outputName = stack.substring(stack.indexOf(":") + 1, stack.length());
								return new ItemStack(GameRegistry.findItem(outputModid, outputName), 1, 0);
						}
				}
				return null;
		}
}

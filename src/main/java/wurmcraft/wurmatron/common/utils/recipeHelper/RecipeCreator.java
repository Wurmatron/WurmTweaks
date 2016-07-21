package wurmcraft.wurmatron.common.utils.recipeHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.oredict.ShapedOreRecipe;
import wurmcraft.wurmatron.common.network.PacketHandler;
import wurmcraft.wurmatron.common.network.server.UpdateRecipe;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

import java.util.ArrayList;
import java.util.List;

public class RecipeCreator {

		public static boolean addShapelessRecipe (ItemStack output, ArrayList<Object> input, ICommandSender sender, String[] originalCommand, boolean sending) {
				if (output != null && input != null && input.size() > 0) {
						RecipeHelper r = new RecipeHelper();
						if (input.size() == 1) {
								r.addShapeless(output, input.get(0));
								if (sending)
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

		public static boolean addShapelessRecipe (String[] args, ICommandSender sender, boolean packet) {
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
												return addShapelessRecipe(output, inputs, sender, args, packet);
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

		public static boolean addShapedRecipe (String[] args, ICommandSender sender, boolean packet) {
				if (args != null && args.length > 3) {
						if (args[2].contains(":")) {
								ItemStack output = getStackFromString(args[2]);
								if (output != null) {
										List<Object> data = new ArrayList<Object>();
										for (String d : args) {
												if (d != null && d != "")
														if (args[0] != null && args[1] != null)
																if (!d.equals(args[0]) || !d.equals(args[1])) {
																		if (d.contains(":")) {
																				if (!getStackFromString(d).isItemEqual(output)) {
																						data.add(getStackFromString(d) != null ? getStackFromString(d) : null);
																				}
																		} else if (d.contains("'")) {
																				data.add(d.replace("'", "").charAt(0));
																		} else if (d.contains("\"")) {
																				data.add(d.replace("\"", ""));
																		} else if (d.startsWith("[")) {
																				data.add(d.replace("[", "").replace("]", ""));
																		} else if (sender != null)
																				sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Unknown input: " + args[2]));
																		if (sender != null)
																				sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Output: " + output.getItem().getUnlocalizedName()));
																		for (Object recipe : data) {
																				if (sender != null)
																						if (recipe instanceof ItemStack)
																								sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Arg: " + ((ItemStack) recipe).getItem().getUnlocalizedName()));
																						else if (recipe instanceof String)
																								sender.addChatMessage(new ChatComponentText(EnumChatFormatting.AQUA + "Arg: " + recipe));
																						else if (recipe instanceof Character)
																								sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Arg: " + recipe));
																						else
																								sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLACK + "Arg: " + recipe));
																		}
																}
										}
										if (output != null && data != null) {
												String out = "";
												for (Object f : data) {
														if (f instanceof ItemStack)
																out = out + EnumChatFormatting.GREEN + ((ItemStack) f).getItem().getUnlocalizedName() + ",";
														else if (f instanceof String)
																out = out + EnumChatFormatting.AQUA + f + ",";
														else if (f instanceof Character)
																out = out + EnumChatFormatting.BLUE + f + ",";
														else
																out = out + EnumChatFormatting.BLACK + f + ",";
												}
												if (sender != null)
														sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Recipe: " + EnumChatFormatting.GREEN + output.getItem().getUnlocalizedName() + "," + EnumChatFormatting.LIGHT_PURPLE + out));
												GameRegistry.addRecipe(new ShapedOreRecipe(output, data.toArray()));
												if (packet)
														PacketHandler.sendToAll(new UpdateRecipe(args));
												return true;
										}
								}
						}
				}
				if (sender != null) {
						sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Enter Valid shapeless recipe"));
						sender.addChatMessage(new ChatComponentText(EnumChatFormatting.AQUA + "/wt addRecipe shaped output inputs..."));
						sender.addChatMessage(new ChatComponentText(EnumChatFormatting.AQUA + "[oreDictEntry]"));
				}
				return false;
		}

}

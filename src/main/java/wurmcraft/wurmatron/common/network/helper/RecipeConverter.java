package wurmcraft.wurmatron.common.network.helper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.ArrayList;

public class RecipeConverter {

		public static boolean isStringConverted (String testString) {
				if (testString.startsWith("<"))
						return true;
				return false;
		}

		public static String convertRawToUsable (String rawRecipe) {
				if (!isStringConverted(rawRecipe)) {
						if (getRecipeTypeFromRaw(rawRecipe).equalsIgnoreCase("shaped"))
								return rawRecipe.replaceAll("addShaped", "");
						if (getRecipeTypeFromRaw(rawRecipe).equalsIgnoreCase("shapeless"))
								return rawRecipe.replaceAll("addShapeless", "");
						return null;
				}
				return rawRecipe;
		}

		public static String getRecipeTypeFromRaw (String recipe) {
				if (recipe.startsWith("addShaped"))
						return "shaped";
				else if (recipe.startsWith("addShapeless"))
						return "shapeless";
				else
						return "null";
		}

		public static void addShapedStringRecipe (String input) {
				if(isStringConverted(input)) {
						ShapedOreRecipe recipe = stringToShapedRecipe(input);
						if (recipe != null)
								GameRegistry.addRecipe(recipe);
				} else {
						ShapedOreRecipe recipe = stringToShapedRecipe(convertRawToUsable(input));
						if (recipe != null)
								GameRegistry.addRecipe(recipe);
				}
		}

		public static void addShapelessStringRecipe (String input) {
				if(isStringConverted(input)) {
						ShapelessOreRecipe recipe = stringToShapelessRecipe(input);
						if (recipe != null)
								GameRegistry.addRecipe(recipe);
				} else {
						ShapelessOreRecipe recipe = stringToShapelessRecipe(convertRawToUsable(input));
						if (recipe != null)
								GameRegistry.addRecipe(recipe);
				}
		}

		// addShaped(<ore:oreName>,[<>,<>,<>], [<>,<>,<>], [<>,<>,<>]);
		// addShaped(<modid:unlocalizedName*stackSize@meta&nbt>,[<>,<>,<>], [<>,<>,<>], [<>,<>,<>]);
		public static ShapedOreRecipe stringToShapedRecipe (String input) {
				String[] stacks = input.split(">");
				ItemStack output = stringToStack(stacks[0].substring(stacks[0].indexOf("<") + 1, stacks[0].indexOf(">")));
				ArrayList<Object> recipeItems = new ArrayList<Object>();
				for (int i = 1; i < 9; i++) {
						if (isStackOrOre(stacks[i]).equalsIgnoreCase("stack"))
								recipeItems.add(i - 1, stringToStack(stacks[i].substring(stacks[i].indexOf("<") + 1, stacks[i].indexOf(">"))));
						else if (isStackOrOre(stacks[i]).equalsIgnoreCase("ore"))
								recipeItems.add(i - 1, stacks[i]);
						else
								recipeItems.add(i - 1, null);
				}
				return new ShapedOreRecipe(output, "ABC", "DEF", "GHI", 'A', recipeItems.get(0), 'B', recipeItems.get(1), 'C', recipeItems.get(2), 'D', recipeItems.get(3), 'E', recipeItems.get(4), 'F', recipeItems.get(5), 'G', recipeItems.get(6), 'H', recipeItems.get(7), 'I', recipeItems.get(8));
		}

		// addShapeless(<ore:oreName>,<>,<>,<>,<>,<>,<>,<>,<>,<>);
		// addShapeless(<modid:unlocalizedName*stackSize@meta&nbt>,<>,<>,<>,<>,<>,<>,<>,<>,<>);
		public static ShapelessOreRecipe stringToShapelessRecipe (String input) {
				String[] stacks = input.split(">");
				ItemStack output = stringToStack(stacks[0].substring(stacks[0].indexOf("<") + 1, stacks[0].indexOf(">")));
				ArrayList<Object> recipeItems = new ArrayList<Object>();
				for (int i = 1; i < stacks.length; i++) {
						if (isStackOrOre(stacks[i]).equalsIgnoreCase("stack"))
								recipeItems.add(i - 1, stringToStack(stacks[i].substring(stacks[i].indexOf("<") + 1, stacks[i].indexOf(">"))));
						else if (isStackOrOre(stacks[i]).equalsIgnoreCase("ore"))
								recipeItems.add(i - 1, stacks[i]);
				}
				if (recipeItems.size() > 0) {
						if (recipeItems.size() == 1)
								return new ShapelessOreRecipe(output, recipeItems.get(0));
						if (recipeItems.size() == 2)
								return new ShapelessOreRecipe(output, recipeItems.get(0), recipeItems.get(1));
						if (recipeItems.size() == 3)
								return new ShapelessOreRecipe(output, recipeItems.get(0), recipeItems.get(1), recipeItems.get(2));
						if (recipeItems.size() == 4)
								return new ShapelessOreRecipe(output, recipeItems.get(0), recipeItems.get(1), recipeItems.get(2), recipeItems.get(3));
						if (recipeItems.size() == 5)
								return new ShapelessOreRecipe(output, recipeItems.get(0), recipeItems.get(1), recipeItems.get(2), recipeItems.get(3), recipeItems.get(4));
						if (recipeItems.size() == 6)
								return new ShapelessOreRecipe(output, recipeItems.get(0), recipeItems.get(1), recipeItems.get(2), recipeItems.get(3), recipeItems.get(4), recipeItems.get(5));
						if (recipeItems.size() == 7)
								return new ShapelessOreRecipe(output, recipeItems.get(0), recipeItems.get(1), recipeItems.get(2), recipeItems.get(3), recipeItems.get(4), recipeItems.get(5), recipeItems.get(6));
						if (recipeItems.size() == 8)
								return new ShapelessOreRecipe(output, recipeItems.get(0), recipeItems.get(1), recipeItems.get(2), recipeItems.get(3), recipeItems.get(4), recipeItems.get(5), recipeItems.get(6), recipeItems.get(7));
						if (recipeItems.size() == 9)
								return new ShapelessOreRecipe(output, recipeItems.get(0), recipeItems.get(1), recipeItems.get(2), recipeItems.get(3), recipeItems.get(4), recipeItems.get(5), recipeItems.get(6), recipeItems.get(7), recipeItems.get(8));

				}
				return null;
		}

		public static String stackToString (ItemStack stack) {
				String modid = GameRegistry.findUniqueIdentifierFor(stack.getItem()).modId;
				String name = stack.getUnlocalizedName();
				int stackSize = stack.stackSize;
				int meta = stack.getItemDamage();
				NBTTagCompound nbt = stack.getTagCompound();
				return modid + ":" + name + "*" + stackSize + "@" + meta + "&" + nbt.toString();
		}

		public static ItemStack stringToStack (String stack) {
				String modid = stack.substring(0, stack.indexOf(":"));
				String name = stack.substring(stack.indexOf(":") + 1, stack.indexOf("*"));
				int stackSize = Integer.getInteger(stack.substring(stack.indexOf("*") + 1, stack.indexOf("@")));
				int meta = Integer.getInteger(stack.substring(stack.indexOf("@") + 1, stack.indexOf("&")));
				try {
						NBTTagCompound nbt = (NBTTagCompound) JsonToNBT.func_150315_a(stack.substring(stack.indexOf("&") + 1, stack.length()));
						if (stackSize > 0 && stackSize <= 64) {
								ItemStack item = new ItemStack(GameRegistry.findItem(modid, name), stackSize, meta);
								item.setTagCompound(nbt);
								return item;
						}
				} catch (NBTException e) {
						e.printStackTrace();
				}
				return new ItemStack(GameRegistry.findItem(modid, name), stackSize, meta);
		}

		public static String isStackOrOre (String stack) {
				if (stack != null)
						if (stack.contains(":") && stack.contains("*") && stack.contains("@") && stack.contains("&"))
								return "stack";
						else if (stack.startsWith("ore"))
								return "ore";
				return null;
		}
}

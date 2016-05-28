package wurmcraft.wurmatron.common.recipes;

import cpw.mods.fml.common.Optional;
import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.ArrayList;

public class RecipeHelper {

		public static final RecipeHelper instance = new RecipeHelper();

		public static ArrayList<String> dye = new ArrayList<String>();

		public RecipeHelper() {
				dye.add(0,"dyeWhite");
				dye.add(1,"dyeOrange");
				dye.add(2, "dyeMagenta");
				dye.add(3,"dyeLightBlue");
				dye.add(4,"dyeYellow");
				dye.add(5,"dyeLime");
				dye.add(6,"dyePink");
				dye.add(7,"dyeGray");
				dye.add(8,"dyeLightGray");
				dye.add(9,"dyeCyan");
				dye.add(10,"dyePurple");
				dye.add(11,"dyeBlue");
				dye.add(12,"dyeBrown");
				dye.add(13,"dyeGreen");
				dye.add(14,"dyeRed");
				dye.add(15, "dyeBlack");
		}

		/**
		 * Adds a shaped recipe to the game
		 *
		 * @param output Output ItemStack
		 * @param recipe Recipe for the output ItemStack
		 *               Example: addShaped(new ItemStack(ModItems.diamond),"AAA", "ABA", "AAA", 'A', new ItemStack(ModItems.apple), 'B',new ItemStack(ModItems.nether_star))
		 */
		public void addShaped (ItemStack output, Object... recipe) {
				if (RecipeChecker.checkStack(output)) {
						RecipeChecker.checkAndHandle(new ShapedOreRecipe(output, recipe));
				}
		}

		public void addShaped (Item output, Object... recipe) {
				if (RecipeChecker.checkStack(new ItemStack(output))) {
						RecipeChecker.checkAndHandle(new ShapedOreRecipe(output, recipe));
				}
		}

		public void addShaped (Block output, Object... recipe) {
				if (RecipeChecker.checkStack(new ItemStack(output))) {
						RecipeChecker.checkAndHandle(new ShapedOreRecipe(output, recipe));
				}
		}

		/**
		 * Adds a shapeless recipe to the game
		 *
		 * @param output Output ItemStack
		 * @param input  ItemStacks required to craft the output stack (max 9)
		 *               Example:   addShapeless(new ItemStack(ModItems.diamond),new ItemStack(ModItems.nether_star), new ItemStack(ModItems.nether_star),new ItemStack(ModItems.nether_star))
		 */
		public void addShapeless (ItemStack output, Object... input) {
				if (RecipeChecker.checkStack(output)) {
						RecipeChecker.checkAndHandle(new ShapelessOreRecipe(output, input));
				}
		}

		public void addShapeless (Item output, Object... input) {
				if (RecipeChecker.checkStack(new ItemStack(output))) {
						RecipeChecker.checkAndHandle(new ShapelessOreRecipe(output, input));
				}
		}

		public void addShapeless (Block output, Object... input) {
				if (RecipeChecker.checkStack(new ItemStack(output))) {
						RecipeChecker.checkAndHandle(new ShapelessOreRecipe(output, input));
				}
		}

		public void addCircleWCenter (ItemStack output, Object outer, Object center) {
				addShaped(output, "OOO", "OCO", "OOO", 'O', outer, 'C', center);
		}

		public void addCircleWCenter (Item output, Object outer, Object center) {
				addShaped(output, "OOO", "OCO", "OOO", 'O', outer, 'C', center);
		}

		public void addCircleWCenter (Block output, Object outer, Object center) {
				addShaped(output, "OOO", "OCO", "OOO", 'O', outer, 'C', center);
		}

		public void addCircle (ItemStack output, Object outer) {
				addShaped(output, "OOO", "O O", "OOO", 'O', outer);
		}

		public void addCircle (Item output, Object outer) {
				addShaped(output, "OOO", "O O", "OOO", 'O', outer);
		}

		public void addCircle (Block output, Object outer) {
				addShaped(output, "OOO", "O O", "OOO", 'O', outer);
		}

		public void addCross (ItemStack output, ItemStack partA, ItemStack partB, boolean flip) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				if (flip) addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}

		public void addCross (ItemStack output, Object partA, Object partB) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}

		public void addCross (ItemStack output, Object partA, Object partB, boolean flip) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				if (flip) addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}

		public void add3X (ItemStack output, Object input) {
				addShaped(output, "III", "III", "III", 'I', input);
		}

		public void add3X (Item output, Object input) {
				addShaped(output, "III", "III", "III", 'I', input);
		}

		public void add3X (Block output, Object input) {
				addShaped(output, "III", "III", "III", 'I', input);
		}

		public void add2X (ItemStack output, Object input) {
						addShaped(output, "II", "II", 'I', input);
						addShapeless(output, input, input, input, input);
		}

		public void addCrossWCenter (ItemStack output, Object partA, Object partB, Object center) {
				addShaped(output, "ABA", "BCB", "ABA", 'A', partA, 'B', partB, 'C', center);
				addShaped(output, "BAB", "ACA", "BAB", 'A', partA, 'B', partB, 'C', center);
		}

		public void addCrossWCenter (Item output, Object partA, Object partB, Object center) {
				addShaped(output, "ABA", "BCB", "ABA", 'A', partA, 'B', partB, 'C', center);
				addShaped(output, "BAB", "ACA", "BAB", 'A', partA, 'B', partB, 'C', center);
		}

		public void addCrossWCenter (Block output, Object partA, Object partB, Object center) {
				addShaped(output, "ABA", "BCB", "ABA", 'A', partA, 'B', partB, 'C', center);
				addShaped(output, "BAB", "ACA", "BAB", 'A', partA, 'B', partB, 'C', center);
		}

		public void addStairs (ItemStack output, Object input) {
				addShaped(output, "I  ", "II ", "III", 'I', input);
				addShaped(output, "  I", " II", "III", 'I', input);
		}

		public void addStairs (Item output, Object input) {
				addShaped(output, "I  ", "II ", "III", 'I', input);
				addShaped(output, "  I", " II", "III", 'I', input);
		}

		public void addStairs (Block output, Object input) {
				addShaped(output, "I  ", "II ", "III", 'I', input);
				addShaped(output, "  I", " II", "III", 'I', input);
		}

		public void addSlabs (ItemStack output, Object input) {
				addShaped(output, "III", "III", 'I', input);
		}

		public void addSimpleCirc (ItemStack output, ItemStack outer, ItemStack center) {
				addShaped(output, " O ", "OCO", " O ", 'O', outer, 'C', center);
		}

		public void addPressurePlate (ItemStack output, ItemStack input) {
				addShaped(output, "PP", 'P', input);
		}

		public void addPressurePlate (ItemStack output, String input) {
				addShaped(output, "PP", 'P', input);
		}

		public void addBasicMachineRecipe (ItemStack output, Object corner, Object hor, Object ver, Object center) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'V', ver, 'X', center);
		}

		public void addBasicMachineRecipe (Item output, Object corner, Object hor, Object ver, Object center) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'V', ver, 'X', center);
		}

		public void addBasicMachineRecipe (Block output, Object corner, Object hor, Object ver, Object center) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'V', ver, 'X', center, 'H', hor);
		}

		@Optional.Method (modid = "Avaritia")
		public void addShaped9X9Recipe (ItemStack output, Object... input) {
				ExtremeCraftingManager.getInstance().addExtremeShapedOreRecipe(output, input);
		}

		@Optional.Method (modid = "Avaritia")
		public void addShaped9X9Recipe (Item output, Object... input) {
				ExtremeCraftingManager.getInstance().addExtremeShapedOreRecipe(new ItemStack(output), input);
		}

		@Optional.Method (modid = "Avaritia")
		public void addShaped9X9Recipe (Block output, Object... input) {
				ExtremeCraftingManager.getInstance().addExtremeShapedOreRecipe(new ItemStack(output), input);
		}

		@Optional.Method (modid = "Avaritia")
		public void addShapeless9X9Recipe (ItemStack output, Object... input) {
				ExtremeCraftingManager.getInstance().addShapelessOreRecipe(output, input);
		}

		public void addArmorRecipes (ItemStack helmet, ItemStack chest, ItemStack leggs, ItemStack boots, ItemStack material) {
				addShaped(helmet, "III", "I I", 'I', material);
				addShaped(chest, "I I", "III", "III", 'I', material);
				addShaped(leggs, "III", "I I", "I I", 'I', material);
				addShaped(boots, "I I", "I I", 'I', material);
		}
}
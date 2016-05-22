package wurmcraft.wurmatron.common.recipes.utils;

import cpw.mods.fml.common.Optional;
import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import fox.spiteful.avaritia.crafting.ExtremeShapedOreRecipe;
import fox.spiteful.avaritia.crafting.ExtremeShapelessRecipe;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.List;

public class RecipeHelper {

		public static RecipeHelper instance;

		/**
		 * Used to add a Shaped Recipe
		 * (Supports OreDict)
		 *
		 * @param output Recipe is used to create this
		 * @param recipe Formatting / Layout of the shaped recipe
		 *               <p>
		 *               Example: addShaped(new ItemStack(Items.diamond), "CSC", 'C', Blocks.cobblestone, 'S', Items.stick);
		 */
		public void addShaped (ItemStack output, Object... recipe) {
				if (RecipeChecker.checkStack(output))
						RecipeChecker.checkAndHandle(new ShapedOreRecipe(output, recipe));
		}

		/**
		 * Used to add a Shaped Recipe
		 * (Supports OreDict)
		 *
		 * @param output Recipe is used to create this
		 * @param recipe Formatting / Layout of the shaped recipe
		 *               <p>
		 *               Example: addShaped(Items.diamond, "CSC", 'C', Blocks.cobblestone, 'S', Items.stick);
		 */
		public void addShaped (Item output, Object... recipe) {
				if (RecipeChecker.checkStack(new ItemStack(output)))
						RecipeChecker.checkAndHandle(new ShapedOreRecipe(output, recipe));
		}

		/**
		 * Used to add a Shaped Recipe
		 * (Supports OreDict)
		 *
		 * @param output Recipe is used to create this
		 * @param recipe Formatting / Layout of the shaped recipe
		 *               <p>
		 *               Example: addShaped(Blocks.diamond_block, "CSC", 'C', Blocks.cobblestone, 'S', Items.diamond);
		 */
		public void addShaped (Block output, Object... recipe) {
				if (RecipeChecker.checkStack(new ItemStack(output)))
						RecipeChecker.checkAndHandle(new ShapedOreRecipe(output, recipe));
		}

		/**
		 * Used to add Shapeless Recipe
		 * (Supports OreDict)
		 *
		 * @param output Recipe is used to create this
		 * @param input  Formatting / Layout of the shapeless recipe
		 *               <p>
		 *               Example: addShapeless(new ItemStack(Items.diamond), Items.stick, Blocks.cobblestone);
		 */
		public void addShapeless (ItemStack output, Object... input) {
				if (RecipeChecker.checkStack(output))
						RecipeChecker.checkAndHandle(new ShapelessOreRecipe(output, input));
		}

		/**
		 * Used to add Shapeless Recipe
		 * (Supports OreDict)
		 *
		 * @param output Recipe is used to create this
		 * @param input  Formatting / Layout of the shapeless recipe
		 *               <p>
		 *               Example: addShapeless(Items.diamond, Items.stick, Blocks.cobblestone);
		 */
		public void addShapeless (Item output, Object... input) {
				if (RecipeChecker.checkStack(new ItemStack(output)))
						RecipeChecker.checkAndHandle(new ShapelessOreRecipe(output, input));
		}

		/**
		 * Used to add Shapeless Recipe
		 * (Supports OreDict)
		 *
		 * @param output Recipe is used to create this
		 * @param input  Formatting / Layout of the shapeless recipe
		 *               <p>
		 *               Example: addShapeless(Blocks.diamond_block, Items.stick, Blocks.cobblestone);
		 */
		public void addShapeless (Block output, Object... input) {
				if (RecipeChecker.checkStack(new ItemStack(output)))
						RecipeChecker.checkAndHandle(new ShapelessOreRecipe(output, input));
		}

		/**
		 * Used to add 9x Shaped Recipe
		 * (Supports OreDict)
		 *
		 * @param output Recipe is used to create this
		 * @param input  Formatting / Layout of the shaped recipe
		 *               <p>
		 *               Example: addShaped9x9Recipe(new ItemStack(Items.diamond), "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB","AAABBBAAA", "BBBAAABBB","AAABBBAAA", "BBBAAABBB","AAABBBAAA", 'A', Items.apple, 'B', Blocks.bed);
		 */
		@Optional.Method (modid = "Avaritia")
		public void addShaped9X9Recipe (ItemStack output, Object... input) {
				if (RecipeChecker.checkStack(output))
						ExtremeCraftingManager.getInstance().addExtremeShapedOreRecipe(output, input);
		}


		/**
		 * Used to add 9x Shaped Recipe
		 * (Supports OreDict)
		 *
		 * @param output Recipe is used to create this
		 * @param input  Formatting / Layout of the shaped recipe
		 *               <p>
		 *               Example: addShaped9x9Recipe(Items.diamond, "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB","AAABBBAAA", "BBBAAABBB","AAABBBAAA", "BBBAAABBB","AAABBBAAA", 'A', Items.apple, 'B', Blocks.bed);
		 */
		@Optional.Method (modid = "Avaritia")
		public void addShaped9X9Recipe (Item output, Object... input) {
				if (RecipeChecker.checkStack(new ItemStack(output)))
						RecipeChecker.check9x(new ExtremeShapedOreRecipe(new ItemStack(output), input));
		}


		/**
		 * Used to add 9x Shaped Recipe
		 * (Supports OreDict)
		 *
		 * @param output Recipe is used to create this
		 * @param input  Formatting / Layout of the shaped recipe
		 *               <p>
		 *               Example: addShaped9x9Recipe(Blocks.diamond_block, "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB","AAABBBAAA", "BBBAAABBB","AAABBBAAA", "BBBAAABBB","AAABBBAAA", 'A', Items.apple, 'B', Blocks.bed);
		 */
		@Optional.Method (modid = "Avaritia")
		public void addShaped9X9Recipe (Block output, Object... input) {
				if (RecipeChecker.checkStack(new ItemStack(output)))
						RecipeChecker.check9x(new ExtremeShapedOreRecipe(new ItemStack(output), input));
		}

		/**
		 * Used to add 9x Shapeless Recipe
		 *
		 * @param output Recipe is used to create this
		 * @param input  Formatting / Layout of the shapeless recipe
		 *               <p>
		 *               Example: addShapeless9X9Recipe(new ItemStack(Items.diamond), Items.apple,  Blocks.bed, ... Up to 81 items);
		 */
		@Optional.Method (modid = "Avaritia")
		public void addShapeless9X9Recipe (ItemStack output, List input) {
				if (RecipeChecker.checkStack(output))
						RecipeChecker.check9x(new ExtremeShapelessRecipe(output, input));
		}

		/**
		 * Used to add 9x Shapeless Recipe
		 *
		 * @param output Recipe is used to create this
		 * @param input  Formatting / Layout of the shapeless recipe
		 *               <p>
		 *               Example: addShapeless9X9Recipe(Items.diamond, Items.apple,  Blocks.bed, ... Up to 81 items);
		 */
		@Optional.Method (modid = "Avaritia")
		public void addShapeless9X9Recipe (Item output, List input) {
				if (RecipeChecker.checkStack(new ItemStack(output)))
						RecipeChecker.check9x(new ExtremeShapelessRecipe(new ItemStack(output), input));
		}

		/**
		 * Used to add 9x Shapeless Recipe
		 *
		 * @param output Recipe is used to create this
		 * @param input  Formatting / Layout of the shapeless recipe
		 *               <p>
		 *               Example: addShapeless9X9Recipe(Blocks.diamond_block, Items.apple,  Blocks.bed, ... Up to 81 items);
		 */
		@Optional.Method (modid = "Avaritia")
		public void addShapeless9X9Recipe (Block output, List input) {
				if (RecipeChecker.checkStack(new ItemStack(output)))
						RecipeChecker.check9x(new ExtremeShapelessRecipe(new ItemStack(output), input));
		}

		private void addShaped (Object output, Object... recipe) {
				if (output instanceof ItemStack) {
						if (RecipeChecker.checkStack((ItemStack) output))
								RecipeChecker.checkAndHandle(new ShapedOreRecipe((ItemStack) output, recipe));
				}
		}

		public void addCircle (ItemStack output, Object circle) {
				addShaped(output, "CCC", "C C", "CCC", 'C', circle);
		}

		public void addCircle (Item output, Object circle) {
				addShaped(output, "CCC", "C C", "CCC", 'C', circle);
		}

		public void addCircle (Block output, Object circle) {
				addShaped(output, "CCC", "C C", "CCC", 'C', circle);
		}

		public void addCircleWithCenter (ItemStack output, Object outer, Object center) {
				addShaped(output, "OOO", "OCO", "OOO", 'O', outer, 'C', center);
		}

		public void addCircleWithCenter (Item output, Object outer, Object center) {
				addShaped(output, "OOO", "OCO", "OOO", 'O', outer, 'C', center);
		}

		public void addCircleWithCenter (Block output, Object outer, Object center) {
				addShaped(output, "OOO", "OCO", "OOO", 'O', outer, 'C', center);
		}

		public void addCross (ItemStack output, Object partA, Object partB) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}

		public void addCross (Item output, Object partA, Object partB) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}

		public void addCross (Block output, Object partA, Object partB) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}

		public void addCross (ItemStack output, Object partA, Object partB, boolean flip) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				if (flip) addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}

		public void addCross (Item output, Object partA, Object partB, boolean flip) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				if (flip) addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}

		public void addCross (Block output, Object partA, Object partB, boolean flip) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				if (flip) addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}


		public void addCrossWithCenter (ItemStack output, Object partA, Object partB, Object center) {
				addShaped(output, "ABA", "BCB", "ABA", 'A', partA, 'B', partB, 'C', center);
				addShaped(output, "BAB", "ACA", "BAB", 'A', partA, 'B', partB, 'C', center);
		}

		public void addCrossWithCenter (Item output, Object partA, Object partB, Object center) {
				addShaped(output, "ABA", "BCB", "ABA", 'A', partA, 'B', partB, 'C', center);
				addShaped(output, "BAB", "ACA", "BAB", 'A', partA, 'B', partB, 'C', center);
		}

		public void addCrossWithCenter (Block output, Object partA, Object partB, Object center) {
				addShaped(output, "ABA", "BCB", "ABA", 'A', partA, 'B', partB, 'C', center);
				addShaped(output, "BAB", "ACA", "BAB", 'A', partA, 'B', partB, 'C', center);
		}

		public void addCrossWithCenter (ItemStack output, Object partA, Object partB, Object center, boolean flip) {
				addShaped(output, "ABA", "BCB", "ABA", 'A', partA, 'B', partB, 'C', center);
				if (flip) addShaped(output, "BAB", "ACA", "BAB", 'A', partA, 'B', partB, 'C', center);
		}

		public void addCrossWithCenter (Item output, Object partA, Object partB, Object center, boolean flip) {
				addShaped(output, "ABA", "BCB", "ABA", 'A', partA, 'B', partB, 'C', center);
				if (flip) addShaped(output, "BAB", "ACA", "BAB", 'A', partA, 'B', partB, 'C', center);
		}

		public void addCrossWithCenter (Block output, Object partA, Object partB, Object center, boolean flip) {
				addShaped(output, "ABA", "BCB", "ABA", 'A', partA, 'B', partB, 'C', center);
				if (flip) addShaped(output, "BAB", "ACA", "BAB", 'A', partA, 'B', partB, 'C', center);
		}

		public void add3x (ItemStack output, Object input) {
				addShaped(output, "III", "III", "III", 'I', input);
		}

		public void add3x (Item output, Object input) {
				addShaped(output, "III", "III", "III", 'I', input);
		}

		public void add3x (Block output, Object input) {
				addShaped(output, "III", "III", "III", 'I', input);
		}

		public void add2x (Block output, Object input) {
				addShaped(output, "II", "II", 'I', input);
		}

		public void add2x (ItemStack output, Object input) {
				addShaped(output, "II", "II", 'I', input);
		}

		public void add2x (Item output, Object input) {
				addShaped(output, "II", "II", 'I', input);
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

		public void addStairs (ItemStack output, Object input, boolean flip) {
				addShaped(output, "I  ", "II ", "III", 'I', input);
				if (flip) addShaped(output, "  I", " II", "III", 'I', input);
		}

		public void addStairs (Item output, Object input, boolean flip) {
				addShaped(output, "I  ", "II ", "III", 'I', input);
				if (flip) addShaped(output, "  I", " II", "III", 'I', input);
		}

		public void addStairs (Block output, Object input, boolean flip) {
				addShaped(output, "I  ", "II ", "III", 'I', input);
				if (flip) addShaped(output, "  I", " II", "III", 'I', input);
		}

		public void addSlabs (ItemStack output, Object input) {
				addShaped(output, "III", "III", 'I', input);
		}

		public void addSlabs (Item output, Object input) {
				addShaped(output, "III", "III", 'I', input);
		}

		public void addSlabs (Block output, Object input) {
				addShaped(output, "III", "III", 'I', input);
		}

		public void addSimpleCircle (ItemStack output, Object outer, Object center) {
				addShaped(output, " O ", "OCO", " O ", 'O', outer, 'C', center);
		}

		public void addArmorRecipes (Object helmet, Object chest, Object leggs, Object boots, ItemStack material) {
				addShaped(helmet, "III", "I I", 'I', material);
				addShaped(chest, "I I", "III", "III", 'I', material);
				addShaped(leggs, "III", "I I", "I I", 'I', material);
				addShaped(boots, "I I", "I I", 'I', material);
		}

		public void addArmorRecipes (Object helmet, Object chest, Object leggs, Object boots, Item material) {
				addShaped(helmet, "III", "I I", 'I', material);
				addShaped(chest, "I I", "III", "III", 'I', material);
				addShaped(leggs, "III", "I I", "I I", 'I', material);
				addShaped(boots, "I I", "I I", 'I', material);
		}

		public void addArmorRecipes (Object helmet, Object chest, Object leggs, Object boots, Block material) {
				addShaped(helmet, "III", "I I", 'I', material);
				addShaped(chest, "I I", "III", "III", 'I', material);
				addShaped(leggs, "III", "I I", "I I", 'I', material);
				addShaped(boots, "I I", "I I", 'I', material);
		}

		public void addAnvilRecipe (ItemStack output, ItemStack material) {
				addShaped(output, "MMM", " M ", "MMM", 'M', material);
		}

		public void addBasicMachineRecipe (ItemStack output, Object corner, Object horizonal, Object vertical, Object center) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', horizonal, 'V', vertical, 'X', center);
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', vertical, 'V', horizonal, 'X', center);
		}

		public void addBasicMachineRecipe (Block output, Object corner, Object horizonal, Object vertical, Object center) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', horizonal, 'V', vertical, 'X', center);
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', vertical, 'V', horizonal, 'X', center);
		}

		public void addBasicMachineRecipe (Item output, Object corner, Object horizonal, Object vertical, Object center) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', horizonal, 'V', vertical, 'X', center);
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', vertical, 'V', horizonal, 'X', center);
		}

		public void addBasicMachineRecipe (ItemStack output, Object corner, Object horizonal, Object vertical, Object center, boolean flip) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', horizonal, 'V', vertical, 'X', center);
				if(flip) addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', vertical, 'V', horizonal, 'X', center);
		}

		public void addBasicMachineRecipe (Block output, Object corner, Object horizonal, Object vertical, Object center, boolean flip) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', horizonal, 'V', vertical, 'X', center);
				if(flip) addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', vertical, 'V', horizonal, 'X', center);
		}

		public void addBasicMachineRecipe (Item output, Object corner, Object horizonal, Object vertical, Object center, boolean flip) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', horizonal, 'V', vertical, 'X', center);
				if(flip) addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'H', vertical, 'V', horizonal, 'X', center);
		}


		@Optional.Method (modid = "Avaritia")
		public void addCheckeredHigh (ItemStack output, Object partA, Object partB) {
				addShaped9X9Recipe(output, "ABABABABA", "BABABABAB", "ABABABABA", "BABABABAB", "ABABABABA", "BABABABAB", "ABABABABA", "BABABABAB", "ABABABABA", 'A', partA, 'B', partB);
		}

		@Optional.Method (modid = "Avaritia")
		public void addCheckeredHigh (Item output, Object partA, Object partB) {
				addShaped9X9Recipe(output, "ABABABABA", "BABABABAB", "ABABABABA", "BABABABAB", "ABABABABA", "BABABABAB", "ABABABABA", "BABABABAB", "ABABABABA", 'A', partA, 'B', partB);
		}

		@Optional.Method (modid = "Avaritia")
		public void addCheckeredHigh (Block output, Object partA, Object partB) {
				addShaped9X9Recipe(output, "ABABABABA", "BABABABAB", "ABABABABA", "BABABABAB", "ABABABABA", "BABABABAB", "ABABABABA", "BABABABAB", "ABABABABA", 'A', partA, 'B', partB);
		}

		@Optional.Method (modid = "Avaritia")
		public void addCheckeredLow (ItemStack output, Object partA, Object partB) {
				addShaped9X9Recipe(output, "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", 'A', partA, 'B', partB);
		}

		@Optional.Method (modid = "Avaritia")
		public void addCheckeredLow (Item output, Object partA, Object partB) {
				addShaped9X9Recipe(output, "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", 'A', partA, 'B', partB);
		}

		@Optional.Method (modid = "Avaritia")
		public void addCheckeredLow (Block output, Object partA, Object partB) {
				addShaped9X9Recipe(output, "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", "BBBAAABBB", "AAABBBAAA", 'A', partA, 'B', partB);
		}
}

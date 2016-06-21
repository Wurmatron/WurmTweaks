package wurmcraft.wurmatron.common.recipes;

import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;

import java.util.ArrayList;

public class RecipeHelper {

		public static final ArrayList<String> dye = new ArrayList<String>() {{
				add("dyeWhite");
				add("dyeOrange");
				add("dyeMagenta");
				add("dyeLightBlue");
				add("dyeYellow");
				add("dyeLime");
				add("dyePink");
				add("dyeGray");
				add("dyeLightGray");
				add("dyeCyan");
				add("dyePurple");
				add("dyeBlue");
				add("dyeBrown");
				add("dyeGreen");
				add("dyeRed");
				add("dyeBlack");
		}};

		public static final Item[] INGOTS = {TFCItems.bismuthIngot, TFCItems.bismuthBronzeIngot, TFCItems.blackBronzeIngot, TFCItems.blackSteelIngot, TFCItems.blueSteelIngot, TFCItems.brassIngot, TFCItems.bronzeIngot, TFCItems.copperIngot, TFCItems.goldIngot, TFCItems.leadIngot, TFCItems.nickelIngot, TFCItems.platinumIngot, TFCItems.redSteelIngot, TFCItems.roseGoldIngot, TFCItems.silverIngot, TFCItems.steelIngot, TFCItems.sterlingSilverIngot, TFCItems.tinIngot, TFCItems.wroughtIronIngot};
		public static final Item[] SHEETS = {TFCItems.bismuthSheet, TFCItems.bismuthBronzeSheet, TFCItems.blackBronzeSheet, TFCItems.blackSteelSheet, TFCItems.blueSteelSheet, TFCItems.brassSheet, TFCItems.bronzeSheet, TFCItems.copperSheet, TFCItems.goldSheet, TFCItems.leadSheet, TFCItems.nickelSheet, TFCItems.platinumSheet, TFCItems.redSteelSheet, TFCItems.roseGoldSheet, TFCItems.silverSheet, TFCItems.steelSheet, TFCItems.sterlingSilverSheet, TFCItems.tinSheet, TFCItems.wroughtIronSheet};
		public static final Item[] SHEETS2X = {TFCItems.bismuthSheet2x, TFCItems.bismuthBronzeSheet2x, TFCItems.blackBronzeSheet2x, TFCItems.blackSteelSheet2x, TFCItems.blueSteelSheet2x, TFCItems.brassSheet2x, TFCItems.bronzeSheet2x, TFCItems.copperSheet2x, TFCItems.goldSheet2x, TFCItems.leadSheet2x, TFCItems.nickelSheet2x, TFCItems.platinumSheet2x, TFCItems.redSteelSheet2x, TFCItems.roseGoldSheet2x, TFCItems.silverSheet2x, TFCItems.steelSheet2x, TFCItems.sterlingSilverSheet2x, TFCItems.tinSheet2x, TFCItems.wroughtIronSheet2x};


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

		public void addCross (Item output, Object partA, Object partB) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}

		public void addCross (Item output, Object partA, Object partB, boolean flip) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				if (flip) addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}

		public void addCross (Block output, Object partA, Object partB) {
				addShaped(output, "ABA", "BAB", "ABA", 'A', partA, 'B', partB);
				addShaped(output, "BAB", "ABA", "BAB", 'A', partA, 'B', partB);
		}

		public void addCross (Block output, Object partA, Object partB, boolean flip) {
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
		}

		public void add2X (Item output, Object input) {
				addShaped(output, "II", "II", 'I', input);
		}

		public void add2X (Block output, Object input) {
				addShaped(output, "II", "II", 'I', input);
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

		public void addSlabs (Item output, Object input) {
				addShaped(output, "III", "III", 'I', input);
		}

		public void addSlabs (Block output, Object input) {
				addShaped(output, "III", "III", 'I', input);
		}

		public void addSimpleCirc (ItemStack output, Object outer, Object center) {
				addShaped(output, " O ", "OCO", " O ", 'O', outer, 'C', center);
		}

		public void addSimpleCirc (Item output, Object outer, Object center) {
				addShaped(output, " O ", "OCO", " O ", 'O', outer, 'C', center);
		}

		public void addSimpleCirc (Block output, Object outer, Object center) {
				addShaped(output, " O ", "OCO", " O ", 'O', outer, 'C', center);
		}

		public void addPressurePlate (ItemStack output, Object input) {
				addShaped(output, "PP", 'P', input);
		}

		public void addPressurePlate (Item output, Object input) {
				addShaped(output, "PP", 'P', input);
		}

		public void addPressurePlate (Block output, Object input) {
				addShaped(output, "PP", 'P', input);
		}


		public void addBasicMachineRecipe (ItemStack output, Object corner, Object hor, Object ver, Object center) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'V', ver,'H', hor, 'X', center);
		}

		public void addBasicMachineRecipe (Item output, Object corner, Object hor, Object ver, Object center) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'V', ver,'H', hor, 'X', center);
		}

		public void addBasicMachineRecipe (Block output, Object corner, Object hor, Object ver, Object center) {
				addShaped(output, "CVC", "HXH", "CVC", 'C', corner, 'V', ver,'H', hor, 'X', center);
		}

		public void addEngineRecipe (ItemStack output, Object gear, Object material) {
				addShaped(output, "MMM", " X ", "GMG", 'M', material, 'X', WurmTweaksItems.itemEngineCoil, 'G', gear);
		}

		public void addEngineRecipe (Item output, Object gear, Object material) {
				addShaped(output, "MMM", " X ", "GMG", 'M', material, 'X', WurmTweaksItems.itemEngineCoil, 'G', gear);
		}

		public void addEngineRecipe (Block output, Object gear, Object material) {
				addShaped(output, "MMM", " X ", "GMG", 'M', material, 'X', WurmTweaksItems.itemEngineCoil, 'G', gear);
		}

		public void addWrenchRecipe (ItemStack output, Object material) {
				addShaped(output, "M M", "MMM", " M ", 'M', material);
		}

		public void addWrenchRecipe (Item output, Object material) {
				addShaped(output, "M M", "MMM", " M ", 'M', material);
		}

		public void addWrenchRecipe (Block output, Object material) {
				addShaped(output, "M M", "MMM", " M ", 'M', material);
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

		public void addArmorRecipes (ItemStack helmet, ItemStack chest, ItemStack leggs, ItemStack boots, Object material) {
				addShaped(helmet, "III", "I I", 'I', material);
				addShaped(chest, "I I", "III", "III", 'I', material);
				addShaped(leggs, "III", "I I", "I I", 'I', material);
				addShaped(boots, "I I", "I I", 'I', material);
		}

		public void addArmorRecipes (Item helmet, Item chest, Item leggs, Item boots, Object material) {
				addShaped(helmet, "III", "I I", 'I', material);
				addShaped(chest, "I I", "III", "III", 'I', material);
				addShaped(leggs, "III", "I I", "I I", 'I', material);
				addShaped(boots, "I I", "I I", 'I', material);
		}
}
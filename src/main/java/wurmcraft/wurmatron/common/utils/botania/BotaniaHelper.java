package wurmcraft.wurmatron.common.utils.botania;

import cpw.mods.fml.common.Optional;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import vazkii.botania.api.BotaniaAPI;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;

public class BotaniaHelper {

		@Optional.Method (modid = "Botania")
		public static void addPetalRecipe (ItemStack output, Object... items) {
				if (RecipeChecker.checkStack(output))
						BotaniaAPI.registerPetalRecipe(output, items);
		}

		@Optional.Method (modid = "Botania")
		public static void addPureDaisyRecipe (Object input, Block output, int meta) {
				if (RecipeChecker.checkStack(new ItemStack(output)))
						BotaniaAPI.registerPureDaisyRecipe(input, output, meta);
		}

		@Optional.Method (modid = "Botania")
		public static void addAlchemyRecipe (ItemStack output, ItemStack input, int mana) {
				if (RecipeChecker.checkStack(output))
						BotaniaAPI.registerManaAlchemyRecipe(output, input, mana);
		}

		@Optional.Method (modid = "Botania")
		public static void addConjurationRecipe (ItemStack output, ItemStack input, int mana) {
				if (RecipeChecker.checkStack(output))
						BotaniaAPI.registerManaConjurationRecipe(output, input, mana);
		}

		@Optional.Method (modid = "Botania")
		public static void addAlterRecipe (ItemStack output, int mana, Object... input) {
				if (RecipeChecker.checkStack(output))
						BotaniaAPI.registerRuneAltarRecipe(output, mana, input);
		}

		@Optional.Method (modid = "Botania")
		public static void addPortalRecipe (ItemStack output, Object... input) {
				if (RecipeChecker.checkStack(output))
						BotaniaAPI.registerElvenTradeRecipe(output, input);
		}

		@Optional.Method (modid = "Botania")
		public static void addPoolRecipe (ItemStack output, Object input, int mana) {
				if (RecipeChecker.checkStack(output))
						BotaniaAPI.registerManaInfusionRecipe(output, input, mana);
		}
}

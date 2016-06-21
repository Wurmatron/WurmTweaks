package wurmcraft.wurmatron.common.utils.ic2;

import cpw.mods.fml.common.Optional;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;

public class ICHelper {

		@Optional.Method (modid = "IC2")
		public static void addCompressorRecipe (ItemStack input, ItemStack output) {
				Recipes.compressor.addRecipe(new RecipeInputItemStack(input), null, output);
		}

		@Optional.Method (modid = "IC2")
		public static void addExtractorRecipe (ItemStack input, ItemStack output) {
				Recipes.extractor.addRecipe(new RecipeInputItemStack(input), null, output);
		}

		@Optional.Method (modid = "IC2")
		public static void addMetalFormerCuttingRecipe (ItemStack input, ItemStack output) {
				Recipes.metalformerCutting.addRecipe(new RecipeInputItemStack(input), null, output);
		}

		@Optional.Method (modid = "IC2")
		public static void addMetalFormerExtrudingRecipe (ItemStack input, ItemStack output) {
				Recipes.metalformerExtruding.addRecipe(new RecipeInputItemStack(input), null, output);
		}

		@Optional.Method (modid = "IC2")
		public static void addMetalFormerRollingRecipe (ItemStack input, ItemStack output) {
				Recipes.metalformerRolling.addRecipe(new RecipeInputItemStack(input), null, output);
		}


		@Optional.Method (modid = "IC2")
		public static void addMaceratorRecipe (ItemStack input, ItemStack... output) {
				Recipes.macerator.addRecipe(new RecipeInputItemStack(input),null,output);
		}
}

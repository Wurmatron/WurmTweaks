package wurmcraft.wurmatron.common.utils.buildcraft;

import buildcraft.api.recipes.BuildcraftRecipeRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class BuildCraftHelper {

		public static void addAssemblerRecipes(String item, int power, ItemStack output, Object... input ) {
				BuildcraftRecipeRegistry.assemblyTable.addRecipe(item,power,output,input);
				Entity
		}
}

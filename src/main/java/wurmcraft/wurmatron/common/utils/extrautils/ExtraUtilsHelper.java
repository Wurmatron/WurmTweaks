package wurmcraft.wurmatron.common.utils.extrautils;

import com.rwtema.extrautils.tileentity.enderconstructor.EnderConstructorRecipesHandler;
import cpw.mods.fml.common.Optional;
import net.minecraft.item.ItemStack;

public class ExtraUtilsHelper {

		@Optional.Method (modid = "ExtraUtilities")
		public static void addQEDRecipe (ItemStack output, Object... input) {
				EnderConstructorRecipesHandler.addRecipe(output, input);
		}
}

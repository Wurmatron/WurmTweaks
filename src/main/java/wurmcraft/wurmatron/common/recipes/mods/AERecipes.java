package wurmcraft.wurmatron.common.recipes.mods;

import appeng.core.Api;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class AERecipes {

		private static RecipeHelper r = RecipeHelper.instance;

		@Optional.Method (modid = "appliedenergistics2")
		public static void addRecipes () {
				r.addCross(Api.INSTANCE.blocks().blockQuartzGlass.stack(4), Blocks.glass, Items.quartz);
				r.addShapeless(Api.INSTANCE.blocks().blockQuartzVibrantGlass.stack(1), Api.INSTANCE.blocks().blockQuartzGlass.stack(1), Items.glowstone_dust);
				r.addShapeless(Api.INSTANCE.blocks().blockQuartzTorch.stack(1), Items.quartz, Items.glowstone_dust);
		}
}

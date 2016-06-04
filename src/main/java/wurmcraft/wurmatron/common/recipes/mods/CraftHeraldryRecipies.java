package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.item.ItemStack;
import vazkii.heraldry.core.proxy.CommonProxy;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class CraftHeraldryRecipies {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "CraftHeraldry")
		public static void addRecipes () {
				LogHandler.info("Adding CraftHeraldry Recipes");
				r.addCircleWCenter(CommonProxy.itemHeraldry, TFCItems.juteFiber, "packStick");
				r.addShaped(new ItemStack(CommonProxy.blockHeraldry, 1, 1), "WWW", "WCW", 'W', "packLog", 'C', "packCloth");
				r.addShapeless(new ItemStack(CommonProxy.blockHeraldry, 1, 2), new ItemStack(CommonProxy.blockHeraldry, 1, 1), "packStick");
				r.addShaped(new ItemStack(CommonProxy.blockHeraldry, 1, 2), "WWW", "WCW", " S ", 'W', "packLog", 'C', "packCloth", 'S', "packStick");
		}
}

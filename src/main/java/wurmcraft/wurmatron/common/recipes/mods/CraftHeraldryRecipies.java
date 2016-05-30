package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.item.ItemStack;
import vazkii.heraldry.core.proxy.CommonProxy;
import wurmcraft.wurmatron.api.IModRecipes;

public class CraftHeraldryRecipies implements IModRecipes {

		@Optional.Method (modid = "CraftHeraldry")
		@Override
		public void addRecipes () {
				r.addCircleWCenter(CommonProxy.itemHeraldry, TFCItems.juteFiber, "packStick");
				r.addShaped(new ItemStack(CommonProxy.blockHeraldry, 1, 1), "WWW", "WCW", 'W', "packLog", 'C', "packCloth");
				r.addShapeless(new ItemStack(CommonProxy.blockHeraldry, 1, 2), new ItemStack(CommonProxy.blockHeraldry, 1, 1), "packStick");
				r.addShaped(new ItemStack(CommonProxy.blockHeraldry, 1, 2), "WWW", "WCW", " S ", 'W', "packLog", 'C', "packCloth", 'S', "packStick");
		}
}

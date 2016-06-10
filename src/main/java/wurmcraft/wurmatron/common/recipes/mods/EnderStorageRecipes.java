package wurmcraft.wurmatron.common.recipes.mods;

import buildcraft.BuildCraftFactory;
import codechicken.enderstorage.EnderStorage;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

/**
 * Recipes Verified by Wurmatron
 * on 6/10/2016 with 1.4.7.37
 */
public class EnderStorageRecipes  {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "EnderStorage")
		public static  void addRecipes () {
				LogHandler.info("Adding Ender Storage Recipes");
				r.addCrossWCenter(new ItemStack(EnderStorage.blockEnderChest,1,0), TFItems.ingotEnderium, WurmTweaksItems.itemQuantumCore, "packChest");
				r.addCrossWCenter(new ItemStack(EnderStorage.blockEnderChest,1,4096), TFItems.ingotEnderium, WurmTweaksItems.itemQuantumCore, BuildCraftFactory.tankBlock);
				r.addCircleWCenter(EnderStorage.itemEnderPouch, TFCItems.leather, new ItemStack(EnderStorage.blockEnderChest,1,0));
		}
}

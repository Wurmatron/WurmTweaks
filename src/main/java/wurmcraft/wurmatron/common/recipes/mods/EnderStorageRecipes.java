package wurmcraft.wurmatron.common.recipes.mods;

import buildcraft.BuildCraftFactory;
import codechicken.enderstorage.EnderStorage;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.api.IModRecipes;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;

public class EnderStorageRecipes implements IModRecipes {

		@Optional.Method(modid = "EnderStorage")
		@Override
		public void addRecipes () {
				r.addCrossWCenter(new ItemStack(EnderStorage.blockEnderChest,1,0), TFItems.ingotEnderium, WurmTweaksItems.itemQuantumCore, "packChest");
				r.addCrossWCenter(new ItemStack(EnderStorage.blockEnderChest,1,4096), TFItems.ingotEnderium, WurmTweaksItems.itemQuantumCore, BuildCraftFactory.tankBlock);
				r.addCircleWCenter(EnderStorage.itemEnderPouch, TFCItems.leather, new ItemStack(EnderStorage.blockEnderChest,1,0));
		}
}

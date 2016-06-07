package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import tinker_io.mainRegistry.BlockRegistry;
import tinker_io.mainRegistry.ItemRegistry;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class TinkerIORecipes {

		private static final RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				LogHandler.info("Adding Tinker IO Recipes");
				r.addCircleWCenter(BlockRegistry.smartOutput, WurmTweaksItems.itemMixedSheet, Blocks.hopper);
				r.addCircleWCenter(BlockRegistry.whatABeautifulBlock, WurmTweaksItems.itemAntiMatter, Items.nether_star);
				r.addCircleWCenter(ItemRegistry.SpeedUPG, TFCItems.blackSteelSheet, TFCItems.sugar);
				r.addCrossWCenter(ItemRegistry.SolidFuel, new ItemStack(TFCItems.coal, 1, 1), Items.gunpowder, TFCItems.coal);
				r.addCircleWCenter(ItemRegistry.Upgrade, TFCItems.blackSteelSheet, TFCItems.blueSteelSheet2x);
				for (int i =1; i <= 4; i++)
						r.add2X(new ItemStack(ItemRegistry.Upgrade, 1, i), new ItemStack(ItemRegistry.Upgrade, 1, i - 1));
				r.addCircleWCenter(new ItemStack(ItemRegistry.Upgrade, 1, 5), TFCItems.blackSteelSheet, Blocks.redstone_torch);
				r.addShapeless(new ItemStack(ItemRegistry.Upgrade, 1, 6), BlockRegistry.whatABeautifulBlock);
				r.add2X(ItemRegistry.Lonesome_Avenue, ItemRegistry.Upgrade);
		}
}

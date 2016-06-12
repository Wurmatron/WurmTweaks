package wurmcraft.wurmatron.common.recipes.mods;

import buildcraft.BuildCraftFactory;
import com.bioxx.tfc.api.TFCItems;
import com.indemnity83.irontank.init.ModBlocks;
import com.indemnity83.irontank.init.ModItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class IronTankRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "irontank")
		public static void addRecipes () {
				r.addCircleWCenter(ModBlocks.copperTank, TFCItems.copperSheet, BuildCraftFactory.tankBlock);
				r.addCircleWCenter(ModBlocks.ironTank, TFCItems.wroughtIronSheet, ModBlocks.copperTank);
				r.addCircleWCenter(ModBlocks.silverTank, TFCItems.silverSheet, ModBlocks.ironTank);
				r.addCircleWCenter(ModBlocks.goldTank, TFCItems.goldSheet, ModBlocks.silverTank);
				r.addCircleWCenter(ModBlocks.diamondTank, "packGemExquisite", ModBlocks.goldTank);
				r.addCircleWCenter(ModBlocks.obsidianTank, Blocks.obsidian, ModBlocks.diamondTank);
				r.addCircleWCenter(ModItems.copperIronUpgrade, TFCItems.wroughtIronSheet, TFCItems.copperSheet);
				r.addCircleWCenter(ModItems.copperSilverUpgrade, TFCItems.silverSheet, TFCItems.copperSheet);
				r.addCircleWCenter(ModItems.glassIronUpgrade, TFCItems.wroughtIronSheet, "packGlass");
				r.addCircleWCenter(ModItems.glassCopperUpgrade, TFCItems.copperSheet, "packGlass");
				r.addCircleWCenter(ModItems.ironGoldUpgrade, TFCItems.goldSheet, TFCItems.wroughtIronSheet);
				r.addCircleWCenter(ModItems.goldDiamondUpgrade, "packGemExquisite", TFCItems.goldSheet);
				r.addCircleWCenter(ModItems.diamondObsidianUpgrade, Blocks.obsidian, "packGemExquisite");
		}
}

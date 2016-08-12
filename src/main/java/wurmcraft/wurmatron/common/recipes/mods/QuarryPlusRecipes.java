package wurmcraft.wurmatron.common.recipes.mods;

import buildcraft.BuildCraftBuilders;
import buildcraft.BuildCraftFactory;
import buildcraft.BuildCraftSilicon;
import com.bioxx.tfc.api.TFCItems;
import com.yogpc.qp.QuarryPlusI;
import com.yogpc.qp.WorkbenchRecipe;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class QuarryPlusRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "QuarryPlus")
		public static void addRecipes () {
				WorkbenchRecipe.getRecipes().clear();
				r.addShaped(new ItemStack(QuarryPlusI.blockPlacer, 1, 0), "SSS", "BBB", "SSS", 'S', Items.nether_star, 'B', "packGemBlock", 'S', WurmTweaksItems.itemQuarryCore);
				WorkbenchRecipe.addRecipe(new ItemStack(QuarryPlusI.blockLaser), 400000, new ItemStack(BuildCraftSilicon.laserBlock, 200), new ItemStack(Items.redstone, 64 * 50), new ItemStack(WurmTweaksItems.gearMixedSheet.getItem(), 200, 29));
				WorkbenchRecipe.addRecipe(new ItemStack(QuarryPlusI.blockMover), 100000, new ItemStack(Blocks.obsidian, 128 * 50), new ItemStack(TFCItems.redSteelSheet, 16 * 50), new ItemStack(TFCItems.blueSteelSheet, 16), new ItemStack(Blocks.anvil, 100), new ItemStack(Items.ender_pearl, 1024));
				WorkbenchRecipe.addRecipe(new ItemStack(QuarryPlusI.blockMarker), 100000, new ItemStack(Blocks.redstone_block, 200), new ItemStack(Items.glowstone_dust, 128), new ItemStack(BuildCraftBuilders.constructionMarkerBlock, 200));
				WorkbenchRecipe.addRecipe(new ItemStack(QuarryPlusI.blockQuarry), 10000000, new ItemStack(BuildCraftBuilders.quarryBlock, 50), new ItemStack(Items.nether_star, 800), new ItemStack(WurmTweaksItems.itemQuarryCore.getItem(), 200, 28));
				WorkbenchRecipe.addRecipe(new ItemStack(QuarryPlusI.blockPump), 80000, new ItemStack(BuildCraftFactory.pumpBlock, 200), new ItemStack(WurmTweaksItems.itemQuantumCore.getItem(), 100, 14));
				WorkbenchRecipe.addRecipe(new ItemStack(QuarryPlusI.blockRefinery), 80000, new ItemStack(BuildCraftFactory.refineryBlock, 200), new ItemStack(WurmTweaksItems.itemQuantumCore.getItem(), 100, 14));
				WorkbenchRecipe.addRecipe(new ItemStack(QuarryPlusI.blockMiningWell), 80000, new ItemStack(BuildCraftFactory.miningWellBlock, 800), new ItemStack(WurmTweaksItems.itemQuantumCore.getItem(), 100, 14));
		}
}

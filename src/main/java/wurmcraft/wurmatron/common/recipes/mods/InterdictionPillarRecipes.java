package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import com.momnop.interdictionpillar.blocks.BlockHandler;
import gravisuite.GraviSuite;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import openblocks.OpenBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class InterdictionPillarRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				r.addCrossWCenter(BlockHandler.blockLowInterdictionPillar, WurmTweaksItems.itemAntiMatter, WurmTweaksItems.ingotTitanium, "packGemBlock");
				r.addShapeless(BlockHandler.blockLowProjectileInterdictionPillar, TFCItems.arrow, BlockHandler.blockLowInterdictionPillar);
				r.addCircleWCenter(BlockHandler.blockMidInterdictionPillar, WurmTweaksItems.ingotRainbowSteel, BlockHandler.blockLowInterdictionPillar);
				r.addCircleWCenter(BlockHandler.blockHighInterdictionPillar, WurmTweaksItems.ingotRainbowSteel, BlockHandler.blockMidInterdictionPillar);
				r.addCircleWCenter(BlockHandler.blockMidProjectileInterdictionPillar, WurmTweaksItems.ingotRainbowSteel, BlockHandler.blockLowProjectileInterdictionPillar);
				r.addCircleWCenter(BlockHandler.blockHighProjectileInterdictionPillar, WurmTweaksItems.ingotRainbowSteel, BlockHandler.blockMidProjectileInterdictionPillar);
				r.addBasicMachineRecipe(BlockHandler.blockTNTInterdictionPillar, BlockHandler.blockLowInterdictionPillar, Blocks.tnt, WurmTweaksItems.ingotOrangeSteel, Items.redstone);
				r.addBasicMachineRecipe(BlockHandler.blockGravityInterdictionPillar, BlockHandler.blockLowInterdictionPillar, Blocks.tnt, WurmTweaksItems.ingotOrangeSteel, GraviSuite.gravitationEngine);
				r.addCircleWCenter(BlockHandler.blockInterdictionElevator, WurmTweaksItems.ingotGraySteel, OpenBlocks.Blocks.elevator);
		}
}

package wurmcraft.wurmatron.common.recipes.mods;


import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.carpentersblocks.util.registry.BlockRegistry;
import com.carpentersblocks.util.registry.ItemRegistry;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class CarpentersBlockRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "CarpentersBlocks")
		public static void addRecipes () {
				LogHandler.info("Adding Carpenters Blocks Recipes");
				r.addCircleWCenter(new ItemStack(BlockRegistry.blockCarpentersBlock, 32), "packStick", TFCItems.steelIngot);
				r.addShaped(new ItemStack(BlockRegistry.blockCarpentersBarrier, 8), " B ", "SBS", 'S', "packStick", 'B', BlockRegistry.blockCarpentersBlock);
				r.addShapeless(new ItemStack(BlockRegistry.blockCarpentersButton, 4), BlockRegistry.blockCarpentersBlock);
				r.add3X(BlockRegistry.blockCarpentersCollapsibleBlock, BlockRegistry.blockCarpentersBlock);
				r.addShapeless(BlockRegistry.blockCarpentersDaylightSensor, Blocks.daylight_detector, BlockRegistry.blockCarpentersBlock);
				r.addShaped(BlockRegistry.blockCarpentersFlowerPot, "B B", " B ", 'B', BlockRegistry.blockCarpentersBlock);
				r.addCircle(new ItemStack(BlockRegistry.blockCarpentersGarageDoor, 8), BlockRegistry.blockCarpentersBlock);
				r.addShaped(new ItemStack(BlockRegistry.blockCarpentersGate, 4), "SBS", "SBS", 'S', "packStick", 'B', BlockRegistry.blockCarpentersBlock);
				r.addSlabs(BlockRegistry.blockCarpentersHatch, BlockRegistry.blockCarpentersBlock);
				r.addShaped(new ItemStack(BlockRegistry.blockCarpentersLadder, 6), "B B", "BBB", "B B", 'B', BlockRegistry.blockCarpentersBlock);
				r.addShapeless(BlockRegistry.blockCarpentersLever, BlockRegistry.blockCarpentersBlock, "packStick");
				r.addPressurePlate(BlockRegistry.blockCarpentersPressurePlate, BlockRegistry.blockCarpentersBlock);
				r.addCircleWCenter(BlockRegistry.blockCarpentersSafe, BlockRegistry.blockCarpentersBlock, WurmTweaksBlocks.blockWroughtIron);
				r.addShaped(new ItemStack(BlockRegistry.blockCarpentersSlope, 8), "  S", " SB", "SBB", 'B', BlockRegistry.blockCarpentersBlock, 'S', "packStick");
				r.addStairs(new ItemStack(BlockRegistry.blockCarpentersStairs, 4), BlockRegistry.blockCarpentersBlock);
				r.addShapeless(BlockRegistry.blockCarpentersTorch, TFCBlocks.torch, BlockRegistry.blockCarpentersBlock);
				r.addWrenchRecipe(ItemRegistry.itemCarpentersHammer, BlockRegistry.blockCarpentersBlock);
				r.addShapeless(ItemRegistry.itemCarpentersChisel, TFCItems.wroughtIronIngot, BlockRegistry.blockCarpentersBlock);
				r.addShaped(ItemRegistry.itemCarpentersBed, "CCC", "LLL", 'C', "packCloth", 'L', "packLog");
				r.addShaped(ItemRegistry.itemCarpentersDoor, "DD", "DD", "DD", BlockRegistry.blockCarpentersBlock);
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.ironchest.IronChest;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class IronChestRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "IronChest")
		public static void addRecipes () {
				LogHandler.info("Adding Iron Chest Recipes");
				r.addCircleWCenter(IronChest.ironChestBlock, TFCItems.wroughtIronSheet, new ItemStack(IronChest.ironChestBlock, 1, 3));
				r.addCircleWCenter(new ItemStack(IronChest.ironChestBlock, 1, 1), TFCItems.goldSheet, new ItemStack(IronChest.ironChestBlock));
				r.addCircleWCenter(new ItemStack(IronChest.ironChestBlock, 1, 2), "packGemExquisite", new ItemStack(IronChest.ironChestBlock, 1, 1));
				r.addCircleWCenter(new ItemStack(IronChest.ironChestBlock, 1, 3), TFCItems.copperSheet, "packChest");
				r.addCircleWCenter(new ItemStack(IronChest.ironChestBlock, 1, 4), TFCItems.silverSheet, IronChest.ironChestBlock);
				r.addCircleWCenter(new ItemStack(IronChest.ironChestBlock, 1, 5), "packGlass", new ItemStack(IronChest.ironChestBlock, 1, 2));
				r.addCircleWCenter(new ItemStack(IronChest.ironChestBlock, 1, 6), Blocks.obsidian, new ItemStack(IronChest.ironChestBlock, 1, 2));
				r.addCircleWCenter(new ItemStack(IronChest.ironChestBlock, 1, 7), "packDirt", "packChest");
				r.addCircleWCenter(GameRegistry.findItem("IronChest", "woodCopperUpgrade"), TFCItems.copperSheet, "packPlanks");
				r.addCircleWCenter(GameRegistry.findItem("IronChest", "woodIronUpgrade"), TFCItems.wroughtIronSheet, "packPlanks");
				r.addCircleWCenter(GameRegistry.findItem("IronChest", "ironGoldUpgrade"), TFCItems.goldSheet, TFCItems.wroughtIronIngot);
				r.addCircleWCenter(GameRegistry.findItem("IronChest", "goldDiamondUpgrade"), "packGemExquisite", TFCItems.goldIngot);
				r.addCircleWCenter(GameRegistry.findItem("IronChest", "copperSilverUpgrade"), TFCItems.silverSheet, TFCItems.copperIngot);
				r.addCircleWCenter(GameRegistry.findItem("IronChest", "silverGoldUpgrade"), TFCItems.goldSheet, TFCItems.silverIngot);
				r.addCircleWCenter(GameRegistry.findItem("IronChest", "copperIronUpgrade"), TFCItems.wroughtIronSheet, TFCItems.copperIngot);
				r.addCircleWCenter(GameRegistry.findItem("IronChest", "diamondCrystalUpgrade"), "packGemExquisite", "packGem");
				r.addCircleWCenter(GameRegistry.findItem("IronChest", "diamondObsidianUpgrade"), Blocks.obsidian, "packGemExquisite");
		}
}

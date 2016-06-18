package wurmcraft.wurmatron.common.recipes.mods;

import appeng.api.util.AEColor;
import appeng.core.Api;
import com.bioxx.tfc.api.TFCItems;
import com.dynious.refinedrelocation.block.ModBlocks;
import com.dynious.refinedrelocation.item.ModItems;
import cpw.mods.fml.common.Optional;
import cpw.mods.ironchest.IronChest;
import mcp.mobius.betterbarrels.BetterBarrels;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class RefinedRelocationRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "RefinedRelocation")
		public static void addRecipes () {
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockExtender, 1, 0), TFCItems.wroughtIronSheet2x, Blocks.obsidian, Items.redstone, WurmTweaksBlocks.blockWroughtIron);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockExtender, 1, 1), TFCItems.wroughtIronSheet2x, Blocks.obsidian, Items.redstone, ModBlocks.blockExtender);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockExtender, 1, 2), TFCItems.goldSheet2x, Blocks.obsidian, Items.redstone, WurmTweaksBlocks.blockGold);
				r.addShapeless(new ItemStack(ModBlocks.blockExtender, 1, 3), new ItemStack(ModBlocks.blockExtender, 1, 1), new ItemStack(ModBlocks.blockExtender, 1, 2));
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockExtender, 1, 4), TFCItems.platinumSheet2x, Blocks.obsidian, Items.redstone, WurmTweaksItems.itemQuantumCore);
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingIronChest, 1, 0), WurmTweaksItems.ingotCyanSteel, TFCItems.blueSteelSheet, new ItemStack(IronChest.ironChestBlock, 1, 0));
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingIronChest, 1, 1), WurmTweaksItems.ingotCyanSteel, TFCItems.blueSteelSheet, new ItemStack(IronChest.ironChestBlock, 1, 1));
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingIronChest, 1, 2), WurmTweaksItems.ingotCyanSteel, TFCItems.blueSteelSheet, new ItemStack(IronChest.ironChestBlock, 1, 2));
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingIronChest, 1, 3), WurmTweaksItems.ingotCyanSteel, TFCItems.blueSteelSheet, new ItemStack(IronChest.ironChestBlock, 1, 3));
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingIronChest, 1, 4), WurmTweaksItems.ingotCyanSteel, TFCItems.blueSteelSheet, new ItemStack(IronChest.ironChestBlock, 1, 4));
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingIronChest, 1, 5), WurmTweaksItems.ingotCyanSteel, TFCItems.blueSteelSheet, new ItemStack(IronChest.ironChestBlock, 1, 5));
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingIronChest, 1, 6), WurmTweaksItems.ingotCyanSteel, TFCItems.blueSteelSheet, new ItemStack(IronChest.ironChestBlock, 1, 6));
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingIronChest, 1, 7), WurmTweaksItems.ingotCyanSteel, TFCItems.blueSteelSheet, new ItemStack(IronChest.ironChestBlock, 1, 7));
				r.addShapeless(new ItemStack(ModBlocks.filteringHopper, 1, 0), Blocks.hopper, "dye", "dye", "dye", "dye", TFCItems.redSteelSheet);
				r.addShapeless(new ItemStack(ModBlocks.filteringHopper, 1, 0), Blocks.hopper, "dye", "dye", "dye", "dye", TFCItems.blueSteelSheet);
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingBarrel, 1, 0), WurmTweaksItems.ingotCyanSteel, TFCItems.blueSteelSheet, new ItemStack(BetterBarrels.blockBarrel));
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingConnector, 4, 0), WurmTweaksItems.ingotCyanSteel, Items.redstone, WurmTweaksItems.itemMachineFrame);
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingConnector, 1, 1), "dye", TFCItems.blueSteelSheet, new ItemStack(ModBlocks.sortingConnector, 1, 0));
				r.addCrossWCenter(new ItemStack(ModBlocks.sortingConnector, 1, 3), "dye", new ItemStack(Api.INSTANCE.parts().partCableGlass.stack(AEColor.Transparent, 1).getItem(), 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModBlocks.sortingConnector, 1, 0));
				r.addCrossWCenter(new ItemStack(ModBlocks.buffer, 4, 0), WurmTweaksItems.ingotCyanSteel, Items.redstone, "packChest");
				r.addCrossWCenter(new ItemStack(ModBlocks.buffer, 1, 1), WurmTweaksItems.ingotCyanSteel, Items.redstone, new ItemStack(ModBlocks.buffer, 1, 0));
				r.addCrossWCenter(new ItemStack(ModBlocks.buffer, 1, 2), WurmTweaksItems.ingotCyanSteel, "dye", new ItemStack(ModBlocks.buffer, 1, 0));
				r.addCross(new ItemStack(ModItems.sortingUpgrade, 1, 0), WurmTweaksItems.ingotCyanSteel, TFCItems.blueSteelSheet2x);
				r.addCross(new ItemStack(ModItems.sortingUpgrade, 1, 1), WurmTweaksItems.ingotCyanSteel, TFCItems.redSteelSheet2x);
				r.addShaped(new ItemStack(ModItems.relocatorModule,4,0), "XSX", "S S", "XSX", 'X', TFCItems.blackSteelSheet, 'S', Items.redstone);
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,1), new ItemStack(ModItems.relocatorModule,1,0), "dye");
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,2), new ItemStack(ModItems.relocatorModule,1,0), Blocks.iron_bars);
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,3), new ItemStack(ModItems.relocatorModule,1,0), Blocks.piston);
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,4), new ItemStack(ModItems.relocatorModule,1,0), Blocks.sticky_piston);
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,5), new ItemStack(ModItems.relocatorModule,1,0), new ItemStack(Blocks.wool,1,OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,6), new ItemStack(ModItems.relocatorModule,1,0), WurmTweaksItems.ingotGreenSteel);
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,7), new ItemStack(ModItems.relocatorModule,1,0), Items.redstone);
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,8), new ItemStack(ModItems.relocatorModule,1,0), Items.glowstone_dust);
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,9), new ItemStack(ModItems.relocatorModule,1,0), Blocks.redstone_torch);
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,10), new ItemStack(ModItems.relocatorModule,1,0), "dye", "dye", "dye", "dye");
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,11), new ItemStack(ModItems.relocatorModule,1,0), Blocks.hopper);
				r.addShapeless(new ItemStack(ModItems.relocatorModule,1,12), new ItemStack(ModItems.relocatorModule,1,0), "packCraftingTable", WurmTweaksItems.itemAutoCore);
		}
}

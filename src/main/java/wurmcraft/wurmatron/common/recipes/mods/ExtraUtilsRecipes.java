package wurmcraft.wurmatron.common.recipes.mods;

import advsolar.common.AdvancedSolarPanel;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import crazypants.enderio.EnderIO;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.nbt.ItemNBT;

public class ExtraUtilsRecipes  {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "ExtraUtilities")
		public static void addRecipes () {
				LogHandler.info("Adding Extra Util Recipes");
				r.addShaped(GameRegistry.findItemStack("ExtraUtilities", "enderCollector", 1), "EQE", " E ", "OOO", 'E', TFItems.ingotEnderium, 'O', Blocks.obsidian, 'Q', WurmTweaksItems.itemQuantumFoam);
				r.addShaped(ExtraUtils.qed, "XAX", "BXB", "BBB", 'X', WurmTweaksItems.itemQuantumSingularity, 'A', WurmTweaksItems.ingotRainbowSteel, 'B', WurmTweaksBlocks.blockBlueSteel);
				r.addShaped(new ItemStack(ExtraUtils.qed, 1, 2), " E ", " E ", "PPP", 'E', TFItems.ingotEnderium, 'C', new ItemStack(Blocks.crafting_table), 'P', WurmTweaksBlocks.blockBlueSteel, 'C', AdvancedSolarPanel.itemQuantumCore);
				// TODO Ender Marker (QED)
				r.addShaped(new ItemStack(ExtraUtils.curtain,24), "WW", "WW", "WW", 'W', new ItemStack(Blocks.wool,1, OreDictionary.WILDCARD_VALUE));
				r.addCrossWCenter(new ItemStack(ExtraUtils.angelBlock,2), TFCItems.bismuthSheet, Items.feather, Items.feather);
				r.addShaped(ExtraUtils.chandelier, "EIE", "TTT", " T ", 'I', "packIngot", 'E', "packGemExquisite", 'T', TFCBlocks.torch);
				r.addCross(new ItemStack(ExtraUtils.decorative1,9), Blocks.stonebrick, "packSmoothStone");
				r.addShaped(new ItemStack(ExtraUtils.decorative1,1,1), " I ", "IBI", " I ", 'I', TFItems.ingotEnderium, 'B', Blocks.obsidian);
				r.add3X(new ItemStack(ExtraUtils.decorative1,1,5), ExtraUtils.unstableIngot);
				r.add2X(new ItemStack(ExtraUtils.decorative1,4,6), "packGravel");
				r.addCrossWCenter(new ItemStack(ExtraUtils.decorative1,1,8), TFCItems.sterlingSilverSheet, Items.enchanted_book, Blocks.bookshelf);
				r.addCrossWCenter(new ItemStack(ExtraUtils.decorative1,1,11),new ItemStack(ExtraUtils.decorative1,4,6), new ItemStack(ExtraUtils.decorative1,1,1), TFItems.bucketEnder);
				r.addCrossWCenter(new ItemStack(ExtraUtils.decorative1,1,12), new ItemStack(ExtraUtils.decorative1,1,1), new ItemStack(ExtraUtils.decorative1,1,11), WurmTweaksBlocks.blockPlatinum);
				// TODO Bedrockium Block
				r.add3X(new ItemStack(ExtraUtils.cobblestoneCompr,1,1), Blocks.cobblestone);
				for(int b = 2; b < 7; b++)
						r.add3X(new ItemStack(ExtraUtils.cobblestoneCompr,1,b), new ItemStack(ExtraUtils.cobblestoneCompr,1,b - 1));
				r.addShaped(new ItemStack(ExtraUtils.cobblestoneCompr,1,8),"DDD", "DDD", "DDD", 'D', new ItemStack(Blocks.dirt));
				r.addShaped(new ItemStack(ExtraUtils.cobblestoneCompr,1,9),"DDD", "DDD", "DDD", 'D', new ItemStack(ExtraUtils.cobblestoneCompr,1,8));
				r.addShaped(new ItemStack(ExtraUtils.cobblestoneCompr,1,10),"DDD", "DDD", "DDD", 'D', new ItemStack(ExtraUtils.cobblestoneCompr,1,9));
				r.addShaped(new ItemStack(ExtraUtils.cobblestoneCompr,1,11),"DDD", "DDD", "DDD", 'D', new ItemStack(ExtraUtils.cobblestoneCompr,1,10));
				r.addShaped(new ItemStack(ExtraUtils.cobblestoneCompr,1,12),"DDD", "DDD", "DDD", 'D', new ItemStack(Blocks.gravel,1,0));
				r.addShaped(new ItemStack(ExtraUtils.cobblestoneCompr,1,13),"DDD", "DDD", "DDD", 'D', new ItemStack(ExtraUtils.cobblestoneCompr,1,12));
				r.addShaped(new ItemStack(ExtraUtils.cobblestoneCompr,1,14),"DDD", "DDD", "DDD", 'D', new ItemStack(Blocks.sand,1,0));
				r.addShaped(new ItemStack(ExtraUtils.cobblestoneCompr,1,15),"DDD", "DDD", "DDD", 'D', new ItemStack(ExtraUtils.cobblestoneCompr,1,14));
				r.addShaped(new ItemStack(ExtraUtils.conveyor,8), "BBB","XAX", "BBB", 'B',Blocks.rail, 'X', TFCItems.silverSheet, 'A', Items.redstone);
				r.addCircleWCenter(new ItemStack(ExtraUtils.soundMuffler,1,0), new ItemStack(Blocks.wool,1,OreDictionary.WILDCARD_VALUE), "packCloth");
				r.addCircleWCenter(new ItemStack(ExtraUtils.soundMuffler,1,1), new ItemStack(Blocks.wool,1,OreDictionary.WILDCARD_VALUE), Items.bucket);
				r.addShaped(new ItemStack(ExtraUtils.transferNode,1,0), " P ", "XBX", "SCS", 'C', "packChest", 'S', TFCItems.leadSheet2x, 'B', Blocks.redstone_block, 'X', Items.redstone, 'P', ExtraUtils.transferPipe);
				r.addShaped(new ItemStack(ExtraUtils.transferNode,1,6), " P ", "XBX", "SCS", 'C', TFCItems.blueSteelBucketEmpty, 'S', TFCItems.leadSheet2x, 'B', Blocks.redstone_block, 'X', Items.redstone, 'P', ExtraUtils.transferPipe);
				r.addShaped(new ItemStack(ExtraUtils.transferNode,1,6), " P ", "XBX", "SCS", 'C', TFCItems.redSteelBucketEmpty, 'S', TFCItems.leadSheet2x, 'B', Blocks.redstone_block, 'X', Items.redstone, 'P', ExtraUtils.transferPipe);
				// TODO Energy Node, Hyper Energy Node
				// TODO Retrieval Node Items,Liquid
				r.addShaped(new ItemStack(ExtraUtils.transferPipe,8,0), "BBB","RSR", "BBB", 'B', "packSmoothStone", 'R', Items.redstone, 'S', "packGlass");
				r.addShaped(new ItemStack(ExtraUtils.transferPipe,8,8), "BBB","RSR", "BBB", 'B', "packSmoothStone", 'R', Items.redstone, 'S', TFCItems.goldSheet);
				r.addShaped(new ItemStack(ExtraUtils.transferPipe,5,9), "DPD", "PPP", "DPD", 'D', "dye", 'P', "packSmoothStone");
				r.addShaped(new ItemStack(ExtraUtils.transferPipe,8,10), "BBB","RSR", "BBB", 'B', "packSmoothStone", 'R', Items.redstone, 'S', "dyeBlue");
				r.addShaped(new ItemStack(ExtraUtils.transferPipe,8,8), "BBB","RRR", "BBB", 'B', "packSmoothStone", 'R', Items.redstone);
				r.addShaped(new ItemStack(ExtraUtils.transferPipe,8,12), " R ", "RPR", " R ", 'R', Items.redstone, 'P', new ItemStack(ExtraUtils.transferPipe,1,0));
				r.addShaped(new ItemStack(ExtraUtils.transferPipe,8,13), " R ", "RPR", " R ", 'R', Items.redstone, 'P', new ItemStack(ExtraUtils.transferPipe,1,8));
				r.addShaped(new ItemStack(ExtraUtils.transferPipe,8,12), " R ", "RPR", " R ", 'R', Items.redstone, 'P', new ItemStack(ExtraUtils.transferPipe,1,0));
				r.addShaped(ExtraUtils.trashCan, "SSS", "CBC", "CCC", 'S', "packSmoothStone", 'C', "packCobblestone", 'B', "packChest");
				r.addBasicMachineRecipe(ExtraUtils.enderThermicPump, new ItemStack(ExtraUtils.decorative1,1,11), "packGemExquisite", Items.bucket,WurmTweaksItems.itemMachineFrame);
				r.addShaped(ExtraUtils.enderQuarry, "XAX", "BCB", "DGD", 'X', WurmTweaksItems.gearMixedSheet, 'C', TFCItems.blueSteelPick, 'B', new ItemStack(ExtraUtils.cobblestoneCompr, 1, 7), 'A', WurmTweaksItems.itemQuarryCore, 'D', "packGemExquisite", 'G', WurmTweaksBlocks.blockCompressedRedstone);
				// TODO QED Quarry Upgrade Recipes
				r.addCrossWCenter(ExtraUtils.timerBlock, Items.redstone, Blocks.redstone_torch, "packSmoothStone");
				// QED Magnium Torch
				r.addShaped(ExtraUtils.drum, "SPS", "SXS", "SPS", 'S', TFCItems.steelSheet, 'P', EnderIO.blockDarkSteelPressurePlate, 'X', Blocks.cauldron);
				r.addShaped(new ItemStack(ExtraUtils.drum,1,1), "SPS", "SXS", "SPS", 'S', ExtraUtils.bedrockium, 'P', EnderIO.blockDarkSteelPressurePlate, 'X', Blocks.cauldron);
				r.addShaped(new ItemStack(ExtraUtils.generator,1,0),"SSS", "ICI", "RFR", 'S', "packSmoothStone", 'I', new ItemStack(TFCItems.steelIngot), 'C', Blocks.piston, 'R', new ItemStack(Items.redstone), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(new ItemStack(ExtraUtils.generator,1,1),"SSS", "ICI", "RFR", 'S', "packSmoothStone", 'I', new ItemStack(TFCItems.steelIngot), 'C', WurmTweaksBlocks.blockWroughtIron, 'R', new ItemStack(Items.redstone), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(new ItemStack(ExtraUtils.generator,1,2),"SSS", "ICI", "RFR", 'S', TFItems.ingotEnderium, 'I', new ItemStack(TFCItems.steelIngot2x), 'C', WurmTweaksBlocks.blockWroughtIron, 'R', new ItemStack(Items.redstone), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(new ItemStack(ExtraUtils.generator,1,3),"SSS", "ICI", "RFR", 'S', new ItemStack(Items.redstone), 'I', new ItemStack(TFCItems.steelIngot), 'C', new ItemStack(Blocks.redstone_block), 'R', new ItemStack(Items.redstone), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(new ItemStack(ExtraUtils.generator,1,4),"SSS", "ICI", "RFR", 'S', new ItemStack(Items.redstone), 'I', new ItemStack(TFCItems.steelIngot), 'C', new ItemStack(Blocks.redstone_block), 'R', new ItemStack(Items.redstone), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(new ItemStack(ExtraUtils.generator,1,5),"SSS", "ICI", "RFR", 'S', "packSmoothStone", 'I', new ItemStack(TFCItems.steelIngot), 'C', new ItemStack(ExtraUtils.generator,1,0), 'R', new ItemStack(Items.redstone), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(new ItemStack(ExtraUtils.generator,1,6),"SSS", "ICI", "RFR", 'S', new ItemStack(Blocks.obsidian), 'I', new ItemStack(TFCItems.steelIngot), 'C', new ItemStack(Blocks.enchanting_table), 'R', new ItemStack(Items.redstone), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(new ItemStack(ExtraUtils.generator,1,7),"SSS", "ICI", "RFR", 'S', TFItems.ingotEnderium, 'I', new ItemStack(TFCItems.steelIngot2x), 'C', WurmTweaksBlocks.blockWroughtIron, 'R', new ItemStack(Items.redstone), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(new ItemStack(ExtraUtils.generator,1,8),"SSS", "ICI", "RFR", 'S', new ItemStack(Blocks.tnt), 'I', new ItemStack(TFCItems.steelIngot2x), 'C', WurmTweaksBlocks.blockWroughtIron, 'R', new ItemStack(Items.redstone), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(new ItemStack(ExtraUtils.generator,1,9),"SSS", "ICI", "RFR", 'S', "packSmoothStone", 'I', new ItemStack(TFCItems.steelIngot2x), 'C', new ItemStack(ExtraUtils.generator,1,1), 'R', new ItemStack(Items.redstone), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(new ItemStack(ExtraUtils.generator,1,11),"NNN", "ICI", "RFR", 'N', new ItemStack(Items.nether_star), 'I', ExtraUtils.unstableIngot, 'C', new ItemStack(ExtraUtils.bedrockium), 'R', new ItemStack(Items.redstone), 'F', new ItemStack(Blocks.furnace));
				r.addShaped(new ItemStack(ExtraUtils.generator2,1,0),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator,1,0), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator2,1,1),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator,1,1), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator2,1,2),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator,1,2), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator2,1,3),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator,1,3), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator2,1,4),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator,1,4), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator2,1,5),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator,1,5), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator2,1,6),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator,1,6), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator2,1,7),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator,1,7), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator2,1,8),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator,1,8), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator2,1,9),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator,1,9), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator2,1,11),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator,1,11), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator3,1,0),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator2,1,0), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator3,1,1),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator2,1,1), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator3,1,2),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator2,1,2), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator3,1,3),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator2,1,3), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator3,1,4),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator2,1,4), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator3,1,5),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator2,1,5), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator3,1,6),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator2,1,6), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator3,1,7),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator2,1,7), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator3,1,8),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator2,1,8), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator3,1,9),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator2,1,9), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.generator3,1,11),"GGG", "GNG", "GGG", 'G', new ItemStack(ExtraUtils.generator2,1,11), 'N', new ItemStack(ExtraUtils.transferNode,1,12));
				r.addShaped(new ItemStack(ExtraUtils.etheralBlock,4,0),"GGG", "GIG", "GGG", 'G', "packGlass", 'I', ExtraUtils.unstableIngot);
				r.addShaped(new ItemStack(ExtraUtils.etheralBlock,4,1),"GGG", "GIG", "GGG", 'G', new ItemStack(ExtraUtils.decorative2,1,0), 'I', ExtraUtils.unstableIngot);
				r.addShaped(new ItemStack(ExtraUtils.etheralBlock,4,2),"GGG", "GIG", "GGG", 'G', new ItemStack(ExtraUtils.decorative2,1,10), 'I', ExtraUtils.unstableIngot);
				r.addShaped(new ItemStack(ExtraUtils.nodeUpgrade,2,0),"RGR", "GCG", "RGR", 'G', new ItemStack(TFCItems.goldIngot), 'R', new ItemStack(Items.redstone), 'C',new ItemStack(TFCItems.wroughtIronIngot));
				r.addShaped(new ItemStack(ExtraUtils.nodeUpgrade,1,1),"RGR", "GCG", "RGR", 'G', "packStick", 'R', new ItemStack(Items.redstone), 'C',new ItemStack(TFCItems.wroughtIronIngot));
				r.addShaped(new ItemStack(ExtraUtils.nodeUpgrade,1,2),"RGR", "GCG", "RGR", 'G', new ItemStack(TFCItems.roseGoldIngot), 'R', new ItemStack(Items.redstone), 'C',new ItemStack(TFCItems.steelPick));
				r.addShaped(new ItemStack(ExtraUtils.nodeUpgrade,1,3),"RGR", "GCG", "RGR", 'G', new ItemStack(TFCItems.gemAmethyst), 'R', new ItemStack(Items.redstone), 'C',new ItemStack(ExtraUtils.nodeUpgrade,1,0));
				r.addShaped(new ItemStack(ExtraUtils.nodeUpgrade,1,7),"SRR", "SSS", "RRR", 'R', new ItemStack(Items.redstone), 'S', new ItemStack(ExtraUtils.nodeUpgrade,1,0));
				r.addShaped(new ItemStack(ExtraUtils.nodeUpgrade,1,8),"RRR", "SSS", "RRR", 'R', new ItemStack(Items.redstone), 'S', new ItemStack(ExtraUtils.nodeUpgrade,1,0));
				r.addShaped(new ItemStack(ExtraUtils.nodeUpgrade,1,9),"RGR", "SSS", "RGR", 'R', new ItemStack(Items.redstone), 'S', new ItemStack(ExtraUtils.nodeUpgrade,1,0), 'G', new ItemStack(TFCItems.tinSheet));
				r.addShaped(new ItemStack(ExtraUtils.goldenLasso,1,0),"ISI","SCS", "ISI", 'I', ExtraUtils.unstableIngot, 'S', new ItemStack(TFCItems.woolCloth), 'C', WurmTweaksBlocks.blockGold);
				r.addShaped(new ItemStack(ExtraUtils.goldenBag,1,0),"WXW", "CBC", "WGW", 'W', new ItemStack(Blocks.wool,1, OreDictionary.WILDCARD_VALUE), 'C', "packChest", 'G', WurmTweaksBlocks.blockGold, 'X', new ItemStack(TFCItems.silkCloth));
				r.addShaped(new ItemStack(ExtraUtils.bedrockium,32,0),"B", 'B', new ItemStack(ExtraUtils.cobblestoneCompr,1,7));
				r.addShaped(new ItemStack(ExtraUtils.buildersWand,1,0)," I", "O ", 'I', new ItemStack(ExtraUtils.unstableIngot), 'O', new ItemStack(Blocks.obsidian));
				r.addShaped(ItemNBT.addDamage(new ItemStack(ExtraUtils.ethericSword), 300)," X ", " X ", " S ", 'X', ExtraUtils.unstableIngot, 'S', "packGemExquisite");
				// TODO Angle Ring Recipes
		}
}

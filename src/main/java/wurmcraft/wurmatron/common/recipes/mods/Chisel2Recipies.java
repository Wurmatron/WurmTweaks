package wurmcraft.wurmatron.common.recipes.mods;


import com.bioxx.tfc.api.TFCItems;
import com.cricketcraft.chisel.init.ChiselBlocks;
import com.cricketcraft.chisel.init.ChiselItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

/**
 * Recipes Verified by Wurmatron
 * on 6/9/2016 with 2.5.1.44
 */
public class Chisel2Recipies {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "chisel")
		public static void addRecipes () {
				LogHandler.info("Adding Chisel 2 Recipes");
				r.addShapeless(new ItemStack(ChiselBlocks.diorite, 32), "packCobblestone", Items.quartz);
				r.addShapeless(new ItemStack(ChiselBlocks.andesite, 2), "packCobblestone", ChiselBlocks.diorite);
				r.addShapeless(new ItemStack(ChiselBlocks.limestone, 2), "packSand", ChiselBlocks.diorite);
				r.addShapeless(new ItemStack(ChiselBlocks.marble, 32), "packIngot", ChiselBlocks.andesite);
				r.addCircleWCenter(new ItemStack(ChiselBlocks.holystone, 8), "packSmoothStone", Items.feather);
				for (int d = 0; d <= 0; d++)
						r.addCircleWCenter(new ItemStack(ChiselBlocks.antiBlock, 8, d), "packCobblestone", RecipeHelper.dye.get(d));
				r.addCircleWCenter(new ItemStack(ChiselBlocks.laboratoryblock, 8), "packStone", Items.quartz);
				r.addCircleWCenter(new ItemStack(ChiselBlocks.lavastone, 32), "packSmoothStone", TFCItems.blueSteelBucketLava);
				r.addCross(new ItemStack(ChiselBlocks.technical, 64), TFCItems.wroughtIronIngot, "packSmoothStone");
				r.addShaped(new ItemStack(ChiselBlocks.factoryblock, 48), "XAX", "A A", "XAX", 'X', TFCItems.wroughtIronIngot, 'A', "packSmoothStone");
				r.addCircleWCenter(new ItemStack(ChiselBlocks.waterstone, 32), "packSmoothStone", TFCItems.redSteelBucketWater);
				r.addCircleWCenter(new ItemStack(ChiselBlocks.warningSign, 8), "packSmoothStone", Items.sign);
				r.addCircleWCenter(new ItemStack(ChiselBlocks.valentines, 24), "packCobblestone", "dyePink");
				r.addCircleWCenter(new ItemStack(ChiselBlocks.valentines, 24), "packCobblestone", "dyePurple");
				r.addCrossWCenter(new ItemStack(ChiselBlocks.futura, 32), "packSmoothStone", "packBrick", TFCItems.wroughtIronIngot);
				r.addCircleWCenter(new ItemStack(ChiselBlocks.paperwall, 8), Items.paper, "packStick");
				r.addShaped(new ItemStack(ChiselBlocks.road_line, 8), "SSS", "XXX", "SSS", 'S', "dye", 'X', "packSmoothStone");
				r.addCircleWCenter(new ItemStack(ChiselBlocks.hexPlating, 32), "packSmoothStone", new ItemStack(TFCItems.coal, 1, 0));
				r.addCircleWCenter(new ItemStack(ChiselBlocks.hexPlating, 24), "packSmoothStone", new ItemStack(TFCItems.coal, 1, 1));
				for (int d = 0; d < 16; d++) {
						r.addShapeless(new ItemStack(ChiselBlocks.woolen_clay, 2, d), new ItemStack(Blocks.wool, d), new ItemStack(Blocks.stained_glass, 1, d));
						r.addCircleWCenter(new ItemStack(ChiselBlocks.carpet_block, 8, d), new ItemStack(Blocks.wool, 1, d), Items.string);
						r.addShaped(new ItemStack(ChiselBlocks.carpet, 6, d), "WWW", 'W', new ItemStack(ChiselBlocks.carpet_block, 1, d));
						r.addShapeless(new ItemStack(ChiselBlocks.present, 1, d), Blocks.chest, RecipeHelper.dye.get(d));
				}
				// Disabled till its fixed
				// r.addShaped(ChiselBlocks.autoChisel, "SSS", " X ", "III", 'S', "packSmoothStone", 'X', Blocks.piston, 'I', TFCItems.steelSheet);
				r.addShaped(new ItemStack(ChiselItems.upgrade, 1, 0), "XAX", "ACA", "BBB", 'X', "packGemFlawless", 'A', TFCItems.blackSteelSheet, 'C', TFCHelper.getFood(TFCItems.sugar, 160), 'B', Items.redstone);
				r.addShaped(new ItemStack(ChiselItems.upgrade, 1, 1), "XAX", "ACA", "BBB", 'X', "packGemFlawless", 'A', TFCItems.blackSteelSheet, 'C', Blocks.hopper, 'B', Items.redstone);
				r.addShaped(new ItemStack(ChiselItems.upgrade, 1, 2), "XAX", "ACA", "BBB", 'X', "packGemFlawless", 'A', TFCItems.blackSteelSheet, 'C', "packCraftingTable", 'B', Items.redstone);
				r.addShaped(new ItemStack(ChiselItems.upgrade, 1, 3), "XAX", "ACA", "BBB", 'X', "packGemFlawless", 'A', TFCItems.blackSteelSheet, 'C', Blocks.cauldron, 'B', Items.redstone);
				r.addShaped(new ItemStack(ChiselItems.chisel), " I", "S ", 'I', TFCItems.bismuthBronzeIngot, 'S', "packStick");
				r.addShaped(new ItemStack(ChiselItems.diamondChisel), " I", "S ", 'I', "packGem", 'S', "packStick");
				r.addShaped(new ItemStack(ChiselItems.obsidianChisel), " I", "S ", 'I', Blocks.obsidian, 'S', "packStick");
				r.addShaped(ChiselItems.cloudinabottle, "X X", "XAX", " X ", 'X', "packGlass", 'A', Items.quartz);
				r.addShapeless(new ItemStack(ChiselBlocks.templeblock,16,0), "packSmoothStone", "dyeBlue");
				r.addShapeless(new ItemStack(ChiselBlocks.granite,2,0), new ItemStack(ChiselBlocks.andesite), "packStone");
				r.addShaped(new ItemStack(ChiselBlocks.grimstone,16,0), "XAX", "BBB", "XAX", 'X', new ItemStack(TFCItems.coal,1,1), 'A', "packStone", 'B', "packSmoothStone");
				r.addCircleWCenter(new ItemStack(ChiselBlocks.voidstone,8,0), "packSmoothStone", Items.ender_pearl);
				r.addSimpleCirc(new ItemStack(ChiselBlocks.paperwall_block,2,0), Items.paper, "packLog");
		}
}

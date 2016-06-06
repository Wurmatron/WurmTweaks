package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.item.IC2Items;
import mods.railcraft.common.blocks.RailcraftBlocks;
import mods.railcraft.common.blocks.aesthetics.brick.BrickVariant;
import mods.railcraft.common.blocks.aesthetics.brick.EnumBrick;
import mods.railcraft.common.blocks.aesthetics.cube.EnumCube;
import mods.railcraft.common.blocks.aesthetics.glass.BlockStrengthGlass;
import mods.railcraft.common.blocks.aesthetics.post.BlockPostMetal;
import mods.railcraft.common.blocks.aesthetics.post.EnumPost;
import mods.railcraft.common.blocks.anvil.BlockRCAnvil;
import mods.railcraft.common.blocks.frame.BlockFrame;
import mods.railcraft.common.carts.EnumCart;
import mods.railcraft.common.items.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.oredict.OreDictionary;
import solarexpansion.init.SEGameObjects;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.nbt.ItemNBT;
import wurmcraft.wurmatron.common.utils.railcraft.RailcraftHelper;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

import java.util.ArrayList;

public class RailCraftRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "Railcraft")
		public static void addRecipes () {
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockMachineGamma(), 1, 0), "SSS", "SDS", "SRS", 'S', TFCItems.steelSheet, 'D', Blocks.dispenser, 'R', new ItemStack(GameRegistry.findBlock("Railcraft", "detector")));
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockMachineGamma(), 1, 1), "SSS", "SRS", "SDS", 'S', TFCItems.steelSheet, 'D', Blocks.hopper, 'R', new ItemStack(GameRegistry.findBlock("Railcraft", "detector")));
				r.addCrossWCenter(new ItemStack(RailcraftBlocks.getBlockMachineGamma(), 1, 2), new ItemStack(TFCItems.blackSteelSheet), new ItemStack(Items.redstone), new ItemStack(RailcraftBlocks.getBlockMachineGamma(), 1, 0));
				r.addCrossWCenter(new ItemStack(RailcraftBlocks.getBlockMachineGamma(), 1, 3), new ItemStack(TFCItems.blackSteelSheet), new ItemStack(Items.redstone), new ItemStack(RailcraftBlocks.getBlockMachineGamma(), 1, 1));
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockMachineGamma(), 1, 0), "SSS", "SDS", "SRS", 'S', TFCItems.steelSheet, 'D', Blocks.dispenser, 'R', new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 8));
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockMachineGamma(), 1, 1), "SSS", "SRS", "SDS", 'S', TFCItems.steelSheet, 'D', Blocks.hopper, 'R', new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 8));
				ArrayList<ItemStack> lampBlocks = new ArrayList<ItemStack>();
				lampBlocks.add(0, EnumBrick.ABYSSAL.get(BrickVariant.FITTED));
				lampBlocks.add(1, EnumBrick.BLEACHEDBONE.get(BrickVariant.FITTED));
				lampBlocks.add(2, EnumBrick.BLOODSTAINED.get(BrickVariant.FITTED));
				lampBlocks.add(3, EnumBrick.FROSTBOUND.get(BrickVariant.FITTED));
				lampBlocks.add(4, EnumBrick.INFERNAL.get(BrickVariant.FITTED));
				lampBlocks.add(5, new ItemStack(Blocks.nether_brick));
				lampBlocks.add(6, EnumBrick.QUARRIED.get(BrickVariant.FITTED));
				lampBlocks.add(7, EnumBrick.SANDY.get(BrickVariant.FITTED));
				lampBlocks.add(8, new ItemStack(Blocks.sandstone, 1, 1));
				lampBlocks.add(9, new ItemStack(Blocks.stone_slab));
				for (int l = 0; l <= 9; l++) {
						r.addShaped(new ItemStack(GameRegistry.findBlock("Railcraft", "lantern.stone"), 1, l), "B", "L", "B", 'B', lampBlocks.get(l), 'L', TFCBlocks.torch);
						r.addShaped(new ItemStack(GameRegistry.findBlock("Railcraft", "lantern.stone"), 1, l), "B", "L", "B", 'B', lampBlocks.get(l), 'L', Blocks.torch);
				}
				for (int d = 15; d == 0; d--) {
						r.addCircleWCenter(new ItemStack(BlockPostMetal.post, 8, d), EnumPost.METAL_UNPAINTED.getItem(), RecipeHelper.dye.get(d));
						r.addCircleWCenter(new ItemStack(BlockPostMetal.post, 8, d), new ItemStack(BlockPostMetal.post, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));
				}
				for (int d = 0; d <= 15; d++) {
						r.addCircleWCenter(new ItemStack(BlockStrengthGlass.getBlock(), 8, d), new ItemStack(BlockStrengthGlass.getBlock(), 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));
						r.addShaped(new ItemStack(BlockStrengthGlass.getBlock(), 6, d), "GDG", "GIG", "GDG", 'G', "packGlass", 'D', RecipeHelper.dye.get(d), 'I', TFCItems.steelSheet);
				}
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockElevator(), 6), "RSR", "RXR", "RSR", 'R', new ItemStack(RailcraftItem.rail.item(), 1, 1), 'S', Items.redstone, 'X', TFCItems.blackSteelSheet);
				// TODO Abystal Stone
				// TODO Quarried Stone
				r.addCross(new ItemStack(EnumCube.CONCRETE_BLOCK.getItem().getItem(), 4), "packSmoothStone", RailcraftItem.rebar.getStack(), true);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockMachineDelta(), 16, 0), "XXX", "FFF", "XXX", 'X', "packSmoothStone", 'X', Blocks.redstone_block);
				ArrayList<ItemStack> lampMetal = new ArrayList<ItemStack>();
				lampMetal.add(0, new ItemStack(TFCItems.wroughtIronSheet));
				lampMetal.add(1, new ItemStack(TFCItems.goldSheet));
				lampMetal.add(2, new ItemStack(TFCItems.copperSheet));
				lampMetal.add(3, new ItemStack(TFCItems.tinSheet));
				lampMetal.add(4, new ItemStack(TFCItems.leadSheet));
				lampMetal.add(5, new ItemStack(TFCItems.steelSheet));
				for (int l = 0; l <= 5; l++) {
						r.addShaped(new ItemStack(GameRegistry.findBlock("Railcraft", "lantern.metal"), 1, l), "B", "L", "B", 'B', lampMetal.get(l), 'L', TFCBlocks.torch);
						r.addShaped(new ItemStack(GameRegistry.findBlock("Railcraft", "lantern.metal"), 1, l), "B", "L", "B", 'B', lampMetal.get(l), 'L', Blocks.torch);
				}
				r.addShaped(new ItemStack(BlockFrame.getItem().getItem(), 6), "XXX", "F F", "F F", 'X', TFCItems.blackSteelSheet, 'F', RailcraftItem.rebar.getStack());
				r.addCrossWCenter(new ItemStack(RailcraftBlocks.getBlockMachineAlpha(), 1, 8), WurmTweaksItems.itemMixedSheet, Blocks.piston, new ItemStack(TFCBlocks.workbench));
				r.addCrossWCenter(new ItemStack(RailcraftBlocks.getBlockMachineAlpha(), 1, 8), WurmTweaksItems.itemMixedSheet, Blocks.piston, new ItemStack(Blocks.crafting_table));
				r.addCrossWCenter(new ItemStack(RailcraftBlocks.getBlockMachineAlpha(), 1, 15), Blocks.piston, "packGemExquisite", WurmTweaksBlocks.blockBlackSteel);
				r.addCrossWCenter(new ItemStack(RailcraftBlocks.getBlockMachineAlpha(), 1, 1), WurmTweaksBlocks.blockBlackSteel, new ItemStack(TFCItems.redSteelSheet), "packGlass");
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockMachineAlpha(), 1, 5), "XXX", "SNS", "SSS", 'X', Blocks.netherrack, 'S', TFCItems.wroughtIronSheet, 'N', TFCItems.flintSteel);
				r.addShapeless(new ItemStack(RailcraftBlocks.getBlockMachineAlpha(), 1, 9), TFCItems.steelSheet2x, Blocks.iron_bars, WurmTweaksItems.itemMachineFrame);
				r.addShapeless(new ItemStack(RailcraftBlocks.getBlockMachineAlpha(), 1, 10), TFCItems.steelSheet2x, Blocks.iron_bars, WurmTweaksItems.itemMachineFrame, WurmTweaksBlocks.blockCompressedRedstone);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 4), "DDD", "XIX", 'D', "dye", 'X', TFCItems.silverSheet, 'I', Items.redstone);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 2), "DDD", "XIX", 'D', "dye", 'X', TFCItems.silverSheet, 'I', new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 4));
				r.addShapeless(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 5), new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 2), new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 16));
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 3), "XBB", "  A", "  A", 'X', Blocks.glowstone, 'B', TFCItems.silverSheet, 'A', TFCItems.blackSteelSheet);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 11), "XBB", "  A", "  A", 'X', Blocks.glowstone, 'B', TFCItems.silverSheet, 'A', TFCItems.steelSheet);
				r.addShapeless(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 1), new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 3), new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 3), TFCItems.steelSheet2x);
				r.addShapeless(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 12), new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 11), new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 11), TFCItems.steelSheet2x);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 12), "SSS", "SXS", "SRS", 'S', TFCItems.blackSteelSheet, 'X', "dyeGreen", 'R', Items.redstone);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 8), "SSS", "SXS", "SRS", 'S', TFCItems.blackSteelSheet, 'X', TFCItems.silverSheet, 'R', Items.redstone);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 9), "SSS", "SXS", "SRS", 'S', TFCItems.blackSteelSheet, 'X', "dyeBlue", 'R', Items.redstone);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 10), "SSS", "SXS", "SRS", 'S', TFCItems.blackSteelSheet, 'X', Items.comparator, 'R', Items.redstone);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 7), "SSS", "SXS", "SRS", 'S', TFCItems.blackSteelSheet, 'X', "dyeRed", 'R', Items.redstone);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 9), "SSS", "SXS", "SRS", 'S', TFCItems.blackSteelSheet, 'X', "dyeYellow", 'R', Items.redstone);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 6), "SSS", "SXS", "SRS", 'S', TFCItems.blackSteelSheet, 'X', Items.repeater, 'R', Items.redstone);
				r.addShaped(new ItemStack(RailcraftBlocks.getBlockSignal(), 1, 0), "SSS", "SXS", "SRS", 'S', TFCItems.blackSteelSheet, 'X', Items.quartz, 'R', Items.redstone);
				// All Deco Blocks
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 0), "packPlanks", new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 1), "packSmoothStone", new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 2), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 3), new ItemStack(Blocks.mossy_cobblestone), new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 4), "packCobblestone", new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 5), new ItemStack(Blocks.stone_slab), new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 6), new ItemStack(Blocks.wooden_slab), new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 7), "packLog", new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 8), new ItemStack(Items.brick), new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 9), new ItemStack(TFCItems.steelIngot), new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 11), TFCHelper.getFood(TFCItems.sugar, 160), new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 12), new ItemStack(Blocks.nether_brick), new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 13), new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 15), "packSmoothStone", new ItemStack(Blocks.stone_pressure_plate));
				r.addCircleWCenter(new ItemStack(GameRegistry.findBlock("Railcraft", "detector"), 1, 16), new ItemStack(Blocks.quartz_block), new ItemStack(Blocks.stone_pressure_plate));
				r.addCrossWCenter(new ItemStack(RailcraftBlocks.getBlockMachineEpsilon(), 1, 0), new ItemStack(TFCItems.steelSheet), IC2Items.getItem("glassFiberCableItem"), WurmTweaksBlocks.blockCompressedRedstone);
				r.addCrossWCenter(new ItemStack(RailcraftBlocks.getBlockMachineEpsilon(), 1, 4), new ItemStack(TFCItems.copperSheet), IC2Items.getItem("glassFiberCableItem"), WurmTweaksBlocks.blockCompressedRedstone);
				r.addCrossWCenter(new ItemStack(RailcraftBlocks.getBlockMachineEpsilon(), 8, 3), new ItemStack(TFCItems.copperSheet), "packGemExquisite", WurmTweaksBlocks.blockCompressedRedstone);
				r.addShaped(new ItemStack(BlockRCAnvil.getBlock(), 1, 0), "BBB", " I ", "III", 'B', WurmTweaksBlocks.blockCompressedRedstone, 'I', TFCItems.steelIngot);
				r.addShapeless(new ItemStack(EnumPost.WOOD.getItem().getItem(), 2), new ItemStack(RailcraftItem.tie.item()));
				r.addShaped(new ItemStack(EnumPost.STONE.getItem().getItem(), 2), "SRS", "SRS", "SRS", 'S', RailcraftItem.rebar.getStack(), 'S', "packSmoothStone");
				r.addShaped(new ItemStack(EnumPost.METAL_UNPAINTED.getItem().getItem(), 4), "SRS", "SRS", 'S', RailcraftItem.rebar.getStack(), 'S', TFCItems.steelIngot);
				r.addShaped(RailcraftHelper.getTrack(8, "railcraft:track.switch", 4767), "XBX", "XXX", "XXX", 'B', TFCItems.steelSheet, 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD));
				r.addShaped(RailcraftHelper.getTrack(8, "railcraft:track.wye", 2144), "XXX", "XXB", "XXX", 'B', TFCItems.steelSheet, 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD));
				r.addShaped(RailcraftHelper.getTrack(4, "railcraft:track..junction", 0), "XXX", "XBX", "XXX", 'B', TFCItems.steelSheet, 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD));
				r.addShaped(RailcraftHelper.getTrack(8, "railcaft:track.control", 0), "XCX", "RBR", "XCX", 'B', TFCItems.steelSheet, 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD), 'R', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.ADVANCED), 'C', Items.redstone);
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.locking", 0), "RCR", "RBR", "RCR", 'B', TFCItems.steelSheet, 'R', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.ADVANCED), 'C', Items.redstone);
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.disembarking", 23575), "RPR", "RBR", "RCR", 'B', TFCItems.steelSheet, 'R', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD), 'C', Items.redstone, 'P', "wurmplate");
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.embarking", 23575), "RCR", "RBR", "RCP", 'B', TFCItems.steelSheet, 'R', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD), 'C', Items.redstone, 'P', "wurmplate");
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.coupler", 0), "RCR", "RBR", "RCP", 'B', TFCItems.steelSheet, 'R', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.ADVANCED), 'C', Items.redstone, 'P', ItemNBT.addDamage(ItemCrowbar.getItem(), 200));
				r.addShaped(RailcraftHelper.getTrack(8, "railcraft:track.whistle", 0), "XBX", "XXX", "XXX", 'B', "dye", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD));
				r.addShaped(RailcraftHelper.getTrack(8, "railcraft:track.locomotive", 30516), "XBX", "XXX", "XXX", 'B', Blocks.glowstone, 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.ADVANCED));
				r.addShaped(RailcraftHelper.getTrack(8, "railcraft:track.limiter", 16093), "XBX", "XXX", "XXX", 'B', Items.repeater, 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.ADVANCED));
				r.addShaped(RailcraftHelper.getTrack(8, "railcraft:track.routing", 0), "XBX", "XCX", "XRX", 'B', ItemTicketGold.item, 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.ADVANCED), 'C', TFCItems.blackSteelSheet, 'R', Items.redstone);
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.buffer.stop", 32363), "R R", "RBR", "RCR", 'B', TFCItems.steelSheet, 'R', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD), 'C', WurmTweaksBlocks.blockWroughtIron);
				r.addShaped(RailcraftHelper.getTrack(4, "railcaft:track.oneway", 30946), "RXR", "RBR", "RCR", 'X', Blocks.piston, 'B', TFCItems.steelSheet, 'R', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD), 'C', WurmTweaksBlocks.blockWroughtIron);
				r.addShaped(RailcraftHelper.getTrack(4, "railcaft:track.detector.direction", 0), "RXR", "RBR", "RCR", 'X', "wurmplate", 'B', TFCItems.steelSheet, 'R', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD), 'C', WurmTweaksBlocks.blockSteel);
				r.addShapeless(RailcraftHelper.getTrack(1, "railcaft:track.gated.oneway", 0), RailcraftHelper.getTrack(4, "railcaft:track.oneway", 30946), Blocks.fence_gate);
				r.addShapeless(RailcraftHelper.getTrack(1, "railcaft:track.gated.oneway", 0), Blocks.rail, Blocks.fence_gate);
				r.addShaped(RailcraftHelper.getTrack(8, "railcaft:track.suspended", 0), "RCR", "RBR", "RCR", 'B', TFCItems.steelSheet, 'R', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD), 'C', TFCItems.bronzeIngot);
				r.addShaped(RailcraftHelper.getTrack(1, "railcaft:track.disposal", 2264), "RCR", "RBR", "RCR", 'B', TFCItems.steelSheet, 'R', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.STANDARD), 'C', TFCItems.bismuthBronzeSheet);
				r.addShaped(RailcraftHelper.getTrack(8, "railcaft:track.slow", 736), "X X", "XLX", "X X", 'X', "packLog", 'L', "packPlanks");
				r.addShaped(RailcraftHelper.getTrack(16, "railcaft:track.slow.boost", 0), "XRX", "XLX", "XRX", 'X', "packLog", 'L', "packPlanks", 'R', TFCItems.goldSheet);
				r.addShaped(RailcraftHelper.getTrack(8, "railcaft:track.slow.junction", 0), "XXX", "XLX", "XXX", 'X', "packLog", 'L', "packPlanks");
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.slow.switch", 0), "XLX", "XLX", "XXX", 'X', "packLog", 'L', "packPlanks");
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.slow.wye", 0), "XXX", "XLL", "XXX", 'X', "packLog", 'L', "packPlanks");
				r.addShaped(RailcraftHelper.getTrack(8, "railcaft:track.reinforced", 736), "X X", "XLX", "X X", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.REINFORCED), 'L', TFCItems.steelSheet);
				r.addShaped(RailcraftHelper.getTrack(16, "railcaft:track.reinforced.boost", 0), "XRX", "XLX", "XRX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.REINFORCED), 'L', TFCItems.steelSheet, 'R', TFCItems.goldSheet);
				r.addShaped(RailcraftHelper.getTrack(8, "railcaft:track.reinforced.junction", 0), "XXX", "XLX", "XXX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.REINFORCED), 'L', TFCItems.steelSheet);
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.reinforced.switch", 0), "XLX", "XLX", "XXX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.REINFORCED), 'L', TFCItems.steelSheet);
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.reinforced.wye", 0), "XXX", "XLL", "XXX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.REINFORCED), 'L', TFCItems.steelSheet);
				r.addShaped(RailcraftHelper.getTrack(8, "railcaft:track.electric", 736), "X X", "XLX", "X X", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.ELECTRIC), 'L', TFCItems.steelSheet);
				r.addShaped(RailcraftHelper.getTrack(16, "railcaft:track.electric.boost", 0), "XRX", "XLX", "XRX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.ELECTRIC), 'L', TFCItems.steelSheet, 'R', TFCItems.goldSheet);
				r.addShaped(RailcraftHelper.getTrack(8, "railcaft:track.electric..junction", 0), "XXX", "XLX", "XXX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.ELECTRIC), 'L', TFCItems.steelSheet);
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.electric.switch", 0), "XLX", "XLX", "XXX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.ELECTRIC), 'L', TFCItems.steelSheet);
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.electric.wye", 0), "XXX", "XLL", "XXX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.ELECTRIC), 'L', TFCItems.steelSheet);
				r.addShaped(RailcraftHelper.getTrack(16, "railcaft:track.speed.boost", 0), "XRX", "XLX", "XRX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.SPEED), 'L', TFCItems.blackSteelSheet, 'R', TFCItems.goldSheet);
				r.addShaped(RailcraftHelper.getTrack(8, "railcaft:track.speed..junction", 0), "XXX", "XLX", "XXX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.SPEED), 'L', TFCItems.blackSteelSheet);
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.speed.switch", 0), "XLX", "XLX", "XXX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.SPEED), 'L', TFCItems.blackSteelSheet);
				r.addShaped(RailcraftHelper.getTrack(2, "railcaft:track.speed.wye", 0), "XXX", "XLL", "XXX", 'X', RailcraftItem.rail.getStack(1, ItemRail.EnumRail.SPEED), 'L', TFCItems.blackSteelSheet);
				r.addShapeless(RailcraftItem.rail.getStack(6, ItemRail.EnumRail.WOOD), TFCItems.wroughtIronIngot, RailcraftItem.tie.getRecipeObject(ItemTie.EnumTie.WOOD));
				r.addCrossWCenter(new ItemStack(RailcraftBlocks.getBlockMachineBeta(), 4, 0), new ItemStack(TFCItems.wroughtIronSheet2x), new ItemStack(TFCItems.steelSheet), WurmTweaksBlocks.blockWroughtIron);
				r.addCrossWCenter(new ItemStack(RailcraftBlocks.getBlockMachineBeta(), 4, 13), new ItemStack(TFCItems.steelSheet2x), new ItemStack(TFCItems.steelSheet), WurmTweaksBlocks.blockWroughtIron);
				r.addShapeless(new ItemStack(RailcraftBlocks.getBlockMachineBeta(), 1, 1), new ItemStack(RailcraftBlocks.getBlockMachineBeta(), 1, 0), "packGlass");
				r.addShapeless(new ItemStack(RailcraftBlocks.getBlockMachineBeta(), 1, 14), new ItemStack(RailcraftBlocks.getBlockMachineBeta(), 1, 13), "packGlass");
				r.addShapeless(new ItemStack(RailcraftBlocks.getBlockMachineBeta(), 1, 2), new ItemStack(RailcraftBlocks.getBlockMachineBeta(), 1, 0), Blocks.lever);
				r.addShapeless(new ItemStack(RailcraftBlocks.getBlockMachineBeta(), 1, 15), new ItemStack(RailcraftBlocks.getBlockMachineBeta(), 1, 13), Blocks.lever);
				r.addCircleWCenter(new ItemStack(RailcraftPartItems.itemTurbineDisk, 1, 0), new ItemStack(RailcraftPartItems.itemTurbineBlade), new ItemStack(WurmTweaksBlocks.blockSteel));
				r.addShapeless(new ItemStack(RailcraftPartItems.itemTurbineRotor, 1, 0), new ItemStack(RailcraftPartItems.itemTurbineDisk, 1, 0), new ItemStack(RailcraftPartItems.itemTurbineDisk, 1, 0), new ItemStack(RailcraftPartItems.itemTurbineDisk, 1, 0));
				r.addCrossWCenter(new ItemStack(RailcraftPartItems.itemTurbineBlade, 1, 0), new ItemStack(TFCItems.steelSheet), new ItemStack(TFCItems.blackSteelSheet), new ItemStack(TFCItems.goldSheet));
				r.addShaped(ItemNBT.addDamage(ItemCrowbar.getItem(), 200), " DS", "DSD", "SD ", 'D', "dyeRed", 'S', TFCItems.steelSheet);
				r.addShaped(ItemNBT.addDamage(ItemCrowbarReinforced.getItem(), 220), " DS", "DSD", "SD ", 'D', "dyeRed", 'S', TFCItems.blackSteelSheet);
				r.addShaped(GameRegistry.findItemStack("railcraft", "armor.googles", 1), "LGL", "XXX", 'L', TFCItems.leather, 'G', "packGlass", 'X', TFCItems.goldSheet);
				r.addShapeless(ItemTicketGold.getTicket(), TFCItems.goldIngot, Items.paper, "dyeBlack");
				r.addShaped(GameRegistry.findItemStack("railcraft", "tool.surveyor", 1), " C ", "BXB", " F ", 'C', Items.compass, 'B', Blocks.stone_button, 'X', "packGlass", 'F', TFCItems.wroughtIronSheet);
				r.addShapeless(GameRegistry.findItemStack("railcraft", "routing.table", 2), Items.book, TFCItems.steelSheet);
				r.addShapeless(GameRegistry.findItemStack("railcraft", "tool.electric.meter", 1), TFCItems.steelSheet, TFCItems.copperIngot, IC2Items.getItem("electronicCircuit"));
				r.addShaped(GameRegistry.findItemStack("railcraft", "tool.whistle.tuner", 1), "S S", " S ", " S ", 'S', TFCItems.steelIngot);
				ItemStack electricLocomotive = EnumCart.LOCO_ELECTRIC.getCartItem();
				NBTTagCompound electric = new NBTTagCompound();
				electric.setString("model", "railcraft:default");
				electricLocomotive.setTagCompound(electric);
				r.addShaped(electricLocomotive, "LXL", "SFS", "G G", 'L', Blocks.glowstone, 'X', new ItemStack(SEGameObjects.SolarPanelHardened), 'S', TFCItems.blackSteelSheet2x, 'G', TFCItems.platinumSheet);
				ItemStack steamLocomotive = EnumCart.LOCO_STEAM_SOLID.getCartItem();
				NBTTagCompound steam = new NBTTagCompound();
				steam.setString("model", "railcraft:default");
				steamLocomotive.setTagCompound(steam);
				r.addShaped(steamLocomotive, "LXL", "SFS", "G G", 'L', Blocks.glowstone, 'X', new ItemStack(SEGameObjects.SolarPanelHardened), 'S', TFCItems.steelSheet2x, 'G', TFCItems.platinumSheet);
				r.addShapeless(GameRegistry.findItemStack("railcraft", "tool.signal.label", 1), TFCItems.wroughtIronIngot, Items.paper, "dyeBlack");
				// TODO Machine Recipes
		}
}

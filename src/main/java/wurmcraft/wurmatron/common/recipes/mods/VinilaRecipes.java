package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.ic2.ICHelper;
import wurmcraft.wurmatron.common.utils.machines.MachineHelper;
import wurmcraft.wurmatron.common.utils.nbt.ItemNBT;
import wurmcraft.wurmatron.common.utils.techreborn.TechRebornHelper;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

public class VinilaRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				for (ItemStack stone : OreDictionary.getOres("packSmoothStone"))
						GameRegistry.addSmelting(stone, new ItemStack(Blocks.stone), 1f);
				r.addCircleWCenter(new ItemStack(Blocks.bedrock, 2), ExtraUtils.bedrockiumBlock, WurmTweaksItems.itemAntiMatter);
				r.addShaped(Blocks.dispenser, "CCC", "CBC", "CRC", 'C', "packCobblestone", 'B', new ItemStack(TFCItems.bow, 1, OreDictionary.WILDCARD_VALUE), 'R', Items.redstone);
				r.add2X(new ItemStack(Blocks.sandstone, 4, 0), "packSand");
				r.addCircleWCenter(Blocks.noteblock, "packLog", Items.redstone);
				r.addShaped(Blocks.detector_rail, "S S", "SPS", "S S", 'S', Blocks.rail, 'P', Blocks.heavy_weighted_pressure_plate);
				r.addShaped(Blocks.web, "S S", " S ", "S S", 'S', Items.string);
				r.add2X(Blocks.wool, "packCloth");
				for (int d = 0; d < 16; d++) {
						r.addShapeless(new ItemStack(Blocks.wool, 1, d), new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));
						r.addCircleWCenter(new ItemStack(Blocks.wool, 8, d), new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));
						r.addShapeless(new ItemStack(Blocks.stained_glass, 1, d), new ItemStack(Blocks.stained_glass, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));
						r.addCircleWCenter(new ItemStack(Blocks.stained_glass, 8, d), new ItemStack(Blocks.stained_glass, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));
						r.addShapeless(new ItemStack(Blocks.stained_glass_pane, 1, d), new ItemStack(Blocks.stained_glass_pane, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));
						r.addCircleWCenter(new ItemStack(Blocks.stained_glass_pane, 8, d), new ItemStack(Blocks.stained_glass_pane, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));
						r.addShapeless(new ItemStack(Blocks.stained_hardened_clay, 1, d), Blocks.hardened_clay, RecipeHelper.dye.get(d));
						r.addShapeless(new ItemStack(Blocks.stained_hardened_clay, 1, d), new ItemStack(Blocks.stained_hardened_clay, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));
						r.addCircleWCenter(new ItemStack(Blocks.stained_hardened_clay, 8, d), new ItemStack(Blocks.stained_hardened_clay, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));
						r.add3X(Blocks.hay_block, TFCBlocks.thatch);
						r.addShapeless(new ItemStack(Blocks.carpet, 1, d), new ItemStack(Blocks.carpet, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));
						r.addCircleWCenter(new ItemStack(Blocks.carpet, 8, d), new ItemStack(Blocks.carpet, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(d));

				}
				r.addSlabs(new ItemStack(Blocks.stone_slab, 12, 0), "packSmoothStone");
				r.addSlabs(new ItemStack(Blocks.stone_slab, 12, 1), new ItemStack(Blocks.sandstone, 1, OreDictionary.WILDCARD_VALUE));
				r.addSlabs(new ItemStack(Blocks.stone_slab, 12, 3), "packCobblestone");
				r.addSlabs(new ItemStack(Blocks.stone_slab, 12, 4), Blocks.brick_block);
				r.add2X(Blocks.brick_block, Items.brick);
				r.addCross(Blocks.tnt, Items.gunpowder, "packSand");
				r.addShaped(new ItemStack(Blocks.obsidian, 8), "XA", "AX", 'X', TFCItems.blueSteelBucketLava, 'A', TFCItems.redSteelBucketWater);
				r.addShaped(new ItemStack(Blocks.obsidian, 8), "XA", "AX", 'X', TFCItems.redSteelBucketWater, 'A', TFCItems.blueSteelBucketLava);
				r.addCircleWCenter(Blocks.cobblestone, "packCobblestone", TFCItems.wroughtIronSheet);
				r.addPressurePlate(Blocks.stone_pressure_plate, "packSmoothStone");
				r.addPressurePlate(Blocks.wooden_pressure_plate, "packLog");
				r.addPressurePlate(Blocks.heavy_weighted_pressure_plate, TFCItems.wroughtIronSheet);
				r.addPressurePlate(Blocks.light_weighted_pressure_plate, TFCItems.goldSheet);
				r.addShaped(Blocks.redstone_torch, "X", "S", 'X', Items.redstone, 'S', "packStick");
				r.addShapeless(Blocks.stone_button, "packSmoothStone");
				r.addShapeless(Blocks.wooden_button, "packPlanks");
				r.add2X(Blocks.snow, Items.snowball);
				r.add2X(Blocks.clay, TFCItems.clayBall);
				r.addCircleWCenter(Blocks.jukebox, "packLog", "packGem");
				r.addSlabs(new ItemStack(Blocks.fence), "packStick");
				r.addShaped(Blocks.fence_gate, "XGX", "XGX", 'X', "packStick", 'G', "packLog");
				r.addCircleWCenter(new ItemStack(Blocks.stained_glass, 8, 0), "packGlass", "dye");
				r.addSlabs(new ItemStack(Blocks.stained_glass_pane, 8, 0), new ItemStack(Blocks.stained_glass, 1, 0));
				r.add2X(new ItemStack(Blocks.stonebrick, 4, 0), "packSmoothStone");
				r.add2X(new ItemStack(Blocks.stonebrick, 4, 1), Blocks.stonebrick);
				r.addSlabs(new ItemStack(Blocks.iron_bars, 12, 0), TFCItems.wroughtIronSheet);
				r.addSlabs(new ItemStack(Blocks.glass_pane, 12, 0), Blocks.glass);
				r.addShaped(Blocks.enchanting_table, " B ", "XAX", "BBB", 'B', Blocks.obsidian, 'B', Items.book, 'X', "packGemExquisite", 'A', TFCItems.blueSteelSheet2x);
				r.addSimpleCirc(Blocks.redstone_lamp, Blocks.glowstone, Items.redstone);
				r.addShapeless(Blocks.tripwire_hook, TFCItems.wroughtIronSheet, Items.redstone, Items.string);
				r.addShaped(Blocks.beacon, "GGG", "GXG", "BBB", 'G', "packGlass", 'X', Items.nether_star, 'B', Blocks.obsidian);
				r.addShaped(Blocks.anvil, "BBB", " S ", "S S", 'B', WurmTweaksBlocks.blockSteel, 'S', TFCItems.steelSheet);
				r.addBasicMachineRecipe(Blocks.daylight_detector, Items.quartz, Items.redstone, Items.glowstone_dust, TFCItems.wroughtIronSheet);
				r.addShapeless(new ItemStack(Items.redstone, 32), new ItemStack(Blocks.redstone_block));
				r.addShaped(Blocks.hopper, "SCS", "S S", " S ", 'S', TFCItems.wroughtIronIngot, 'C', "packChest");
				r.addShapeless(new ItemStack(Items.quartz, 32), new ItemStack(Blocks.quartz_block));
				r.addShaped(Blocks.dropper, "CCC", "C C", "CRC", 'C', "packCobblestone", 'R', Items.redstone);
				r.addPressurePlate(new ItemStack(Blocks.carpet, 6, 0), "packCloth");
				r.addShapeless(new ItemStack(TFCItems.coal, 1, 0), Items.coal);
				r.addShapeless(Items.coal, new ItemStack(TFCItems.coal, 1, 0));
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.iron_shovel), 200), " S ", " X ", " X ", 'S', TFCItems.wroughtIronSheet, 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.iron_sword), 250), " S ", " S ", " X ", 'S', TFCItems.wroughtIronSheet, 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.iron_pickaxe), 250), "SSS", " X ", " X ", 'S', TFCItems.wroughtIronSheet, 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.iron_axe), 250), "SS ", "SX ", " X ", 'S', TFCItems.wroughtIronSheet, 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.iron_axe), 250), " SS", " XS", " X ", 'S', TFCItems.wroughtIronSheet, 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.diamond_shovel), 350), " S ", " X ", " X ", 'S', new ItemStack(TFCItems.gemDiamond, 1, 2), 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.diamond_sword), 350), " S ", " S ", " X ", 'S', new ItemStack(TFCItems.gemDiamond, 1, 2), 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.diamond_pickaxe), 280), "SSS", " X ", " X ", 'S', new ItemStack(TFCItems.gemDiamond, 1, 2), 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.diamond_axe), 300), "SS ", "SX ", " X ", 'S', new ItemStack(TFCItems.gemDiamond, 1, 2), 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.diamond_axe), 300), " SS", " XS", " X ", 'S', new ItemStack(TFCItems.gemDiamond, 1, 2), 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.iron_shovel), 100), " S ", " X ", " X ", 'S', TFCItems.goldSheet, 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.iron_sword), 200), " S ", " S ", " X ", 'S', TFCItems.goldSheet, 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.iron_pickaxe), 150), "SSS", " X ", " X ", 'S', TFCItems.goldSheet, 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.iron_axe), 150), "SS ", "SX ", " X ", 'S', TFCItems.goldSheet, 'X', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(Items.iron_axe), 150), " SS", " XS", " X ", 'S', TFCItems.goldSheet, 'X', "packStick");
				r.addShaped(new ItemStack(Items.minecart, 1, 0), "S S", "SSS", 'S', TFCItems.wroughtIronSheet);
				r.addShaped(new ItemStack(Items.minecart, 2, 0), "S S", "SSS", 'S', TFCItems.steelSheet);
				r.addShaped(new ItemStack(Items.minecart, 4, 0), "S S", "SSS", 'S', TFCItems.blackSteelSheet);
				r.addShapeless(Items.leather, TFCItems.leather);
				r.addShapeless(Items.clay_ball, TFCItems.clayBall);
				r.addShaped(Items.iron_door, "SS", "SS", "SS", 'S', TFCItems.wroughtIronSheet);
				r.addShapeless(Items.bucket, TFCItems.blueSteelBucketEmpty, TFCItems.redSteelBucketEmpty);
				r.addShapeless(Items.name_tag, "dyeBlack", Items.paper);
				r.addShaped(new ItemStack(Items.paper, 12), TFCItems.juteFiber);
				r.addShaped(Blocks.cauldron, "S S", "S S", "SSS", 'S', TFCItems.wroughtIronSheet);
				r.addShaped(new ItemStack(Items.glass_bottle, 3), "G G", " G ", 'G', "packGlass");
				r.addShapeless(Items.chest_minecart, "packChest", Items.minecart);
				r.addShapeless(Items.hopper_minecart, Blocks.hopper, Items.minecart);
				r.addShapeless(Items.egg, TFCHelper.getFood(TFCItems.egg, 2f));
				r.addShapeless(Items.ender_eye, Items.ender_pearl, Items.blaze_powder);
				r.addShaped(Items.boat, "L L", "LLL", 'L', "packLumber");
				r.addShaped(Items.brewing_stand, " S ", "CCC", 'S', Items.blaze_rod, 'C', "packCobblestone");
				r.addShapeless(Items.magma_cream, Items.slime_ball, Items.blaze_powder);
				if (RecipeChecker.modExists("IC2")) {
						addExtractorRecipes();
						addCompressonRecipes();
				}
				addFurnaceRecipes();
				if (RecipeChecker.modExists("techreborn")) {
						addCentrifugeRecipes();
						addElectrolizerRecipes();
				}
		}

		@Optional.Method (modid = "IC2")
		private static void addExtractorRecipes () {
				ICHelper.addExtractorRecipe(new ItemStack(TFCBlocks.grass, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.grass));
				ICHelper.addExtractorRecipe(new ItemStack(TFCBlocks.grass2, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.grass));
				ICHelper.addExtractorRecipe(new ItemStack(TFCBlocks.gravel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel));
				ICHelper.addExtractorRecipe(new ItemStack(TFCBlocks.gravel2, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel));
				ICHelper.addExtractorRecipe(new ItemStack(TFCBlocks.dirt, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.dirt));
				ICHelper.addExtractorRecipe(new ItemStack(TFCBlocks.dirt2, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.dirt));
				ICHelper.addExtractorRecipe(new ItemStack(TFCBlocks.sand, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand));
				ICHelper.addExtractorRecipe(new ItemStack(TFCBlocks.sand2, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand));
		}

		private static void addFurnaceRecipes () {
				for (int i = 0; i < 16; i++)
						MachineHelper.addFurnaceRecipes(new ItemStack(TFCBlocks.sand, 1, i), new ItemStack(Blocks.glass));
				for (int s = 0; s < 4; s++)
						MachineHelper.addFurnaceRecipes(new ItemStack(TFCBlocks.sand2, 1, s), new ItemStack(Blocks.glass));
				MachineHelper.addFurnaceRecipes(new ItemStack(Blocks.sand), new ItemStack(Blocks.glass));
				MachineHelper.addFurnaceRecipes(new ItemStack(Blocks.hardened_clay), new ItemStack(Blocks.clay));
		}

		@Optional.Method (modid = "IC2")
		private static void addCompressonRecipes () {
				ICHelper.addCompressorRecipe(new ItemStack(TFCItems.powder, 32, 6), new ItemStack(Blocks.lapis_block));
				ICHelper.addCompressorRecipe(new ItemStack(Items.redstone, 32), new ItemStack(Blocks.redstone_block));
				ICHelper.addCompressorRecipe(new ItemStack(Items.quartz, 32), new ItemStack(Blocks.quartz_block));

		}

		@Optional.Method (modid = "techreborn")
		private static void addCentrifugeRecipes () {
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(Blocks.cobblestone), null, new ItemStack(Blocks.netherrack, 4), null, null, null, 200, 32);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(Blocks.sand), null, new ItemStack(Blocks.soul_sand, 4), null, null, null, 200, 32);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.wroughtIronSheet), null, new ItemStack(Items.glowstone_dust, 16), null, null, null, 400, 8);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.coal, 4, 1), null, new ItemStack(Items.ghast_tear, 1, 0), null, null, null, 100, 128);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.coal, 1, 0), null, new ItemStack(Items.blaze_rod), null, null, null, 80, 512);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.bismuthBronzeSheet), null, new ItemStack(Items.quartz, 16), null, null, null, 60, 32);
		}

		@Optional.Method (modid = "techreborn")
		private static void addElectrolizerRecipes () {
				TechRebornHelper.addIndustrialElectrolyzerRecipe(new ItemStack(Blocks.cobblestone), null, new ItemStack(Blocks.netherrack, 16), null, null, null, 200, 32);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(Blocks.sand), null, new ItemStack(Blocks.soul_sand, 16), null, null, null, 200, 32);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.wroughtIronSheet), null, new ItemStack(Items.glowstone_dust, 64), null, null, null, 400, 8);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.coal, 4, 1), null, new ItemStack(Items.ghast_tear, 1, 4), null, null, null, 100, 128);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.coal, 1, 0), null, new ItemStack(Items.blaze_rod, 4), null, null, null, 80, 512);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.bismuthBronzeSheet), null, new ItemStack(Items.quartz, 64), null, null, null, 60, 32);
		}
}

package wurmcraft.wurmatron.common.recipes;

import am2.items.ItemsCommonProxy;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import crazypants.enderio.EnderIO;
import fox.spiteful.avaritia.blocks.LudicrousBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

import java.util.ArrayList;

public class OreDict {

		public static void init () {
				LogHandler.info("Adding custom ore dictionary values");
				// Smooth Stone
				add("packSmoothStone", Blocks.stone);
				add("packSmoothStone", new ItemStack(TFCBlocks.stoneIgInSmooth, 1, OreDictionary.WILDCARD_VALUE));
				add("packSmoothStone", new ItemStack(TFCBlocks.stoneIgExSmooth, 1, OreDictionary.WILDCARD_VALUE));
				add("packSmoothStone", new ItemStack(TFCBlocks.stoneMMSmooth, 1, OreDictionary.WILDCARD_VALUE));
				add("packSmoothStone", new ItemStack(TFCBlocks.stoneSedSmooth, 1, OreDictionary.WILDCARD_VALUE));
				// Stone
				add("packSmoothStone", new ItemStack(TFCBlocks.stoneIgIn, 1, OreDictionary.WILDCARD_VALUE));
				add("packSmoothStone", new ItemStack(TFCBlocks.stoneIgEx, 1, OreDictionary.WILDCARD_VALUE));
				add("packSmoothStone", new ItemStack(TFCBlocks.stoneMM, 1, OreDictionary.WILDCARD_VALUE));
				add("packSmoothStone", new ItemStack(TFCBlocks.stoneSed, 1, OreDictionary.WILDCARD_VALUE));
				// Cobblestone
				add("packCobblestone", Blocks.cobblestone);
				add("packSmoothStone", new ItemStack(TFCBlocks.stoneIgInCobble, 1, OreDictionary.WILDCARD_VALUE));
				add("packCobblestone", new ItemStack(TFCBlocks.stoneIgExCobble, 1, OreDictionary.WILDCARD_VALUE));
				add("packCobblestone", new ItemStack(TFCBlocks.stoneMMCobble, 1, OreDictionary.WILDCARD_VALUE));
				add("packCobblestone", new ItemStack(TFCBlocks.stoneSedCobble, 1, OreDictionary.WILDCARD_VALUE));
				// Brick
				add("packBrick", Blocks.brick_block);
				add("packBrick", Blocks.stonebrick);
				add("packBrick", new ItemStack(TFCBlocks.stoneIgInBrick, 1, OreDictionary.WILDCARD_VALUE));
				add("packBrick", new ItemStack(TFCBlocks.stoneIgExBrick, 1, OreDictionary.WILDCARD_VALUE));
				add("packBrick", new ItemStack(TFCBlocks.stoneMMBrick, 1, OreDictionary.WILDCARD_VALUE));
				add("packBrick", new ItemStack(TFCBlocks.stoneSedBrick, 1, OreDictionary.WILDCARD_VALUE));
				// Planks
				add("packPlanks", new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE));
				add("packPlanks", new ItemStack(TFCBlocks.planks, 1, OreDictionary.WILDCARD_VALUE));
				add("packPlanks", new ItemStack(TFCBlocks.planks2, 1, OreDictionary.WILDCARD_VALUE));
				// Dirt
				add("packDirt", Blocks.dirt);
				add("packDirt", new ItemStack(TFCBlocks.dirt, 1, OreDictionary.WILDCARD_VALUE));
				add("packDirt", new ItemStack(TFCBlocks.dirt2, 1, OreDictionary.WILDCARD_VALUE));
				// Grass
				add("packGrass", Blocks.grass);
				add("packGrass", new ItemStack(TFCBlocks.grass, 1, OreDictionary.WILDCARD_VALUE));
				add("packGrass", new ItemStack(TFCBlocks.grass2, 1, OreDictionary.WILDCARD_VALUE));
				add("packGrass", new ItemStack(TFCBlocks.clayGrass, 1, OreDictionary.WILDCARD_VALUE));
				add("packGrass", new ItemStack(TFCBlocks.dryGrass, 1, OreDictionary.WILDCARD_VALUE));
				add("packGrass", new ItemStack(TFCBlocks.clayGrass2, 1, OreDictionary.WILDCARD_VALUE));
				add("packGrass", new ItemStack(TFCBlocks.dryGrass2, 1, OreDictionary.WILDCARD_VALUE));
				// Saplings
				add("packSapling", new ItemStack(Blocks.sapling, 1, OreDictionary.WILDCARD_VALUE));
				add("packSapling", new ItemStack(TFCBlocks.sapling, 1, OreDictionary.WILDCARD_VALUE));
				add("packSapling", new ItemStack(TFCBlocks.sapling2, 1, OreDictionary.WILDCARD_VALUE));
				add("packSapling", new ItemStack(TFCItems.fruitTreeSapling, 1, OreDictionary.WILDCARD_VALUE));
				// Anvil
				add("packAnvil", new ItemStack(TFCBlocks.anvil, 1, OreDictionary.WILDCARD_VALUE));
				add("packAnvil", new ItemStack(TFCBlocks.anvil2, 1, OreDictionary.WILDCARD_VALUE));
				// Lumber
				add("packLumber", new ItemStack(TFCItems.singlePlank, 1, OreDictionary.WILDCARD_VALUE));
				// Chest
				add("packChest", Blocks.chest);
				add("packChest", Blocks.ender_chest);
				add("packChest", Blocks.trapped_chest);
				add("packChest", new ItemStack(TFCBlocks.chest, 1, OreDictionary.WILDCARD_VALUE));
				// TrapDoor
				add("packTrapDoor", Blocks.trapdoor);
				add("packTrapDoor", new ItemStack(TFCBlocks.metalTrapDoor, 1, OreDictionary.WILDCARD_VALUE));
				// Stick
				add("packStick", Items.stick);
				add("packStick", TFCItems.stick);
				add("packStick", Items.bone);
				// Cloth
				add("packCloth", TFCItems.burlapCloth);
				add("packCloth", TFCItems.silkCloth);
				add("packCloth", TFCItems.woolCloth);
				// String
				add("packString", Items.string);
				add("packString", TFCItems.woolYarn);
				// Rocks
				add("packRock", new ItemStack(TFCItems.looseRock, 1, OreDictionary.WILDCARD_VALUE));
				// Fruit
				add("packFruit", TFCHelper.getFood(TFCItems.redApple, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.banana, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.orange, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.greenApple, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.lemon, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.olive, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.cherry, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.peach, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.plum, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.wintergreenBerry, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.blackberry, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.blueberry, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.bunchberry, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.cloudberry, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.cranberry, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.elderberry, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.gooseberry, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.raspberry, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.snowberry, 160));
				add("packFruit", TFCHelper.getFood(TFCItems.strawberry, 160));
				// Meat
				add("packMeat", TFCHelper.getFood(TFCItems.egg, 2));
				add("packMeat", TFCHelper.getFood(TFCItems.eggCooked, 160));
				add("packMeat", TFCHelper.getFood(TFCItems.soybean, 160));
				add("packMeat", TFCHelper.getFood(TFCItems.muttonRaw, 160));
				add("packMeat", TFCHelper.getFood(TFCItems.beefRaw, 160));
				add("packMeat", TFCHelper.getFood(TFCItems.venisonRaw, 160));
				add("packMeat", TFCHelper.getFood(TFCItems.horseMeatRaw, 160));
				add("packMeat", TFCHelper.getFood(TFCItems.porkchopRaw, 160));
				add("packMeat", TFCHelper.getFood(TFCItems.fishRaw, 160));
				add("packMeat", TFCHelper.getFood(TFCItems.chickenRaw, 160));
				add("packMeat", TFCHelper.getFood(TFCItems.calamariRaw, 160));
				// Vegetable
				add("packVegetable", TFCHelper.getFood(TFCItems.tomato, 160));
				add("packVegetable", TFCHelper.getFood(TFCItems.potato, 160));
				add("packVegetable", TFCHelper.getFood(TFCItems.onion, 160));
				add("packVegetable", TFCHelper.getFood(TFCItems.cabbage, 160));
				add("packVegetable", TFCHelper.getFood(TFCItems.garlic, 160));
				add("packVegetable", TFCHelper.getFood(TFCItems.carrot, 160));
				add("packVegetable", TFCHelper.getFood(TFCItems.greenBellPepper, 160));
				add("packVegetable", TFCHelper.getFood(TFCItems.yellowBellPepper, 160));
				add("packVegetable", TFCHelper.getFood(TFCItems.redBellPepper, 160));
				add("packVegetable", TFCHelper.getFood(TFCItems.squash, 160));
				add("packVegetable", TFCHelper.getFood(TFCItems.seaWeed, 160));
				// Grain
				add("packGrain", TFCHelper.getFood(TFCItems.ryeGrain, 160));
				add("packGrain", TFCHelper.getFood(TFCItems.riceGrain, 160));
				add("packGrain", TFCHelper.getFood(TFCItems.maizeEar, 160));
				add("packGrain", TFCHelper.getFood(TFCItems.oatGrain, 160));
				add("packGrain", TFCHelper.getFood(TFCItems.barleyGrain, 160));
				add("packGrain", TFCHelper.getFood(TFCItems.wheatGrain, 160));
				// Gems
				ArrayList<Item> gems = new ArrayList<Item>();
				gems.add(TFCItems.gemAgate);
				gems.add(TFCItems.gemAmethyst);
				gems.add(TFCItems.gemBeryl);
				gems.add(TFCItems.gemDiamond);
				gems.add(TFCItems.gemEmerald);
				gems.add(TFCItems.gemGarnet);
				gems.add(TFCItems.gemJade);
				gems.add(TFCItems.gemJasper);
				gems.add(TFCItems.gemOpal);
				gems.add(TFCItems.gemRuby);
				gems.add(TFCItems.gemSapphire);
				gems.add(TFCItems.gemTopaz);
				gems.add(TFCItems.gemTourmaline);
				for (Item gem : gems) {
						add("packGemChipped", new ItemStack(gem, 1, 0));
						add("packGemFlawed", new ItemStack(gem, 1, 1));
						add("packGem", new ItemStack(gem, 1, 2));
						add("packGemFlawless", new ItemStack(gem, 1, 3));
						add("packGemQxquisite", new ItemStack(gem, 1, 4));
				}
				// Sand
				add("packSand", Blocks.sand);
				add("packSand", new ItemStack(TFCBlocks.sand, 1, OreDictionary.WILDCARD_VALUE));
				add("packSand", new ItemStack(TFCBlocks.sand2, 1, OreDictionary.WILDCARD_VALUE));
				// Gravel
				add("packGravel", Blocks.gravel);
				add("packGravel", new ItemStack(TFCBlocks.gravel, 1, OreDictionary.WILDCARD_VALUE));
				add("packGravel", new ItemStack(TFCBlocks.gravel2, 1, OreDictionary.WILDCARD_VALUE));
				// Ingot
				add("packIngot", Items.gold_ingot);
				add("packIngot", Items.gold_ingot);
				add("packIngot", TFCItems.bismuthBronzeIngot);
				add("packIngot", TFCItems.bismuthIngot);
				add("packIngot", TFCItems.blackBronzeIngot);
				add("packIngot", TFCItems.blackSteelIngot);
				add("packIngot", TFCItems.brassIngot);
				add("packIngot", TFCItems.blueSteelIngot);
				add("packIngot", TFCItems.bronzeIngot);
				add("packIngot", TFCItems.copperIngot);
				add("packIngot", TFCItems.goldIngot);
				add("packIngot", TFCItems.leadIngot);
				add("packIngot", TFCItems.nickelIngot);
				add("packIngot", TFCItems.platinumIngot);
				add("packIngot", TFCItems.redSteelIngot);
				add("packIngot", TFCItems.roseGoldIngot);
				add("packIngot", TFCItems.steelIngot);
				add("packIngot", TFCItems.sterlingSilverIngot);
				add("packIngot", TFCItems.tinIngot);
				add("packIngot", TFCItems.wroughtIronIngot);
				add("packIngot", TFCItems.zincIngot);
				add("packIngot", TFCItems.unknownIngot);
				add("packIngot", WurmTweaksItems.ingotGreenSteel);
				add("packIngot", WurmTweaksItems.ingotBrownSteel);
				add("packIngot", WurmTweaksItems.ingotCyanSteel);
				add("packIngot", WurmTweaksItems.ingotGraySteel);
				add("packIngot", WurmTweaksItems.ingotOrangeSteel);
				add("packIngot", WurmTweaksItems.ingotPinkSteel);
				add("packIngot", WurmTweaksItems.ingotPurpleSteel);
				add("packIngot", WurmTweaksItems.ingotYellowSteel);
				// Barrel
				add("packBarrel", new ItemStack(TFCBlocks.barrel, 1, OreDictionary.WILDCARD_VALUE));
				// Glass
				add("packGlass", Blocks.glass);
				// Crafting Table
				add("packCraftingTable", Blocks.crafting_table);
				add("packCraftingTable", TFCBlocks.workbench);
				// Door
				add("packDoor", Blocks.iron_door);
				add("packDoor", Blocks.wooden_door);
				for (Block door : TFCBlocks.doors)
						add("packDoor", door);
				// TODO Add Gem Block Ore Dict "packGemBlock"
				// Logs
				add("packLog", new ItemStack(TFCItems.logs, 1, OreDictionary.WILDCARD_VALUE));
				// Anvil
				add("packAnvil", new ItemStack(TFCBlocks.anvil,1,OreDictionary.WILDCARD_VALUE));
				add("packAnvil", new ItemStack(TFCBlocks.anvil2,1,OreDictionary.WILDCARD_VALUE));
				if (RecipeChecker.modExists("arsmagica2"))
						addAM2();
				if (RecipeChecker.modExists("Avaritia"))
						addAvaritia();
				if (RecipeChecker.modExists("EnderIO"))
						addEnderIO();
		}

		@Optional.Method (modid = "arsmagica2")
		private static void addAM2 () {
				add("packRune", new ItemStack(ItemsCommonProxy.rune, 1, OreDictionary.WILDCARD_VALUE));
		}

		@Optional.Method (modid = "Avaritia")
		private static void addAvaritia () {
				add("packCraftingTable", LudicrousBlocks.dire_crafting);
				add("packCraftingTable", LudicrousBlocks.double_craft);
				add("packCraftingTable", LudicrousBlocks.triple_craft);
		}

		@Optional.Method (modid = "EnderIO")
		private static void addEnderIO () {
				add("packGlass", EnderIO.blockFusedQuartz);
		}

		private static void add (String name, ItemStack stack) {
				OreDictionary.registerOre(name, stack);
		}

		private static void add (String name, Item stack) {
				OreDictionary.registerOre(name, stack);
		}

		private static void add (String name, Block stack) {
				OreDictionary.registerOre(name, stack);
		}
}

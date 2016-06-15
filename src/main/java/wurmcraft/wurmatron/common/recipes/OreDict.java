package wurmcraft.wurmatron.common.recipes;

import WayofTime.alchemicalWizardry.ModItems;
import am2.blocks.BlocksCommonProxy;
import am2.items.ItemsCommonProxy;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import crazypants.enderio.EnderIO;
import crazypants.enderio.item.darksteel.DarkSteelItems;
import erogenousbeef.bigreactors.common.BigReactors;
import fox.spiteful.avaritia.blocks.LudicrousBlocks;
import fox.spiteful.avaritia.items.LudicrousItems;
import gravisuite.GraviSuite;
import mekanism.common.MekanismItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import tconstruct.tools.TinkerTools;
import vazkii.botania.common.block.ModBlocks;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WTItems;
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
				// Bread
				add("packBread", TFCHelper.getFood(TFCItems.barleyBread, 160));
				add("packBread", TFCHelper.getFood(TFCItems.cornBread, 160));
				add("packBread", TFCHelper.getFood(TFCItems.oatBread, 160));
				add("packBread", TFCHelper.getFood(TFCItems.riceBread, 160));
				add("packBread", TFCHelper.getFood(TFCItems.ryeBread, 160));
				add("packBread", TFCHelper.getFood(TFCItems.wheatBread, 160));
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
						add("packGemExquisite", new ItemStack(gem, 1, 4));
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
				// Gem Blocks
				add("packGemBlock", WurmTweaksBlocks.blockJasper);
				add("packGemBlock", WurmTweaksBlocks.blockAmethyst);
				add("packGemBlock", WurmTweaksBlocks.blockDiamond);
				add("packGemBlock", WurmTweaksBlocks.blockRuby);
				add("packGemBlock", WurmTweaksBlocks.blockSapphire);
				add("packGemBlock", WurmTweaksBlocks.blockEmerald);
				add("packGemBlock", WurmTweaksBlocks.blockTopaz);
				add("packGemBlock", WurmTweaksBlocks.blockTourmaline);
				add("packGemBlock", WurmTweaksBlocks.blockJade);
				add("packGemBlock", WurmTweaksBlocks.blockAgate);
				add("packGemBlock", WurmTweaksBlocks.blockOpal);
				add("packGemBlock", WurmTweaksBlocks.blockGarnet);
				// Logs
				add("packLog", new ItemStack(TFCItems.logs, 1, OreDictionary.WILDCARD_VALUE));
				// Anvil
				add("packAnvil", new ItemStack(TFCBlocks.anvil, 1, OreDictionary.WILDCARD_VALUE));
				add("packAnvil", new ItemStack(TFCBlocks.anvil2, 1, OreDictionary.WILDCARD_VALUE));
				// Seeds
				add("packSeed", TFCItems.seedsWheat);
				add("packSeed", TFCItems.seedsBarley);
				add("packSeed", TFCItems.seedsRye);
				add("packSeed", TFCItems.seedsOat);
				add("packSeed", TFCItems.seedsRice);
				add("packSeed", TFCItems.seedsMaize);
				add("packSeed", TFCItems.seedsPotato);
				add("packSeed", TFCItems.seedsOnion);
				add("packSeed", TFCItems.seedsCabbage);
				add("packSeed", TFCItems.seedsGarlic);
				add("packSeed", TFCItems.seedsCarrot);
				add("packSeed", TFCItems.seedsSugarcane);
				add("packSeed", TFCItems.seedsTomato);
				add("packSeed", TFCItems.seedsYellowBellPepper);
				add("packSeed", TFCItems.seedsRedBellPepper);
				add("packSeed", TFCItems.seedsSoybean);
				add("packSeed", TFCItems.seedsGreenbean);
				add("packSeed", TFCItems.seedsSquash);
				add("packSeed", TFCItems.seedsJute);
				// Rubber Ore Dict ("packRubber")
				add("packCredit", new ItemStack(WTItems.creditBismuth, 1, OreDictionary.WILDCARD_VALUE));
				add("packCredit", new ItemStack(WTItems.creditZinc, 1, OreDictionary.WILDCARD_VALUE));
				add("packCredit", new ItemStack(WTItems.creditPlatinum, 1, OreDictionary.WILDCARD_VALUE));
				add("packCredit", new ItemStack(WTItems.creditNickel, 1, OreDictionary.WILDCARD_VALUE));
				add("packCredit", new ItemStack(WTItems.creditCopper, 1, OreDictionary.WILDCARD_VALUE));
				add("packCredit", new ItemStack(WTItems.creditGold, 1, OreDictionary.WILDCARD_VALUE));
				add("packCredit", new ItemStack(WTItems.creditIron, 1, OreDictionary.WILDCARD_VALUE));
				add("packCredit", new ItemStack(WTItems.creditLead, 1, OreDictionary.WILDCARD_VALUE));
				add("packCredit", new ItemStack(WTItems.creditSilver, 1, OreDictionary.WILDCARD_VALUE));
				add("packCredit", new ItemStack(WTItems.creditTin, 1, OreDictionary.WILDCARD_VALUE));
				// Ore
				addOre("oreCopper", new ItemStack(TFCBlocks.ore, 1, 0));
				addOre("oreGold", new ItemStack(TFCBlocks.ore, 1, 1));
				addOre("orePlatinum", new ItemStack(TFCBlocks.ore, 1, 2));
				addOre("oreIron", new ItemStack(TFCBlocks.ore, 1, 3));
				addOre("oreSilver", new ItemStack(TFCBlocks.ore, 1, 4));
				addOre("oreTin", new ItemStack(TFCBlocks.ore, 1, 5));
				addOre("oreTin", new ItemStack(TFCBlocks.ore, 1, 5));
				addOre("oreLead", new ItemStack(TFCBlocks.ore, 1, 6));
				addOre("oreBismuth", new ItemStack(TFCBlocks.ore, 1, 7));
				addOre("oreNickel", new ItemStack(TFCBlocks.ore, 1, 8));
				addOre("oreCopper", new ItemStack(TFCBlocks.ore, 1, 9));
				addOre("oreIron", new ItemStack(TFCBlocks.ore, 1, 10));
				addOre("oreIron", new ItemStack(TFCBlocks.ore, 1, 11));
				addOre("oreZinc", new ItemStack(TFCBlocks.ore, 1, 12));
				addOre("oreCopper", new ItemStack(TFCBlocks.ore, 1, 13));
				addOre("oreCoal", new ItemStack(TFCBlocks.ore, 1, 14));
				addOre("oreCoal", new ItemStack(TFCBlocks.ore, 1, 15));
				addOre("oreKaolinite", new ItemStack(TFCBlocks.ore2, 1, 0));
				addOre("oreGypsum", new ItemStack(TFCBlocks.ore2, 1, 1));
				addOre("oreSatinspar", new ItemStack(TFCBlocks.ore2, 1, 2));
				addOre("oreSelenite", new ItemStack(TFCBlocks.ore2, 1, 3));
				addOre("oreGraphite", new ItemStack(TFCBlocks.ore2, 1, 4));
				addOre("oreKimberlite", new ItemStack(TFCBlocks.ore2, 1, 5));
				addOre("orePetrifiedWood", new ItemStack(TFCBlocks.ore2, 1, 6));
				addOre("oreSulfur", new ItemStack(TFCBlocks.ore2, 1, 7));
				addOre("oreJet", new ItemStack(TFCBlocks.ore2, 1, 8));
				addOre("oreMicrocline", new ItemStack(TFCBlocks.ore2, 1, 9));
				addOre("orePitchblende", new ItemStack(TFCBlocks.ore2, 1, 10));
				addOre("oreRedstone", new ItemStack(TFCBlocks.ore2, 1, 11));
				addOre("oreRedstone", new ItemStack(TFCBlocks.ore2, 1, 12));
				addOre("oreSaltpeter", new ItemStack(TFCBlocks.ore2, 1, 13));
				addOre("oreSerpentine", new ItemStack(TFCBlocks.ore2, 1, 14));
				addOre("oreSylvite", new ItemStack(TFCBlocks.ore2, 1, 15));
				addOre("oreBorax", new ItemStack(TFCBlocks.ore3, 1, 0));
				addOre("oreOlivine", new ItemStack(TFCBlocks.ore3, 1, 1));
				addOre("oreLapis", new ItemStack(TFCBlocks.ore3, 1, 2));
				addOre("oreCopper", new ItemStack(TFCBlocks.ore3, 1, 3));
				addOre("oreGold", new ItemStack(TFCBlocks.ore3, 1, 4));
				addOre("orePlatinum", new ItemStack(TFCBlocks.ore3, 1, 5));
				addOre("oreIron", new ItemStack(TFCBlocks.ore3, 1, 6));
				addOre("oreSilver", new ItemStack(TFCBlocks.ore3, 1, 7));
				addOre("oreTin", new ItemStack(TFCBlocks.ore3, 1, 8));
				addOre("oreTin", new ItemStack(TFCBlocks.ore3, 1, 9));
				addOre("oreLead", new ItemStack(TFCBlocks.ore3, 1, 10));
				addOre("oreBismuth", new ItemStack(TFCBlocks.ore3, 1, 11));
				addOre("oreNickel", new ItemStack(TFCBlocks.ore3, 1, 12));
				addOre("oreCopper", new ItemStack(TFCBlocks.ore3, 1, 13));
				addOre("oreIron", new ItemStack(TFCBlocks.ore3, 1, 14));
				addOre("oreIron", new ItemStack(TFCBlocks.ore3, 1, 15));
				addOre("oreZinc", new ItemStack(TFCBlocks.ore3, 1, 16));
				addOre("oreCopper", new ItemStack(TFCBlocks.ore3, 1, 17));
				if (RecipeChecker.modExists("arsmagica2"))
						addAM2();
				if (RecipeChecker.modExists("Avaritia"))
						addAvaritia();
				if (RecipeChecker.modExists("EnderIO"))
						addEnderIO();
				if (RecipeChecker.modExists("Botania"))
						addBotania();
				if (RecipeChecker.modExists("BigReactors"))
						addBigReactors();
				if (RecipeChecker.modExists("AWWayofTime"))
						addBloodMagic();
				if (RecipeChecker.modExists("DraconicEvolution"))
						addDraconicEvolution();
				if (RecipeChecker.modExists("GraviSuite"))
						addGraviSuit();
				if (RecipeChecker.modExists("ThaumicTinkerer"))
						addThaumicTinkerer();
				if (RecipeChecker.modExists("Mekanism"))
						addMekanism();
				if (RecipeChecker.modExists("TConstruct"))
						addTConstruct();
		}

		@Optional.Method (modid = "arsmagica2")
		private static void addAM2 () {
				for (int r = 0; r < 16; r++)
						add("packRune", new ItemStack(ItemsCommonProxy.rune, 1, r));
				add("packSapling", new ItemStack(BlocksCommonProxy.witchwoodSapling));
		}

		@Optional.Method (modid = "Avaritia")
		private static void addAvaritia () {
				add("packCraftingTable", LudicrousBlocks.dire_crafting);
				add("packCraftingTable", LudicrousBlocks.double_craft);
				add("packCraftingTable", LudicrousBlocks.triple_craft);
				add("itemAxe", LudicrousItems.infinity_axe);
				add("itemShovel", LudicrousItems.infinity_shovel);
				add("itemPick", LudicrousItems.infinity_pickaxe);
		}

		@Optional.Method (modid = "Botania")
		private static void addBotania () {
				add("packLog", ModBlocks.livingwood);
				add("packLog", ModBlocks.dreamwood);
				add("packPlanks", new ItemStack(ModBlocks.livingwood, 1, 1));
				add("packPlanks", new ItemStack(ModBlocks.dreamwood, 1, 1));
				add("packSmoothStone", ModBlocks.livingrock);
				add("packSmoothStone", ModBlocks.shimmerrock);
				add("packGlass", ModBlocks.manaGlass);
				add("packGlass", ModBlocks.elfGlass);
				add("itemAxe", vazkii.botania.common.item.ModItems.manasteelAxe);
				add("itemAxe", vazkii.botania.common.item.ModItems.terraAxe);
				add("itemAxe", vazkii.botania.common.item.ModItems.elementiumAxe);
				add("itemPick", vazkii.botania.common.item.ModItems.manasteelPick);
				add("itemPick", vazkii.botania.common.item.ModItems.terraPick);
				add("itemPick", vazkii.botania.common.item.ModItems.elementiumPick);
				add("itemShovel", vazkii.botania.common.item.ModItems.manasteelShovel);
				add("itemShovel", vazkii.botania.common.item.ModItems.elementiumShovel);
				add("packIngot", new ItemStack(vazkii.botania.common.item.ModItems.manaResource, 1, 0));
				add("packIngot", new ItemStack(vazkii.botania.common.item.ModItems.manaResource, 1, 4));
				add("packIngot", new ItemStack(vazkii.botania.common.item.ModItems.manaResource, 1, 7));
		}

		@Optional.Method (modid = "BigReactors")
		private static void addBigReactors () {
				for (int i = 0; i < 4; i++)
						add("packIngot", new ItemStack(BigReactors.ingotGeneric, 1, i));
		}

		@Optional.Method (modid = "AWWayofTime")
		private static void addBloodMagic () {
				add("itemAxe", ModItems.boundAxe);
				add("itemPick", ModItems.boundPickaxe);
				add("itemShovel", ModItems.boundShovel);
		}

		@Optional.Method (modid = "EnderIO")
		private static void addEnderIO () {
				add("packGlass", EnderIO.blockFusedQuartz);
				add("itemPick", DarkSteelItems.itemDarkSteelPickaxe);
				add("itemAxe", DarkSteelItems.itemDarkSteelAxe);
		}

		@Optional.Method (modid = "DraconicEvolution")
		private static void addDraconicEvolution () {
				add("itemAxe", com.brandon3055.draconicevolution.common.ModItems.draconicAxe);
				add("itemPick", com.brandon3055.draconicevolution.common.ModItems.draconicPickaxe);
				add("itemPick", com.brandon3055.draconicevolution.common.ModItems.wyvernPickaxe);
				add("itemShovel", com.brandon3055.draconicevolution.common.ModItems.draconicShovel);
				add("itemShovel", com.brandon3055.draconicevolution.common.ModItems.wyvernShovel);
				add("itemSword", com.brandon3055.draconicevolution.common.ModItems.draconicSword);
				add("itemSword", com.brandon3055.draconicevolution.common.ModItems.wyvernSword);
				add("itemSword", com.brandon3055.draconicevolution.common.ModItems.draconicDestructionStaff);
				add("itemPick", com.brandon3055.draconicevolution.common.ModItems.draconicDestructionStaff);
				add("itemAxe", com.brandon3055.draconicevolution.common.ModItems.draconicDestructionStaff);
		}

		@Optional.Method (modid = "GraviSuite")
		private static void addGraviSuit () {
				add("itemAxe", GraviSuite.vajra);
				add("itemPick", GraviSuite.vajra);
				add("itemSword", GraviSuite.vajra);
		}

		@Optional.Method (modid = "ThaumicTinkerer")
		private static void addThaumicTinkerer () {
				add("itemAxe", GameRegistry.findItem("ThaumicTinkerer", "ichorAxeGem"));
				add("itemAxe", GameRegistry.findItem("ThaumicTinkerer", "ichorAxe"));
		}

		@Optional.Method (modid = "TConstruct")
		private static void addTConstruct () {
				add("itemAxe", TinkerTools.battleaxe);
				add("itemAxe", TinkerTools.lumberaxe);
				add("itemShovel", TinkerTools.shovel);
				add("itemAxe", TinkerTools.hatchet);
		}

		@Optional.Method (modid = "Mekanism")
		private static void addMekanism () {
				add("itemAxe", MekanismItems.AtomicDisassembler);
		}

		private static void add (String name, ItemStack stack) {
				OreDictionary.registerOre(name, stack);
		}

		private static void addOre (String name, ItemStack stack) {
				add(name, stack);
				add("ore", stack);
		}

		private static void add (String name, Item stack) {
				OreDictionary.registerOre(name, stack);
		}

		private static void add (String name, Block stack) {
				OreDictionary.registerOre(name, stack);
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import am2.blocks.BlocksCommonProxy;
import am2.blocks.RecipesEssenceRefiner;
import am2.items.ItemsCommonProxy;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import crazypants.enderio.EnderIO;
import fox.spiteful.avaritia.items.LudicrousItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.common.config.ConfigItems;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

public class AM2Recipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "arsmagica2")
		public static void addRecipes () {
				LogHandler.info("Adding AM2 Recipes");
				r.addBasicMachineRecipe(BlocksCommonProxy.essenceRefiner, "packPlanks", WurmTweaksItems.ingotRainbowSteel, Items.nether_star, new ItemStack(BlocksCommonProxy.AMOres, 1, 6));
				r.addShaped(BlocksCommonProxy.essenceConduit, " T ", "XSX", "SSS", 'T', new ItemStack(EnderIO.itemMaterial, 1, 8), 'X', "packSmoothStone", 'S', WurmTweaksItems.ingotOrangeSteel);
				r.addCrossWCenter(BlocksCommonProxy.obelisk, "dustVintium", WurmTweaksBlocks.blockWroughtIron, WurmTweaksItems.itemMagicChunk);
				r.add3X(BlocksCommonProxy.astralBarrier, WurmTweaksItems.itemMagicChunk);
				r.addShaped(BlocksCommonProxy.seerStone, " E ", "SSS", "BBB", 'E', WurmTweaksItems.itemMagicChunk, 'S', "packSmoothStone", 'B', Blocks.lapis_block);
				//TODO AM2 Block Compressor Recipes
				//TODO AM2 Flower Recipes
				r.addCrossWCenter(BlocksCommonProxy.keystoneChest, "packPlanks", "packRune", "packDoor");
				r.addShaped(BlocksCommonProxy.blockLectern, "BBB", "XXX", "PPP", 'P', "packPlanks", 'B', WurmTweaksItems.ingotBrownSteel, 'X', WurmTweaksItems.itemMagicChunk);
				r.addCrossWCenter(BlocksCommonProxy.manaBattery, WurmTweaksItems.itemMagicChunk, WurmTweaksItems.ingotRainbowSteel, "dustVintium");
				r.addShapeless(new ItemStack(BlocksCommonProxy.magicWall,4), "dustVintium", WurmTweaksItems.itemMagicChunk, WurmTweaksItems.ingotCyanSteel);
				r.addShaped(BlocksCommonProxy.occulus, "XAX", " N ", "BAB", 'N', Items.nether_star, 'X', WurmTweaksItems.itemMagicChunk, 'A', "packRune", 'B', WurmTweaksBlocks.blockPlatinum);
				r.addShapeless(BlocksCommonProxy.craftingAltar, "packGemBlock", "dustVintium", new ItemStack(BlocksCommonProxy.magicWall,1,0));
				r.addShaped(new ItemStack(BlocksCommonProxy.vinteumTorch, 8), "V", "S", 'S', "packStick", 'V', "dustVintium");
				r.addBasicMachineRecipe(BlocksCommonProxy.particleEmitter, WurmTweaksBlocks.blockGold, "dye", "packGemBlock", WurmTweaksItems.ingotCyanSteel);
				r.addShaped(BlocksCommonProxy.inscriptionTable, "ABC", "SSS", "L L", 'L', "packLog", 'S', "packPlanks", 'A', WurmTweaksBlocks.blockSterlingSilver, 'B', WurmTweaksItems.itemMagicChunk, 'C', Items.feather);
				r.addShapeless(new ItemStack(BlocksCommonProxy.witchwoodPlanks, 2), BlocksCommonProxy.witchwoodLog);
				//TODO SawMill Witchwood Log
				r.addCircleWCenter(new ItemStack(BlocksCommonProxy.redstoneInlay, 8), Blocks.redstone_block, WurmTweaksItems.itemMagicChunk);
				r.addCircleWCenter(new ItemStack(BlocksCommonProxy.ironInlay, 8), WurmTweaksBlocks.blockWroughtIron, WurmTweaksItems.itemMagicChunk);
				r.addCircleWCenter(new ItemStack(BlocksCommonProxy.goldInlay, 8), WurmTweaksBlocks.blockGold, WurmTweaksItems.itemMagicChunk);
				r.addStairs(new ItemStack(BlocksCommonProxy.witchwoodStairs, 4), BlocksCommonProxy.witchwoodPlanks);
				r.addSlabs(new ItemStack(BlocksCommonProxy.witchwoodSingleSlab, 12), BlocksCommonProxy.witchwoodPlanks);
				r.addShaped(BlocksCommonProxy.magiciansWorkbench, "BAB", "PCP", "PPP", 'B', WurmTweaksBlocks.blockGold, 'A', WurmTweaksItems.itemMagicChunk, 'P', "packPlanks", 'C', "packCraftingTable");
				r.addShapeless(BlocksCommonProxy.everstone, WurmTweaksItems.itemMagicChunk, WurmTweaksItems.ingotRainbowSteel, new ItemStack(LudicrousItems.beesource, 1, 4));
				r.addCrossWCenter(BlocksCommonProxy.keystoneTrapDoor, WurmTweaksItems.itemMagicChunk, "packPlanks", "packTrapDoor");
				r.addCrossWCenter(BlocksCommonProxy.elementalAttuner, WurmTweaksItems.itemMagicChunk, "dustVintium", WurmTweaksItems.itemCraftingCore);
				r.addBasicMachineRecipe(BlocksCommonProxy.flickerLure, WurmTweaksItems.itemMagicChunk, WurmTweaksBlocks.blockSilver, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.ingotOrangeSteel);
				r.addShapeless(BlocksCommonProxy.illusionBlock, "packSmoothStone", WurmTweaksItems.ingotRainbowSteel);
				r.addShapeless(new ItemStack(BlocksCommonProxy.crystalMarker, 1, 0), WurmTweaksItems.itemMagicChunk, Blocks.piston);
				r.addShapeless(new ItemStack(BlocksCommonProxy.crystalMarker, 1, 1), WurmTweaksItems.itemMagicChunk, Blocks.hopper);
				r.addShapeless(new ItemStack(BlocksCommonProxy.crystalMarker, 1, 2), WurmTweaksItems.ingotPurpleSteel, new ItemStack(BlocksCommonProxy.crystalMarker, 1, 1));
				r.addShapeless(new ItemStack(BlocksCommonProxy.crystalMarker, 1, 3), WurmTweaksItems.ingotBrownSteel, new ItemStack(BlocksCommonProxy.crystalMarker, 1, 1));
				r.addShapeless(new ItemStack(BlocksCommonProxy.crystalMarker, 1, 4), Items.paper, new ItemStack(BlocksCommonProxy.crystalMarker, 1, 1));
				r.addShapeless(new ItemStack(BlocksCommonProxy.crystalMarker, 1, 5), new ItemStack(BlocksCommonProxy.crystalMarker, 1, 0), new ItemStack(BlocksCommonProxy.crystalMarker, 1, 1));
				r.addShapeless(new ItemStack(BlocksCommonProxy.crystalMarker, 1, 6), Items.paper, new ItemStack(BlocksCommonProxy.crystalMarker, 1, 1));
				r.addShapeless(new ItemStack(BlocksCommonProxy.crystalMarker, 1, 7), WurmTweaksItems.ingotRainbowSteel, new ItemStack(BlocksCommonProxy.crystalMarker, 1, 1));
				r.addShapeless(new ItemStack(BlocksCommonProxy.crystalMarker, 1, 8), WurmTweaksItems.itemMagicChunk, new ItemStack(BlocksCommonProxy.crystalMarker, 1, 1));
				r.addShaped(ItemsCommonProxy.crystalPhylactery, " M ", "GVG", " M ", 'M', new ItemStack(ItemsCommonProxy.itemOre, 1, 7), 'G', "packGlass", 'V', "dustVintium");
				r.addShapeless(ItemsCommonProxy.legendaryManaPotion, "dustVintium", WurmTweaksItems.itemMagicChunk, ItemsCommonProxy.greaterManaPotion);
				r.addShapeless(ItemsCommonProxy.epicManaPotion, "dustVintium", WurmTweaksItems.itemMagicChunk, ItemsCommonProxy.greaterManaPotion);
				r.addShapeless(ItemsCommonProxy.greaterManaPotion, "dustVintium", WurmTweaksItems.itemMagicChunk, ItemsCommonProxy.standardManaPotion);
				r.addShapeless(ItemsCommonProxy.standardManaPotion, "dustVintium", WurmTweaksItems.itemMagicChunk, ItemsCommonProxy.lesserManaPotion);
				r.addShapeless(ItemsCommonProxy.lesserManaPotion, WurmTweaksItems.itemMagicChunk, "dustVintium", TFCHelper.getFood(TFCItems.sugar, 160));
				r.addShaped(ItemsCommonProxy.spellStaffMagitech, " IC", "I I", "II ", 'I', WurmTweaksItems.ingotOrangeSteel, 'C', WurmTweaksItems.itemMagicChunk);
				for (ItemStack meat : OreDictionary.getOres("packMeat"))
						r.addShapeless(ItemsCommonProxy.mobFocus, ItemsCommonProxy.standardFocus, meat);
				r.addShapeless(ItemsCommonProxy.itemFocus, ItemsCommonProxy.standardFocus, "packCraftingTable");
				r.addShaped(ItemsCommonProxy.mageHood, "WWW", "WXW", 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'W', WurmTweaksItems.itemMagicChunk);
				r.addShaped(ItemsCommonProxy.mageArmor, "WXW", "WWW", "WWW", 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'W', WurmTweaksItems.itemMagicChunk);
				r.addShaped(ItemsCommonProxy.mageLeggings, "WWW", "WXW", "W W", 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'W', WurmTweaksItems.itemMagicChunk);
				r.addShaped(ItemsCommonProxy.mageBoots, "W W", "WXW", 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'W', WurmTweaksItems.itemMagicChunk);
				r.addShaped(ItemsCommonProxy.battlemageHood, "III", "ICI", 'C', ItemsCommonProxy.mageHood, 'I', WurmTweaksItems.itemMagicChunk);
				r.addShaped(ItemsCommonProxy.battlemageArmor, "III", "ICI", 'C', ItemsCommonProxy.mageArmor, 'I', WurmTweaksItems.itemMagicChunk);
				r.addShaped(ItemsCommonProxy.battlemageLeggings, "III", "ICI", 'C', ItemsCommonProxy.mageLeggings, 'I', WurmTweaksItems.itemMagicChunk);
				r.addShaped(ItemsCommonProxy.battlemageBoots, "III", "ICI", 'C', ItemsCommonProxy.mageBoots, 'I', WurmTweaksItems.itemMagicChunk);
				for (ItemStack fruit : OreDictionary.getOres("packFruit"))
						r.addShapeless(ItemsCommonProxy.mobFocus, ItemsCommonProxy.standardFocus, fruit);
				r.addShaped(ItemsCommonProxy.crystalWrench, "S S", "X X", " B ", 'S', WurmTweaksItems.itemMixedSheet, 'X', WurmTweaksItems.itemMagicChunk, 'B', "packStick");
				r.addShaped(ItemsCommonProxy.essenceBag, "LWL", "LCL", "LLL", 'L', TFCItems.leather, 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'C', "packChest");
				r.addShapeless(ItemsCommonProxy.liquidEssenceBottle, WurmTweaksItems.itemMagicChunk, TFCItems.glassBottle);
				r.addShaped(ItemsCommonProxy.keystone, "RCR", 'R', "packRune", 'C', WurmTweaksItems.itemMagicChunk);
				// TODO Affinity Tome
				r.addShapeless(ItemsCommonProxy.wardingCandle, new ItemStack(ItemsCommonProxy.itemOre, 1, 8), TFCItems.woolYarn, BlocksCommonProxy.witchwoodSingleSlab);
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 0), "dyeBrown", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 1), "dyeCyan", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 2), "dyeGray", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 3), "dyeLightBlue", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 4), "dyeWhite", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 5), "dyeBlack", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 6), "dyeOrange", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 7), "dyePurple", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 8), "dyeBlue", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 9), "dyeGreen", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 10), "dyeYellow", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 11), "dyeRed", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 12), "dyeLime", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 13), "dyePink", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 14), "dyeMagenta", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.spellBook, 1, 15), "dyeLightGray", new ItemStack(ItemsCommonProxy.spellBook, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLUE), "dyeBlue", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_RED), "dyeRed", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_YELLOW), "dyeYellow", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_ORANGE), "dyeOrange", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_GREEN), "dyeGreen", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_PURPLE), "dyePurple", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_WHITE), "dyeWhite", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLACK), "dyeBlack", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BROWN), "dyeBrown", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_CYAN), "dyeCyan", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_GRAY), "dyeGray", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_LIGHTBLUE), "dyeLightBlue", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_LIGHTGRAY), "dyeLightGray", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_MAGENTA), "dyeMagenta", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_PINK), "dyePink", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_LIME), "dyeLime", new ItemStack(ItemsCommonProxy.rune, 1, ItemsCommonProxy.rune.META_BLANK));
				r.addShapeless(ItemsCommonProxy.magitechGoggles, new ItemStack(ConfigItems.itemGoggles, 1, OreDictionary.WILDCARD_VALUE), ItemsCommonProxy.rune, WurmTweaksItems.itemMagicChunk);
				r.addShaped(ItemsCommonProxy.spellBook, "SSS", "XLX", "SSS", 'S', "packCloth", 'X', WurmTweaksItems.itemMagicChunk, 'L', TFCItems.leather);
				r.addShapeless(ItemsCommonProxy.wizardChalk, WurmTweaksItems.itemMagicChunk, Items.paper, "dye");
				for (ItemStack grain : OreDictionary.getOres("packGrain"))
						for (ItemStack fruit : OreDictionary.getOres("packFruid"))
								r.addShapeless(ItemsCommonProxy.manaCake, grain, fruit, WurmTweaksItems.itemMagicChunk);
				r.addShapeless(ItemsCommonProxy.manaFocus, ItemsCommonProxy.standardFocus, WurmTweaksItems.itemMagicChunk);
				r.addCircleWCenter(ItemsCommonProxy.lesserFocus, Blocks.glass, TFCItems.platinumSheet);
				r.addShapeless(ItemsCommonProxy.playerjournal, WurmTweaksItems.itemMagicChunk, WurmTweaksItems.ingotRainbowSteel, Items.book);
				r.addShaped(ItemsCommonProxy.runeBag, "LWL", "LCL", "LLL", 'L', TFCItems.leather, 'W', new ItemStack(ItemsCommonProxy.rune, 1, OreDictionary.WILDCARD_VALUE), 'C', "packChest");
				r.addShapeless(ItemsCommonProxy.spellParchment, Items.paper, "dye", "packStick");
				r.addShapeless(new ItemStack(ItemsCommonProxy.manaPotionBundle, 1, 3), ItemsCommonProxy.lesserManaPotion, ItemsCommonProxy.lesserManaPotion, ItemsCommonProxy.lesserManaPotion, Items.string);
				r.addShapeless(new ItemStack(ItemsCommonProxy.manaPotionBundle, 1, 259), ItemsCommonProxy.standardManaPotion, ItemsCommonProxy.standardManaPotion, ItemsCommonProxy.standardManaPotion, Items.string);
				r.addShapeless(new ItemStack(ItemsCommonProxy.manaPotionBundle, 1, 512), ItemsCommonProxy.greaterManaPotion, ItemsCommonProxy.greaterManaPotion, ItemsCommonProxy.greaterManaPotion, Items.string);
				r.addShapeless(new ItemStack(ItemsCommonProxy.manaPotionBundle, 1, 771), ItemsCommonProxy.epicManaPotion, ItemsCommonProxy.epicManaPotion, ItemsCommonProxy.epicManaPotion, Items.string);
				r.addShapeless(new ItemStack(ItemsCommonProxy.manaPotionBundle, 1, 1027), ItemsCommonProxy.legendaryManaPotion, ItemsCommonProxy.legendaryManaPotion, ItemsCommonProxy.legendaryManaPotion, Items.string);
				addRefinerRecipes();
				if (RecipeChecker.modExists("Avaritia"))
						r.addShaped9X9Recipe(BlocksCommonProxy.armorInfuser, "MMMBBBMMM", "MMMBBBMMM", "MMMBBBMMM", "OOOOOOOOO", "OOOOOOOOO", "OOOOOOOOO", "OOOOOOOOO", "OOOOOOOOO", "OOOOOOOOO", 'O', Blocks.obsidian, 'M', new ItemStack(ItemsCommonProxy.itemOre, 1, 7), 'B', "packGemBlock");
		}

		@Optional.Method (modid = "arsmagica2")
		private static void addRefinerRecipes () {
				RecipesEssenceRefiner.essenceRefinement().AddRecipe(new ItemStack[] {new ItemStack(Items.blaze_powder), new ItemStack(TFCItems.coal, 1, 0), new ItemStack(TFCItems.coal), new ItemStack(Items.blaze_powder), new ItemStack(ItemsCommonProxy.itemOre, 1, 2), new ItemStack(ItemsCommonProxy.essence, 1, 3)}, new ItemStack(ItemsCommonProxy.essence, 1, 3));
		}
}

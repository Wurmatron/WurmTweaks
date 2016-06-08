package wurmcraft.wurmatron.common.recipes.mods;

import am2.items.ItemsCommonProxy;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.brandon3055.draconicevolution.common.ModItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.lib.crafting.ArcaneSceptreRecipe;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.nbt.ItemNBT;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;
import wurmcraft.wurmatron.common.utils.thaumcraft.ThaumcraftHelper;

/**
 * TODO Finish the rest like reloaded the book and removing the existing Thaumcraft recipes for each research
 */
public class ThaumcraftRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "Thaumcraft")
		public static void addRecipes () {
				r.add2X(new ItemStack(ConfigBlocks.blockCosmeticOpaque, 1, 0), new ItemStack(ConfigItems.itemResource, 1, 6));
				r.add2X(new ItemStack(ConfigBlocks.blockCosmeticOpaque, 1, 1), new ItemStack(ConfigBlocks.blockCosmeticOpaque, 1, 0));
				r.addShaped(new ItemStack(ConfigBlocks.blockCosmeticOpaque, 2, 2), "GGG", "XAX", "GGG", 'G', "packGlass", 'X', WurmTweaksItems.itemMagicChunk, 'A', ConfigItems.itemZombieBrain);
				r.addShaped(new ItemStack(ConfigBlocks.blockTable, 2, 0), "XXX", "SSS", "P P", 'P', new ItemStack(ConfigBlocks.blockWoodenDevice, 1, 6), 'S', "packLog", 'X', WurmTweaksItems.itemMagicChunk);
				r.addShaped(new ItemStack(ConfigBlocks.blockCandle, 1, 0), "X", "D", "D", 'X', Items.string, 'D', new ItemStack(ConfigItems.itemResource, 1, 4));
				for (int i = 1; i < 15; i++)
						r.addShapeless(new ItemStack(ConfigBlocks.blockCandle, 1, i), new ItemStack(ConfigBlocks.blockCandle, 1, OreDictionary.WILDCARD_VALUE), RecipeHelper.dye.get(i));
				// TODO Aura Node Crafting
				r.addShaped(new ItemStack(ConfigItems.itemWandCap, 1, 0), "III", "I I", 'I', TFCItems.wroughtIronSheet);
				r.addShaped(new ItemStack(ConfigItems.itemWandCasting, 1, 0), "C  ", " S ", "  C", 'C', new ItemStack(ConfigItems.itemWandCap, 1, 0), 'S', "packStick");
				r.addShaped(new ItemStack(ConfigItems.itemThaumometer, 1, 0), " S ", "XGX", " S ", 'S', TFCItems.redSteelSheet2x, 'X', TFCItems.blueSteelSheet2x, 'G', WurmTweaksItems.stableMagicEssence);
				r.addShaped(new ItemStack(ConfigItems.itemThaumometer, 1, 0), " S ", "XGX", " S ", 'X', TFCItems.redSteelSheet2x, 'S', TFCItems.blueSteelSheet2x, 'G', WurmTweaksItems.stableMagicEssence);
				r.addShaped(new ItemStack(ConfigItems.itemEssence, 4, 0), " C ", "G G", " G ", 'C', TFCItems.clayBall, 'G', "packGlass");
				// TODO Knowledge Fragment
				r.add3X(new ItemStack(ConfigItems.itemResearchNotes, 1, 0), new ItemStack(ConfigItems.itemResource, 1, 9));
				r.addSlabs(new ItemStack(ConfigBlocks.blockSlabStone, 3, 0), new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 7));
				r.addSlabs(new ItemStack(ConfigBlocks.blockSlabWood, 3, 0), new ItemStack(ConfigBlocks.blockWoodenDevice, 1, 6));
				r.addStairs(new ItemStack(ConfigBlocks.blockStairsSilverwood, 4), new ItemStack(ConfigBlocks.blockWoodenDevice, 1, 7));
				r.addStairs(new ItemStack(ConfigBlocks.blockStairsGreatwood, 4), new ItemStack(ConfigBlocks.blockWoodenDevice, 1, 6));
				r.addArmorRecipes(ConfigItems.itemHelmetThaumium, ConfigItems.itemChestThaumium, ConfigItems.itemLegsThaumium, ConfigItems.itemBootsThaumium, new ItemStack(ConfigItems.itemResource, 1, 2));
				r.addShapeless(new ItemStack(ConfigItems.itemInkwell, 1, 0), "dyeBlack", new ItemStack(ConfigItems.itemEssence, 1, 0), WurmTweaksItems.itemMagicChunk);
				r.addShapeless(new ItemStack(ConfigItems.itemInkwell, 1, 0), "dyeBlack", new ItemStack(ConfigItems.itemInkwell, 1, OreDictionary.WILDCARD_VALUE));
				addInfoRecipes();
				addThamRecipes();
				addAlchemyRecipes();
				addArtificeRecipes();
				addEldridthRecipes();
		}

		// 1st Page
		private static void addInfoRecipes () {
				ThaumcraftHelper.addShaped("DECONSTRUCTOR", new ItemStack(ConfigBlocks.blockTable, 1, 14), new AspectList().add(Aspect.ENTROPY, 20), " S ", "XBY", 'S', new ItemStack(ConfigItems.itemThaumometer, 1, 0), 'X', TFCItems.redSteelPick, 'B', new ItemStack(ConfigBlocks.blockTable, 1, 0), 'Y', TFCItems.blueSteelAxe);
				ThaumcraftHelper.addShaped("DECONSTRUCTOR", new ItemStack(ConfigBlocks.blockTable, 1, 14), new AspectList().add(Aspect.ENTROPY, 20), " S ", "XBY", 'S', new ItemStack(ConfigItems.itemThaumometer, 1, 0), 'X', TFCItems.blueSteelPick, 'B', new ItemStack(ConfigBlocks.blockTable, 1, 0), 'Y', TFCItems.redSteelAxe);
		}

		// 2nd Page
		private static void addThamRecipes () {
				ThaumcraftHelper.addInfusion("VISAMULET", new ItemStack(ConfigItems.itemAmuletVis, 1, 1), 6, new AspectList().add(Aspect.AURA, 24).add(Aspect.ENERGY, 64).add(Aspect.VOID, 32).add(Aspect.MAGIC, 32), new ItemStack(ConfigItems.itemBaubleBlanks, 1, 0), new ItemStack[] {new ItemStack(ConfigItems.itemResource, 1, 15), new ItemStack(ConfigBlocks.blockCrystal, 1, 6), new ItemStack(ConfigBlocks.blockCrystal, 1, 6), new ItemStack(ConfigBlocks.blockCrystal, 1, 6), new ItemStack(ConfigBlocks.blockCrystal, 1, 6), new ItemStack(ConfigItems.itemResource, 1, 15)});
				ThaumcraftHelper.addShaped("FOCALMANIPULATION", new ItemStack(ConfigBlocks.blockStoneDevice, 1, 13), new AspectList().add(Aspect.AIR, 10), "XXX", "ZAZ", "BBB", 'B', WurmTweaksBlocks.blockPlatinum, 'Z', WurmTweaksItems.stableMagicEssence, 'A', new ItemStack(ConfigItems.itemBaubleBlanks, 1, 0));
				ThaumcraftHelper.addInfusion("FOCUSHELLBAT", new ItemStack(ConfigItems.itemFocusFire, 1, 0), 20, new AspectList().add(Aspect.BEAST, 64).add(Aspect.DARKNESS, 64).add(Aspect.FIRE, 128), new ItemStack(Items.magma_cream), new ItemStack[] {new ItemStack(ExtraUtils.cobblestoneCompr, 1, 7), WurmTweaksItems.stableMagicEssence, WurmTweaksItems.gearMixedSheet, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemCraftingCore});
				ThaumcraftHelper.addInfusion("WANDPEDFOC", new ItemStack(ConfigBlocks.blockStoneDevice, 1, 8), 16, new AspectList().add(Aspect.MAGIC, 32).add(Aspect.DARKNESS, 24), new ItemStack(Items.comparator), new ItemStack[] {WurmTweaksItems.stableMagicEssence, WurmTweaksItems.stableMagicEssence, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMixedSheet});
				ThaumcraftHelper.addInfusion("WANDPED", new ItemStack(ConfigBlocks.blockStoneDevice, 1, 5), 8, new AspectList().add(Aspect.AURA, 24).add(Aspect.CRAFT, 24).add(Aspect.MAGIC, 48), new ItemStack(ConfigBlocks.blockStoneDevice, 1, 1), new ItemStack[] {WurmTweaksItems.stableMagicEssence, WurmTweaksItems.stableMagicEssence, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMixedSheet});
				ThaumcraftHelper.addShaped("VISCHARGERELAY", new ItemStack(ConfigBlocks.blockMetalDevice, 1, 2), new AspectList().add(Aspect.EARTH, 50).add(Aspect.AIR, 50), " X ", "B B", "C C", 'X', new ItemStack(ConfigBlocks.blockMetalDevice, 1, 14), 'B', new ItemStack(ConfigItems.itemWandRod, 1, 2), 'C', WurmTweaksBlocks.blockPlatinum);
				ThaumcraftHelper.addShaped("VISPOWER", new ItemStack(ConfigBlocks.blockStoneDevice, 1, 11), new AspectList().add(Aspect.AIR, 100).add(Aspect.FIRE, 100).add(Aspect.EARTH, 100), "XAX", "XCX", "XAX", 'X', WurmTweaksBlocks.blockCompressedRedstone, 'A', WurmTweaksItems.stableMagicEssence, 'C', new ItemStack(ConfigBlocks.blockStoneDevice, 1, 10));
				ThaumcraftHelper.addShaped("VISPOWER", new ItemStack(ConfigBlocks.blockStoneDevice, 1, 14), new AspectList().add(Aspect.AIR, 50), " X ", "XCX", " X ", 'X', WurmTweaksItems.itemMixedSheet, 'C', WurmTweaksItems.stableMagicEssence);
				ThaumcraftHelper.addShaped("FOCUSSHOCK", new ItemStack(ConfigItems.itemFocusShock, 1, 0), new AspectList().add(Aspect.ORDER, 25), "XAX", "ACA", "XAX", 'X', ModItems.draconicCore, 'A', WurmTweaksItems.stableMagicEssence, 'C', WurmTweaksItems.itemWandParts);
				ThaumcraftHelper.addShaped("FOCUSFROST", new ItemStack(ConfigItems.itemFocusShock, 1, 0), new AspectList().add(Aspect.ORDER, 25), "XAX", "ACA", "XAX", 'X', TFCBlocks.ice, 'A', WurmTweaksItems.stableMagicEssence, 'C', WurmTweaksItems.itemWandParts);
				ThaumcraftHelper.addShaped("NODESTABILIZER", new ItemStack(ConfigBlocks.blockStoneDevice, 1, 9), new AspectList().add(Aspect.EARTH, 20), " S ", "SXS", "BBB", 'S', WurmTweaksItems.stableMagicEssence, 'X', WurmTweaksItems.itemCraftingCore, 'B', WurmTweaksBlocks.blockPlatinum);
				ThaumcraftHelper.addInfusion("NODESTABILIZERADV", new ItemStack(ConfigBlocks.blockStoneDevice, 1, 10), 12, new AspectList().add(Aspect.MAGIC, 64).add(Aspect.ORDER, 64), new ItemStack(ConfigBlocks.blockStoneDevice, 1, 9), new ItemStack[] {new ItemStack(WurmTweaksBlocks.blockCompressedRedstone), new ItemStack(WurmTweaksBlocks.blockCompressedRedstone), new ItemStack(WurmTweaksBlocks.blockCompressedRedstone), new ItemStack(WurmTweaksBlocks.blockCompressedRedstone), new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemResource, 1, 0)});
				ThaumcraftHelper.addInfusion("FOCUSWARDING", new ItemStack(ConfigItems.itemFocusWarding, 1, 0), 32, new AspectList().add(Aspect.AURA, 32).add(Aspect.MAGIC, 64).add(Aspect.ARMOR, 32), new ItemStack(Items.nether_star), new ItemStack[] {WurmTweaksItems.stableMagicEssence, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemCraftingCore, new ItemStack(Items.quartz), new ItemStack(Blocks.end_stone)});
				ThaumcraftHelper.addShaped("FOCUSEXCAVATION", new ItemStack(ConfigItems.itemFocusExcavation, 1, 0), new AspectList().add(Aspect.EARTH, 25), "XAX", "ACA", "XAX", 'X', "packDirt", 'A', WurmTweaksItems.stableMagicEssence, 'C', WurmTweaksItems.itemWandParts);
				ThaumcraftHelper.addShaped("FOCUSTRADE", new ItemStack(ConfigItems.itemFocusTrade, 1, 0), new AspectList().add(Aspect.EARTH, 25), "XAX", "ACA", "XAX", 'X', "packMeat", 'A', WurmTweaksItems.stableMagicEssence, 'C', WurmTweaksItems.itemWandParts);
				ThaumcraftHelper.addInfusion("FOCUSPORTABLEHOLE", new ItemStack(ConfigItems.itemFocusPortableHole, 1, 0), 32, new AspectList().add(Aspect.AURA, 32).add(Aspect.MAGIC, 64), new ItemStack(Items.ender_pearl), new ItemStack[] {WurmTweaksItems.stableMagicEssence, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemCraftingCore, new ItemStack(Items.quartz), new ItemStack(Blocks.end_stone)});
				ThaumcraftHelper.addShaped("FOCUSPOUCH", new ItemStack(ConfigItems.itemFocusPouch, 1, 0), new AspectList().add(Aspect.EARTH, 20), "LXL", "LCL", "LLL", 'L', TFCItems.leather, 'X', TFCItems.platinumSheet2x, 'C', "packChest");
				ThaumcraftHelper.addShaped("CAP_copper", new ItemStack(ConfigItems.itemWandCap, 1, 3), new AspectList().add(Aspect.ENTROPY, 20), "III", "I I", 'I', TFCItems.copperSheet);
				ThaumcraftHelper.addInfusion("ROD_reed", new ItemStack(ConfigItems.itemWandRod, 1, 5), 2, new AspectList().add(Aspect.WATER, 20).add(Aspect.AIR, 20).add(Aspect.MAGIC, 20), new ItemStack(TFCItems.reeds), new ItemStack[] {WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMixedSheet, new ItemStack(ItemsCommonProxy.essence, 1, 10)});
				ThaumcraftHelper.addInfusion("ROD_quartz", new ItemStack(ConfigItems.itemWandRod, 1, 4), 2, new AspectList().add(Aspect.CRYSTAL, 20).add(Aspect.AIR, 20).add(Aspect.MAGIC, 20), new ItemStack(Items.quartz), new ItemStack[] {WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMixedSheet, new ItemStack(ItemsCommonProxy.essence, 1, 10)});
				ThaumcraftHelper.addInfusion("ROD_obsidian", new ItemStack(ConfigItems.itemWandRod, 1, 1), 2, new AspectList().add(Aspect.DARKNESS, 20).add(Aspect.AIR, 20).add(Aspect.MAGIC, 20), new ItemStack(Blocks.obsidian), new ItemStack[] {WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMixedSheet, new ItemStack(ItemsCommonProxy.essence, 1, 10)});
				ThaumcraftHelper.addInfusion("ROD_blaze", new ItemStack(ConfigItems.itemWandRod, 1, 6), 2, new AspectList().add(Aspect.FIRE, 20).add(Aspect.AIR, 20).add(Aspect.MAGIC, 20), new ItemStack(Items.blaze_rod), new ItemStack[] {WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMixedSheet, new ItemStack(ItemsCommonProxy.essence, 1, 10)});
				ThaumcraftHelper.addInfusion("ROD_ice", new ItemStack(ConfigItems.itemWandRod, 1, 3), 2, new AspectList().add(Aspect.COLD, 20).add(Aspect.AIR, 20).add(Aspect.MAGIC, 20), new ItemStack(Blocks.ice), new ItemStack[] {WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMixedSheet, new ItemStack(ItemsCommonProxy.essence, 1, 10)});
				ThaumcraftHelper.addInfusion("ROD_bone", new ItemStack(ConfigItems.itemWandRod, 1, 7), 2, new AspectList().add(Aspect.DEATH, 20).add(Aspect.AIR, 20).add(Aspect.MAGIC, 20), new ItemStack(Items.bone), new ItemStack[] {WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMixedSheet, new ItemStack(ItemsCommonProxy.essence, 1, 10)});
				ThaumcraftHelper.addInfusion("ROD_silverwood", new ItemStack(ConfigItems.itemWandRod, 1, 2), 2, new AspectList().add(Aspect.AIR, 20).add(Aspect.MAGIC, 40), new ItemStack(ConfigBlocks.blockMagicalLog, 1, 1), new ItemStack[] {WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMixedSheet, new ItemStack(ItemsCommonProxy.essence, 1, 10)});
				ThaumcraftHelper.addShaped("ROD_quartz_staff", new ItemStack(ConfigItems.itemWandRod, 1, 54), new AspectList().add(Aspect.ORDER, 20).add(Aspect.FIRE, 20).add(Aspect.AIR, 20).add(Aspect.WATER, 20).add(Aspect.ENTROPY, 20), "  P", " S ", " S ", 'S', new ItemStack(ConfigItems.itemWandRod, 1, 4), 'P', new ItemStack(ConfigItems.itemResource, 1, 15));
				ThaumcraftHelper.addShaped("ROD_reed_staff", new ItemStack(ConfigItems.itemWandRod, 1, 55), new AspectList().add(Aspect.ORDER, 20).add(Aspect.FIRE, 20).add(Aspect.AIR, 20).add(Aspect.WATER, 20).add(Aspect.ENTROPY, 20), "  P", " S ", " S ", 'S', new ItemStack(ConfigItems.itemWandRod, 1, 5), 'P', new ItemStack(ConfigItems.itemResource, 1, 15));
				ThaumcraftHelper.addShaped("ROD_blaze_staff", new ItemStack(ConfigItems.itemWandRod, 1, 56), new AspectList().add(Aspect.ORDER, 20).add(Aspect.FIRE, 20).add(Aspect.AIR, 20).add(Aspect.WATER, 20).add(Aspect.ENTROPY, 20), "  P", " S ", " S ", 'S', new ItemStack(ConfigItems.itemWandRod, 1, 6), 'P', new ItemStack(ConfigItems.itemResource, 1, 15));
				ThaumcraftHelper.addShaped("ROD_obsidian_staff", new ItemStack(ConfigItems.itemWandRod, 1, 57), new AspectList().add(Aspect.ORDER, 20).add(Aspect.FIRE, 20).add(Aspect.AIR, 20).add(Aspect.WATER, 20).add(Aspect.ENTROPY, 20), "  P", " S ", " S ", 'S', new ItemStack(ConfigItems.itemWandRod, 1, 1), 'P', new ItemStack(ConfigItems.itemResource, 1, 15));
				ThaumcraftHelper.addShaped("ROD_ice_staff", new ItemStack(ConfigItems.itemWandRod, 1, 58), new AspectList().add(Aspect.ORDER, 20).add(Aspect.FIRE, 20).add(Aspect.AIR, 20).add(Aspect.WATER, 20).add(Aspect.ENTROPY, 20), "  P", " S ", " S ", 'S', new ItemStack(ConfigItems.itemWandRod, 1, 3), 'P', new ItemStack(ConfigItems.itemResource, 1, 15));
				ThaumcraftHelper.addShaped("ROD_greatwood_staff", new ItemStack(ConfigItems.itemWandRod, 1, 50), new AspectList().add(Aspect.ORDER, 20).add(Aspect.FIRE, 20).add(Aspect.AIR, 20).add(Aspect.WATER, 20).add(Aspect.ENTROPY, 20), "  P", " S ", " S ", 'S', new ItemStack(ConfigItems.itemWandRod, 1, 0), 'P', new ItemStack(ConfigItems.itemResource, 1, 15));
				ThaumcraftHelper.addShaped("ROD_silverwood_staff", new ItemStack(ConfigItems.itemWandRod, 1, 52), new AspectList().add(Aspect.ORDER, 20).add(Aspect.FIRE, 20).add(Aspect.AIR, 20).add(Aspect.WATER, 20).add(Aspect.ENTROPY, 20), "  P", " S ", " S ", 'S', new ItemStack(ConfigItems.itemWandRod, 1, 2), 'P', new ItemStack(ConfigItems.itemResource, 1, 15));
				ArcaneSceptreRecipe sr = new ArcaneSceptreRecipe();
				ThaumcraftApi.getCraftingRecipes().add(sr);
				ThaumcraftHelper.addShaped("CAP_silver", new ItemStack(ConfigItems.itemWandCap, 1, 5), new AspectList().add(Aspect.ENTROPY, 20), "III", "I I", 'I', TFCItems.silverSheet);
				ThaumcraftHelper.addInfusion("CAP_silver", new ItemStack(ConfigItems.itemWandCap, 1, 4), 6, new AspectList().add(Aspect.AURA, 12).add(Aspect.MAGIC, 12), new ItemStack(ConfigItems.itemWandCap, 1, 5), new ItemStack[] {new ItemStack(ConfigItems.itemResource, 1, 14), new ItemStack(ConfigItems.itemResource, 1, 14), WurmTweaksItems.stableMagicEssence, WurmTweaksItems.stableMagicEssence});
				ThaumcraftHelper.addShaped("CAP_gold", new ItemStack(ConfigItems.itemWandCap, 1, 1), new AspectList().add(Aspect.ENTROPY, 20), "III", "I I", 'I', TFCItems.goldSheet);
				ThaumcraftHelper.addShaped("CAP_thaumium", new ItemStack(ConfigItems.itemWandCap, 1, 6), new AspectList().add(Aspect.ENTROPY, 20), "III", "I I", 'I', new ItemStack(ConfigItems.itemResource, 1, 2));
				ThaumcraftHelper.addInfusion("CAP_thaumium", new ItemStack(ConfigItems.itemWandCap, 1, 2), 8, new AspectList().add(Aspect.AURA, 12).add(Aspect.MAGIC, 12), new ItemStack(ConfigItems.itemWandCap, 1, 6), new ItemStack[] {new ItemStack(ConfigItems.itemResource, 1, 14), new ItemStack(ConfigItems.itemResource, 1, 14), WurmTweaksItems.stableMagicEssence, WurmTweaksItems.stableMagicEssence});
		}

		// 3rd Page
		private static void addAlchemyRecipes () {
				ThaumcraftHelper.addCrucible("SANESOAP", new ItemStack(ConfigItems.itemSanitySoap, 1, 0), WurmTweaksItems.stableMagicEssence, new AspectList().add(Aspect.MAGIC, 32).add(Aspect.HEAL, 16).add(Aspect.ELDRITCH, 8));
				ThaumcraftHelper.addCrucible("BATHSALTS", new ItemStack(ConfigItems.itemBathSalts, 1, 0), WurmTweaksItems.stableMagicEssence, new AspectList().add(Aspect.MAGIC, 8).add(Aspect.HEAL, 4).add(Aspect.ELDRITCH, 4));
				ThaumcraftHelper.addShaped("ARCANESPA", new ItemStack(ConfigBlocks.blockStoneDevice, 1, 12), new AspectList().add(Aspect.ORDER, 16).add(Aspect.WATER, 24).add(Aspect.EARTH, 8), "XAX", "XCX", "XXX", 'X', new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 6), 'A', TFCItems.blueSteelBucketEmpty, 'C', WurmTweaksItems.stableMagicEssence);
				ThaumcraftHelper.addCrucible("ALCHEMICALMANUFACTURE", new ItemStack(Blocks.web), new ItemStack(Items.string), new AspectList().add(Aspect.CLOTH, 12).add(Aspect.TRAP, 8));
				ThaumcraftHelper.addCrucible("BOTTLETAINT", new ItemStack(ConfigItems.itemBottleTaint), ThaumcraftHelper.setBottleAspects(new AspectList().add(Aspect.TAINT, 8)), new AspectList().add(Aspect.MAGIC, 24).add(Aspect.TAINT, 12));
				ThaumcraftHelper.addCrucible("LIQUIDDEATH", new ItemStack(ConfigItems.itemBucketDeath), new ItemStack(TFCItems.redSteelBucketWater), new AspectList().add(Aspect.DEATH, 32).add(Aspect.ENTROPY, 32).add(Aspect.POISON, 16));
				ThaumcraftHelper.addCrucible("LIQUIDDEATH", new ItemStack(ConfigItems.itemBucketDeath), new ItemStack(TFCItems.blueSteelBucketEmpty), new AspectList().add(Aspect.DEATH, 32).add(Aspect.ENTROPY, 32).add(Aspect.POISON, 16));
				ThaumcraftHelper.addCrucible("CRUCIBLE", new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 0), new AspectList().add(Aspect.FIRE, 2).add(Aspect.WATER, 2).add(Aspect.EARTH, 2).add(Aspect.ORDER, 2).add(Aspect.ENTROPY, 2));
				ThaumcraftHelper.addCrucible("CRUCIBLE", new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 1), new AspectList().add(Aspect.AIR, 2).add(Aspect.WATER, 2).add(Aspect.EARTH, 2).add(Aspect.ORDER, 2).add(Aspect.ENTROPY, 2));
				ThaumcraftHelper.addCrucible("CRUCIBLE", new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 2), new AspectList().add(Aspect.FIRE, 2).add(Aspect.AIR, 2).add(Aspect.EARTH, 2).add(Aspect.ORDER, 2).add(Aspect.ENTROPY, 2));
				ThaumcraftHelper.addCrucible("CRUCIBLE", new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 3), new AspectList().add(Aspect.FIRE, 2).add(Aspect.WATER, 2).add(Aspect.AIR, 2).add(Aspect.ORDER, 2).add(Aspect.ENTROPY, 2));
				ThaumcraftHelper.addCrucible("CRUCIBLE", new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 4), new AspectList().add(Aspect.FIRE, 2).add(Aspect.WATER, 2).add(Aspect.EARTH, 2).add(Aspect.ORDER, 2).add(Aspect.ENTROPY, 2));
				ThaumcraftHelper.addCrucible("CRUCIBLE", new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 5), new AspectList().add(Aspect.FIRE, 2).add(Aspect.WATER, 2).add(Aspect.EARTH, 2).add(Aspect.AIR, 2).add(Aspect.ENTROPY, 2));
				// TODO "Crystal Studded Cosmic Neutronium Wand" Recipe
				ThaumcraftHelper.addCrucible("TALLOW", new ItemStack(ConfigItems.itemResource, 1, 4), new ItemStack(Items.rotten_flesh), new AspectList().add(Aspect.MAGIC, 2));
				ThaumcraftHelper.addCrucible("THAUMIUM", new ItemStack(ConfigItems.itemResource, 1, 2), new ItemStack(TFCItems.redSteelIngot), new AspectList().add(Aspect.MAGIC, 12));
				ThaumcraftHelper.addCrucible("THAUMIUM", new ItemStack(ConfigItems.itemResource, 1, 2), new ItemStack(TFCItems.blueSteelIngot), new AspectList().add(Aspect.MAGIC, 12));
				r.addShaped(ItemNBT.addDamage(new ItemStack(ConfigItems.itemAxeThaumium, 1, 0), 425), "II ", "IS ", " S ", 'I', new ItemStack(ConfigItems.itemResource, 1, 2), 'S', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(ConfigItems.itemAxeThaumium, 1, 0), 425), " II", " SI", " S ", 'I', new ItemStack(ConfigItems.itemResource, 1, 2), 'S', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(ConfigItems.itemPickThaumium, 1, 0), 400), "III", " S ", " S ", 'I', new ItemStack(ConfigItems.itemResource, 1, 2), 'S', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(ConfigItems.itemSwordThaumium, 1, 0), 500), "I", "I", "S", 'I', new ItemStack(ConfigItems.itemResource, 1, 2), 'S', "packStick");
				r.addShaped(ItemNBT.addDamage(new ItemStack(ConfigItems.itemShovelThaumium, 1, 0), 375), "I", "S", "S", 'I', new ItemStack(ConfigItems.itemResource, 1, 2), 'S', "packStick");
				r.addArmorRecipes(ConfigItems.itemHelmetThaumium, ConfigItems.itemChestThaumium, ConfigItems.itemLegsThaumium, ConfigItems.itemBootsThaumium, new ItemStack(ConfigItems.itemResource, 1, 2));
				ThaumcraftHelper.addCrucible("ETHEREALBLOOM", new ItemStack(ConfigBlocks.blockCustomPlant, 1, 4), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 2), new AspectList().add(Aspect.TAINT, 12).add(Aspect.MAGIC, 8).add(Aspect.HEAL, 24));
				ThaumcraftHelper.addCrucible("NITOR", new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(Items.glowstone_dust), new AspectList().add(Aspect.FIRE, 5).add(Aspect.LIGHT, 5).add(Aspect.ENERGY, 5));
				ThaumcraftHelper.addCrucible("ALUMENTUM", new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(TFCItems.coal, 1, 1), new AspectList().add(Aspect.FIRE, 5).add(Aspect.ENTROPY, 5).add(Aspect.ENERGY, 5));
				ThaumcraftHelper.addCrucible("ALUMENTUM", new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(TFCItems.coal, 1, 0), new AspectList().add(Aspect.FIRE, 5).add(Aspect.ENTROPY, 5).add(Aspect.ENERGY, 5));
				ThaumcraftHelper.addShaped("DISTILESSENTIA", new ItemStack(ConfigBlocks.blockStoneDevice, 1, 0), new AspectList().add(Aspect.FIRE, 16).add(Aspect.WATER, 16), "SCS", "SFS", "SSS", 'S', new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 6), 'C', new ItemStack(ConfigBlocks.blockMetalDevice, 1, 0), 'F', IC2Items.getItem("inductionFurnace"));
				ThaumcraftHelper.addShaped("DISTILESSENTIA", new ItemStack(ConfigItems.itemResource, 1, 8), new AspectList().add(Aspect.ORDER, 10).add(Aspect.AIR, 10), "PWP", 'P', TFCItems.platinumSheet2x, 'W', new ItemStack(ConfigBlocks.blockMagicalLog, 1, 1));
				ThaumcraftHelper.addShaped("DISTILESSENTIA", new ItemStack(ConfigBlocks.blockStoneDevice, 1, 1), new AspectList().add(Aspect.ORDER, 20), "FBB", "BXB", "  B", 'B', WurmTweaksItems.itemMixedSheet, 'F', new ItemStack(ConfigItems.itemResource, 1, 8), 'X', WurmTweaksItems.stableMagicEssence);
				ThaumcraftHelper.addShaped("DISTILESSENTIA", new ItemStack(ConfigBlocks.blockMetalDevice, 1, 9), new AspectList().add(Aspect.AIR, 20).add(Aspect.FIRE, 20), "XAX", "ACA", "XAX", 'X', WurmTweaksItems.itemMixedSheet, 'A', WurmTweaksItems.itemCraftingCore, 'C', new ItemStack(ConfigBlocks.blockMagicalLog, 1, 1));
				ThaumcraftHelper.addShaped("JARLABEL", new ItemStack(ConfigBlocks.blockJar, 1, 0), new AspectList().add(Aspect.WATER, 2), "PXP", "P P", "PPP", 'P', Blocks.glass_pane, 'X', new ItemStack(ConfigBlocks.blockSlabWood, 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(ConfigItems.itemResource, 2, 13), Items.paper, Items.paper, "dye", Items.slime_ball);
				ThaumcraftHelper.addShaped("JARVOID", new ItemStack(ConfigBlocks.blockJar, 1, 3), new AspectList().add(Aspect.ENTROPY, 20), "X", "J", "B", 'X', Blocks.obsidian, 'J', Items.ender_pearl,'B', new ItemStack(ConfigBlocks.blockJar, 1, 0));
				ThaumcraftHelper.addShaped("TUBES", new ItemStack(ConfigBlocks.blockTube, 3, 0), new AspectList().add(Aspect.WATER, 4), "SGS", 'G', "packGlass", 'S', WurmTweaksItems.itemMagicChunk);
				ThaumcraftHelper.addShapeless("TUBES", new ItemStack(ConfigBlocks.blockTube, 1, 1), new AspectList().add(Aspect.ORDER, 8), new ItemStack(ConfigBlocks.blockTube, 1, 0), Blocks.lever);
				ThaumcraftHelper.addShaped("TUBES", new ItemStack(ConfigItems.itemResonator, 1, 0), new AspectList().add(Aspect.AIR, 8), "W W", "WWW", " W ", 'W', new ItemStack(ConfigItems.itemResource, 1, 4));
				ThaumcraftHelper.addShaped("TUBEFILTER", new ItemStack(ConfigBlocks.blockTube, 1, 5), new AspectList().add(Aspect.AIR, 20), "BS", 'B', new ItemStack(ConfigBlocks.blockTube, 1, 0), 'S', "packSmoothStone");
				ThaumcraftHelper.addShaped("TUBEFILTER", new ItemStack(ConfigBlocks.blockTube, 1, 3), new AspectList().add(Aspect.AIR, 20), "BS", 'B', new ItemStack(ConfigBlocks.blockTube, 1, 0), 'S', new ItemStack(ConfigItems.itemResource, 1, 8));
				ThaumcraftHelper.addShaped("TUBEFILTER", new ItemStack(ConfigBlocks.blockTube, 1, 6), new AspectList().add(Aspect.AIR, 20), "BS", 'B', new ItemStack(ConfigBlocks.blockTube, 1, 0), 'S', TFCItems.dye);
				ThaumcraftHelper.addShaped("CENTRIFUGE", new ItemStack(ConfigBlocks.blockTube, 1, 4), new AspectList().add(Aspect.WATER, 5).add(Aspect.ORDER, 5), "PVP", "T T", "PRP", 'T', new ItemStack(ConfigBlocks.blockTube, 1, 0), 'V', new ItemStack(ConfigBlocks.blockTube, 1, 1), 'R', new ItemStack(ConfigBlocks.blockTube, 1, 5), 'P', new ItemStack(ConfigItems.itemEssence, 1, 0));
				ThaumcraftHelper.addShaped("THAUMATORIUM", new ItemStack(ConfigBlocks.blockMetalDevice, 1, 12), new AspectList().add(Aspect.FIRE, 5).add(Aspect.WATER, 5).add(Aspect.ORDER, 5), "IAI", "ABA", "IAI", 'B', new ItemStack(ConfigItems.itemZombieBrain), 'A', new ItemStack(ConfigItems.itemResource, 1, 6), 'I', WurmTweaksItems.itemBloodInfused);
		}

		// Page 4
		public static void addArtificeRecipes () {
				ThaumcraftHelper.addInfusion("JARBRAIN", new ItemStack(ConfigBlocks.blockJar, 1, 1), 12, new AspectList().add(Aspect.BEAST, 20).add(Aspect.AURA, 20), new ItemStack(ConfigBlocks.blockJar, 1, 0), new ItemStack[] {new ItemStack(TFCItems.redSteelSheet), WurmTweaksItems.stableMagicEssence, WurmTweaksItems.itemCraftingCore, new ItemStack(Items.rotten_flesh)});
				// TODO Runic Matrix
				ThaumcraftHelper.addShaped("INFUSION", new ItemStack(ConfigBlocks.blockStoneDevice, 1, 2), new AspectList().add(Aspect.ORDER, 50), "AXA", "XCX", "AXA", 'A', WurmTweaksItems.itemMixedSheet, 'X', WurmTweaksItems.itemCraftingCore, 'C', WurmTweaksBlocks.blockBlueSteel);
				ThaumcraftHelper.addShaped("ARCANESTONE", new ItemStack(ConfigBlocks.blockCosmeticSolid, 4, 6), new AspectList().add(Aspect.EARTH, 2).add(Aspect.AIR, 2), "SSS", "SXS", "SSS", 'S', "packSmoothStone", 'X', WurmTweaksItems.stableMagicEssence);
				ThaumcraftHelper.addShaped("ARCANEEAR", new ItemStack(ConfigBlocks.blockWoodenDevice, 1, 1), new AspectList().add(Aspect.EARTH, 20).add(Aspect.ENTROPY, 20), "ISI", "ISI", "BBB", 'I', WurmTweaksItems.itemMixedSheet, 'S', WurmTweaksItems.stableMagicEssence, 'B', WurmTweaksBlocks.blockBlueSteel);
				ThaumcraftHelper.addShaped("BASICARTIFACE", new ItemStack(ConfigItems.itemResource, 1, 15), new AspectList().add(Aspect.EARTH, 25).add(Aspect.AIR, 25).add(Aspect.WATER, 25).add(Aspect.ENTROPY, 25).add(Aspect.ORDER, 25), "ABC", "XHX", "CBA", 'A', new ItemStack(ItemsCommonProxy.essence, 1, 0), 'B', new ItemStack(ItemsCommonProxy.essence, 1, 10), 'C', new ItemStack(ItemsCommonProxy.essence, 1, 9), 'X', new ItemStack(TFCItems.oreChunk, 1, 24), 'H', ConfigItems.itemEssence);
				ThaumcraftHelper.addShaped("BASICARTIFACE", new ItemStack(ConfigItems.itemBaubleBlanks, 1, 0), new AspectList().add(Aspect.AIR, 5), " S ", "S S", " G ", 'S', TFCItems.silkCloth, 'G', new ItemStack(TFCItems.redSteelSheet2x));
				ThaumcraftHelper.addShaped("BASICARTIFACE", new ItemStack(ConfigItems.itemBaubleBlanks, 1, 1), new AspectList().add(Aspect.AIR, 5), " S ", "S S", " G ", 'S', TFCItems.silkCloth, 'G', new ItemStack(TFCItems.silkCloth));
				ThaumcraftHelper.addShaped("BASICARTIFACE", new ItemStack(ConfigItems.itemBaubleBlanks, 1, 2), new AspectList().add(Aspect.AIR, 5), " S ", "S S", " G ", 'S', TFCItems.redSteelSheet, 'G', new ItemStack(TFCItems.blueSteelSheet2x));
				ThaumcraftHelper.addShaped("BASICARTIFACE", new ItemStack(ConfigItems.itemResource, 1, 10), new AspectList().add(Aspect.EARTH, 10), "GS", 'G', Blocks.glass, 'S', TFCItems.silverSheet);
				ThaumcraftHelper.addShaped("GOGGLES", new ItemStack(ConfigItems.itemGoggles, 1, 0), new AspectList().add(Aspect.AIR, 5).add(Aspect.EARTH, 5).add(Aspect.ENTROPY, 5), "LGL", "L L", "XAX", 'L', WurmTweaksItems.itemMagicChunk, 'G', WurmTweaksItems.itemNatureCoreMK2, 'X', new ItemStack(ConfigItems.itemThaumometer), 'A', TFCItems.platinumSheet2x);
				ThaumcraftHelper.addInfusion("SINSTONE", new ItemStack(ConfigItems.itemCompassStone), 8, new AspectList().add(Aspect.DARKNESS, 20).add(Aspect.BEAST, 20).add(Aspect.DEATH, 20), new ItemStack(Items.flint), new ItemStack[] {WurmTweaksItems.stableMagicEssence, WurmTweaksItems.itemNatureCoreMK2, WurmTweaksItems.itemBloodInfused});
				ThaumcraftHelper.addShaped("BELLOWS", new ItemStack(ConfigBlocks.blockWoodenDevice, 1, 0), new AspectList().add(Aspect.AIR, 10).add(Aspect.EARTH, 10), "SXS", "XCX", "SXS", 'S', WurmTweaksItems.itemMagicChunk, 'X', new ItemStack(TFCItems.redSteelSheet), 'C', TFCBlocks.bellows);
				ThaumcraftHelper.addInfusion("MIRROR", new ItemStack(ConfigBlocks.blockMirror, 1, 0), 8, new AspectList().add(Aspect.MAGIC, 25).add(Aspect.MECHANISM, 20), new ItemStack(ConfigItems.itemResource, 1, 10), new ItemStack[] {new ItemStack(TFCItems.goldSheet), new ItemStack(Items.ender_pearl), WurmTweaksItems.itemMixedSheet, new ItemStack(TFCItems.goldSheet)});
				ThaumcraftHelper.addInfusion("MIRRORESSENTIA", new ItemStack(ConfigBlocks.blockMirror, 1, 6), 6, new AspectList().add(Aspect.MAGIC, 20).add(Aspect.AURA, 20), new ItemStack(ConfigItems.itemResource, 1, 10), new ItemStack[] {new ItemStack(TFCItems.redSteelSheet), new ItemStack(TFCItems.redSteelSheet), new ItemStack(TFCItems.blueSteelSheet)});
				ThaumcraftHelper.addInfusion("MIRRORHAND", new ItemStack(ConfigItems.itemHandMirror), 4, new AspectList().add(Aspect.MAGIC, 20), new ItemStack(ConfigBlocks.blockMirror), new ItemStack[] {WurmTweaksItems.ingotPurpleSteel, WurmTweaksItems.stableMagicEssence});
				ThaumcraftHelper.addInfusion("HOVERGIRDLE", new ItemStack(ConfigItems.itemGirdleHover), 2, new AspectList().add(Aspect.BEAST, 10).add(Aspect.GREED, 10).add(Aspect.POISON, 10).add(Aspect.ENERGY, 25), new ItemStack(ConfigItems.itemHoverHarness), new ItemStack[] {WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemCraftingCore});
				ThaumcraftHelper.addInfusion("HOVERHARNESS", new ItemStack(ConfigItems.itemHoverHarness), 12, new AspectList().add(Aspect.FLIGHT, 10).add(Aspect.AIR, 10).add(Aspect.ENERGY, 20), new ItemStack(TFCItems.redSteelChestplate), new ItemStack[] {new ItemStack(TFCItems.redSteelSheet), new ItemStack(TFCItems.blueSteelSheet), WurmTweaksItems.itemJetpackParts, WurmTweaksItems.itemNatureCoreMK2});
				ThaumcraftHelper.addInfusion("BOOTSTRAVELLER", new ItemStack(ConfigItems.itemBootsTraveller), 6, new AspectList().add(Aspect.FLIGHT, 15).add(Aspect.MOTION, 20), new ItemStack(TFCItems.redSteelBoots, 1, 0), new ItemStack[] {WurmTweaksItems.itemNatureCoreMK2, WurmTweaksItems.itemBloodInfused, new ItemStack(ItemsCommonProxy.battlemageBoots), new ItemStack(TFCItems.redSteelSheet), new ItemStack(TFCItems.blueSteelSheet), TFCHelper.getFood(TFCItems.fishRaw, 160f)});
		}

		// Page 6
		public static void addEldridthRecipes () {
				ThaumcraftHelper.addInfusion("SANITYCHECK", new ItemStack(ConfigItems.itemSanityChecker), 16, new AspectList().add(Aspect.DARKNESS, 20).add(Aspect.SOUL, 20).add(Aspect.MAGIC, 20), WurmTweaksItems.itemCraftingCore, new ItemStack[] {new ItemStack(TFCItems.blueSteelSheet), new ItemStack(TFCItems.redSteelSheet), new ItemStack(WurmTweaksBlocks.blockBlueSteel)});
				for (ItemStack seed : OreDictionary.getOres("packSeed"))
						ThaumcraftHelper.addCrucible("ELDRITCHMAJOR", new ItemStack(ConfigItems.itemResource, 1, 17), seed, new AspectList().add(Aspect.VOID, 8).add(Aspect.ENTROPY, 8).add(Aspect.MAGIC, 8));
				ThaumcraftHelper.addShaped("FOCUSPRIMAL", new ItemStack(ConfigItems.itemFocusPrimal, 1, 0), new AspectList().add(Aspect.ORDER, 25).add(Aspect.AIR, 25).add(Aspect.FIRE, 25).add(Aspect.ENTROPY, 25).add(Aspect.EARTH, 25).add(Aspect.WATER, 25), "XAX", "ACA", "XAX", 'X', WurmTweaksItems.itemBloodInfused, 'A', WurmTweaksItems.stableMagicEssence, 'C', WurmTweaksItems.itemWandParts);
		}
}

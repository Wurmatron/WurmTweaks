package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermalexpansion.block.TEBlocks;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import crazypants.enderio.EnderIO;
import dan200.computercraft.ComputerCraft;
import erogenousbeef.bigreactors.common.BigReactors;
import fox.spiteful.avaritia.items.LudicrousItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.ic2.ICHelper;
import wurmcraft.wurmatron.common.utils.techreborn.TechRebornHelper;

/**
 * Recipes Verified by Wurmatron
 * on 6/9/2016 with 0.4.3a
 */
public class BigReactorRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "BigReactors")
		public static void addRecipes () {
				LogHandler.info("Adding Big Reactor Recipes");
				r.addShaped(new ItemStack(BigReactors.blockYelloriumFuelRod, 2), "SXS", "SXS", "SXS", 'S', WurmTweaksItems.itemRadiationShielding, 'X', WurmTweaksItems.ingotYellowSteel);
				r.addShaped(new ItemStack(BigReactors.blockReactorPart, 6, 0), "SSS", "XAX", "SSS", 'S', WurmTweaksItems.itemRadiationShielding, 'X', WurmTweaksItems.ingotYellowSteel, 'A', WurmTweaksBlocks.blockBlueSteel);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 6, 1), WurmTweaksItems.ingotEnergyReactor, WurmTweaksItems.itemRadiationShielding, WurmTweaksItems.ingotYellowSteel, WurmTweaksBlocks.blockCompressedRedstone);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 2), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, TFCItems.copperSheet2x, TFItems.ingotEnderium);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 3), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, TFCItems.copperSheet2x, new ItemStack(ExtraUtils.transferNode, 1, 12));
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 4), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotGreenSteel, "packChest");
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 5), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotGreenSteel, new ItemStack(ExtraUtils.transferNode, 1, 6));
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 6), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotGreenSteel, WurmTweaksBlocks.blockCompressedRedstone);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 7), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotGreenSteel, ComputerCraft.Blocks.computer);
				r.addShaped(new ItemStack(BigReactors.blockMultiblockGlass, 6, 0), "GGG", "XAX", "GGG", 'G', EnderIO.blockFusedQuartz, 'X', WurmTweaksItems.ingotYellowSteel, 'A', new ItemStack(BigReactors.ingotGeneric, 1, 8));
				r.addShaped(new ItemStack(BigReactors.blockMultiblockGlass, 6, 1), "GGG", "XAX", "GGG", 'G', new ItemStack(BigReactors.blockMultiblockGlass, 6, 0), 'X', WurmTweaksItems.ingotBrownSteel, 'A', WurmTweaksItems.itemRadiationShielding);
				r.addCrossWCenter(new ItemStack(BigReactors.blockReactorRedstonePort, 1, 0), WurmTweaksItems.ingotYellowSteel, WurmTweaksBlocks.blockCompressedRedstone, WurmTweaksItems.ingotRainbowSteel);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockTurbinePart, 4, 0), WurmTweaksItems.itemRadiationShielding, new ItemStack(BigReactors.ingotGeneric, 1, 8), WurmTweaksItems.ingotGraySteel, WurmTweaksBlocks.blockCompressedRedstone);
				r.addCrossWCenter(new ItemStack(BigReactors.blockTurbinePart, 1, 1), WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotTitanium, new ItemStack(BigReactors.blockReactorPart, 1));
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockTurbinePart, 1, 2), new ItemStack(BigReactors.blockTurbinePart, 1, 0), WurmTweaksItems.ingotYellowSteel, TFCItems.platinumSheet2x, new ItemStack(ExtraUtils.transferNode, 1, 12));
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockTurbinePart, 1, 3), new ItemStack(BigReactors.blockTurbinePart, 1, 0), WurmTweaksItems.ingotYellowSteel, TFCItems.platinumSheet2x, new ItemStack(ExtraUtils.transferNode, 1, 6));
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockTurbinePart, 1, 4), new ItemStack(BigReactors.blockTurbinePart, 1, 0), WurmTweaksItems.ingotYellowSteel, TFCItems.platinumSheet2x, LudicrousItems.matter_cluster);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockTurbinePart, 1, 5), new ItemStack(BigReactors.blockTurbinePart, 1, 0), WurmTweaksItems.ingotYellowSteel, TFCItems.platinumSheet2x, ComputerCraft.Blocks.computer);
				r.addShaped(new ItemStack(BigReactors.blockTurbineRotorPart, 4, 0), " X ", "XCX", " X ", 'X', WurmTweaksItems.ingotGraySteel, 'C', WurmTweaksItems.ingotFrancium);
				r.addShaped(new ItemStack(BigReactors.blockTurbineRotorPart, 2, 1), " X ", "XCX", " X ", 'X', WurmTweaksItems.ingotGraySteel, 'C', WurmTweaksItems.ingotGreenSteel);
				r.addShaped(BigReactors.blockDevice, "XAX", "CGC", "CCC", 'X', new ItemStack(BigReactors.ingotGeneric, 1, 8), 'A', WurmTweaksItems.ingotEnergyReactor, 'G', "packGemBlock", 'C', WurmTweaksItems.ingotGraySteel);
				r.addShaped9X9Recipe(new ItemStack(BigReactors.blockMultiblockCreativePart, 1, 0), "CBBBBBBBC", "BXHHXHHXB", "BHFFFFFHB", "BHFQQQFHB", "BKFQQQFKB", "BHFQQQFHB", "BHFFFFFHB", "BXHHXHHXB", "CBBBBBBBC", 'C', new ItemStack(LudicrousItems.resource, 1, 6), 'B', Blocks.bedrock, 'X', new ItemStack(LudicrousItems.resource, 1, 5), 'H', TFCItems.redSteelBucketWater, 'F', WurmTweaksItems.itemUnstableMatter, 'Q', WurmTweaksItems.creativeCreativeParts, 'K', new ItemStack(BigReactors.blockReactorPart, 1, 5));
				r.addShaped9X9Recipe(new ItemStack(BigReactors.blockMultiblockCreativePart, 1, 0), "CBBBBBBBC", "BXHHXHHXB", "BHFFFFFHB", "BHFQQQFHB", "BKFQQQFKB", "BHFQQQFHB", "BHFFFFFHB", "BXHHXHHXB", "CBBBBBBBC", 'C', new ItemStack(LudicrousItems.resource, 1, 6), 'B', Blocks.bedrock, 'X', new ItemStack(LudicrousItems.resource, 1, 5), 'H', TFCItems.redSteelBucketSaltWater, 'F', WurmTweaksItems.itemUnstableMatter, 'Q', WurmTweaksItems.creativeCreativeParts, 'K', new ItemStack(BigReactors.blockReactorPart, 1, 5));
				r.addShaped9X9Recipe(new ItemStack(BigReactors.blockMultiblockCreativePart, 1, 1), "CBBBBBBBC", "BXHHXHHXB", "BHFFFFFHB", "BHFQQQFHB", "BKFQQQFKB", "BHFQQQFHB", "BHFFFFFHB", "BXHHXHHXB", "CBBBBBBBC", 'C', new ItemStack(LudicrousItems.resource, 1, 6), 'B', Blocks.bedrock, 'X', new ItemStack(LudicrousItems.resource, 1, 5), 'H', new ItemStack(TEBlocks.blockDynamo, 1, 0), 'F', WurmTweaksItems.itemUnstableMatter, 'Q', WurmTweaksItems.creativeCreativeParts, 'K', new ItemStack(BigReactors.blockTurbinePart, 1, 3));
				r.addShapeless(new ItemStack(BigReactors.ingotGeneric, 1, 8), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.itemMagicChunk, ExtraUtils.bedrockium, WurmTweaksItems.itemCraftingCore);
				for (int b = 0; b < 3; b++)
						r.addShapeless(new ItemStack(BigReactors.ingotGeneric, 32, b), new ItemStack(BigReactors.blockMetal, 1, b));
				r.addShapeless(new ItemStack(BigReactors.ingotGeneric, 32, 8), new ItemStack(BigReactors.blockMetal, 1, 4));
				if (RecipeChecker.modExists("techreborn"))
						addCentrifugeRecipes();
				if (RecipeChecker.modExists("IC2"))
						addCompressorRecipes();
		}

		@Optional.Method (modid = "techreborn")
		private static void addCentrifugeRecipes () {
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.leadIngot, 4), null, new ItemStack(BigReactors.ingotGeneric, 12, 0), null, null, null, 600, 128);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.leadIngot2x, 4), null, new ItemStack(BigReactors.ingotGeneric, 24, 0), null, null, null, 600, 128);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.oreChunk, 1, 26), null, new ItemStack(BigReactors.ingotGeneric, 48, 0), null, null, null, 100, 128);
				TechRebornHelper.addCentrifugeRecipe(new ItemStack(TFCItems.oreChunk, 1, 25), null, new ItemStack(BigReactors.ingotGeneric, 36, 0), null, null, null, 400, 128);
		}

		@Optional.Method (modid = "IC2")
		private static void addCompressorRecipes () {
				for (int b = 0; b < 3; b++)
						ICHelper.addCompressorRecipe(new ItemStack(BigReactors.ingotGeneric, 32, b), new ItemStack(BigReactors.blockMetal, 1, b));
				ICHelper.addCompressorRecipe(new ItemStack(BigReactors.ingotGeneric, 32, 8), new ItemStack(BigReactors.blockMetal, 1, 4));
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import WayofTime.alchemicalWizardry.ModBlocks;
import WayofTime.alchemicalWizardry.ModItems;
import WayofTime.alchemicalWizardry.api.alchemy.AlchemyRecipeRegistry;
import WayofTime.alchemicalWizardry.api.altarRecipeRegistry.AltarRecipeRegistry;
import WayofTime.alchemicalWizardry.api.bindingRegistry.BindingRegistry;
import WayofTime.alchemicalWizardry.api.items.ShapedBloodOrbRecipe;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.Core.Recipes;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import tconstruct.smeltery.TinkerSmeltery;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.nbt.ItemNBT;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

public class BloodMagicRecipes  {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "AWWayofTime")
		public static void addRecipes () {
				LogHandler.info("Adding Blood Magic Recipes");
				r.addCircleWCenter(new ItemStack(ModBlocks.largeBloodStoneBrick, 8, 0), "packSmoothStone", ModItems.weakBloodShard);
				r.add2X(new ItemStack(ModBlocks.bloodStoneBrick, 4, 0), ModBlocks.largeBloodStoneBrick);
				r.addCrossWCenter(ModBlocks.runeOfSelfSacrifice, WurmTweaksItems.stableMagicEssence, ModItems.reinforcedSlate, ModBlocks.bloodRune);
				r.addCrossWCenter(new ItemStack(ModBlocks.ritualStone, 2), ModBlocks.bloodRune, WurmTweaksBlocks.blockBlackSteel, ModItems.imbuedSlate);
				r.addCrossWCenter(new ItemStack(ModBlocks.imperfectRitualStone, 2), ModBlocks.bloodRune, WurmTweaksBlocks.blockRedSteel, ModItems.imbuedSlate);
				r.addShaped(new ItemStack(ModBlocks.blockSpellEffect, 1, 0), "XAX", "BBB", "AXA", 'A', Items.blaze_rod, 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.stableMagicEssence);
				r.addShaped(new ItemStack(ModBlocks.blockSpellEffect, 1, 1), "XAX", "BBB", "AXA", 'A', Items.snowball, 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.stableMagicEssence);
				r.addShaped(new ItemStack(ModBlocks.blockSpellEffect, 1, 2), "XAX", "BBB", "AXA", 'A', Items.feather, 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.stableMagicEssence);
				r.addShaped(new ItemStack(ModBlocks.blockSpellEffect, 1, 3), "XAX", "BBB", "AXA", 'A', "packDirt", 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.stableMagicEssence);
				r.addCircleWCenter(ModBlocks.armourForge, WurmTweaksItems.itemMagicChunk, TinkerSmeltery.smeltery);
				r.addShaped(new ItemStack(ModBlocks.blockSpellModifier, 1, 0), "XAX", "BBB", "AXA", 'A', TFCItems.bismuthSheet, 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.itemMagicChunk);
				for (Item sword : Recipes.swords)
						r.addShaped(new ItemStack(ModBlocks.blockSpellModifier, 1, 1), "XAX", "BBB", "AXA", 'A', new ItemStack(sword, 1, OreDictionary.WILDCARD_VALUE), 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.itemMagicChunk);
				for (Item sword : Recipes.maces)
						r.addShaped(new ItemStack(ModBlocks.blockSpellModifier, 1, 2), "XAX", "BBB", "AXA", 'A', new ItemStack(sword, 1, OreDictionary.WILDCARD_VALUE), 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.itemMagicChunk);
				r.addShaped(new ItemStack(ModBlocks.blockSpellModifier, 1, 3), "XAX", "BBB", "AXA", 'A', TFCItems.copperSheet2x, 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.itemMagicChunk);
				r.addCircleWCenter(new ItemStack(ModBlocks.blockCrystal, 12), "packSmoothStone", "packGemBlock");
				r.add2X(new ItemStack(ModBlocks.blockCrystal, 4, 1), new ItemStack(ModBlocks.blockCrystal));
				r.addShaped(new ItemStack(ModBlocks.blockSpellParadigm, 1, 0), "XAX", "BBB", "AXA", 'A', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.itemMagicChunk);
				r.addShaped(new ItemStack(ModBlocks.blockSpellParadigm, 1, 1), "XAX", "BBB", "AXA", 'A', ModBlocks.runeOfSelfSacrifice, 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.itemMagicChunk);
				r.addShaped(new ItemStack(ModBlocks.blockSpellParadigm, 1, 2), "XAX", "BBB", "AXA", 'A', ModBlocks.runeOfSacrifice, 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.itemMagicChunk);
				r.addShaped(new ItemStack(ModBlocks.blockSpellParadigm, 1, 3), "XAX", "BBB", "AXA", 'A', "packAnvil", 'A', ModItems.demonicSlate, 'B', WurmTweaksItems.itemMagicChunk);
				r.addBasicMachineRecipe(ModBlocks.speedRune, WurmTweaksItems.stableMagicEssence, TFCHelper.getFood(TFCItems.sugar, 160), Items.blaze_powder, ModBlocks.bloodRune);
				r.addBasicMachineRecipe(ModBlocks.efficiencyRune, WurmTweaksItems.stableMagicEssence, TFItems.ingotEnderium, Items.blaze_powder, ModBlocks.bloodRune);
				r.addCrossWCenter(ModBlocks.blockMasterStone, ModBlocks.bloodRune, Blocks.obsidian, ModItems.imbuedSlate);
				r.addShaped(ModBlocks.blockPedestal, " X ", " X ", "BBB",'B', ModBlocks.largeBloodStoneBrick, 'X', WurmTweaksItems.stableMagicEssence);
				r.addShaped(ModBlocks.blockPlinth, " X ", " X ", "BBB",'B', ModBlocks.largeBloodStoneBrick, 'X', WurmTweaksItems.itemMagicChunk);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 0), WurmTweaksItems.itemBloodInfused, WurmTweaksItems.stableMagicEssence, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 1), WurmTweaksItems.itemBloodInfused, "packDirt", new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 2), WurmTweaksItems.itemBloodInfused, Items.feather, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 3), WurmTweaksItems.itemBloodInfused, Blocks.obsidian, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 4), WurmTweaksItems.itemBloodInfused, ModItems.weakBloodShard, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 5), WurmTweaksItems.itemBloodInfused, ModItems.demonBloodShard, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 6), WurmTweaksItems.itemBloodInfused, ModItems.blankSlate, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 7), WurmTweaksItems.itemBloodInfused, WurmTweaksItems.ingotYellowSteel, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 8), WurmTweaksItems.itemBloodInfused, WurmTweaksItems.ingotBrownSteel, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 9), WurmTweaksItems.itemBloodInfused, ModItems.reinforcedSlate, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 10), WurmTweaksItems.itemBloodInfused, WurmTweaksItems.ingotOrangeSteel, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 11), WurmTweaksItems.itemBloodInfused, WurmTweaksItems.ingotGreenSteel, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 12), WurmTweaksItems.itemBloodInfused, WurmTweaksItems.ingotHalfium, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 13), WurmTweaksItems.itemBloodInfused, ModItems.demonicSlate, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.blockSpellEnhancement, 1, 14), WurmTweaksItems.itemBloodInfused, WurmTweaksItems.ingotTitanium, new ItemStack(ModBlocks.efficiencyRune), WurmTweaksBlocks.blockPlatinum);
				r.addBasicMachineRecipe(ModBlocks.blockTeleposer, WurmTweaksItems.itemBloodInfused, ModBlocks.bloodRune, TFItems.ingotEnderium, WurmTweaksItems.ingotCyanSteel);
				r.addShapeless(ModBlocks.blockWritingTable, WurmTweaksItems.itemBloodInfused, Items.brewing_stand, WurmTweaksItems.ingotRainbowSteel);
				for (Item sword : Recipes.swords)
						r.addBasicMachineRecipe(ModBlocks.runeOfSacrifice, WurmTweaksItems.stableMagicEssence, TFItems.ingotEnderium, new ItemStack(sword, 1, OreDictionary.WILDCARD_VALUE), ModItems.reinforcedSlate);
				GameRegistry.addRecipe(new ShapedBloodOrbRecipe(ModBlocks.bloodRune, "XAX", "AOA", "XAX", 'X', ModItems.blankSlate, 'A', WurmTweaksItems.itemMagicChunk, 'O', ModItems.apprenticeBloodOrb));
				GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.bloodRune, 1, 1), "XAX", "AOA", "XAX", 'X', ModItems.reinforcedSlate, 'A', WurmTweaksItems.itemMagicChunk, 'O', ModItems.apprenticeBloodOrb));
				GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.bloodRune, 1, 2), "XAX", "AOA", "XAX", 'X', ModItems.reinforcedSlate, 'A', WurmTweaksItems.itemMagicChunk, 'O', ModItems.apprenticeBloodOrb));
				GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.bloodRune, 1, 3), "XAX", "AOA", "XAX", 'X', ModItems.imbuedSlate, 'A', WurmTweaksItems.itemMagicChunk, 'O', ModItems.masterBloodOrb));
				GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.bloodRune, 1, 4), "XAX", "AOA", "XAX", 'X', ModItems.reinforcedSlate, 'A', new ItemStack(ModBlocks.bloodRune, 1, 1), 'O', ModItems.apprenticeBloodOrb));
				GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.bloodRune, 1, 5), "XAX", "AOA", "XAX", 'X', ModItems.reinforcedSlate, 'A', ModBlocks.speedRune, 'O', ModItems.apprenticeBloodOrb));
				r.addShaped(ModBlocks.blockCrucible, "SSS", "XAX", "SSS", 'S', TFCItems.redSteelSheet2x, 'X', WurmTweaksItems.itemMagicChunk, 'A', WurmTweaksItems.itemBloodInfused);
				r.addShaped(ModBlocks.blockCrystalBelljar, "GGG", "GXG", "BBB", 'G', "packGlass", 'X', WurmTweaksItems.itemBloodInfused, 'B', TFCItems.blackSteelSheet2x);
				r.addShaped(ModBlocks.blockAltar, "XAX", "BBB", "CCC", 'X', "packGemBlock", 'A', WurmTweaksItems.itemMagicChunk, 'B', WurmTweaksItems.itemCraftingCore, 'C', WurmTweaksItems.ingotFrancium);
				r.addShaped(ModBlocks.blockHomHeart, "XAX", "BBB", "CCC", 'X', "packGemExquisite", 'A', WurmTweaksItems.itemMagicChunk, 'B', WurmTweaksItems.itemCraftingCore, 'C', WurmTweaksItems.ingotFrancium);
				r.addShaped(ModBlocks.blockConduit, "XXX", "AAA", "XXX", 'X', WurmTweaksItems.itemBloodInfused, 'A', TFItems.ingotEnderium);
				r.addCrossWCenter(ModBlocks.emptySocket, Blocks.obsidian, WurmTweaksItems.ingotPurpleSteel, WurmTweaksItems.ingotRainbowSteel);
				r.addBasicMachineRecipe(ModBlocks.blockAlchemicCalcinator, WurmTweaksItems.itemBloodInfused, WurmTweaksItems.itemMixedSheet, ModItems.demonicSlate, Blocks.furnace);
				r.addCircleWCenter(ModItems.armourInhibitor, ModBlocks.ritualStone, ModItems.weakBloodShard);
				r.addCircle(ModItems.itemDestinationClearer, "ingotThaumium");
				r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.daggerOfSacrifice), 825), "X", "X", "S", 'X', WurmTweaksItems.itemBloodInfused, 'S', WurmTweaksItems.ingotTitanium);
				r.addShaped(ModItems.itemTankSegmenter, " SS", "  S", "  S", 'S', TFCItems.redSteelSheet2x);
				r.addCrossWCenter(ModItems.lavaCrystal, Items.blaze_rod, Blocks.obsidian, TFCItems.blueSteelBucketLava);
				r.addShaped(ModItems.divinationSigil, "SSS", "SXS", "GGG", 'S', WurmTweaksItems.itemMagicChunk, 'X', ModItems.blankSlate, 'G', "packGlass");
				r.addShaped(ModItems.inputRoutingFocus, "LXL", "X X", "LXL", 'L', "packLog", 'X', Items.redstone);
				r.addCrossWCenter(ModItems.telepositionFocus, WurmTweaksItems.itemMagicChunk, WurmTweaksItems.itemQuantumFoam, "packLog");
				r.addCrossWCenter(ModItems.enhancedTelepositionFocus, WurmTweaksItems.itemMagicChunk, WurmTweaksItems.itemQuantumFoam, ModItems.telepositionFocus);
				r.addCrossWCenter(ModItems.reinforcedTelepositionFocus, WurmTweaksItems.itemMagicChunk, WurmTweaksItems.itemQuantumFoam, ModItems.enhancedTelepositionFocus);
				r.addCrossWCenter(ModItems.demonicTelepositionFocus, WurmTweaksItems.itemMagicChunk, WurmTweaksItems.itemQuantumFoam, ModItems.reinforcedTelepositionFocus);
				r.addShaped(ModItems.itemAttunedCrystal, "XXX", "  X", "  X", 'X', WurmTweaksItems.itemMagicChunk);
				r.addShaped(ModItems.ritualDismantler, "XAX", "H H", "X X", 'X', WurmTweaksItems.ingotCyanSteel, 'A', WurmTweaksItems.itemMagicChunk, 'H', TFCItems.blueSteelHammer);
				r.addShaped(ModItems.ritualDismantler, "XAX", "H H", "X X", 'X', WurmTweaksItems.ingotCyanSteel, 'A', WurmTweaksItems.itemMagicChunk, 'H', TFCItems.redSteelHammer);
				r.addShapeless(new ItemStack(ModItems.itemRitualDiviner, 1, 0), WurmTweaksItems.itemMagicChunk, new ItemStack(ModItems.airScribeTool), new ItemStack(ModItems.earthScribeTool), new ItemStack(ModItems.fireScribeTool), new ItemStack(ModItems.waterScribeTool));
				r.addShapeless(new ItemStack(ModItems.itemRitualDiviner, 1, 1), WurmTweaksItems.itemMagicChunk, new ItemStack(ModItems.airScribeTool), new ItemStack(ModItems.earthScribeTool), new ItemStack(ModItems.fireScribeTool), new ItemStack(ModItems.waterScribeTool), new ItemStack(ModItems.duskScribeTool));
				r.addShapeless(new ItemStack(ModItems.itemRitualDiviner, 1, 1), new ItemStack(ModItems.itemRitualDiviner, 1, 0), new ItemStack(ModItems.duskScribeTool));
				r.addShapeless(new ItemStack(ModItems.itemRitualDiviner, 1, 2), WurmTweaksItems.itemMagicChunk, new ItemStack(ModItems.airScribeTool), new ItemStack(ModItems.earthScribeTool), new ItemStack(ModItems.fireScribeTool), new ItemStack(ModItems.waterScribeTool), new ItemStack(ModItems.duskScribeTool), new ItemStack(ModItems.dawnScribeTool));
				r.addShapeless(new ItemStack(ModItems.itemRitualDiviner, 1, 2), new ItemStack(ModItems.itemRitualDiviner, 1, 1), new ItemStack(ModItems.dawnScribeTool));
				r.addShapeless(new ItemStack(ModItems.itemRitualDiviner, 1, 2), new ItemStack(ModItems.itemRitualDiviner, 1, 0), new ItemStack(ModItems.dawnScribeTool), new ItemStack(ModItems.duskScribeTool));
				r.addBasicMachineRecipe(ModItems.waterSigil, WurmTweaksItems.stableMagicEssence, TFCItems.redSteelBucketWater, WurmTweaksItems.ingotRainbowSteel, ModItems.reinforcedSlate);
				r.addBasicMachineRecipe(ModItems.lavaSigil, WurmTweaksItems.stableMagicEssence, TFCItems.blueSteelBucketLava, WurmTweaksItems.ingotRainbowSteel, ModItems.reinforcedSlate);
				r.addBasicMachineRecipe(ModItems.waterSigil, WurmTweaksItems.stableMagicEssence, TFCItems.redSteelBucketWater, WurmTweaksItems.ingotRainbowSteel, ModItems.reinforcedSlate);
				r.addBasicMachineRecipe(ModItems.airSigil, WurmTweaksItems.stableMagicEssence, Items.feather, WurmTweaksItems.ingotRainbowSteel, ModItems.reinforcedSlate);
				r.addBasicMachineRecipe(ModItems.sigilOfMagnetism, WurmTweaksItems.stableMagicEssence, TFCItems.wroughtIronIngot, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.sigilOfMagnetism, WurmTweaksItems.stableMagicEssence, TFCItems.wroughtIronIngot, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.sigilOfTheFastMiner, WurmTweaksItems.stableMagicEssence, TFCItems.redSteelPick, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.sigilOfTheFastMiner, WurmTweaksItems.stableMagicEssence, TFCItems.blueSteelPick, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.sigilOfElementalAffinity, WurmTweaksItems.stableMagicEssence, WurmTweaksItems.itemQuantumSingularity, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.sigilOfTheFastMiner, WurmTweaksItems.stableMagicEssence, TFCItems.redSteelPick, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.voidSigil, WurmTweaksItems.stableMagicEssence, TFCItems.blueSteelBucketEmpty, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.voidSigil, WurmTweaksItems.stableMagicEssence, TFCItems.redSteelBucketEmpty, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.sigilOfHolding, WurmTweaksItems.stableMagicEssence, "packChest", WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.sigilOfWind, WurmTweaksItems.stableMagicEssence, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.itemCompressionSigil, WurmTweaksItems.stableMagicEssence, "packCobblestone", WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.itemBloodLightSigil, WurmTweaksItems.stableMagicEssence, Blocks.glowstone, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.itemAssassinSigil, WurmTweaksItems.stableMagicEssence, TFCItems.blueSteelSword, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				r.addBasicMachineRecipe(ModItems.itemAssassinSigil, WurmTweaksItems.stableMagicEssence, TFCItems.redSteelSword, WurmTweaksItems.ingotRainbowSteel, ModItems.imbuedSlate);
				addAlchemyRecipes();
				addBindingRecipes();
				addAlterRecipes();
		}

		@Optional.Method (modid = "AWWayofTime")
		private static void addAlchemyRecipes () {
				AlchemyRecipeRegistry.recipes.clear();
				addAlchemyRecipe(new ItemStack(ModItems.averagePowerCatalyst), 1, new ItemStack[] {new ItemStack(ModItems.mundanePowerCatalyst), new ItemStack(ModItems.mundanePowerCatalyst), new ItemStack(ModItems.mundanePowerCatalyst), new ItemStack(ModItems.standardBindingAgent)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.weakBindingAgent), 1, new ItemStack[] {new ItemStack(ModItems.simpleCatalyst), new ItemStack(ModItems.simpleCatalyst), new ItemStack(TFCItems.clayBall)}, 1);
				addAlchemyRecipe(new ItemStack(ModItems.standardBindingAgent), 1, new ItemStack[] {new ItemStack(ModItems.weakBindingAgent), new ItemStack(ModItems.sanctus), new ItemStack(ModItems.crystallos)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.itemComplexSpellCrystal), 1, new ItemStack[] {WurmTweaksItems.itemBloodInfused, new ItemStack(ModItems.weakBloodShard), new ItemStack(ModItems.weakBloodShard), new ItemStack(TFCItems.gemDiamond, 1, 2)}, 3);
				addAlchemyRecipe(new ItemStack(ModItems.averageLengtheningCatalyst), 1, new ItemStack[] {new ItemStack(ModItems.mundaneLengtheningCatalyst), new ItemStack(ModItems.mundaneLengtheningCatalyst), new ItemStack(ModItems.standardBindingAgent)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.greaterLengtheningCatalyst), 1, new ItemStack[] {new ItemStack(ModItems.averageLengtheningCatalyst), new ItemStack(ModItems.averageLengtheningCatalyst), new ItemStack(ModItems.standardBindingAgent)}, 3);
				addAlchemyRecipe(new ItemStack(ModItems.activationCrystal, 1, 1), 1, new ItemStack[] {new ItemStack(ModItems.demonBloodShard), new ItemStack(ModItems.activationCrystal), new ItemStack(ModItems.aether), new ItemStack(ModItems.incendium), new ItemStack(Items.nether_star)}, 3);
				addAlchemyRecipe(new ItemStack(ModItems.itemCombinationalCatalyst), 1, new ItemStack[] {new ItemStack(Items.nether_star), WurmTweaksItems.itemBloodInfused}, 5);
				addAlchemyRecipe(new ItemStack(ModItems.tennebrae), 1, new ItemStack[] {new ItemStack(TFCItems.coal, 1, 0), new ItemStack(Blocks.obsidian), new ItemStack(ModItems.simpleCatalyst), new ItemStack(TFCItems.coal, 1, 1)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.crystallos), 1, new ItemStack[] {new ItemStack(TFCBlocks.ice), new ItemStack(Blocks.snow), new ItemStack(Blocks.snow), new ItemStack(ModItems.standardBindingAgent)}, 3);
				addAlchemyRecipe(new ItemStack(ModItems.enhancedFillingAgent), 1, new ItemStack[] {new ItemStack(ModItems.standardFillingAgent), new ItemStack(Items.nether_star), new ItemStack(ModItems.standardBindingAgent), WurmTweaksItems.itemBloodInfused, new ItemStack(ModItems.standardBindingAgent)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.greaterPowerCatalyst), 1, new ItemStack[] {new ItemStack(ModItems.averagePowerCatalyst), new ItemStack(ModItems.simpleCatalyst), new ItemStack(ModItems.magicales)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.aquasalus), 1, new ItemStack[] {new ItemStack(TFCItems.redSteelBucketWater), new ItemStack(TFCItems.dye, 1, 0), new ItemStack(ModItems.simpleCatalyst), new ItemStack(ModItems.simpleCatalyst)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.weakFillingAgent), 1, new ItemStack[] {new ItemStack(ModItems.standardBindingAgent), new ItemStack(Items.nether_wart), new ItemStack(Items.ghast_tear)}, 1);
				addAlchemyRecipe(new ItemStack(ModItems.standardFillingAgent), 1, new ItemStack[] {new ItemStack(ModItems.weakFillingAgent), new ItemStack(Items.nether_wart), new ItemStack(Items.ghast_tear)}, 1);
				addAlchemyRecipe(new ItemStack(ModItems.mundaneLengtheningCatalyst), 1, new ItemStack[] {new ItemStack(Blocks.glowstone), new ItemStack(ModItems.standardBindingAgent), new ItemStack(Items.nether_wart)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.crepitous), 1, new ItemStack[] {new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder), new ItemStack(Blocks.cobblestone), new ItemStack(ModItems.standardBindingAgent)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.incendium), 1, new ItemStack[] {new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder), new ItemStack(Items.blaze_rod), new ItemStack(ModItems.standardBindingAgent)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.mundanePowerCatalyst), 1, new ItemStack[] {new ItemStack(ModItems.weakBindingAgent), new ItemStack(ModItems.standardFillingAgent), new ItemStack(Items.glowstone_dust), new ItemStack(Items.glowstone_dust)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.aether), 1, new ItemStack[] {new ItemStack(Items.feather), new ItemStack(Items.ghast_tear), new ItemStack(Items.glowstone_dust), new ItemStack(ModItems.standardBindingAgent)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.baseAlchemyItems, 1, 0), 1, new ItemStack[] {new ItemStack(ModItems.incendium), new ItemStack(Items.arrow), new ItemStack(Items.blaze_rod), new ItemStack(ModItems.enhancedFillingAgent)}, 3);
				addAlchemyRecipe(new ItemStack(ModItems.baseAlchemyItems, 1, 1), 1, new ItemStack[] {new ItemStack(ModItems.tennebrae), new ItemStack(Blocks.web), new ItemStack(Items.stick), new ItemStack(ModItems.enhancedFillingAgent)}, 3);
				addAlchemyRecipe(new ItemStack(ModItems.baseAlchemyItems, 1, 2), 1, new ItemStack[] {new ItemStack(ModItems.terrae), new ItemStack(Blocks.glowstone), new ItemStack(Items.gunpowder), new ItemStack(ModItems.enhancedFillingAgent)}, 3);
				addAlchemyRecipe(new ItemStack(ModItems.baseAlchemyItems, 1, 3), 2, new ItemStack[] {new ItemStack(ModItems.simpleCatalyst), new ItemStack(ModItems.simpleCatalyst), new ItemStack(Items.nether_wart)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.baseAlchemyItems, 1, 4), 1, new ItemStack[] {new ItemStack(ModItems.baseAlchemyItems, 1, 3), new ItemStack(ModItems.baseAlchemyItems, 1, 3), new ItemStack(Items.nether_wart)}, 2);
				addAlchemyRecipe(new ItemStack(ModItems.baseAlchemyItems, 1, 6), 1, new ItemStack[] {new ItemStack(TFCItems.coal), new ItemStack(ModItems.baseAlchemyItems, 1, 3), new ItemStack(Items.gunpowder), new ItemStack(Items.redstone)}, 3);
				addAlchemyRecipe(new ItemStack(ModItems.simpleCatalyst), 4, new ItemStack[] {new ItemStack(Items.glowstone_dust), new ItemStack(TFCItems.clayBall), new ItemStack(TFCItems.blackSteelSheet)}, 1);
		}

		@Optional.Method (modid = "AWWayofTime")
		private static void addBindingRecipes () {
				BindingRegistry.bindingRecipes.clear();
				addBindingRecipe(ItemNBT.addDamage(new ItemStack(ModItems.energySword), 1500), new ItemStack(TFCItems.blueSteelSword));
				addBindingRecipe(ItemNBT.addDamage(new ItemStack(ModItems.boundAxe), 1200), new ItemStack(TFCItems.redSteelAxe));
				addBindingRecipe(ItemNBT.addDamage(new ItemStack(ModItems.boundPickaxe), 1300), new ItemStack(TFCItems.redSteelPick));
				addBindingRecipe(ItemNBT.addDamage(new ItemStack(ModItems.boundShovel), 1280), new ItemStack(TFCItems.redSteelShovel));
				addBindingRecipe(ItemNBT.addDamage(new ItemStack(ModItems.customTool), 1400), new ItemStack(TFCItems.redSteelMace));
		}

		@Optional.Method (modid = "AWWayofTime")
		private static void addAlterRecipes () {
				AltarRecipeRegistry.altarRecipes.clear();
				addAlterRecipe(new ItemStack(ModItems.duskScribeTool), new ItemStack(WurmTweaksBlocks.blockBlackSteel), 4, 20000, 100, 100, false);
				addAlterRecipe(new ItemStack(ModItems.reinforcedSlate), new ItemStack(ModItems.blankSlate), 2, 1000, 50, 50, false);
				for (int i = 1; i <= OreDictionary.getOres("packIngot").size() - 1; i++)
						addAlterRecipe(new ItemStack(ModItems.blankSlate), OreDictionary.getOres("packIngot").get(i), 1, 200, 10, 10, false);
				addAlterRecipe(new ItemStack(ModItems.masterBloodOrb), new ItemStack(ModItems.weakBloodShard), 4, 40000, 500, 500, false);
				addAlterRecipe(new ItemStack(ModItems.dawnScribeTool), new ItemStack(Blocks.glowstone), 6, 200000, 1000, 1000, false);
				addAlterRecipe(new ItemStack(ModItems.baseAlchemyItems, 1, 27), new ItemStack(ModItems.demonicSlate), 5, 50000, 500, 500, false);
				addAlterRecipe(new ItemStack(ModItems.imbuedSlate), new ItemStack(ModItems.reinforcedSlate), 3, 20000, 100, 100, false);
				addAlterRecipe(new ItemStack(ModItems.demonicSlate), new ItemStack(ModItems.imbuedSlate), 4, 40000, 200, 200, false);
				addAlterRecipe(new ItemStack(ModItems.earthScribeTool), new ItemStack(WurmTweaksBlocks.blockBlueSteel), 3, 20000, 100, 100, false);
				addAlterRecipe(new ItemStack(ModItems.transcendentBloodOrb), new ItemStack(WayofTime.alchemicalWizardry.ModBlocks.blockCrystal, 1, 1), 6, 200000, 1000, 1000, false);
				addAlterRecipe(new ItemStack(ModItems.magicianBloodOrb), new ItemStack(WurmTweaksBlocks.blockGold), 3, 80000, 200, 200, false);
				addAlterRecipe(new ItemStack(ModItems.fireScribeTool), new ItemStack(Items.blaze_rod), 3, 20000, 100, 100, false);
				addAlterRecipe(new ItemStack(ModItems.waterScribeTool), new ItemStack(TFCItems.redSteelBucketWater), 3, 20000, 100, 100, false);
				addAlterRecipe(new ItemStack(ModItems.airScribeTool), new ItemStack(Items.feather), 3, 20000, 100, 100, false);
				addAlterRecipe(new ItemStack(ModItems.apprenticeBloodOrb), new ItemStack(TFCItems.gemDiamond, 1, 4), 2, 8000, 100, 100, false);
				addAlterRecipe(new ItemStack(ModItems.activationCrystal), new ItemStack(ModItems.lavaCrystal), 3, 4000, 50, 50, false);
				addAlterRecipe(new ItemStack(ModItems.weakBloodOrb), new ItemStack(TFCItems.gemRuby, 1, 4), 1, 2000, 25, 25, false);
				addAlterRecipe(new ItemStack(ModItems.bucketLife), new ItemStack(Items.bucket), 1, 1000, 50, 50, true);
				addAlterRecipe(new ItemStack(ModItems.archmageBloodOrb), new ItemStack(ModItems.demonBloodShard), 5, 100000, 500, 500, false);
				for (int i = 0; i <= 15; i++)
						for (int d = 0; d <= OreDictionary.getOres(RecipeHelper.dye.get(i)).size() - 1; d++)
								addAlterRecipe(new ItemStack(vazkii.botania.common.block.ModBlocks.flower, 1, i), OreDictionary.getOres(RecipeHelper.dye.get(i)).get(d), 1, 500, 100, 100, false);
		}

		@Optional.Method (modid = "AWWayofTime")
		private static void addAlchemyRecipe (ItemStack output, int needed, ItemStack[] recipe, int level) {
				AlchemyRecipeRegistry.registerRecipe(output, needed, recipe, level);
		}

		@Optional.Method (modid = "AWWayofTime")
		private static void addBindingRecipe (ItemStack output, ItemStack input) {
				BindingRegistry.registerRecipe(output, input);
		}

		@Optional.Method (modid = "AWWayofTime")
		private static void addAlterRecipe (ItemStack output, ItemStack input, int tier, int blood, int consumption, int drain, boolean filled) {
				AltarRecipeRegistry.registerAltarRecipe(output, input, tier, blood, consumption, drain, filled);
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import buildcraft.BuildCraftCore;
import cofh.thermalexpansion.block.cell.BlockCell;
import cofh.thermalexpansion.item.TEItems;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import crazypants.enderio.EnderIO;
import dan200.QCraft;
import ic2.api.item.IC2Items;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import vazkii.botania.common.item.ModItems;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WTItems;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

public class WurmTweaksRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				LogHandler.info("Adding WurmTweaks Recipes");
				r.addCrossWCenter(WurmTweaksItems.itemAutoCore, WurmTweaksItems.ingotFrancium, WurmTweaksItems.ingotEnergyReactor, "packCraftingTable");
				r.addShaped(WurmTweaksItems.itemSolarCore, "SSS", "PPP", "XXX", 'S', "packGlass", 'P', TFCItems.platinumSheet2x, 'X', "packCloth");
				r.addBasicMachineRecipe(WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemMixedSheet, "packCraftingTable", ExtraUtils.bedrockium, "packGemExquisite");
				r.addShapeless(WurmTweaksItems.ingotGreenSteel, new ItemStack(ModItems.manaResource, 1, 4), WurmTweaksItems.itemMixedSheet);
				r.addBasicMachineRecipe(WurmTweaksItems.ingotEnergyReactor, ExtraUtils.bedrockiumBlock, WurmTweaksItems.itemElectroMagneticShielding, BlockCell.cellResonant, "packGemBlock");
				r.addCrossWCenter(WurmTweaksItems.itemMixedSheet, TFCItems.redSteelSheet2x, TFCItems.blueSteelSheet2x, WurmTweaksItems.ingotPurpleSteel);
				r.addBasicMachineRecipe(WurmTweaksItems.ingotPinkSteel, "dyePink", WurmTweaksItems.ingotGreenSteel, WurmTweaksItems.gearMixedSheet, WurmTweaksItems.ingotPurpleSteel);
				r.addCrossWCenter(WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.itemMixedSheet, "dyeYellow", WurmTweaksItems.ingotEnergyReactor);
				r.addCrossWCenter(WurmTweaksItems.ingotOrangeSteel, "dyeOrange", WurmTweaksItems.stableMagicEssence, WurmTweaksItems.itemCraftingCore);
				r.addCrossWCenter(WurmTweaksItems.ingotPurpleSteel, TFCItems.redSteelIngot, TFCItems.blueSteelIngot, "packGem");
				r.addShapeless(WurmTweaksItems.ingotCyanSteel, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotOrangeSteel);
				r.addCrossWCenter(WurmTweaksItems.ingotBrownSteel, "dyeBrown", WurmTweaksItems.itemMagicChunk, WurmTweaksItems.itemCraftingCore);
				r.addBasicMachineRecipe(WurmTweaksItems.ingotGraySteel, TFCItems.blackSteelSheet2x, TFCItems.steelSheet2x, "packGemExquisite", WurmTweaksItems.itemMixedSheet);
				r.addShapeless(WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotCyanSteel, WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotGreenSteel, WurmTweaksItems.itemCraftingCore, new ItemStack(EnderIO.itemAlloy, 1, 2), TFItems.ingotEnderium, com.brandon3055.draconicevolution.common.ModItems.draconicIngot, new ItemStack(ModItems.manaResource, 1, 14), IC2Items.getItem("iridiumPlate"));
				// Magic Chunk
				r.addCrossWCenter(WurmTweaksItems.itemQuantumCore, WurmTweaksItems.itemQuantumFoam, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemQuantumSingularity);
				r.addCrossWCenter(WurmTweaksItems.itemQuantumSingularity, ExtraUtils.bedrockium, "packGemExquisite", WurmTweaksItems.itemMixedSheet);
				r.addBasicMachineRecipe(WurmTweaksItems.itemQuantumFoam, QCraft.Items.quantumDust, ExtraUtils.bedrockium, Items.glowstone_dust, Items.redstone);
				// Hafium Ore/ Ingot
				// Titanium, Francium
				r.addBasicMachineRecipe(WurmTweaksItems.itemRadiationShielding, TFCItems.leadSheet2x, WurmTweaksItems.ingotTitanium, WurmTweaksItems.itemMixedSheet, Items.redstone);
				r.addCrossWCenter(WurmTweaksItems.stableMagicEssence, WurmTweaksItems.itemMagicChunk, WurmTweaksItems.ingotGreenSteel, TFCItems.redSteelSheet2x);
				r.addBasicMachineRecipe(WurmTweaksItems.itemElectroShielding, WurmTweaksItems.itemRadiationShielding, TFItems.ingotEnderium, TEItems.capacitorResonant, WurmTweaksItems.itemMixedSheet);
				r.addCrossWCenter(WurmTweaksItems.itemBloodInfused, WurmTweaksItems.stableMagicEssence, WayofTime.alchemicalWizardry.ModItems.reinforcedSlate, WayofTime.alchemicalWizardry.ModItems.weakBloodShard);
				r.addCrossWCenter(WurmTweaksItems.itemNatureCore, WurmTweaksItems.itemMagicChunk, new ItemStack(ModItems.manaResource, 1, 0), WurmTweaksItems.itemCraftingCore);
				r.addCrossWCenter(WurmTweaksItems.itemNatureCoreMK2, WurmTweaksItems.itemNatureCore, WurmTweaksItems.ingotGreenSteel, new ItemStack(ModItems.manaResource, 1, 14));
				r.addShaped(WurmTweaksItems.itemEngineCoil, "XXX", " G ", "BAB", 'X', TFCItems.roseGoldSheet2x, 'G', TFCItems.platinumIngot, 'B', Items.redstone, 'A', TFCItems.blackSteelSheet2x);
				r.addCrossWCenter(WurmTweaksItems.itemQuarryCore, "packGemExquisite", ExtraUtils.bedrockium, WurmTweaksItems.itemMiningCore);
				r.addSimpleCirc(WurmTweaksItems.gearMixedSheet, WurmTweaksItems.itemMixedSheet, BuildCraftCore.diamondGearItem);
				r.addBasicMachineRecipe(WurmTweaksItems.itemMiningCore, TFCItems.blackSteelSheet2x, WurmTweaksItems.itemMixedSheet, TFCItems.redSteelPick, Items.redstone);
				r.addBasicMachineRecipe(WurmTweaksItems.itemMiningCore, TFCItems.blackSteelSheet2x, WurmTweaksItems.itemMixedSheet, TFCItems.blueSteelPick, Items.redstone);
				r.addBasicMachineRecipe(WurmTweaksItems.itemRefiningModule, TFCItems.blackSteelSheet2x, WurmTweaksItems.itemMixedSheet, TFCItems.clayBall, Items.redstone);
				r.addBasicMachineRecipe(WurmTweaksItems.itemComputationalCore, WurmTweaksItems.itemAutoCore, ExtraUtils.bedrockium, Items.redstone, WurmTweaksBlocks.blockCompressedRedstone);
				r.addBasicMachineRecipe(WurmTweaksItems.itemMachineFrame, TFCItems.blackSteelSheet2x, TFCItems.roseGoldSheet2x, WurmTweaksItems.itemMixedSheet, Items.redstone);
				r.addBasicMachineRecipe(WurmTweaksItems.itemSpaceModule, WurmTweaksBlocks.blockCompressedRedstone, WurmTweaksItems.itemMachineFrame, WurmTweaksItems.itemMixedSheet, Items.nether_star);
				r.addCrossWCenter(WurmTweaksItems.itemUnstableMatter, WurmTweaksItems.itemAntiMatter, WurmTweaksItems.ingotRainbowSteel, Items.redstone);
				r.addBasicMachineRecipe(WurmTweaksItems.itemJetpackParts, "dye", WurmTweaksItems.itemCraftingCore, WurmTweaksItems.ingotEnergyReactor, WurmTweaksItems.ingotGraySteel);
				r.addCrossWCenter(WurmTweaksItems.itemElectroMagneticShielding, WurmTweaksItems.itemElectroShielding, WurmTweaksItems.itemRadiationShielding, WurmTweaksBlocks.blockCompressedRedstone);
				r.addBasicMachineRecipe(WurmTweaksItems.itemWandParts, new ItemStack(ConfigBlocks.blockMagicalLog, 1, 1), WurmTweaksItems.itemCraftingCore, WurmTweaksItems.ingotEnergyReactor, new ItemStack(ConfigItems.itemResource, 1, 0));
				r.addSimpleCirc(new ItemStack(WurmTweaksItems.foodFruit.getItem(), 8, 0), "packFruit", "packFruit");
				r.addSimpleCirc(new ItemStack(WurmTweaksItems.foodGrain.getItem(), 8, 1), "packGrain", "packGrain");
				r.addSimpleCirc(new ItemStack(WurmTweaksItems.foodMeat.getItem(), 8, 2), "foodMeat", "foodMeat");
				r.addSimpleCirc(new ItemStack(WurmTweaksItems.foodVegtable.getItem(), 8, 3), "packVegetable", "packVegetable");
				r.addSimpleCirc(new ItemStack(WurmTweaksItems.foodCheese.getItem(), 8, 4), TFCHelper.getFood(TFCItems.cheese, 160), TFCHelper.getFood(TFCItems.cheese, 160));
				r.addShapeless(new ItemStack(WTItems.itemBasicFood, 1, 5), Items.skull, new ItemStack(WurmTweaksItems.foodMeat.getItem(), 1, 1));
				r.addSimpleCirc(new ItemStack(WTItems.itemBasicFood, 8, 6), new ItemStack(WurmTweaksItems.foodGrain.getItem(), 1, 1), new ItemStack(WurmTweaksItems.foodGrain.getItem(), 1, 1));
				r.addSimpleCirc(new ItemStack(WTItems.itemBasicFood, 5, 7), new ItemStack(WurmTweaksItems.foodGrain.getItem(), 1, 1), new ItemStack(WurmTweaksItems.foodCheese.getItem(), 1, 4));
				r.addSimpleCirc(new ItemStack(WTItems.itemBasicFood, 5, 8), new ItemStack(WurmTweaksItems.foodGrain.getItem(), 1, 1), new ItemStack(Items.skull,1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(new ItemStack(WTItems.itemBasicFood, 4, 9), WurmTweaksItems.foodFruit, WurmTweaksItems.foodGrain, WurmTweaksItems.foodMeat, WurmTweaksItems.foodVegtable, WurmTweaksItems.foodCheese);
				r.addShaped(new ItemStack(WTItems.itemPill, 1, 0), "RX", 'X', new ItemStack(WTItems.itemBasicFood, 1, 9), 'R', "packRubber");
				r.addShaped(new ItemStack(WTItems.itemPill, 1, 1), " RX", 'X', new ItemStack(WTItems.itemBasicFood, 1, 9), 'R', "packRubber");
				r.addShaped(new ItemStack(WTItems.itemPill, 1, 2), "XR", 'X', new ItemStack(WTItems.itemBasicFood, 1, 9), 'R', "packRubber");
				r.addShaped(new ItemStack(WTItems.itemPill, 1, 3), " XR", 'X', new ItemStack(WTItems.itemBasicFood, 1, 9), 'R', "packRubber");
				r.addShaped(new ItemStack(WTItems.itemPill, 1, 4), "R X", 'X', new ItemStack(WTItems.itemBasicFood, 1, 9), 'R', "packRubber");
				r.addShapeless(new ItemStack(WTItems.itemPill, 2, 5), new ItemStack(WTItems.itemPill, 1, 0), new ItemStack(WTItems.itemPill, 1, 1), new ItemStack(WTItems.itemPill, 1, 2), new ItemStack(WTItems.itemPill, 1, 3), new ItemStack(WTItems.itemPill, 1, 4));

		}
}

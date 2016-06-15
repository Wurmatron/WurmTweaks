package wurmcraft.wurmatron.common.recipes.mods;

import buildcraft.BuildCraftCore;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import extracells.registries.ItemEnum;
import gravisuite.GraviSuite;
import ic2.api.item.IC2Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import solarexpansion.init.SEGameObjects;
import tonius.simplyjetpacks.integration.TEItems;
import tonius.simplyjetpacks.setup.ModItems;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class SimplyJetpacksRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "simplyjetpacks")
		public static void addRecipes () {
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE1,  "LCL", "LSL", "T T", 'L', new ItemStack(TFCItems.leadSheet2x), 'C', cofh.thermalexpansion.item.TEItems.capacitorBasic, 'S', tonius.simplyjetpacks.setup.ModItems.leatherStrap, 'T', tonius.simplyjetpacks.setup.ModItems.thrusterTE1);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE1, "J", "P", 'J', tonius.simplyjetpacks.setup.ModItems.jetpackTE1, 'P', new ItemStack(tonius.simplyjetpacks.setup.ModItems.particleCustomizers, 1, 32767));
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE2,  "LCL", "LSL", "T T", 'L', new ItemStack(TFCItems.nickelSheet2x), 'C', cofh.thermalexpansion.item.TEItems.capacitorHardened, 'S', tonius.simplyjetpacks.setup.ModItems.jetpackTE1, 'T', tonius.simplyjetpacks.setup.ModItems.thrusterTE2);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE2, "J", "P", 'J', tonius.simplyjetpacks.setup.ModItems.jetpackTE2, 'P', new ItemStack(tonius.simplyjetpacks.setup.ModItems.particleCustomizers, 1, 32767));
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE3,  "LCL", "LSL", "T T", 'L', new ItemStack(TFCItems.roseGoldSheet2x), 'C', cofh.thermalexpansion.item.TEItems.capacitorReinforced, 'S', tonius.simplyjetpacks.setup.ModItems.jetpackTE2, 'T', tonius.simplyjetpacks.setup.ModItems.thrusterTE3);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE3, "J", "P", 'J', tonius.simplyjetpacks.setup.ModItems.jetpackTE3, 'P', new ItemStack(tonius.simplyjetpacks.setup.ModItems.particleCustomizers, 1, 32767));
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE4,  "LCL", "LSL", "T T", 'L', TFItems.ingotEnderium, 'C', cofh.thermalexpansion.item.TEItems.capacitorResonant, 'S', tonius.simplyjetpacks.setup.ModItems.jetpackTE3, 'T', tonius.simplyjetpacks.setup.ModItems.thrusterTE4);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE4, "J", "P", 'J', tonius.simplyjetpacks.setup.ModItems.jetpackTE4, 'P', new ItemStack(tonius.simplyjetpacks.setup.ModItems.particleCustomizers, 1, 32767));
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE1Armored,  "P", "J", 'J', tonius.simplyjetpacks.setup.ModItems.jetpackTE1, 'P', tonius.simplyjetpacks.setup.ModItems.armorPlatingTE1);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE2Armored,  "P", "J", 'J', tonius.simplyjetpacks.setup.ModItems.jetpackTE2, 'P', tonius.simplyjetpacks.setup.ModItems.armorPlatingTE2);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE3Armored,  "P", "J", 'J', tonius.simplyjetpacks.setup.ModItems.jetpackTE3, 'P', tonius.simplyjetpacks.setup.ModItems.armorPlatingTE3);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE4Armored,  "P", "J", 'J', tonius.simplyjetpacks.setup.ModItems.jetpackTE4, 'P', tonius.simplyjetpacks.setup.ModItems.armorPlatingTE4);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.thrusterTE1, "ICI", "PGP", "DSD", 'I', TFCItems.leadIngot, 'P', "packGlass", 'C', TEItems.powerCoilGold, 'G', BuildCraftCore.goldGearItem, 'D', TEItems.dynamoSteam, 'S',WurmTweaksItems.itemJetpackParts);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.thrusterTE2,  "ICI", "PGP", "DSD", 'I', TFCItems.nickelIngot, 'P', tonius.simplyjetpacks.setup.ModItems.thrusterTE1, 'C', TEItems.powerCoilGold, 'G', BuildCraftCore.goldGearItem, 'D', TEItems.dynamoReactant, 'S', WurmTweaksItems.itemJetpackParts);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.thrusterTE3,  "ICI", "PGP", "DSD", 'I', TFCItems.roseGoldIngot, 'P', tonius.simplyjetpacks.setup.ModItems.thrusterTE2, 'C', TEItems.powerCoilGold, 'G', BuildCraftCore.goldGearItem, 'D', TEItems.dynamoMagmatic, 'S', WurmTweaksItems.itemJetpackParts);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.thrusterTE4,  "ICI", "PGP", "DSD", 'I', TFItems.ingotEnderium, 'P', tonius.simplyjetpacks.setup.ModItems.thrusterTE3, 'C', TEItems.powerCoilGold, 'G', BuildCraftCore.goldGearItem, 'D', TEItems.dynamoEnervation, 'S', WurmTweaksItems.itemJetpackParts);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.thrusterTE5,  "ICI", "PGP", "DSD", 'I', TFItems.ingotEnderium, 'P', tonius.simplyjetpacks.setup.ModItems.thrusterTE4, 'C', TEItems.powerCoilGold, 'G', BuildCraftCore.goldGearItem, 'D', TEItems.dynamoEnervation, 'S', WurmTweaksItems.itemJetpackParts);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.jetpackTE5,  "LCL", "LSL", "T T", 'L', TFItems.ingotEnderium, 'C', cofh.thermalexpansion.item.TEItems.capacitorResonant, 'S', tonius.simplyjetpacks.setup.ModItems.jetpackTE4, 'T', tonius.simplyjetpacks.setup.ModItems.thrusterTE5);
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.leatherStrap,  "LIL", "LIL", 'I', new ItemStack(TFCItems.steelIngot), 'L', new ItemStack(TFCItems.leather));
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.armorPlatingTE1,  "TIT", "III", "TIT", 'T', new ItemStack(TFCItems.tinSheet2x), 'I', new ItemStack(TFCItems.wroughtIronIngot));
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.particleDefault,  " G ", "GCG", " G ", 'G', new ItemStack(TFCBlocks.torch), 'C', "dustcoal");
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.particleNone,  " G ", "GCG", " G ", 'G', "packGlass", 'C', "dustcoal");
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.particleRainbowSmoke,  "R L", " C ", " G ", 'G', "dyeRed", 'R', "dyeBlack", 'L', "dyeGreen", 'C', "dustcoal");
				r.addShaped(tonius.simplyjetpacks.setup.ModItems.particleSmoke,  " G ", "GCG", " G ", 'G', "dustcoal", 'C', "dustcoal");
				r.addShaped9X9Recipe(ModItems.jetpackCreative, "  G   G  ", " DBISIBD ", " LXPPPXL ", "  FFGFF  ", "  FDJDF  ", "  FFGFF  ", "ABNPPPNBA", " CKCZCJC ", " H  U  H ", 'G', WurmTweaksBlocks.blockPlatinum, 'D', "packGemBlock", 'B', WurmTweaksBlocks.blockGold, 'S', new ItemStack(SEGameObjects.SolarPanelUltimate), 'I', WurmTweaksItems.gearMixedSheet, 'L', WurmTweaksItems.itemAntiMatter, 'X', tonius.simplyjetpacks.setup.ModItems.jetpackTE4Armored, 'P', IC2Items.getItem("iridiumPlate"), 'F', WurmTweaksItems.ingotRainbowSteel, 'G', "packGlass", 'A', WurmTweaksItems.itemMixedSheet, 'B', WurmTweaksBlocks.blockCompressedRedstone, 'N', GraviSuite.gravitationEngine, 'C', new ItemStack(GraviSuite.advJetpack, 1, OreDictionary.WILDCARD_VALUE), 'K', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 3), 'C', WurmTweaksItems.ingotGreenSteel, 'Z', WurmTweaksItems.itemBloodInfused, 'H', WurmTweaksItems.creativeCreativePartsEnergy, 'U', WurmTweaksItems.creativeCreativeParts);

		}
}

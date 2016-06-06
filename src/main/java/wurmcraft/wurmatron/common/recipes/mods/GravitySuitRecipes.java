package wurmcraft.wurmatron.common.recipes.mods;

import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import gravisuite.GraviSuite;
import ic2.api.item.IC2Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class GravitySuitRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "GraviSuite")
		public static void addRecipes () {
				// TODO Gravity Chestplate
				r.addShaped(new ItemStack(GraviSuite.advNanoChestPlate, 1, 27), "CQC", "CJC", "SSS", 'C', IC2Items.getItem("carbonPlate"), 'Q', new ItemStack(IC2Items.getItem("nanoBodyarmor").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'J', new ItemStack(GraviSuite.advJetpack, 1, OreDictionary.WILDCARD_VALUE), 'S', WurmTweaksItems.itemCraftingCore);
				r.addShaped(new ItemStack(GraviSuite.ultimateLappack, 1, 27), "BSB", "BIB", "BSB", 'B', IC2Items.getItem("mfsUnit"), 'S', ExtraUtils.bedrockium, 'I', GraviSuite.superConductor);
				r.addShaped(new ItemStack(GraviSuite.advJetpack, 1, 27), "CBC", "SJS", "EQE", 'C', IC2Items.getItem("carbonPlate"), 'B', IC2Items.getItem("mfsUnit"), 'S', WurmTweaksItems.itemJetpackParts, 'E', IC2Items.getItem("advancedCircuit"), 'J', new ItemStack(IC2Items.getItem("electricJetpack").getItem(), 1, OreDictionary.WILDCARD_VALUE), 'Q', ExtraUtils.unstableIngot);
				r.addShaped(new ItemStack(GraviSuite.vajra, 1, 27), "GQG", "XCX", "SQS", 'X', ic2.api.item.IC2Items.getItem("carbonPlate"), 'C', GraviSuite.vajraCore, 'G', "packGemBlock", 'S', WurmTweaksItems.itemAntiMatter, 'Q', WurmTweaksBlocks.blockCompressedRedstone);
				r.addShaped(new ItemStack(GraviSuite.superConductorCover.getItem(), 3, 0), "CIC", "XXX", "CIC", 'X', IC2Items.getItem("carbonPlate"), 'C', "packGemBlock", 'I', IC2Items.getItem("iridiumPlate"));
				r.addShaped(new ItemStack(GraviSuite.superConductor.getItem(), 3, 1), "XXX", "III", "XXX", 'X', GraviSuite.superConductorCover, 'I', IC2Items.getItem("iridiumPlate"));
				r.addShaped(GraviSuite.gravitationEngine, new Object[] {"GIG", "BTB", "GIG", 'G', ExtraUtils.bedrockium, 'I', ExtraUtils.unstableIngot, 'B', WurmTweaksItems.ingotTitanium, 'T', WurmTweaksBlocks.blockPlatinum});
				r.addShaped(new ItemStack(GraviSuite.vajraCore.getItem(), 1, 5), "PQP", "TXT", "PQP", 'P', WurmTweaksItems.gearMixedSheet, 'Q', WurmTweaksItems.itemQuantumSingularity, 'T', WurmTweaksBlocks.blockCompressedRedstone, 'X', WurmTweaksItems.ingotTitanium);
		}
}

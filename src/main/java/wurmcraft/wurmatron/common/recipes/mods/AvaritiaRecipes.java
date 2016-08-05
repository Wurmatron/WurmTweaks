package wurmcraft.wurmatron.common.recipes.mods;

import appeng.core.Api;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import extracells.registries.ItemEnum;
import fox.spiteful.avaritia.blocks.LudicrousBlocks;
import fox.spiteful.avaritia.items.LudicrousItems;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.handler.ArmorHandler;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.ic2.ICHelper;

/**
 * Recipes Verified by Wurmatron
 * on 6/9/2016 with 1.11
 */
public class AvaritiaRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "Avaritia")
		public static void addRecipes () {
				LogHandler.info("Adding Avaritia Recipes");
				r.addCrossWCenter(LudicrousBlocks.double_craft, WurmTweaksItems.ingotCyanSteel, "packCraftingTable", WurmTweaksItems.ingotRainbowSteel);
				r.addCircleWCenter(LudicrousBlocks.triple_craft, LudicrousBlocks.double_craft, WurmTweaksItems.itemMixedSheet);
				r.addCrossWCenter(LudicrousBlocks.dire_crafting, WurmTweaksItems.itemAutoCore, new ItemStack(LudicrousItems.resource, 1, 1), LudicrousBlocks.triple_craft);
				r.addCircleWCenter(new ItemStack(LudicrousItems.resource, 1, 1), "packGemExquisite", WurmTweaksItems.ingotRainbowSteel);
				r.addShaped9X9Recipe(new ItemStack(LudicrousItems.resource, 1, 4), "CBKBXBKBC", "KAIIFIIAK", "BQGGGGGQB", "KQGNMNGQK", "BQGNLNGQB", "KQGNMNGQK", "BQGGGGGQB", "KAIIFIIAK", "CBBBXBBBC", 'C', "packGemBlock", 'B', WurmTweaksBlocks.blockBlueSteel, 'K', WurmTweaksBlocks.blockRedSteel, 'A', WurmTweaksItems.itemAntiMatter, 'I', WurmTweaksItems.itemComputationalCore, 'F', WurmTweaksBlocks.blockCompressedRedstone, 'Q', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 3), 'N', Api.INSTANCE.blocks().blockController.stack(1), 'M', WurmTweaksItems.ingotRainbowSteel, 'L', new ItemStack(GameRegistry.findItem("ThaumicTinkerer", "kamiResource"), 1, 1), 'X', WurmTweaksItems.gearMixedSheet, 'G', WurmTweaksItems.itemElectroMagneticShielding);
				r.addCrossWCenter(new ItemStack(LudicrousItems.resource, 1, 6), new ItemStack(LudicrousItems.resource, 1, 4), WurmTweaksItems.ingotRainbowSteel, "packGemBlock");
				r.addCrossWCenter(new ItemStack(LudicrousItems.resource, 1, 5), new ItemStack(LudicrousItems.resource, 1, 1), new ItemStack(LudicrousItems.resource, 1, 6), "packGemBlock");
				r.addShaped9X9Recipe(new ItemStack(LudicrousItems.matter_cluster, 1, 0), "  XXXXX  ", " XIIIIIX ", "XIBBBBBIX", "XIBBBBBIX", "XIBBBBBIX", "XIBBBBBIX", "XIBBBBBIX", " XIIIIIX ", "  XXXXX  ", 'X', TFCItems.blackSteelIngot, 'I', Api.INSTANCE.materials().materialMatterBall.stack(1), 'B', WurmTweaksItems.itemMixedSheet);
				r.addShaped9X9Recipe(new ItemStack(LudicrousItems.infinity_helm, 1, 0), " IIIIIII ", "IXXXXXXXI", "IXAA AAXI", "IXAA AAXI", "IX     XI", "IX JLJ XI", "IXXXXXXXI", 'I', new ItemStack(LudicrousItems.resource, 1, 6), 'X', new ItemStack(LudicrousItems.matter_cluster, 1, 0), 'A', "packGemBlock", 'J', new ItemStack(LudicrousItems.resource, 1, 5), 'L', WurmTweaksItems.itemAntiMatter);
				r.addShaped9X9Recipe(new ItemStack(LudicrousItems.infinity_armor, 1, 0), " II   II ", "III   III", "IIIIIIIII", " IXXXXXI ", " IXAAAXI ", " IXAAAXI ", " IXAAAXI ", "  IIIII  ", 'I', new ItemStack(LudicrousItems.resource, 1, 4), 'X', new ItemStack(LudicrousItems.resource, 1, 6), 'A', new ItemStack(LudicrousItems.matter_cluster, 1, 0));
				r.addShaped9X9Recipe(new ItemStack(LudicrousItems.infinity_pants, 1, 0), "IIIIIIIII", "IXXXBXXXI", "IXIBBBIXI", "IXIIIIIXI", "IXI   IXI", "IXI   IXI", "IXI   IXI", "IXI   IXI", "III   III", 'I', new ItemStack(LudicrousItems.resource, 1, 4), 'X', new ItemStack(LudicrousItems.resource, 1, 6), 'B', new ItemStack(LudicrousItems.resource, 1, 5));
				r.addShaped9X9Recipe(new ItemStack(LudicrousItems.infinity_shoes, 1, 0), " III III ", " IXI IXI ", " IXI IXI ", " IXI IXI ", "IIXI IXII", "IXXI IXXI", "IIII IIII", 'I', new ItemStack(LudicrousItems.resource, 1, 4), 'X', new ItemStack(LudicrousItems.resource, 1, 6));
				r.addShaped9X9Recipe(new ItemStack(LudicrousItems.infinity_axe, 1, 0), "IIIIII   ", "IXXXXI   ", "IXIIII   ", "IXILLL   ", "IXILLL   ", "IIILLL   ", "   LLL   ", "   LLL   ", "   LLL   ", 'L', "packLog", 'I', new ItemStack(LudicrousItems.resource, 1, 4), 'X', new ItemStack(LudicrousItems.resource, 1, 6));
				r.addShaped9X9Recipe(new ItemStack(LudicrousItems.infinity_axe, 1, 0), "   III   ", "   IXI   ", "   IXI   ", "   LLL   ", "   LLL   ", "   LLL   ", "   LLL   ", "   LLL   ", "   LLL   ", 'L', "packLog", 'I', new ItemStack(LudicrousItems.resource, 1, 4), 'X', new ItemStack(LudicrousItems.resource, 1, 6));
				r.addShaped9X9Recipe(new ItemStack(LudicrousItems.infinity_pickaxe, 1, 0), "IIIIIIIII", "IXXXXXXXI", "IIIIIIIII", "   LLL   ", "   LLL   ", "   LLL   ", "   LLL   ", "   LLL   ", "   LLL   ", 'L', "packLog", 'I', new ItemStack(LudicrousItems.resource, 1, 4), 'X', new ItemStack(LudicrousItems.resource, 1, 6));
				r.addShapeless(new ItemStack(LudicrousItems.resource, 32, 4), new ItemStack(LudicrousBlocks.resource_block, 1, 0));
				r.addShapeless(new ItemStack(LudicrousItems.resource, 32, 6), new ItemStack(LudicrousBlocks.resource_block, 1, 1));
				if (RecipeChecker.modExists("IC2"))
						addCompressorRecipes();
				ArmorHandler.addArmorProtection(LudicrousItems.infinity_helm,9000,9000,9000);
				ArmorHandler.addArmorProtection(LudicrousItems.infinity_pants,9000,9000,9000);
				ArmorHandler.addArmorProtection(LudicrousItems.infinity_armor,9000,9000,9000);
				ArmorHandler.addArmorProtection(LudicrousItems.infinity_shoes,9000,9000,9000);
		}

		@Optional.Method (modid = "IC2")
		private static void addCompressorRecipes () {
				ICHelper.addCompressorRecipe(new ItemStack(LudicrousItems.resource, 32, 4), new ItemStack(LudicrousBlocks.resource_block, 1, 0));
				ICHelper.addCompressorRecipe(new ItemStack(LudicrousItems.resource, 32, 6), new ItemStack(LudicrousBlocks.resource_block, 1, 1));
		}
}

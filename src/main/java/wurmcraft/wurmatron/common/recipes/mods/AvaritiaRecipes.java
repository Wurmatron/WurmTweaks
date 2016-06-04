package wurmcraft.wurmatron.common.recipes.mods;

import cpw.mods.fml.common.Optional;
import fox.spiteful.avaritia.blocks.LudicrousBlocks;
import fox.spiteful.avaritia.items.LudicrousItems;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class AvaritiaRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "Avaritia")
		public static void addRecipes () {
				LogHandler.info("Adding Avaritia Recipes");
				r.addCrossWCenter(LudicrousBlocks.double_craft, WurmTweaksItems.ingotCyanSteel, "packCraftingTable", WurmTweaksItems.ingotRainbowSteel);
				r.addCircleWCenter(LudicrousBlocks.triple_craft, LudicrousBlocks.double_craft, WurmTweaksItems.itemMixedSheet);
				r.addCrossWCenter(LudicrousBlocks.dire_crafting, WurmTweaksItems.itemAutoCore, new ItemStack(LudicrousItems.resource, 1, 1), LudicrousBlocks.triple_craft);
				r.addCircleWCenter(new ItemStack(LudicrousItems.resource, 1, 1), "packGemExquisite", WurmTweaksItems.ingotRainbowSteel);
				// TODO new ItemStack(LudicrousItems.resource,1,4) recipe "Neutronium Ingot"
				r.addCrossWCenter(new ItemStack(LudicrousItems.resource, 1, 6), new ItemStack(LudicrousItems.resource, 1, 1), WurmTweaksItems.ingotRainbowSteel, "packGemBlock");
				r.addCrossWCenter(new ItemStack(LudicrousItems.resource, 1, 5), new ItemStack(LudicrousItems.resource, 1, 1), new ItemStack(LudicrousItems.resource, 1, 6), "packGemBlock");
				//  TODO recipe "Matter Cluster"
				r.add3X(new ItemStack(LudicrousBlocks.resource_block, 1, 0), new ItemStack(LudicrousItems.resource, 1, 1));
				r.add3X(new ItemStack(LudicrousBlocks.resource_block, 1, 1), new ItemStack(LudicrousItems.resource, 1, 6));
				// TODO Infinity Armor recipe
		}
}

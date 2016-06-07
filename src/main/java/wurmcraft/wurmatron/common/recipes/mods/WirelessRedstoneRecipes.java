package wurmcraft.wurmatron.common.recipes.mods;

import codechicken.wirelessredstone.addons.WirelessRedstoneAddons;
import codechicken.wirelessredstone.logic.WirelessRedstoneLogic;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class WirelessRedstoneRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid="WR-CBE|Core")
		public static void addRecipes() {
				LogHandler.info("Adding Wireless Redstone Recipes");
				r.addShapeless(WirelessRedstoneAddons.remote, Blocks.stone_button, WurmTweaksItems.itemCraftingCore);
				r.addShaped(WirelessRedstoneAddons.sniffer, "ABA", "CCC", "CCC", "A", WurmTweaksItems.itemMixedSheet, "B", TFCItems.blueSteelSheet, "C", WurmTweaksBlocks.blockBlackSteel);
				r.addCircleWCenter(WirelessRedstoneAddons.wirelessMap, Items.paper, WurmTweaksItems.itemCraftingCore);
				r.addShapeless(WirelessRedstoneAddons.tracker, Items.blaze_powder, Items.ender_pearl, WurmTweaksItems.itemCraftingCore);
				r.addShapeless(WirelessRedstoneAddons.rep, Items.blaze_rod, Items.redstone, WurmTweaksItems.itemCraftingCore);
				r.addShaped(WirelessRedstoneAddons.psniffer, "ABA", "CCC", "CCC", "A", WurmTweaksItems.itemMixedSheet, "B", TFCItems.redSteelSheet, "C", WurmTweaksBlocks.blockBlackSteel);
				r.addShaped(WirelessRedstoneLogic.itemwireless, " A ", "BCB", "CCC", "A", WurmTweaksItems.itemMixedSheet, "B", TFCItems.redSteelSheet, "C", Blocks.obsidian);
				r.addShaped(new ItemStack(WirelessRedstoneLogic.itemwireless, 1, 1), " A ", "BCB", "CCC", "A", "packSmoothStone", "B", TFCItems.redSteelSheet, "C", Blocks.obsidian);
				r.addShaped(new ItemStack(WirelessRedstoneLogic.itemwireless, 1, 2), " A ", "BCB", "CCC", "A", Items.blaze_rod, "B", TFCItems.redSteelSheet, "C", Blocks.obsidian);
		}
}

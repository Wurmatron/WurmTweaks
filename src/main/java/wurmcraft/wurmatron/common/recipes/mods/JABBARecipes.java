package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import cpw.mods.ironchest.IronChest;
import mcp.mobius.betterbarrels.BetterBarrels;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class JABBARecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "JABBA")
		public static void addRecipes () {
				r.addShaped(new ItemStack(BetterBarrels.blockBarrel), "LPL", "LCL", "LLL", 'L', "packLog", 'P', "packPlanks", 'C', "packChest");
				r.addShaped(new ItemStack(BetterBarrels.itemUpgradeStructural, 1, 0), "FLF", "LCL", "FLF", 'F', new ItemStack(Blocks.fence), 'L', "packLog", 'C', "packPlanks");
				for (int i = 1; i < 6; i++)
						r.addShaped(new ItemStack(BetterBarrels.itemUpgradeStructural, 1, i), "FLF", "LCL", "FLF", 'F', new ItemStack(Blocks.fence), 'L', "packLog", 'C', new ItemStack(BetterBarrels.itemUpgradeStructural, 1, i - 1));
				r.addShaped(new ItemStack(BetterBarrels.itemUpgradeCore, 1, 0), "CPC", " B ", "CPC", 'B', new ItemStack(IronChest.ironChestBlock, 1, 0), 'C', "packChest", 'P', Blocks.piston);
				r.addShaped(new ItemStack(BetterBarrels.itemUpgradeCore, 1, 1), "CPC", " B ", "CPC", 'B', "packChest", 'C', "packChest", 'P', Blocks.piston);
				r.addShaped(new ItemStack(BetterBarrels.itemUpgradeCore, 1, 2), "CPC", " B ", "CPC", 'B', new ItemStack(Blocks.redstone_block), 'C', Blocks.piston, 'P', Blocks.piston);
				r.addShaped(new ItemStack(BetterBarrels.itemUpgradeCore, 1, 3), "CPC", " B ", "CPC", 'B', new ItemStack(Blocks.hopper), 'C', "packChest", 'P', Blocks.piston);
				r.addShaped(new ItemStack(BetterBarrels.itemUpgradeCore, 1, 7), "CPC", " B ", "CPC", 'B', new ItemStack(Blocks.obsidian), 'C', "packChest", 'P', Blocks.piston);
				r.addShaped(new ItemStack(BetterBarrels.itemUpgradeSide, 2, 0), " P ", "PBP", " P ", 'P', new ItemStack(Items.paper), 'B', new ItemStack(Items.slime_ball));
				r.addShaped(new ItemStack(BetterBarrels.itemUpgradeSide, 2, 1), " P ", "PBP", " P ", 'P', new ItemStack(Items.paper), 'B', new ItemStack(Blocks.hopper));
				r.addShaped(new ItemStack(BetterBarrels.itemUpgradeSide, 2, 2), " P ", "PBP", " P ", 'P', new ItemStack(Items.paper), 'B', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(BetterBarrels.itemHammer, 1, 0), "III", "ISI", " S ", 'S', "packStick", 'I', new ItemStack(TFCItems.wroughtIronIngot));
				r.addShaped(new ItemStack(BetterBarrels.itemHammer, 1, 1), "III", "ISI", " S ", 'S', "packStick", 'I', TFItems.ingotEnderium);
				r.addShaped(new ItemStack(BetterBarrels.itemTuningFork, 1, 0), " I ", " EI", " I ", 'E', new ItemStack(Items.ender_pearl), 'I', new ItemStack(TFCItems.steelIngot));
				r.addShaped(new ItemStack(BetterBarrels.itemMover, 1, 0), "  I", " PI", "III", 'P', "packPlanks", 'I', new ItemStack(TFCItems.steelIngot));
				r.addSimpleCirc(new ItemStack(BetterBarrels.itemMoverDiamond, 1, 0), new ItemStack(BetterBarrels.itemMover, 1, 0), "packGemExquisite");
				r.addShapeless(new ItemStack(BetterBarrels.itemUpgradeCore, 1, 4), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 0), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 0), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 0));
				r.addShapeless(new ItemStack(BetterBarrels.itemUpgradeCore, 1, 5), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 4), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 4), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 4));
				r.addShapeless(new ItemStack(BetterBarrels.itemUpgradeCore, 1, 6), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 5), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 5), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 5));
				r.addShapeless(new ItemStack(BetterBarrels.itemUpgradeCore, 1, 8), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 6), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 6), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 6));
				r.addShapeless(new ItemStack(BetterBarrels.itemUpgradeCore, 1, 9), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 8), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 8), new ItemStack(BetterBarrels.itemUpgradeCore, 1, 8));
		}
}

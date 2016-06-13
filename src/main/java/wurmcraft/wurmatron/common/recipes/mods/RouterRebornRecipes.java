package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermaldynamics.ThermalDynamics;
import cofh.thermaldynamics.duct.TDDucts;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import router.reborn.RouterReborn;
import wurmatron.voidrpg.items.TFCVoidRPGItems;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

public class RouterRebornRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				r.addShaped(new ItemStack(RouterReborn.Router), "XXX", "CVC", "XXX", 'X', TFCItems.blackSteelSheet2x, 'C', WurmTweaksItems.itemCraftingCore, 'V', "packChest");
				r.addShaped(new ItemStack(RouterReborn.RouterCable, 4), "SSS", "XCX", "SSS", 'S', "packSmoothStone", 'X', Items.redstone, 'C', WurmTweaksItems.itemMixedSheet);
				r.addCircleWCenter(new ItemStack(RouterReborn.chest), WurmTweaksItems.itemMixedSheet, "packChest");
				r.addShapeless(new ItemStack(RouterReborn.barrel), new ItemStack(RouterReborn.chest), WurmTweaksItems.itemMixedSheet);
				r.addShapeless(new ItemStack(RouterReborn.barrel, 1, 1), new ItemStack(RouterReborn.barrel), new ItemStack(RouterReborn.barrel));
				r.addShapeless(new ItemStack(RouterReborn.barrel, 1, 2), new ItemStack(RouterReborn.barrel, 1, 1), new ItemStack(RouterReborn.barrel, 1, 1));
				r.addShapeless(new ItemStack(RouterReborn.itmCF), WurmTweaksItems.itemMixedSheet, new ItemStack(RouterReborn.RouterCable));
				r.addShaped(new ItemStack(RouterReborn.itemToolWrench), "W W", "WWW", " W ", 'W', TFCItems.blackSteelSheet2x);
				r.addCrossWCenter(new ItemStack(RouterReborn.itmSPD), TFCHelper.getFood(TFCItems.sugar, 160f), new ItemStack(TFCItems.redSteelSheet2x), "packGlass");
				r.addCrossWCenter(new ItemStack(RouterReborn.itemChestUpgradeItemFilter), new ItemStack(ThermalDynamics.itemFilter, 1, 2), new ItemStack(TFCItems.redSteelSheet2x), "packGlass");
				r.addCrossWCenter(new ItemStack(RouterReborn.itemChestUpgradeAdvancedItemFilter), new ItemStack(ThermalDynamics.itemFilter, 1, 4), new ItemStack(TFCItems.redSteelSheet2x), "packGlass");
				r.addCrossWCenter(new ItemStack(RouterReborn.itemChestUpgradeEject), Blocks.piston, WurmTweaksItems.itemMixedSheet, "packGlass");
				r.addCrossWCenter(new ItemStack(RouterReborn.itemChestUpgradeExtract), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 1), WurmTweaksItems.itemMixedSheet, "packGlass");
				r.addShapeless(new ItemStack(RouterReborn.itemChestUpgradeAdvancedExtract), new ItemStack(RouterReborn.itemChestUpgradeExtract), WurmTweaksItems.itemCraftingCore);
				r.addShapeless(new ItemStack(RouterReborn.itemChestUpgradeAdvancedEject), new ItemStack(RouterReborn.itemChestUpgradeEject), WurmTweaksItems.itemCraftingCore);
				r.addCrossWCenter(new ItemStack(RouterReborn.itemChestUpgradePackager), new ItemStack(TFCItems.redSteelSheet), new ItemStack(Blocks.crafting_table), "packChest");
				r.addCrossWCenter(new ItemStack(RouterReborn.itemChestUpgradePackager), new ItemStack(TFCItems.redSteelSheet), new ItemStack(TFCBlocks.workbench), "packChest");
				r.addShapeless(new ItemStack(RouterReborn.itemChestUpgradePackagerAdvanced), new ItemStack(RouterReborn.itemChestUpgradePackager), WurmTweaksItems.itemCraftingCore);
				r.addCrossWCenter(new ItemStack(RouterReborn.itmBWT), new ItemStack(TFCVoidRPGItems.Eight_Hundred_CPU), new ItemStack(TFCItems.blueSteelSheet2x), WurmTweaksItems.itemCraftingCore);
				r.addCrossWCenter(new ItemStack(RouterReborn.itmEJ), Blocks.piston, "packChest", WurmTweaksItems.itemCraftingCore);
				r.addCrossWCenter(new ItemStack(RouterReborn.itmMCH), new ItemStack(ThermalDynamics.itemFilter, 1, 2), "dye", WurmTweaksItems.itemCraftingCore);
				r.addCrossWCenter(new ItemStack(RouterReborn.itmTH), WurmTweaksItems.itemCraftingCore, Blocks.piston, new ItemStack(TFCBlocks.workbench));
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import terramisc.core.ModItems;
import terramisc.core.ModRecipes;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.machines.MachineHelper;

public class TerraFirmaCraftMiscRecipes {

		private static RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				ModRecipes.initialise();
				MachineHelper.addFurnaceRecipes(new ItemStack(ModItems.itemHalberd_Mold, 1, 1), new ItemStack(ModItems.itemHalberd_Mold, 1, 0));
				MachineHelper.addFurnaceRecipes(new ItemStack(ModItems.itemWarHammer_Mold, 1, 1), new ItemStack(ModItems.itemWarHammer_Mold, 1, 0));
				MachineHelper.addFurnaceRecipes(new ItemStack(ModItems.itemPoniard_Mold, 1, 1), new ItemStack(ModItems.itemPoniard_Mold, 1, 0));
				MachineHelper.addFurnaceRecipes(new ItemStack(ModItems.itemArrow_Mold, 1, 1), new ItemStack(ModItems.itemArrow_Mold, 1, 0));
				MachineHelper.addFurnaceRecipes(new ItemStack(ModItems.itemBolt_Mold, 1, 1), new ItemStack(ModItems.itemBolt_Mold, 1, 0));
				r.addSimpleCirc(new ItemStack(ModItems.itemCircuit, 1, 0), TFCItems.roseGoldSheet, Items.redstone);
				OreDictionary.registerOre("dyeBrown", ModItems.itemBrownDye);
		}
}

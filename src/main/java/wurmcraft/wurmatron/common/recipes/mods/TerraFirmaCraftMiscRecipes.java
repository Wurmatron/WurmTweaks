package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import terramisc.core.TFCMItems;
import terramisc.core.TFCMRecipes;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.machines.MachineHelper;

public class TerraFirmaCraftMiscRecipes {

    private static RecipeHelper r = new RecipeHelper();

    public static void addRecipes() {
        TFCMRecipes.initialise();
        MachineHelper.addFurnaceRecipes(new ItemStack(TFCMItems.itemHalberd_Mold, 1, 1), new ItemStack(TFCMItems.itemHalberd_Mold, 1, 0));
        MachineHelper.addFurnaceRecipes(new ItemStack(TFCMItems.itemWarHammer_Mold, 1, 1), new ItemStack(TFCMItems.itemWarHammer_Mold, 1, 0));
        MachineHelper.addFurnaceRecipes(new ItemStack(TFCMItems.itemPoniard_Mold, 1, 1), new ItemStack(TFCMItems.itemPoniard_Mold, 1, 0));
        MachineHelper.addFurnaceRecipes(new ItemStack(TFCMItems.itemArrow_Mold, 1, 1), new ItemStack(TFCMItems.itemArrow_Mold, 1, 0));
        MachineHelper.addFurnaceRecipes(new ItemStack(TFCMItems.itemBolt_Mold, 1, 1), new ItemStack(TFCMItems.itemBolt_Mold, 1, 0));
        r.addSimpleCirc(new ItemStack(TFCMItems.itemCircuit, 1, 0), TFCItems.roseGoldSheet, Items.redstone);
        OreDictionary.registerOre("dyeBrown", TFCMItems.itemBrownDye);
    }
}

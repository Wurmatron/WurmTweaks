package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import com.whammich.sstow.guihandler.SFRecipeHandler;
import com.whammich.sstow.utils.Register;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

/**
 * Recipes Verified by Wurmatron
 * on 6/8/2016 with 1.6a
 */
public class SoulShardsRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "SSTOW")
		public static void addRecipes () {
				r.addShapeless(new ItemStack(Register.MATERIALS, 1, 3), Blocks.soul_sand, TFCItems.platinumIngot, Items.glowstone_dust, WurmTweaksItems.ingotRainbowSteel);
				r.addBasicMachineRecipe(new ItemStack(Register.MATERIALS, 1, 4), new ItemStack(Register.MATERIALS, 1, 3), TFCItems.blueSteelSheet, TFCItems.redSteelSheet, WurmTweaksItems.itemNatureCoreMK2);
				r.addBasicMachineRecipe(new ItemStack(Register.SOUL_FORGE, 1, 0), new ItemStack(Register.MATERIALS, 1, 4), WurmTweaksItems.ingotTitanium, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.itemSpaceModule);
				r.addCrossWCenter(new ItemStack(Register.SOUL_CAGE, 1, 0), WurmTweaksItems.ingotBrownSteel, WurmTweaksItems.gearMixedSheet, new ItemStack(Register.MATERIALS, 1, 4));
				for (ItemStack gem : OreDictionary.getOres("packGemExquisite"))
						SFRecipeHandler.smelting().addRecipe(gem, new ItemStack(Register.SOUL_SHARD), 5f);
		}
}

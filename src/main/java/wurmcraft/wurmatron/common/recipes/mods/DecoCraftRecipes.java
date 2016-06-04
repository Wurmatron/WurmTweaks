package wurmcraft.wurmatron.common.recipes.mods;


import com.bioxx.tfc.api.TFCItems;
import com.mia.props.Props;
import cpw.mods.fml.common.Optional;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class DecoCraftRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "props")
		public static void addRecipes () {
				LogHandler.info("Adding DecoCraft 2 Recipes");
				r.addShapeless(new ItemStack(Props.itemClay, 4, 0), "dyeRed", "packDirt", "packGravel");
				r.addShapeless(new ItemStack(Props.itemClay, 4, 1), "dyeBlue", "packDirt", "packGravel");
				r.addShapeless(new ItemStack(Props.itemClay, 4, 2), "dyeGreen", "packDirt", "packGravel");
				r.addBasicMachineRecipe(new ItemStack(Props.itemProps, 1, 508), TFCItems.steelSheet, new ItemStack(Props.itemClay, 1, OreDictionary.WILDCARD_VALUE), "packCraftingTable", WurmTweaksItems.ingotPinkSteel);
		}
}

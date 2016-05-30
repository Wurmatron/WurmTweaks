package wurmcraft.wurmatron.common.recipes.mods;


import com.bioxx.tfc.api.TFCItems;
import com.mia.props.Props;
import cpw.mods.fml.common.Optional;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.api.IModRecipes;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;

public class DecoCraftRecipes implements IModRecipes {

		@Optional.Method (modid = "props")
		@Override
		public void addRecipes () {
				r.addShapeless(new ItemStack(Props.itemClay, 4, 0), "dyeRed", "packDirt", "packGravel");
				r.addShapeless(new ItemStack(Props.itemClay, 4, 1), "dyeBlue", "packDirt", "packGravel");
				r.addShapeless(new ItemStack(Props.itemClay, 4, 2), "dyeGreen", "packDirt", "packGravel");
				r.addBasicMachineRecipe(new ItemStack(Props.itemProps, 1, 508), TFCItems.steelSheet, new ItemStack(Props.itemClay, 1, OreDictionary.WILDCARD_VALUE), "packCraftingTable", WurmTweaksItems.ingotPinkSteel);
		}
}

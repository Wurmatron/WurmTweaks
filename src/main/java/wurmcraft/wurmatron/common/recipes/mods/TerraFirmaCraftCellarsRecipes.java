package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import net.minecraft.item.ItemStack;
import sladki.tfc.ModManager;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class TerraFirmaCraftCellarsRecipes {
		private static RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				r.addShaped(new ItemStack(ModManager.CellarWallBlock, 2), new Object[] {"LTL", "C C", "LTL", 'L', "wurmlumber", 'T', new ItemStack(TFCItems.straw), 'C', TFCItems.clayBall});
				r.addShaped(new ItemStack(ModManager.CellarDoorItem), new Object[] {"L L", "C C", "L L", 'L', "wurmplanks", 'C', TFCItems.clayBall});
				r.addShaped(new ItemStack(ModManager.CellarShelfBlock), new Object[] {"LTL", "CTC", "LTL", 'L', "wurmplanks", 'T', new ItemStack(TFCItems.straw), 'C', TFCItems.clayBall});
				r.addShaped(new ItemStack(ModManager.IceBunkerBlock), new Object[] {"LCL", "C C", "LCL", 'L', "wurmplanks", 'C', "wurmlumber"});
				ModManager.registerRecipes();
		}
}

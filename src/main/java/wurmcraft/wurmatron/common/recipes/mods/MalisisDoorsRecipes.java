package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import net.malisis.doors.MalisisDoors;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class MalisisDoorsRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "malisisdoors")
		public static void addRecipes() {
				r.addCrossWCenter(GameRegistry.findItemStack("malisisdoors", "block_mixer", 1), new ItemStack(TFCItems.blackSteelSheet), new ItemStack(TFCItems.wroughtIronSheet), "packChest");
				r.addShapeless(new ItemStack(MalisisDoors.Blocks.playerSensor), new ItemStack(TFCItems.bismuthBronzeSheet), new ItemStack(TFCItems.steelIngot2x));
				r.addCrossWCenter(GameRegistry.findItemStack("malisisdoors", "door_factory", 1), new ItemStack(TFCItems.wroughtIronSheet), new ItemStack(TFCItems.steelIngot2x), "packChest");
		}
}

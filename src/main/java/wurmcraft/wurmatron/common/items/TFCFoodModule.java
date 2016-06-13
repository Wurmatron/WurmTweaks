package wurmcraft.wurmatron.common.items;

import com.bioxx.tfc.Core.Player.FoodStatsTFC;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.api.Enums.EnumFoodGroup;
import net.machinemuse.api.IModularItem;
import net.machinemuse.api.moduletrigger.IPlayerTickModule;
import net.machinemuse.api.moduletrigger.IToggleableModule;
import net.machinemuse.powersuits.powermodule.PowerModuleBase;
import net.machinemuse.utils.MuseCommonStrings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class TFCFoodModule extends PowerModuleBase implements IToggleableModule, IPlayerTickModule {

		public TFCFoodModule (List<IModularItem> validItems) {
				super(validItems);
				addInstallCost(WurmTweaksItems.ingotEnergyReactor);
				addInstallCost(WurmTweaksItems.ingotRainbowSteel);
		}

		@Override
		public void onPlayerTickActive (EntityPlayer player, ItemStack stack) {
				FoodStatsTFC stats = TFC_Core.getPlayerFoodStats(player);
				if (stats.needDrink())
						stats.restoreWater(player, (int) stats.getMaxWater(player) - (int) stats.waterLevel);
				if (stats.getMaxStomach(player) != stats.stomachLevel)
						stats.setFoodLevel(stats.getMaxStomach(player) - stats.stomachLevel);
				if (stats.nutrDairy == 0)
						stats.addNutrition(EnumFoodGroup.Dairy, 1);
				if (stats.nutrFruit == 0)
						stats.addNutrition(EnumFoodGroup.Fruit, 1);
				if (stats.nutrGrain == 0)
						stats.addNutrition(EnumFoodGroup.Grain, 1);
				if (stats.nutrProtein == 0)
						stats.addNutrition(EnumFoodGroup.Protein, 1);
				if (stats.nutrVeg == 0)
						stats.addNutrition(EnumFoodGroup.Vegetable, 1);
		}

		@Override
		public void onPlayerTickInactive (EntityPlayer player, ItemStack stack) {}

		@Override
		public String getTextureFile () {
				return "tfcfood";
		}

		@Override
		public String getCategory () {
				return MuseCommonStrings.CATEGORY_SPECIAL;
		}

		@Override
		public String getDataName () {
				return "TFCFood";
		}

		@Override
		public String getUnlocalizedName () {
				return "tfcfood";
		}

		@Override
		public String getDescription () {
				return "Keeps the players food and nutrition up!";
		}
}

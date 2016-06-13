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
				addInstallCost(WurmTweaksItems.stableMagicEssence);
		}

		@Override
		public void onPlayerTickActive (EntityPlayer player, ItemStack stack) {
				FoodStatsTFC stats = TFC_Core.getPlayerFoodStats(player);
				if (stats.needDrink())
						stats.restoreWater(player, (int) stats.getMaxWater(player) - (int) stats.waterLevel);
				if (stats.getMaxStomach(player) != stats.stomachLevel) {
						stats.setFoodLevel(stats.getMaxStomach(player));
						stats.stomachLevel = stats.getMaxStomach(player);
				}
				if (stats.nutrDairy < 1f)
						stats.addNutrition(EnumFoodGroup.Dairy, 1f);
				if (stats.nutrFruit < 1f)
						stats.addNutrition(EnumFoodGroup.Fruit, 1f);
				if (stats.nutrGrain < 1f)
						stats.addNutrition(EnumFoodGroup.Grain, 1f);
				if (stats.nutrProtein < 1f)
						stats.addNutrition(EnumFoodGroup.Protein, 1f);
				if (stats.nutrVeg < 1f)
						stats.addNutrition(EnumFoodGroup.Vegetable, 1f);
		}

		@Override
		public void onPlayerTickInactive (EntityPlayer player, ItemStack stack) {
		}

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

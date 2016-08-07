package wurmcraft.wurmatron.common.items;

import com.bioxx.tfc.Core.Player.FoodStatsTFC;
import com.bioxx.tfc.Core.TFC_Core;
import net.machinemuse.api.IModularItem;
import net.machinemuse.api.ModuleManager;
import net.machinemuse.api.moduletrigger.IPlayerTickModule;
import net.machinemuse.api.moduletrigger.IToggleableModule;
import net.machinemuse.powersuits.powermodule.PowerModuleBase;
import net.machinemuse.utils.ElectricItemUtils;
import net.machinemuse.utils.MuseCommonStrings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class TFCFoodModule extends PowerModuleBase implements IToggleableModule, IPlayerTickModule {

		public static final String POWER_USAGE = "Power Usage";

		public TFCFoodModule (List<IModularItem> validItems) {
				super(validItems);
				addInstallCost(WurmTweaksItems.ingotEnergyReactor);
				addInstallCost(WurmTweaksItems.ingotRainbowSteel);
				addInstallCost(WurmTweaksItems.stableMagicEssence);
				addTradeoffProperty("TFCFood", POWER_USAGE, 200, " Joules/Tick");

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
				if (stats.nutrGrain != 1)
						stats.nutrFruit = 1f;
				if (stats.nutrVeg != 1)
						stats.nutrVeg = 1f;
				if (stats.nutrProtein != 1)
						stats.nutrProtein = 1f;
				if (stats.nutrDairy != 1)
						stats.nutrDairy = 1f;
				if (stats.nutrGrain != 1)
						stats.nutrGrain = 1f;
				TFC_Core.setPlayerFoodStats(player, stats);
				ElectricItemUtils.drainPlayerEnergy(player, ModuleManager.computeModularProperty(stack, POWER_USAGE));
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

package wurmcraft.wurmatron.common.events;

import com.bioxx.tfc.Core.Player.FoodStatsTFC;
import com.bioxx.tfc.Core.TFC_Core;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.WTItems;
import wurmcraft.wurmatron.common.utils.LogHandler;

import java.util.HashMap;
import java.util.UUID;

public class ArmorTickEvent {

		public static HashMap<UUID, Boolean> flying = new HashMap<UUID, Boolean>();

		@SubscribeEvent
		public void onArmorTick (TickEvent.PlayerTickEvent e) {
				EntityPlayer player = e.player;
				if (player.inventory != null && player.inventory.armorInventory != null) {
						if (player.inventory.armorInventory[0] != null && player.inventory.armorInventory[1] != null && player.inventory.armorInventory[2] != null && player.inventory.armorInventory[3] != null) {
								ItemStack helmet = player.inventory.armorInventory[3];
								ItemStack chest = player.inventory.armorInventory[2];
								ItemStack leggings = player.inventory.armorInventory[1];
								ItemStack boots = player.inventory.armorInventory[0];
								if (helmet.getItem().equals(WTItems.helmetDarkMatter))
										LogHandler.info("Helmet Dark Steel Valid");
								LogHandler.info("Helmet = " + helmet.getItem().getUnlocalizedName());
								LogHandler.info("chest = " + chest.getItem().getUnlocalizedName());
								LogHandler.info("leggs = " + leggings.getItem().getUnlocalizedName());
								LogHandler.info("boots = " + boots.getItem().getUnlocalizedName());
								LogHandler.info("Item: " + WTItems.helmetDarkMatter.getUnlocalizedName());
								if (helmet.getItem().getUnlocalizedName().equalsIgnoreCase(WTItems.helmetDarkMatter.getUnlocalizedName()))
										LogHandler.info("Helmet Dark Steel ValidB");
								if (helmet.getItem().getUnlocalizedName().equals(WTItems.helmetDarkMatter.getUnlocalizedName()) && chest.getItem().getUnlocalizedName().equals(WTItems.chestDarkMatter.getUnlocalizedName()) && leggings.getItem().getUnlocalizedName().equals(WTItems.leggsDarkMatter.getUnlocalizedName()) && boots.getItem().getUnlocalizedName().equals(WTItems.bootsDarkMatter.getUnlocalizedName())) {
										LogHandler.info("Dark Matter");
										if (!flying.containsKey(player.getGameProfile().getId()))
												flying.put(player.getGameProfile().getId(), true);
										FoodStatsTFC stats = TFC_Core.getPlayerFoodStats(player);
										if (stats != null) {
												if (stats.needDrink())
														stats.restoreWater(player, stats.getMaxWater(player) - (int) stats.waterLevel);
												if (stats.needFood())
														stats.setFoodLevel(stats.getMaxStomach(player));
												if (stats.nutrGrain <= 5)
														stats.nutrGrain = 5;
												if (stats.nutrDairy <= 5)
														stats.nutrDairy = 5;
												if (stats.nutrVeg <= 5)
														stats.nutrVeg = 5;
												if (stats.nutrProtein <= 5)
														stats.nutrProtein = 5;
												if (stats.nutrFruit <= 5)
														stats.nutrFruit = 5;
												TFC_Core.setPlayerFoodStats(player, stats);
												player.capabilities.allowFlying = true;
										}
								} else {
										if (helmet == null || chest == null || leggings == null || boots == null) {
												if (flying.containsKey(player.getGameProfile().getId()))
														flying.remove(player.getGameProfile().getId());
										}
								}

								if (helmet.getItem().equals(WTItems.helmetRedMatter) && chest.getItem().equals(WTItems.chestRedMatter) && leggings.getItem().equals(WTItems.leggsRedMatter) && boots.getItem().equals(WTItems.bootsRedMatter)) {
										LogHandler.info("Red Matter");
										if (!flying.containsKey(player.getGameProfile().getId()))
												flying.put(player.getGameProfile().getId(), true);
										FoodStatsTFC stats = TFC_Core.getPlayerFoodStats(player);
										if (stats != null) {
												if (stats.needDrink())
														stats.restoreWater(player, stats.getMaxWater(player) - (int) stats.waterLevel);
												if (stats.needFood())
														stats.setFoodLevel(stats.getMaxStomach(player));
												if (stats.nutrGrain <= 20)
														stats.nutrGrain = 20;
												if (stats.nutrDairy <= 20)
														stats.nutrDairy = 20;
												if (stats.nutrVeg <= 20)
														stats.nutrVeg = 20;
												if (stats.nutrProtein <= 20)
														stats.nutrProtein = 20;
												if (stats.nutrFruit <= 20)
														stats.nutrFruit = 20;
												TFC_Core.setPlayerFoodStats(player, stats);
												player.capabilities.allowFlying = true;
										}
								} else {
										if (helmet == null || chest == null || leggings == null || boots == null) {
												if (flying.containsKey(player.getGameProfile().getId()))
														flying.remove(player.getGameProfile().getId());
												player.capabilities.allowFlying = false;
										}
								}
						}
				}
		}
}

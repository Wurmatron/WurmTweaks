package wurmcraft.wurmatron.common.utils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.ItemCredit;

public class CreditHelper {

		public static ItemStack getCreditsFromTypeAndUnits (Item item, int units) {
				return new ItemStack(item, 1, getMetaFromUnitAmount(getCorrectAmountForUnits(units)));
		}

		private static int getCorrectAmountForUnits (int units) {
				if (units % 60 == 0)
						return 60;
				if (units % 100 == 0)
						return 100;
				if (units % 140 == 0)
						return 140;
				if (units % 30 == 0)
						return 30;
				if (units % 50 == 0)
						return 50;
				if (units % 70 == 0)
						return 70;
				return 0;
		}

		private static int getMetaFromUnitAmount (int correctAmount) {
				for (int meta = 0; meta < ItemCredit.units.length - 1; meta++) {
						if (ItemCredit.units[meta] == correctAmount)
								return meta;
				}
				return -1;
		}
}

package wurmcraft.wurmatron.common.utils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.ItemCredit;

public class CreditHelper {

		public static ItemStack getCreditsFromTypeAndUnits (Item item, int units) {
				// TODO Fix it to actually do math not just guessing
				return new ItemStack(item, 1, getMetaFromUnitAmount(getCorrectAmountForUnits(units)));
		}

		private static String getCorrectAmountForUnits (int units) {
				if (units % 60 == 0)
						return "60";
				if (units % 100 == 0)
						return "100";
				if (units % 140 == 0)
						return "140";
				if (units % 30 == 0)
						return "30";
				if (units % 50 == 0)
						return "50";
				if (units % 70 == 0)
						return "70";
				return "null";
		}

		private static int getMetaFromUnitAmount (String correctAmount) {
				for (int meta = 0; meta < ItemCredit.units.length; meta++) {
						if (ItemCredit.units[meta] == Integer.getInteger(correctAmount))
								return meta;
				}
				return -1;
		}
}

package wurmcraft.wurmatron.common.handler;

import net.minecraft.item.Item;

import java.util.HashMap;

public class ArmorHandler {

		public static HashMap<Item, int[]> armor = new HashMap<Item, int[]>();

		public static void addArmorProtection (Item stack, int pierce, int slash, int crush) {
				armor.put(stack, new int[] {pierce, slash, crush});
		}

		public static int getArmorPierceProtection(Item item) {
				if(armor.containsKey(item)) {
						return armor.get(item)[0];
				}
				return 0;
		}

		public static int getArmorSlashProtection(Item item) {
				if(armor.containsKey(item)) {
						return armor.get(item)[1];
				}
				return 0;
		}

		public static int getArmorCrushProtection(Item item) {
				if(armor.containsKey(item)) {
						return armor.get(item)[2];
				}
				return 0;
		}
}

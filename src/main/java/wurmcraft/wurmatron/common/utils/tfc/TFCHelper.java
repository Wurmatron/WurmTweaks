package wurmcraft.wurmatron.common.utils.tfc;

import cpw.mods.fml.common.Optional;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class TFCHelper {

		@Optional.Method (modid = "terrafirmacraft")
		public static ItemStack getFood (Item item, float size) {
				ItemStack food = new ItemStack(item, 1, 0);
				food.stackTagCompound = new NBTTagCompound();
				food.stackTagCompound.setFloat("foodDecay", 0f);
				food.stackTagCompound.setFloat("foodWeight", size);
				return food;
		}
}

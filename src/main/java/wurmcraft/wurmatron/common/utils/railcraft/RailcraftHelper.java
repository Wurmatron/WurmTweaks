package wurmcraft.wurmatron.common.utils.railcraft;

import mods.railcraft.common.blocks.RailcraftBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class RailcraftHelper {

		public static ItemStack getTrack (int size, String name, int meta) {
				ItemStack track = new ItemStack(RailcraftBlocks.getBlockTrack(), size, meta);
				NBTTagCompound nbt = new NBTTagCompound();
				nbt.setString("track", name);
				track.setTagCompound(nbt);
				return track;
		}
}

package wurmcraft.wurmatron.common.utils.mfr;

import com.bioxx.tfc.Blocks.Vanilla.BlockCustomLeaves;
import com.bioxx.tfc.api.TFCItems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import powercrystals.minefactoryreloaded.farmables.harvestables.HarvestableTreeLeaves;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class HarvestLeaves extends HarvestableTreeLeaves {

		public HarvestLeaves (Block block) {
				super(block);
		}

		@Override
		public List<ItemStack> getDrops (World world, Random rand, Map<String, Boolean> harvesterSettings, int x, int y, int z) {
				Block block = world.getBlock(x, y, z);
				List<ItemStack> def = world.getBlock(x, y, z).getDrops(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
				int num = rand.nextInt(5);
				if (num == 1) {
						if (block instanceof BlockCustomLeaves) {
								def.add(new ItemStack(TFCItems.stick));
						}
						return def;
				}
				return null;
		}
}

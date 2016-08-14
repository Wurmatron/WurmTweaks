package wurmcraft.wurmatron.common.events;

import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.api.TFCBlocks;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

import java.util.Random;

public class FortuneEvent {

		@SubscribeEvent
		public void onDrops (BlockEvent.HarvestDropsEvent e) {
				if (e.block == TFCBlocks.stoneIgEx || e.block == TFCBlocks.stoneIgIn || e.block == TFCBlocks.stoneMM || e.block == TFCBlocks.stoneSed) {
						ItemStack gem = TFC_Core.randomGem(new Random(), 2 * e.fortuneLevel);
						if (gem != null)
								e.drops.add(gem);
				}
		}
}

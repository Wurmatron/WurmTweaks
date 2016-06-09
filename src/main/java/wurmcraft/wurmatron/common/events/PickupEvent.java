package wurmcraft.wurmatron.common.events;

import com.bioxx.tfc.api.TFCBlocks;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

public class PickupEvent {

		@SubscribeEvent
		public void onItemPickup(EntityItemPickupEvent e) {
				if(e.item.getEntityItem().getItem().equals(Item.getItemFromBlock(Blocks.chest))) {
						e.item.delayBeforeCanPickup = 80;
						e.item.setDead();
						e.entityPlayer.worldObj.playSoundAtEntity(e.entityPlayer, "random.pop", 0.2F, 3f);
						e.entityPlayer.inventory.addItemStackToInventory(new ItemStack(TFCBlocks.chest, 1, 0));
				}
		}
}

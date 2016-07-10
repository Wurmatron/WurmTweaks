package wurmcraft.wurmatron.common.events;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

public class PickupEvent {

		@SubscribeEvent
		public void onItemPickup (EntityItemPickupEvent e) {
				if (e.item.getEntityItem().getItem().equals(Item.getItemFromBlock(Blocks.chest))) {
						e.item.delayBeforeCanPickup = 1;
						e.item.setDead();
						e.entityPlayer.worldObj.playSoundAtEntity(e.entityPlayer, "random.pop", 0.2F, 3f);
						e.entityPlayer.inventory.addItemStackToInventory(new ItemStack(TFCBlocks.chest, 1, 0));
				}
				if (e.item.getEntityItem().getItem().equals(Item.getItemFromBlock(Blocks.iron_ore))) {
						e.item.delayBeforeCanPickup = 1;
						e.item.setDead();
						e.entityPlayer.worldObj.playSoundAtEntity(e.entityPlayer, "random.pop", 0.2F, 3f);
						e.entityPlayer.inventory.addItemStackToInventory(new ItemStack(TFCItems.oreChunk, 4, 3));
				}
				if (e.item.getEntityItem().getItem().equals(Item.getItemFromBlock(Blocks.gold_ore))) {
						e.item.delayBeforeCanPickup = 1;
						e.item.setDead();
						e.entityPlayer.worldObj.playSoundAtEntity(e.entityPlayer, "random.pop", 0.2F, 3f);
						e.entityPlayer.inventory.addItemStackToInventory(new ItemStack(TFCItems.oreChunk, 4, 1));
				}
				if (e.item.getEntityItem().getItem().equals(Item.getItemFromBlock(Blocks.redstone_ore))) {
						e.item.delayBeforeCanPickup = 1;
						e.item.setDead();
						e.entityPlayer.worldObj.playSoundAtEntity(e.entityPlayer, "random.pop", 0.2F, 3f);
						e.entityPlayer.inventory.addItemStackToInventory(new ItemStack(TFCItems.oreChunk, 12, 27));
				}
				if (e.item.getEntityItem().getItem().equals(Item.getItemFromBlock(Blocks.lapis_ore))) {
						e.item.delayBeforeCanPickup = 1;
						e.item.setDead();
						e.entityPlayer.worldObj.playSoundAtEntity(e.entityPlayer, "random.pop", 0.2F, 3f);
						e.entityPlayer.inventory.addItemStackToInventory(new ItemStack(TFCItems.oreChunk, 12, 34));
				}
				if (e.item.getEntityItem().getItem().equals(Item.getItemFromBlock(Blocks.diamond_ore))) {
						e.item.delayBeforeCanPickup = 1;
						e.item.setDead();
						e.entityPlayer.worldObj.playSoundAtEntity(e.entityPlayer, "random.pop", 0.2F, 3f);
						e.entityPlayer.inventory.addItemStackToInventory(new ItemStack(TFCItems.gemDiamond, 2, 2));
				}
		}
}

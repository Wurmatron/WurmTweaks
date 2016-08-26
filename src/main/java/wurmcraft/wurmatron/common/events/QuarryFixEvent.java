package wurmcraft.wurmatron.common.events;

import com.bioxx.tfc.Entities.EntityFallingBlockTFC;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraftforge.event.entity.living.LivingEvent;

public class QuarryFixEvent {

		@SubscribeEvent
		public void onLivingUpdate (LivingEvent.LivingUpdateEvent e) {
				if (e.entity instanceof EntityFallingBlock)
						if (((EntityFallingBlockTFC) e.entity).aliveTimer >= 400)
								e.entity.setDead();
		}
}

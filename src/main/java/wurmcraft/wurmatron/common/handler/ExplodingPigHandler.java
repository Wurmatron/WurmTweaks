package wurmcraft.wurmatron.common.handler;

import com.bioxx.tfc.Entities.Mobs.EntityPigTFC;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import java.util.Random;

public class ExplodingPigHandler {

		private final Random rand = new Random();

		@SubscribeEvent
		public void pigHurtDeath (LivingDeathEvent e) {
				if (e.entity instanceof EntityPigTFC) {
						EntityPigTFC pig = (EntityPigTFC) e.entity;
						if (!pig.worldObj.isRemote)
								if (pig.getHealth() <= pig.getMaxHealth() / 2)
										if (rand.nextInt(50) == 0) {
												pig.worldObj.createExplosion(pig, pig.posX, pig.posY, pig.posZ, 20f, false);
												pig.setDead();
										}
				}
		}
}

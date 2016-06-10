package wurmcraft.wurmatron.common.events;

import com.bioxx.tfc.api.Enums.EnumDamageType;
import com.bioxx.tfc.api.Interfaces.ICausesDamage;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import wurmcraft.wurmatron.common.handler.ArmorHandler;

import java.util.Random;

public class HurtEvent {

		@SubscribeEvent
		public void hurtEvent (LivingHurtEvent e) {
				EntityLivingBase entity = e.entityLiving;
				if (!e.source.isUnblockable() || !entity.isEntityInvulnerable()) {
						ItemStack[] armor = getArmorFromEntity(entity);
						int location = new Random().nextInt(4);
						if (armor[location] != null && ArmorHandler.armor.containsKey(armor[location].getItem())) {
								int pierceRating = ArmorHandler.getArmorPierceProtection(armor[location].getItem());
								int slashRating = ArmorHandler.getArmorPierceProtection(armor[location].getItem());
								int crushRating = ArmorHandler.getArmorPierceProtection(armor[location].getItem());
								float piercePer = 1000f / (1000f + pierceRating);
								float slashPer = 1000f / (1000f + slashRating);
								float crushPer = 1000f / (1000f + crushRating);

								e.ammount = processDamageSource(e.source, e.ammount, piercePer, slashPer, crushPer);
								if (location == 0 && armor[location] == null) {
										e.ammount *= 1.75;
								} else if (location == 3 && armor[location] == null) {
										entity.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 100, 1));
								}
						}
				}
		}

		/**
		 * From
		 *
		 * @see com.bioxx.tfc.Handlers.EntityDamageHandler
		 */
		private float processDamageSource (DamageSource source, float damage, float pierceMult, float slashMult, float crushMult) {
				EnumDamageType damageType = getDamageType(source);
				//4.2 Reduce the damage based upon the incoming Damage Type
				if (damageType == EnumDamageType.PIERCING) {
						damage *= pierceMult;
				} else if (damageType == EnumDamageType.SLASHING) {
						damage *= slashMult;
				} else if (damageType == EnumDamageType.CRUSHING) {
						damage *= crushMult;
				} else if (damageType == EnumDamageType.GENERIC) {
						damage *= (crushMult + slashMult + pierceMult) / 3 - 0.25;
				}
				return Math.max(0, damage);
		}

		/**
		 * From
		 *
		 * @see com.bioxx.tfc.Handlers.EntityDamageHandler
		 */
		private EnumDamageType getDamageType (DamageSource source) {

				if (source.getSourceOfDamage() instanceof EntityPlayer) {
						EntityPlayer player = (EntityPlayer) source.getSourceOfDamage();
						if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ICausesDamage) {
								return ((ICausesDamage) player.getCurrentEquippedItem().getItem()).getDamageType();
						}
				}

				if (source.getSourceOfDamage() instanceof EntityLiving) {
						EntityLiving el = (EntityLiving) source.getSourceOfDamage();
						if (el.getHeldItem() != null && el.getHeldItem().getItem() instanceof ICausesDamage) {
								return ((ICausesDamage) el.getHeldItem().getItem()).getDamageType();
						}
				}

				if (source.getSourceOfDamage() instanceof ICausesDamage) {
						return ((ICausesDamage) source.getSourceOfDamage()).getDamageType();
				}

				return EnumDamageType.GENERIC;
		}

		private ItemStack[] getArmorFromEntity (EntityLivingBase entity) {
				ItemStack[] armor = new ItemStack[4];
				armor[0] = entity.getEquipmentInSlot(1);
				armor[1] = entity.getEquipmentInSlot(2);
				armor[2] = entity.getEquipmentInSlot(3);
				armor[3] = entity.getEquipmentInSlot(4);
				return armor;
		}
}

package wurmcraft.wurmatron.common.utils.powerconverter;

import net.minecraft.block.Block;
import powercrystals.powerconverters.power.PowerSystemManager;
import powercrystals.powerconverters.power.systems.PowerIndustrialcraft;
import powercrystals.powerconverters.power.systems.PowerRedstoneFlux;

public class PowerConverterHelper {

		public static Block getPowerType (String type) {
				if (type == "rf")
						return PowerSystemManager.getInstance().getPowerSystemByName(PowerRedstoneFlux.id).block;
				if (type == "eu")
						return PowerSystemManager.getInstance().getPowerSystemByName(PowerIndustrialcraft.id).block;
				return null;
		}
}

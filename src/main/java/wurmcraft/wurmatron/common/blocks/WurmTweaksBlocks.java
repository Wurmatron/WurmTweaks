package wurmcraft.wurmatron.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class WurmTweaksBlocks {

		public static Block blockWroughtIron;
		public static Block blockPlatinum;
		public static Block blockGold;
		public static Block blockSterlingSilver;
		public static Block blockSilver;

		public static void registerBlocks () {
				blockWroughtIron = new BlockBasic("blockWroughtIron", Material.iron);
				blockPlatinum = new BlockBasic("blockPlatinum", Material.iron);
				blockGold = new BlockBasic("blockGold", Material.iron);
				blockSterlingSilver = new BlockBasic("blockSterlingSilver", Material.iron);
				blockSilver = new BlockBasic("blockSilver", Material.iron);
		}

		private static void registerBlock (Block block, String name) {
				GameRegistry.registerBlock(block, name);
		}
}

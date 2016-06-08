package wurmcraft.wurmatron.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


// Dark Matter
// Red Matter
public class WurmTweaksBlocks {

		// Metal Blocks
		public static Block blockCompressedRedstone;
		public static Block blockWroughtIron;
		public static Block blockPlatinum;
		public static Block blockGold;
		public static Block blockSterlingSilver;
		public static Block blockSilver;
		public static Block blockBlueSteel;
		public static Block blockBlackSteel;
		public static Block blockRedSteel;
		public static Block blockCopper;
		public static Block blockSteel;
		public static Block blockBronze;
		public static Block blockBismuth;
		public static Block blockBismuthBronze;
		public static Block blockBlackBronze;
		public static Block blockBrass;
		public static Block blockLead;
		public static Block blockNickel;
		public static Block blockPigIron;
		public static Block blockRoseGold;
		public static Block blockZinc;
		public static Block blockTin;
		public static Block blockUnkown;
		// Gem Blocks
		public static Block blockJasper;
		public static Block blockAmethyst;
		public static Block blockDiamond;
		public static Block blockRuby;
		public static Block blockSapphire;
		public static Block blockEmerald;
		public static Block blockTopaz;
		public static Block blockTourmaline;
		public static Block blockJade;
		public static Block blockAgate;
		public static Block blockOpal;
		public static Block blockGarnet;

		public static void registerBlocks () {
				blockWroughtIron = registerBlock(new BlockBasic("blockWroughtIron", Material.iron));
				blockPlatinum = registerBlock(new BlockBasic("blockPlatinum", Material.iron));
				blockGold = registerBlock(new BlockBasic("blockGold", Material.iron));
				blockSterlingSilver = registerBlock(new BlockBasic("blockSterlingSilver", Material.iron));
				blockSilver = registerBlock(new BlockBasic("blockSilver", Material.iron));
				blockCompressedRedstone = registerBlock(new BlockBasic("blockCompressedRedstone", Material.iron));
				blockBlueSteel = registerBlock(new BlockBasic("blockBlueSteel", Material.iron));
				blockBlackSteel = registerBlock(new BlockBasic("blockBlackSteel", Material.iron));
				blockRedSteel = registerBlock(new BlockBasic("blockRedSteel", Material.iron));
				blockCopper = registerBlock(new BlockBasic("blockCopper", Material.iron));
				blockSteel = registerBlock(new BlockBasic("blockSteel", Material.iron));
				blockBronze = registerBlock(new BlockBasic("blockBronze", Material.iron));
				blockBismuth = registerBlock(new BlockBasic("blockBismuth", Material.iron));
				blockBismuthBronze = registerBlock(new BlockBasic("blockBismuthBronze", Material.iron));
				blockBlackBronze = registerBlock(new BlockBasic("blockBlackBronze", Material.iron));
				blockBrass = registerBlock(new BlockBasic("blockBrass", Material.iron));
				blockLead = registerBlock(new BlockBasic("blockLead", Material.iron));
				blockNickel = registerBlock(new BlockBasic("blockNickel", Material.iron));
				blockPigIron = registerBlock(new BlockBasic("blockPigIron", Material.iron));
				blockRoseGold = registerBlock(new BlockBasic("blockRoseGold", Material.iron));
				blockZinc = registerBlock(new BlockBasic("blockZinc", Material.iron));
				blockTin = registerBlock(new BlockBasic("blockTin", Material.iron));
				blockUnkown = registerBlock(new BlockBasic("blockUnkown", Material.iron));
				// Gem Blocks
				blockJasper = registerBlock(new BlockBasic("blockJasper", Material.iron));
				blockAmethyst = registerBlock(new BlockBasic("blockAmethyst", Material.iron));
				blockDiamond = registerBlock(new BlockBasic("blockDiamond", Material.iron));
				blockRuby = registerBlock(new BlockBasic("blockRuby", Material.iron));
				blockSapphire = registerBlock(new BlockBasic("blockSapphire", Material.iron));
				blockEmerald = registerBlock(new BlockBasic("blockEmerald", Material.iron));
				blockTopaz = registerBlock(new BlockBasic("blockTopaz", Material.iron));
				blockTourmaline = registerBlock(new BlockBasic("blockTourmaline", Material.iron));
				blockJade = registerBlock(new BlockBasic("blockJade", Material.iron));
				blockAgate = registerBlock(new BlockBasic("blockAgate", Material.iron));
				blockOpal = registerBlock(new BlockBasic("blockOpal", Material.iron));
				blockGarnet = registerBlock(new BlockBasic("blockGarnet", Material.iron));
		}

		private static Block registerBlock (Block block) {
				GameRegistry.registerBlock(block, block.getUnlocalizedName());
				return block;
		}
}

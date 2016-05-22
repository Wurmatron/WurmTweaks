package wurmcraft.wurmatron.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import wurmcraft.wurmatron.common.reference.Global;

public class BlockBasic extends Block {

		public BlockBasic (String name, Material material) {
				super(material);
				setBlockName(name);
				setCreativeTab(CreativeTabs.tabBlock);
				setBlockTextureName(Global.MODID + ":" + name);
				setHardness(5);
				setResistance(50);
				setHarvestLevel("pickaxe",3);
		}
}

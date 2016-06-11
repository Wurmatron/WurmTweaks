package wurmcraft.wurmatron.common.fluid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import wurmcraft.wurmatron.common.reference.Global;

public class BasicFluid extends BlockFluidClassic {

		private IIcon stillIcon;
		private IIcon flowIcon;
		private Fluid fluid = null;

		public BasicFluid (Fluid fluid, Material material) {
				super(fluid, material);
				this.fluid = fluid;
		}

		@Override
		public void registerBlockIcons (IIconRegister register) {
				stillIcon = register.registerIcon(Global.MODID + ":" + getFluid().getBlock().getUnlocalizedName().substring(5, getFluid().getBlock().getUnlocalizedName().length()) + "_still");
				flowIcon = register.registerIcon(Global.MODID + ":" + getFluid().getBlock().getUnlocalizedName().substring(5, getFluid().getBlock().getUnlocalizedName().length()) + "_flow");
				getFluid().setIcons(stillIcon, flowIcon);
				if (getFluid().getBlock() != this && fluid != null)
						fluid.setIcons(stillIcon, flowIcon);
		}

		@Override
		@SideOnly (Side.CLIENT)
		public IIcon getIcon (int side, int meta) {
				if (side == 0 || side == 1)
						return stillIcon;
				return flowIcon;
		}
}

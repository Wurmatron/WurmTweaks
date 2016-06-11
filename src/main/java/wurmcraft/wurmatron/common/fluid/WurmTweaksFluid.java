package wurmcraft.wurmatron.common.fluid;

import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import tconstruct.library.crafting.FluidType;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.reference.Global;

public class WurmTweaksFluid {

		public static Fluid fluidWroughtIron;
		public static Fluid fluidPlatinum;
		public static Fluid fluidGold;
		public static Fluid fluidSterlingSilver;
		public static Fluid fluidSilver;
		public static Fluid fluidBlueSteel;
		public static Fluid fluidBlackSteel;
		public static Fluid fluidRedSteel;
		public static Fluid fluidCopper;
		public static Fluid fluidSteel;
		public static Fluid fluidBronze;
		public static Fluid fluidBismuth;
		public static Fluid fluidBismuthBronze;
		public static Fluid fluidBlackBronze;
		public static Fluid fluidBrass;
		public static Fluid fluidLead;
		public static Fluid fluidNickel;
		public static Fluid fluidPigIron;
		public static Fluid fluidRoseGold;
		public static Fluid fluidZinc;
		public static Fluid fluidTin;
		public static Fluid fluidUnknown;
		public static Block fluidBlockWroughtIron;
		public static Block fluidBlockPlatinum;
		public static Block fluidBlockGold;
		public static Block fluidBlockSterlingSilver;
		public static Block fluidBlockSilver;
		public static Block fluidBlockBlueSteel;
		public static Block fluidBlockBlackSteel;
		public static Block fluidBlockRedSteel;
		public static Block fluidBlockCopper;
		public static Block fluidBlockSteel;
		public static Block fluidBlockBronze;
		public static Block fluidBlockBismuth;
		public static Block fluidBlockBismuthBronze;
		public static Block fluidBlockBlackBronze;
		public static Block fluidBlockBrass;
		public static Block fluidBlockLead;
		public static Block fluidBlockNickel;
		public static Block fluidBlockPigIron;
		public static Block fluidBlockRoseGold;
		public static Block fluidBlockZinc;
		public static Block fluidBlockTin;
		public static Block fluidBlockUnknown;

		public static Fluid pureFluidWroughtIron;
		public static Fluid pureFluidPlatinum;
		public static Fluid pureFluidGold;
		public static Fluid pureFluidSilver;
		public static Fluid pureFluidCopper;
		public static Fluid pureFluidBismuth;
		public static Fluid pureFluidLead;
		public static Fluid pureFluidNickel;
		public static Fluid pureFluidZinc;
		public static Fluid pureFluidTin;
		public static Block pureFluidBlockWroughtIron;
		public static Block pureFluidBlockPlatinum;
		public static Block pureFluidBlockGold;
		public static Block pureFluidBlockSilver;
		public static Block pureFluidBlockCopper;
		public static Block pureFluidBlockBismuth;
		public static Block pureFluidBlockLead;
		public static Block pureFluidBlockNickel;
		public static Block pureFluidBlockZinc;
		public static Block pureFluidBlockTin;

		public static void registerFluids () {
				fluidBlockWroughtIron = registerFluid(fluidWroughtIron = new Fluid("packFluidIron"), "packIron", WurmTweaksBlocks.blockWroughtIron, 0, 900, true);
				fluidBlockPlatinum = registerFluid(fluidPlatinum = new Fluid("packFluidPlatinum"), "packPlatinum", WurmTweaksBlocks.blockPlatinum, 0, 1200, true);
				fluidBlockGold = registerFluid(fluidGold = new Fluid("packFluidGold"), "packGold", WurmTweaksBlocks.blockGold, 0, 800, false);
				fluidBlockSterlingSilver = registerFluid(fluidSterlingSilver = new Fluid("packFluidSterlingSilver"), "packSterlingSilver", WurmTweaksBlocks.blockSterlingSilver, 0, 700, false);
				fluidBlockSilver = registerFluid(fluidSilver = new Fluid("packFluidSilver"), "packSilver", WurmTweaksBlocks.blockSilver, 0, 750, false);
				fluidBlockBlueSteel = registerFluid(fluidBlueSteel = new Fluid("packFluidBlueSteel"), "packBlueSteel", WurmTweaksBlocks.blockBlueSteel, 0, 1200, true);
				fluidBlockBlackSteel = registerFluid(fluidBlackSteel = new Fluid("packFluidBlackSteel"), "packBlackSteel", WurmTweaksBlocks.blockBlackSteel, 0, 1000, true);
				fluidBlockRedSteel = registerFluid(fluidRedSteel = new Fluid("packFluidRedSteel"), "packRedSteel", WurmTweaksBlocks.blockRedSteel, 0, 1000, true);
				fluidBlockCopper = registerFluid(fluidCopper = new Fluid("packFluidCopper"), "packCopper", WurmTweaksBlocks.blockCopper, 0, 600, true);
				fluidBlockSteel = registerFluid(fluidSteel = new Fluid("packFluidSteel"), "packSteel", WurmTweaksBlocks.blockSteel, 0, 1100, true);
				fluidBlockBronze = registerFluid(fluidBronze = new Fluid("packFluidBronze"), "packBronze", WurmTweaksBlocks.blockBronze, 0, 800, true);
				fluidBlockBismuth = registerFluid(fluidBismuth = new Fluid("packFluidBismuth"), "packBismuth", WurmTweaksBlocks.blockBismuth, 0, 600, false);
				fluidBlockBlackBronze = registerFluid(fluidBlackBronze = new Fluid("packFluidBlackBronze"), "packBlackBronze", WurmTweaksBlocks.blockBlackBronze, 0, 900, true);
				fluidBlockBismuthBronze = registerFluid(fluidBismuthBronze = new Fluid("packFluidBismuthBronze"), "packBismuthBronze", WurmTweaksBlocks.blockBismuthBronze, 0, 800, true);
				fluidBlockBrass = registerFluid(fluidBrass = new Fluid("packFluidBrass"), "packBrass", WurmTweaksBlocks.blockBrass, 0, 600, false);
				fluidBlockLead = registerFluid(fluidLead = new Fluid("packFluidLead"), "packLead", WurmTweaksBlocks.blockLead, 0, 150, false);
				fluidBlockNickel = registerFluid(fluidNickel = new Fluid("packFluidNickel"), "packNickel", WurmTweaksBlocks.blockNickel, 0, 1200, false);
				fluidBlockPigIron = registerFluid(fluidPigIron = new Fluid("packFluidPigIron"), "packPigIron", WurmTweaksBlocks.blockPigIron, 0, 100, false);
				fluidBlockRoseGold = registerFluid(fluidRoseGold = new Fluid("packFluidRoseGold"), "packRoseGold", WurmTweaksBlocks.blockRoseGold, 0, 500, false);
				fluidBlockZinc = registerFluid(fluidZinc = new Fluid("packFluidZinc"), "packZinc", WurmTweaksBlocks.blockZinc, 0, 800, false);
				fluidBlockTin = registerFluid(fluidTin = new Fluid("packFluidTin"), "packTin", WurmTweaksBlocks.blockTin, 0, 300, false);
				fluidBlockUnknown = registerFluid(fluidUnknown = new Fluid("packFluidUnknown"), "fluidUnknown");
				// Pure Fluids
				pureFluidBlockWroughtIron = registerFluid(pureFluidWroughtIron = new Fluid("packPureIron"), "packPureIron");
				pureFluidBlockPlatinum = registerFluid(pureFluidPlatinum = new Fluid("packPurePlatinum"), "packPurePlatinum");
				pureFluidBlockGold = registerFluid(pureFluidGold = new Fluid("packPureGold"), "packPureGold");
				pureFluidBlockSilver = registerFluid(pureFluidSilver = new Fluid("packPureSilver"), "packPureSilver");
				pureFluidBlockCopper = registerFluid(pureFluidCopper = new Fluid("packPureCopper"), "packPureCopper");
				pureFluidBlockBismuth = registerFluid(pureFluidBismuth = new Fluid("packPureBismuth"), "packPureBismuth");
				pureFluidBlockLead = registerFluid(pureFluidLead = new Fluid("packPureLead"), "packPureLead");
				pureFluidBlockNickel = registerFluid(pureFluidNickel = new Fluid("packPureNickel"), "packPureNickel");
				pureFluidBlockZinc = registerFluid(pureFluidZinc = new Fluid("packPureZinc"), "packPureZinc");
				pureFluidBlockTin = registerFluid(pureFluidTin = new Fluid("packPureTin"), "packPureTin");
		}

		private static Block registerFluid (Fluid fluid, String name, Block block, int meta, int maxHeat, boolean toolpart) {
				if (RecipeChecker.modExists("TConstruct"))
						registerFluidType(name, block, meta, maxHeat, fluid, toolpart);
				return registerFluid(fluid, name);
		}

		private static Block registerFluid (Fluid fluid, String name) {
				FluidRegistry.registerFluid(fluid);
				Block molten = new BasicFluid(fluid, Material.water).setBlockName("molten" + name).setBlockTextureName(Global.MODID + ":" + name);
				fluid.setBlock(molten);
				GameRegistry.registerBlock(molten, molten.getUnlocalizedName().substring(5));
				return molten;
		}

		@Optional.Method (modid = "TConstruct")
		private static void registerFluidType (String name, Block block, int meta, int maxHeat, Fluid fluid, boolean toolpart) {
				FluidType.registerFluidType(name, block, meta, maxHeat, fluid, toolpart);
		}
}

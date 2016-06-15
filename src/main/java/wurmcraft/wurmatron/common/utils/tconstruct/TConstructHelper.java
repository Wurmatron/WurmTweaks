package wurmcraft.wurmatron.common.utils.tconstruct;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.crafting.Smeltery;
import tconstruct.tools.TinkerTools;
import tconstruct.weaponry.TinkerWeaponry;


public class TConstructHelper {

		public static final Item[] TCTools = new Item[] {TinkerTools.toolRod, TinkerTools.pickaxeHead, TinkerTools.shovelHead, TinkerTools.hatchetHead, TinkerTools.swordBlade, TinkerTools.wideGuard, TinkerTools.handGuard, TinkerTools.crossbar, TinkerTools.binding, TinkerTools.frypanHead, TinkerTools.signHead, TinkerTools.knifeBlade, TinkerTools.chiselHead, TinkerTools.toughRod, TinkerTools.toughBinding, TinkerTools.largePlate, TinkerTools.broadAxeHead, TinkerTools.scytheBlade, TinkerTools.excavatorHead, TinkerTools.largeSwordBlade, TinkerTools.hammerHead, TinkerTools.fullGuard, TinkerWeaponry.arrowhead, TinkerWeaponry.shuriken, TinkerWeaponry.partCrossbowLimb, TinkerWeaponry.partCrossbowBody, TinkerWeaponry.partBowLimb};

		public static void addCastingRecipe (ItemStack output, FluidStack fluid, ItemStack cast) {
				TConstructRegistry.getTableCasting().addCastingRecipe(output, fluid,cast, 20);
		}

		public static void addBasinRecipe (ItemStack output, FluidStack fluid) {
				TConstructRegistry.getBasinCasting().addCastingRecipe(output, fluid, 20);
		}

		public static void addBasinRecipe (Block output, FluidStack fluid) {
				TConstructRegistry.getBasinCasting().addCastingRecipe(new ItemStack(output), fluid, 20);
		}

		public static void addAlloy(FluidStack output, FluidStack... input) {
				Smeltery.addAlloyMixing(output,input);
		}

		public static void addMelting(ItemStack input, Block display, int temp, FluidStack output ) {
				Smeltery.addMelting(input,display,0, temp,output);
		}

		public static void addMelting(Block input, int temp, FluidStack output ) {
				Smeltery.addMelting(input,0, temp,output);
		}

		public static void addMelting(Block input, int meta, int temp, FluidStack output ) {
				Smeltery.addMelting(input,meta, temp,output);
		}

		public static void addFuel(Fluid fluid, int power, int duration) {
				Smeltery.addSmelteryFuel(fluid,power,duration);
		}
}
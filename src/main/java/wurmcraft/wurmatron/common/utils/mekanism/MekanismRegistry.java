package wurmcraft.wurmatron.common.utils.mekanism;

import mekanism.api.gas.Gas;
import mekanism.api.gas.GasRegistry;
import wurmcraft.wurmatron.common.fluid.WurmTweaksFluid;

public class MekanismRegistry {

		public static Gas copper;
		public static Gas gold;
		public static Gas platinum;
		public static Gas iron;
		public static Gas bismuth;
		public static Gas zinc;
		public static Gas nickel;
		public static Gas tin;
		public static Gas silver;
		public static Gas lead;

		public static Gas copperPure;
		public static Gas goldPure;
		public static Gas platinumPure;
		public static Gas ironPure;
		public static Gas bismuthPure;
		public static Gas zincPure;
		public static Gas nickelPure;
		public static Gas tinPure;
		public static Gas silverPure;
		public static Gas leadPure;

		public static void addGases () {
				copper = new Gas(WurmTweaksFluid.fluidCopper);
				gold = new Gas(WurmTweaksFluid.fluidGold);
				platinum = new Gas(WurmTweaksFluid.fluidPlatinum);
				iron = new Gas(WurmTweaksFluid.fluidWroughtIron);
				bismuth = new Gas(WurmTweaksFluid.fluidBismuth);
				zinc = new Gas(WurmTweaksFluid.fluidZinc);
				nickel = new Gas(WurmTweaksFluid.fluidNickel);
				tin = new Gas(WurmTweaksFluid.fluidTin);
				silver = new Gas(WurmTweaksFluid.fluidSilver);
				lead = new Gas(WurmTweaksFluid.fluidLead);
				copperPure = new Gas(WurmTweaksFluid.pureFluidCopper);
				goldPure = new Gas(WurmTweaksFluid.pureFluidGold);
				platinumPure = new Gas(WurmTweaksFluid.pureFluidPlatinum);
				ironPure = new Gas(WurmTweaksFluid.pureFluidWroughtIron);
				bismuthPure = new Gas(WurmTweaksFluid.pureFluidBismuth);
				zincPure = new Gas(WurmTweaksFluid.pureFluidZinc);
				nickelPure = new Gas(WurmTweaksFluid.pureFluidNickel);
				tinPure = new Gas(WurmTweaksFluid.pureFluidTin);
				silverPure = new Gas(WurmTweaksFluid.pureFluidSilver);
				leadPure = new Gas(WurmTweaksFluid.pureFluidLead);
				GasRegistry.register(copper);
				GasRegistry.register(gold);
				GasRegistry.register(platinum);
				GasRegistry.register(iron);
				GasRegistry.register(bismuth);
				GasRegistry.register(zinc);
				GasRegistry.register(nickel);
				GasRegistry.register(tin);
				GasRegistry.register(silver);
				GasRegistry.register(lead);
				GasRegistry.register(copperPure);
				GasRegistry.register(goldPure);
				GasRegistry.register(platinumPure);
				GasRegistry.register(ironPure);
				GasRegistry.register(bismuthPure);
				GasRegistry.register(zincPure);
				GasRegistry.register(nickelPure);
				GasRegistry.register(tinPure);
				GasRegistry.register(silverPure);
				GasRegistry.register(leadPure);
		}
}

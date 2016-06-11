package wurmcraft.wurmatron.common.utils.thermalexpansion;

import cofh.api.modhelpers.ThermalExpansionHelper;
import cofh.thermalexpansion.block.TEBlocks;
import cofh.thermalexpansion.util.crafting.CrucibleManager;
import cofh.thermalexpansion.util.crafting.PulverizerManager;
import cofh.thermalexpansion.util.crafting.TransposerManager;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;

public class TEHelper {

		public static ItemStack Furnace = new ItemStack(TEBlocks.blockMachine, 1, 0);
		public static ItemStack Pulversier = new ItemStack(TEBlocks.blockMachine, 1, 1);
		public static ItemStack Sawmill = new ItemStack(TEBlocks.blockMachine, 1, 2);
		public static ItemStack Smelter = new ItemStack(TEBlocks.blockMachine, 1, 3);
		public static ItemStack Magma = new ItemStack(TEBlocks.blockMachine, 1, 4);
		public static ItemStack Fluid = new ItemStack(TEBlocks.blockMachine, 1, 5);
		public static ItemStack Glacial = new ItemStack(TEBlocks.blockMachine, 1, 6);
		public static ItemStack Cobble = new ItemStack(TEBlocks.blockMachine, 1, 7);
		public static ItemStack Aqua = new ItemStack(TEBlocks.blockMachine, 1, 8);
		public static ItemStack Assembler = new ItemStack(TEBlocks.blockMachine, 1, 9);
		public static ItemStack Power = new ItemStack(TEBlocks.blockMachine, 1, 10);

		private static final byte[] SideCache = new byte[] {(byte) 1, 1, (byte) 2, 2, (byte) 2, 2, 2,};
		private static NBTTagCompound Augments = new NBTTagCompound();

		@Optional.Method (modid = "ThermalExpansion")
		public static ItemStack getPulveriser (String name) {

				if (name == "Basic") {
						// Set Basic NBT
						Pulversier.stackTagCompound = new NBTTagCompound();
						Pulversier.stackTagCompound.setByte("Facing", (byte) 3);
						Pulversier.stackTagCompound.setByte("Level", (byte) 0);
						Pulversier.stackTagCompound.setByte("RSControl", (byte) 0);
						Pulversier.stackTagCompound.setByte("Energy", (byte) 0);
						Pulversier.stackTagCompound.setByte("Secure", (byte) 1);
						Pulversier.stackTagCompound.setByteArray("SideCache", SideCache);
						Pulversier.stackTagCompound.setTag("Augments", Augments);
						return Pulversier;
				}

				if (name == "Hardened") {
						// Set Basic NBT
						Pulversier.stackTagCompound = new NBTTagCompound();
						Pulversier.stackTagCompound.setByte("Facing", (byte) 3);
						Pulversier.stackTagCompound.setByte("Level", (byte) 1);
						Pulversier.stackTagCompound.setByte("RSControl", (byte) 0);
						Pulversier.stackTagCompound.setByte("Energy", (byte) 0);
						Pulversier.stackTagCompound.setByte("Secure", (byte) 1);
						Pulversier.stackTagCompound.setByteArray("SideCache", SideCache);
						Pulversier.stackTagCompound.setTag("Augments", Augments);
						return Pulversier;
				}
				if (name == "Reinforced") {
						// Set Basic NBT
						Pulversier.stackTagCompound = new NBTTagCompound();
						Pulversier.stackTagCompound.setByte("Facing", (byte) 3);
						Pulversier.stackTagCompound.setByte("Level", (byte) 2);
						Pulversier.stackTagCompound.setByte("RSControl", (byte) 0);
						Pulversier.stackTagCompound.setByte("Energy", (byte) 0);
						Pulversier.stackTagCompound.setByte("Secure", (byte) 1);
						Pulversier.stackTagCompound.setByteArray("SideCache", SideCache);
						Pulversier.stackTagCompound.setTag("Augments", Augments);
						return Pulversier;
				}
				if (name == "Resonant") {
						// Set Basic NBT
						Pulversier.stackTagCompound = new NBTTagCompound();
						Pulversier.stackTagCompound.setByte("Facing", (byte) 3);
						Pulversier.stackTagCompound.setByte("Level", (byte) 3);
						Pulversier.stackTagCompound.setByte("RSControl", (byte) 0);
						Pulversier.stackTagCompound.setByte("Energy", (byte) 0);
						Pulversier.stackTagCompound.setByte("Secure", (byte) 1);
						Pulversier.stackTagCompound.setByteArray("SideCache", SideCache);
						Pulversier.stackTagCompound.setTag("Augments", Augments);
						return Pulversier;
				}
				return null;
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static ItemStack getFurnace (String name) {
				if (name == "Basic") {
						// Set Basic NBT
						Furnace.stackTagCompound = new NBTTagCompound();
						Furnace.stackTagCompound.setByte("Facing", (byte) 3);
						Furnace.stackTagCompound.setByte("Level", (byte) 0);
						Furnace.stackTagCompound.setByte("RSControl", (byte) 0);
						Furnace.stackTagCompound.setByte("Energy", (byte) 0);
						Furnace.stackTagCompound.setByte("Secure", (byte) 1);
						Furnace.stackTagCompound.setByteArray("SideCache", SideCache);
						Furnace.stackTagCompound.setTag("Augments", Augments);
						return Furnace;
				}
				if (name == "Hardened") {
						// Set Basic NBT
						Furnace.stackTagCompound = new NBTTagCompound();
						Furnace.stackTagCompound.setByte("Facing", (byte) 3);
						Furnace.stackTagCompound.setByte("Level", (byte) 1);
						Furnace.stackTagCompound.setByte("RSControl", (byte) 0);
						Furnace.stackTagCompound.setByte("Energy", (byte) 0);
						Furnace.stackTagCompound.setByte("Secure", (byte) 1);
						Furnace.stackTagCompound.setByteArray("SideCache", SideCache);
						Furnace.stackTagCompound.setTag("Augments", Augments);
						return Furnace;
				}
				if (name == "Reinforced") {
						// Set Basic NBT
						Furnace.stackTagCompound = new NBTTagCompound();
						Furnace.stackTagCompound.setByte("Facing", (byte) 3);
						Furnace.stackTagCompound.setByte("Level", (byte) 2);
						Furnace.stackTagCompound.setByte("RSControl", (byte) 0);
						Furnace.stackTagCompound.setByte("Energy", (byte) 0);
						Furnace.stackTagCompound.setByte("Secure", (byte) 1);
						Furnace.stackTagCompound.setByteArray("SideCache", SideCache);
						Furnace.stackTagCompound.setTag("Augments", Augments);
						return Furnace;
				}
				if (name == "Resonant") {
						// Set Basic NBT
						Furnace.stackTagCompound = new NBTTagCompound();
						Furnace.stackTagCompound.setByte("Facing", (byte) 3);
						Furnace.stackTagCompound.setByte("Level", (byte) 3);
						Furnace.stackTagCompound.setByte("RSControl", (byte) 0);
						Furnace.stackTagCompound.setByte("Energy", (byte) 0);
						Furnace.stackTagCompound.setByte("Secure", (byte) 1);
						Furnace.stackTagCompound.setByteArray("SideCache", SideCache);
						Furnace.stackTagCompound.setTag("Augments", Augments);
						return Furnace;
				}
				return null;
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static ItemStack getSawmill (String name) {

				if (name == "Basic") {
						// Set Basic NBT
						Sawmill.stackTagCompound = new NBTTagCompound();
						Sawmill.stackTagCompound.setByte("Facing", (byte) 3);
						Sawmill.stackTagCompound.setByte("Level", (byte) 0);
						Sawmill.stackTagCompound.setByte("RSControl", (byte) 0);
						Sawmill.stackTagCompound.setByte("Energy", (byte) 0);
						Sawmill.stackTagCompound.setByte("Secure", (byte) 1);
						Sawmill.stackTagCompound.setByteArray("SideCache", SideCache);
						Sawmill.stackTagCompound.setTag("Augments", Augments);
						return Sawmill;
				}
				if (name == "Hardened") {
						// Set Basic NBT
						Sawmill.stackTagCompound = new NBTTagCompound();
						Sawmill.stackTagCompound.setByte("Facing", (byte) 3);
						Sawmill.stackTagCompound.setByte("Level", (byte) 1);
						Sawmill.stackTagCompound.setByte("RSControl", (byte) 0);
						Sawmill.stackTagCompound.setByte("Energy", (byte) 0);
						Sawmill.stackTagCompound.setByte("Secure", (byte) 1);
						Sawmill.stackTagCompound.setByteArray("SideCache", SideCache);
						Sawmill.stackTagCompound.setTag("Augments", Augments);
						return Sawmill;
				}
				if (name == "Reinforced") {
						// Set Basic NBT
						Sawmill.stackTagCompound = new NBTTagCompound();
						Sawmill.stackTagCompound.setByte("Facing", (byte) 3);
						Sawmill.stackTagCompound.setByte("Level", (byte) 2);
						Sawmill.stackTagCompound.setByte("Secure", (byte) 1);
						Sawmill.stackTagCompound.setByte("RSControl", (byte) 0);
						Sawmill.stackTagCompound.setByte("Energy", (byte) 0);

						Sawmill.stackTagCompound.setByteArray("SideCache", SideCache);
						Sawmill.stackTagCompound.setTag("Augments", Augments);
						return Sawmill;
				}
				if (name == "Resonant") {
						// Set Basic NBT
						Sawmill.stackTagCompound = new NBTTagCompound();
						Sawmill.stackTagCompound.setByte("Facing", (byte) 3);
						Sawmill.stackTagCompound.setByte("Level", (byte) 3);
						Sawmill.stackTagCompound.setByte("RSControl", (byte) 0);
						Sawmill.stackTagCompound.setByte("Energy", (byte) 0);
						Sawmill.stackTagCompound.setByte("Secure", (byte) 1);
						Sawmill.stackTagCompound.setByteArray("SideCache", SideCache);
						Sawmill.stackTagCompound.setTag("Augments", Augments);
						return Sawmill;
				}
				return null;
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static ItemStack getSmelter (String name) {

				if (name == "Basic") {
						// Set Basic NBT
						Smelter.stackTagCompound = new NBTTagCompound();
						Smelter.stackTagCompound.setByte("Facing", (byte) 3);
						Smelter.stackTagCompound.setByte("Level", (byte) 0);
						Smelter.stackTagCompound.setByte("RSControl", (byte) 0);
						Smelter.stackTagCompound.setByte("Energy", (byte) 0);
						Smelter.stackTagCompound.setByte("Secure", (byte) 1);
						Smelter.stackTagCompound.setByteArray("SideCache", SideCache);
						Smelter.stackTagCompound.setTag("Augments", Augments);
						return Smelter;
				}
				if (name == "Hardened") {
						// Set Basic NBT
						Smelter.stackTagCompound = new NBTTagCompound();
						Smelter.stackTagCompound.setByte("Facing", (byte) 3);
						Smelter.stackTagCompound.setByte("Level", (byte) 1);
						Smelter.stackTagCompound.setByte("RSControl", (byte) 0);
						Smelter.stackTagCompound.setByte("Energy", (byte) 0);
						Smelter.stackTagCompound.setByte("Secure", (byte) 1);
						Smelter.stackTagCompound.setByteArray("SideCache", SideCache);
						Smelter.stackTagCompound.setTag("Augments", Augments);
						return Smelter;
				}
				if (name == "Reinforced") {
						// Set Basic NBT
						Smelter.stackTagCompound = new NBTTagCompound();
						Smelter.stackTagCompound.setByte("Facing", (byte) 3);
						Smelter.stackTagCompound.setByte("Level", (byte) 2);
						Smelter.stackTagCompound.setByte("RSControl", (byte) 0);
						Smelter.stackTagCompound.setByte("Energy", (byte) 0);
						Smelter.stackTagCompound.setByte("Secure", (byte) 1);
						Smelter.stackTagCompound.setByteArray("SideCache", SideCache);
						Smelter.stackTagCompound.setTag("Augments", Augments);
						return Smelter;
				}
				if (name == "Resonant") {
						// Set Basic NBT
						Smelter.stackTagCompound = new NBTTagCompound();
						Smelter.stackTagCompound.setByte("Facing", (byte) 3);
						Smelter.stackTagCompound.setByte("Level", (byte) 3);
						Smelter.stackTagCompound.setByte("RSControl", (byte) 0);
						Smelter.stackTagCompound.setByte("Energy", (byte) 0);
						Smelter.stackTagCompound.setByte("Secure", (byte) 1);
						Smelter.stackTagCompound.setByteArray("SideCache", SideCache);
						Smelter.stackTagCompound.setTag("Augments", Augments);
						return Smelter;
				}
				return null;
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static ItemStack getMagma (String name) {
				if (name == "Basic") {
						// Set Basic NBT
						Magma.stackTagCompound = new NBTTagCompound();
						Magma.stackTagCompound.setByte("Facing", (byte) 3);
						Magma.stackTagCompound.setByte("Level", (byte) 0);
						Magma.stackTagCompound.setByte("RSControl", (byte) 0);
						Magma.stackTagCompound.setByte("Energy", (byte) 0);
						Magma.stackTagCompound.setByte("Secure", (byte) 1);
						Magma.stackTagCompound.setByteArray("SideCache", SideCache);
						Magma.stackTagCompound.setTag("Augments", Augments);
						return Magma;
				}
				if (name == "Hardened") {
						// Set Basic NBT
						Magma.stackTagCompound = new NBTTagCompound();
						Magma.stackTagCompound.setByte("Facing", (byte) 3);
						Magma.stackTagCompound.setByte("Level", (byte) 1);
						Magma.stackTagCompound.setByte("RSControl", (byte) 0);
						Magma.stackTagCompound.setByte("Energy", (byte) 0);
						Magma.stackTagCompound.setByte("Secure", (byte) 1);
						Magma.stackTagCompound.setByteArray("SideCache", SideCache);
						Magma.stackTagCompound.setTag("Augments", Augments);
						return Smelter;
				}
				if (name == "Reinforced") {
						// Set Basic NBT
						Magma.stackTagCompound = new NBTTagCompound();
						Magma.stackTagCompound.setByte("Facing", (byte) 3);
						Magma.stackTagCompound.setByte("Level", (byte) 2);
						Magma.stackTagCompound.setByte("RSControl", (byte) 0);
						Magma.stackTagCompound.setByte("Energy", (byte) 0);
						Magma.stackTagCompound.setByte("Secure", (byte) 1);
						Magma.stackTagCompound.setByteArray("SideCache", SideCache);
						Magma.stackTagCompound.setTag("Augments", Augments);
						return Magma;
				}
				if (name == "Resonant") {
						// Set Basic NBT
						Magma.stackTagCompound = new NBTTagCompound();
						Magma.stackTagCompound.setByte("Facing", (byte) 3);
						Magma.stackTagCompound.setByte("Level", (byte) 3);
						Magma.stackTagCompound.setByte("RSControl", (byte) 0);
						Magma.stackTagCompound.setByte("Energy", (byte) 0);
						Magma.stackTagCompound.setByte("Secure", (byte) 1);
						Magma.stackTagCompound.setByteArray("SideCache", SideCache);
						Magma.stackTagCompound.setTag("Augments", Augments);
						return Magma;
				}
				return null;
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static ItemStack getFluid (String name) {

				if (name == "Basic") {
						// Set Basic NBT
						Fluid.stackTagCompound = new NBTTagCompound();
						Fluid.stackTagCompound.setByte("Facing", (byte) 3);
						Fluid.stackTagCompound.setByte("Level", (byte) 0);
						Fluid.stackTagCompound.setByte("RSControl", (byte) 0);
						Fluid.stackTagCompound.setByte("Energy", (byte) 0);
						Fluid.stackTagCompound.setByte("Secure", (byte) 1);
						Fluid.stackTagCompound.setByteArray("SideCache", SideCache);
						Fluid.stackTagCompound.setTag("Augments", Augments);
						return Fluid;
				}
				if (name == "Hardened") {
						// Set Basic NBT
						Fluid.stackTagCompound = new NBTTagCompound();
						Fluid.stackTagCompound.setByte("Facing", (byte) 3);
						Fluid.stackTagCompound.setByte("Level", (byte) 1);
						Fluid.stackTagCompound.setByte("RSControl", (byte) 0);
						Fluid.stackTagCompound.setByte("Energy", (byte) 0);
						Fluid.stackTagCompound.setByte("Secure", (byte) 1);
						Fluid.stackTagCompound.setByteArray("SideCache", SideCache);
						Fluid.stackTagCompound.setTag("Augments", Augments);
						return Fluid;
				}
				if (name == "Reinforced") {
						// Set Basic NBT
						Fluid.stackTagCompound = new NBTTagCompound();
						Fluid.stackTagCompound.setByte("Facing", (byte) 3);
						Fluid.stackTagCompound.setByte("Level", (byte) 2);
						Fluid.stackTagCompound.setByte("RSControl", (byte) 0);
						Fluid.stackTagCompound.setByte("Energy", (byte) 0);
						Fluid.stackTagCompound.setByte("Secure", (byte) 1);
						Fluid.stackTagCompound.setByteArray("SideCache", SideCache);
						Fluid.stackTagCompound.setTag("Augments", Augments);
						return Fluid;
				}
				if (name == "Resonant") {
						// Set Basic NBT
						Fluid.stackTagCompound = new NBTTagCompound();
						Fluid.stackTagCompound.setByte("Facing", (byte) 3);
						Fluid.stackTagCompound.setByte("Level", (byte) 3);
						Fluid.stackTagCompound.setByte("RSControl", (byte) 0);
						Fluid.stackTagCompound.setByte("Energy", (byte) 0);
						Fluid.stackTagCompound.setByte("Secure", (byte) 1);
						Fluid.stackTagCompound.setByteArray("SideCache", SideCache);
						Fluid.stackTagCompound.setTag("Augments", Augments);
						return Fluid;
				}
				return null;
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static ItemStack getGlacial (String name) {
				if (name == "Basic") {
						// Set Basic NBT
						Glacial.stackTagCompound = new NBTTagCompound();
						Glacial.stackTagCompound.setByte("Facing", (byte) 3);
						Glacial.stackTagCompound.setByte("Level", (byte) 0);
						Glacial.stackTagCompound.setByte("RSControl", (byte) 0);
						Glacial.stackTagCompound.setByte("Energy", (byte) 0);
						Glacial.stackTagCompound.setByte("Secure", (byte) 1);
						Glacial.stackTagCompound.setByteArray("SideCache", SideCache);
						Glacial.stackTagCompound.setTag("Augments", Augments);
						return Glacial;
				}
				if (name == "Hardened") {
						// Set Basic NBT
						Glacial.stackTagCompound = new NBTTagCompound();
						Glacial.stackTagCompound.setByte("Facing", (byte) 3);
						Glacial.stackTagCompound.setByte("Level", (byte) 1);
						Glacial.stackTagCompound.setByte("RSControl", (byte) 0);
						Glacial.stackTagCompound.setByte("Energy", (byte) 0);
						Glacial.stackTagCompound.setByte("Secure", (byte) 1);
						Glacial.stackTagCompound.setByteArray("SideCache", SideCache);
						Glacial.stackTagCompound.setTag("Augments", Augments);
						return Glacial;
				}
				if (name == "Reinforced") {
						// Set Basic NBT
						Glacial.stackTagCompound = new NBTTagCompound();
						Glacial.stackTagCompound.setByte("Facing", (byte) 3);
						Glacial.stackTagCompound.setByte("Level", (byte) 2);
						Glacial.stackTagCompound.setByte("RSControl", (byte) 0);
						Glacial.stackTagCompound.setByte("Energy", (byte) 0);
						Glacial.stackTagCompound.setByte("Secure", (byte) 1);
						Glacial.stackTagCompound.setByteArray("SideCache", SideCache);
						Glacial.stackTagCompound.setTag("Augments", Augments);
						return Glacial;
				}
				if (name == "Resonant") {
						// Set Basic NBT
						Glacial.stackTagCompound = new NBTTagCompound();
						Glacial.stackTagCompound.setByte("Facing", (byte) 3);
						Glacial.stackTagCompound.setByte("Level", (byte) 3);
						Glacial.stackTagCompound.setByte("RSControl", (byte) 0);
						Glacial.stackTagCompound.setByte("Energy", (byte) 0);
						Glacial.stackTagCompound.setByte("Secure", (byte) 1);
						Glacial.stackTagCompound.setByteArray("SideCache", SideCache);
						Glacial.stackTagCompound.setTag("Augments", Augments);
						return Glacial;
				}
				return null;
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static ItemStack getCobble (String name) {

				if (name == "Basic") {
						// Set Basic NBT
						Cobble.stackTagCompound = new NBTTagCompound();
						Cobble.stackTagCompound.setByte("Facing", (byte) 3);
						Cobble.stackTagCompound.setByte("Level", (byte) 0);
						Cobble.stackTagCompound.setByte("RSControl", (byte) 0);
						Cobble.stackTagCompound.setByte("Energy", (byte) 0);
						Cobble.stackTagCompound.setByte("Secure", (byte) 1);
						Cobble.stackTagCompound.setByteArray("SideCache", SideCache);
						Cobble.stackTagCompound.setTag("Augments", Augments);
						return Cobble;
				}
				if (name == "Hardened") {
						// Set Basic NBT
						Cobble.stackTagCompound = new NBTTagCompound();
						Cobble.stackTagCompound.setByte("Facing", (byte) 3);
						Cobble.stackTagCompound.setByte("Level", (byte) 1);
						Cobble.stackTagCompound.setByte("RSControl", (byte) 0);
						Cobble.stackTagCompound.setByte("Energy", (byte) 0);
						Cobble.stackTagCompound.setByte("Secure", (byte) 1);
						Cobble.stackTagCompound.setByteArray("SideCache", SideCache);
						Cobble.stackTagCompound.setTag("Augments", Augments);
						return Cobble;
				}
				if (name == "Reinforced") {
						// Set Basic NBT
						Cobble.stackTagCompound = new NBTTagCompound();
						Cobble.stackTagCompound.setByte("Facing", (byte) 3);
						Cobble.stackTagCompound.setByte("Level", (byte) 2);
						Cobble.stackTagCompound.setByte("RSControl", (byte) 0);
						Cobble.stackTagCompound.setByte("Energy", (byte) 0);
						Cobble.stackTagCompound.setByte("Secure", (byte) 1);
						Cobble.stackTagCompound.setByteArray("SideCache", SideCache);
						Cobble.stackTagCompound.setTag("Augments", Augments);
						return Cobble;
				}
				if (name == "Resonant") {
						// Set Basic NBT
						Cobble.stackTagCompound = new NBTTagCompound();
						Cobble.stackTagCompound.setByte("Facing", (byte) 3);
						Cobble.stackTagCompound.setByte("Level", (byte) 3);
						Cobble.stackTagCompound.setByte("RSControl", (byte) 0);
						Cobble.stackTagCompound.setByte("Energy", (byte) 0);
						Cobble.stackTagCompound.setByte("Secure", (byte) 1);
						Cobble.stackTagCompound.setByteArray("SideCache", SideCache);
						Cobble.stackTagCompound.setTag("Augments", Augments);
						return Cobble;
				}
				return null;
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static ItemStack getAqua (String name) {
				if (name == "Basic") {
						// Set Basic NBT
						Aqua.stackTagCompound = new NBTTagCompound();
						Aqua.stackTagCompound.setByte("Facing", (byte) 3);
						Aqua.stackTagCompound.setByte("Level", (byte) 0);
						Aqua.stackTagCompound.setByte("RSControl", (byte) 0);
						Aqua.stackTagCompound.setByte("Energy", (byte) 0);
						Aqua.stackTagCompound.setByte("Secure", (byte) 1);
						Aqua.stackTagCompound.setByteArray("SideCache", SideCache);
						Aqua.stackTagCompound.setTag("Augments", Augments);
						return Aqua;
				}
				if (name == "Hardened") {
						// Set Basic NBT
						Aqua.stackTagCompound = new NBTTagCompound();
						Aqua.stackTagCompound.setByte("Facing", (byte) 3);
						Aqua.stackTagCompound.setByte("Level", (byte) 1);
						Aqua.stackTagCompound.setByte("RSControl", (byte) 0);
						Aqua.stackTagCompound.setByte("Energy", (byte) 0);
						Aqua.stackTagCompound.setByte("Secure", (byte) 1);
						Aqua.stackTagCompound.setByteArray("SideCache", SideCache);
						Aqua.stackTagCompound.setTag("Augments", Augments);
						return Aqua;
				}
				if (name == "Reinforced") {
						// Set Basic NBT
						Aqua.stackTagCompound = new NBTTagCompound();
						Aqua.stackTagCompound.setByte("Facing", (byte) 3);
						Aqua.stackTagCompound.setByte("Level", (byte) 2);
						Aqua.stackTagCompound.setByte("RSControl", (byte) 0);
						Aqua.stackTagCompound.setByte("Energy", (byte) 0);
						Aqua.stackTagCompound.setByte("Secure", (byte) 1);
						Aqua.stackTagCompound.setByteArray("SideCache", SideCache);
						Aqua.stackTagCompound.setTag("Augments", Augments);
						return Aqua;
				}
				if (name == "Resonant") {
						// Set Basic NBT
						Aqua.stackTagCompound = new NBTTagCompound();
						Aqua.stackTagCompound.setByte("Facing", (byte) 3);
						Aqua.stackTagCompound.setByte("Level", (byte) 3);
						Aqua.stackTagCompound.setByte("RSControl", (byte) 0);
						Aqua.stackTagCompound.setByte("Energy", (byte) 0);
						Aqua.stackTagCompound.setByte("Secure", (byte) 1);
						Aqua.stackTagCompound.setByteArray("SideCache", SideCache);
						Aqua.stackTagCompound.setTag("Augments", Augments);
						return Aqua;
				}
				return null;
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static ItemStack getAssembler (String name) {

				if (name == "Basic") {
						// Set Basic NBT
						Assembler.stackTagCompound = new NBTTagCompound();
						Assembler.stackTagCompound.setByte("Facing", (byte) 3);
						Assembler.stackTagCompound.setByte("Level", (byte) 0);
						Assembler.stackTagCompound.setByte("RSControl", (byte) 0);
						Assembler.stackTagCompound.setByte("Energy", (byte) 0);
						Assembler.stackTagCompound.setByte("Secure", (byte) 1);
						Assembler.stackTagCompound.setByteArray("SideCache", SideCache);
						Assembler.stackTagCompound.setTag("Augments", Augments);
						return Assembler;
				}
				if (name == "Hardened") {
						// Set Basic NBT
						Assembler.stackTagCompound = new NBTTagCompound();
						Assembler.stackTagCompound.setByte("Facing", (byte) 3);
						Assembler.stackTagCompound.setByte("Level", (byte) 1);
						Assembler.stackTagCompound.setByte("RSControl", (byte) 0);
						Assembler.stackTagCompound.setByte("Energy", (byte) 0);
						Assembler.stackTagCompound.setByte("Secure", (byte) 1);
						Assembler.stackTagCompound.setByteArray("SideCache", SideCache);
						Assembler.stackTagCompound.setTag("Augments", Augments);
						return Assembler;
				}
				if (name == "Reinforced") {
						// Set Basic NBT
						Assembler.stackTagCompound = new NBTTagCompound();
						Assembler.stackTagCompound.setByte("Facing", (byte) 3);
						Assembler.stackTagCompound.setByte("Level", (byte) 2);
						Assembler.stackTagCompound.setByte("RSControl", (byte) 0);
						Assembler.stackTagCompound.setByte("Energy", (byte) 0);
						Assembler.stackTagCompound.setByte("Secure", (byte) 1);
						Assembler.stackTagCompound.setByteArray("SideCache", SideCache);
						Assembler.stackTagCompound.setTag("Augments", Augments);
						return Assembler;
				}
				if (name == "Resonant") {
						// Set Basic NBT
						Assembler.stackTagCompound = new NBTTagCompound();
						Assembler.stackTagCompound.setByte("Facing", (byte) 3);
						Assembler.stackTagCompound.setByte("Level", (byte) 3);
						Assembler.stackTagCompound.setByte("RSControl", (byte) 0);
						Assembler.stackTagCompound.setByte("Energy", (byte) 0);
						Assembler.stackTagCompound.setByte("Secure", (byte) 1);
						Assembler.stackTagCompound.setByteArray("SideCache", SideCache);
						Assembler.stackTagCompound.setTag("Augments", Augments);
						return Assembler;
				}
				return null;
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static ItemStack getPower (String name) {

				if (name == "Basic") {
						// Set Basic NBT
						Power.stackTagCompound = new NBTTagCompound();
						Power.stackTagCompound.setByte("Facing", (byte) 3);
						Power.stackTagCompound.setByte("Level", (byte) 0);
						Power.stackTagCompound.setByte("RSControl", (byte) 0);
						Power.stackTagCompound.setByte("Energy", (byte) 0);
						Power.stackTagCompound.setByte("Secure", (byte) 1);
						Power.stackTagCompound.setByteArray("SideCache", SideCache);
						Power.stackTagCompound.setTag("Augments", Augments);
						return Power;
				}
				if (name == "Hardened") {
						// Set Basic NBT
						Power.stackTagCompound = new NBTTagCompound();
						Power.stackTagCompound.setByte("Facing", (byte) 3);
						Power.stackTagCompound.setByte("Level", (byte) 1);
						Power.stackTagCompound.setByte("RSControl", (byte) 0);
						Power.stackTagCompound.setByte("Energy", (byte) 0);
						Power.stackTagCompound.setByte("Secure", (byte) 1);
						Power.stackTagCompound.setByteArray("SideCache", SideCache);
						Power.stackTagCompound.setTag("Augments", Augments);
						return Power;
				}
				if (name == "Reinforced") {
						// Set Basic NBT
						Power.stackTagCompound = new NBTTagCompound();
						Power.stackTagCompound.setByte("Facing", (byte) 3);
						Power.stackTagCompound.setByte("Level", (byte) 2);
						Power.stackTagCompound.setByte("RSControl", (byte) 0);
						Power.stackTagCompound.setByte("Energy", (byte) 0);
						Power.stackTagCompound.setByte("Secure", (byte) 1);
						Power.stackTagCompound.setByteArray("SideCache", SideCache);
						Power.stackTagCompound.setTag("Augments", Augments);
						return Power;
				}
				if (name == "Resonant") {
						// Set Basic NBT
						Power.stackTagCompound = new NBTTagCompound();
						Power.stackTagCompound.setByte("Facing", (byte) 3);
						Power.stackTagCompound.setByte("Level", (byte) 3);
						Power.stackTagCompound.setByte("RSControl", (byte) 0);
						Power.stackTagCompound.setByte("Energy", (byte) 0);
						Power.stackTagCompound.setByte("Secure", (byte) 1);
						Power.stackTagCompound.setByteArray("SideCache", SideCache);
						Power.stackTagCompound.setTag("Augments", Augments);
						return Power;
				}
				return null;
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addFurnaceRecipe (int energy, ItemStack input, ItemStack output) {
				if (input == null || output == null) {
						return;
				}
				ThermalExpansionHelper.addFurnaceRecipe(energy, input, output);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addPulverizerRecipe (int power, ItemStack in, ItemStack out, ItemStack secondary, int chance) {
				PulverizerManager.addRecipe(power, in, out, secondary, chance);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addPulverizerRecipe (int power, ItemStack in, ItemStack out) {
				PulverizerManager.addRecipe(power, in, out);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addSawmillRecipe (int energy, ItemStack input, ItemStack primaryOutput) {
				addSawmillRecipe(energy, input, primaryOutput, null, 0);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addSawmillRecipe (int energy, ItemStack input, ItemStack primaryOutput, ItemStack secondaryOutput) {
				addSawmillRecipe(energy, input, primaryOutput, secondaryOutput, 100);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addSawmillRecipe (int energy, ItemStack input, ItemStack primaryOutput, ItemStack secondaryOutput, int secondaryChance) {
				ThermalExpansionHelper.addSawmillRecipe(energy, input, primaryOutput, secondaryOutput, secondaryChance);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addSmelterRecipe (int energy, ItemStack primaryInput, ItemStack secondaryInput, ItemStack primaryOutput) {
				addSmelterRecipe(energy, primaryInput, secondaryInput, primaryOutput, null, 0);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addSmelterRecipe (int energy, ItemStack primaryInput, ItemStack secondaryInput, ItemStack primaryOutput, ItemStack secondaryOutput) {
				addSmelterRecipe(energy, primaryInput, secondaryInput, primaryOutput, secondaryOutput, 100);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addSmelterRecipe (int energy, ItemStack primaryInput, ItemStack secondaryInput, ItemStack primaryOutput, ItemStack secondaryOutput, int secondaryChance) {
				ThermalExpansionHelper.addSmelterRecipe(energy, primaryInput, secondaryInput, primaryOutput, secondaryOutput, secondaryChance);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addCrucibleRecipe (int energy, ItemStack input, FluidStack output) {
				CrucibleManager.addRecipe(energy, input, output);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addTransposerFill (int energy, ItemStack input, ItemStack output, FluidStack fluid, boolean reversible) {
				TransposerManager.addFillRecipe(energy, input, output, fluid, reversible);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addTransposerExtract (int energy, ItemStack input, ItemStack output, FluidStack fluid, int chance, boolean reversible) {
				ThermalExpansionHelper.addTransposerExtract(energy, input, output, fluid, chance, reversible);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addMagmaticFuel (String fluidName, int energy) {
				NBTTagCompound toSend = new NBTTagCompound();
				toSend.setString("fluidName", fluidName);
				toSend.setInteger("energy", energy);
				FMLInterModComms.sendMessage("ThermalExpansion", "MagmaticFuel", toSend);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addCompressionFuel (String fluidName, int energy) {
				NBTTagCompound toSend = new NBTTagCompound();
				toSend.setString("fluidName", fluidName);
				toSend.setInteger("energy", energy);
				FMLInterModComms.sendMessage("ThermalExpansion", "CompressionFuel", toSend);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addReactantFuel (String fluidName, int energy) {
				NBTTagCompound toSend = new NBTTagCompound();
				toSend.setString("fluidName", fluidName);
				toSend.setInteger("energy", energy);
				FMLInterModComms.sendMessage("ThermalExpansion", "ReactantFuel", toSend);
		}

		@Optional.Method (modid = "ThermalExpansion")
		public static void addCoolant (String fluidName, int energy) {
				NBTTagCompound toSend = new NBTTagCompound();
				toSend.setString("fluidName", fluidName);
				toSend.setInteger("energy", energy);
				FMLInterModComms.sendMessage("ThermalExpansion", "Coolant", toSend);
		}
}

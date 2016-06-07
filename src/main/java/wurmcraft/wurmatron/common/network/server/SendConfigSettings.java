package wurmcraft.wurmatron.common.network.server;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import wurmcraft.wurmatron.common.config.Settings;
import wurmcraft.wurmatron.common.network.CustomMessage;

import java.io.IOException;

public class SendConfigSettings extends CustomMessage.ClientMessage<SendConfigSettings> {

		private NBTTagCompound data;

		public SendConfigSettings () {}

		public SendConfigSettings (EntityPlayer player) {
				data.setBoolean("debug", Settings.debug);
				data.setBoolean("Avaritia", Settings.Avaritia);
				data.setBoolean("AdvancedSolarPanels", Settings.AdvancedSolarPanels);
				data.setBoolean("AM2", Settings.AM2);
				data.setBoolean("AE2", Settings.AE2);
				data.setBoolean("EnderIO", Settings.EnderIO);
				data.setBoolean("BigReactors", Settings.BigReactors);
				data.setBoolean("BloodMagic", Settings.BloodMagic);
				data.setBoolean("Botania", Settings.Botania);
				data.setBoolean("BuildCraft", Settings.BuildCraft);
				data.setBoolean("CarpentersBlocks", Settings.CarpentersBlocks);
				data.setBoolean("Chisel", Settings.Chisel);
				data.setBoolean("ComputerCraft", Settings.ComputerCraft);
				data.setBoolean("CraftHeraldry", Settings.CraftHeraldry);
				data.setBoolean("DraconicEvolution", Settings.DraconicEvolution);
				data.setBoolean("IronChest", Settings.IronChest);
				data.setBoolean("EnderStorage", Settings.EnderStorage);
				data.setBoolean("ExtraCells", Settings.ExtraCells);
				data.setBoolean("ExtraUtilities", Settings.ExtraUtilities);
				data.setBoolean("GalaticCraft", Settings.GalaticCraft);
				data.setBoolean("GraviSuite", Settings.GraviSuite);
				data.setBoolean("ImmersiveEngineering", Settings.ImmersiveEngineering);
				data.setBoolean("IC2", Settings.IC2);
				data.setBoolean("JABBA", Settings.JABBA);
				data.setBoolean("MalisisDoors", Settings.MalisisDoors);
				data.setBoolean("Mekanism", Settings.Mekanism);
				data.setBoolean("MineFactoryReloaded", Settings.MineFactoryReloaded);
				data.setBoolean("OpenBlocks", Settings.OpenBlocks);
				data.setBoolean("OpenComputers", Settings.OpenComputers);
				data.setBoolean("OpenModularTurrets", Settings.OpenModularTurrets);
				data.setBoolean("PowerConverters", Settings.PowerConverters);
				data.setBoolean("QuarryPlus", Settings.QuarryPlus);
				data.setBoolean("Railcraft", Settings.Railcraft);
				data.setBoolean("tinker_io", Settings.TinkerIO);
				data.setBoolean("ShinColle", Settings.ShinColle);
		}

		@Override
		protected void read (PacketBuffer buff) throws IOException {
				data = buff.readNBTTagCompoundFromBuffer();
		}

		@Override
		protected void write (PacketBuffer buff) throws IOException {
				buff.writeNBTTagCompoundToBuffer(data);
		}

		@Override
		public void process (EntityPlayer player, Side side) {
				Settings.debug = data.getBoolean("data");
				Settings.Avaritia = data.getBoolean("Avaritia");
				Settings.AdvancedSolarPanels = data.getBoolean("AdvancedSolarPanels");
				Settings.AM2 = data.getBoolean("AM2");
				Settings.AE2 = data.getBoolean("AE2");
				Settings.EnderIO = data.getBoolean("EnderIO");
				Settings.BigReactors = data.getBoolean("BigReactors");
				Settings.BloodMagic = data.getBoolean("BloodMagic");
				Settings.Botania = data.getBoolean("Botania");
				Settings.BuildCraft = data.getBoolean("BuildCraft");
				Settings.CarpentersBlocks = data.getBoolean("CarpentersBlocks");
				Settings.Chisel = data.getBoolean("Chisel");
				Settings.ComputerCraft = data.getBoolean("ComputerCraft");
				Settings.CraftHeraldry = data.getBoolean("CraftHeraldry");
				Settings.DraconicEvolution = data.getBoolean("DraconicEvolution");
				Settings.IronChest = data.getBoolean("IronChest");
				Settings.EnderStorage = data.getBoolean("EnderStorage");
				Settings.ExtraCells = data.getBoolean("ExtraCells");
				Settings.ExtraUtilities = data.getBoolean("ExtraUtilities");
				Settings.GalaticCraft = data.getBoolean("GalaticCraft");
				Settings.GraviSuite = data.getBoolean("GraviSuite");
				Settings.ImmersiveEngineering = data.getBoolean("ImmersiveEngineering");
				Settings.IC2 = data.getBoolean("IC2");
				Settings.JABBA = data.getBoolean("JABBA");
				Settings.MalisisDoors = data.getBoolean("MalisisDoors");
				Settings.Mekanism = data.getBoolean("Mekanism");
				Settings.MineFactoryReloaded = data.getBoolean("MineFactoryReloaded");
				Settings.OpenBlocks = data.getBoolean("OpenBlocks");
				Settings.OpenComputers = data.getBoolean("OpenComputers");
				Settings.OpenModularTurrets = data.getBoolean("OpenModularTurrets");
				Settings.PowerConverters = data.getBoolean("PowerConverters");
				Settings.QuarryPlus = data.getBoolean("QuarryPlus");
				Settings.Railcraft = data.getBoolean("Railcraft");
				Settings.TinkerIO = data.getBoolean("tinker_io");
				Settings.ShinColle = data.getBoolean("ShinColle");
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import advsolar.common.AdvancedSolarPanel;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import powercrystals.minefactoryreloaded.MFRRegistry;
import powercrystals.minefactoryreloaded.farmables.harvestables.HarvestableWood;
import powercrystals.minefactoryreloaded.farmables.plantables.PlantableSapling;
import powercrystals.minefactoryreloaded.farmables.plantables.PlantableSoil;
import powercrystals.minefactoryreloaded.setup.MFRThings;
import powercrystals.minefactoryreloaded.setup.Machine;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.mfr.HarvestLeaves;

public class MinefactoryReloadedRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "MineFactoryReloaded")
		public static void addRecipes () {
				r.addShaped(new ItemStack(MFRThings.conveyorBlock, 6, 16), "RSR", "RSR", "RSR", 'R', "packRubber", 'S', TFCItems.bronzeSheet);
				r.addShaped(new ItemStack(MFRThings.factoryHammerItem, 1, 0), "SS ", "SSX", "SS ", 'S', WurmTweaksItems.gearMixedSheet, 'X', "packSick");
				r.addShaped(Machine.Planter.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', "packDirt", 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.Harvester.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', TFCItems.redSteelAxe, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.ItemCollector.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', TFCItems.steelSheet, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.BlockBreaker.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', TFCItems.redSteelPick, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.Sewer.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', Blocks.iron_bars, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.Grinder.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemMixedSheet, 'X', TFCItems.blackSteelSword, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.AutoEnchanter.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', Blocks.enchanting_table, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.Ejector.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', Blocks.piston, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.ItemRouter.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', TFCItems.blackSteelSheet, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.LiquidRouter.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', TFCItems.blueSteelSheet, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(Machine.DeepStorageUnit.getItemStack().getItem(), 2, 3), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', ExtraUtils.bedrockiumBlock, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.LavaFabricator.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', Blocks.obsidian, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.AutoJukebox.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', Blocks.jukebox, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.AutoDisenchanter.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', Items.book, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.EnchantmentRouter.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', Items.enchanted_book, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.AutoAnvil.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', Blocks.anvil, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.AutoBrewer.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', Items.brewing_stand, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.AutoSpawner.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', WurmTweaksBlocks.blockBlueSteel, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.LaserDrillPrecharger.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', AdvancedSolarPanel.blockMolecularTransformer, 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(Machine.LaserDrill.getItemStack(), "CXC", "BAB", "CXC", 'C', WurmTweaksItems.itemAutoCore, 'X', new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 3), 'B', "packGemExquisite", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(MFRThings.portaSpawnerItem), "XAX", "ACA", "XAX", 'X', Items.nether_star, 'A', WurmTweaksItems.itemAutoCore, 'C', WurmTweaksItems.itemQuantumSingularity);
				r.addShaped(new ItemStack(MFRThings.safariNetLauncherItem), "SSS", " EX", " XX", 'S', WurmTweaksItems.itemAutoCore, 'E', TFCItems.steelSheet, 'X', WurmTweaksItems.ingotHalfium);
				r.addShaped(new ItemStack(MFRThings.safariNetItem), " C ", "CXC", " C ", 'C', WurmTweaksItems.itemAutoCore, 'X', WurmTweaksItems.itemQuantumSingularity);
				r.addShaped(new ItemStack(MFRThings.safariNetSingleItem), " C ", "CXC", " C ", 'C', Blocks.iron_bars, 'X', WurmTweaksItems.itemQuantumSingularity);
				r.addShaped(new ItemStack(MFRThings.strawItem), "RR ", " R ", " R ", 'R', "packRubber");
				r.addShaped(new ItemStack(MFRThings.xpExtractorItem), "TTT", "XAX", "TTT", 'T', TFCItems.blackSteelSheet, 'X', WurmTweaksBlocks.blockBlueSteel, 'A', TFCItems.blackSteelIngot);
				r.addShaped(new ItemStack(MFRThings.upgradeItem, 1, 0), "AAA", "AXA", "AAA", 'A', TFCItems.blueSteelSheet, 'X', TFCItems.bismuthIngot);
				r.addShaped(new ItemStack(MFRThings.upgradeItem, 1, 11), "AAA", "AXA", "AAA", 'A', TFCItems.blueSteelSheet, 'X', "packCobble");
				for (int i = 0; i < 15; i++)
						r.addShapeless(new ItemStack(MFRThings.conveyorBlock, 1, i), new ItemStack(MFRThings.conveyorBlock, 1, 16), RecipeHelper.dye.get(i));
				for (int i = 1; i < 11; i++)
						r.addShapeless(new ItemStack(MFRThings.upgradeItem, 1, i), new ItemStack(MFRThings.upgradeItem, 1, i - 1), new ItemStack(MFRThings.upgradeItem, 1, i - 1));
				r.addShaped(new ItemStack(MFRThings.strawItem), "SSS", "  S", "  S", 'S', "packRubber");
				MFRRegistry.registerHarvestable(new HarvestLeaves(TFCBlocks.leaves));
				MFRRegistry.registerHarvestable(new HarvestableWood(TFCBlocks.logNatural));
				MFRRegistry.registerHarvestable(new HarvestableWood(TFCBlocks.logNatural2));
				MFRRegistry.registerHarvestable(new HarvestLeaves(TFCBlocks.leaves));
				MFRRegistry.registerHarvestable(new HarvestLeaves(TFCBlocks.leaves2));
				MFRRegistry.registerPlantable(new PlantableSapling(TFCBlocks.sapling));
				MFRRegistry.registerPlantable(new PlantableSapling(TFCBlocks.sapling2));
				MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.dirt));
				MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.dirt2));
				MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.grass));
				MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.grass2));
				MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.clayGrass));
				MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.clayGrass2));
				MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.tilledSoil));
				MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.tilledSoil2));
				MFRRegistry.registerPlantable(new PlantableSoil(TFCBlocks.peatGrass));
				MFRRegistry.getLaserOres().clear();
				MFRRegistry.registerLaserOre(12, new ItemStack(TFCItems.oreChunk, 1, 0));
				MFRRegistry.registerLaserOre(15, new ItemStack(TFCItems.oreChunk, 1, 1));
				MFRRegistry.registerLaserOre(5, new ItemStack(TFCItems.oreChunk, 1, 2));
				MFRRegistry.registerLaserOre(10, new ItemStack(TFCItems.oreChunk, 1, 3));
				MFRRegistry.registerLaserOre(8, new ItemStack(TFCItems.oreChunk, 1, 4));
				MFRRegistry.registerLaserOre(12, new ItemStack(TFCItems.oreChunk, 1, 5));
				MFRRegistry.registerLaserOre(14, new ItemStack(TFCItems.oreChunk, 1, 6));
				MFRRegistry.registerLaserOre(8, new ItemStack(TFCItems.oreChunk, 1, 7));
				MFRRegistry.registerLaserOre(2, new ItemStack(TFCItems.oreChunk, 1, 8));
				MFRRegistry.registerLaserOre(12, new ItemStack(TFCItems.oreChunk, 1, 9));
				MFRRegistry.registerLaserOre(8, new ItemStack(TFCItems.oreChunk, 1, 10));
				MFRRegistry.registerLaserOre(10, new ItemStack(TFCItems.oreChunk, 1, 11));
				MFRRegistry.registerLaserOre(10, new ItemStack(TFCItems.oreChunk, 1, 12));
				MFRRegistry.registerLaserOre(10, new ItemStack(TFCItems.oreChunk, 1, 13));
				MFRRegistry.registerLaserOre(12, new ItemStack(TFCItems.oreChunk, 1, 16));
				MFRRegistry.registerLaserOre(12, new ItemStack(TFCItems.oreChunk, 1, 20));
				MFRRegistry.registerLaserOre(8, new ItemStack(TFCItems.oreChunk, 1, 27));
				MFRRegistry.registerLaserOre(8, new ItemStack(TFCItems.oreChunk, 1, 28));
				MFRRegistry.registerLaserOre(22, new ItemStack(TFCItems.oreChunk, 1, 49));
				MFRRegistry.registerLaserOre(25, new ItemStack(TFCItems.oreChunk, 1, 50));
				MFRRegistry.registerLaserOre(15, new ItemStack(TFCItems.oreChunk, 1, 51));
				MFRRegistry.registerLaserOre(20, new ItemStack(TFCItems.oreChunk, 1, 52));
				MFRRegistry.registerLaserOre(18, new ItemStack(TFCItems.oreChunk, 1, 53));
				MFRRegistry.registerLaserOre(22, new ItemStack(TFCItems.oreChunk, 1, 54));
				MFRRegistry.registerLaserOre(24, new ItemStack(TFCItems.oreChunk, 1, 55));
				MFRRegistry.registerLaserOre(18, new ItemStack(TFCItems.oreChunk, 1, 56));
				MFRRegistry.registerLaserOre(12, new ItemStack(TFCItems.oreChunk, 1, 57));
				MFRRegistry.registerLaserOre(22, new ItemStack(TFCItems.oreChunk, 1, 58));
				MFRRegistry.registerLaserOre(18, new ItemStack(TFCItems.oreChunk, 1, 59));
				MFRRegistry.registerLaserOre(20, new ItemStack(TFCItems.oreChunk, 1, 60));
				MFRRegistry.registerLaserOre(20, new ItemStack(TFCItems.oreChunk, 1, 61));
				MFRRegistry.registerLaserOre(20, new ItemStack(TFCItems.oreChunk, 1, 62));
				MFRRegistry.registerLaserOre(32, new ItemStack(TFCItems.smallOreChunk, 1, 0));
				MFRRegistry.registerLaserOre(35, new ItemStack(TFCItems.smallOreChunk, 1, 1));
				MFRRegistry.registerLaserOre(25, new ItemStack(TFCItems.smallOreChunk, 1, 2));
				MFRRegistry.registerLaserOre(30, new ItemStack(TFCItems.smallOreChunk, 1, 3));
				MFRRegistry.registerLaserOre(28, new ItemStack(TFCItems.smallOreChunk, 1, 4));
				MFRRegistry.registerLaserOre(32, new ItemStack(TFCItems.smallOreChunk, 1, 5));
				MFRRegistry.registerLaserOre(34, new ItemStack(TFCItems.smallOreChunk, 1, 6));
				MFRRegistry.registerLaserOre(28, new ItemStack(TFCItems.smallOreChunk, 1, 7));
				MFRRegistry.registerLaserOre(22, new ItemStack(TFCItems.smallOreChunk, 1, 8));
				MFRRegistry.registerLaserOre(32, new ItemStack(TFCItems.smallOreChunk, 1, 9));
				MFRRegistry.registerLaserOre(28, new ItemStack(TFCItems.smallOreChunk, 1, 10));
				MFRRegistry.registerLaserOre(30, new ItemStack(TFCItems.smallOreChunk, 1, 11));
				MFRRegistry.registerLaserOre(30, new ItemStack(TFCItems.smallOreChunk, 1, 12));
				MFRRegistry.registerLaserOre(30, new ItemStack(TFCItems.smallOreChunk, 1, 13));
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import ic2.core.Ic2Items;
import mrtjp.projectred.ProjectRedIllumination;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import shedar.mods.ic2.nuclearcontrol.IC2NuclearControl;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class IC2NuclearControlRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid="IC2NuclearControl")
		public static void addRecipes() {
				LogHandler.info("Adding IC2 Nuclear Control Recipes");
				r.addShaped(IC2NuclearControl.blockNuclearControlMain, "AAA", "ABA", "ACA", "A", TFCItems.blueSteelSheet, "B", "circuitAdvanced", "C", TFCItems.redSteelSheet);
				r.addShaped(IC2NuclearControl.blockNuclearControlLight, "AAA", "ABA", "ACA", "A", "packGlass", "B", "dyeWhite", "C", new ItemStack(ProjectRedIllumination.blockLamp(),1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(IC2NuclearControl.blockNuclearControlLight, 1, 2), "AAA", "ABA", "ACA", "A", "packGlass", "B", "dyeOrange", "C", new ItemStack(ProjectRedIllumination.blockLamp(),1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 2), "AAA", "BCB", "BDB", "A", Blocks.noteblock, "B", TFCItems.wroughtIronSheet, "C", "circuitAdvanced", "D", TFCItems.redSteelSheet);
				r.addShaped(new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 1), "AAA", "ABA", "ACA", "A", TFCItems.bronzeSheet, "B", new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 2), "C", TFCItems.redSteelSheet);
				r.addShaped(new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 3), "ABA", "ACA", "ADA", "A", TFCItems.wroughtIronSheet, "B", Ic2Items.frequencyTransmitter, "C", Ic2Items.machine, "D", IC2NuclearControl.blockNuclearControlMain);
				r.addShaped(new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 4), "AAA", "BCB", "DED", "A", "stainedGlassPaneLime", "B", Ic2Items.electronicCircuit, "C", Ic2Items.machine, "D", "dyeBlack", "E", TFCItems.redSteelSheet);
				r.addShaped(new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 5), "AAA", "BCB", "BBB", "A", "stainedGlassPaneLime", "B", "packPlanks", "C", TFCItems.redSteelSheet);
				r.addShaped(new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 9), "AAA", "BCD", "EFE", "A", "stainedGlassPaneLime", "B", new ItemStack(IC2NuclearControl.itemUpgrade, 1, 1), "C", new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 4), "D", IC2NuclearControl.itemUpgrade, "E", TFCItems.blackSteelSheet, "F", Ic2Items.advancedCircuit);
				r.addShaped(new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 10), "AAA", "BCB", "BDB", "A", "stainedGlassPaneLime", "B", TFCItems.blackSteelSheet, "C", new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 5), "D", Ic2Items.machine);
				r.addShaped(IC2NuclearControl.itemToolThermometer, "AB ", "BCB", " BB", "A", TFCItems.wroughtIronSheet, "B", "packGlass", "C", TFCItems.redSteelBucketWater);
				r.addShaped(IC2NuclearControl.itemToolThermometer, "AB ", "BCB", " BB", "A", TFCItems.wroughtIronSheet, "B", "packGlass", "C", TFCItems.redSteelBucketSaltWater);
				r.addShaped(IC2NuclearControl.itemToolDigitalThermometer, "AB ", "BCB", " BD", "A", "packRubber", "B", TFCItems.wroughtIronSheet, "C", IC2NuclearControl.itemToolThermometer, "D", Ic2Items.powerunitsmall);
				r.addShaped(IC2NuclearControl.itemRemoteSensorKit, "DF", "PW", "D", new ItemStack(IC2NuclearControl.itemToolDigitalThermometer, 1, OreDictionary.WILDCARD_VALUE), "F", Ic2Items.frequencyTransmitter, "P", Items.paper, "W", "dyeYellow");
				r.addShaped(IC2NuclearControl.itemEnergySensorKit, "RF", "PO", "R", TFCItems.redSteelSheet, "F", Ic2Items.frequencyTransmitter, "P", Items.paper, "O", "dyeRed");
				r.addShaped(IC2NuclearControl.itemUpgrade, "CCC", "IFI", "C", TFCItems.blueSteelSheet, "I", Ic2Items.insulatedCopperCableItem, "F", Ic2Items.frequencyTransmitter);
				r.addShaped(new ItemStack(IC2NuclearControl.itemUpgrade, 1, 1), "RYG", "WCM", "IAB", "R", "dyeRed", "Y", "dyeYellow", "G", "dyeGreen", "W", "dyeWhite", "C", Ic2Items.electronicCircuit, "M", "dyeMagenta", "I", "dyeBlack", "A", "dyeCyan", "B", "dyeBlue");
				r.addShaped(new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 6), "IAI", "FTF", "I", TFCItems.wroughtIronSheet, "A", Ic2Items.advancedCircuit, "F", Ic2Items.goldCableItem, "T", Ic2Items.mvTransformer);
				r.addShaped(new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 7), "LAL", "FTF", "L", TFCItems.leadSheet, "A", Ic2Items.advancedCircuit, "F", Ic2Items.goldCableItem, "T", Ic2Items.mvTransformer);
				r.addShaped(new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 8), "PFP", "AMA", " R ", "P", TFCItems.wroughtIronSheet, "F", Ic2Items.frequencyTransmitter, "A", Ic2Items.advancedCircuit, "M", Ic2Items.machine, "R", TFCItems.redSteelSheet);
				r.addShaped(IC2NuclearControl.itemMultipleSensorKit, "CF", "PR", "C", Ic2Items.electronicCircuit, "F", Ic2Items.frequencyTransmitter, "P", Items.paper, "R", "dyeOrange");
				r.addShaped(new ItemStack(IC2NuclearControl.itemMultipleSensorKit, 1, 1), "CF", "PB", "C", Ic2Items.electronicCircuit, "F", Ic2Items.frequencyTransmitter, "P", Items.paper, "B", "dyeBlue");
				r.addShaped(IC2NuclearControl.itemTextCard, " C ", "PFP", " C ", "C", Ic2Items.electronicCircuit, "P", Items.paper, "F", Ic2Items.insulatedTinCableItem);
				r.addShaped(IC2NuclearControl.itemTimeCard, " C ", "PWP", " C ", "C", Items.clock, "P", Items.paper, "W", Ic2Items.insulatedTinCableItem);
				r.addShaped(new ItemStack(IC2NuclearControl.itemMultipleSensorKit, 1, 2), "CF", "PL", "C", Ic2Items.energyStorageUpgrade, "F", Ic2Items.frequencyTransmitter, "P", Items.paper, "L", "dyeLightGray");
				r.addShaped(IC2NuclearControl.itemRemoteMonitor, "A  ", "CMC", "RPP", "A", Ic2Items.insulatedTinCableItem, "C", Ic2Items.frequencyTransmitter, "M", new ItemStack(IC2NuclearControl.blockNuclearControlMain, 1, 5), "R", IC2NuclearControl.itemUpgrade, "P", TFCItems.blackSteelSheet);
		}
}

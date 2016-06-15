package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermalexpansion.block.cell.BlockCell;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import crazypants.enderio.EnderIO;
import ic2.api.item.IC2Items;
import mekanism.common.MekanismItems;
import net.machinemuse.api.IModularItem;
import net.machinemuse.api.ModuleManager;
import net.machinemuse.powersuits.common.MPSItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.TFCFoodModule;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.nbt.ItemNBT;

import java.util.ArrayList;

public class PowerSuitRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				r.addShaped9X9Recipe(new ItemStack(MPSItems.tinkerTable()), "X X X X X", "IXIXIXIXI", "BBBBBBBBB", "BCCCCCCCB", "BCCCCCCCB", "BCCCCCCCB", "BCCCCCCCB", "BCCCCCCCB", "BBBBBBBBB", 'X', WurmTweaksItems.ingotRainbowSteel, 'I', WurmTweaksItems.itemBloodInfused, 'B', "packGemBlock", 'C', WurmTweaksItems.ingotTitanium);
				r.addShaped(new ItemStack(MPSItems.powerArmorHead()), "XXX", "C C", 'X', WurmTweaksItems.ingotTitanium, 'C', new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addShaped(new ItemStack(MPSItems.powerArmorTorso()), "X X", "XXX", "CXC", 'X', WurmTweaksItems.ingotTitanium, 'C', new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addShaped(new ItemStack(MPSItems.powerArmorLegs()), "XXX", "XCX", "XCX", 'X', WurmTweaksItems.ingotTitanium, 'C', new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addShaped(new ItemStack(MPSItems.powerArmorFeet()), "X X", "XCX", 'X', WurmTweaksItems.ingotTitanium, 'C', new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addBasicMachineRecipe(ItemNBT.addDamage(new ItemStack(MPSItems.powerTool(), 1, 0), 2500), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotTitanium, WurmTweaksItems.ingotEnergyReactor, WurmTweaksItems.itemComputationalCore);
				r.addShaped(new ItemStack(MPSItems.components(), 12, 0), "CSC", "CSC", "CSC", 'C', TFCItems.copperSheet, 'S',TFCItems.silverSheet);
				r.addShaped(new ItemStack(MPSItems.components(), 12, 0), "CCC", "SSS", "CCC", 'C', TFCItems.copperSheet, 'S', TFCItems.silverSheet);
				r.addShaped(new ItemStack(MPSItems.components(), 1, 1), "CSC", "CEC", "CSC", 'C', new ItemStack(MPSItems.components(), 1), 'S', WurmTweaksItems.ingotTitanium, 'E', TFItems.ingotEnderium);
				r.addCrossWCenter(new ItemStack(MPSItems.components(), 1, 2), new ItemStack(MPSItems.components(), 1, 1), new ItemStack(MPSItems.components(), 1, 0), WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(MPSItems.components(), 1, 3), " GG", "GGS", "G X", 'G', "packGlass", 'S', WurmTweaksItems.ingotTitanium, 'X', new ItemStack(MPSItems.components(), 1, 1));
				r.addBasicMachineRecipe(new ItemStack(MPSItems.components(), 1, 4), new ItemStack(MPSItems.components(), 1, 11), new ItemStack(MPSItems.components(), 1, 1), Items.glowstone_dust, new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addShaped(new ItemStack(MPSItems.components(), 1, 5), "SXS", "SXS", "SXS", 'S', new ItemStack(MPSItems.components(), 1, 0), 'X', BlockCell.cellResonant);
				r.add2X(new ItemStack(MPSItems.components(), 1, 6), new ItemStack(MPSItems.components(), 1, 5));
				r.add2X(new ItemStack(MPSItems.components(), 1, 7), new ItemStack(MPSItems.components(), 1, 6));
				r.addShaped(new ItemStack(MPSItems.components(), 1, 8), "WWW", "L L", "IFI", 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE), 'L', TFCItems.leather, 'I', "packCloth", 'F', "packIngot");
				r.addCircleWCenter(new ItemStack(MPSItems.components(), 1, 9), TFCItems.blackSteelSheet2x, new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addCircleWCenter(new ItemStack(MPSItems.components(), 1, 10), "packGemExquisite", new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addCrossWCenter(new ItemStack(MPSItems.components(), 1, 11), "packGemExquisite", "packGemBlock", new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addBasicMachineRecipe(new ItemStack(MPSItems.components(), 1, 12), "dye", "packGlass", "packRock", new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.add3X(new ItemStack(MPSItems.components(), 1, 13), IC2Items.getItem("carbonPlate"));
				r.addCrossWCenter(new ItemStack(MPSItems.components(), 1, 14), "dye", new ItemStack(MPSItems.components(), 1, 0), new ItemStack(MekanismItems.ControlCircuit, 1, 3));
				r.addShapeless(new ItemStack(MPSItems.components(), 1, 15), new ItemStack(EnderIO.itemAlloy, 1, 6), Items.magma_cream);
				r.addCircleWCenter(new ItemStack(MPSItems.components(), 2, 16), new ItemStack(MPSItems.components(), 1, 13), new ItemStack(MPSItems.components(), 1, 15));
				r.addBasicMachineRecipe(new ItemStack(MPSItems.components(), 1, 17), "dyeBlue", "packIngot", new ItemStack(MekanismItems.ControlCircuit, 1, 3), WurmTweaksItems.itemSolarCore);
				r.addShaped(new ItemStack(MPSItems.components(), 1, 18), "XAX", "SSS", "XAX", 'X', TFCItems.redSteelSheet2x, 'A', new ItemStack(MekanismItems.ControlCircuit, 1, 2), 'S', new ItemStack(MPSItems.components(), 1, 1));
				r.addCrossWCenter(new ItemStack(MPSItems.components(), 1, 19), new ItemStack(IC2Items.getItem("advancedCircuit").getItem(), 1), WurmTweaksItems.itemComputationalCore, WurmTweaksBlocks.blockCompressedRedstone);
				r.addShaped(new ItemStack(MPSItems.components(), 6, 20), "XXX", "I I", "XXX", 'X', "packRubber", 'I', "packGlass");
				// TODO Add Support for TFC Damage values
				ArrayList<IModularItem> validItems = new ArrayList<IModularItem>();
				validItems.add(MPSItems.powerArmorHead());
				ModuleManager.addModule(new TFCFoodModule(validItems));
		}
}

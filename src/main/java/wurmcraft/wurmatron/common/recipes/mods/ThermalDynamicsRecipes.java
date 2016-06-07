package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermaldynamics.ThermalDynamics;
import cofh.thermaldynamics.duct.TDDucts;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class ThermalDynamicsRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "ThermalDynamics")
		public static void addRecipes () {
				r.addShaped(new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 6, 0), "RRR", "LGL", "RRR", 'L', new ItemStack(TFCItems.leadSheet), 'G', "packGlass", 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 6, 3), "IGI", 'G', "packGlass", 'I', new ItemStack(TFCItems.nickelSheet));
				r.addShaped(new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 7), "IGI", "ICI", "IGI", 'G', "packGlass", 'I', TFCItems.roseGoldIngot, 'C', new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 2));
				r.addShaped(new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 6, 0), "IGI", 'G', "packGlass", 'I', new ItemStack(TFCItems.copperIngot));
				r.addShaped(new ItemStack(TDDucts.fluidBasicOpaque.itemStack.getItem(), 6, 3), "IGI", 'G', new ItemStack(TFCItems.leadIngot), 'I', new ItemStack(TFCItems.nickelIngot));
				r.addShaped(new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 6, 2), "IGI", 'G', new ItemStack(TFCItems.leadIngot), 'I', new ItemStack(TFCItems.nickelIngot));
				r.addShaped(new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 6, 0), "IGI", 'G', "packGlass", 'I', new ItemStack(TFCItems.tinIngot));
				r.addShaped(new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 6, 1), "IGI", 'G', new ItemStack(TFCItems.leadIngot), 'I', new ItemStack(TFCItems.tinIngot));
				r.addShaped(new ItemStack(ThermalDynamics.itemCover, 6, 0), "ILI", 'I', new ItemStack(TFCItems.wroughtIronIngot), 'L', new ItemStack(TFCItems.leadIngot));
				r.addShaped(new ItemStack(ThermalDynamics.itemServo, 1, 0), "IGI", " R ", 'I', new ItemStack(TFCItems.wroughtIronIngot), 'G', "packGlass", 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemServo, 1, 1), "IGI", " R ", 'I', new ItemStack(TFCItems.nickelIngot), 'G', new ItemStack(ThermalDynamics.itemServo, 1, 0), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemServo, 1, 2), "IGI", " R ", 'I', new ItemStack(TFCItems.roseGoldIngot), 'G', new ItemStack(ThermalDynamics.itemServo, 1, 1), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemServo, 1, 3), "IGI", " R ", 'I', TFItems.ingotSignalum, 'G', new ItemStack(ThermalDynamics.itemServo, 1, 2), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemServo, 1, 4), "IGI", " R ", 'I', TFItems.ingotEnderium, 'G', new ItemStack(ThermalDynamics.itemServo, 1, 3), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemFilter, 1, 0), "IGI", " R ", 'I', new ItemStack(TFCItems.wroughtIronIngot), 'G', new ItemStack(Items.paper), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemFilter, 1, 1), "IGI", " R ", 'I', new ItemStack(TFCItems.nickelIngot), 'G', new ItemStack(ThermalDynamics.itemFilter, 1, 0), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemFilter, 1, 2), "IGI", " R ", 'I', new ItemStack(TFCItems.roseGoldIngot), 'G', new ItemStack(ThermalDynamics.itemFilter, 1, 1), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemFilter, 1, 3), "IGI", " R ", 'I', TFItems.ingotSignalum, 'G', new ItemStack(ThermalDynamics.itemFilter, 1, 2), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemFilter, 1, 4), "IGI", " R ", 'I', TFItems.ingotEnderium, 'G', new ItemStack(ThermalDynamics.itemFilter, 1, 3), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemRetriever, 1, 0), "IGI", " R ", 'I', new ItemStack(TFCItems.wroughtIronIngot), 'G', new ItemStack(Items.ender_eye), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemRetriever, 1, 1), "IGI", " R ", 'I', new ItemStack(TFCItems.nickelIngot), 'G', new ItemStack(ThermalDynamics.itemRetriever, 1, 0), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemRetriever, 1, 2), "IGI", " R ", 'I', new ItemStack(TFCItems.roseGoldIngot), 'G', new ItemStack(ThermalDynamics.itemRetriever, 1, 1), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemRetriever, 1, 3), "IGI", " R ", 'I', TFItems.ingotSignalum, 'G', new ItemStack(ThermalDynamics.itemRetriever, 1, 2), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemRetriever, 1, 4), "IGI", " R ", 'I', TFItems.ingotEnderium, 'G', new ItemStack(ThermalDynamics.itemRetriever, 1, 3), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(ThermalDynamics.itemRelay, 1, 0), "IGI", " R ", 'I', new ItemStack(Items.redstone), 'G', "packGlass", 'R', new ItemStack(Items.redstone));
				r.addShapeless(new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 3, 1), new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 0), new ItemStack(Items.redstone), new ItemStack(Items.redstone), new ItemStack(Items.redstone), new ItemStack(TFCItems.leadSheet));
				r.addShapeless(new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 3, 4), new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 2), new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 2), new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 2), new ItemStack(Items.redstone), new ItemStack(Items.redstone), new ItemStack(Items.redstone), TFItems.ingotEnderium);
				r.addShapeless(new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 3, 3), new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 2), new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 2), new ItemStack(TDDucts.energyBasic.itemStack.getItem(), 1, 2), new ItemStack(Items.redstone), new ItemStack(Items.redstone), new ItemStack(Items.redstone), TFItems.ingotEnderium);
				r.addShapeless(new ItemStack(TDDucts.fluidBasicOpaque.itemStack.getItem(), 6, 1), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 1, 0), "packGlass");
				r.addShapeless(new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 3, 4), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 6, 2), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 6, 2), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 6, 2), TFItems.ingotSignalum, TFItems.ingotSignalum);
				r.addShapeless(new ItemStack(TDDucts.fluidBasicOpaque.itemStack.getItem(), 3, 5), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 6, 3), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 6, 3), new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 6, 3), TFItems.ingotSignalum, TFItems.ingotSignalum);
				r.addShapeless(new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 6, 2), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 3), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 3), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 3), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 3), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 3), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 3), "packGlass");
				r.addShapeless(new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 6, 3), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 2), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 2), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 2), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 2), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 2), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 2), new ItemStack(TFCItems.leadIngot));
				r.addShapeless(new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 6, 4), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 0), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 0), TFItems.ingotEnderium);
				r.addShapeless(new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 6, 5), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 4), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 4), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 4), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 4), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 4), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 4), new ItemStack(TFCItems.leadIngot));
				r.addShapeless(new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 6, 4), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 5), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 5), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 5), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 5), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 5), new ItemStack(TDDucts.itemBasic.itemStack.getItem(), 1, 5), new ItemStack(TFCItems.leadIngot));
		}
}

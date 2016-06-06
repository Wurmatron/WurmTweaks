package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermaldynamics.duct.TDDucts;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.item.ItemStack;
import powercrystals.powerconverters.PowerConverterCore;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.powerconverter.PowerConverterHelper;

public class PowerConverterRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "PowerConverters")
		public static void addRecipes () {
				r.addShaped(new ItemStack(PowerConverterCore.converterBlockCommon, 1, 0), "XAX", "CBC", "XAX", 'X', WurmTweaksItems.ingotEnergyReactor, 'A', "packCloth", 'C', TFCItems.zincSheet, 'B', WurmTweaksItems.itemQuantumSingularity);
				r.addShaped(new ItemStack(PowerConverterHelper.getPowerType("rf"), 1, 0), "XAX", "CBC", "XAX", 'X', WurmTweaksItems.ingotEnergyReactor, 'A', new ItemStack(TDDucts.fluidBasic.itemStack.getItem(), 1, 4), 'C', TFCItems.zincSheet, 'B', WurmTweaksItems.itemCraftingCore);
				r.addShapeless(new ItemStack(PowerConverterHelper.getPowerType("rf"), 1, 1), new ItemStack(PowerConverterHelper.getPowerType("rf"), 1, 0));
				r.addShapeless(new ItemStack(PowerConverterHelper.getPowerType("rf"), 1, 0), new ItemStack(PowerConverterHelper.getPowerType("rf"), 1, 1));
				r.addShaped(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 0), "XAX", "CBC", "XAX", 'X', WurmTweaksItems.ingotEnergyReactor, 'A', ic2.api.item.IC2Items.getItem("tinCableItem"), 'C', TFCItems.zincSheet, 'B', WurmTweaksItems.ingotEnergyReactor);
				r.addShapeless(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 1), new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 0));
				r.addShapeless(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 4), new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 3));
				r.addShaped(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 2), "XAX", "CBC", "XAX", 'X', WurmTweaksItems.ingotEnergyReactor, 'A', ic2.api.item.IC2Items.getItem("insulatedTinCableItem"), 'C', TFCItems.zincSheet, 'B', WurmTweaksItems.ingotEnergyReactor);
				r.addShapeless(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 3), new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 2));
				r.addShaped(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 4), "XAX", "CBC", "XAX", 'X', WurmTweaksItems.ingotEnergyReactor, 'A', ic2.api.item.IC2Items.getItem("insulatedCopperCableItem"), 'C', TFCItems.zincSheet, 'B', WurmTweaksItems.ingotEnergyReactor);
				r.addShapeless(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 5), new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 4));
				r.addShapeless(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 4), new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 5));
				r.addShaped(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 6), "XAX", "CBC", "XAX", 'X', WurmTweaksItems.ingotEnergyReactor, 'A', ic2.api.item.IC2Items.getItem("insulatedGoldCableItem"), 'C', TFCItems.zincSheet, 'B', WurmTweaksItems.ingotEnergyReactor);
				r.addShapeless(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 7), new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 6));
				r.addShapeless(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 8), new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 7));
				r.addShaped(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 8), "XAX", "CBC", "XAX", 'X', WurmTweaksItems.ingotEnergyReactor, 'A', ic2.api.item.IC2Items.getItem("glassFiberCableItem"), 'C', TFCItems.zincSheet, 'B', WurmTweaksItems.ingotEnergyReactor);
				r.addShapeless(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 9), new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 8));
				r.addShapeless(new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 8), new ItemStack(PowerConverterHelper.getPowerType("eu"), 1, 9));
		}
}

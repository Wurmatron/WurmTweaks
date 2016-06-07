package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import solarexpansion.init.SEGameObjects;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class SolarExpansionRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "SolarExpansion")
		public static void addRecipes () {
				r.addShaped(new ItemStack(SEGameObjects.PhotovoltaicCell), "GGG", "SXS", "BBB", 'G', "packGlass", 'S', new ItemStack(TFCItems.silverIngot), 'X', WurmTweaksItems.itemSolarCore, 'B', "packSmoothStone");
				r.addShaped(new ItemStack(SEGameObjects.SolarCoreLeadstone), " L ", "LIL", " L ", 'L', WurmTweaksItems.ingotBrownSteel, 'I', new ItemStack(TFCItems.blackSteelIngot));
				r.addShaped(new ItemStack(SEGameObjects.SolarCoreHardened), " L ", "LIL", " L ", 'L', new ItemStack(TFCItems.nickelIngot), 'I', SEGameObjects.SolarCoreLeadstone);
				r.addShaped(new ItemStack(SEGameObjects.SolarCoreRedstone), " L ", "LIL", " L ", 'L', WurmTweaksItems.ingotOrangeSteel, 'I', SEGameObjects.SolarCoreHardened);
				r.addShaped(new ItemStack(SEGameObjects.SolarCoreResonant), " L ", "LIL", " L ", 'L', TFItems.ingotEnderium, 'I', SEGameObjects.SolarCoreRedstone);
				r.addShaped(new ItemStack(SEGameObjects.SolarCoreAdvanced), " L ", "LIL", " L ", 'L', WurmTweaksItems.gearMixedSheet, 'I', SEGameObjects.SolarCoreResonant);
				r.addShaped(new ItemStack(SEGameObjects.SolarCoreUltimate), " L ", "LIL", " L ", 'L', new ItemStack(ExtraUtils.bedrockiumBlock), 'I', SEGameObjects.SolarCoreAdvanced);
				r.addShaped(new ItemStack(SEGameObjects.SolarPanelLeadstone), "SSS", "RCR", "III", 'S', SEGameObjects.PhotovoltaicCell, 'R', new ItemStack(Items.redstone), 'C', SEGameObjects.SolarCoreLeadstone, 'I', "packCloth");
				r.addShaped(new ItemStack(SEGameObjects.SolarPanelHardened), "SSS", "SCS", "SSS", 'S', SEGameObjects.SolarPanelLeadstone, 'C', SEGameObjects.SolarCoreHardened);
				r.addShaped(new ItemStack(SEGameObjects.SolarPanelRedstone), "SSS", "SCS", "SSS", 'S', SEGameObjects.SolarPanelHardened, 'C', SEGameObjects.SolarCoreRedstone);
				r.addShaped(new ItemStack(SEGameObjects.SolarPanelResonant), "SSS", "SCS", "SSS", 'S', SEGameObjects.SolarPanelRedstone, 'C', SEGameObjects.SolarCoreResonant);
				r.addShaped(new ItemStack(SEGameObjects.SolarPanelAdvanced), "SSS", "SCS", "SSS", 'S', SEGameObjects.SolarPanelResonant, 'C', SEGameObjects.SolarCoreAdvanced);
				r.addShaped(new ItemStack(SEGameObjects.SolarPanelUltimate), "SSS", "SCS", "SSS", 'S', SEGameObjects.SolarPanelAdvanced, 'C', SEGameObjects.SolarCoreUltimate);
		}
}

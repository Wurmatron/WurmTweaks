package wurmcraft.wurmatron.common.recipes.mods;

import advsolar.common.AdvancedSolarPanel;
import advsolar.utils.MTRecipeManager;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;


/**
 * Recipes Verified by Wurmatron
 * on 6/3/2016 with v3.2.1
 */
public class AdvancedSolarPanelRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "AdvancedSolarPanel")
		public static void addRecipes () {
				LogHandler.info("Adding recipes for Advanced solar panels");
				r.addShaped(new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 0), "GGG", "BCB", "XSX", 'G', AdvancedSolarPanel.itemIrradiantGlassPane, 'B', IC2Items.getItem("advancedMachine"), 'C', WurmTweaksItems.itemSolarCore, 'X', IC2Items.getItem("advancedCircuit"), 'S', IC2Items.getItem("solarPanel"));
				r.addShaped(new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 1), "SXS", "BCB", "PGP", 'S', TFCItems.platinumSheet2x, 'X', AdvancedSolarPanel.itemIrradiantReinforcedPlate, 'B', IC2Items.getItem("advancedMachine"), 'C', new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 0), 'P', WurmTweaksItems.itemCraftingCore, 'G', WurmTweaksItems.ingotGreenSteel);
				r.addCircleWCenter(new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 2), new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 1), AdvancedSolarPanel.itemEnrichedSunnariumAlloy);
				r.addCircleWCenter(new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 3), new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 2), AdvancedSolarPanel.itemQuantumCore);
				r.addBasicMachineRecipe(AdvancedSolarPanel.blockMolecularTransformer, IC2Items.getItem("advancedMachine"), IC2Items.getItem("evTransformer"), WurmTweaksItems.ingotEnergyReactor, AdvancedSolarPanel.itemMTCore);
				r.addShapeless(new ItemStack(AdvancedSolarPanel.advancedSolarHelmet), new ItemStack(IC2Items.getItem("nanoHelmet").getItem(), 1, OreDictionary.WILDCARD_VALUE), new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 0));
				r.addShapeless(new ItemStack(AdvancedSolarPanel.hybridSolarHelmet), new ItemStack(IC2Items.getItem("quantumHelmet").getItem(), 1, OreDictionary.WILDCARD_VALUE), new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 1));
				r.addShapeless(new ItemStack(AdvancedSolarPanel.ultimateSolarHelmet), new ItemStack(IC2Items.getItem("quantumHelmet").getItem(), 1, OreDictionary.WILDCARD_VALUE), new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 2));
				r.addShaped(AdvancedSolarPanel.itemIrradiantGlassPane, "GGG", "IXI", "GGG", 'G', "packGlass", 'I', AdvancedSolarPanel.itemIrradiantUranium, 'X', IC2Items.getItem("advancedAlloy"));
				r.addShaped(AdvancedSolarPanel.itemIrradiantGlassPane, "GGG", "IXI", "GGG", 'G', IC2Items.getItem("reinforcedGlass").getItem(), 'I', AdvancedSolarPanel.itemIrradiantUranium, 'X', IC2Items.getItem("advancedAlloy"));
				r.addCrossWCenter(AdvancedSolarPanel.itemQuantumCore, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.ingotGreenSteel, new ItemStack(TFCItems.unknownIngot));
				r.addCross(AdvancedSolarPanel.itemMTCore, IC2Items.getItem("advancedAlloy"), AdvancedSolarPanel.itemQuantumCore);
				r.add3X(AdvancedSolarPanel.itemSunnarium, AdvancedSolarPanel.itemSunnariumPart);
				r.addCircleWCenter(AdvancedSolarPanel.itemEnrichedSunnarium, AdvancedSolarPanel.itemSunnarium, AdvancedSolarPanel.itemIrradiantUranium);
				r.addCircleWCenter(AdvancedSolarPanel.itemEnrichedSunnariumAlloy, IC2Items.getItem("iridiumPlate"), AdvancedSolarPanel.itemEnrichedSunnarium);
				addMolecularTransformerRecipes();
				// TODO Quantum Generator Recipe
		}

		@Optional.Method (modid = "AdvancedSolarPanel")
		public static void addMolecularTransformerRecipes () {
				MTRecipeManager.transformerRecipes.clear();
				LogHandler.info("Adding Molecular Transformer recipes");
				MTRecipeManager.instance.addMTRecipe(new ItemStack(Items.glowstone_dust), AdvancedSolarPanel.itemSunnariumPart, 1000000);
				MTRecipeManager.instance.addMTRecipe(new ItemStack(Blocks.glowstone), AdvancedSolarPanel.itemSunnarium, 9000000);
				MTRecipeManager.instance.addMTOreDict("packIngot", AdvancedSolarPanel.itemIrradiantUranium, 10000000);
				MTRecipeManager.instance.addMTRecipe(WurmTweaksItems.ingotGreenSteel, new ItemStack(Items.skull, 1, 1), 1000000000);
				MTRecipeManager.instance.addMTRecipe(new ItemStack(TFCItems.platinumIngot), new ItemStack(TFCItems.nickelIngot, 2), 100000);
				MTRecipeManager.instance.addMTRecipe(new ItemStack(Items.skull, 3, 1), new ItemStack(Items.nether_star), 1000000000);
		}
}

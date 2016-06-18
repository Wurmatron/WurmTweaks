package wurmcraft.wurmatron.common.recipes;

import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import mekanism.common.recipe.RecipeHandler;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import tconstruct.library.TConstructRegistry;
import vazkii.botania.api.BotaniaAPI;
import wurmcraft.wurmatron.common.recipes.mods.*;
import wurmcraft.wurmatron.common.utils.LogHandler;

import java.util.ArrayList;

public class Recipes {

		public static ArrayList<ShapedOreRecipe> shapedRecipes = new ArrayList<ShapedOreRecipe>();
		public static ArrayList<ShapelessOreRecipe> shapelessRecipes = new ArrayList<ShapelessOreRecipe>();

		public static void init () {
				LogHandler.info("Removing all the games recipes and smelting recipes");
				CraftingManager.getInstance().getRecipeList().clear();
				FurnaceRecipes.smelting().getSmeltingList().clear();
				if (RecipeChecker.modExists("Avaritia"))
						ExtremeCraftingManager.getInstance().getRecipeList().clear();
				if (RecipeChecker.modExists("Botania")) {
						BotaniaAPI.elvenTradeRecipes.clear();
						BotaniaAPI.manaInfusionRecipes.clear();
						BotaniaAPI.petalRecipes.clear();
						BotaniaAPI.runeAltarRecipes.clear();
				}
				if (RecipeChecker.modExists("Mekanism")) {
						RecipeHandler.Recipe.METALLURGIC_INFUSER.get().clear();
						RecipeHandler.Recipe.ENRICHMENT_CHAMBER.get().clear();
						RecipeHandler.Recipe.CRUSHER.get().clear();
						RecipeHandler.Recipe.PURIFICATION_CHAMBER.get().clear();
						RecipeHandler.Recipe.CHEMICAL_INJECTION_CHAMBER.get().clear();
						RecipeHandler.Recipe.CHEMICAL_CRYSTALLIZER.get().clear();
						RecipeHandler.Recipe.CHEMICAL_WASHER.get().clear();
						RecipeHandler.Recipe.CHEMICAL_INJECTION_CHAMBER.get().clear();
						RecipeHandler.Recipe.CHEMICAL_DISSOLUTION_CHAMBER.get().clear();
				}
				if (RecipeChecker.modExists("IC2")) {
						ic2.api.recipe.Recipes.metalformerExtruding.getRecipes().clear();
						ic2.api.recipe.Recipes.metalformerRolling.getRecipes().clear();
						ic2.api.recipe.Recipes.metalformerCutting.getRecipes().clear();
						ic2.api.recipe.Recipes.centrifuge.getRecipes().clear();
						ic2.api.recipe.Recipes.compressor.getRecipes().clear();
						ic2.api.recipe.Recipes.extractor.getRecipes().clear();
				}
				if (RecipeChecker.modExists("techreborn"))
						techreborn.api.recipe.RecipeHandler.recipeList.clear();
				if (RecipeChecker.modExists("TConstruct")) {
						TConstructRegistry.getTableCasting().getCastingRecipes().clear();
						TConstructRegistry.getBasinCasting().getCastingRecipes().clear();
				}
				OreDict.init();
				SmeltingRecipes.init();
				LogHandler.info("Adding custom recipes");
				VinilaRecipes.addRecipes();
				TerrafirmacraftRecipes.addRecipes();
				WurmTweaksRecipes.addRecipes();
				if (RecipeChecker.modExists("AdvancedSolarPanel"))
						AdvancedSolarPanelRecipes.addRecipes();
				if (RecipeChecker.modExists("arsmagica2"))
						AM2Recipes.addRecipes();
				if (RecipeChecker.modExists("appliedenergistics2"))
						AERecipes.addRecipes();
				if (RecipeChecker.modExists("Avaritia"))
						AvaritiaRecipes.addRecipes();
				if (RecipeChecker.modExists("BigReactors"))
						BigReactorRecipes.addRecipes();
				if (RecipeChecker.modExists("AWWayofTime"))
						BloodMagicRecipes.addRecipes();
				if (RecipeChecker.modExists("botania"))
						BotaniaRecipes.addRecipes();
				if (RecipeChecker.modExists("Buildcraft|Core"))
						BuildcraftRecipes.addRecipes();
				if (RecipeChecker.modExists("chisel"))
						Chisel2Recipies.addRecipes();
				if (RecipeChecker.modExists("ComputerCraft"))
						ComputerCraftRecipes.addRecipes();
				if (RecipeChecker.modExists("CraftHeraldry"))
						CraftHeraldryRecipies.addRecipes();
				if (RecipeChecker.modExists("CarpentersBlocks"))
						CarpentersBlockRecipes.addRecipes();
				if (RecipeChecker.modExists("props"))
						DecoCraftRecipes.addRecipes();
				if (RecipeChecker.modExists("DraconicEvolution"))
						DraconicEvolutionRecipes.addRecipes();
				if (RecipeChecker.modExists("IronChest"))
						IronChestRecipes.addRecipes();
				if (RecipeChecker.modExists("EnderIO"))
						EnderIORecipes.addRecipes();
				if (RecipeChecker.modExists("EnderStorage"))
						EnderStorageRecipes.addRecipes();
				if (RecipeChecker.modExists("extracells"))
						ExtraCellsRecipes.addRecipes();
				if (RecipeChecker.modExists("ExtraUtilities"))
						ExtraUtilsRecipes.addRecipes();
				if (RecipeChecker.modExists("GraviSuite"))
						GravitySuitRecipes.addRecipes();
				if (RecipeChecker.modExists("GalaticraftCore"))
						GalaticCraftRecipes.addRecipes();
				if (RecipeChecker.modExists("ImmersiveEngineering"))
						ImmersiveEngineeringRecipes.addRecipes();
				if (RecipeChecker.modExists("IC2"))
						IC2Recipes.addRecipes();
				if (RecipeChecker.modExists("JABBA"))
						JABBARecipes.addRecipes();
				if (RecipeChecker.modExists("malisisdoors"))
						MalisisDoorsRecipes.addRecipes();
				if (RecipeChecker.modExists("Mekanism"))
						MekanismRecipes.addRecipes();
				if (RecipeChecker.modExists("MineFactoryReloaded"))
						MinefactoryReloadedRecipes.addRecipes();
				if (RecipeChecker.modExists("OpenBlocks"))
						OpenBlocksRecipes.addRecipes();
				if (RecipeChecker.modExists("OpenComputers"))
						OpenComputersRecipes.addRecipes();
				if (RecipeChecker.modExists("openmodularturrets"))
						OpenModularTurretsRecipes.addRecipes();
				if (RecipeChecker.modExists("PowerConverters"))
						PowerConverterRecipes.addRecipes();
				if (RecipeChecker.modExists("QuarryPlus"))
						QuarryPlusRecipes.addRecipes();
				if (RecipeChecker.modExists("Railcraft"))
						RailCraftRecipes.addRecipes();
				if (RecipeChecker.modExists("tinker_io"))
						TinkerIORecipes.addRecipes();
				if (RecipeChecker.modExists("shincolle"))
						ShinColleRecipes.addRecipes();
				if (RecipeChecker.modExists("weightingscales"))
						TerraFirmaCraftScalesRecipes.addRecipes();
				if (RecipeChecker.modExists("tfccellars"))
						TerraFirmaCraftCellarsRecipes.addRecipes();
				if (RecipeChecker.modExists("simplyjetpacks"))
						SimplyJetpacksRecipes.addRecipes();
				if (RecipeChecker.modExists("WR-CBE|Core"))
						WirelessRedstoneRecipes.addRecipes();
				if (RecipeChecker.modExists("tfcm"))
						TerraFirmaCraftMiscRecipes.addRecipes();
				if (RecipeChecker.modExists("SolarExpansion"))
						SolarExpansionRecipes.addRecipes();
				if (RecipeChecker.modExists("TConstruct"))
						TConstructRecipes.addRecipes();
				if (RecipeChecker.modExists("techreborn"))
						TechRebornRecipes.addRecipes();
				if (RecipeChecker.modExists("Thaumcraft"))
						ThaumcraftRecipes.addRecipes();
				if (RecipeChecker.modExists("ThermalDynamics"))
						ThermalDynamicsRecipes.addRecipes();
				if (RecipeChecker.modExists("ThermalExpansion"))
						ThermalExpansionRecipes.addRecipes();
				if (RecipeChecker.modExists("BiblioWoodsTFC"))
						BibliocraftTFCRecipes.addRecipes();
				if (RecipeChecker.modExists("Ztones"))
						ZTonesRecipes.addRecipes();
				if (RecipeChecker.modExists("soulshardstow"))
						SoulShardsRecipes.addRecipes();
				if (RecipeChecker.modExists("IC2NuclearControl"))
						IC2NuclearControlRecipes.addRecipes();
				if (RecipeChecker.modExists("Thaumcraft"))
						ThaumcraftRecipes.addRecipes();
				if (RecipeChecker.modExists("irontank"))
						IronTankRecipes.addRecipes();
				if (RecipeChecker.modExists("CompactMachines"))
						CompactMachinesRecipes.addRecipes();
				if (RecipeChecker.modExists("LogisticsPipes"))
						LogisticsPipesRecipes.addRecipes();
				if (RecipeChecker.modExists("ProjRed"))
						ProjectRedRecipes.addRecipes();
				if (RecipeChecker.modExists("powersuits"))
						PowerSuitRecipes.addRecipes();
				if (RecipeChecker.modExists("RouterReborn"))
						RouterRebornRecipes.addRecipes();
				if (RecipeChecker.modExists("interdictionpillar"))
						InterdictionPillarRecipes.addRecipes();
				if (RecipeChecker.modExists("qCraft"))
						qCraftRecipes.addRecipes();
				if (RecipeChecker.modExists("academy-craft"))
						AcademyCraftRecipes.addRecipes();
				if (RecipeChecker.modExists("EMT"))
						ElectroMagicRecipes.addRecipes();
				if (RecipeChecker.modExists("ThaumicTinkerer"))
						ThamicTinkersRecipes.addRecipes();
				if (RecipeChecker.modExists("RefinedRelocation"))
						RefinedRelocationRecipes.addRecipes();
		}

		public static void checkSettings () {
				LogHandler.info("Checking Recipes for issues");
				for (ShapedOreRecipe r : shapedRecipes)
						if (!CraftingManager.getInstance().getRecipeList().contains(r))
								new RecipeHelper().addShaped(r.getRecipeOutput(), r.getInput());
				for (ShapelessOreRecipe r : shapelessRecipes)
						if (!CraftingManager.getInstance().getRecipeList().contains(r))
								new RecipeHelper().addShapeless(r.getRecipeOutput(), r.getInput());
				LogHandler.info("Done checking recipes");
		}
}

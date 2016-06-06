package wurmcraft.wurmatron.common.recipes;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
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
				OreDict.init();
				SmeltingRecipes.init();
				LogHandler.info("Adding custom recipes");
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
				if(RecipeChecker.modExists("GraviSuite"))
						GravitySuitRecipes.addRecipes();
				if(RecipeChecker.modExists("GalaticraftCore"))
						GravitySuitRecipes.addRecipes();
				if(RecipeChecker.modExists("ImmersiveEngineering"))
						ImmersiveEngineeringRecipes.addRecipes();
				if(RecipeChecker.modExists("IC2"))
						IC2Recipes.addRecipes();
				if(RecipeChecker.modExists("JABBA"))
						JABBARecipes.addRecipes();
				if(RecipeChecker.modExists("malisisdoors"))
						MalisisDoorsRecipes.addRecipes();
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

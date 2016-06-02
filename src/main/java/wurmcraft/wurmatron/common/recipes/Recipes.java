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
				new TerrafirmacraftRecipes().addRecipes();
				new WurmTweaksRecipes().addRecipes();
				if (RecipeChecker.modExists("AdvancedSolarPanel"))
						new AdvancedSolarPanelRecipes().addRecipes();
				if (RecipeChecker.modExists("arsmagica2"))
						new AM2Recipes().addRecipes();
				if (RecipeChecker.modExists("appliedenergistics2"))
						new AERecipes().addRecipes();
				if (RecipeChecker.modExists("Avaritia"))
						new AvaritiaRecipes().addRecipes();
				if (RecipeChecker.modExists("BigReactors"))
						new BigReactorRecipes().addRecipes();
				if (RecipeChecker.modExists("BloodMagic"))
						new BloodMagicRecipes().addRecipes();
				if (RecipeChecker.modExists("botania"))
						new BotaniaRecipes().addRecipes();
				if (RecipeChecker.modExists("Buildcraft|Core"))
						new BuildcraftRecipes().addRecipes();
				if (RecipeChecker.modExists("chisel"))
						new Chisel2Recipies().addRecipes();
				if (RecipeChecker.modExists("ComputerCraft"))
						new ComputerCraftRecipes().addRecipes();
				if (RecipeChecker.modExists("CraftHeraldry"))
						new CraftHeraldryRecipies().addRecipes();
				if (RecipeChecker.modExists("props"))
						new DecoCraftRecipes().addRecipes();
				if(RecipeChecker.modExists("DraconicEvolution"))
						new DraconicEvolutionRecipes().addRecipes();
				if(RecipeChecker.modExists("IronChest"))
						new IronChestRecipes().addRecipes();
				if(RecipeChecker.modExists("EnderIO"))
						new EnderIORecipes().addRecipes();
				if(RecipeChecker.modExists("EnderStorage"))
						new EnderStorageRecipes().addRecipes();
		}

		public static void checkSettings () {
				LogHandler.info("Checking Recipes for issues");
				for (ShapedOreRecipe r : shapedRecipes)
						if (!CraftingManager.getInstance().getRecipeList().contains(r))
								RecipeHelper.instance.addShaped(r.getRecipeOutput(), r.getInput());
				for (ShapelessOreRecipe r : shapelessRecipes)
						if (!CraftingManager.getInstance().getRecipeList().contains(r))
								RecipeHelper.instance.addShapeless(r.getRecipeOutput(), r.getInput());
				LogHandler.info("Done checking recipes");
		}

}

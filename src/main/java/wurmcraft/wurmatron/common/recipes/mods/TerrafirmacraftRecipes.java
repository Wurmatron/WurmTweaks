package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.Core.Recipes;
import cpw.mods.fml.common.Optional;
import wurmcraft.wurmatron.api.IModRecipes;

public class TerrafirmacraftRecipes implements IModRecipes {

		@Optional.Method (modid = "terrafirmacraft")
		@Override
		public void addRecipes () {
				Recipes.registerRecipes();
		}
}

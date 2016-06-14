package wurmcraft.wurmatron.common.utils.thaumcraft;

import modtweaker2.mods.thaumcraft.handlers.Research;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.IEssentiaContainerItem;
import thaumcraft.common.config.ConfigItems;

import java.util.Arrays;

public class ThaumcraftHelper {

		public static void addShaped (String key, ItemStack output, AspectList aspects, Object... recipe) {
				ThaumcraftApi.addArcaneCraftingRecipe(key, output, aspects, recipe);
				refreshResearch(key);
		}

		public static void addShapeless (String key, ItemStack output, AspectList aspects, Object... recipe) {
				ThaumcraftApi.addShapelessArcaneCraftingRecipe(key, output, aspects, recipe);
				refreshResearch(key);
		}

		public static void addInfusion (String key, ItemStack output, int instability, AspectList aspects, ItemStack center, ItemStack[] items) {
				ThaumcraftApi.addInfusionCraftingRecipe(key, output, instability, aspects, center, items);
				refreshResearch(key);
		}

		public static void addCrucible (String key, ItemStack output, ItemStack catalyst, AspectList aspects) {
				ThaumcraftApi.addCrucibleRecipe(key, output, catalyst, aspects);
				refreshResearch(key);
		}

		public static void addAspects (ItemStack stack, AspectList aspects) {
				ThaumcraftApi.objectTags.put(Arrays.asList(stack.getItem(), stack.getItemDamage()), aspects);
		}

		public static ItemStack setBottleAspects (AspectList aspectList) {
				ItemStack bottle = new ItemStack(ConfigItems.itemEssence, 1, 1);
				(((IEssentiaContainerItem) bottle.getItem())).setAspects(bottle, (aspectList));
				return bottle;
		}

		public static void refreshResearch (String input) {
				Research.refreshResearchRecipe(input);
		}

		public static void removeResearch (String key) {
				Research.orphanResearch(key);
				Research.removeResearch(key);
		}

		public static void removeTab(String name) {
				Research.removeTab(name);
		}
}

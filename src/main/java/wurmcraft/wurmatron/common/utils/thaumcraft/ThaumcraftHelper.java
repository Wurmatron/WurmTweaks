package wurmcraft.wurmatron.common.utils.thaumcraft;

import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.IEssentiaContainerItem;
import thaumcraft.common.config.ConfigItems;

import java.util.Arrays;

public class ThaumcraftHelper {

		public static void addShaped (String key, ItemStack output, AspectList aspects, Object... recipe) {
				ThaumcraftApi.addArcaneCraftingRecipe(key, output, aspects, recipe);
		}

		public static void addShapeless (String key, ItemStack output, AspectList aspects, Object... recipe) {
				ThaumcraftApi.addShapelessArcaneCraftingRecipe(key, output, aspects, recipe);
		}

		public static void addInfusion (String key, ItemStack output, int instability, AspectList aspects, ItemStack center, ItemStack[] items) {
				ThaumcraftApi.addInfusionCraftingRecipe(key, output, instability, aspects, center, items);
		}

		public static void addCrucible (String key, ItemStack output, ItemStack catalyst, AspectList aspects) {
				ThaumcraftApi.addCrucibleRecipe(key, output, catalyst, aspects);
		}

		public static void addAspects (ItemStack stack, AspectList aspects) {
				ThaumcraftApi.objectTags.put(Arrays.asList(stack.getItem(), stack.getItemDamage()), aspects);
		}

		public static ItemStack setBottleAspects(AspectList aspectList) {
				ItemStack bottle = new ItemStack(ConfigItems.itemEssence, 1, 1);
				(((IEssentiaContainerItem)bottle.getItem())).setAspects(bottle, (aspectList));
				return bottle;
		}
}

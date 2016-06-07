package wurmcraft.wurmatron.common.recipes.mods;

import com.whammich.sstow.block.BlockCage;
import com.whammich.sstow.item.ItemMaterials;
import com.whammich.sstow.item.ItemSoulSword;
import com.whammich.sstow.shade.lib.util.helper.BlockHelper;
import com.whammich.sstow.shade.lib.util.helper.ItemHelper;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.nbt.ItemNBT;

public class SoulShardsRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "soulshardstow")
		public static void addRecipes () {
				GameRegistry.addSmelting(Blocks.soul_sand, ItemMaterials.getStack("dustVile"), 0.4F);
				r.addShaped(ItemMaterials.getStack("ingotCorrupted"), "EVE", "VIV", "EVE", 'E', "dustCorrupted", 'I', WurmTweaksItems.ingotBrownSteel, 'V', "dustVile");
				r.addShapeless(ItemMaterials.getStack("dustCorrupted"), "dyeBlue", Items.redstone, Blocks.obsidian, Blocks.obsidian);
				r.addShaped(ItemNBT.addDamage(new ItemStack(ItemHelper.getItem(ItemSoulSword.class)), 825), "I", "I", "S", 'I', ItemMaterials.getStack("ingotCorrupted"), 'S', "packStick");
				r.addBasicMachineRecipe(new ItemStack(BlockHelper.getBlock(BlockCage.class)), ItemMaterials.getStack("ingotCorrupted"), WurmTweaksItems.itemBloodInfused, ItemMaterials.getStack("ingotCorrupted"), WurmTweaksItems.itemMachineFrame);
		}
}

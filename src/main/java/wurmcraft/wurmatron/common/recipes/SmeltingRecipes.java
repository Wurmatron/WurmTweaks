package wurmcraft.wurmatron.common.recipes;


import com.cricketcraft.chisel.init.ChiselBlocks;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;

public class SmeltingRecipes {

		public static void init () {
				FurnaceRecipes.smelting().getSmeltingList().clear();
				if (RecipeChecker.modExists("chisel"))
						addChiselSmelting();
		}

		@Optional.Method (modid = "chisel")
		private static final void addChiselSmelting () {
				for (ItemStack block : OreDictionary.getOres("packGravel"))
						add(block, new ItemStack(ChiselBlocks.concrete));
		}

		private static void add (ItemStack input, ItemStack output) {
				GameRegistry.addSmelting(input, output, 1f);
		}

		private static void add (Item input, ItemStack output) {
				GameRegistry.addSmelting(input, output, 1f);
		}

		private static void add (Block input, ItemStack output) {
				GameRegistry.addSmelting(input, output, 1f);
		}
}

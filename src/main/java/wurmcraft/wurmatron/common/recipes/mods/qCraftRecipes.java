package wurmcraft.wurmatron.common.recipes.mods;

import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import dan200.QCraft;
import dan200.qcraft.shared.QBlockRecipe;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.techreborn.TechRebornHelper;

public class qCraftRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				GameRegistry.addRecipe(new QBlockRecipe());
				r.addCrossWCenter(QCraft.Blocks.quantumComputer, WurmTweaksItems.itemQuantumCore, WurmTweaksItems.itemComputationalCore, WurmTweaksItems.itemSpaceModule);
				r.add2X(new ItemStack(QCraft.Blocks.qBlock, 1, 1), QCraft.Items.quantumDust);
				r.addShapeless(new ItemStack(QCraft.Blocks.qBlock, 1, 0), new ItemStack(QCraft.Blocks.qBlock, 1, 1));
				r.addShaped(QCraft.Items.quantumGoggles, "XGX", 'X', QCraft.Blocks.qBlock, 'G', "packGlass");
				r.addShapeless(new ItemStack(QCraft.Items.quantumGoggles, 1, 1), new ItemStack(QCraft.Items.quantumGoggles, 1, 0));
				r.add2X(QCraft.Items.eos, QCraft.Items.quantumDust);
				if (RecipeChecker.modExists("techreborn"))
						addCentrifugeRecipe();
		}

		@Optional.Method (modid = "techreborn")
		private static void addCentrifugeRecipe () {
				TechRebornHelper.addCentrifugeRecipe(WurmTweaksItems.itemQuantumFoam, null, new ItemStack(QCraft.Items.quantumDust, 4), null, null, null, 100, 512);
		}
}

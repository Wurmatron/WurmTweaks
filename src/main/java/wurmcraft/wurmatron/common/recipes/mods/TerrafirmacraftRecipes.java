package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.Core.Recipes;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import crazypants.enderio.EnderIO;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.ic2.ICHelper;
import wurmcraft.wurmatron.common.utils.machines.MachineHelper;

public class TerrafirmacraftRecipes {

		private static RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "terrafirmacraft")
		public static void addRecipes () {
				Recipes.registerRecipes();
				// Recipe created by koolcrafter5 on 6/12/16
				r.addCircleWCenter(WurmTweaksItems.itemPumpkinBits, WurmTweaksItems.itemMixedSheet, "packSeed");
				r.addCircleWCenter(TFCBlocks.pumpkin, WurmTweaksItems.itemPumpkinBits, WurmTweaksItems.itemCraftingCore);
				if (RecipeChecker.modExists("IC2"))
						addCompressorRecipes();
				addMaceratorRecipes();
		}

		@Optional.Method (modid = "IC2")
		private static void addCompressorRecipes () {
				for (int g = 0; g < 4; g++) {
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemRuby, 4, g), new ItemStack(TFCItems.gemRuby, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemSapphire, 4, g), new ItemStack(TFCItems.gemSapphire, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemEmerald, 4, g), new ItemStack(TFCItems.gemEmerald, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemTopaz, 4, g), new ItemStack(TFCItems.gemTopaz, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemTourmaline, 4, g), new ItemStack(TFCItems.gemTourmaline, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemJade, 4, g), new ItemStack(TFCItems.gemJade, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemBeryl, 4, g), new ItemStack(TFCItems.gemBeryl, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemAgate, 4, g), new ItemStack(TFCItems.gemAgate, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemOpal, 4, g), new ItemStack(TFCItems.gemOpal, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemGarnet, 4, g), new ItemStack(TFCItems.gemGarnet, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemJasper, 4, g), new ItemStack(TFCItems.gemJasper, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemAmethyst, 4, g), new ItemStack(TFCItems.gemAmethyst, 1, g + 1));
						ICHelper.addCompressorRecipe(new ItemStack(TFCItems.gemDiamond, 4, g), new ItemStack(TFCItems.gemDiamond, 1, g + 1));
				}
		}

		private static void addMaceratorRecipes () {
				for (int g = 0; g < 4; g++) {
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemRuby, 4, g), new ItemStack(TFCItems.gemRuby, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemSapphire, 4, g), new ItemStack(TFCItems.gemSapphire, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemEmerald, 4, g), new ItemStack(TFCItems.gemEmerald, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemTopaz, 4, g), new ItemStack(TFCItems.gemTopaz, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemTourmaline, 4, g), new ItemStack(TFCItems.gemTourmaline, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemJade, 4, g), new ItemStack(TFCItems.gemJade, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemBeryl, 4, g), new ItemStack(TFCItems.gemBeryl, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemAgate, 4, g), new ItemStack(TFCItems.gemAgate, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemOpal, 4, g), new ItemStack(TFCItems.gemOpal, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemGarnet, 4, g), new ItemStack(TFCItems.gemGarnet, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemJasper, 4, g), new ItemStack(TFCItems.gemJasper, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemAmethyst, 4, g), new ItemStack(TFCItems.gemAmethyst, 1, g + 1), 32, 60, null, 0);
						MachineHelper.addPulveriserRecipes(new ItemStack(TFCItems.gemDiamond, 4, g), new ItemStack(TFCItems.gemDiamond, 1, g + 1), 32, 60, null, 0);
				}
				for (ItemStack sand : OreDictionary.getOres("packSand"))
						MachineHelper.addPulveriserRecipes(new ItemStack(EnderIO.itemMaterial, 1, 0), sand, 32, 200, null, 0);
		}
}

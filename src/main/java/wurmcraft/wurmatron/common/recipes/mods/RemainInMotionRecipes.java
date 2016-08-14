package wurmcraft.wurmatron.common.recipes.mods;

import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import me.planetguy.remaininmotion.base.ToolItemSet;
import me.planetguy.remaininmotion.core.RIMBlocks;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class RemainInMotionRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "JAKJ_RedstoneInMotion")
		public static void addRecipes () {
				r.addWrenchRecipe(ToolItemSet.Types.Screwdriver.Stack(), WurmTweaksItems.ingotTitanium);
				r.addShaped(new ItemStack(RIMBlocks.plainFrame, 4, 0), "PPP", "PIP", "PPP", 'P', WurmTweaksItems.itemAutoCore, 'I', "dyeOrange");
				r.addShaped(new ItemStack(RIMBlocks.Carriage, 4, 1), "PPP", "PIP", "PPP", 'P', WurmTweaksItems.itemAutoCore, 'I', "dyeLime");
				r.addShaped(new ItemStack(RIMBlocks.Carriage, 4, 2), "PPP", "PIP", "PPP", 'P', WurmTweaksItems.itemAutoCore, 'I', "dyeYellow");
				r.addShaped(new ItemStack(RIMBlocks.Carriage, 4, 3), "PPP", "PIP", "PPP", 'P', WurmTweaksItems.itemAutoCore, 'I', "dyeBlue");
				r.addShaped(new ItemStack(RIMBlocks.Carriage, 4, 4), "PPP", "PIP", "PPP", 'P', WurmTweaksItems.itemAutoCore, 'I', "dyePurple");
				r.addShaped(new ItemStack(RIMBlocks.Carriage, 4, 5), "PPP", "PIP", "PPP", 'P', WurmTweaksItems.itemAutoCore, 'I', "dyeRed");
				r.addShaped(new ItemStack(RIMBlocks.CarriageDrive, 1, 0), "GIG", "ICI", "GIG", 'G', "packGemExquisite", 'I', ExtraUtils.bedrockiumBlock, 'C', new ItemStack(RIMBlocks.CarriageDrive, 1, 1));
				r.addShaped(new ItemStack(RIMBlocks.CarriageDrive, 1, 1), "GIG", "ICI", "GIG", 'G', "packGemExquisite", 'I', WurmTweaksBlocks.blockCompressedRedstone, 'C', WurmTweaksBlocks.blockRedSteel);
		}
}

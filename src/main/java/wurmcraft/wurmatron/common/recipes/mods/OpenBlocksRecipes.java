package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import crazypants.enderio.EnderIO;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import openblocks.OpenBlocks;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class OpenBlocksRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method(modid = "OpenBlocks")
		public static void addRecipes () {
				r.addShaped(new ItemStack(OpenBlocks.Blocks.ladder, 1, 0), "LLL", "LTL", "LLL", 'L', new ItemStack(Blocks.ladder), 'T', new ItemStack(Blocks.trapdoor));
				r.addShaped(new ItemStack(OpenBlocks.Blocks.guide, 1, 0), "GGG", "GTG", "GGG", 'G', "packGlass", 'T', new ItemStack(Blocks.torch));
				r.addShaped(new ItemStack(OpenBlocks.Blocks.elevator, 1, 0), "WWW", "WEW", "WWW", 'E', new ItemStack(Items.ender_pearl), 'W', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(OpenBlocks.Blocks.target, 1, 0), "CCC", "CCC", " S ", 'C', "packCloth", 'S', "packStick");
				r.addShaped(new ItemStack(OpenBlocks.Blocks.flag, 1, 0), "CC ", "CC ", "S  ", 'C', "packCloth", 'S', "packStick");
				r.addShaped(new ItemStack(OpenBlocks.Blocks.tank, 1, 0), "IGI", "GGG", "IGI", 'G', "packGlass", 'I', new ItemStack(TFCItems.tinIngot));
				r.addShaped(new ItemStack(OpenBlocks.Blocks.vacuumHopper, 1, 0), " H ", "ECE", "OOO", 'H', new ItemStack(Blocks.hopper), 'E', TFItems.ingotEnderium, 'C', "packChest", 'O', new ItemStack(Blocks.obsidian));
				r.addShaped(new ItemStack(OpenBlocks.Blocks.xpBottler, 1, 0), "PSP", "PCP", "PSP", 'P', new ItemStack(TFCItems.redSteelSheet2x), 'S', new ItemStack(TFCItems.blueSteelSheet2x), 'C', new ItemStack(OpenBlocks.Blocks.tank, 1, 0));
				r.addShaped(new ItemStack(OpenBlocks.Blocks.path, 1, 0), "SS", 'S', "packGlass");
				r.addShaped(new ItemStack(OpenBlocks.Blocks.autoAnvil, 1, 0), "III", "IAI", "RRR", 'I', new ItemStack(TFCItems.steelIngot), 'A', new ItemStack(Blocks.anvil), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(OpenBlocks.Blocks.autoEnchantmentTable, 1, 0), "III", "IAI", "RRR", 'I', new ItemStack(TFCItems.steelIngot), 'A', new ItemStack(Blocks.enchanting_table), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(OpenBlocks.Blocks.xpDrain, 1, 0), "III", "III", "III", 'I', EnderIO.blockDarkIronBars);
				r.addShaped(new ItemStack(OpenBlocks.Blocks.ropeLadder, 1, 0), "SLS", "SLS", "SLS", 'S', new ItemStack(Items.string), 'L', EnderIO.blockDarkSteelLadder);
				r.addShaped(new ItemStack(OpenBlocks.Blocks.paintMixer, 1, 0), "OOO", "ICI", "III", 'O', new ItemStack(Blocks.obsidian), 'I', new ItemStack(TFCItems.bronzeSheet), 'C', new ItemStack(TFCItems.woolCloth));
				r.addShaped(new ItemStack(OpenBlocks.Blocks.canvas, 4, 0), "PPP", "PCP", "PPP", 'P', new ItemStack(Items.paper), 'C', new ItemStack(TFCItems.wroughtIronIngot));
				r.addShaped(new ItemStack(OpenBlocks.Blocks.xpShower, 1, 0), "III", "  O", 'I', new ItemStack(TFCItems.redSteelSheet2x), 'O', new ItemStack(Blocks.obsidian));
				r.addShaped(new ItemStack(OpenBlocks.Items.hangGlider, 1, 0), "GSG", 'S', "packStick", 'G', new ItemStack(OpenBlocks.Items.generic, 1, 0));
				r.addShaped(new ItemStack(OpenBlocks.Items.generic, 1, 10), " P ", "PIP", " P ", 'P', new ItemStack(Items.paper), 'I', new ItemStack(TFCItems.bismuthIngot));
				r.addShaped(new ItemStack(OpenBlocks.Items.generic, 1, 0), " SL", "SLL", "LLL", 'S', "packStick", 'L', new ItemStack(TFCItems.leather));
				r.addShaped(new ItemStack(OpenBlocks.Items.generic, 1, 0), " SL", "SLL", "LLL", 'S', "packStick", 'L',"packCloth");
				r.addShaped(new ItemStack(OpenBlocks.Items.generic, 1, 0), "LS ", "LLS", "LLL", 'S', "packStick", 'L', new ItemStack(TFCItems.leather));
				r.addShaped(new ItemStack(OpenBlocks.Items.generic, 1, 0), "LS ", "LLS", "LLL", 'S', "packStick", 'L', "packCloth");
				r.addShaped(new ItemStack(OpenBlocks.Items.generic, 1, 11), "C  ", " S ", "  S", 'S', "packStick", 'C', new ItemStack(TFCItems.coal));
				r.addShaped(new ItemStack(OpenBlocks.Blocks.drawingTable, 1, 0), "SPS", "ICI", "III", 'S', new ItemStack(OpenBlocks.Items.generic, 1, 10), 'P', new ItemStack(OpenBlocks.Items.generic, 1, 11), 'C', new ItemStack(Blocks.crafting_table), 'I', new ItemStack(TFCItems.bismuthIngot));
				r.addShaped(new ItemStack(OpenBlocks.Items.sleepingBag, 1, 0), "CCC", "PPP", 'C', new ItemStack(TFCItems.silkCloth), 'P', "packPlanks");
				r.addShaped(new ItemStack(OpenBlocks.Items.paintBrush, 1, 0), "C  ", " S ", "  S", 'C', new ItemStack(TFCItems.silkCloth), 'S', "packStick");
				r.addShaped(new ItemStack(OpenBlocks.Items.devNull, 1, 0), "RR ", "S S", " RR", 'R', "packCobble", 'S', TFCItems.redSteelSheet);
				// TODO dev/null + dsu
				r.addShapeless(new ItemStack(OpenBlocks.Blocks.fan, 1, 0), Items.redstone, TFCItems.blueSteelSheet, Items.glowstone_dust);
		}
}

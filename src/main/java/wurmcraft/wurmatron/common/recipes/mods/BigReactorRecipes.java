package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import crazypants.enderio.EnderIO;
import dan200.computercraft.ComputerCraft;
import erogenousbeef.bigreactors.common.BigReactors;
import fox.spiteful.avaritia.items.LudicrousItems;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.api.IModRecipes;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;

public class BigReactorRecipes implements IModRecipes {

		@Optional.Method (modid = "BigReactors")
		@Override
		public void addRecipes () {
				r.addShaped(new ItemStack(BigReactors.blockYelloriumFuelRod, 2), "SXS", "SXS", "SXS", 'S', WurmTweaksItems.itemRadiationShielding, 'X', WurmTweaksItems.ingotYellowSteel);
				r.addShaped(new ItemStack(BigReactors.blockReactorPart, 6, 0), "SSS", "XAX", "SSS", 'S', WurmTweaksItems.itemRadiationShielding, 'X', WurmTweaksItems.ingotYellowSteel, 'A', WurmTweaksBlocks.blockBlueSteel);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 6, 1), WurmTweaksItems.ingotEnergyReactor, WurmTweaksItems.itemRadiationShielding, WurmTweaksItems.ingotYellowSteel, WurmTweaksBlocks.blockCompressedRedstone);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 2), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, TFCItems.copperSheet2x, TFItems.ingotEnderium);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 3), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, TFCItems.copperSheet2x, new ItemStack(ExtraUtils.transferNode, 1, 12));
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 4), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotGreenSteel, "packChest");
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 5), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotGreenSteel, new ItemStack(ExtraUtils.transferNode, 1, 6));
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 6), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotGreenSteel, WurmTweaksBlocks.blockCompressedRedstone);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockReactorPart, 1, 7), new ItemStack(BigReactors.blockReactorPart, 1, 1), WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotGreenSteel, ComputerCraft.Blocks.computer);
				r.addShaped(new ItemStack(BigReactors.blockMultiblockGlass, 6, 0), "GGG", "XAX", "GGG", 'G', EnderIO.blockFusedQuartz, 'X', WurmTweaksItems.ingotYellowSteel, 'A', new ItemStack(BigReactors.ingotGeneric, 1, 8));
				r.addShaped(new ItemStack(BigReactors.blockMultiblockGlass, 6, 1), "GGG", "XAX", "GGG", 'G', new ItemStack(BigReactors.blockMultiblockGlass, 6, 0), 'X', WurmTweaksItems.ingotBrownSteel, 'A', WurmTweaksItems.itemRadiationShielding);
				r.addCrossWCenter(new ItemStack(BigReactors.blockReactorRedstonePort, 1, 0), WurmTweaksItems.ingotYellowSteel, WurmTweaksBlocks.blockCompressedRedstone, WurmTweaksItems.ingotRainbowSteel);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockTurbinePart, 4, 0), WurmTweaksItems.itemRadiationShielding, new ItemStack(BigReactors.ingotGeneric, 1, 8), WurmTweaksItems.ingotGraySteel, WurmTweaksBlocks.blockCompressedRedstone);
				r.addCrossWCenter(new ItemStack(BigReactors.blockTurbinePart, 1, 1), WurmTweaksItems.ingotYellowSteel, WurmTweaksItems.ingotTitanium, new ItemStack(BigReactors.blockReactorPart, 1));
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockTurbinePart, 1, 2), new ItemStack(BigReactors.blockTurbinePart, 1, 0), WurmTweaksItems.ingotYellowSteel, TFCItems.platinumSheet2x, new ItemStack(ExtraUtils.transferNode, 1, 12));
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockTurbinePart, 1, 3), new ItemStack(BigReactors.blockTurbinePart, 1, 0), WurmTweaksItems.ingotYellowSteel, TFCItems.platinumSheet2x, new ItemStack(ExtraUtils.transferNode, 1, 6));
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockTurbinePart, 1, 4), new ItemStack(BigReactors.blockTurbinePart, 1, 0), WurmTweaksItems.ingotYellowSteel, TFCItems.platinumSheet2x, LudicrousItems.matter_cluster);
				r.addBasicMachineRecipe(new ItemStack(BigReactors.blockTurbinePart, 1, 5), new ItemStack(BigReactors.blockTurbinePart, 1, 0), WurmTweaksItems.ingotYellowSteel, TFCItems.platinumSheet2x, ComputerCraft.Blocks.computer);
				r.addShaped(new ItemStack(BigReactors.blockTurbineRotorPart, 4, 0), " X ", "XCX", " X ", 'X', WurmTweaksItems.ingotGraySteel, 'C', WurmTweaksItems.ingotFrancium);
				r.addShaped(new ItemStack(BigReactors.blockTurbineRotorPart, 2, 1), " X ", "XCX", " X ", 'X', WurmTweaksItems.ingotGraySteel, 'C', WurmTweaksItems.ingotGreenSteel);
				r.addShaped(BigReactors.blockDevice, "XAX", "CGC", "CCC", 'X', new ItemStack(BigReactors.ingotGeneric, 1, 8), 'A', WurmTweaksItems.ingotEnergyReactor, 'G', "packGemBlock", 'C', WurmTweaksItems.ingotGraySteel);
				// TODO Creative Collant Port
				// TODO Create Steam Generator
				// TODO Centerfuge Yellorium Recipe
				r.addShapeless(new ItemStack(BigReactors.ingotGeneric, 1, 8), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.itemMagicChunk, ExtraUtils.bedrockium, WurmTweaksItems.itemCraftingCore);
				// TODO Ludicrite Block (:4)
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import blusunrize.immersiveengineering.api.crafting.BlastFurnaceRecipe;
import blusunrize.immersiveengineering.api.crafting.CokeOvenRecipe;
import blusunrize.immersiveengineering.api.crafting.MetalPressRecipe;
import blusunrize.immersiveengineering.api.energy.DieselHandler;
import blusunrize.immersiveengineering.common.IEContent;
import cofh.thermalexpansion.item.TEItems;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

/**
 * Recipes Verified by Wurmatron
 * on 6/10/2016 with 0.7.5
 */
public class ImmersiveEngineeringRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "ImmersiveEngineering")
		public static final void addRecipes () {
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalDevice, 2, 0), WurmTweaksBlocks.blockCopper, TFCItems.bismuthBronzeSheet, Items.redstone, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalDevice, 2, 2), WurmTweaksBlocks.blockPlatinum, TFCItems.goldSheet, Items.redstone, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalDevice, 2, 6), WurmTweaksBlocks.blockPlatinum, TFCItems.platinumSheet, Items.redstone, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalDevice, 1, 1), IEContent.blockTreatedWood, TEItems.capacitorResonant, WurmTweaksBlocks.blockCompressedRedstone, new ItemStack(IEContent.blockMetalDevice, 1, 0));
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalDevice, 1, 3), IEContent.blockTreatedWood, new ItemStack(IEContent.blockMetalDevice, 1, 1), WurmTweaksBlocks.blockCompressedRedstone, new ItemStack(IEContent.blockMetalDevice, 1, 2));
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalDevice, 1, 7), IEContent.blockTreatedWood, new ItemStack(IEContent.blockMetalDevice, 1, 3), WurmTweaksBlocks.blockCompressedRedstone, new ItemStack(IEContent.blockMetalDevice, 1, 6));
				r.addShaped(new ItemStack(IEContent.blockMetalDevice, 1, 4), "L M", "BBB", "XXX", 'L', new ItemStack(IEContent.blockMetalDevice, 1, 0), 'M', new ItemStack(IEContent.blockMetalDevice, 1, 2), 'B', WurmTweaksBlocks.blockCompressedRedstone, 'X', WurmTweaksBlocks.blockSterlingSilver);
				r.addShaped(new ItemStack(IEContent.blockMetalDevice, 1, 5), "XSX", " S ", "XSX", 'S', TFCItems.platinumSheet, 'X', WurmTweaksItems.ingotCyanSteel);
				r.addShaped(new ItemStack(IEContent.blockMetalDevice, 1, 8), "L M", "BBB", "XXX", 'L', new ItemStack(IEContent.blockMetalDevice, 1, 6), 'M', new ItemStack(IEContent.blockMetalDevice, 1, 6), 'B', WurmTweaksBlocks.blockCompressedRedstone, 'X', WurmTweaksBlocks.blockSterlingSilver);
				r.addShaped(new ItemStack(IEContent.blockMetalDevice, 1, 9), "SSS", "XAX", "SSS", 'S', IEContent.blockTreatedWood, 'X', "packCloth", 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(IEContent.blockMetalDevice, 1, 10), "SSS", "XAX", "SSS", 'S', IEContent.blockTreatedWood, 'X', Items.bucket, 'A', WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(IEContent.blockMetalDevice, 4, 11), "SSS", "XAX", 'S', TFCItems.leather, 'X', Items.redstone, 'A', TFCItems.steelSheet);
				r.addCrossWCenter(new ItemStack(IEContent.blockMetalDevice, 1, 12), TFCItems.blackSteelSheet, TFCItems.copperSheet, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalDevice, 1, 13), TFCItems.blackSteelSheet2x, IEContent.blockTreatedWood, Items.redstone, WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(IEContent.blockMetalDevice, 2, 15), "SHS", "XAX", 'H', Blocks.hopper, 'S', TFCItems.leather, 'X', Items.redstone, 'A', TFCItems.steelSheet);
				r.addShapeless(new ItemStack(IEContent.blockMetalDevice2, 1, 0), IEContent.blockTreatedWood, TFCItems.copperSheet2x, Blocks.lever);
				r.addShaped(new ItemStack(IEContent.blockMetalDevice2, 1, 2), " S ", "SXS", "BAB", 'S', TFCItems.copperSheet2x, 'X', WurmTweaksItems.ingotYellowSteel, 'B', WurmTweaksItems.itemMixedSheet, 'A', WurmTweaksItems.itemMachineFrame);
				r.addShapeless(new ItemStack(IEContent.blockMetalDevice2, 1, 3), Blocks.glowstone, IEContent.blockTreatedWood, WurmTweaksItems.itemMachineFrame);
				r.addShapeless(new ItemStack(IEContent.blockMetalDevice2, 1, 4), new ItemStack(IEContent.blockMetalDevice2, 1, 3), WurmTweaksItems.ingotRainbowSteel);
				// TODO Creative Capacitor (500,000rf/t)
				r.addShaped(new ItemStack(IEContent.blockMetalDevice2, 1, 9), "XAX", 'X', new ItemStack(IEContent.blockMetalDevice2, 1, 0), 'A', Items.redstone);
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalDevice2, 1, 10), IEContent.blockTreatedWood, TEItems.capacitorResonant, WurmTweaksBlocks.blockCompressedRedstone, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalDevice2, 1, 11), IEContent.blockTreatedWood, TFCItems.blueSteelBucketLava, WurmTweaksBlocks.blockCompressedRedstone, WurmTweaksItems.itemMachineFrame);
				r.addSlabs(new ItemStack(IEContent.blockMetalDecoration, 12, 0), TFCItems.steelSheet);
				r.addShaped(new ItemStack(IEContent.blockMetalDecoration, 2, 1), "BBB", " X ", "X X", 'B', WurmTweaksBlocks.blockSteel, 'X', new ItemStack(IEContent.blockMetalDecoration, 1, 0));
				r.addShaped(new ItemStack(IEContent.blockMetalDecoration, 2, 2), " I ", "XGX", " I ", 'I', "packIngot", 'X', "packGlass", 'G', Blocks.glowstone);
				r.addStairs(new ItemStack(IEContent.blockMetalDecoration, 4, 3), new ItemStack(IEContent.blockMetalDecoration, 2, 1));
				r.addCrossWCenter(new ItemStack(IEContent.blockMetalDecoration, 1, 4), TFCItems.blackSteelSheet2x, WurmTweaksItems.ingotPinkSteel, TFCItems.redSteelBucketSaltWater);
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalDecoration, 1, 5), new ItemStack(IEContent.blockMetalDecoration, 1, 7), TFCItems.redSteelSheet, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(IEContent.blockMetalDecoration, 2, 6), "SSS", "ABA", "SSS", 'S', TFCItems.blackSteelSheet2x, 'A', WurmTweaksItems.ingotBrownSteel, 'B', IC2Items.getItem("generator"));
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalDecoration, 1, 7), new ItemStack(IEContent.blockMetalDecoration, 1, 1), TFCItems.redSteelSheet, WurmTweaksItems.itemCraftingCore, WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(IEContent.blockMetalDecoration, 1, 8), "AXA", "XXX", 'X', new ItemStack(IEContent.blockMetalDecoration, 1, 1), 'A', new ItemStack(IEContent.blockMetalDecoration, 1, 0));
				r.addShaped(new ItemStack(IEContent.blockMetalDecoration, 1, 9), "AXA", "X X", "X X", 'X', new ItemStack(IEContent.blockMetalDecoration, 1, 1), 'A', new ItemStack(IEContent.blockMetalDecoration, 1, 0));
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalMultiblocks, 1, 0), WurmTweaksItems.ingotYellowSteel, new ItemStack(IEContent.blockMetalDecoration, 1, 1), WurmTweaksBlocks.blockBlackSteel, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalMultiblocks, 1, 2), WurmTweaksItems.gearMixedSheet, Blocks.piston, "packSeed", WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(new ItemStack(IEContent.blockMetalMultiblocks, 1, 3), WurmTweaksItems.gearMixedSheet, Blocks.piston, "dye", WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(IEContent.blockWoodenDevice, 1, 0), "PCP", "PCP", "BBB", 'B', WurmTweaksBlocks.blockCopper, 'P', IEContent.blockTreatedWood, 'C', TFCItems.platinumSheet);
				r.addCrossWCenter(new ItemStack(IEContent.blockWoodenDevice, 1, 1), IEContent.blockTreatedWood, TFCItems.copperSheet2x, new ItemStack(IEContent.itemMaterial, 1, 1));
				r.addSimpleCirc(new ItemStack(IEContent.blockWoodenDevice, 1, 2), new ItemStack(IEContent.itemMaterial, 1, 2), TFCItems.blackSteelSheet2x);
				r.addSimpleCirc(new ItemStack(IEContent.blockWoodenDevice, 1, 3), new ItemStack(IEContent.itemMaterial, 1, 5), TFCItems.blackSteelSheet2x);
				r.addCircle(new ItemStack(IEContent.blockWoodenDevice, 1, 4), IEContent.blockTreatedWood);
				r.addShaped(new ItemStack(IEContent.blockWoodenDevice, 1, 5), "SSS", "T T", 'T', IEContent.blockTreatedWood, 'S', new ItemStack(IEContent.blockWoodenDecoration, 1, 2));
				r.addShaped(new ItemStack(IEContent.blockWoodenDevice, 1, 6), "W W", "W W", "WWW", 'W', IEContent.blockTreatedWood);
				r.addSlabs(new ItemStack(IEContent.blockWoodenDecoration, 1, 1), new ItemStack(IEContent.itemMaterial, 1, 0));
				r.addSlabs(new ItemStack(IEContent.blockWoodenDecoration, 12, 2), IEContent.blockTreatedWood);
				r.addShapeless(new ItemStack(IEContent.blockWoodenDecoration, 1, 4), new ItemStack(IEContent.blockWoodenDecoration, 1, 2));
				r.addShaped(new ItemStack(IEContent.blockWoodenDecoration, 6, 5), "PPP", " S ", "S S", 'P', IEContent.blockTreatedWood, 'S', new ItemStack(IEContent.itemMaterial, 1, 0));
				r.addCircleWCenter(new ItemStack(IEContent.blockTreatedWood, 2, 0), "packLog", new ItemStack(IEContent.itemFluidContainers, 1, 0));
				r.addCircleWCenter(new ItemStack(IEContent.blockTreatedWood, 2, 0), "packLog", new ItemStack(IEContent.itemFluidContainers, 1, 1));
				r.addCrossWCenter(new ItemStack(IEContent.blockStoneDecoration, 2, 1), new ItemStack(TFCItems.fireBrick, 1, 1), "packSmoothStone", TFCItems.blackSteelSheet);
				r.addCrossWCenter(new ItemStack(IEContent.blockStoneDecoration, 1, 2), new ItemStack(TFCItems.fireBrick, 1, 1), "packSmoothStone", TFCItems.redSteelSheet);
				r.addCrossWCenter(new ItemStack(IEContent.blockStoneDecoration, 4, 6), new ItemStack(IEContent.blockStoneDecoration, 1, 2), TFCItems.blackSteelSheet2x, WurmTweaksBlocks.blockSteel);
				r.addShaped(new ItemStack(IEContent.itemMaterial, 1, 7), "LLL", "SSS", "LLL", 'L', TFCItems.steelSheet, 'S', TFCItems.leather);
				r.addSimpleCirc(new ItemStack(IEContent.itemMaterial, 1, 8), TFCItems.blackSteelSheet2x, WurmTweaksItems.ingotGraySteel);
				r.addShaped(new ItemStack(IEContent.itemMaterial, 1, 9), "LL", "CL", "LL", 'L', "packLog", 'C', TFCItems.leather);
				r.addShaped(new ItemStack(IEContent.itemMaterial, 1, 10), "S  ", "SS ", " SS", 'S', TFCItems.blackSteelSheet2x);
				r.addCrossWCenter(new ItemStack(IEContent.itemMaterial, 1, 1), IEContent.blockTreatedWood, WurmTweaksItems.itemMixedSheet, TFCItems.blackSteelSheet2x);
				r.addBasicMachineRecipe(new ItemStack(IEContent.itemMaterial, 1, 2), IEContent.blockTreatedWood, WurmTweaksItems.itemMixedSheet, TFCItems.blackSteelSheet2x, "packCloth");
				r.addSimpleCirc(new ItemStack(IEContent.itemMaterial, 1, 5), IEContent.blockTreatedWood, new ItemStack(IEContent.itemMaterial, 1, 2));
				r.addCircleWCenter(new ItemStack(IEContent.itemWireCoil, 4, 0), TFCItems.copperSheet, "packStick");
				r.addCircleWCenter(new ItemStack(IEContent.itemWireCoil, 8, 4), TFCItems.steelSheet, "packStick");
				r.addCircleWCenter(new ItemStack(IEContent.itemWireCoil, 8, 2), TFCItems.blackSteelSheet, "packStick");
				r.addWrenchRecipe(IEContent.itemTool, IEContent.blockTreatedWood);
				r.addWrenchRecipe(new ItemStack(IEContent.itemTool, 1, 1), TFCItems.bismuthSheet);
				r.addShaped(new ItemStack(IEContent.itemTool, 1, 2), " S ", "TXT", 'S', TFCItems.goldSheet, 'T', new ItemStack(IEContent.itemMaterial, 1, 0), 'X', TFCItems.copperSheet2x);
				r.addShapeless(new ItemStack(IEContent.itemTool, 1, 3), Items.book, Blocks.lever);
				r.addCircleWCenter(IEContent.itemToolbox, IEContent.blockTreatedWood, "packChest");
				r.addShaped(new ItemStack(IEContent.itemRevolver, 1, 0), "SSS", "ASB", "HSH", 'S', WurmTweaksItems.ingotGraySteel, 'A', new ItemStack(IEContent.itemMaterial, 1, 10), 'B', new ItemStack(IEContent.itemMaterial, 1, 7), 'H', new ItemStack(IEContent.itemMaterial, 1, 9));
				r.addShaped(new ItemStack(IEContent.itemRevolver, 1, 1), "  S", "XXS", "  S", 'S', TFCItems.blackSteelSheet, 'X', WurmTweaksItems.ingotGraySteel);
				r.addShaped(new ItemStack(IEContent.itemBullet, 16, 0), "S S", "S S", "SSS", 'S', TFCItems.leadSheet);
				r.addShaped(new ItemStack(IEContent.itemBullet, 4, 1), "S S", "SDS", "SSS", 'S', TFCItems.copperSheet, 'D', "dye");
				r.addShaped(new ItemStack(IEContent.itemBullet, 1, 2), "X", "B", "G", 'X', TFCItems.wroughtIronIngot, 'B', new ItemStack(IEContent.itemBullet, 1, 0), 'G', Items.gunpowder);
				r.addShaped(new ItemStack(IEContent.itemBullet, 2, 2), "XX ", "BB ", "GG ", 'X', TFCItems.wroughtIronIngot, 'B', new ItemStack(IEContent.itemBullet, 1, 0), 'G', Items.gunpowder);
				r.addShaped(new ItemStack(IEContent.itemBullet, 3, 2), "XXX", "BBB", "GGG", 'X', TFCItems.wroughtIronIngot, 'B', new ItemStack(IEContent.itemBullet, 1, 0), 'G', Items.gunpowder);
				r.addShaped(new ItemStack(IEContent.itemBullet, 1, 3), "X", "B", "G", 'X', TFCItems.steelIngot, 'B', new ItemStack(IEContent.itemBullet, 1, 0), 'G', Items.gunpowder);
				r.addShaped(new ItemStack(IEContent.itemBullet, 2, 3), "XX ", "BB ", "GG ", 'X', TFCItems.steelIngot, 'B', new ItemStack(IEContent.itemBullet, 1, 0), 'G', Items.gunpowder);
				r.addShaped(new ItemStack(IEContent.itemBullet, 3, 3), "XXX", "BBB", "GGG", 'X', TFCItems.steelIngot, 'B', new ItemStack(IEContent.itemBullet, 1, 0), 'G', Items.gunpowder);
				r.addShapeless(new ItemStack(IEContent.itemToolUpgrades, 1, 4), TFCItems.blueSteelSword, IEContent.blockTreatedWood);
				r.addShapeless(new ItemStack(IEContent.itemToolUpgrades, 1, 4), TFCItems.redSteelSword, IEContent.blockTreatedWood);
				r.addShaped(new ItemStack(IEContent.itemToolUpgrades, 1, 5), "SSS", "XXX", "SSS", 'S', TFCItems.blackSteelSheet, 'X', new ItemStack(IEContent.itemBullet, 1, 0));
				r.addShaped(new ItemStack(IEContent.itemToolUpgrades, 1, 6), "SSS", "XXX", "SSS", 'S', TFCItems.blackSteelSheet, 'X', TEItems.capacitorHardened);
				r.addShaped(new ItemStack(IEContent.itemToolUpgrades, 1, 7), " SS", "SXB", " SS", 'S', TFCItems.blackSteelSheet2x, 'X', TFCItems.steelSheet, 'B', WurmTweaksItems.ingotGraySteel);
				r.addShapeless(new ItemStack(IEContent.itemToolUpgrades, 1, 8), "packGlass", WurmTweaksItems.itemBloodInfused);
				r.addShaped(new ItemStack(IEContent.itemToolUpgrades, 1, 9), "SSS", "XXX", "SSS", 'S', TFCItems.blackSteelSheet2x, 'X', TEItems.capacitorResonant);
				r.addShaped(new ItemStack(IEContent.itemJerrycan, 4, 0), " S ", "S S", "SSS", 'S', TFCItems.blackSteelSheet);
				r.addBasicMachineRecipe(new ItemStack(IEContent.itemChemthrower, 1, 0), WurmTweaksItems.ingotGraySteel, TFCItems.blackSteelSheet2x, new ItemStack(IEContent.itemJerrycan, 1, 0), WurmTweaksItems.itemCraftingCore);
				r.addBasicMachineRecipe(new ItemStack(IEContent.itemRailgun, 1, 0), WurmTweaksItems.ingotGraySteel, TFCItems.blackSteelSheet2x, WurmTweaksItems.ingotOrangeSteel, WurmTweaksItems.itemCraftingCore);
				addSqueezerRecipes();
				addFermenterRecipes();
				addOvenRecipes();
				addBlastFurnaceRecipes();
				addMetalPress();
		}

		private static void addSqueezerRecipes () {
				DieselHandler.squeezerList.clear();
				for (ItemStack seed : OreDictionary.getOres("packSeed"))
						DieselHandler.addSqueezerRecipe(seed, 600, new FluidStack(IEContent.fluidPlantoil, 120), IC2Items.getItem("plantBall"));
		}

		private static void addFermenterRecipes () {
				DieselHandler.fermenterList.clear();
				for (ItemStack fruit : OreDictionary.getOres("packFruit"))
						DieselHandler.addFermenterRecipe(fruit, 600, new FluidStack(IEContent.fluidEthanol, 360), null);
				for (ItemStack grain : OreDictionary.getOres("packGrain"))
						DieselHandler.addFermenterRecipe(grain, 1200, new FluidStack(IEContent.fluidEthanol, 220), null);
				for (ItemStack vegetable : OreDictionary.getOres("packVegetable"))
						DieselHandler.addFermenterRecipe(vegetable, 800, new FluidStack(IEContent.fluidEthanol, 300), null);
		}

		private static void addOvenRecipes () {
				CokeOvenRecipe.recipeList.clear();
				CokeOvenRecipe.addRecipe(new ItemStack(IEContent.itemMaterial, 1, 6), new ItemStack(TFCItems.coal, 1, 0), 400, 200);
				CokeOvenRecipe.addRecipe(new ItemStack(IEContent.itemMaterial, 1, 6), new ItemStack(TFCItems.coal, 1, 1), 600, 100);
				for (ItemStack log : OreDictionary.getOres("packLog"))
						CokeOvenRecipe.addRecipe(new ItemStack(TFCItems.coal, 1, 1), log, 200, 25);
		}

		private static void addBlastFurnaceRecipes () {
				BlastFurnaceRecipe.recipeList.clear();
				BlastFurnaceRecipe.addRecipe(new ItemStack(TFCItems.steelIngot), TFCItems.wroughtIronIngot, 600, null);
				BlastFurnaceRecipe.addRecipe(new ItemStack(TFCItems.steelIngot), TFCItems.pigIronIngot, 200, null);
				BlastFurnaceRecipe.addRecipe(new ItemStack(WurmTweaksBlocks.blockSteel), WurmTweaksBlocks.blockWroughtIron, 1800, null);
				BlastFurnaceRecipe.addBlastFuel(new ItemStack(TFCItems.coal, 1, 1), 200);
		}

		private static void addMetalPress () {
				MetalPressRecipe.recipeList.clear();
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.bismuthSheet), TFCItems.bismuthIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.bismuthBronzeSheet), TFCItems.bismuthBronzeIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.blackSteelSheet), TFCItems.blackBronzeIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.blackSteelSheet), TFCItems.blackSteelIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.blueSteelSheet), TFCItems.blueSteelIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.bronzeSheet), TFCItems.bronzeIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.copperSheet), TFCItems.copperIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.wroughtIronSheet), TFCItems.wroughtIronIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.redSteelSheet), TFCItems.redSteelSheet, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.roseGoldSheet), TFCItems.roseGoldIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.steelSheet), TFCItems.steelIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.tinSheet), TFCItems.tinIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.zincSheet), TFCItems.zincIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.brassSheet), TFCItems.brassIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.goldSheet), TFCItems.goldIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.leadSheet), TFCItems.leadIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.nickelSheet), TFCItems.nickelIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.pigIronSheet), TFCItems.pigIronIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.platinumSheet), TFCItems.platinumSheet, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.silverSheet), TFCItems.silverIngot, new ItemStack(IEContent.itemMold), 8000);
				MetalPressRecipe.addRecipe(new ItemStack(TFCItems.sterlingSilverSheet), TFCItems.sterlingSilverIngot, new ItemStack(IEContent.itemMold), 8000);
		}
}

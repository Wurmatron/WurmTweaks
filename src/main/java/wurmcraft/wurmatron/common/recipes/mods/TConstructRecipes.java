package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;
import sladki.tfc.ModManager;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.crafting.PatternBuilder;
import tconstruct.library.crafting.Smeltery;
import tconstruct.library.tools.ToolMaterial;
import tconstruct.smeltery.TinkerSmeltery;
import tconstruct.tools.TinkerTools;
import tconstruct.weaponry.TinkerWeaponry;
import tconstruct.world.TinkerWorld;
import terramisc.core.ModItems;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.fluid.WurmTweaksFluid;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.machines.MachineHelper;
import wurmcraft.wurmatron.common.utils.tconstruct.TConstructHelper;
import wurmcraft.wurmatron.common.utils.thermalexpansion.TEHelper;

import java.util.ArrayList;

public class TConstructRecipes {

		private static RecipeHelper r = new RecipeHelper();

		public static Fluid[] TCFluid = {WurmTweaksFluid.fluidCopper, WurmTweaksFluid.fluidBronze, WurmTweaksFluid.fluidBismuthBronze, WurmTweaksFluid.fluidBlackBronze, WurmTweaksFluid.fluidWroughtIron, WurmTweaksFluid.fluidSteel, WurmTweaksFluid.fluidBlackSteel, WurmTweaksFluid.fluidBlueSteel, WurmTweaksFluid.fluidRedSteel, WurmTweaksFluid.fluidPlatinum};

		@Optional.Method (modid = "TConstruct")
		public static void addRecipes () {
				r.addShaped(new ItemStack(TinkerWorld.barricadeBirch, 4), " W ", "WWW", " W ", 'W', new ItemStack(TFCItems.logs, 1, 2));
				r.addShaped(new ItemStack(TinkerWorld.barricadeSpruce, 4), " W ", "WWW", " W ", 'W', new ItemStack(TFCItems.logs, 1, 10));
				r.addShaped(new ItemStack(TinkerWorld.barricadeJungle, 4), " W ", "WWW", " W ", 'W', new ItemStack(TFCItems.logs, 1, 15));
				r.addShaped(new ItemStack(TinkerWorld.barricadeOak, 4), " W ", "WWW", " W ", 'W', new ItemStack(TFCItems.logs, 1, 0));
				r.addShaped(new ItemStack(TinkerWorld.stoneTorch, 1), "C", "S", 'C', new ItemStack(TFCItems.coal, 1), 'S', "packStick");
				r.addShaped(new ItemStack(TinkerWorld.stoneLadder, 4), "S S", "SWS", "S S", 'S', "packSmoothStone", 'W', "packStick");
				r.addShaped(new ItemStack(TinkerWorld.slimeGel, 1, 0), "##", "##", '#', TinkerWorld.strangeFood);
				r.addShaped(new ItemStack(TinkerWorld.strangeFood, 4, 0), "#", '#', new ItemStack(TinkerWorld.slimeGel, 1, 0));
				r.addShaped(new ItemStack(TinkerWorld.slimeGel, 1, 1), "##", "##", '#', Items.slime_ball);
				r.addShaped(new ItemStack(Items.slime_ball, 4, 0), "#", '#', new ItemStack(TinkerWorld.slimeGel, 1, 1));
				r.addShapeless(new ItemStack(TinkerWorld.slimeChannel, 1, 0), new ItemStack(TinkerWorld.slimeGel, 1, Short.MAX_VALUE), new ItemStack(Items.redstone));
				r.addShapeless(new ItemStack(TinkerWorld.bloodChannel, 1, 0), new ItemStack(TinkerWorld.strangeFood, 1, 1), new ItemStack(TinkerWorld.strangeFood, 1, 1), new ItemStack(TinkerWorld.strangeFood, 1, 1), new ItemStack(TinkerWorld.strangeFood, 1, 1), new ItemStack(Items.redstone));
				r.addShapeless(new ItemStack(TinkerWorld.slimeChannel, 1, 0), Items.slime_ball, Items.slime_ball, Items.slime_ball, Items.slime_ball, new ItemStack(Items.redstone));
				r.addShapeless(new ItemStack(TinkerWorld.slimePad, 1, 0), TinkerWorld.slimeChannel, Items.slime_ball);
				r.addShaped(new ItemStack(TinkerSmeltery.castingChannel, 1), "I I", "III", 'I', new ItemStack(TinkerTools.materials, 1, 2));
				r.addShaped(new ItemStack(TinkerSmeltery.glassPane, 6), "GGG", "GGG", 'G', new ItemStack(TinkerSmeltery.clearGlass, 1));
				for (int i = 0; i < 15; i++)
						r.addShapeless(new ItemStack(TinkerSmeltery.stainedGlassClear, 1, i), RecipeHelper.dye.get(i), TinkerSmeltery.clearGlass);
				for (int i = 0; i < 15; i++)
						r.addShapeless(new ItemStack(TinkerSmeltery.stainedGlassClearPane, 1, i), RecipeHelper.dye.get(i), TinkerSmeltery.clearGlass);
				r.addShaped(new ItemStack(TinkerSmeltery.lavaTank, 1, 0), "III", "IGI", "III", 'G', "packGlass", 'I', (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShaped(new ItemStack(TinkerSmeltery.lavaTank, 1, 1), "GGG", "GIG", "GGG", 'G', "packGlass", 'I', (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShaped(new ItemStack(TinkerSmeltery.lavaTank, 1, 2), "IGI", "IGI", "IGI", 'G', "packGlass", 'I', (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShaped(new ItemStack(TinkerSmeltery.smeltery, 1, 2), "II", "II", 'I', (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShaped(new ItemStack(TinkerSmeltery.smeltery, 1, 1), "I I", "I I", "I I", 'I', (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShaped(new ItemStack(TinkerSmeltery.smeltery, 1, 0), "CSC", "GXG", "CSC", 'C', WurmTweaksBlocks.blockRedSteel, 'S', WurmTweaksItems.itemMachineFrame, 'G', "packGemExquisite", 'X', TEHelper.getMagma("Resonant"));
				r.addShaped(new ItemStack(TinkerSmeltery.searedBlock, 1, 1), "I I", " I ", 'I', (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShaped(new ItemStack(TinkerSmeltery.searedBlock, 1, 0), "III", "I I", "I I", 'I', (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShaped(new ItemStack(TinkerSmeltery.searedBlock, 1, 2), "I I", "I I", "III", 'I', (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShaped(new ItemStack(TinkerTools.craftedSoil, 1, 1), "DGD", "GCG", "DGD", 'D', (new ItemStack(TFCItems.powder, 1, 1)), 'G', new ItemStack(TFCItems.oreChunk, 1, 17), 'C', TFCItems.clayBall);
				r.addShaped(new ItemStack(TinkerTools.materials, 1, 0), "PP", "PP", 'P', (new ItemStack(Items.paper)));
				r.addShaped(new ItemStack(TinkerTools.materials, 1, 6), "PPP", "PBP", "PPP", 'P', (new ItemStack(Blocks.mossy_cobblestone)), 'B', WurmTweaksBlocks.blockWroughtIron);
				r.addShaped(new ItemStack(TinkerTools.blankPattern, 1, 0), "LSL", "LWL", "LSL", 'L', "packLog", 'S', TFCItems.silkCloth, 'W', "packStick");
				r.addShapeless(new ItemStack(TinkerTools.manualBook, 1), Items.book, (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShapeless(new ItemStack(TinkerTools.manualBook, 2), (new ItemStack(TinkerTools.manualBook, 1, 1)), (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShapeless(new ItemStack(TinkerTools.manualBook, 3), (new ItemStack(TinkerTools.manualBook, 1, 2)), (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShapeless(new ItemStack(TinkerTools.manualBook, 4), (new ItemStack(TinkerTools.manualBook, 1, 3)), (new ItemStack(TinkerTools.materials, 1, 2)));
				r.addShaped(new ItemStack(TinkerTools.craftingStationWood), "CS", 'C', Blocks.crafting_table, 'S', TFCItems.goldSheet);
				r.addShapeless(new ItemStack(TinkerTools.craftingSlabWood, 1, 0), new ItemStack(TinkerTools.craftingStationWood));
				r.addShapeless(new ItemStack(TinkerTools.craftingSlabWood, 1, 1), new ItemStack(TinkerTools.toolStationWood));
				r.addShapeless(new ItemStack(TinkerTools.craftingSlabWood, 1, 2), new ItemStack(TinkerTools.toolStationWood, 1, 1));
				r.addShapeless(new ItemStack(TinkerTools.craftingSlabWood, 1, 2), new ItemStack(TinkerTools.toolStationWood, 1, 2));
				r.addShapeless(new ItemStack(TinkerTools.craftingSlabWood, 1, 2), new ItemStack(TinkerTools.toolStationWood, 1, 3));
				r.addShapeless(new ItemStack(TinkerTools.craftingSlabWood, 1, 3), new ItemStack(TinkerTools.toolStationWood, 1, 10));
				r.addShapeless(new ItemStack(TinkerTools.craftingSlabWood, 1, 3), new ItemStack(TinkerTools.toolStationWood, 1, 11));
				r.addShapeless(new ItemStack(TinkerTools.craftingSlabWood, 1, 3), new ItemStack(TinkerTools.toolStationWood, 1, 12));
				r.addShapeless(new ItemStack(TinkerTools.craftingSlabWood, 1, 3), new ItemStack(TinkerTools.toolStationWood, 1, 13));
				r.addShapeless(new ItemStack(TinkerTools.craftingSlabWood, 1, 4), new ItemStack(TinkerTools.toolForge, 1, 5));
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 0), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockWroughtIron, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 1), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockGold, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 9), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockSilver, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 13), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockSteel, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 10), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockPlatinum, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 3), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockEmerald, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 8), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockBronze, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 2), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockDiamond, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 10), "SSS", "L L", "L L", 'S', "packLog", 'L', TFCItems.blackSteelSheet);
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 11), "SSS", "L L", "L L", 'S', "packLog", 'L', TFCItems.blackSteelSheet);
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 12), "SSS", "L L", "L L", 'S', "packLog", 'L', TFCItems.blackSteelSheet);
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 13), "SSS", "L L", "L L", 'S', "packLog", 'L', TFCItems.blackSteelSheet);
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 0), "SSS", "L L", "L L", 'S', TFCItems.redSteelSheet, 'L', "packLog");
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 1), "SSS", "L L", "L L", 'S', TFCItems.blueSteelSheet, 'L', "packLog");
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 2), "SSS", "L L", "L L", 'S', TFCItems.redSteelSheet, 'L', "packLog");
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 3), "SSS", "L L", "L L", 'S', TFCItems.redSteelSheet, 'L', "packLog");
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 4), "SSS", "L L", "L L", 'S', TFCItems.redSteelSheet, 'L', "packLog");
				addMaterials();
				addFurnaceRecipes();
				addIngotCasting();
				addIngotMelting();
				addToolCasting();
				addMoldCrafting();
				addAlloy();
		}

		private static void addFurnaceRecipes () {
				MachineHelper.addFurnaceRecipes(new ItemStack(TinkerTools.materials, 1, 2), new ItemStack(TinkerTools.craftedSoil, 1, 1));
		}

		private static void addIngotCasting () {
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.wroughtIronIngot), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.wroughtIronIngot2x), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.wroughtIronSheet), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.wroughtIronSheet2x), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.platinumIngot), new FluidStack(WurmTweaksFluid.fluidPlatinum, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.platinumIngot2x), new FluidStack(WurmTweaksFluid.fluidPlatinum, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.platinumSheet), new FluidStack(WurmTweaksFluid.fluidPlatinum, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.platinumSheet2x), new FluidStack(WurmTweaksFluid.fluidPlatinum, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.goldIngot), new FluidStack(WurmTweaksFluid.fluidGold, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.goldIngot2x), new FluidStack(WurmTweaksFluid.fluidGold, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.goldSheet), new FluidStack(WurmTweaksFluid.fluidGold, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.goldSheet2x), new FluidStack(WurmTweaksFluid.fluidGold, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.sterlingSilverIngot), new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.sterlingSilverIngot2x), new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.sterlingSilverSheet), new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.sterlingSilverSheet2x), new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.silverIngot), new FluidStack(WurmTweaksFluid.fluidSilver, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.silverIngot2x), new FluidStack(WurmTweaksFluid.fluidSilver, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.silverSheet), new FluidStack(WurmTweaksFluid.fluidSilver, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.silverSheet2x), new FluidStack(WurmTweaksFluid.fluidSilver, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blueSteelIngot), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blueSteelIngot2x), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blueSteelSheet), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blueSteelSheet2x), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blackSteelIngot), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blackSteelIngot2x), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blackSteelSheet), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blackSteelSheet2x), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.redSteelIngot), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.redSteelIngot2x), new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.redSteelSheet), new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.redSteelSheet2x), new FluidStack(WurmTweaksFluid.fluidRedSteel, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.copperIngot), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.copperIngot2x), new FluidStack(WurmTweaksFluid.fluidCopper, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.copperSheet), new FluidStack(WurmTweaksFluid.fluidCopper, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.copperSheet2x), new FluidStack(WurmTweaksFluid.fluidRedSteel, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.steelIngot), new FluidStack(WurmTweaksFluid.fluidSteel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.steelIngot2x), new FluidStack(WurmTweaksFluid.fluidSteel, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.steelSheet), new FluidStack(WurmTweaksFluid.fluidSteel, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.steelSheet2x), new FluidStack(WurmTweaksFluid.fluidSteel, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bronzeIngot), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bronzeIngot2x), new FluidStack(WurmTweaksFluid.fluidBronze, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bronzeSheet), new FluidStack(WurmTweaksFluid.fluidBronze, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bronzeSheet2x), new FluidStack(WurmTweaksFluid.fluidBronze, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bismuthIngot), new FluidStack(WurmTweaksFluid.fluidBismuth, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bismuthIngot2x), new FluidStack(WurmTweaksFluid.fluidBismuth, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bismuthSheet), new FluidStack(WurmTweaksFluid.fluidBismuth, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bismuthSheet2x), new FluidStack(WurmTweaksFluid.fluidBismuth, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bismuthBronzeIngot), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bismuthBronzeIngot2x), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bismuthBronzeSheet), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.bismuthBronzeSheet2x), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blackBronzeIngot), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blackBronzeIngot2x), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blackBronzeSheet), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.blackBronzeSheet2x), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.brassIngot), new FluidStack(WurmTweaksFluid.fluidBrass, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.brassIngot2x), new FluidStack(WurmTweaksFluid.fluidBrass, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.brassSheet), new FluidStack(WurmTweaksFluid.fluidBrass, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.brassSheet2x), new FluidStack(WurmTweaksFluid.fluidBrass, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.leadIngot), new FluidStack(WurmTweaksFluid.fluidLead, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.leadIngot2x), new FluidStack(WurmTweaksFluid.fluidLead, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.leadSheet), new FluidStack(WurmTweaksFluid.fluidLead, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.leadSheet2x), new FluidStack(WurmTweaksFluid.fluidLead, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.nickelIngot), new FluidStack(WurmTweaksFluid.fluidNickel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.nickelIngot2x), new FluidStack(WurmTweaksFluid.fluidNickel, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.nickelSheet), new FluidStack(WurmTweaksFluid.fluidNickel, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.nickelSheet2x), new FluidStack(WurmTweaksFluid.fluidNickel, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.pigIronIngot), new FluidStack(WurmTweaksFluid.fluidPigIron, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.pigIronIngot2x), new FluidStack(WurmTweaksFluid.fluidPigIron, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.pigIronSheet), new FluidStack(WurmTweaksFluid.fluidPigIron, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.pigIronSheet2x), new FluidStack(WurmTweaksFluid.fluidPigIron, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.roseGoldIngot), new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.roseGoldIngot2x), new FluidStack(WurmTweaksFluid.fluidRoseGold, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.roseGoldSheet), new FluidStack(WurmTweaksFluid.fluidRoseGold, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.roseGoldSheet2x), new FluidStack(WurmTweaksFluid.fluidRoseGold, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.zincIngot), new FluidStack(WurmTweaksFluid.fluidZinc, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.zincIngot2x), new FluidStack(WurmTweaksFluid.fluidZinc, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.zincSheet), new FluidStack(WurmTweaksFluid.fluidZinc, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.zincSheet2x), new FluidStack(WurmTweaksFluid.fluidZinc, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.tinIngot), new FluidStack(WurmTweaksFluid.fluidTin, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.tinIngot2x), new FluidStack(WurmTweaksFluid.fluidTin, 2000), WurmTweaksItems.itemDoubleIngotCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.tinSheet), new FluidStack(WurmTweaksFluid.fluidTin, 2000), WurmTweaksItems.itemSheetCast);
				TConstructHelper.addCastingRecipe(new ItemStack(TFCItems.tinSheet2x), new FluidStack(WurmTweaksFluid.fluidTin, 4000), WurmTweaksItems.item2xSheetCast);
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockWroughtIron, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockPlatinum, new FluidStack(WurmTweaksFluid.fluidPlatinum, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockGold, new FluidStack(WurmTweaksFluid.fluidGold, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockSterlingSilver, new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockSilver, new FluidStack(WurmTweaksFluid.fluidSilver, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockBlueSteel, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockBlackSteel, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockRedSteel, new FluidStack(WurmTweaksFluid.fluidRedSteel, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockCopper, new FluidStack(WurmTweaksFluid.fluidCopper, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockSteel, new FluidStack(WurmTweaksFluid.fluidSteel, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockBronze, new FluidStack(WurmTweaksFluid.fluidBronze, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockBismuth, new FluidStack(WurmTweaksFluid.fluidBismuth, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockBismuthBronze, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockBlackBronze, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockBrass, new FluidStack(WurmTweaksFluid.fluidBrass, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockLead, new FluidStack(WurmTweaksFluid.fluidLead, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockNickel, new FluidStack(WurmTweaksFluid.fluidNickel, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockPigIron, new FluidStack(WurmTweaksFluid.fluidPigIron, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockRoseGold, new FluidStack(WurmTweaksFluid.fluidRoseGold, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockZinc, new FluidStack(WurmTweaksFluid.fluidZinc, 32000));
				TConstructHelper.addBasinRecipe(WurmTweaksBlocks.blockTin, new FluidStack(WurmTweaksFluid.fluidTin, 32000));
		}

		private static void addIngotMelting () {
				TConstructHelper.addMelting(WurmTweaksBlocks.blockWroughtIron, 800, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockPlatinum, 800, new FluidStack(WurmTweaksFluid.fluidPlatinum, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockGold, 800, new FluidStack(WurmTweaksFluid.fluidGold, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockSterlingSilver, 800, new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockSilver, 800, new FluidStack(WurmTweaksFluid.fluidSilver, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockBlueSteel, 800, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockBlackSteel, 800, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockRedSteel, 800, new FluidStack(WurmTweaksFluid.fluidRedSteel, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockCopper, 800, new FluidStack(WurmTweaksFluid.fluidCopper, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockSteel, 800, new FluidStack(WurmTweaksFluid.fluidSteel, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockBronze, 800, new FluidStack(WurmTweaksFluid.fluidBronze, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockBismuth, 800, new FluidStack(WurmTweaksFluid.fluidBismuth, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockBismuthBronze, 800, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockBlackBronze, 800, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockBrass, 800, new FluidStack(WurmTweaksFluid.fluidBrass, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockLead, 800, new FluidStack(WurmTweaksFluid.fluidLead, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockNickel, 800, new FluidStack(WurmTweaksFluid.fluidNickel, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockPigIron, 800, new FluidStack(WurmTweaksFluid.fluidPigIron, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockRoseGold, 800, new FluidStack(WurmTweaksFluid.fluidRoseGold, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockZinc, 800, new FluidStack(WurmTweaksFluid.fluidZinc, 32000));
				TConstructHelper.addMelting(WurmTweaksBlocks.blockTin, 800, new FluidStack(WurmTweaksFluid.fluidTin, 32000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronIngot), WurmTweaksBlocks.blockWroughtIron, 850, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronIngot2x), WurmTweaksBlocks.blockWroughtIron, 900, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronSheet), WurmTweaksBlocks.blockWroughtIron, 1000, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronSheet2x), WurmTweaksBlocks.blockWroughtIron, 1200, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.platinumIngot), WurmTweaksBlocks.blockPlatinum, 850, new FluidStack(WurmTweaksFluid.fluidPlatinum, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.platinumIngot2x), WurmTweaksBlocks.blockPlatinum, 900, new FluidStack(WurmTweaksFluid.fluidPlatinum, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.platinumSheet), WurmTweaksBlocks.blockPlatinum, 1000, new FluidStack(WurmTweaksFluid.fluidPlatinum, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.platinumSheet2x), WurmTweaksBlocks.blockPlatinum, 1200, new FluidStack(WurmTweaksFluid.fluidPlatinum, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.goldIngot), WurmTweaksBlocks.blockGold, 850, new FluidStack(WurmTweaksFluid.fluidGold, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.goldIngot2x), WurmTweaksBlocks.blockGold, 900, new FluidStack(WurmTweaksFluid.fluidGold, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.goldSheet), WurmTweaksBlocks.blockGold, 1000, new FluidStack(WurmTweaksFluid.fluidGold, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.goldSheet2x), WurmTweaksBlocks.blockGold, 1200, new FluidStack(WurmTweaksFluid.fluidGold, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.sterlingSilverIngot), WurmTweaksBlocks.blockSterlingSilver, 850, new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.sterlingSilverIngot2x), WurmTweaksBlocks.blockSterlingSilver, 900, new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.sterlingSilverSheet), WurmTweaksBlocks.blockSterlingSilver, 1000, new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.sterlingSilverSheet2x), WurmTweaksBlocks.blockSterlingSilver, 1200, new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.silverIngot), WurmTweaksBlocks.blockSilver, 850, new FluidStack(WurmTweaksFluid.fluidSilver, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.silverIngot2x), WurmTweaksBlocks.blockSilver, 900, new FluidStack(WurmTweaksFluid.fluidSilver, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.silverSheet), WurmTweaksBlocks.blockSilver, 1000, new FluidStack(WurmTweaksFluid.fluidSilver, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.silverSheet2x), WurmTweaksBlocks.blockSilver, 1200, new FluidStack(WurmTweaksFluid.fluidSilver, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelIngot), WurmTweaksBlocks.blockBlueSteel, 850, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelIngot2x), WurmTweaksBlocks.blockBlueSteel, 900, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelSheet), WurmTweaksBlocks.blockBlueSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelSheet2x), WurmTweaksBlocks.blockBlueSteel, 1200, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelIngot), WurmTweaksBlocks.blockBlackSteel, 850, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelIngot2x), WurmTweaksBlocks.blockBlackSteel, 900, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelSheet), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelSheet2x), WurmTweaksBlocks.blockBlackSteel, 1200, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelIngot), WurmTweaksBlocks.blockRedSteel, 850, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelIngot2x), WurmTweaksBlocks.blockRedSteel, 900, new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelSheet), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelSheet2x), WurmTweaksBlocks.blockRedSteel, 1200, new FluidStack(WurmTweaksFluid.fluidRedSteel, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.copperIngot), WurmTweaksBlocks.blockCopper, 850, new FluidStack(WurmTweaksFluid.fluidCopper, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.copperIngot2x), WurmTweaksBlocks.blockCopper, 900, new FluidStack(WurmTweaksFluid.fluidCopper, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.copperSheet), WurmTweaksBlocks.blockCopper, 1000, new FluidStack(WurmTweaksFluid.fluidCopper, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.copperSheet2x), WurmTweaksBlocks.blockCopper, 1200, new FluidStack(WurmTweaksFluid.fluidRedSteel, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelIngot), WurmTweaksBlocks.blockSteel, 850, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelIngot2x), WurmTweaksBlocks.blockSteel, 900, new FluidStack(WurmTweaksFluid.fluidSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelSheet), WurmTweaksBlocks.blockSteel, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelSheet2x), WurmTweaksBlocks.blockSteel, 1200, new FluidStack(WurmTweaksFluid.fluidSteel, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeIngot), WurmTweaksBlocks.blockBronze, 850, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeIngot2x), WurmTweaksBlocks.blockBronze, 900, new FluidStack(WurmTweaksFluid.fluidBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeSheet), WurmTweaksBlocks.blockBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeSheet2x), WurmTweaksBlocks.blockBronze, 1200, new FluidStack(WurmTweaksFluid.fluidBronze, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthIngot), WurmTweaksBlocks.blockBismuth, 850, new FluidStack(WurmTweaksFluid.fluidBismuth, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthIngot2x), WurmTweaksBlocks.blockBismuth, 900, new FluidStack(WurmTweaksFluid.fluidBismuth, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthSheet), WurmTweaksBlocks.blockBismuth, 1000, new FluidStack(WurmTweaksFluid.fluidBismuth, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthSheet2x), WurmTweaksBlocks.blockBismuth, 1200, new FluidStack(WurmTweaksFluid.fluidBismuth, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeIngot), WurmTweaksBlocks.blockBismuthBronze, 850, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeIngot2x), WurmTweaksBlocks.blockBismuthBronze, 900, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeSheet), WurmTweaksBlocks.blockBismuthBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeSheet2x), WurmTweaksBlocks.blockBismuthBronze, 1200, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeIngot), WurmTweaksBlocks.blockBlackBronze, 850, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeIngot2x), WurmTweaksBlocks.blockBlackBronze, 900, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeSheet), WurmTweaksBlocks.blockBlackBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeSheet2x), WurmTweaksBlocks.blockBlackBronze, 1200, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.brassIngot), WurmTweaksBlocks.blockBrass, 850, new FluidStack(WurmTweaksFluid.fluidBrass, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.brassIngot2x), WurmTweaksBlocks.blockBrass, 900, new FluidStack(WurmTweaksFluid.fluidBrass, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.brassSheet), WurmTweaksBlocks.blockBrass, 1000, new FluidStack(WurmTweaksFluid.fluidBrass, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.brassSheet2x), WurmTweaksBlocks.blockBrass, 1200, new FluidStack(WurmTweaksFluid.fluidBrass, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.leadIngot), WurmTweaksBlocks.blockLead, 850, new FluidStack(WurmTweaksFluid.fluidLead, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.leadIngot2x), WurmTweaksBlocks.blockLead, 900, new FluidStack(WurmTweaksFluid.fluidLead, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.leadSheet), WurmTweaksBlocks.blockLead, 1000, new FluidStack(WurmTweaksFluid.fluidLead, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.leadSheet2x), WurmTweaksBlocks.blockLead, 1200, new FluidStack(WurmTweaksFluid.fluidLead, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.nickelIngot), WurmTweaksBlocks.blockNickel, 850, new FluidStack(WurmTweaksFluid.fluidNickel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.nickelIngot2x), WurmTweaksBlocks.blockNickel, 900, new FluidStack(WurmTweaksFluid.fluidNickel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.nickelSheet), WurmTweaksBlocks.blockNickel, 1000, new FluidStack(WurmTweaksFluid.fluidNickel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.nickelSheet2x), WurmTweaksBlocks.blockNickel, 1200, new FluidStack(WurmTweaksFluid.fluidNickel, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.pigIronIngot), WurmTweaksBlocks.blockNickel, 850, new FluidStack(WurmTweaksFluid.fluidPigIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.pigIronIngot2x), WurmTweaksBlocks.blockPigIron, 900, new FluidStack(WurmTweaksFluid.fluidPigIron, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.pigIronSheet), WurmTweaksBlocks.blockPigIron, 1000, new FluidStack(WurmTweaksFluid.fluidPigIron, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.pigIronSheet2x), WurmTweaksBlocks.blockPigIron, 1200, new FluidStack(WurmTweaksFluid.fluidPigIron, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.roseGoldIngot), WurmTweaksBlocks.blockPigIron, 850, new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.roseGoldIngot2x), WurmTweaksBlocks.blockRoseGold, 900, new FluidStack(WurmTweaksFluid.fluidRoseGold, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.roseGoldSheet), WurmTweaksBlocks.blockRoseGold, 1000, new FluidStack(WurmTweaksFluid.fluidRoseGold, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.roseGoldSheet2x), WurmTweaksBlocks.blockRoseGold, 1200, new FluidStack(WurmTweaksFluid.fluidRoseGold, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.zincIngot), WurmTweaksBlocks.blockZinc, 850, new FluidStack(WurmTweaksFluid.fluidZinc, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.zincIngot2x), WurmTweaksBlocks.blockZinc, 900, new FluidStack(WurmTweaksFluid.fluidZinc, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.zincSheet), WurmTweaksBlocks.blockZinc, 1000, new FluidStack(WurmTweaksFluid.fluidZinc, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.zincSheet2x), WurmTweaksBlocks.blockZinc, 1200, new FluidStack(WurmTweaksFluid.fluidZinc, 4000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.tinIngot), WurmTweaksBlocks.blockTin, 800, new FluidStack(WurmTweaksFluid.fluidTin, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.tinIngot2x), WurmTweaksBlocks.blockTin, 900, new FluidStack(WurmTweaksFluid.fluidTin, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.tinSheet), WurmTweaksBlocks.blockTin, 1000, new FluidStack(WurmTweaksFluid.fluidTin, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.tinSheet2x), WurmTweaksBlocks.blockTin, 1200, new FluidStack(WurmTweaksFluid.fluidTin, 4000));
		}

		private static void addToolCasting () {
				addCastingWithReverse(new ItemStack(TFCItems.copperShovelHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemShovelCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeShovelHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemShovelCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeShovelHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemShovelCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeShovelHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemShovelCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronShovelHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemShovelCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelShovelHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemShovelCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelShovelHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemShovelCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelShovelHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemShovelCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelShovelHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemShovelCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperProPickHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemProPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeProPickHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemProPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeProPickHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemProPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeProPickHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemProPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronProPickHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemProPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelProPickHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemProPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelProPickHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemProPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelProPickHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemProPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelProPickHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemProPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperHoeHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemHoeCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeHoeHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemHoeCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeHoeHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemHoeCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeHoeHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemHoeCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronHoeHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemHoeCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelHoeHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemHoeCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelHoeHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemHoeCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelHoeHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemHoeCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelHoeHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemHoeCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperChiselHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemChiselCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeChiselHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemChiselCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeChiselHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemChiselCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeChiselHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemChiselCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronChiselHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemChiselCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelChiselHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemChiselCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelChiselHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemChiselCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelChiselHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemChiselCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelChiselHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemChiselCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperSwordHead), new FluidStack(WurmTweaksFluid.fluidCopper, 2000), WurmTweaksItems.itemSwordCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeSwordHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 2000), WurmTweaksItems.itemSwordCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeSwordHead), new FluidStack(WurmTweaksFluid.fluidBronze, 2000), WurmTweaksItems.itemSwordCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeSwordHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 2000), WurmTweaksItems.itemSwordCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronSwordHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.itemSwordCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelSwordHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.itemSwordCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelSwordHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 2000), WurmTweaksItems.itemSwordCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelSwordHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000), WurmTweaksItems.itemSwordCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelSwordHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 2000), WurmTweaksItems.itemSwordCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperMaceHead), new FluidStack(WurmTweaksFluid.fluidCopper, 2000), WurmTweaksItems.itemMaceCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeMaceHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 2000), WurmTweaksItems.itemMaceCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeMaceHead), new FluidStack(WurmTweaksFluid.fluidBronze, 2000), WurmTweaksItems.itemMaceCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeMaceHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 2000), WurmTweaksItems.itemMaceCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronMaceHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.itemMaceCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelMaceHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.itemMaceCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelMaceHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 2000), WurmTweaksItems.itemMaceCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelMaceHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000), WurmTweaksItems.itemMaceCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelMaceHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 2000), WurmTweaksItems.itemMaceCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperSawHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemSawCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeSawHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemSawCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeSawHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemSawCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeSawHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemSawCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronSawHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemSawCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelSawHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemSawCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelSawHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemSawCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelSawHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemSawCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelSawHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemSawCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperJavelinHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemJavelinCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeJavelinHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemJavelinCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeJavelinHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemJavelinCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeJavelinHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemJavelinCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronJavelinHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemJavelinCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelJavelinHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemJavelinCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelJavelinHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemJavelinCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelJavelinHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemJavelinCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelJavelinHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemJavelinCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperHammerHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemHammerCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeHammerHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemHammerCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeHammerHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemHammerCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeHammerHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemHammerCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronHammerHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemHammerCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelHammerHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemHammerCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelHammerHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemHammerCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelHammerHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemHammerCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelHammerHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemHammerCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperKnifeHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemKnifeCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeKnifeHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemKnifeCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeKnifeHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemKnifeCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeKnifeHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemKnifeCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronKnifeHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemKnifeCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelKnifeHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemKnifeCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelKnifeHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemKnifeCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelKnifeHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemKnifeCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelKnifeHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemKnifeCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperScytheHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemScytheCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeScytheHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemScytheCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeScytheHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemScytheCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeScytheHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemScytheCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronScytheHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemScytheCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelScytheHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemScytheCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelScytheHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemScytheCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelScytheHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemScytheCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelScytheHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemScytheCast);
				addCastingWithReverse(new ItemStack(TFCItems.tuyereCopper), new FluidStack(WurmTweaksFluid.fluidCopper, 4000), WurmTweaksItems.itemTuyereCast);
				addCastingWithReverse(new ItemStack(TFCItems.tuyereBismuthBronze), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 4000), WurmTweaksItems.itemTuyereCast);
				addCastingWithReverse(new ItemStack(TFCItems.tuyereBronze), new FluidStack(WurmTweaksFluid.fluidBronze, 4000), WurmTweaksItems.itemTuyereCast);
				addCastingWithReverse(new ItemStack(TFCItems.tuyereBlackBronze), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 4000), WurmTweaksItems.itemTuyereCast);
				addCastingWithReverse(new ItemStack(TFCItems.tuyereWroughtIron), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 4000), WurmTweaksItems.itemTuyereCast);
				addCastingWithReverse(new ItemStack(TFCItems.tuyereSteel), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 4000), WurmTweaksItems.itemTuyereCast);
				addCastingWithReverse(new ItemStack(TFCItems.tuyereBlackSteel), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 4000), WurmTweaksItems.itemTuyereCast);
				addCastingWithReverse(new ItemStack(TFCItems.tuyereRedSteel), new FluidStack(WurmTweaksFluid.fluidRedSteel, 4000), WurmTweaksItems.itemTuyereCast);
				addCastingWithReverse(new ItemStack(TFCItems.tuyereBlueSteel), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 4000), WurmTweaksItems.itemTuyereCast);
				addCastingWithReverse(new ItemStack(ModManager.CopperIceSawHead), new FluidStack(WurmTweaksFluid.fluidCopper, 2000), WurmTweaksItems.itemIceSawCast);
				addCastingWithReverse(new ItemStack(ModManager.BismuthBronzeIceSawHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 2000), WurmTweaksItems.itemIceSawCast);
				addCastingWithReverse(new ItemStack(ModManager.BronzeIceSawHead), new FluidStack(WurmTweaksFluid.fluidBronze, 2000), WurmTweaksItems.itemIceSawCast);
				addCastingWithReverse(new ItemStack(ModManager.BlackBronzeIceSawHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 2000), WurmTweaksItems.itemIceSawCast);
				addCastingWithReverse(new ItemStack(ModManager.WroughtIronIceSawHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.itemIceSawCast);
				addCastingWithReverse(new ItemStack(ModManager.SteelIceSawHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.itemIceSawCast);
				addCastingWithReverse(new ItemStack(ModManager.BlackSteelIceSawHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 2000), WurmTweaksItems.itemIceSawCast);
				addCastingWithReverse(new ItemStack(ModManager.RedSteelIceSawHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000), WurmTweaksItems.itemIceSawCast);
				addCastingWithReverse(new ItemStack(ModManager.BlueSteelIceSawHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 2000), WurmTweaksItems.itemIceSawCast);
				addCastingWithReverse(new ItemStack(ModItems.itemWarHammer_Copper_Head), new FluidStack(WurmTweaksFluid.fluidCopper, 2000), WurmTweaksItems.itemWarHammerCast);
				addCastingWithReverse(new ItemStack(ModItems.itemWarHammer_BismuthBronze_Head), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 2000), WurmTweaksItems.itemWarHammerCast);
				addCastingWithReverse(new ItemStack(ModItems.itemWarHammer_Bronze_Head), new FluidStack(WurmTweaksFluid.fluidBronze, 2000), WurmTweaksItems.itemWarHammerCast);
				addCastingWithReverse(new ItemStack(ModItems.itemWarHammer_BlackBronze_Head), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 2000), WurmTweaksItems.itemWarHammerCast);
				addCastingWithReverse(new ItemStack(ModItems.itemWarHammer_WroughtIron_Head), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.itemWarHammerCast);
				addCastingWithReverse(new ItemStack(ModItems.itemWarHammer_Steel_Head), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.itemWarHammerCast);
				addCastingWithReverse(new ItemStack(ModItems.itemWarHammer_BlackSteel_Head), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 2000), WurmTweaksItems.itemWarHammerCast);
				addCastingWithReverse(new ItemStack(ModItems.itemWarHammer_RedSteel_Head), new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000), WurmTweaksItems.itemWarHammerCast);
				addCastingWithReverse(new ItemStack(ModItems.itemWarHammer_BlueSteel_Head), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 2000), WurmTweaksItems.itemWarHammerCast);
				addCastingWithReverse(new ItemStack(ModItems.itemPoniard_Copper_Head), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemPoniardCast);
				addCastingWithReverse(new ItemStack(ModItems.itemPoniard_BismuthBronze_Head), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemPoniardCast);
				addCastingWithReverse(new ItemStack(ModItems.itemPoniard_Bronze_Head), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemPoniardCast);
				addCastingWithReverse(new ItemStack(ModItems.itemPoniard_BlackBronze_Head), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemPoniardCast);
				addCastingWithReverse(new ItemStack(ModItems.itemPoniard_WroughtIron_Head), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemPoniardCast);
				addCastingWithReverse(new ItemStack(ModItems.itemPoniard_Steel_Head), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemPoniardCast);
				addCastingWithReverse(new ItemStack(ModItems.itemPoniard_BlackSteel_Head), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemPoniardCast);
				addCastingWithReverse(new ItemStack(ModItems.itemPoniard_RedSteel_Head), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemPoniardCast);
				addCastingWithReverse(new ItemStack(ModItems.itemPoniard_BlueSteel_Head), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemPoniardCast);
				addCastingWithReverse(new ItemStack(ModItems.itemHalberd_Copper_Head), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemHalberdCast);
				addCastingWithReverse(new ItemStack(ModItems.itemHalberd_BismuthBronze), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemHalberdCast);
				addCastingWithReverse(new ItemStack(ModItems.itemHalberd_Bronze_Head), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemHalberdCast);
				addCastingWithReverse(new ItemStack(ModItems.itemHalberd_BlackBronze_Head), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemHalberdCast);
				addCastingWithReverse(new ItemStack(ModItems.itemHalberd_WroughtIron_Head), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemHalberdCast);
				addCastingWithReverse(new ItemStack(ModItems.itemHalberd_Steel_Head), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemHalberdCast);
				addCastingWithReverse(new ItemStack(ModItems.itemHalberd_BlackSteel_Head), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemHalberdCast);
				addCastingWithReverse(new ItemStack(ModItems.itemHalberd_RedSteel_Head), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemHalberdCast);
				addCastingWithReverse(new ItemStack(ModItems.itemHalberd_BlueSteel_Head), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemHalberdCast);
				addCastingWithReverse(new ItemStack(ModItems.itemArrow_Copper_Head, 6), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemArrowHeadCast);
				addCastingWithReverse(new ItemStack(ModItems.itemArrow_BismuthBronze_Head, 6), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemArrowHeadCast);
				addCastingWithReverse(new ItemStack(ModItems.itemArrow_Bronze_Head, 6), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemArrowHeadCast);
				addCastingWithReverse(new ItemStack(ModItems.itemArrow_BlackBronze_Head, 6), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemArrowHeadCast);
				addCastingWithReverse(new ItemStack(ModItems.itemArrow_WroughtIron_Head, 6), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemArrowHeadCast);
				addCastingWithReverse(new ItemStack(ModItems.itemArrow_Steel_Head, 6), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemArrowHeadCast);
				addCastingWithReverse(new ItemStack(ModItems.itemArrow_BlackSteel_Head, 6), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemArrowHeadCast);
				addCastingWithReverse(new ItemStack(ModItems.itemArrow_RedSteel_Head, 6), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemArrowHeadCast);
				addCastingWithReverse(new ItemStack(ModItems.itemArrow_BlueSteel_Head, 6), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemArrowHeadCast);
				addCastingWithReverse(new ItemStack(ModItems.itemBolt_Copper_Head, 6), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemBoltCast);
				addCastingWithReverse(new ItemStack(ModItems.itemBolt_BismuthBronze_Head, 6), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemBoltCast);
				addCastingWithReverse(new ItemStack(ModItems.itemBolt_Bronze_Head, 6), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemBoltCast);
				addCastingWithReverse(new ItemStack(ModItems.itemBolt_BlackBronze_Head, 6), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemBoltCast);
				addCastingWithReverse(new ItemStack(ModItems.itemBolt_WroughtIron_Head, 6), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemBoltCast);
				addCastingWithReverse(new ItemStack(ModItems.itemBolt_Steel_Head, 6), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemBoltCast);
				addCastingWithReverse(new ItemStack(ModItems.itemBolt_BlackSteel_Head, 6), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemBoltCast);
				addCastingWithReverse(new ItemStack(ModItems.itemBolt_RedSteel_Head, 6), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemBoltCast);
				addCastingWithReverse(new ItemStack(ModItems.itemBolt_BlueSteel_Head, 6), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemBoltCast);
				addCastingWithReverse(new ItemStack(ModItems.itemLink_Copper, 6), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemLinkCast);
				addCastingWithReverse(new ItemStack(ModItems.itemLink_BismuthBronze, 6), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemLinkCast);
				addCastingWithReverse(new ItemStack(ModItems.itemLink_Bronze, 6), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemLinkCast);
				addCastingWithReverse(new ItemStack(ModItems.itemLink_BlackBronze, 6), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemLinkCast);
				addCastingWithReverse(new ItemStack(ModItems.itemLink_WroughtIron, 6), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemLinkCast);
				addCastingWithReverse(new ItemStack(ModItems.itemLink_Steel, 6), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemLinkCast);
				addCastingWithReverse(new ItemStack(ModItems.itemLink_BlackSteel, 6), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemLinkCast);
				addCastingWithReverse(new ItemStack(ModItems.itemLink_RedSteel, 6), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemLinkCast);
				addCastingWithReverse(new ItemStack(ModItems.itemLink_BlueSteel, 6), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemLinkCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperPickaxeHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemHammerCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzePickaxeHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzePickaxeHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzePickaxeHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronPickaxeHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelPickaxeHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelPickaxeHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelPickaxeHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelPickaxeHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemPickCast);
				for (Item tool : TConstructHelper.TCTools)
						for (int fluid = 0; fluid < TCFluid.length; fluid++)
								TConstructRegistry.getTableCasting().addCastingRecipe(new ItemStack(tool, 1, 201 + fluid), new FluidStack(TCFluid[fluid], getSize(tool)), getPattern(tool), 40);
				for (Item tool : TConstructHelper.TCTools) {
						TConstructHelper.addCastingRecipe(getPattern(tool), new FluidStack(WurmTweaksFluid.fluidBrass, 1000), new ItemStack(tool, 1, OreDictionary.WILDCARD_VALUE));
						TConstructHelper.addCastingRecipe(getPattern(tool), new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000), new ItemStack(tool, 1, OreDictionary.WILDCARD_VALUE));
				}
		}

		private static void addMoldCrafting () {
				ArrayList<FluidStack> metals = new ArrayList<FluidStack>();
				metals.add(new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000));
				metals.add(new FluidStack(WurmTweaksFluid.fluidBrass, 1000));
				for (FluidStack castFluids : metals) {
						for (ItemStack ingots : OreDictionary.getOres("packIngot"))
								TConstructHelper.addCastingRecipe(new ItemStack(TinkerSmeltery.metalPattern, 1, 0), castFluids, ingots);
						for (Item tools : TConstructHelper.TCTools)
								TConstructHelper.addCastingRecipe(getPattern(tools), castFluids, new ItemStack(tools, 1, OreDictionary.WILDCARD_VALUE));
				}
		}

		// Created by Troykoffeman
		private static void addAlloy () {
				Smeltery.addAlloyMixing(new FluidStack(WurmTweaksFluid.fluidSteel, 10), new FluidStack(WurmTweaksFluid.fluidPigIron, 9), new FluidStack(WurmTweaksFluid.fluidNickel, 1));
				Smeltery.addAlloyMixing(new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 10), new FluidStack(WurmTweaksFluid.fluidZinc, 3), new FluidStack(WurmTweaksFluid.fluidCopper, 5), new FluidStack(WurmTweaksFluid.fluidBismuth, 2));
				Smeltery.addAlloyMixing(new FluidStack(WurmTweaksFluid.fluidBlackBronze, 20), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 14), new FluidStack(WurmTweaksFluid.fluidSilver, 3), new FluidStack(WurmTweaksFluid.fluidGold, 3));
				Smeltery.addAlloyMixing(new FluidStack(WurmTweaksFluid.fluidBronze, 10), new FluidStack(WurmTweaksFluid.fluidCopper, 9), new FluidStack(WurmTweaksFluid.fluidTin, 1));
				Smeltery.addAlloyMixing(new FluidStack(WurmTweaksFluid.fluidBrass, 10), new FluidStack(WurmTweaksFluid.fluidCopper, 8), new FluidStack(WurmTweaksFluid.fluidZinc, 1), new FluidStack(WurmTweaksFluid.fluidGold, 1));
				Smeltery.addAlloyMixing(new FluidStack(WurmTweaksFluid.fluidRoseGold, 10), new FluidStack(WurmTweaksFluid.fluidCopper, 2), new FluidStack(WurmTweaksFluid.fluidGold, 8));
				Smeltery.addAlloyMixing(new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 10), new FluidStack(WurmTweaksFluid.fluidCopper, 3), new FluidStack(WurmTweaksFluid.fluidSilver, 7));
				Smeltery.addAlloyMixing(new FluidStack(WurmTweaksFluid.fluidBlackSteel, 20), new FluidStack(WurmTweaksFluid.fluidNickel, 2), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 3), new FluidStack(WurmTweaksFluid.fluidSteel, 15));
				Smeltery.addAlloyMixing(new FluidStack(WurmTweaksFluid.fluidRedSteel, 10), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 15), new FluidStack(WurmTweaksFluid.fluidRoseGold, 1), new FluidStack(WurmTweaksFluid.fluidBrass, 2), new FluidStack(WurmTweaksFluid.fluidSteel, 2));
				Smeltery.addAlloyMixing(new FluidStack(WurmTweaksFluid.fluidBlueSteel, 10), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 15), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 2), new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 1), new FluidStack(WurmTweaksFluid.fluidSteel, 2));
		}

		private static void addMaterials () {
				// Copper
				ToolMaterial TCopper = new ToolMaterial("TCopper", "TFCCopper", 5, 600, 800, 170, 0, 0, 0, EnumChatFormatting.AQUA.toString(), 0x33100B);
				TConstructRegistry.addtoolMaterial(201, TCopper);
				TConstructRegistry.addArrowMaterial(201, 0.01f, 0.6f);
				TConstructRegistry.addBowMaterial(201, 110, 4f);
				TConstructRegistry.toolMaterials.put(201, TCopper);
				addRepairMaterial(201, new ItemStack(TFCItems.copperIngot));
				TConstructRegistry.addDefaultToolPartMaterial(201);
				// Bronze
				ToolMaterial TBronze = new ToolMaterial("TBronze", "TFCBronze", 5, 1300, 1100, 225, 0, 0, 0, EnumChatFormatting.GOLD.toString(), 0x4B4021);
				TConstructRegistry.addtoolMaterial(202, TBronze);
				TConstructRegistry.addArrowMaterial(202, 0.04f, 0.4f);
				TConstructRegistry.addBowMaterial(202, 130, 4f);
				TConstructRegistry.toolMaterials.put(202, TBronze);
				addRepairMaterial(202, new ItemStack(TFCItems.bronzeIngot));
				TConstructRegistry.addDefaultToolPartMaterial(202);
				// Bismuth Bronze
				ToolMaterial TBismuthBronze = new ToolMaterial("TBismuthBronze", "Bismuth Bronze", 5, 1200, 1000, 215, 0, 0, 0, EnumChatFormatting.GOLD.toString(), 0x142B17);
				TConstructRegistry.addtoolMaterial(203, TBismuthBronze);
				TConstructRegistry.addArrowMaterial(203, 0.2f, 0.6f);
				TConstructRegistry.addBowMaterial(203, 120, 6f);
				TConstructRegistry.toolMaterials.put(203, TBismuthBronze);
				addRepairMaterial(203, new ItemStack(TFCItems.bismuthBronzeIngot));
				TConstructRegistry.addDefaultToolPartMaterial(203);
				// Black Bronze
				ToolMaterial TBlackBronze = new ToolMaterial("TBlackBronze", "Black Bronze", 5, 1460, 900, 235, 0, 0, 0, EnumChatFormatting.GOLD.toString(), 0x271433);
				TConstructRegistry.addtoolMaterial(204, TBlackBronze);
				TConstructRegistry.addArrowMaterial(204, 0.1f, 0.6f);
				TConstructRegistry.addBowMaterial(204, 100, 8f);
				TConstructRegistry.toolMaterials.put(204, TBlackBronze);
				addRepairMaterial(204, new ItemStack(TFCItems.blackBronzeIngot));
				TConstructRegistry.addDefaultToolPartMaterial(204);
				// Wrought Iron
				ToolMaterial TWroughtIron = new ToolMaterial("TWroughtIron", "Wrought Iron", 6, 2200, 1200, 245, 0, 0, 0, EnumChatFormatting.GOLD.toString(), 0x565656);
				TConstructRegistry.addtoolMaterial(205, TWroughtIron);
				TConstructRegistry.addArrowMaterial(205, 0.0f, 0.6f);
				TConstructRegistry.addBowMaterial(205, 85, 8f);
				TConstructRegistry.toolMaterials.put(205, TWroughtIron);
				addRepairMaterial(5, new ItemStack(TFCItems.wroughtIronIngot));
				TConstructRegistry.addDefaultToolPartMaterial(205);
				// Steel
				ToolMaterial TSeel = new ToolMaterial("TSeel", "TFC_Steel", 7, 3300, 1400, 270, 1f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x2A2A2A);
				TConstructRegistry.addtoolMaterial(206, TSeel);
				TConstructRegistry.addArrowMaterial(206, 0.0f, 0.6f);
				TConstructRegistry.addBowMaterial(206, 100, 8f);
				TConstructRegistry.toolMaterials.put(206, TSeel);
				addRepairMaterial(206, new ItemStack(TFCItems.steelIngot));
				TConstructRegistry.addDefaultToolPartMaterial(206);
				// Black Steel
				ToolMaterial TBlackSteel = new ToolMaterial("TBlackSteel", "Black Steel", 10, 4200, 1600, 275, 1f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x111414);
				TConstructRegistry.addtoolMaterial(207, TBlackSteel);
				TConstructRegistry.addArrowMaterial(207, 0.0f, 0.6f);
				TConstructRegistry.addBowMaterial(207, 95, 10f);
				TConstructRegistry.toolMaterials.put(207, TBlackSteel);
				addRepairMaterial(207, new ItemStack(TFCItems.blackSteelIngot));
				TConstructRegistry.addDefaultToolPartMaterial(207);
				// Blue Steel
				ToolMaterial TBlueSteel = new ToolMaterial("TBlueSteel", "Blue Steel", 12, 6500, 1800, 320, 10f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x3F475E);
				TConstructRegistry.addtoolMaterial(208, TBlueSteel);
				TConstructRegistry.addArrowMaterial(208, 0.0f, 0.6f);
				TConstructRegistry.addBowMaterial(208, 90, 15f);
				TConstructRegistry.toolMaterials.put(208, TBlueSteel);
				addRepairMaterial(208, new ItemStack(TFCItems.blueSteelIngot));
				TConstructRegistry.addDefaultToolPartMaterial(208);
				// Red Steel
				ToolMaterial TRedSteel = new ToolMaterial("TRedSteel", "Red Steel", 12, 6500, 1800, 310, 10f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x5A2B2B);
				TConstructRegistry.addtoolMaterial(209, TRedSteel);
				TConstructRegistry.addArrowMaterial(209, 0.0f, 0.6f);
				TConstructRegistry.addBowMaterial(209, 85, 15f);
				TConstructRegistry.toolMaterials.put(209, TRedSteel);
				addRepairMaterial(209, new ItemStack(TFCItems.redSteelIngot));
				TConstructRegistry.addDefaultToolPartMaterial(209);
				// Platinum
				ToolMaterial TPlatinum = new ToolMaterial("TPlatinum", "TFCPlatinum", 5, 1200, 4000, 250, 2.0f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x6D7777);
				TConstructRegistry.addtoolMaterial(210, TPlatinum);
				TConstructRegistry.addArrowMaterial(210, 0.1f, 0.6f);
				TConstructRegistry.addBowMaterial(210, 50, 20.0f);
				TConstructRegistry.toolMaterials.put(210, TPlatinum);
				addRepairMaterial(210, new ItemStack(TFCItems.platinumIngot));
				TConstructRegistry.addDefaultToolPartMaterial(210);
		}

		private static ItemStack getPattern (Item tool) {
				int meta = 0;
				if (tool == TinkerWeaponry.shuriken || tool == TinkerWeaponry.partCrossbowBody || tool == TinkerWeaponry.partBowLimb || tool == TinkerWeaponry.partCrossbowLimb) {
						if (tool == TinkerWeaponry.shuriken) {
								meta = 0;
						} else if (tool == TinkerWeaponry.partCrossbowBody) {
								meta = 2;
						} else if (tool == TinkerWeaponry.partBowLimb) {
								meta = 3;
						} else if (tool == TinkerWeaponry.partCrossbowLimb) {
								meta = 1;
						}
						return new ItemStack(TinkerWeaponry.metalPattern, 1, meta);
				}
				if (tool == TinkerWeaponry.arrowhead) {
						meta = 25;
						return new ItemStack(TinkerWeaponry.metalPattern, 1, meta);
				}
				for (int m = 1; m < TConstructHelper.TCTools.length; m++) {
						if (tool == TConstructHelper.TCTools[m - 1]) {
								meta = m;
						}
				}
				return new ItemStack(TinkerSmeltery.metalPattern, 1, meta);
		}

		private static int getSize (Item tool) {
				if (tool == TinkerTools.toughRod || tool == TinkerTools.toughBinding || tool == TinkerTools.excavatorHead || tool == TinkerTools.largeSwordBlade) {
						return 2000;
				}
				if (tool == TinkerTools.hammerHead || tool == TinkerWeaponry.shuriken) {
						return 8000;
				}
				if (tool == TinkerTools.largePlate) {
						return 12000;
				}
				return 1000;
		}

		private static void addRepairMaterial (int Material, ItemStack itemstack) {
				ItemStack rod = new ItemStack(TinkerTools.toolRod, 1, Material);
				PatternBuilder.instance.registerFullMaterial(itemstack, Material, TConstructRegistry.getMaterial(Material).materialName, itemstack, rod, Material);
		}

		private static void addCastingWithReverse (ItemStack output, FluidStack fluid, ItemStack cast) {
				TConstructHelper.addCastingRecipe(output, fluid, cast);
				TConstructHelper.addCastingRecipe(cast, new FluidStack(WurmTweaksFluid.fluidBrass, 1000), new ItemStack(output.getItem(), 1, output.getItemDamage()));
				TConstructHelper.addCastingRecipe(cast, new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000), new ItemStack(output.getItem(), 1, output.getItemDamage()));
		}
}

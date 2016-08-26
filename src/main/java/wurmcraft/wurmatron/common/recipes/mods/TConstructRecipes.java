package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermalfoundation.block.TFBlocks;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import com.rwtema.extrautils.modintegration.TConIntegration;
import cpw.mods.fml.common.Optional;
import net.minecraft.block.Block;
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
import wurmcraft.wurmatron.common.items.ItemCredit;
import wurmcraft.wurmatron.common.items.WTItems;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.machines.MachineHelper;
import wurmcraft.wurmatron.common.utils.tconstruct.TConstructHelper;

import java.util.ArrayList;

public class TConstructRecipes {

		private static RecipeHelper r = new RecipeHelper();

		public static Fluid[] TCFluid = {WurmTweaksFluid.fluidCopper, WurmTweaksFluid.fluidBronze, WurmTweaksFluid.fluidBismuthBronze, WurmTweaksFluid.fluidBlackBronze, WurmTweaksFluid.fluidWroughtIron, WurmTweaksFluid.fluidSteel, WurmTweaksFluid.fluidBlackSteel, WurmTweaksFluid.fluidBlueSteel, WurmTweaksFluid.fluidRedSteel, WurmTweaksFluid.fluidPlatinum};
		public static Block[] WTBlocks = {WurmTweaksBlocks.blockCopper, WurmTweaksBlocks.blockBronze, WurmTweaksBlocks.blockBismuthBronze, WurmTweaksBlocks.blockBlackBronze, WurmTweaksBlocks.blockWroughtIron, WurmTweaksBlocks.blockSteel, WurmTweaksBlocks.blockBlackSteel, WurmTweaksBlocks.blockBlueSteel, WurmTweaksBlocks.blockRedSteel, WurmTweaksBlocks.blockPlatinum};

		@Optional.Method (modid = "TConstruct")
		public static void addRecipes () {
				TConstructRegistry.getTableCasting().getCastingRecipes().clear();
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
				r.addShaped(new ItemStack(TinkerSmeltery.smeltery, 1, 0), "CSC", "GXG", "CSC", 'C', WurmTweaksBlocks.blockRedSteel, 'S', WurmTweaksItems.itemMachineFrame, 'G', "packGemExquisite", 'X', new ItemStack(TFBlocks.blockStorage, 1, 12));
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
				addMelting();
				addCastingRecipes();
				addAlloy();
		}

		private static void addFurnaceRecipes () {
				MachineHelper.addFurnaceRecipes(new ItemStack(TinkerTools.materials, 1, 2), new ItemStack(TinkerTools.craftedSoil, 1, 1));
		}

		private static void addMelting () {
				TConstructHelper.addMelting(new ItemStack(Items.iron_ingot, 1, 0), WurmTweaksBlocks.blockWroughtIron, 600, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(Items.gold_ingot, 1, 0), WurmTweaksBlocks.blockGold, 400, new FluidStack(WurmTweaksFluid.fluidGold, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronIngot, 1, 0), WurmTweaksBlocks.blockWroughtIron, 600, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.leadIngot, 1, 0), WurmTweaksBlocks.blockLead, 650, new FluidStack(WurmTweaksFluid.fluidLead, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.nickelIngot, 1, 0), WurmTweaksBlocks.blockNickel, 300, new FluidStack(WurmTweaksFluid.fluidNickel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.pigIronIngot, 1, 0), WurmTweaksBlocks.blockPigIron, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelIngot, 1, 0), WurmTweaksBlocks.blockRedSteel, 950, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.roseGoldIngot, 1, 0), WurmTweaksBlocks.blockRoseGold, 800, new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.silverIngot, 1, 0), WurmTweaksBlocks.blockSilver, 600, new FluidStack(WurmTweaksFluid.fluidSilver, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelIngot, 1, 0), WurmTweaksBlocks.blockSteel, 600, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.sterlingSilverIngot, 1, 0), WurmTweaksBlocks.blockSterlingSilver, 550, new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.tinIngot, 1, 0), WurmTweaksBlocks.blockTin, 200, new FluidStack(WurmTweaksFluid.fluidTin, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.zincIngot, 1, 0), WurmTweaksBlocks.blockZinc, 300, new FluidStack(WurmTweaksFluid.fluidZinc, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.platinumIngot, 1, 0), WurmTweaksBlocks.blockPlatinum, 800, new FluidStack(WurmTweaksFluid.fluidPlatinum, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthIngot, 1, 0), WurmTweaksBlocks.blockBismuth, 600, new FluidStack(WurmTweaksFluid.fluidBismuth, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeIngot, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 700, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeIngot, 1, 0), WurmTweaksBlocks.blockBlackBronze, 750, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelIngot, 1, 0), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.brassIngot, 1, 0), WurmTweaksBlocks.blockBrass, 500, new FluidStack(WurmTweaksFluid.fluidBrass, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeIngot, 1, 0), WurmTweaksBlocks.blockBronze, 650, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.copperIngot, 1, 0), WurmTweaksBlocks.blockCopper, 400, new FluidStack(WurmTweaksFluid.fluidCopper, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.goldIngot, 1, 0), WurmTweaksBlocks.blockGold, 350, new FluidStack(WurmTweaksFluid.fluidGold, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelIngot, 1, 0), WurmTweaksBlocks.blockBlueSteel, 600, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.unknownIngot, 1, 0), WurmTweaksBlocks.blockUnkown, 600, new FluidStack(WurmTweaksFluid.fluidUnknown, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelIngot, 1, 0), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.leadIngot2x, 1, 0), WurmTweaksBlocks.blockLead, 650, new FluidStack(WurmTweaksFluid.fluidLead, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.nickelIngot2x, 1, 0), WurmTweaksBlocks.blockNickel, 300, new FluidStack(WurmTweaksFluid.fluidNickel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.pigIronIngot2x, 1, 0), WurmTweaksBlocks.blockPigIron, 2000, new FluidStack(WurmTweaksFluid.fluidSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelIngot2x, 1, 0), WurmTweaksBlocks.blockRedSteel, 950, new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.roseGoldIngot2x, 1, 0), WurmTweaksBlocks.blockRoseGold, 800, new FluidStack(WurmTweaksFluid.fluidRoseGold, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.silverIngot2x, 1, 0), WurmTweaksBlocks.blockSilver, 600, new FluidStack(WurmTweaksFluid.fluidSilver, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelIngot2x, 1, 0), WurmTweaksBlocks.blockSteel, 600, new FluidStack(WurmTweaksFluid.fluidSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.sterlingSilverIngot2x, 1, 0), WurmTweaksBlocks.blockSterlingSilver, 550, new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.tinIngot2x, 1, 0), WurmTweaksBlocks.blockTin, 200, new FluidStack(WurmTweaksFluid.fluidTin, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.zincIngot2x, 1, 0), WurmTweaksBlocks.blockZinc, 300, new FluidStack(WurmTweaksFluid.fluidZinc, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.platinumIngot2x, 1, 0), WurmTweaksBlocks.blockPlatinum, 800, new FluidStack(WurmTweaksFluid.fluidPlatinum, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthIngot2x, 1, 0), WurmTweaksBlocks.blockBismuth, 600, new FluidStack(WurmTweaksFluid.fluidBismuth, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeIngot2x, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 700, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeIngot2x, 1, 0), WurmTweaksBlocks.blockBlackBronze, 750, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelIngot2x, 1, 0), WurmTweaksBlocks.blockBlackSteel, 2000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.brassIngot2x, 1, 0), WurmTweaksBlocks.blockBrass, 500, new FluidStack(WurmTweaksFluid.fluidBrass, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeIngot2x, 1, 0), WurmTweaksBlocks.blockBronze, 650, new FluidStack(WurmTweaksFluid.fluidBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.copperIngot2x, 1, 0), WurmTweaksBlocks.blockCopper, 400, new FluidStack(WurmTweaksFluid.fluidCopper, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.goldIngot2x, 1, 0), WurmTweaksBlocks.blockGold, 350, new FluidStack(WurmTweaksFluid.fluidGold, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelIngot2x, 1, 0), WurmTweaksBlocks.blockBlueSteel, 600, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelIngot2x, 1, 0), WurmTweaksBlocks.blockRedSteel, 2000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronSheet, 1, 0), WurmTweaksBlocks.blockWroughtIron, 600, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.leadSheet, 1, 0), WurmTweaksBlocks.blockLead, 650, new FluidStack(WurmTweaksFluid.fluidLead, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.nickelSheet, 1, 0), WurmTweaksBlocks.blockNickel, 300, new FluidStack(WurmTweaksFluid.fluidNickel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.pigIronSheet, 1, 0), WurmTweaksBlocks.blockPigIron, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelSheet, 1, 0), WurmTweaksBlocks.blockRedSteel, 950, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.roseGoldSheet, 1, 0), WurmTweaksBlocks.blockRoseGold, 800, new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.silverSheet, 1, 0), WurmTweaksBlocks.blockSilver, 600, new FluidStack(WurmTweaksFluid.fluidSilver, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelSheet, 1, 0), WurmTweaksBlocks.blockSteel, 600, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.sterlingSilverSheet, 1, 0), WurmTweaksBlocks.blockSterlingSilver, 550, new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.tinSheet, 1, 0), WurmTweaksBlocks.blockTin, 200, new FluidStack(WurmTweaksFluid.fluidTin, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.zincSheet, 1, 0), WurmTweaksBlocks.blockZinc, 300, new FluidStack(WurmTweaksFluid.fluidZinc, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.platinumSheet, 1, 0), WurmTweaksBlocks.blockPlatinum, 800, new FluidStack(WurmTweaksFluid.fluidPlatinum, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthSheet, 1, 0), WurmTweaksBlocks.blockBismuth, 600, new FluidStack(WurmTweaksFluid.fluidBismuth, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeSheet, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 700, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeSheet, 1, 0), WurmTweaksBlocks.blockBlackBronze, 750, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelSheet, 1, 0), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.brassSheet, 1, 0), WurmTweaksBlocks.blockBrass, 500, new FluidStack(WurmTweaksFluid.fluidBrass, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeSheet, 1, 0), WurmTweaksBlocks.blockBronze, 650, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.copperSheet, 1, 0), WurmTweaksBlocks.blockCopper, 400, new FluidStack(WurmTweaksFluid.fluidCopper, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.goldSheet, 1, 0), WurmTweaksBlocks.blockGold, 350, new FluidStack(WurmTweaksFluid.fluidGold, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelSheet, 1, 0), WurmTweaksBlocks.blockBlueSteel, 600, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelSheet, 1, 0), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronSheet2x, 1, 0), WurmTweaksBlocks.blockWroughtIron, 600, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.leadSheet2x, 1, 0), WurmTweaksBlocks.blockLead, 650, new FluidStack(WurmTweaksFluid.fluidLead, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.nickelSheet2x, 1, 0), WurmTweaksBlocks.blockNickel, 300, new FluidStack(WurmTweaksFluid.fluidNickel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.pigIronSheet2x, 1, 0), WurmTweaksBlocks.blockPigIron, 2000, new FluidStack(WurmTweaksFluid.fluidSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelSheet2x, 1, 0), WurmTweaksBlocks.blockRedSteel, 950, new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.roseGoldSheet2x, 1, 0), WurmTweaksBlocks.blockRoseGold, 800, new FluidStack(WurmTweaksFluid.fluidRoseGold, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.silverSheet2x, 1, 0), WurmTweaksBlocks.blockSilver, 600, new FluidStack(WurmTweaksFluid.fluidSilver, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelSheet2x, 1, 0), WurmTweaksBlocks.blockSteel, 600, new FluidStack(WurmTweaksFluid.fluidSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.sterlingSilverSheet2x, 1, 0), WurmTweaksBlocks.blockSterlingSilver, 550, new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.tinSheet2x, 1, 0), WurmTweaksBlocks.blockTin, 200, new FluidStack(WurmTweaksFluid.fluidTin, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.zincSheet2x, 1, 0), WurmTweaksBlocks.blockZinc, 300, new FluidStack(WurmTweaksFluid.fluidZinc, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.platinumSheet2x, 1, 0), WurmTweaksBlocks.blockPlatinum, 800, new FluidStack(WurmTweaksFluid.fluidPlatinum, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthSheet2x, 1, 0), WurmTweaksBlocks.blockBismuth, 600, new FluidStack(WurmTweaksFluid.fluidBismuth, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeSheet2x, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 700, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeSheet2x, 1, 0), WurmTweaksBlocks.blockBlackBronze, 750, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelSheet2x, 1, 0), WurmTweaksBlocks.blockBlackSteel, 2000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.brassSheet2x, 1, 0), WurmTweaksBlocks.blockBrass, 500, new FluidStack(WurmTweaksFluid.fluidBrass, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeSheet2x, 1, 0), WurmTweaksBlocks.blockBronze, 650, new FluidStack(WurmTweaksFluid.fluidBronze, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.copperSheet2x, 1, 0), WurmTweaksBlocks.blockCopper, 400, new FluidStack(WurmTweaksFluid.fluidCopper, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.goldSheet2x, 1, 0), WurmTweaksBlocks.blockGold, 350, new FluidStack(WurmTweaksFluid.fluidGold, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelSheet2x, 1, 0), WurmTweaksBlocks.blockBlueSteel, 600, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelSheet2x, 1, 0), WurmTweaksBlocks.blockRedSteel, 2000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000));
				TConstructHelper.addMelting(new ItemStack(ExtraUtils.bedrockium), ExtraUtils.bedrockiumBlock, 1500, new FluidStack(TConIntegration.bedrock, 1000));
				TConstructHelper.addMelting(TFItems.ingotEnderium, TFBlocks.blockFluidEnder, 12, 900, new FluidStack(TinkerSmeltery.moltenEnderiumFluid, 1000));
				for (int t = 201; t <= 210; t++)
						for (Item tool : TConstructHelper.TCTools)
								TConstructHelper.addMelting(new ItemStack(tool, 1, t), WTBlocks[t - 201], 900, new FluidStack(TCFluid[t - 201], getSize(tool)));
				TConstructHelper.addMelting(new ItemStack(TFCItems.copperHammerHead, 1, 0), WurmTweaksBlocks.blockCopper, 1000, new FluidStack(WurmTweaksFluid.fluidCopper, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeHammerHead, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeHammerHead, 1, 0), WurmTweaksBlocks.blockBlackBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeHammerHead, 1, 0), WurmTweaksBlocks.blockBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronHammerHead, 1, 0), WurmTweaksBlocks.blockWroughtIron, 1000, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelHammerHead, 1, 0), WurmTweaksBlocks.blockSteel, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelHammerHead, 1, 0), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelHammerHead, 1, 0), WurmTweaksBlocks.blockBlueSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelHammerHead, 1, 0), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeAxeHead, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeAxeHead, 1, 0), WurmTweaksBlocks.blockBlackBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeAxeHead, 1, 0), WurmTweaksBlocks.blockBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronAxeHead, 1, 0), WurmTweaksBlocks.blockWroughtIron, 1000, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelAxeHead, 1, 0), WurmTweaksBlocks.blockSteel, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelAxeHead, 1, 0), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelAxeHead, 1, 0), WurmTweaksBlocks.blockBlueSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelAxeHead, 1, 0), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzePickaxeHead, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzePickaxeHead, 1, 0), WurmTweaksBlocks.blockBlackBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzePickaxeHead, 1, 0), WurmTweaksBlocks.blockBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronPickaxeHead, 1, 0), WurmTweaksBlocks.blockWroughtIron, 1000, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelPickaxeHead, 1, 0), WurmTweaksBlocks.blockSteel, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelPickaxeHead, 1, 0), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelPickaxeHead, 1, 0), WurmTweaksBlocks.blockBlueSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelPickaxeHead, 1, 0), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeHoeHead, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeHoeHead, 1, 0), WurmTweaksBlocks.blockBlackBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeHoeHead, 1, 0), WurmTweaksBlocks.blockBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronHoeHead, 1, 0), WurmTweaksBlocks.blockWroughtIron, 1000, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelHoeHead, 1, 0), WurmTweaksBlocks.blockSteel, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelHoeHead, 1, 0), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelHoeHead, 1, 0), WurmTweaksBlocks.blockBlueSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelHoeHead, 1, 0), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeShovelHead, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeShovelHead, 1, 0), WurmTweaksBlocks.blockBlackBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeShovelHead, 1, 0), WurmTweaksBlocks.blockBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronShovelHead, 1, 0), WurmTweaksBlocks.blockWroughtIron, 1000, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelShovelHead, 1, 0), WurmTweaksBlocks.blockSteel, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelShovelHead, 1, 0), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelShovelHead, 1, 0), WurmTweaksBlocks.blockBlueSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelShovelHead, 1, 0), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeHoeHead, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeHoeHead, 1, 0), WurmTweaksBlocks.blockBlackBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeHoeHead, 1, 0), WurmTweaksBlocks.blockBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronHoeHead, 1, 0), WurmTweaksBlocks.blockWroughtIron, 1000, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelHoeHead, 1, 0), WurmTweaksBlocks.blockSteel, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelHoeHead, 1, 0), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelHoeHead, 1, 0), WurmTweaksBlocks.blockBlueSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelHoeHead, 1, 0), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeMaceHead, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeMaceHead, 1, 0), WurmTweaksBlocks.blockBlackBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeMaceHead, 1, 0), WurmTweaksBlocks.blockBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronMaceHead, 1, 0), WurmTweaksBlocks.blockWroughtIron, 1000, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelMaceHead, 1, 0), WurmTweaksBlocks.blockSteel, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelMaceHead, 1, 0), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelMaceHead, 1, 0), WurmTweaksBlocks.blockBlueSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelMaceHead, 1, 0), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeSwordHead, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeSwordHead, 1, 0), WurmTweaksBlocks.blockBlackBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeSwordHead, 1, 0), WurmTweaksBlocks.blockBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronSwordHead, 1, 0), WurmTweaksBlocks.blockWroughtIron, 1000, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelSwordHead, 1, 0), WurmTweaksBlocks.blockSteel, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelSwordHead, 1, 0), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelSwordHead, 1, 0), WurmTweaksBlocks.blockBlueSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelSwordHead, 1, 0), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bismuthBronzeJavelinHead, 1, 0), WurmTweaksBlocks.blockBismuthBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackBronzeJavelinHead, 1, 0), WurmTweaksBlocks.blockBlackBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.bronzeJavelinHead, 1, 0), WurmTweaksBlocks.blockBronze, 1000, new FluidStack(WurmTweaksFluid.fluidBronze, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.wroughtIronJavelinHead, 1, 0), WurmTweaksBlocks.blockWroughtIron, 1000, new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.steelJavelinHead, 1, 0), WurmTweaksBlocks.blockSteel, 1000, new FluidStack(WurmTweaksFluid.fluidSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blackSteelJavelinHead, 1, 0), WurmTweaksBlocks.blockBlackSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.blueSteelJavelinHead, 1, 0), WurmTweaksBlocks.blockBlueSteel, 1000, new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(TFCItems.redSteelJavelinHead, 1, 0), WurmTweaksBlocks.blockRedSteel, 1000, new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000));
				TConstructHelper.addMelting(new ItemStack(ExtraUtils.cobblestoneCompr, 1, 0), ExtraUtils.bedrockiumBlock, 1200, new FluidStack(TinkerSmeltery.moltenStoneFluid, 50));
				TConstructHelper.addMelting(new ItemStack(ExtraUtils.cobblestoneCompr, 1, 1), ExtraUtils.bedrockiumBlock, 1200, new FluidStack(TinkerSmeltery.moltenStoneFluid, 450));
				TConstructHelper.addMelting(new ItemStack(ExtraUtils.cobblestoneCompr, 1, 2), ExtraUtils.bedrockiumBlock, 1200, new FluidStack(TinkerSmeltery.moltenStoneFluid, 4050));
				TConstructHelper.addMelting(new ItemStack(ExtraUtils.cobblestoneCompr, 1, 3), ExtraUtils.bedrockiumBlock, 1200, new FluidStack(TinkerSmeltery.moltenStoneFluid, 36450));
				TConstructHelper.addMelting(new ItemStack(ExtraUtils.cobblestoneCompr, 1, 4), ExtraUtils.bedrockiumBlock, 1200, new FluidStack(TinkerSmeltery.moltenStoneFluid, 328050));
				TConstructHelper.addMelting(new ItemStack(ExtraUtils.cobblestoneCompr, 1, 5), ExtraUtils.bedrockiumBlock, 1200, new FluidStack(TinkerSmeltery.moltenStoneFluid, 2952450));
				TConstructHelper.addMelting(new ItemStack(Blocks.cobblestone, 1, 0), Blocks.cobblestone, 1000, new FluidStack(TinkerSmeltery.moltenStoneFluid, 5));
				TConstructHelper.addMelting(new ItemStack(Blocks.stone, 1, 0), Blocks.stone, 1000, new FluidStack(TinkerSmeltery.moltenStoneFluid, 25));
				TConstructHelper.addMelting(new ItemStack(Blocks.redstone_block, 1, 0), Blocks.redstone_block, 800, new FluidStack(TFBlocks.blockFluidRedstone.getFluid(), 1000));
				TConstructHelper.addMelting(new ItemStack(WurmTweaksBlocks.blockCompressedRedstone, 1, 0), WurmTweaksBlocks.blockCompressedRedstone, 1000, new FluidStack(TFBlocks.blockFluidRedstone.getFluid(), 4000));
				TConstructHelper.addMelting(new ItemStack(Blocks.glass, 1, 0), Blocks.glass, 150, new FluidStack(TinkerSmeltery.moltenGlassFluid, 1000));
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
				TConstructHelper.addMelting(new ItemStack(Items.ender_pearl, 1, 0), TFBlocks.blockFluidEnder, 800, new FluidStack(TinkerSmeltery.moltenEnderFluid, 100));
		}

		private static void addCastingRecipes () {
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerTools.blankPattern, 1, 2), new FluidStack(WurmTweaksFluid.fluidBrass, 1000), null);
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerTools.blankPattern, 1, 1), new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000), null);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.leadIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidLead, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.nickelIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidNickel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.pigIronIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidSteel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.redSteelIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.roseGoldIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.silverIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidSilver, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.steelIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidSteel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.sterlingSilverIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.tinIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidTin, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.zincIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidZinc, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.platinumIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidPlatinum, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.bismuthIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidBismuth, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TFCItems.unknownIngot, 1, 0), new FluidStack(WurmTweaksFluid.fluidUnknown, 1000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.leadIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidLead, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.nickelIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidNickel, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.pigIronIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidSteel, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.roseGoldIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidRoseGold, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.silverIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidSilver, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidSteel, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.sterlingSilverIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.tinIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidTin, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.zincIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidZinc, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.platinumIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidPlatinum, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthIngot2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidBismuth, 2000), WurmTweaksItems.itemDoubleIngotCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.leadSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidLead, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.nickelSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidNickel, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.pigIronSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidSteel, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.roseGoldSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.silverSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidSilver, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidSteel, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.sterlingSilverSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.tinSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidTin, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.zincSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidZinc, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.platinumSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidPlatinum, 1000), WurmTweaksItems.itemSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthSheet, 1, 0), new FluidStack(WurmTweaksFluid.fluidBismuth, 1000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.leadSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidLead, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.nickelSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidNickel, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.pigIronSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidSteel, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidRedSteel, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.roseGoldSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidRoseGold, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.silverSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidSilver, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidSteel, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.sterlingSilverSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidSterlingSilver, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.tinSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidTin, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.zincSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidZinc, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.platinumSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidPlatinum, 2000), WurmTweaksItems.item2xSheetCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthSheet2x, 1, 0), new FluidStack(WurmTweaksFluid.fluidBismuth, 2000), WurmTweaksItems.item2xSheetCast);
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
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerTools.materials, 1, 2), new FluidStack(TinkerSmeltery.moltenStoneFluid, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				TConstructHelper.addCastingRecipe(TFItems.ingotEnderium, new FluidStack(TinkerSmeltery.moltenEnderiumFluid, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				for (int c = 0; c < ItemCredit.units.length; c++) {
						TConstructHelper.addMelting(new ItemStack(WTItems.creditBismuth, 1, c), WurmTweaksBlocks.blockBismuth, 800, new FluidStack(WurmTweaksFluid.fluidBismuth, ItemCredit.units[c] * 10));
						TConstructHelper.addMelting(new ItemStack(WTItems.creditGold, 1, c), WurmTweaksBlocks.blockGold, 800, new FluidStack(WurmTweaksFluid.fluidGold, ItemCredit.units[c] * 10));
						TConstructHelper.addMelting(new ItemStack(WTItems.creditLead, 1, c), WurmTweaksBlocks.blockLead, 800, new FluidStack(WurmTweaksFluid.fluidLead, ItemCredit.units[c] * 10));
						TConstructHelper.addMelting(new ItemStack(WTItems.creditNickel, 1, c), WurmTweaksBlocks.blockNickel, 800, new FluidStack(WurmTweaksFluid.fluidNickel, ItemCredit.units[c] * 10));
						TConstructHelper.addMelting(new ItemStack(WTItems.creditSilver, 1, c), WurmTweaksBlocks.blockSilver, 800, new FluidStack(WurmTweaksFluid.fluidSilver, ItemCredit.units[c] * 10));
						TConstructHelper.addMelting(new ItemStack(WTItems.creditCopper, 1, c), WurmTweaksBlocks.blockCopper, 800, new FluidStack(WurmTweaksFluid.fluidCopper, ItemCredit.units[c] * 10));
						TConstructHelper.addMelting(new ItemStack(WTItems.creditPlatinum, 1, c), WurmTweaksBlocks.blockPlatinum, 800, new FluidStack(WurmTweaksFluid.fluidPlatinum, ItemCredit.units[c] * 10));
						TConstructHelper.addMelting(new ItemStack(WTItems.creditZinc, 1, c), WurmTweaksBlocks.blockZinc, 800, new FluidStack(WurmTweaksFluid.fluidZinc, ItemCredit.units[c] * 10));
						TConstructHelper.addMelting(new ItemStack(WTItems.creditIron, 1, c), WurmTweaksBlocks.blockWroughtIron, 800, new FluidStack(WurmTweaksFluid.fluidWroughtIron, ItemCredit.units[c] * 10));
						TConstructHelper.addMelting(new ItemStack(WTItems.creditTin, 1, c), WurmTweaksBlocks.blockTin, 800, new FluidStack(WurmTweaksFluid.fluidTin, ItemCredit.units[c] * 10));
				}
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
				addCastingWithReverse(new ItemStack(TFCItems.copperPickaxeHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzePickaxeHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzePickaxeHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzePickaxeHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronPickaxeHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelPickaxeHead), new FluidStack(WurmTweaksFluid.fluidSteel, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelPickaxeHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelPickaxeHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelPickaxeHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemPickCast);
				addCastingWithReverse(new ItemStack(TFCItems.copperAxeHead), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), WurmTweaksItems.itemAxeCast);
				addCastingWithReverse(new ItemStack(TFCItems.bismuthBronzeAxeHead), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), WurmTweaksItems.itemAxeCast);
				addCastingWithReverse(new ItemStack(TFCItems.bronzeAxeHead), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), WurmTweaksItems.itemAxeCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackBronzeAxeHead), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), WurmTweaksItems.itemAxeCast);
				addCastingWithReverse(new ItemStack(TFCItems.wroughtIronAxeHead), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), WurmTweaksItems.itemAxeCast);
				addCastingWithReverse(new ItemStack(TFCItems.steelAxeHead), new FluidStack(WurmTweaksFluid.fluidSteel, 1000), WurmTweaksItems.itemAxeCast);
				addCastingWithReverse(new ItemStack(TFCItems.blackSteelAxeHead), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), WurmTweaksItems.itemAxeCast);
				addCastingWithReverse(new ItemStack(TFCItems.redSteelAxeHead), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), WurmTweaksItems.itemAxeCast);
				addCastingWithReverse(new ItemStack(TFCItems.blueSteelAxeHead), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), WurmTweaksItems.itemAxeCast);
				addCastingWithReverse(TFItems.ingotSignalum, new FluidStack(TinkerSmeltery.moltenSignalumFluid, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(ExtraUtils.bedrockium), new FluidStack(TConIntegration.bedrock, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.partShuriken, 1, 201), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), new ItemStack(TinkerWeaponry.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.partShuriken, 1, 202), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), new ItemStack(TinkerWeaponry.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.partShuriken, 1, 203), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), new ItemStack(TinkerWeaponry.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.partShuriken, 1, 204), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), new ItemStack(TinkerWeaponry.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.partShuriken, 1, 205), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), new ItemStack(TinkerWeaponry.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.partShuriken, 1, 206), new FluidStack(WurmTweaksFluid.fluidSteel, 1000), new ItemStack(TinkerWeaponry.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.partShuriken, 1, 207), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), new ItemStack(TinkerWeaponry.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.partShuriken, 1, 208), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), new ItemStack(TinkerWeaponry.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.partShuriken, 1, 209), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), new ItemStack(TinkerWeaponry.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.partShuriken, 1, 210), new FluidStack(WurmTweaksFluid.fluidPlatinum, 1000), new ItemStack(TinkerWeaponry.metalPattern, 1, 0));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.arrowhead, 1, 201), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 25));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.arrowhead, 1, 202), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 25));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.arrowhead, 1, 203), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 25));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.arrowhead, 1, 204), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 25));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.arrowhead, 1, 205), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 25));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.arrowhead, 1, 206), new FluidStack(WurmTweaksFluid.fluidSteel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 25));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.arrowhead, 1, 207), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 25));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.arrowhead, 1, 208), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 25));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.arrowhead, 1, 209), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 25));
				addCastingWithReverse(new ItemStack(TinkerWeaponry.arrowhead, 1, 210), new FluidStack(WurmTweaksFluid.fluidPlatinum, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 25));
				addCastingWithReverse(new ItemStack(TinkerTools.materials, 1, 2), new FluidStack(TinkerSmeltery.moltenStoneFluid, 1000), new ItemStack(TinkerSmeltery.metalPattern, 1, 0));
				for (Item tool : TConstructHelper.TCTools)
						for (int fluid = 0; fluid < TCFluid.length; fluid++)
								TConstructRegistry.getTableCasting().addCastingRecipe(new ItemStack(tool, 1, 201 + fluid), new FluidStack(TCFluid[fluid], getSize(tool)), getPattern(tool), 40);
				for (Item tool : TConstructHelper.TCTools) {
						for (int i = 201; i <= 210; i++) {
								TConstructHelper.addCastingRecipe(getPattern(tool), new FluidStack(WurmTweaksFluid.fluidBrass, 1000), new ItemStack(tool, 1, i));
								TConstructHelper.addCastingRecipe(getPattern(tool), new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000), new ItemStack(tool, 1, i));
						}
						TConstructHelper.addCastingRecipe(getPattern(tool), new FluidStack(WurmTweaksFluid.fluidBrass, 1000), new ItemStack(tool, 1, 1));
						TConstructHelper.addCastingRecipe(getPattern(tool), new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000), new ItemStack(tool, 1, 1));
				}
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerWeaponry.partBolt, 1, 201), new FluidStack(WurmTweaksFluid.fluidCopper, 1000), new ItemStack(TinkerTools.toolRod, 1, 201));
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerWeaponry.partBolt, 1, 202), new FluidStack(WurmTweaksFluid.fluidBronze, 1000), new ItemStack(TinkerTools.toolRod, 1, 202));
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerWeaponry.partBolt, 1, 203), new FluidStack(WurmTweaksFluid.fluidBismuthBronze, 1000), new ItemStack(TinkerTools.toolRod, 1, 203));
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerWeaponry.partBolt, 1, 204), new FluidStack(WurmTweaksFluid.fluidBlackBronze, 1000), new ItemStack(TinkerTools.toolRod, 1, 204));
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerWeaponry.partBolt, 1, 205), new FluidStack(WurmTweaksFluid.fluidWroughtIron, 1000), new ItemStack(TinkerTools.toolRod, 1, 205));
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerWeaponry.partBolt, 1, 206), new FluidStack(WurmTweaksFluid.fluidSteel, 1000), new ItemStack(TinkerTools.toolRod, 1, 206));
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerWeaponry.partBolt, 1, 207), new FluidStack(WurmTweaksFluid.fluidBlackSteel, 1000), new ItemStack(TinkerTools.toolRod, 1, 207));
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerWeaponry.partBolt, 1, 208), new FluidStack(WurmTweaksFluid.fluidBlueSteel, 1000), new ItemStack(TinkerTools.toolRod, 1, 208));
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerWeaponry.partBolt, 1, 209), new FluidStack(WurmTweaksFluid.fluidRedSteel, 1000), new ItemStack(TinkerTools.toolRod, 1, 209));
				TConstructHelper.addCastingRecipe(new ItemStack(TinkerWeaponry.partBolt, 1, 210), new FluidStack(WurmTweaksFluid.fluidPlatinum, 1000), new ItemStack(TinkerTools.toolRod, 1, 210));
				ArrayList<FluidStack> metals = new ArrayList<FluidStack>();
				metals.add(new FluidStack(WurmTweaksFluid.fluidRoseGold, 1000));
				metals.add(new FluidStack(WurmTweaksFluid.fluidBrass, 1000));
				for (FluidStack castFluids : metals) {
						for (ItemStack ingots : OreDictionary.getOres("packIngot"))
								TConstructHelper.addCastingRecipe(new ItemStack(TinkerSmeltery.metalPattern, 1, 0), castFluids, ingots);
						for (Item tools : TConstructHelper.TCTools) {
								for (int i = 201; i <= 210; i++)
										TConstructHelper.addCastingRecipe(getPattern(tools), castFluids, new ItemStack(tools, 1, i));
								TConstructHelper.addCastingRecipe(getPattern(tools), castFluids, new ItemStack(tools, 1, 1));
						}
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
				Smeltery.addAlloyMixing(new FluidStack(TinkerSmeltery.moltenEnderiumFluid, 1000), new FluidStack(TinkerSmeltery.moltenEnderFluid, 2000), new FluidStack(WurmTweaksFluid.fluidPlatinum, 2000), new FluidStack(WurmTweaksFluid.fluidRedSteel, 500));
		}

		private static void addMaterials () {
				// Copper
				ToolMaterial TCopper = new ToolMaterial("TCopper", "TFCCopper", 5, 600, 800, 170, 1f, 0, 0, EnumChatFormatting.AQUA.toString(), 0x33100B);
				TConstructRegistry.addtoolMaterial(201, TCopper);
				TConstructRegistry.addArrowMaterial(201, 0.01f, 0.6f);
				TConstructRegistry.addBowMaterial(201, 110, 4f);
				TConstructRegistry.toolMaterials.put(201, TCopper);
				addRepairMaterial(201, new ItemStack(TFCItems.copperIngot));
				TConstructRegistry.addDefaultToolPartMaterial(201);
				// Bronze
				ToolMaterial TBronze = new ToolMaterial("TBronze", "TFCBronze", 5, 1300, 1100, 225, 1f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x4B4021);
				TConstructRegistry.addtoolMaterial(202, TBronze);
				TConstructRegistry.addArrowMaterial(202, 0.04f, 0.4f);
				TConstructRegistry.addBowMaterial(202, 130, 4f);
				TConstructRegistry.toolMaterials.put(202, TBronze);
				addRepairMaterial(202, new ItemStack(TFCItems.bronzeIngot));
				TConstructRegistry.addDefaultToolPartMaterial(202);
				// Bismuth Bronze
				ToolMaterial TBismuthBronze = new ToolMaterial("TBismuthBronze", "Bismuth Bronze", 5, 1200, 1000, 215, 1f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x142B17);
				TConstructRegistry.addtoolMaterial(203, TBismuthBronze);
				TConstructRegistry.addArrowMaterial(203, 0.2f, 0.6f);
				TConstructRegistry.addBowMaterial(203, 120, 6f);
				TConstructRegistry.toolMaterials.put(203, TBismuthBronze);
				addRepairMaterial(203, new ItemStack(TFCItems.bismuthBronzeIngot));
				TConstructRegistry.addDefaultToolPartMaterial(203);
				// Black Bronze
				ToolMaterial TBlackBronze = new ToolMaterial("TBlackBronze", "Black Bronze", 5, 1460, 900, 235, 1f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x271433);
				TConstructRegistry.addtoolMaterial(204, TBlackBronze);
				TConstructRegistry.addArrowMaterial(204, 0.1f, 0.6f);
				TConstructRegistry.addBowMaterial(204, 100, 8f);
				TConstructRegistry.toolMaterials.put(204, TBlackBronze);
				addRepairMaterial(204, new ItemStack(TFCItems.blackBronzeIngot));
				TConstructRegistry.addDefaultToolPartMaterial(204);
				// Wrought Iron
				ToolMaterial TWroughtIron = new ToolMaterial("TWroughtIron", "Wrought Iron", 6, 2200, 1200, 245, 1f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x565656);
				TConstructRegistry.addtoolMaterial(205, TWroughtIron);
				TConstructRegistry.addArrowMaterial(205, 0.0f, 0.6f);
				TConstructRegistry.addBowMaterial(205, 85, 8f);
				TConstructRegistry.toolMaterials.put(205, TWroughtIron);
				addRepairMaterial(205, new ItemStack(TFCItems.wroughtIronIngot));
				TConstructRegistry.addDefaultToolPartMaterial(205);
				// Steel
				ToolMaterial TSteel = new ToolMaterial("TFCSteel", "TFCSteel", 7, 3300, 1400, 270, 1f, 0, 0, EnumChatFormatting.GOLD.toString(), 0x2A2A2A);
				TConstructRegistry.addtoolMaterial(206, TSteel);
				TConstructRegistry.addArrowMaterial(206, 0.0f, 0.6f);
				TConstructRegistry.addBowMaterial(206, 100, 8f);
				TConstructRegistry.toolMaterials.put(206, TSteel);
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
				if (tool == TinkerWeaponry.partCrossbowBody || tool == TinkerWeaponry.partBowLimb || tool == TinkerWeaponry.partCrossbowLimb) {
						if (tool == TinkerWeaponry.partCrossbowBody) {
								meta = 2;
						} else if (tool == TinkerWeaponry.partBowLimb) {
								meta = 3;
						} else if (tool == TinkerWeaponry.partCrossbowLimb) {
								meta = 1;
						}
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

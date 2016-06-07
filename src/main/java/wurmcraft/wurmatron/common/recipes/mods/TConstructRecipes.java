package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import tconstruct.smeltery.TinkerSmeltery;
import tconstruct.tools.TinkerTools;
import tconstruct.world.TinkerWorld;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.thermalexpansion.TEHelper;

public class TConstructRecipes {

		private static RecipeHelper r = new RecipeHelper();

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
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 5), "III", "CSC", "III", 'I', TFCItems.goldSheet2x, 'C', "packChest", 'S', Blocks.bookshelf);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 0), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockWroughtIron, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 1), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockGold, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 9), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockSilver, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 13), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockSteel, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 10), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockPlatinum, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolForge, 1, 11), "SSS", "B B", "B B", 'B', WurmTweaksBlocks.blockBronze, 'S', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 10), "SSS", "L L", "L L", 'S', "packLog", 'L', TFCItems.blackSteelSheet);
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 11), "SSS", "L L", "L L", 'S', "packLog", 'L', TFCItems.blackSteelSheet);
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 12), "SSS", "L L", "L L", 'S', "packLog", 'L', TFCItems.blackSteelSheet);
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 13), "SSS", "L L", "L L", 'S', "packLog", 'L', TFCItems.blackSteelSheet);
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 0), "SSS", "L L", "L L", 'S', TFCItems.redSteelSheet, 'L', "packLog");
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 1), "SSS", "L L", "L L", 'S', TFCItems.redSteelSheet, 'L', "packLog");
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 2), "SSS", "L L", "L L", 'S', TFCItems.redSteelSheet, 'L', "packLog");
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 3), "SSS", "L L", "L L", 'S', TFCItems.redSteelSheet, 'L', "packLog");
				r.addShaped(new ItemStack(TinkerTools.toolStationWood, 1, 4), "SSS", "L L", "L L", 'S', TFCItems.redSteelSheet, 'L', "packLog");
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import appeng.api.util.AEColor;
import appeng.core.Api;
import buildcraft.BuildCraftCore;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import crazypants.enderio.EnderIO;
import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.api.IModRecipes;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;

public class EnderIORecipes implements IModRecipes {

		@Optional.Method (modid = "EnderIO")
		@Override
		public void addRecipes () {
				r.addShaped(EnderIO.blockStirlingGenerator, "SSS", "SES", "GXG", 'S', new ItemStack(EnderIO.itemAlloy, 1, 0), 'E', new ItemStack(BuildCraftCore.engineBlock, 1, 1), 'G', "gearIron", Blocks.piston);
				r.addShaped(EnderIO.blockCombustionGenerator, "SSS", "SES", "GXG", 'S', new ItemStack(EnderIO.itemAlloy, 1, 0), 'E', new ItemStack(BuildCraftCore.engineBlock, 1, 2), 'G', "gearGold", Blocks.piston);
				r.addShaped(EnderIO.blockZombieGenerator, "SSS", "SES", "GXG", 'S', new ItemStack(EnderIO.itemAlloy, 1, 0), 'E', EnderIO.itemFrankenSkull, 'G', "gearGold", Blocks.piston);
				r.addShaped(new ItemStack(EnderIO.blockSolarPanel, 1, 0), "IGI", "GCG", "XAX", 'I', new ItemStack(EnderIO.itemAlloy, 1, 1), 'G', "packGlass", 'C', WurmTweaksItems.itemSolarCore, 'X', TFCItems.platinumSheet2x, 'A', new ItemStack(EnderIO.itemMaterial));
				r.addShaped(new ItemStack(EnderIO.blockSolarPanel, 1, 1), "IGI", "GCG", "XAX", 'I', new ItemStack(EnderIO.itemAlloy, 1, 1), 'G', "packGlass", 'C', TFCItems.platinumSheet2x, 'X', new ItemStack(EnderIO.blockSolarPanel, 1, 0), 'A', new ItemStack(EnderIO.itemMaterial));
				r.addBasicMachineRecipe(EnderIO.blockCrusher, "packGemExquisite", new ItemStack(EnderIO.itemAlloy, 1, 2), WurmTweaksItems.itemMixedSheet, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(EnderIO.blockAlloySmelter, TFCItems.wroughtIronSheet2x, IC2Items.getItem("inductionFurnace"), WurmTweaksBlocks.blockWroughtIron, WurmTweaksItems.itemMachineFrame);
				// TODO Creative Capacitor
				r.addCrossWCenter(new ItemStack(EnderIO.blockCapacitorBank, 1, 1), WurmTweaksBlocks.blockCompressedRedstone, new ItemStack(EnderIO.blockCapacitorBank, 1, 1), WurmTweaksBlocks.blockGold);
				r.addCrossWCenter(new ItemStack(EnderIO.blockCapacitorBank, 1, 2), new ItemStack(EnderIO.itemBasicCapacitor, 1, 1), EnderIO.itemBasicCapacitor, WurmTweaksBlocks.blockGold);
				r.addCrossWCenter(new ItemStack(EnderIO.blockCapacitorBank, 1, 3), new ItemStack(EnderIO.itemBasicCapacitor, 1, 2), EnderIO.itemBasicCapacitor, new ItemStack(EnderIO.itemMaterial, 1, 6));
				r.addBasicMachineRecipe(EnderIO.blockPainter, "packGemExquisite", EnderIO.itemAlloy, WurmTweaksItems.ingotPinkSteel, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(EnderIO.blockCrafter, "packCraftingTable", EnderIO.itemAlloy, "packIngot", WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(EnderIO.blockPowerMonitor, EnderIO.itemAlloy, EnderIO.itemPowerConduit, EnderIO.itemRedstoneConduit, EnderIO.itemConduitProbe);
				r.addBasicMachineRecipe(EnderIO.blockFarmStation, "packGemExquisite", "packSeed", TFCItems.redSteelBucketEmpty, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(EnderIO.blockWirelessCharger, "packGemBlock", WurmTweaksItems.itemQuantumCore, EnderIO.itemAlloy, WurmTweaksItems.itemMachineFrame);
				r.addCircleWCenter(EnderIO.blockTank, EnderIO.itemAlloy, "packGlass");
				r.addCircleWCenter(new ItemStack(EnderIO.blockTank, 1, 1), new ItemStack(EnderIO.itemAlloy, 1, 6), "packGlass");
				r.addCircleWCenter(EnderIO.blockReservoir, "packGlass", Blocks.cauldron);
				r.addCrossWCenter(EnderIO.blockVacuumChest, Items.ender_pearl, WurmTweaksItems.itemQuantumFoam, "packChest");
				r.addBasicMachineRecipe(EnderIO.blockTransceiver, new ItemStack(EnderIO.itemAlloy, 1, 6), "packIngot", Items.redstone, WurmTweaksItems.itemMachineFrame);
				r.addBasicMachineRecipe(EnderIO.blockInventoryPanel, new ItemStack(EnderIO.itemAlloy, 1, 6), "packGemExquisite", EnderIO.blockFusedQuartz, WurmTweaksItems.itemQuantumSingularity);
				r.addCrossWCenter(EnderIO.blockEnderIo, new ItemStack(EnderIO.itemAlloy, 1, 6), "packGlass", Items.ender_eye);
				r.addCrossWCenter(EnderIO.blockTravelPlatform, TFItems.ingotEnderium, new ItemStack(EnderIO.itemMaterial, 1, 5), EnderIO.blockEnderIo);
				r.addCrossWCenter(EnderIO.blockTelePad, TFItems.ingotEnderium, new ItemStack(EnderIO.itemMaterial, 1, 5), Items.ender_pearl);
				r.addShaped(EnderIO.blockKillerJoe, "SSS", "XAX", "BCB", 'S', TFCItems.roseGoldSheet2x, 'X', "packGlass", 'A', EnderIO.itemFrankenSkull, 'B', TFCItems.blackSteelSheet2x, 'C', WurmTweaksItems.itemMachineFrame);
				r.addShaped(EnderIO.blockAttractor, " G ", "XAX", "ABA", 'G', new ItemStack(EnderIO.itemMaterial, 1, 9), 'X', new ItemStack(EnderIO.itemAlloy, 1, 1), 'A', new ItemStack(EnderIO.itemAlloy, 1, 2), WurmTweaksItems.itemMagicChunk);
				r.addShaped(EnderIO.blockSpawnGuard, " G ", "XAX", "ABA", 'G', new ItemStack(EnderIO.itemMaterial, 1, 7), 'X', new ItemStack(EnderIO.itemAlloy, 1, 1), 'A', new ItemStack(EnderIO.itemAlloy, 1, 2), WurmTweaksItems.itemMagicChunk);
				r.addShaped(EnderIO.blockExperianceOblisk, " G ", "XAX", "ABA", 'G', new ItemStack(EnderIO.itemXpTransfer, 1, 7), 'X', new ItemStack(EnderIO.itemAlloy, 1, 1), 'A', new ItemStack(EnderIO.itemAlloy, 1, 2), WurmTweaksItems.itemMagicChunk);
				r.addShaped(EnderIO.blockEnchanter, "GEG", "III", " I I", 'G', "packGemExquisite", 'E', Blocks.enchanting_table, 'I', new ItemStack(EnderIO.itemAlloy, 1, 6));
				r.addPressurePlate(new ItemStack(EnderIO.blockDarkSteelPressurePlate, 1, 0), new ItemStack(EnderIO.itemMaterial, 1, 6));
				r.addShapeless(new ItemStack(EnderIO.blockDarkSteelPressurePlate, 1, 1), new ItemStack(EnderIO.blockDarkSteelPressurePlate, 1, 0), new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(EnderIO.blockDarkSteelAnvil, "BBB", " I ", "III", 'I', new ItemStack(EnderIO.blockDarkSteelPressurePlate, 1, 0), 'B', new ItemStack(EnderIO.blockIngotStorage, 1, 6));
				r.addShaped(new ItemStack(EnderIO.blockDarkSteelLadder, 8), "III", " I ", "III", 'I', new ItemStack(EnderIO.itemMaterial, 1, 6));
				r.addCross(new ItemStack(EnderIO.blockReinforcedObsidian, 4), Blocks.obsidian, new ItemStack(EnderIO.itemMaterial, 1, 6));
				r.addShaped(EnderIO.blockEnderRail, "E E", " R ", "E E", 'E', Items.ender_pearl, 'R', Blocks.rail);
				// TODO Metal Blocks
				// TODO Sag Mill Recipes
				// TODO Alloy Smelter Recipes
				// TODO Fix Farmer
				r.addSlabs(new ItemStack(EnderIO.blockDarkIronBars, 24), new ItemStack(EnderIO.itemMaterial, 1, 6));
				r.addBasicMachineRecipe(EnderIO.itemFrankenSkull, new ItemStack(EnderIO.itemMaterial, 1, 2), new ItemStack(EnderIO.itemMaterial, 1, 6), new ItemStack(EnderIO.itemBasicCapacitor, 1, 2), new ItemStack(Items.skull, 1, 2));
				r.addShaped(new ItemStack(EnderIO.itemRedstoneConduit, 8, 0), "III", "ingotRedstoneAlloy");
				r.addShapeless(new ItemStack(EnderIO.itemRedstoneConduit, 1, 1), new ItemStack(EnderIO.itemRedstoneConduit, 1, 0), Blocks.lever);
				r.addShaped(new ItemStack(EnderIO.itemRedstoneConduit, 3, 2), "RRR", "III", "RRR", 'R', "packRubber", 'I', new ItemStack(EnderIO.itemRedstoneConduit, 1, 0));
				r.addShaped(new ItemStack(EnderIO.itemRedstoneConduit, 8, 2), "RRR", "III", "RRR", 'R', "packRubber", 'I', "ingotRedstoneAlloy");
				r.addShaped(new ItemStack(EnderIO.itemPowerConduit, 6, 0), "RRR", "III", "RRR", 'R', "packRubber", 'I', new ItemStack(EnderIO.itemAlloy, 1, 4));
				r.addShaped(new ItemStack(EnderIO.itemPowerConduit, 6, 1), "RRR", "III", "RRR", 'R', "packRubber", 'I', new ItemStack(EnderIO.itemAlloy, 1, 1));
				r.addShaped(new ItemStack(EnderIO.itemPowerConduit, 6, 2), "RRR", "III", "RRR", 'R', "packRubber", 'I', new ItemStack(EnderIO.itemAlloy, 1, 2));
				r.addShaped(new ItemStack(EnderIO.itemLiquidConduit, 6, 0), "RRR", "III", "RRR", 'R', "packRubber", 'I', "packGlass");
				r.addShaped(new ItemStack(EnderIO.itemLiquidConduit, 3, 1), "RRR", "III", "RRR", 'R', "packRubber", 'I', new ItemStack(EnderIO.itemLiquidConduit, 6, 0));
				r.addShaped(new ItemStack(EnderIO.itemLiquidConduit, 3, 2), "RRR", "III", "RRR", 'R', "packRubber", 'I', new ItemStack(EnderIO.itemLiquidConduit, 1, 1));
				r.addShaped(new ItemStack(EnderIO.itemItemConduit, 3, 0), "RRR", "III", "RRR", 'R', "packRubber", 'I', new ItemStack(EnderIO.itemLiquidConduit, 1, 5));
				r.addShaped(new ItemStack(EnderIO.itemGasConduit, 3, 0), "RRR", "III", "RRR", 'R', "packRubber", 'I', new ItemStack(EnderIO.itemMaterial, 1, 1));
				r.addCircle(new ItemStack(EnderIO.blockConduitFacade, 8), new ItemStack(EnderIO.itemMaterial, 1, 1));
				r.addCircleWCenter(new ItemStack(EnderIO.blockConduitFacade, 8, 1), new ItemStack(EnderIO.itemMaterial, 1, 1), "dustObsidian");
				r.addShaped(new ItemStack(EnderIO.itemMEConduit, 3, 0), "RRR", "III", "RRR", 'R', "packRubber", 'I', new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, OreDictionary.WILDCARD_VALUE));
				r.addShaped(new ItemStack(EnderIO.itemMEConduit, 3, 1), "RRR", "III", "RRR", 'R', "packRubber", 'I', new ItemStack(EnderIO.itemMEConduit, 1, 0));
				// TODO OpenComputer Cable
				r.addCrossWCenter(new ItemStack(EnderIO.itemBasicFilterUpgrade, 1, 0), TFCItems.bismuthIngot, Items.paper, Blocks.hopper);
				r.addCrossWCenter(new ItemStack(EnderIO.itemBasicFilterUpgrade, 1, 1), TFCItems.bismuthIngot, Items.redstone, new ItemStack(EnderIO.itemBasicFilterUpgrade, 1, 0));
				r.addCrossWCenter(new ItemStack(EnderIO.itemExistingItemFilter, 1, 0), TFCItems.bronzeIngot, Items.redstone, new ItemStack(EnderIO.itemBasicFilterUpgrade, 1, 1));
				r.addCrossWCenter(EnderIO.itemPowerItemFilter, Items.redstone, Items.paper, EnderIO.itemConduitProbe);
				r.addCrossWCenter(EnderIO.itemExtractSpeedUpgrade, TFCItems.wroughtIronIngot, Items.redstone, new ItemStack(EnderIO.itemBasicFilterUpgrade, 1, 0));
				r.addCrossWCenter(new ItemStack(EnderIO.itemExtractSpeedUpgrade, 1, 1), TFCItems.wroughtIronIngot, Items.slime_ball, new ItemStack(EnderIO.itemBasicFilterUpgrade, 1, 0));
				r.addCross(new ItemStack(EnderIO.itemFunctionUpgrade), WurmTweaksItems.itemQuantumFoam, new ItemStack(EnderIO.itemMaterial, 1, 1));
				// TODO Laser for capacitors
				r.addWrenchRecipe(EnderIO.itemYetaWench, new ItemStack(EnderIO.itemMaterial, 1, 0));
				r.addShapeless(new ItemStack(EnderIO.itemMaterial,1,5), "packGemExquisite", WurmTweaksItems.itemMixedSheet, Items.ender_eye);
				r.addShapeless(new ItemStack(EnderIO.itemMaterial,1,6), "packGemExquisite", WurmTweaksItems.itemMixedSheet);
				r.addShapeless(new ItemStack(EnderIO.itemMaterial,1,8), "packGemExquisite", Items.ender_pearl);
				// TODO Alloy ingots
				r.addCrossWCenter(EnderIO.itemTravelStaff, new ItemStack(EnderIO.itemMaterial,1,5), new ItemStack(EnderIO.itemMaterial, 1, 1), "packGemExquisite");
				r.addCrossWCenter(EnderIO.itemConduitProbe, new ItemStack(EnderIO.itemPowerConduit, 6, 2), new ItemStack(EnderIO.itemMaterial, 1, 1), Items.repeater);
				// TODO Item Magnet
				// TODO Dark Steel Armor and Tools
		}
}

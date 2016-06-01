package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermalexpansion.block.TEBlocks;
import cofh.thermalexpansion.item.TEItems;
import com.bioxx.tfc.api.TFCItems;
import com.brandon3055.draconicevolution.common.ModBlocks;
import com.brandon3055.draconicevolution.common.ModItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import cpw.mods.ironchest.IronChest;
import fox.spiteful.avaritia.items.LudicrousItems;
import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.api.IModRecipes;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;

public class DraconicEvolutionRecipes implements IModRecipes {

		@Optional.Method (modid = "DraconicEvolution")
		@Override
		public void addRecipes () {
				r.addCrossWCenter(new ItemStack(ModBlocks.xRayBlock, 9), Items.nether_star, "packGlass", WurmTweaksItems.ingotRainbowSteel);
				r.addCrossWCenter(ModBlocks.potentiometer, WurmTweaksBlocks.blockGold, Items.quartz, Items.redstone);
				r.addBasicMachineRecipe(ModBlocks.rainSensor, Blocks.quartz_block, TFCItems.redSteelBucketWater, Items.redstone, WurmTweaksItems.ingotBrownSteel);
				r.addBasicMachineRecipe(ModBlocks.particleGenerator, WurmTweaksItems.ingotEnergyReactor, WurmTweaksBlocks.blockCompressedRedstone, WurmTweaksItems.ingotRainbowSteel, ModItems.draconicEnergyCore);
				r.addCrossWCenter(ModBlocks.playerDetector, TFCItems.steelSheet2x, Items.redstone, Items.nether_star);
				r.addCrossWCenter(ModBlocks.playerDetectorAdvanced, TFCItems.blackSteelSheet2x, Items.redstone, ModBlocks.playerDetector);
				r.addBasicMachineRecipe(ModBlocks.energyInfuser, WurmTweaksItems.ingotEnergyReactor, WurmTweaksItems.ingotTitanium, ModItems.draconicEnergyCore, TEItems.capacitorResonant);
				r.addShaped(ModBlocks.energyStorageCore, "SSS", "AXA", "SSS", 'S', ModItems.draconicCore, 'A', ModItems.draconicFluxCapacitor, ModItems.draconicCore);
				// TODO Draconium Block
				r.addCrossWCenter(ModBlocks.energyPylon, "packGemBlock", WurmTweaksBlocks.blockRedSteel, ModItems.draconicCore);
				r.addShaped(ModBlocks.teleporterStand, " S ", " S ", "DDD", 'S', "packSmoothStone", 'D', WurmTweaksItems.ingotBrownSteel);
				r.addBasicMachineRecipe(ModBlocks.draconiumChest, WurmTweaksItems.ingotRainbowSteel, new ItemStack(IronChest.ironChestBlock, 1, 6), IC2Items.getItem("inductionFurnace"), new ItemStack(TEBlocks.blockCell, 1, 4));
				r.addCrossWCenter(new ItemStack(ModBlocks.infusedObsidian, 8), Blocks.obsidian, WurmTweaksItems.ingotTitanium, Items.blaze_powder);
				// TODO upgradeModifier
				// TODO Draconic Power Staff
				// TODO Draconic Pickaxe
				// TODO Draconic Axe
				// TODO Draconic Shovel
				// TODO Draconic Sword
				// TODO Draconic Bow
				// TODO Draconic Armor
				// TODO Wyvert Tools + Armor
				r.addCrossWCenter(ModItems.draconicCore, ExtraUtils.bedrockium, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotTitanium);
				r.addCrossWCenter(ModItems.wyvernCore, ModItems.draconicCore, ModItems.draconiumIngot, new ItemStack(LudicrousItems.resource, 1, 6));
				r.addCrossWCenter(ModItems.awakenedCore, new ItemStack(LudicrousItems.resource, 1, 5), WurmTweaksItems.itemQuantumFoam, ModItems.wyvernCore);
				// TODO chaoticCore
				// Draconium Ingot
				r.addCrossWCenter(ModItems.teleporterMKI, ModItems.draconiumIngot, WurmTweaksBlocks.blockRedSteel, Items.nether_star);
				r.addCrossWCenter(ModItems.teleporterMKII, ModItems.draconiumIngot, new ItemStack(LudicrousItems.resource, 1, 6), ModItems.teleporterMKI);
				r.addShapeless(new ItemStack(ModItems.safetyMatch, 4), TFCItems.bismuthBronzeSheet, TFCItems.fireStarter, "dye");
				r.addCircleWCenter(ModItems.infoTablet, "packSmoothStone", ModItems.draconicIngot);
				r.addShaped(new ItemStack(ModItems.wyvernFluxCapacitor.getItem(), 1, 0), "SCS", "CBC", "SCS", 'S', WurmTweaksItems.ingotTitanium, 'C', ModItems.wyvernEnergyCore, 'B', ModItems.wyvernCore);
				r.addShaped(new ItemStack(ModItems.draconicFluxCapacitor.getItem(), 1, 1), "SCS", "CBC", "SCS", 'S', WurmTweaksItems.ingotTitanium, 'C', ModItems.draconicEnergyCore, 'B', ModItems.draconicCore);
				r.addCrossWCenter(ModItems.draconicCore, WurmTweaksItems.ingotPinkSteel, ModItems.draconiumIngot, WurmTweaksItems.itemCraftingCore);
		}
}

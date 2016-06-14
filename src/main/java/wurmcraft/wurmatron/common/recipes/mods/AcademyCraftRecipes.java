package wurmcraft.wurmatron.common.recipes.mods;

import cn.academy.ability.ModuleAbility;
import cn.academy.crafting.ModuleCrafting;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import techreborn.init.ModBlocks;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.techreborn.TechRebornHelper;

public class AcademyCraftRecipes {

		private static RecipeHelper r = new RecipeHelper();

		// Find an better way other then tons of lookups
		@Optional.Method (modid = "academy-craft")
		public static void addRecipes () {
				r.addBasicMachineRecipe(ModuleAbility.abilityInterferer, WurmTweaksItems.ingotRainbowSteel, ModuleCrafting.crystalPure, WurmTweaksItems.itemAntiMatter, ModuleCrafting.machineFrame);
				r.addBasicMachineRecipe(GameRegistry.findItemStack("academy-craft", "ac_Block_developerAdvanced", 1), ModuleCrafting.crystalPure, ModuleCrafting.dataChip, WurmTweaksItems.itemAntiMatter, GameRegistry.findItemStack("academy-craft", "ac_Block_developerNormal", 1));
				r.addBasicMachineRecipe(GameRegistry.findItemStack("academy-craft", "ac_Block_developerNormal", 1), ModuleCrafting.crystalPure, WurmTweaksItems.itemAntiMatter, WurmTweaksItems.creativeCreativePartsEnergy, ModuleCrafting.machineFrame);
				r.addBasicMachineRecipe(GameRegistry.findItemStack("academy-craft", "ac_Block_imagFusor", 1), Blocks.sticky_piston, WurmTweaksItems.itemAntiMatter, WurmTweaksItems.itemSpaceModule, ModuleCrafting.machineFrame);
				r.addBasicMachineRecipe(GameRegistry.findItemStack("academy-craft", "ac_Block_metalFormer", 1), Blocks.piston, WurmTweaksItems.itemAntiMatter, WurmTweaksItems.itemSpaceModule, ModuleCrafting.machineFrame);
				r.addBasicMachineRecipe(GameRegistry.findItemStack("academy-craft", "ac_Block_matrix", 1), ModuleCrafting.crystalPure, WurmTweaksItems.itemAntiMatter, WurmTweaksItems.itemQuantumSingularity, ModuleCrafting.machineFrame);
				r.addBasicMachineRecipe(GameRegistry.findItemStack("academy-craft", "ac_Block_nodeBasic", 1), ModuleCrafting.crystalPure, ExtraUtils.bedrockium, WurmTweaksItems.itemAntiMatter, WurmTweaksItems.itemQuantumSingularity);
				r.addBasicMachineRecipe(GameRegistry.findItemStack("academy-craft", "ac_Block_nodeStandard", 1), GameRegistry.findItemStack("academy-craft", "ac_Block_nodeBasic", 1), ModuleCrafting.machineFrame, WurmTweaksItems.itemSpaceModule, WurmTweaksItems.itemComputationalCore);
				r.addBasicMachineRecipe(GameRegistry.findItemStack("academy-craft", "ac_Block_nodeAdvanced", 1), GameRegistry.findItemStack("academy-craft", "ac_Block_nodeStandard", 1), ModuleCrafting.machineFrame, WurmTweaksItems.itemSpaceModule, WurmTweaksItems.itemComputationalCore);
				r.addBasicMachineRecipe(GameRegistry.findItemStack("academy-craft", "ac_Block_phaseGen", 1), new ItemStack(ModBlocks.FusionCoil, 1), WurmTweaksItems.itemAntiMatter, WurmTweaksItems.ingotEnergyReactor, ModuleCrafting.machineFrame);
				r.addBasicMachineRecipe(GameRegistry.findItemStack("academy-craft", "ac_Block_solarGen", 1), WurmTweaksItems.itemSolarCore, ModuleCrafting.crystalNormal, Items.redstone, WurmTweaksItems.ingotCyanSteel);
				r.addCrossWCenter(GameRegistry.findItemStack("academy-craft", "ac_Block_windgenBase", 1), WurmTweaksBlocks.blockRedSteel, WurmTweaksItems.ingotPinkSteel, ModuleCrafting.machineFrame);
				r.addBasicMachineRecipe(GameRegistry.findItemStack("academy-craft", "ac_Block_windgenMain", 1), IC2Items.getItem("WindKineticGenerator"), Items.redstone, WurmTweaksItems.ingotBrownSteel, WurmTweaksItems.ingotEnergyReactor);
				r.addShaped(GameRegistry.findItemStack("academy-craft", "ac_Block_windgenPillar", 2), "BSB", "BSB", "BSB", 'B', WurmTweaksBlocks.blockSteel, 'S', ModuleCrafting.crystalLow);
				r.addCrossWCenter(ModuleCrafting.machineFrame, ModuleCrafting.crystalNormal, WurmTweaksItems.itemAntiMatter, WurmTweaksItems.itemNatureCoreMK2);
				r.addCrossWCenter(new ItemStack(GameRegistry.findItem("academy-craft", "ac_Item_developerPortable"), 1, 13), ModuleCrafting.crystalPure, WurmTweaksItems.stableMagicEssence, GameRegistry.findItemStack("academy-craft", "ac_Block_developerAdvanced", 1));
				r.addShaped(GameRegistry.findItemStack("academy-craft", "ac_Item_magneticCoil", 2), " C ", "SES", "SRS", 'C', WurmTweaksItems.itemAntiMatter, 'S', TFCItems.platinumSheet2x,'R', ModuleCrafting.crystalPure);
				r.addCircle(GameRegistry.findItemStack("academy-craft", "ac_Item_matterUnit", 1), WurmTweaksItems.itemAntiMatter);
				r.addCrossWCenter(new ItemStack(GameRegistry.findItem("academy-craft", "ac_Item_itemMedia"), 1, 0), WurmTweaksItems.ingotTitanium, ModuleCrafting.crystalLow, Items.redstone);
				r.addCrossWCenter(new ItemStack(GameRegistry.findItem("academy-craft", "ac_Item_itemMedia"), 1, 1), WurmTweaksItems.ingotTitanium, ModuleCrafting.crystalLow, new ItemStack(GameRegistry.findItem("academy-craft", "ac_Item_itemMedia"), 1, 0));
				r.addCrossWCenter(new ItemStack(GameRegistry.findItem("academy-craft", "ac_Item_itemMedia"), 1, 2), WurmTweaksItems.ingotTitanium, ModuleCrafting.crystalLow, new ItemStack(GameRegistry.findItem("academy-craft", "ac_Item_itemMedia"), 1, 1));
				r.addShapeless(GameRegistry.findItem("academy-craft", "ac_Item_itemTutorial"), Items.book, ModuleCrafting.crystalLow);
				r.addCross(GameRegistry.findItem("academy-craft", "ac_Item_terminalInstaller"), ModuleCrafting.crystalNormal, WurmTweaksItems.ingotTitanium);
				r.addCircle(GameRegistry.findItem("academy-craft", "ac_Item_coin"), TFCItems.wroughtIronSheet);
				r.addSimpleCirc(GameRegistry.findItem("academy-craft", "ac_Item_magHook"), ModuleCrafting.crystalNormal, "packIngot");
				r.addCross(GameRegistry.findItem("academy-craft", "ac_Item_dataChip"), ModuleCrafting.crystalNormal, WurmTweaksItems.itemComputationalCore);
				r.addCross(GameRegistry.findItem("academy-craft", "ac_Item_windgenFan"), TFCItems.blackSteelSheet2x, TFCItems.wroughtIronSheet);
				r.addShaped(new ItemStack(GameRegistry.findItem("academy-craft", "ac_Item_energyUnit"), 1, 13), "SES", "SES", "SES", 'E', GameRegistry.findItemStack("academy-craft", "ac_Item_magneticCoil", 1), 'S', WurmTweaksItems.itemCraftingCore);
				r.addBasicMachineRecipe(new ItemStack(GameRegistry.findItem("academy-craft", "ac_app_skill_tree"), 1, 0), ModuleCrafting.crystalPure, WurmTweaksItems.itemMagicChunk, Items.redstone, ModuleCrafting.machineFrame);
				r.addShapeless(GameRegistry.findItem("academy-craft", "ac_app_freq_transmitter"), GameRegistry.findItem("academy-craft", "ac_app_skill_tree"));
				r.addShapeless(GameRegistry.findItem("academy-craft", "ac_app_media_player>"), GameRegistry.findItem("academy-craft", "ac_app_freq_transmitter"));
				r.addCross(new ItemStack(GameRegistry.findItem("academy-craft", "ac_Item_inductionFactor"), 1, 0), WurmTweaksItems.ingotRainbowSteel, ModuleCrafting.crystalNormal);
				r.addCross(new ItemStack(GameRegistry.findItem("academy-craft", "ac_Item_inductionFactor"), 1, 1), WurmTweaksItems.ingotRainbowSteel, ModuleCrafting.crystalLow);
				r.addCross(new ItemStack(GameRegistry.findItem("academy-craft", "ac_Item_inductionFactor"), 1, 2), WurmTweaksItems.ingotRainbowSteel, ModuleCrafting.crystalPure);
				r.addCross(new ItemStack(GameRegistry.findItem("academy-craft", "ac_Item_inductionFactor"), 1, 3), WurmTweaksItems.ingotRainbowSteel, ModuleCrafting.dataChip);
				r.add2X(ModuleCrafting.crystalNormal, ModuleCrafting.crystalLow);
				r.add2X(ModuleCrafting.crystalPure, ModuleCrafting.crystalNormal);
				if (RecipeChecker.modExists("techreborn"))
						addElectrolizerRecipes();
		}

		@Optional.Method (modid = "techreborn")
		private static void addElectrolizerRecipes () {
				TechRebornHelper.addIndustrialElectrolyzerRecipe(WurmTweaksItems.itemNatureCoreMK2, null, new ItemStack(ModuleCrafting.crystalLow, 2), null, null, null, 8000, 8192);
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import cofh.thermalfoundation.block.TFBlocks;
import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;

public class OpenModularTurretsRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "openmodularturrets")
		public static void addRecipes () {
				r.addShaped(new ItemStack(openmodularturrets.items.Items.barrelTierFiveItem), "III", "G G", "III", 'I', WurmTweaksItems.itemRadiationShielding, 'G', "packGemExquisite");
				r.addShaped(new ItemStack(openmodularturrets.items.Items.ioBus), " I ", "GGG", " I ", 'I', new ItemStack(TFCItems.goldSheet2x), 'G', "packGemExquisite");
				r.addShaped(new ItemStack(openmodularturrets.items.Items.chamberTierOneItem), "III", "  I", "III", 'I', new ItemStack(TFCItems.blackSteelSheet2x));
				r.add2X(new ItemStack(openmodularturrets.items.Items.chamberTierTwoItem), new ItemStack(openmodularturrets.items.Items.chamberTierOneItem));
				r.add2X(new ItemStack(openmodularturrets.items.Items.chamberTierThreeItem), new ItemStack(openmodularturrets.items.Items.chamberTierTwoItem));
				r.add2X(new ItemStack(openmodularturrets.items.Items.chamberTierFourItem), new ItemStack(openmodularturrets.items.Items.chamberTierThreeItem));
				r.add2X(new ItemStack(openmodularturrets.items.Items.chamberTierFiveItem), new ItemStack(openmodularturrets.items.Items.chamberTierFourItem));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.barrelTierOneItem), "III", "   ", "III", 'I', new ItemStack(TFCItems.redSteelSheet2x));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.sensorTierOneItem), "IGI", "GCG", "IGI", 'I', TFItems.ingotEnderium, 'G', "packGemExquisite", 'C', new ItemStack(Blocks.redstone_block));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.sensorTierTwoItem), "IGI", "GCG", "IGI", 'I', TFItems.ingotEnderium, 'G', "packGemExquisite", 'C', new ItemStack(openmodularturrets.items.Items.sensorTierOneItem));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.sensorTierThreeItem), "IGI", "GCG", "IGI", 'I', TFItems.ingotEnderium, 'G', "packGemExquisite", 'C', new ItemStack(openmodularturrets.items.Items.sensorTierTwoItem));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.sensorTierFourItem), "IGI", "GCG", "IGI", 'I', TFItems.ingotEnderium, 'G', "packGemExquisite", 'C', new ItemStack(openmodularturrets.items.Items.sensorTierThreeItem));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.sensorTierFiveItem), "IGI", "GCG", "IGI", 'I', WurmTweaksItems.itemMixedSheet, 'G', "packGemExquisite", 'C', new ItemStack(openmodularturrets.items.Items.sensorTierFourItem));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.solarPanelAddon), "GGG", "ISI", "DRD", 'G', "packGlass", 'I', new ItemStack(ExtraUtils.bedrockium), 'S', WurmTweaksItems.itemSolarCore, 'D', "packGemExquisite", 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.redstoneReactorAddon), "III", "ICI", "IRI", 'I', new ItemStack(TFCItems.leadSheet), 'C', "packGemExquisite", 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.damageAmpAddon), "C C", "RRR", "III", 'C', ic2.api.item.IC2Items.getItem("teslaCoil"), 'R', new ItemStack(Blocks.redstone_block), 'I', new ItemStack(TFCItems.redSteelSheet2x));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.rangeUpgradeItem), " E ", "RBR", 'E', "packGemExquisite", 'R', new ItemStack(Items.redstone), 'B', new ItemStack(TFCItems.blackSteelIngot));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.fireRateUpgradeItem), "BGB", "BIB", 'B', new ItemStack(Items.blaze_powder), 'G', "packGemExquisite", 'I', new ItemStack(TFCItems.nickelSheet2x));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.accuraccyUpgradeItem), "GIG", "IRI", 'G', "packGlass", 'I', new ItemStack(TFCItems.bismuthSheet2x), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.efficiencyUpgradeItem), "EGE", "IEI", 'E', new ItemStack(Items.ender_pearl), 'G', "packGemChipped", 'I', new ItemStack(TFCItems.roseGoldSheet));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.bulletCraftable, 32), "I", "G", "G", 'I', new ItemStack(Items.arrow), 'G', new ItemStack(Items.gunpowder));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.grenadeCraftable, 32), " I ", "IGI", " I ", 'I', "packGemChipped", 'G', new ItemStack(Items.gunpowder));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.rocketCraftable, 16), " I ", "IGI", "IGI", 'I', new ItemStack(TFCItems.zincSheet), 'G', new ItemStack(Items.gunpowder));
				r.addShaped(new ItemStack(openmodularturrets.items.Items.ferroSlug, 64), " I ", "IGI", " I ", 'I', new ItemStack(TFCItems.blueSteelSheet), 'G', "packGemExquisite");
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.turretBaseTierOne), "ICI", "CBC", "ICI", 'I', new ItemStack(TFCItems.leadSheet2x), 'C', new ItemStack(openmodularturrets.items.Items.ioBus), 'B', new ItemStack(openmodularturrets.items.Items.sensorTierOneItem));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.turretBaseTierOne), "PIP", "IRI", "PIP", 'P', "packPlanks", 'I', new ItemStack(TFCItems.wroughtIronIngot), 'R', new ItemStack(Items.redstone));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.turretBaseTierTwo), "ICI", "CBC", "ICI", 'I', new ItemStack(TFCItems.nickelSheet2x), 'C', new ItemStack(openmodularturrets.items.Items.ioBus), 'B', new ItemStack(openmodularturrets.items.Items.sensorTierTwoItem));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.turretBaseTierThree), "ICI", "CBC", "ICI", 'I', new ItemStack(TFCItems.roseGoldSheet2x), 'C', new ItemStack(openmodularturrets.items.Items.ioBus), 'B', new ItemStack(openmodularturrets.items.Items.sensorTierThreeItem));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.turretBaseTierFour), "ICI", "CBC", "ICI", 'I', new ItemStack(TFBlocks.blockStorage, 1, 12), 'C', new ItemStack(openmodularturrets.items.Items.ioBus), 'B', new ItemStack(openmodularturrets.items.Items.sensorTierFourItem));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.turretBaseTierFive), "ICI", "CBC", "ICI", 'I', new ItemStack(TFBlocks.blockStorage, 1, 12), 'C', WurmTweaksItems.itemComputationalCore, 'B', new ItemStack(openmodularturrets.items.Items.sensorTierFiveItem));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.disposableItemTurret), "WIW", "IDI", " I ", 'W', "packPlanks", 'D', new ItemStack(Blocks.dispenser), 'I', new ItemStack(TFCItems.steelIngot));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.rocketTurret), "IDI", "ICI", " B ", 'I', new ItemStack(TFCItems.redSteelIngot), 'D', new ItemStack(TFCItems.blueSteelIngot), 'C', new ItemStack(openmodularturrets.items.Items.chamberTierThreeItem), 'B', new ItemStack(openmodularturrets.items.Items.chamberTierThreeItem));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.machineGunTurret), "LLL", "LCL", " B ", 'L', new ItemStack(TFCItems.leadIngot), 'C', new ItemStack(openmodularturrets.items.Items.chamberTierTwoItem), 'B', new ItemStack(openmodularturrets.items.Items.chamberTierTwoItem));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.grenadeLauncherTurret), "ALA", "LCL", " B ", 'L', new ItemStack(TFCItems.leadIngot), 'A', new ItemStack(TFCItems.brassIngot), 'C', new ItemStack(openmodularturrets.items.Items.chamberTierFourItem), 'B', new ItemStack(openmodularturrets.items.Items.chamberTierFourItem));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.laserTurret), "LLL", "LCL", " B ", 'L', TFItems.ingotEnderium, 'C', new ItemStack(openmodularturrets.items.Items.chamberTierFiveItem), 'B', new ItemStack(openmodularturrets.items.Items.chamberTierFiveItem));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.railGunTurret), "LLL", "LCL", " B ", 'L', TFItems.ingotSignalum, 'C', new ItemStack(openmodularturrets.items.Items.chamberTierFiveItem), 'B', new ItemStack(openmodularturrets.items.Items.chamberTierFiveItem));
				r.addCross(new ItemStack(openmodularturrets.items.Items.blazingClayCraftable, 8), TFCItems.clayBall, Items.blaze_powder);
				r.addShaped(new ItemStack(openmodularturrets.items.Items.concealerAddon), "EGE", "IEI", 'E', WurmTweaksItems.ingotRainbowSteel, 'G', "packGemExquisite", 'I', WurmTweaksItems.itemMixedSheet);
				r.addShaped(new ItemStack(openmodularturrets.items.Items.scattershotUpgradeItem), "EGE", "IEI", 'E', Items.gunpowder, 'G', "packGem", 'I', WurmTweaksItems.itemComputationalCore);
				r.addShaped(new ItemStack(openmodularturrets.items.Items.serialPortAddon), "EGE", "IEI", 'E', Items.redstone, 'G', "packGemExquisite", 'I', WurmTweaksItems.itemComputationalCore);
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.relativisticTurret), "LLL", "LCL", " B ", 'L', "dye", 'C', new ItemStack(openmodularturrets.items.Items.chamberTierThreeItem), 'B', new ItemStack(openmodularturrets.items.Items.chamberTierTwoItem));
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.teleporterTurret), "LLL", "LCL", " B ", 'L', Items.ender_pearl, 'C', new ItemStack(openmodularturrets.items.Items.chamberTierThreeItem), 'B', TFItems.ingotEnderium);
				r.addShaped(new ItemStack(openmodularturrets.blocks.Blocks.incendiaryTurret), "LLL", "LCL", " B ", 'L', Items.blaze_rod, 'C', new ItemStack(openmodularturrets.items.Items.chamberTierTwoItem), 'B', TFItems.bucketGlowstone);
		}
}

package wurmcraft.wurmatron.common.recipes.mods;

import am2.items.ItemsCommonProxy;
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
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.handler.ArmorHandler;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.ic2.ICHelper;
import wurmcraft.wurmatron.common.utils.machines.MachineHelper;
import wurmcraft.wurmatron.common.utils.nbt.ItemNBT;

/**
 * Recipes Verified by Wurmatron
 * on 6/10/2016 with 1.0.2d
 */
public class DraconicEvolutionRecipes {

    private static final RecipeHelper r = new RecipeHelper();

    @Optional.Method(modid = "DraconicEvolution")
    public static void addRecipes() {
        LogHandler.info("Adding Draconic Evolution Recipes");
        r.addCrossWCenter(new ItemStack(ModBlocks.xRayBlock, 9), Items.nether_star, "packGlass", WurmTweaksItems.ingotRainbowSteel);
        r.addCrossWCenter(ModBlocks.potentiometer, WurmTweaksBlocks.blockGold, Items.quartz, Items.redstone);
        r.addBasicMachineRecipe(ModBlocks.rainSensor, Blocks.quartz_block, TFCItems.redSteelBucketWater, Items.redstone, WurmTweaksItems.ingotBrownSteel);
        r.addBasicMachineRecipe(ModBlocks.particleGenerator, WurmTweaksItems.ingotEnergyReactor, WurmTweaksBlocks.blockCompressedRedstone, WurmTweaksItems.ingotRainbowSteel, ModItems.draconicEnergyCore);
        r.addCrossWCenter(ModBlocks.playerDetector, TFCItems.steelSheet2x, Items.redstone, Items.nether_star);
        r.addCrossWCenter(ModBlocks.playerDetectorAdvanced, TFCItems.blackSteelSheet2x, Items.redstone, ModBlocks.playerDetector);
        r.addBasicMachineRecipe(ModBlocks.energyInfuser, WurmTweaksItems.ingotEnergyReactor, WurmTweaksItems.ingotTitanium, ModItems.draconicEnergyCore, TEItems.capacitorResonant);
        r.addShaped(ModBlocks.energyStorageCore, "SSS", "AXA", "SSS", 'S', ModItems.draconicCore, 'A', ModItems.draconicFluxCapacitor, 'X', ModItems.draconicCore);
        r.addCrossWCenter(ModBlocks.energyPylon, "packGemBlock", WurmTweaksBlocks.blockRedSteel, ModItems.draconicCore);
        r.addShaped(ModBlocks.teleporterStand, " S ", " S ", "DDD", 'S', "packSmoothStone", 'D', WurmTweaksItems.ingotBrownSteel);
        r.addBasicMachineRecipe(ModBlocks.draconiumChest, WurmTweaksItems.ingotRainbowSteel, new ItemStack(IronChest.ironChestBlock, 1, 6), IC2Items.getItem("inductionFurnace"), new ItemStack(TEBlocks.blockCell, 1, 4));
        r.addCrossWCenter(new ItemStack(ModBlocks.infusedObsidian, 8), Blocks.obsidian, WurmTweaksItems.ingotTitanium, Items.blaze_powder);
        r.addShaped9X9Recipe(new ItemStack(ModBlocks.upgradeModifier, 1, 0), "III   III", "IXIIIIIXI", "IBXXXXXBI", "IBBBBBBBI", "IBBBBBBBI", "IBBBBBBBI", "IBBBBBBBI", "IBBBBBBBI", "IIIIIIIII", 'I', new ItemStack(LudicrousItems.resource, 1, 4), 'X', ModItems.draconicCore, 'B', "packGemBlock");
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.draconicDestructionStaff, 1, 0), 5600), "CAC", "BXD", "CEC", 'C', ModItems.draconicFluxCapacitor, 'A', ModItems.draconicPickaxe, 'B', ModItems.draconicAxe, 'D', ModItems.draconicSword, 'E', ModItems.draconicShovel, 'X', new ItemStack(LudicrousItems.resource, 1, 4));
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.draconicPickaxe, 1, 0), 1048), "III", "ASB", " S ", 'I', ModItems.draconiumIngot, 'A', ModItems.draconiumEnergyCore, 'S', new ItemStack(ItemsCommonProxy.essence, 1, 10), 'B', WurmTweaksItems.itemNatureCoreMK2);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.draconicAxe, 1, 0), 2500), "IIA", "ISB", " S ", 'I', ModItems.draconiumIngot, 'A', ModItems.draconiumEnergyCore, 'S', new ItemStack(ItemsCommonProxy.essence, 1, 10), 'B', WurmTweaksItems.itemNatureCoreMK2);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.draconicAxe, 1, 0), 2500), "AII", "ISB", " S ", 'I', ModItems.draconiumIngot, 'A', ModItems.draconiumEnergyCore, 'S', new ItemStack(ItemsCommonProxy.essence, 1, 10), 'B', WurmTweaksItems.itemNatureCoreMK2);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.draconicShovel, 1, 0), 850), "AIB", " S ", " S ", 'I', ModItems.draconiumIngot, 'A', ModItems.draconiumEnergyCore, 'S', new ItemStack(ItemsCommonProxy.essence, 1, 10), 'B', WurmTweaksItems.itemNatureCoreMK2);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.draconicSword, 1, 0), 3000), "AIB", "ASB", " S ", 'I', ModItems.draconiumIngot, 'A', ModItems.draconiumEnergyCore, 'S', new ItemStack(ItemsCommonProxy.essence, 1, 10), 'B', WurmTweaksItems.itemNatureCoreMK2);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.wyvernPickaxe, 1, 0), 1048), "ICI", "ASB", " S ", 'I', ModItems.draconicIngot, 'A', ModItems.draconiumEnergyCore, 'S', new ItemStack(ItemsCommonProxy.essence, 1, 10), 'B', WurmTweaksItems.itemNatureCoreMK2, 'C', ModItems.wyvernPickaxe);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.wyvernShovel, 1, 0), 850), "ACB", " S ", " S ", 'I', ModItems.draconicIngot, 'A', ModItems.draconiumEnergyCore, 'S', new ItemStack(ItemsCommonProxy.essence, 1, 10), 'B', WurmTweaksItems.itemNatureCoreMK2, 'C', ModItems.wyvernShovel);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.wyvernSword, 1, 0), 4500), "ACB", "ASB", " S ", 'I', ModItems.draconicIngot, 'A', ModItems.draconiumEnergyCore, 'S', new ItemStack(ItemsCommonProxy.essence, 1, 10), 'B', WurmTweaksItems.itemNatureCoreMK2, 'C', ModItems.wyvernSword);
        ArmorHandler.addArmorProtection(ModItems.draconicHelm, 8000, 8000, 8000);
        ArmorHandler.addArmorProtection(ModItems.draconicChest, 8000, 8000, 8000);
        ArmorHandler.addArmorProtection(ModItems.draconicLeggs, 8000, 8000, 8000);
        ArmorHandler.addArmorProtection(ModItems.draconicBoots, 8000, 8000, 8000);
        ArmorHandler.addArmorProtection(ModItems.wyvernHelm, 10000, 10000, 10000);
        ArmorHandler.addArmorProtection(ModItems.wyvernChest, 10000, 10000, 10000);
        ArmorHandler.addArmorProtection(ModItems.wyvernLeggs, 10000, 10000, 10000);
        ArmorHandler.addArmorProtection(ModItems.wyvernBoots, 10000, 10000, 10000);
        r.addShaped9X9Recipe(new ItemStack(ModItems.draconicHelm, 1, 0), " IIIIIII ", "IXXXXXXXI", "IXAA AAXI", "IXAA AAXI", "IX     XI", "IX JLJ XI", "IXXXXXXXI", 'I', ModItems.draconiumIngot, 'X', new ItemStack(LudicrousItems.matter_cluster, 1, 0), 'A', "packGemBlock", 'J', new ItemStack(LudicrousItems.resource, 1, 5), 'L', WurmTweaksItems.itemAntiMatter);
        r.addShaped9X9Recipe(new ItemStack(ModItems.draconicChest, 1, 0), " II   II ", "III   III", "IIIIIIIII", " IXXXXXI ", " IXAAAXI ", " IXAAAXI ", " IXAAAXI ", "  IIIII  ", 'I', ModItems.draconiumIngot, 'X', new ItemStack(LudicrousItems.resource, 1, 6), 'A', new ItemStack(LudicrousItems.matter_cluster, 1, 0));
        r.addShaped9X9Recipe(new ItemStack(ModItems.draconicLeggs, 1, 0), "IIIIIIIII", "IXXXBXXXI", "IXIBBBIXI", "IXIIIIIXI", "IXI   IXI", "IXI   IXI", "IXI   IXI", "IXI   IXI", "III   III", 'I', ModItems.draconiumIngot, 'X', new ItemStack(LudicrousItems.resource, 1, 6), 'B', new ItemStack(LudicrousItems.resource, 1, 5));
        r.addShaped9X9Recipe(new ItemStack(ModItems.draconicBoots, 1, 0), " III III ", " IXI IXI ", " IXI IXI ", " IXI IXI ", "IIXI IXII", "IXXI IXXI", "IIII IIII", 'I', ModItems.draconiumIngot, 'X', new ItemStack(LudicrousItems.resource, 1, 6));
        r.addShaped9X9Recipe(new ItemStack(ModItems.wyvernHelm, 1, 0), " IIIIIII ", "IXXXXXXXI", "IXAA AAXI", "IXAA AAXI", "IX     XI", "IX JLJ XI", "IXXXXXXXI", 'I', ModItems.draconicIngot, 'X', new ItemStack(LudicrousItems.matter_cluster, 1, 0), 'A', "packGemBlock", 'J', new ItemStack(LudicrousItems.resource, 1, 5), 'L', new ItemStack(ModItems.draconicHelm, 1, 0));
        r.addShaped9X9Recipe(new ItemStack(ModItems.wyvernChest, 1, 0), " II   II ", "III   III", "IIIIIIIII", " IXXXXXI ", " IXAAAXI ", " IXAJAXI ", " IXAAAXI ", "  IIIII  ", 'I', ModItems.draconicIngot, 'X', new ItemStack(LudicrousItems.resource, 1, 6), 'A', new ItemStack(LudicrousItems.matter_cluster, 1, 0), 'J', new ItemStack(ModItems.draconicChest, 1, 0));
        r.addShaped9X9Recipe(new ItemStack(ModItems.wyvernLeggs, 1, 0), "IIIIIIIII", "IXXXBXXXI", "IXIBJBIXI", "IXIIIIIXI", "IXI   IXI", "IXI   IXI", "IXI   IXI", "IXI   IXI", "III   III", 'I', ModItems.draconicIngot, 'X', new ItemStack(LudicrousItems.resource, 1, 6), 'B', new ItemStack(LudicrousItems.resource, 1, 5), 'J', new ItemStack(ModItems.draconicLeggs, 1, 0));
        r.addShaped9X9Recipe(new ItemStack(ModItems.wyvernBoots, 1, 0), " III III ", " IXI IXI ", " IXI IXI ", " IXI IXI ", "IIXIFIXII", "IXXI IXXI", "IIII IIII", 'I', ModItems.draconicIngot, 'X', new ItemStack(LudicrousItems.resource, 1, 6), 'F', new ItemStack(ModItems.draconicBoots, 1, 0));
        r.addCrossWCenter(ModItems.draconicCore, ExtraUtils.bedrockium, WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.ingotTitanium);
        r.addCrossWCenter(ModItems.wyvernCore, ModItems.draconicCore, ModItems.draconiumIngot, new ItemStack(LudicrousItems.resource, 1, 6));
        r.addCrossWCenter(ModItems.awakenedCore, new ItemStack(LudicrousItems.resource, 1, 5), WurmTweaksItems.itemQuantumFoam, ModItems.wyvernCore);
        r.addCrossWCenter(ModItems.teleporterMKI, ModItems.draconiumIngot, WurmTweaksBlocks.blockRedSteel, Items.nether_star);
        r.addCrossWCenter(ModItems.teleporterMKII, ModItems.draconiumIngot, new ItemStack(LudicrousItems.resource, 1, 6), ModItems.teleporterMKI);
        r.addShapeless(new ItemStack(ModItems.safetyMatch, 4), TFCItems.bismuthBronzeSheet, TFCItems.fireStarter, "dye");
        r.addCircleWCenter(ModItems.infoTablet, "packSmoothStone", ModItems.draconiumIngot);
        r.addShaped(new ItemStack(ModItems.wyvernFluxCapacitor.getItem(), 1, 0), "SCS", "CBC", "SCS", 'S', WurmTweaksItems.ingotTitanium, 'C', ModItems.wyvernEnergyCore, 'B', ModItems.wyvernCore);
        r.addShaped(new ItemStack(ModItems.draconicFluxCapacitor.getItem(), 1, 1), "SCS", "CBC", "SCS", 'S', WurmTweaksItems.ingotTitanium, 'C', ModItems.draconicEnergyCore, 'B', ModItems.draconicCore);
        r.addShapeless(new ItemStack(ModItems.draconiumIngot, 32, 0), new ItemStack(ModBlocks.draconiumBlock, 1, 0));
        r.addShapeless(new ItemStack(ModItems.draconicIngot, 32, 0), new ItemStack(ModBlocks.draconicBlock, 1, 0));
        r.addCrossWCenter(new ItemStack(ModItems.draconicIngot, 1, 0), new ItemStack(ModItems.draconiumIngot), WurmTweaksItems.ingotRainbowSteel, WurmTweaksItems.itemUnstableMatter);
        if (RecipeChecker.modExists("IC2"))
            addCompressorRecipes();
        addAlloySmelterRecipes();
    }

    @Optional.Method(modid = "IC2")
    private static void addCompressorRecipes() {
        ICHelper.addCompressorRecipe(new ItemStack(ModItems.draconiumIngot, 32, 0), new ItemStack(ModBlocks.draconiumBlock, 1, 0));
        ICHelper.addCompressorRecipe(new ItemStack(ModItems.draconicIngot, 32, 0), new ItemStack(ModBlocks.draconicBlock, 1, 0));
    }

    private static void addAlloySmelterRecipes() {
        MachineHelper.addAlloySmelterRecipe(WurmTweaksItems.ingotTitanium, WurmTweaksItems.ingotRainbowSteel, new ItemStack(ModItems.draconiumIngot), 128, 800);
    }
}

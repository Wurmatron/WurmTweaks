package wurmcraft.wurmatron.common.recipes.mods;


import cofh.thermalfoundation.item.TFItems;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.Optional;
import fox.spiteful.avaritia.items.LudicrousItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import powercrystals.powerconverters.PowerConverterCore;
import thaumcraft.common.config.ConfigItems;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.item.ItemManaTablet;
import vazkii.botania.common.item.ItemSignalFlare;
import vazkii.botania.common.item.ItemTwigWand;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.item.block.ItemBlockSpecialFlower;
import vazkii.botania.common.lib.LibBlockNames;
import vazkii.botania.common.lib.LibOreDict;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.handler.ArmorHandler;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.LogHandler;
import wurmcraft.wurmatron.common.utils.botania.BotaniaHelper;
import wurmcraft.wurmatron.common.utils.ic2.ICHelper;
import wurmcraft.wurmatron.common.utils.nbt.ItemNBT;


/**
 * Recipes Verified by Wurmatron
 * on 6/9/2016 with r1.8-249
 */
public class BotaniaRecipes {

    private static final RecipeHelper r = new RecipeHelper();

    @Optional.Method(modid = "Botania")
    public static void addRecipes() {
        LogHandler.info("Adding Botania Recipes");
        for (int d = 0; d < 15; d++)
            r.add3X(new ItemStack(ModBlocks.petalBlock, 1, d), new ItemStack(ModItems.petal, 1, d));
        for (int i = 0; i <= 15; i++)
            r.addShapeless(new ItemStack(ModBlocks.flower, 48, i), WurmTweaksItems.ingotGreenSteel, RecipeHelper.dye.get(i));
        r.addShaped(ModBlocks.altar, "XAX", " B ", "BBB", 'X', WurmTweaksItems.itemMagicChunk, 'A', new ItemStack(ModItems.petal, 1, OreDictionary.WILDCARD_VALUE), 'B', "packCobblestone");
        r.add2X(new ItemStack(ModBlocks.livingrock, 4, 1), new ItemStack(ModBlocks.livingrock));
        r.addShapeless(new ItemStack(ModBlocks.livingrock, 1, 2), ModBlocks.livingrock, TFCBlocks.vine);
        r.add2X(new ItemStack(ModBlocks.livingrock, 4, 3), new ItemStack(ModBlocks.livingrock, 1, 0));
        r.add2X(new ItemStack(ModBlocks.livingrock, 4, 4), new ItemStack(ModBlocks.livingrock, 1, 1));
        r.addShapeless(new ItemStack(ModBlocks.livingwood, 4, 1), ModBlocks.livingwood);
        r.addShapeless(new ItemStack(ModBlocks.livingwood, 1, 2), new ItemStack(ModBlocks.livingwood, 1, 1));
        r.add2X(new ItemStack(ModBlocks.livingwood, 4, 3), new ItemStack(ModBlocks.livingwood, 1, 1));
        r.addShaped(new ItemStack(ModBlocks.livingwood, 4, 4), " X ", "X X", " X ", 'X', new ItemStack(ModBlocks.livingwood, 1, 1));
        r.addShapeless(new ItemStack(ModBlocks.livingwood, 1, 5), Items.glowstone_dust, ModBlocks.livingwood);
        r.addShaped(new ItemStack(ModBlocks.spreader, 1, 0), "WWW", "NX ", "WWW", 'W', ModBlocks.livingwood, 'N', WurmTweaksItems.itemMagicChunk, 'X', new ItemStack(ModItems.petal, 1, OreDictionary.WILDCARD_VALUE));
        r.addShapeless(new ItemStack(ModBlocks.spreader, 1, 1), ModBlocks.spreader, Items.redstone);
        r.addShaped(new ItemStack(ModBlocks.spreader, 1, 2), "WWW", "NX ", "WWW", 'W', ModBlocks.dreamwood, 'N', WurmTweaksItems.itemNatureCoreMK2, 'X', new ItemStack(ModItems.petal, 1, OreDictionary.WILDCARD_VALUE));
        r.addShapeless(new ItemStack(ModBlocks.spreader, 1, 3), new ItemStack(ModBlocks.spreader, 1, 2), new ItemStack(ModItems.manaResource, 1, 5), new ItemStack(ModItems.manaResource, 1, 9));
        r.addShaped(ModBlocks.pool, "W W", "WWW", 'W', ModBlocks.livingrock);
        r.addShaped(new ItemStack(ModBlocks.pool, 1, 3), "W W", "WWW", 'W', ModBlocks.shimmerrock);
        r.addShaped9X9Recipe(new ItemStack(ModBlocks.pool, 1, 1), "CIIIIIIIC", "IBBBBBBBI", "IBXXXXXBI", "IBXXXXXBI", "IBXXXXXBI", "IBXXXXXBI", "IBXXXXXBI", "IBBBBBBBI", "CIIIIIIIC", 'C', WurmTweaksItems.creativeCreativeParts, 'I', new ItemStack(LudicrousItems.resource, 1, 5), 'B', new ItemStack(ModBlocks.pool, 1, 3), 'X', WurmTweaksItems.itemNatureCoreMK2);
        r.addBasicMachineRecipe(ModBlocks.runeAltar, ModBlocks.livingrock, WurmTweaksItems.itemNatureCore, WurmTweaksItems.ingotCyanSteel, new ItemStack(ModItems.manaResource, 1, 1));
        r.addBasicMachineRecipe(ModBlocks.runeAltar, ModBlocks.livingrock, WurmTweaksItems.itemNatureCore, WurmTweaksItems.ingotCyanSteel, new ItemStack(ModItems.manaResource, 1, 2));
        for (int d = 0; d <= 15; d++)
            r.addCrossWCenter(new ItemStack(ModBlocks.unstableBlock, 1, d), WurmTweaksItems.itemNatureCore, new ItemStack(ModItems.petal, 1, d), new ItemStack(ModItems.manaResource, 1, 1));
        r.addShaped(new ItemStack(ModBlocks.pylon, 1, 0), " X ", "BCB", " X ", 'X', WurmTweaksItems.itemNatureCore, 'B', new ItemStack(ModItems.manaResource, 1, 0), 'C', new ItemStack(ModItems.manaResource, 1, 2));
        r.addCrossWCenter(new ItemStack(ModBlocks.pylon, 1, 1), new ItemStack(ModItems.manaResource, 1, 4), WurmTweaksItems.itemNatureCore, new ItemStack(ModBlocks.pylon, 1, 0));
        r.addCrossWCenter(new ItemStack(ModBlocks.pylon, 1, 2), new ItemStack(ModItems.manaResource, 1, 8), WurmTweaksItems.itemNatureCore, new ItemStack(ModBlocks.pylon, 1, 1));
        r.addShaped(new ItemStack(ModBlocks.distributor), "PPP", "N N", "PPP", 'P', ModBlocks.livingrock, 'N', WurmTweaksItems.itemNatureCore);
        for (int d = 0; d <= 15; d++)
            r.addCrossWCenter(new ItemStack(ModBlocks.manaBeacon, 1, d), WurmTweaksItems.itemNatureCore, new ItemStack(ModItems.petal, 1, d), new ItemStack(ModBlocks.unstableBlock, 1, d));
        r.addShaped(ModBlocks.manaVoid, "SSS", "XVX", "SSS", 'S', ModBlocks.livingrock, 'X', ModItems.manaResource, 'V', ExtraUtils.trashCan);
        r.addShaped(ModBlocks.manaDetector, "SSS", "XVX", "SSS", 'S', ModBlocks.livingrock, 'X', ModItems.manaResource, 'V', Items.comparator);
        r.addCircleWCenter(ModBlocks.turntable, ModBlocks.livingwood, Blocks.sticky_piston);
        r.addCircleWCenter(ModBlocks.tinyPlanet, "packSmoothStone", new ItemStack(ModItems.tinyPlanet));
        r.addBasicMachineRecipe(ModBlocks.alchemyCatalyst, ModBlocks.livingrock, WurmTweaksItems.itemNatureCore, Items.brewing_stand, WurmTweaksItems.itemBloodInfused);
        r.addCircle(ModBlocks.openCrate, ModBlocks.livingwood);
        r.addCircleWCenter(new ItemStack(ModBlocks.openCrate, 1, 1), ModBlocks.dreamwood, "packCraftingTable");
        r.addCrossWCenter(ModBlocks.forestEye, Blocks.obsidian, ModItems.manaResource, Items.ender_eye);
        r.addShaped(ModBlocks.forestDrum, "WXW", "WBW", "WXW", 'W', ModBlocks.livingwood, 'X', TFCItems.leather, 'B', ModItems.grassHorn);
        r.addShaped(new ItemStack(ModBlocks.forestDrum, 1, 1), "WXW", "WBW", "WXW", 'W', ModBlocks.dreamwood, 'X', WurmTweaksItems.itemNatureCoreMK2, 'B', ModItems.grassHorn);
        r.addShaped(new ItemStack(ModBlocks.forestDrum, 1, 2), "WXW", "WBW", "WXW", 'W', ModBlocks.livingwood, 'X', TFCItems.leather, 'B', new ItemStack(ModItems.grassHorn, 1, 1));
        for (int d = 0; d <= 15; d++)
            r.addShapeless(new ItemStack(ModBlocks.shinyFlower, 1, d), new ItemStack(ModBlocks.flower, 1, d), Items.glowstone_dust, Items.glowstone_dust);
        r.addShaped(new ItemStack(ModBlocks.platform, 4, 0), "WWW", "W W", " X ", 'W', ModBlocks.livingwood, 'X', WurmTweaksItems.itemNatureCore);
        r.addShaped(new ItemStack(ModBlocks.platform, 2, 1), "WWW", "W W", " X ", 'W', ModBlocks.dreamwood, 'X', WurmTweaksItems.itemNatureCoreMK2);
        r.addBasicMachineRecipe(ModBlocks.alfPortal, WurmTweaksBlocks.blockPlatinum, new ItemStack(ModItems.manaResource, 1, 4), WurmTweaksItems.itemNatureCore, ModBlocks.livingwood);
        r.addShapeless(new ItemStack(ModBlocks.dreamwood, 4, 1), ModBlocks.dreamwood);
        r.addShapeless(new ItemStack(ModBlocks.dreamwood, 1, 5), ModBlocks.dreamwood, Items.glowstone_dust);
        r.addBasicMachineRecipe(ModBlocks.conjurationCatalyst, WurmTweaksBlocks.blockPlatinum, WurmTweaksItems.itemNatureCoreMK2, WurmTweaksItems.itemBloodInfused, ModBlocks.alchemyCatalyst);
        r.addShaped(ModBlocks.prism, " X ", "XBX", " X ", 'B', "packCobblestone", 'X', new ItemStack(ModItems.manaResource, 1, 10));
        r.addShaped(new ItemStack(ModBlocks.prism, 1, 1), " X ", "XBX", " X ", 'B', "packBrick", 'B', new ItemStack(ModItems.manaResource, 1, 10));
        r.addShaped(new ItemStack(ModBlocks.prism, 1, 2), " X ", "XBX", " X ", 'B', Blocks.nether_brick, 'B', new ItemStack(ModItems.manaResource, 1, 10));
        r.addShaped(new ItemStack(ModBlocks.seaLamp, 1, 0), " X ", "XBX", " X ", 'B', Blocks.glowstone, 'B', new ItemStack(ModItems.manaResource, 1, 10));
        for (int i = 0; i <= 15; i++)
            r.addShaped(new ItemStack(ModBlocks.floatingFlower, 1, i), "F", "S", "D", 'F', new ItemStack(ModBlocks.shinyFlower, 1, i), 'S', ModItems.worldSeed, 'D', "packDirt");
        r.add3X(ModBlocks.reedBlock, TFCItems.reeds);
        r.addShapeless(new ItemStack(TFCItems.reeds, 9), ModBlocks.reedBlock);
        r.add3X(ModBlocks.thatch, TFCBlocks.thatch);
        r.addShapeless(new ItemStack(TFCBlocks.thatch, 9), ModBlocks.thatch);
        r.addShaped(new ItemStack(ModBlocks.customBrick, 4, 0), " X ", "XBX", " X ", 'X', Blocks.netherrack, 'B', "packBrick");
        r.addShaped(new ItemStack(ModBlocks.customBrick, 4, 1), " X ", "XBX", " X ", 'X', Blocks.soul_sand, 'B', "packBrick");
        r.addShaped(new ItemStack(ModBlocks.customBrick, 4, 2), " X ", "XBX", " X ", 'X', TFCBlocks.snow, 'B', "packBrick");
        r.addShaped(new ItemStack(ModBlocks.customBrick, 4, 3), " X ", "XBX", " X ", 'X', Items.brick, 'B', "packBrick");
        r.addShapeless(new ItemStack(ModBlocks.customBrick, 1, 4), Blocks.quartz_block, "dyeBlue");
        for (int i = 5; i <= 14; i++)
            r.addShapeless(new ItemStack(ModBlocks.customBrick, 1, i), new ItemStack(ModBlocks.customBrick, 1, i - 1));
        r.addShapeless(new ItemStack(ModBlocks.customBrick, 1, 4), new ItemStack(ModBlocks.customBrick, 1, 15));
        r.addCircleWCenter(ModBlocks.starfield, ModBlocks.dreamwood, WurmTweaksItems.itemNatureCoreMK2);
        r.addCrossWCenter(ModBlocks.rfGenerator, WurmTweaksBlocks.blockCompressedRedstone, ModItems.manaResource, PowerConverterCore.converterBlockCommon);
        r.addBasicMachineRecipe(ModBlocks.brewery, WurmTweaksBlocks.blockPlatinum, WurmTweaksItems.itemNatureCoreMK2, Items.brewing_stand, new ItemStack(ModItems.rune, 1, 8));
        r.addBasicMachineRecipe(ModBlocks.terraPlate, Blocks.lapis_block, WurmTweaksItems.itemNatureCore, WurmTweaksItems.ingotCyanSteel, WurmTweaksItems.ingotEnergyReactor);
        r.addShaped(ModBlocks.redStringContainer, "WWW", "WCS", "WWW", 'W', ModBlocks.dreamwood, 'C', "packChest", 'S', new ItemStack(ModItems.manaResource, 1, 10));
        r.addShaped(ModBlocks.redStringDispenser, "WWW", "WCS", "WWW", 'W', ModBlocks.dreamwood, 'C', Blocks.dispenser, 'S', new ItemStack(ModItems.manaResource, 1, 10));
        r.addShaped(ModBlocks.redStringFertilizer, "WWW", "WCS", "WWW", 'W', ModBlocks.dreamwood, 'C', ModItems.fertilizer, 'S', new ItemStack(ModItems.manaResource, 1, 10));
        r.addShaped(ModBlocks.redStringComparator, "WWW", "WCS", "WWW", 'W', ModBlocks.dreamwood, 'C', Items.comparator, 'S', new ItemStack(ModItems.manaResource, 1, 10));
        r.addShaped(ModBlocks.redStringInterceptor, "WWW", "WCS", "WWW", 'W', ModBlocks.dreamwood, 'C', ModBlocks.spreader, 'S', new ItemStack(ModItems.manaResource, 1, 10));
        r.addShaped(ModBlocks.corporeaIndex, "EXE", "XCX", "DXD", 'E', new ItemStack(ModItems.manaResource, 1, 15), 'X', Blocks.obsidian, 'C', ModItems.corporeaSpark, 'D', new ItemStack(ModItems.manaResource, 1, 9));
        r.addShapeless(ModBlocks.corporeaFunnel, ModItems.corporeaSpark, Blocks.dropper, WurmTweaksItems.itemMagicChunk);
        r.addShapeless(ModBlocks.corporeaCrystalCube, ModItems.corporeaSpark, ModBlocks.elfGlass, WurmTweaksItems.itemNatureCoreMK2);
        r.addSlabs(ModBlocks.incensePlate, ModBlocks.livingwood);
        r.addCrossWCenter(ModBlocks.hourglass, ModBlocks.manaGlass, WurmTweaksItems.itemNatureCore, Items.clock);
        r.addShapeless(ModBlocks.ghostRail, Blocks.rail, ModBlocks.dreamwood);
        r.addBasicMachineRecipe(ModBlocks.sparkChanger, WurmTweaksBlocks.blockBlueSteel, WurmTweaksItems.itemNatureCoreMK2, WurmTweaksItems.ingotPinkSteel, ModBlocks.dreamwood);
        r.addShaped(ModBlocks.felPumpkin, " S ", "RPB", " E ", 'S', Items.string, 'R', Items.rotten_flesh, 'P', TFCBlocks.pumpkin, 'B', Items.bone, 'E', Items.ender_pearl);
        r.addShapeless(ModBlocks.lightRelay, new ItemStack(ModItems.manaResource, 1, 10), new ItemStack(ModItems.manaResource, 1, 9), Items.glowstone_dust, Items.glowstone_dust);
        r.addShapeless(new ItemStack(ModBlocks.lightRelay, 1, 1), ModBlocks.lightRelay, Items.redstone);
        r.addShaped(ModBlocks.lightLauncher, "WWW", "WLW", "TTT", 'W', ModBlocks.dreamwood, 'L', ModBlocks.lightRelay, 'T', Blocks.tnt);
        r.addCrossWCenter(ModBlocks.manaBomb, Blocks.tnt, ModBlocks.dreamwood, new ItemStack(ModItems.manaResource, 1, 5));
        r.addShapeless(ModBlocks.bellows, TFCBlocks.bellows, new ItemStack(ModItems.rune, 1, 3));
        r.addShapeless(ModBlocks.bifrost, new ItemStack(ModItems.rainbowRod, 1, OreDictionary.WILDCARD_VALUE), "packGlass");
        r.addShapeless(ModBlocks.corporeaRetainer, "packChest", ModItems.corporeaSpark);
        r.addBasicMachineRecipe(ModBlocks.teruTeruBozu, new ItemStack(ModItems.manaResource, 1, 22), WurmTweaksItems.itemNatureCoreMK2, WurmTweaksItems.itemBloodInfused, WurmTweaksBlocks.blockSilver);
        r.addShapeless(ModBlocks.shimmerrock, ModBlocks.livingrock, ModBlocks.bifrost);
        r.addShapeless(ModBlocks.shimmerwoodPlanks, ModBlocks.dreamwood, ModBlocks.bifrost);
        r.addShaped(ModBlocks.avatar, " P ", "PDP", "P P", 'P', new ItemStack(ModBlocks.livingwood, 1, 1), 'D', new ItemStack(ModItems.manaResource, 1, 1));
        for (int d = 0; d <= 15; d++)
            r.addShapeless(new ItemStack(ModItems.petal, 2, d), new ItemStack(ModBlocks.flower, 1, d));
        for (int d = 0; d <= 15; d++)
            r.addShapeless(new ItemStack(ModItems.dye, 1, d), new ItemStack(ModItems.pestleAndMortar, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.petal, 1, d));
        r.addShaped(ModItems.pestleAndMortar, "  S", "  X", "B  ", 'S', "packStick", 'X', "packLog", 'B', Items.bowl);
        for (int i = 0; i < 16; i++)
            for (int j = 0; j < 16; j++)
                r.addShaped(ItemTwigWand.forColors(i, j), " AS", " SB", "X  ", 'A', new ItemStack(ModItems.petal, 1, i), 'B', new ItemStack(ModItems.petal, 1, i), 'S', new ItemStack(ModItems.manaResource, 1, 3), 'X', WurmTweaksItems.itemMagicChunk);
        r.addShaped(new ItemStack(ModItems.manaResource, 1, 3), "X", "X", 'X', ModBlocks.livingwood);
        r.addShapeless(new ItemStack(ModItems.manaResource, 1, 6), Blocks.grass, Items.redstone);
        r.addShapeless(new ItemStack(ModItems.manaResource, 32, 11), "packCraftingTable", ModBlocks.livingrock);
        r.addShapeless(new ItemStack(ModItems.manaResource, 1, 12), Items.string, WurmTweaksItems.itemNatureCore);
        r.addShaped(new ItemStack(ModItems.manaResource, 1, 13), "X", "X", 'X', ModBlocks.dreamwood);
        r.addShaped(new ItemStack(ModItems.manaResource, 1, 14), " X ", "XAX", " X ", 'X', new ItemStack(ModItems.manaResource, 1, 5), 'A', new ItemStack(ModItems.manaResource, 1, 4));
        r.add3X(new ItemStack(ModItems.manaResource, 1, 22), new ItemStack(ModItems.manaResource, 1, 16));
        r.addCrossWCenter(new ItemStack(ModItems.lens, 1, 0), ModItems.manaResource, WurmTweaksItems.ingotCyanSteel, "packGlass");
        r.addShapeless(new ItemStack(ModItems.lens, 1, 1), ModItems.lens, new ItemStack(ModItems.rune, 1, 3));
        r.addShapeless(new ItemStack(ModItems.lens, 1, 2), ModItems.lens, new ItemStack(ModItems.rune, 1, 1));
        r.addShapeless(new ItemStack(ModItems.lens, 1, 3), ModItems.lens, new ItemStack(ModItems.rune, 1, 2));
        r.addShapeless(new ItemStack(ModItems.lens, 1, 4), ModItems.lens, new ItemStack(ModItems.rune, 1, 0));
        r.addShapeless(new ItemStack(ModItems.lens, 1, 5), ModItems.lens, new ItemStack(ModItems.rune, 1, 5));
        r.addShapeless(new ItemStack(ModItems.lens, 1, 6), ModItems.lens, new ItemStack(ModItems.rune, 1, 7));
        r.addShapeless(new ItemStack(ModItems.lens, 1, 7), ModItems.lens, Blocks.piston);
        r.addShapeless(new ItemStack(ModItems.lens, 1, 8), ModItems.lens, new ItemStack(ModItems.rune, 1, 6));
        r.addShapeless(new ItemStack(ModItems.lens, 1, 9), ModItems.lens, ModBlocks.platform);
        r.addShapeless(new ItemStack(ModItems.lens, 1, 10), ModItems.lens, "packIngot", "packIngot");
        r.addShapeless(new ItemStack(ModItems.lens, 1, 11), ModItems.lens, new ItemStack(ModItems.rune, 1, 14));
        r.addShapeless(new ItemStack(ModItems.lens, 1, 12), ModItems.lens, new ItemStack(ModItems.manaResource, 1, 10));
        r.addShapeless(new ItemStack(ModItems.lens, 1, 13), ModItems.lens, new ItemStack(ModItems.rune, 1, 4));
        r.addShapeless(new ItemStack(ModItems.lens, 1, 14), ModItems.lens, WurmTweaksItems.ingotRainbowSteel);
        r.addShapeless(new ItemStack(ModItems.lens, 1, 15), ModItems.lens, Items.fire_charge);
        r.addShapeless(new ItemStack(ModItems.lens, 1, 16), ModItems.lens, ModBlocks.pistonRelay);
        r.addCrossWCenter(new ItemStack(ModItems.lens, 1, 17), Blocks.glowstone, Items.fire_charge, ModItems.lens);
        r.addShapeless(new ItemStack(ModItems.lens, 1, 18), ModItems.lens, WurmTweaksItems.itemNatureCoreMK2);
        r.addShapeless(new ItemStack(ModItems.lens, 1, 19), new ItemStack(ModItems.lens, 1, 18));
        r.addShapeless(new ItemStack(ModItems.lens, 1, 20), ModItems.lens, WurmTweaksItems.itemNatureCore, Items.fireworks);
        for (int i = 0; i < 16; i++)
            r.addShaped(ItemSignalFlare.forColor(i), "I ", " B", "W ", 'B', new ItemStack(ModBlocks.manaBeacon, 1, i), 'I', "packIngo", 'W', ModBlocks.livingwood);
        r.addCircleWCenter(new ItemStack(ModItems.manaTablet, 1, 0), ModBlocks.livingrock, WurmTweaksItems.itemNatureCoreMK2);
        r.addShaped(ModItems.manaGun, "MRA", " BT", "  W", 'W', ModBlocks.livingwood, 'M', ModBlocks.spreader, 'R', new ItemStack(ModItems.rune, 1, 8), 'A', WurmTweaksItems.stableMagicEssence, 'T', Blocks.tnt, 'B', ModBlocks.dreamwood);
        r.addShapeless(new ItemStack(ModItems.fertilizer, 32), WurmTweaksItems.itemBloodInfused, WurmTweaksItems.itemNatureCore, "dye", "dye", "dye", "dye");
        r.addShapeless(new ItemStack(ModItems.grassHorn, 1, 0), WurmTweaksItems.itemNatureCore, new ItemStack(ModItems.dye, 1, OreDictionary.WILDCARD_VALUE));
        r.addShapeless(new ItemStack(ModItems.grassHorn, 1, 1), new ItemStack(ModItems.grassHorn, 1, 0), WurmTweaksItems.itemNatureCoreMK2);
        r.addShaped(ModItems.manaMirror, "AXA", " B ", " T ", 'A', ModBlocks.shimmerrock, 'X', WurmTweaksItems.itemNatureCoreMK2, 'B', new ItemStack(ModItems.manaResource, 1, 3), 'T', new ItemStack(ModItems.manaTablet, 1, OreDictionary.WILDCARD_VALUE));
        r.addArmorRecipes(ModItems.manasteelHelm, ModItems.manasteelChest, ModItems.manasteelLegs, ModItems.manasteelBoots, new ItemStack(ModItems.manaResource));
        r.addArmorRecipes(ModItems.manaweaveHelm, ModItems.manaweaveChest, ModItems.manasteelLegs, ModItems.manaweaveBoots, new ItemStack(ModItems.manaResource, 1, 22));
        r.addArmorRecipes(ModItems.elementiumHelm, ModItems.elementiumChest, ModItems.elementiumLegs, ModItems.elementiumBoots, new ItemStack(ModItems.manaResource, 1, 7));
        r.addArmorRecipes(ModItems.terrasteelHelm, ModItems.terrasteelChest, ModItems.terrasteelLegs, ModItems.terrasteelBoots, new ItemStack(ModItems.manaResource, 1, 4));
        r.addShapeless(ModItems.manasteelHelmRevealing, ModItems.manasteelHelm, ConfigItems.itemGoggles);
        r.addShapeless(ModItems.elementiumHelmRevealing, ModItems.elementiumHelm, ConfigItems.itemGoggles);
        r.addShapeless(ModItems.terrasteelHelmRevealing, ModItems.terrasteelHelm, ConfigItems.itemGoggles);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.manasteelPick), 450), "III", " S ", " S ", 'I', ModItems.manaResource, 'S', new ItemStack(ModItems.manaResource, 1, 3));
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.manasteelAxe), 500), "II ", "IS ", " S ", 'I', ModItems.manaResource, 'S', new ItemStack(ModItems.manaResource, 1, 3));
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.manasteelAxe), 500), " II", " SI", " S ", 'I', ModItems.manaResource, 'S', new ItemStack(ModItems.manaResource, 1, 3));
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.manasteelShovel), 425), " I ", " S ", " S ", 'I', ModItems.manaResource, 'S', new ItemStack(ModItems.manaResource, 1, 3));
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.manasteelSword), 825), " I ", " I ", " S ", 'I', ModItems.manaResource, 'S', new ItemStack(ModItems.manaResource, 1, 3));
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.elementiumPick), 600), "III", " S ", " S ", 'I', new ItemStack(ModItems.manaResource, 1, 7), 'S', new ItemStack(ModItems.manaResource, 1, 13));
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.elementiumAxe), 750), "II ", "IS ", " S ", 'I', new ItemStack(ModItems.manaResource, 1, 7), 'S', new ItemStack(ModItems.manaResource, 1, 13));
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.elementiumAxe), 750), " II", " SI", " S ", 'I', new ItemStack(ModItems.manaResource, 1, 7), 'S', new ItemStack(ModItems.manaResource, 1, 13));
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.elementiumShovel), 560), " I ", " S ", " S ", 'I', new ItemStack(ModItems.manaResource, 1, 7), 'S', new ItemStack(ModItems.manaResource, 1, 13));
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.elementiumSword), 1000), " I ", " I ", " S ", 'I', new ItemStack(ModItems.manaResource, 1, 7), 'S', new ItemStack(ModItems.manaResource, 1, 13));
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.terraSword), 2800), " I ", " I ", " S ", 'I', new ItemStack(ModItems.manaResource, 1, 4), 'S', WurmTweaksItems.ingotRainbowSteel);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.terraPick), 2000), "III", " S ", " S ", 'I', new ItemStack(ModItems.manaResource, 1, 4), 'S', WurmTweaksItems.ingotRainbowSteel);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.terraAxe), 2200), " II", " SI", " S ", 'I', new ItemStack(ModItems.manaResource, 1, 4), 'S', WurmTweaksItems.ingotRainbowSteel);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.terraAxe), 2200), "II ", "IS ", " S ", 'I', new ItemStack(ModItems.manaResource, 1, 4), 'S', WurmTweaksItems.ingotRainbowSteel);
        r.addCrossWCenter(ModItems.tinyPlanet, "packSmoothStone", WurmTweaksBlocks.blockGold, ModItems.manaResource);
        r.addShaped(new ItemStack(ModItems.manaRing, 1, 1000), "MI ", "I I", " I ", 'M', ModItems.manaTablet, 'I', ModItems.manaResource);
        r.addShapeless(new ItemStack(ModItems.manaRingGreater, 1, 1000), new ItemStack(ModItems.manaRing, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.manaResource, 1, 4));
        r.addBasicMachineRecipe(ModItems.travelBelt, ModBlocks.livingrock, new ItemStack(ModItems.rune, 1, 2), new ItemStack(ModItems.rune, 1, 3), TFCItems.leather);
        r.addBasicMachineRecipe(ModItems.knockbackBelt, ModBlocks.livingrock, new ItemStack(ModItems.rune, 1, 1), new ItemStack(ModItems.rune, 1, 2), "packDirt");
        r.addBasicMachineRecipe(ModItems.lavaPendant, ModBlocks.livingrock, new ItemStack(ModItems.rune, 1, 1), new ItemStack(ModItems.rune, 1, 5), TFCItems.blueSteelBucketLava);
        r.addBasicMachineRecipe(ModItems.goldLaurel, WurmTweaksItems.itemNatureCoreMK2, WurmTweaksItems.ingotBrownSteel, "packPlanks", ModItems.rune);
        r.addBasicMachineRecipe(ModItems.magnetRing, ModBlocks.livingrock, new ItemStack(ModItems.rune, 1, 2), new ItemStack(ModItems.rune, 1, 3), new ItemStack(ModItems.lens, 1, 10));
        r.addBasicMachineRecipe(ModItems.lavaPendant, ModBlocks.livingrock, new ItemStack(ModItems.rune, 1, 1), new ItemStack(ModItems.rune, 1, 0), TFCItems.redSteelBucketSaltWater);
        r.addBasicMachineRecipe(ModItems.speedUpBelt, ModBlocks.livingrock, new ItemStack(ModItems.rune, 1, 1), new ItemStack(ModItems.rune, 1, 2), new ItemStack(Items.potionitem, 1, 8258));
        r.addBasicMachineRecipe(ModItems.divaCharm, WurmTweaksItems.itemBloodInfused, WurmTweaksItems.itemMagicChunk, WurmTweaksItems.itemNatureCoreMK2, new ItemStack(LudicrousItems.resource, 1, 4));
        r.addShaped(new ItemStack(ModItems.flightTiara, 1, 0), "SSS", "XSX", "FEF", 'S', new ItemStack(ModItems.manaResource, 1, 5), 'X', WurmTweaksItems.ingotRainbowSteel, 'F', Items.feather, 'E', new ItemStack(ModItems.manaResource, 1, 15));
        r.addShapeless(new ItemStack(ModItems.flightTiara, 1, 1), new ItemStack(ModItems.flightTiara, 1, 0), Items.quartz);
        r.addShapeless(new ItemStack(ModItems.flightTiara, 1, 2), new ItemStack(ModItems.flightTiara, 1, 1), Items.quartz);
        r.addShapeless(new ItemStack(ModItems.flightTiara, 1, 3), new ItemStack(ModItems.flightTiara, 1, 2), Items.quartz);
        r.addShapeless(new ItemStack(ModItems.flightTiara, 1, 4), new ItemStack(ModItems.flightTiara, 1, 3), Items.quartz);
        r.addShapeless(new ItemStack(ModItems.flightTiara, 1, 5), new ItemStack(ModItems.flightTiara, 1, 4), Items.quartz);
        r.addShapeless(new ItemStack(ModItems.flightTiara, 1, 6), new ItemStack(ModItems.flightTiara, 1, 5), Items.quartz);
        r.addShapeless(new ItemStack(ModItems.flightTiara, 1, 7), new ItemStack(ModItems.flightTiara, 1, 6), Items.quartz);
        r.addShapeless(new ItemStack(ModItems.flightTiara, 1, 8), new ItemStack(ModItems.flightTiara, 1, 7), Items.quartz);
        r.addBasicMachineRecipe(ModItems.reachRing, ModBlocks.livingrock, new ItemStack(ModItems.rune, 1, 15), new ItemStack(ModItems.rune, 1, 15), WurmTweaksItems.itemNatureCoreMK2);
        r.addShapeless(ModItems.magnetRingGreater, new ItemStack(ModItems.manaResource, 1, 4), ModItems.magnetRing);
        r.addShapeless(ModItems.superTravelBelt, new ItemStack(ModItems.manaResource, 1, 4), ModItems.travelBelt);
        r.addCircleWCenter(ModItems.enderHand, WurmTweaksItems.itemNatureCore, Blocks.ender_chest);
        for (int d = 0; d < 16; d++)
            r.addShaped(ModItems.spark, " X ", "DCD", " X ", 'X', Items.blaze_powder, 'D', new ItemStack(ModItems.petal, 1, d), 'C', TFCItems.platinumSheet);
        r.addShapeless(ModItems.monocle, "packGlass", TFCItems.goldSheet, WurmTweaksItems.itemNatureCore);
        r.addShaped(new ItemStack(ModItems.vial, 2), "V V", " V ", 'V', ModBlocks.manaGlass);
        r.addShaped(new ItemStack(ModItems.brewFlask, 1), "V V", " V ", 'V', ModBlocks.elfGlass);
        r.addCircleWCenter(ModItems.bloodPendant, WurmTweaksItems.itemNatureCoreMK2, Items.ghast_tear);
        ItemStack creativeManaTablet = new ItemStack(ModItems.manaTablet);
        ItemManaTablet.setMana(creativeManaTablet, 500000);
        ItemManaTablet.setStackCreative(creativeManaTablet);
        r.addShaped9X9Recipe(creativeManaTablet, "         ", " IIIIIII ", " IXXXXXI ", " IXBBBXI ", " IXBBBXI ", " IXBBBXI ", " IXXXXXI ", " IIIIIII ", "         ", 'I', new ItemStack(LudicrousItems.resource, 1, 6), 'X', new ItemStack(ModItems.manaTablet), 'B', WurmTweaksItems.creativeCreativeParts);
        r.addShaped(ModItems.incenseStick, "S", "S", "X", 'X', "packStick", 'S', WurmTweaksItems.itemNatureCoreMK2);
        r.addShaped(ModItems.gravityRod, "XAX", " X ", " S ", 'X', WurmTweaksItems.itemNatureCoreMK2, 'A', WurmTweaksItems.ingotRainbowSteel, 'S', new ItemStack(ModItems.manaResource, 1, 13));
        r.addCircleWCenter(ModItems.blackHoleTalisman, ModItems.manaResource, WurmTweaksItems.itemAntiMatter);
        r.addShapeless(ModItems.poolMinecart, Items.minecart, ModBlocks.pool);
        r.addCircleWCenter(ModItems.baubleBox, "packSmoothStone", "packChest");
        r.addShaped(ModItems.obedienceStick, "  I", " S ", "S  ", 'I', ModItems.manaResource, 'S', new ItemStack(ModItems.manaResource, 1, 3));
        r.addCrossWCenter(ModItems.superLavaPendant, Items.fire_charge, TFCItems.blueSteelBucketLava, ModItems.lavaPendant);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.starSword), 2800), " S ", " S ", " X ", 'X', WurmTweaksItems.ingotRainbowSteel, 'S', WurmTweaksItems.itemNatureCoreMK2);
        r.addShaped(ItemNBT.addDamage(new ItemStack(ModItems.thunderSword), 2600), " S ", " S ", " X ", 'X', WurmTweaksItems.ingotTitanium, 'S', WurmTweaksItems.itemNatureCoreMK2);
        r.addShapeless(ModItems.corporeaSpark, ModItems.spark, WurmTweaksItems.itemNatureCore);
        r.addShapeless(new ItemStack(ModItems.corporeaSpark, 1, 1), ModItems.corporeaSpark, WurmTweaksItems.itemNatureCoreMK2);
        r.addShaped(ModItems.crystalBow, " WS", "W S", " WS", 'W', ModBlocks.dreamwood, 'S', new ItemStack(ModItems.manaResource, 1, 16));
        r.addShaped(ModItems.livingwoodBow, " WS", "W S", " WS", 'W', ModBlocks.livingwood, 'S', new ItemStack(ModItems.manaResource, 1, 16));
        r.addShapeless(new ItemStack(ModItems.sparkUpgrade), new ItemStack(ModItems.rune, 1, 0), Items.redstone, WurmTweaksItems.itemNatureCore);
        r.addShapeless(new ItemStack(ModItems.sparkUpgrade, 1, 1), new ItemStack(ModItems.rune, 1, 1), Items.redstone, WurmTweaksItems.itemNatureCore);
        r.addShapeless(new ItemStack(ModItems.sparkUpgrade, 1, 2), new ItemStack(ModItems.rune, 1, 2), Items.redstone, WurmTweaksItems.itemNatureCore);
        r.addShapeless(new ItemStack(ModItems.sparkUpgrade, 1, 3), new ItemStack(ModItems.rune, 1, 3), Items.redstone, WurmTweaksItems.itemNatureCore);
        for (int a = 0; a < 16; a++)
            r.addCircleWCenter(new ItemStack(ModItems.cosmetic, 1, a), new ItemStack(ModItems.petal, 1, a), new ItemStack(ModItems.manaResource, 1, 16));
        for (int a = 16; a < 31; a++)
            r.addCircleWCenter(new ItemStack(ModItems.cosmetic, 1, a), new ItemStack(ModItems.petal, 1, a), new ItemStack(ModItems.manaResource, 1, 16));
        ArmorHandler.addArmorProtection(ModItems.manasteelHelm, 300, 1200, 600);
        ArmorHandler.addArmorProtection(ModItems.manasteelLegs, 300, 1200, 600);
        ArmorHandler.addArmorProtection(ModItems.manasteelBoots, 300, 1200, 600);
        ArmorHandler.addArmorProtection(ModItems.manasteelChest, 300, 1200, 600);
        ArmorHandler.addArmorProtection(ModItems.manasteelHelmRevealing, 400, 1300, 700);
        ArmorHandler.addArmorProtection(ModItems.terrasteelHelm, 600, 2400, 1200);
        ArmorHandler.addArmorProtection(ModItems.terrasteelLegs, 600, 2400, 1200);
        ArmorHandler.addArmorProtection(ModItems.terrasteelBoots, 600, 2400, 1200);
        ArmorHandler.addArmorProtection(ModItems.terrasteelChest, 600, 2400, 1200);
        ArmorHandler.addArmorProtection(ModItems.terrasteelHelmRevealing, 800, 2600, 1400);
        ArmorHandler.addArmorProtection(ModItems.elementiumHelm, 450, 1800, 1000);
        ArmorHandler.addArmorProtection(ModItems.elementiumLegs, 450, 1800, 1000);
        ArmorHandler.addArmorProtection(ModItems.elementiumBoots, 450, 1800, 1000);
        ArmorHandler.addArmorProtection(ModItems.elementiumChest, 450, 1800, 1000);
        ArmorHandler.addArmorProtection(ModItems.elementiumHelmRevealing, 550, 2000, 1000);
        r.addShapeless(new ItemStack(ModItems.manaResource, 32, 0), new ItemStack(ModBlocks.storage, 1, 0));
        r.addShapeless(new ItemStack(ModItems.manaResource, 32, 4), new ItemStack(ModBlocks.storage, 1, 1));
        r.addShapeless(new ItemStack(ModItems.manaResource, 32, 7), new ItemStack(ModBlocks.storage, 1, 2));
        r.addShapeless(new ItemStack(ModItems.manaResource, 32, 2), new ItemStack(ModBlocks.storage, 1, 3));
        r.addShapeless(new ItemStack(ModItems.manaResource, 32, 9), new ItemStack(ModBlocks.storage, 1, 4));
        r.addShapeless(ModItems.lexicon, Items.book, new ItemStack(ModItems.petal, 1, OreDictionary.WILDCARD_VALUE));
        r.addShapeless(new ItemStack(ModItems.aesirRing), ModItems.lokiRing, ModItems.odinRing, ModItems.thorRing);
        r.addShapeless(new ItemStack(ModItems.manaResource, 1, 15), Items.ender_pearl, TFItems.ingotEnderium, Items.glass_bottle);
        for (int i = 0; i < 4; i++)
            r.addShapeless(new ItemStack(ModItems.sparkUpgrade, 1, i),
                    LibOreDict.PIXIE_DUST, WurmTweaksItems.ingotGreenSteel, LibOreDict.RUNE[i]);
        if (RecipeChecker.modExists("IC2"))
            addCompressorRecipes();
        addManaPoolRecipes();
        addElvenRecipes();
        addRunicAlterRecipes();
        addConjurationRecipes();
        addAlchemyRecipes();
        addPetalRecipes();
    }

    @Optional.Method(modid = "IC2")
    private static void addCompressorRecipes() {
        ICHelper.addCompressorRecipe(new ItemStack(ModItems.manaResource, 32, 0), new ItemStack(ModBlocks.storage, 1, 0));
        ICHelper.addCompressorRecipe(new ItemStack(ModItems.manaResource, 32, 4), new ItemStack(ModBlocks.storage, 1, 1));
        ICHelper.addCompressorRecipe(new ItemStack(ModItems.manaResource, 32, 7), new ItemStack(ModBlocks.storage, 1, 2));
        ICHelper.addCompressorRecipe(new ItemStack(ModItems.manaResource, 32, 2), new ItemStack(ModBlocks.storage, 1, 3));
        ICHelper.addCompressorRecipe(new ItemStack(ModItems.manaResource, 32, 9), new ItemStack(ModBlocks.storage, 1, 4));
    }

    @Optional.Method(modid = "Botania")
    private static void addManaPoolRecipes() {
        LogHandler.info("Adding Mana Pool Recipes");
        BotaniaHelper.addPoolRecipe(new ItemStack(ModItems.manaResource, 1, 0), new ItemStack(TFCItems.wroughtIronIngot), 3000);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModBlocks.storage, 1, 0), new ItemStack(WurmTweaksBlocks.blockWroughtIron), 96000);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModItems.manaResource, 1, 1), new ItemStack(Items.ender_pearl), 6000);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModItems.manaResource, 1, 2), "packGemExquisite", 12000);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModItems.manaResource, 1, 2), "packGemBlock", 38400);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModItems.manaResource, 1, 23), new ItemStack(Items.gunpowder), 500);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModItems.manaResource, 1, 23), "dustSulfur", 500);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModBlocks.pistonRelay), new ItemStack(Blocks.piston), 15000);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModItems.quartz, 1, 1), new ItemStack(Items.quartz), 500);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModItems.manaInkwell, 1, ModItems.manaInkwell.getMaxDamage()), new ItemStack((Item) Item.itemRegistry.getObject("Thaumcraft:ItemInkwell")), 35000);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModBlocks.manaGlass), "packGlass", 1500);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModItems.manaResource, 1, 16), new ItemStack(TFCItems.woolYarn), 5000);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModItems.manaBottle), new ItemStack(TFCItems.glassBottle), 5000);
        BotaniaHelper.addPoolRecipe(new ItemStack(ModItems.manaBottle), new ItemStack(Items.glass_bottle), 5000);
    }

    @Optional.Method(modid = "Botania")
    private static void addElvenRecipes() {
        BotaniaHelper.addPortalRecipe(new ItemStack(ModBlocks.dreamwood), "packLog");
        BotaniaHelper.addPortalRecipe(new ItemStack(ModItems.manaResource, 1, 7), new ItemStack(ModItems.manaResource, 1, 0));
        BotaniaHelper.addPortalRecipe(new ItemStack(ModBlocks.storage, 1, 2), new ItemStack(ModBlocks.storage, 1, 0));
        BotaniaHelper.addPortalRecipe(new ItemStack(ModItems.manaResource, 1, 8), new ItemStack(ModItems.manaResource, 1, 1));
        BotaniaHelper.addPortalRecipe(new ItemStack(ModItems.manaResource, 1, 9), new ItemStack(ModItems.manaResource, 1, 2));
        BotaniaHelper.addPortalRecipe(new ItemStack(ModBlocks.storage, 1, 4), new ItemStack(ModBlocks.storage, 1, 3));
        BotaniaHelper.addPortalRecipe(new ItemStack(ModBlocks.elfGlass), "packGlass");
        for (ItemStack ingot : OreDictionary.getOres("packIngot"))
            BotaniaHelper.addPortalRecipe(ingot, ingot);
    }

    @Optional.Method(modid = "Botania")
    private static void addRunicAlterRecipes() {
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 2, 0), 5200, new ItemStack(ModItems.manaResource, 1, 23), new ItemStack(ModItems.manaResource, 1, 0), new ItemStack(Items.dye, 1, 15), new ItemStack(Items.reeds), new ItemStack(Items.fishing_rod));
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 2, 1), 5200, new ItemStack(ModItems.manaResource, 1, 23), new ItemStack(ModItems.manaResource, 1, 0), new ItemStack(Items.netherbrick), new ItemStack(Items.gunpowder), new ItemStack(Items.nether_wart));
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 2, 2), 5200, new ItemStack(ModItems.manaResource, 1, 23), new ItemStack(ModItems.manaResource, 1, 0), "packSmoothStone", new ItemStack(Blocks.coal_block), new ItemStack(Blocks.brown_mushroom));
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 2, 2), 5200, new ItemStack(ModItems.manaResource, 1, 23), new ItemStack(ModItems.manaResource, 1, 0), "packSmoothStone", new ItemStack(Blocks.coal_block), new ItemStack(Blocks.red_mushroom));
        for (int i = 0; i < 16; i++)
            BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 2, 3), 5200, new ItemStack(ModItems.manaResource, 1, 23), new ItemStack(ModItems.manaResource, 1, 0), new ItemStack(Blocks.carpet, 1, i), new ItemStack(Items.feather), new ItemStack(Items.string));
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 4), 8900, LibOreDict.RUNE[0], LibOreDict.RUNE[1], "packSapling", "packSapling", "packSapling", new ItemStack(Items.wheat));
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 5), 8900, LibOreDict.RUNE[2], LibOreDict.RUNE[3], "packSand", "packSand", new ItemStack(Items.slime_ball), new ItemStack(Items.melon));
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 6), 8900, LibOreDict.RUNE[1], LibOreDict.RUNE[3], "packSapling", "packSapling", "packSapling", new ItemStack(Items.spider_eye));
        for (int i = 0; i < 16; i++)
            BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 7), 8900, LibOreDict.RUNE[0], LibOreDict.RUNE[2], new ItemStack(Blocks.snow), new ItemStack(Blocks.snow), new ItemStack(Blocks.wool, 1, i), "packFruit");
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 8), 8900, new ItemStack(ModItems.manaResource, 1, 0), new ItemStack(ModItems.manaResource, 1, 0), new ItemStack(ModItems.manaResource, 1, 0), new ItemStack(ModItems.manaResource, 1, 0), new ItemStack(ModItems.manaResource, 1, 0), LibOreDict.MANA_PEARL);
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 9), 20000, new ItemStack(ModItems.manaResource, 1, 2), new ItemStack(ModItems.manaResource, 1, 2), LibOreDict.RUNE[5], LibOreDict.RUNE[3]);
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 10), 20000, new ItemStack(ModItems.manaResource, 1, 2), new ItemStack(ModItems.manaResource, 1, 2), LibOreDict.RUNE[7], LibOreDict.RUNE[1]);
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 11), 20000, new ItemStack(ModItems.manaResource, 1, 2), new ItemStack(ModItems.manaResource, 1, 2), LibOreDict.RUNE[4], LibOreDict.RUNE[0]);
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 12), 20000, new ItemStack(ModItems.manaResource, 1, 2), new ItemStack(ModItems.manaResource, 1, 2), LibOreDict.RUNE[6], LibOreDict.RUNE[3]);
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 13), 20000, new ItemStack(ModItems.manaResource, 1, 2), new ItemStack(ModItems.manaResource, 1, 2), LibOreDict.RUNE[7], LibOreDict.RUNE[2]);
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 14), 20000, new ItemStack(ModItems.manaResource, 1, 2), new ItemStack(ModItems.manaResource, 1, 2), LibOreDict.RUNE[7], LibOreDict.RUNE[0]);
        BotaniaHelper.addAlterRecipe(new ItemStack(ModItems.rune, 1, 15), 20000, new ItemStack(ModItems.manaResource, 1, 2), new ItemStack(ModItems.manaResource, 1, 2), LibOreDict.RUNE[5], LibOreDict.RUNE[1]);
    }

    @Optional.Method(modid = "Botania")
    private static void addConjurationRecipes() {
        for (ItemStack sand : OreDictionary.getOres("packSand"))
            BotaniaHelper.addConjurationRecipe(new ItemStack(sand.getItem(), 2, sand.getItemDamage()), sand, 8000);
        for (ItemStack gravel : OreDictionary.getOres("packGravel"))
            BotaniaHelper.addConjurationRecipe(new ItemStack(gravel.getItem(), 2, gravel.getItemDamage()), gravel, 8000);
        BotaniaHelper.addConjurationRecipe(new ItemStack(Items.redstone, 2), new ItemStack(Items.redstone), 12000);
        BotaniaHelper.addConjurationRecipe(new ItemStack(Items.glowstone_dust, 2), new ItemStack(Items.glowstone_dust), 24000);
        BotaniaHelper.addConjurationRecipe(new ItemStack(TFCItems.coal, 2, 1), new ItemStack(TFCItems.coal, 1, 1), 8000);
        BotaniaHelper.addConjurationRecipe(new ItemStack(TFCItems.coal, 2, 0), new ItemStack(TFCItems.coal, 1, 0), 8000);
    }

    @Optional.Method(modid = "Botania")
    private static void addAlchemyRecipes() {
        for (int l = 0; l < 15; l++)
            BotaniaHelper.addAlchemyRecipe(new ItemStack(TFCItems.logs, 1, l + 1), new ItemStack(TFCItems.logs, 1, l), 4000);
        for (int s = 0; s < OreDictionary.getOres("packSeed").size() - 1; s++)
            BotaniaHelper.addAlchemyRecipe(OreDictionary.getOres("packSeed").get(s + 1), OreDictionary.getOres("packSeed").get(s), 8000);
        BotaniaHelper.addAlchemyRecipe(new ItemStack(Items.redstone), new ItemStack(Items.glowstone_dust), 4000);
        BotaniaHelper.addAlchemyRecipe(new ItemStack(Items.glowstone_dust), new ItemStack(Items.redstone), 4000);
        for (int s = 0; s < OreDictionary.getOres("packSmoothStone").size() - 1; s++)
            BotaniaHelper.addAlchemyRecipe(OreDictionary.getOres("packSmoothStone").get(s + 1), OreDictionary.getOres("packSmoothStone").get(s), 12000);
        BotaniaHelper.addAlchemyRecipe(new ItemStack(ModItems.worldSeed), WurmTweaksItems.itemNatureCore, 28000);
    }

    @Optional.Method(modid = "Botania")
    private static void addPetalRecipes() {
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_PUREDAISY), "petalWhite", "petalWhite", "petalWhite", "petalWhite");
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_MANASTAR), "petalLightBlue", "petalGreen", "petalRed", "petalCyan");
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_DAYBLOOM), "petalYellow", "petalYellow", "petalOrange", "petalLightBlue");
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_NIGHTSHADE), "petalBlack", "petalBlack", "petalPurple", "petalGray");
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_ENDOFLAME), "petalBrown", "petalBrown", "petalRed", "petalLightGray", new ItemStack(ModItems.manaResource, 1, 23));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_HYDROANGEAS), "petalBlue", "petalBlue", "petalCyan", "petalCyan", new ItemStack(ModItems.manaResource, 1, 23));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_THERMALILY), "petalRed", "petalOrange", "petalOrange", new ItemStack(ModItems.rune, 1, 2), new ItemStack(ModItems.rune, 1, 1));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_ARCANE_ROSE), "petalPink", "petalPink", "petalPurple", "petalPurple", "petalLime", new ItemStack(ModItems.rune, 1, 8));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_MUNCHDEW), "petalLime", "petalLime", "petalRed", "petalRed", "petalGreen", new ItemStack(ModItems.rune, 1, 10));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_ENTROPINNYUM), "petalRed", "petalRed", "petalGray", "petalGray", "petalWhite", "petalWhite", new ItemStack(ModItems.rune, 1, 15), new ItemStack(ModItems.rune, 1, 1));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_KEKIMURUS), "petalWhite", "petalWhite", "petalOrange", "petalOrange", "petalBrown", "petalBrown", new ItemStack(ModItems.rune, 1, 10), new ItemStack(ModItems.manaResource, 1, 8));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_GOURMARYLLIS), "petalLightGray", "petalLightGray", "petalYellow", "petalYellow", "petalRed", new ItemStack(ModItems.rune, 1, 1), new ItemStack(ModItems.rune, 1, 5));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_NARSLIMMUS), "petalLime", "petalLime", "petalGreen", "petalGreen", "petalBlack", new ItemStack(ModItems.rune, 1, 5), new ItemStack(ModItems.rune, 1, 0));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_SPECTROLUS), "petalRed", "petalRed", "petalGreen", "petalGreen", "petalBlue", "petalBlue", "petalWhite", "petalWhite", new ItemStack(ModItems.rune, 1, 7), new ItemStack(ModItems.rune, 1, 2), new ItemStack(ModItems.manaResource, 1, 8));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_RAFFLOWSIA), "petalPurple", "petalPurple", "petalGreen", "petalGreen", "petalBlack", new ItemStack(ModItems.rune, 1, 2), new ItemStack(ModItems.rune, 1, 15), new ItemStack(ModItems.manaResource, 1, 8));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_DANDELIFEON), "petalPurple", "petalPurple", "petalLime", "petalGreen", new ItemStack(ModItems.rune, 1, 0), new ItemStack(ModItems.rune, 1, 1), new ItemStack(ModItems.rune, 1, 2), new ItemStack(ModItems.rune, 1, 3), new ItemStack(ModItems.manaResource, 1, 5));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_JADED_AMARANTHUS), "petalPurple", "petalLime", "petalGreen", new ItemStack(ModItems.rune, 1, 4), new ItemStack(ModItems.manaResource, 1, 6));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_BELLETHORN), "petalRed", "petalRed", "petalRed", "petalCyan", "petalCyan", new ItemStack(ModItems.manaResource, 1, 6));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_DREADTHORN), "petalBlack", "petalBlack", "petalBlack", "petalCyan", "petalCyan", new ItemStack(ModItems.manaResource, 1, 6));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_HEISEI_DREAM), "petalMagenta", "petalMagenta", "petalPurple", "petalPink", new ItemStack(ModItems.rune, 1, 13), new ItemStack(ModItems.manaResource, 1, 8));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_TIGERSEYE), "petalYellow", "petalBrown", "petalOrange", "petalLime", new ItemStack(ModItems.rune, 1, 7));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_ORECHID), "petalGray", "petalGray", "petalYellow", "petalGreen", "petalRed", new ItemStack(ModItems.rune, 1, 15), new ItemStack(ModItems.rune, 1, 11), new ItemStack(ModItems.manaResource, 1, 6), new ItemStack(ModItems.manaResource, 1, 8));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_ORECHID_IGNEM), "petalRed", "petalRed", "petalWhite", "petalWhite", "petalPink", new ItemStack(ModItems.rune, 1, 15), new ItemStack(ModItems.rune, 1, 11), new ItemStack(ModItems.manaResource, 1, 6), new ItemStack(ModItems.manaResource, 1, 8));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_FALLEN_KANADE), "petalWhite", "petalWhite", "petalWhite", "petalWhite", "petalOrange", new ItemStack(ModItems.rune, 1, 4));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_EXOFLAME), "petalRed", "petalRed", "petalGray", "petalLightGray", new ItemStack(ModItems.rune, 1, 1), new ItemStack(ModItems.rune, 1, 5));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_AGRICARNATION), "petalLime", "petalLime", "petalGreen", "petalYellow", new ItemStack(ModItems.rune, 1, 4), new ItemStack(ModItems.manaResource, 1, 6));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_HOPPERHOCK), "petalGray", "petalGray", "petalLightGray", "petalLightGray", new ItemStack(ModItems.rune, 1, 3), new ItemStack(ModItems.manaResource, 1, 6));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_TANGLEBERRIE), "petalCyan", "petalCyan", "petalGray", "petalLightGray", new ItemStack(ModItems.rune, 1, 3), new ItemStack(ModItems.rune, 1, 2));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_JIYUULIA), "petalPink", "petalPink", "petalPurple", "petalLightGray", new ItemStack(ModItems.rune, 1, 0), new ItemStack(ModItems.rune, 1, 3));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_RANNUNCARPUS), "petalOrange", "petalOrange", "petalYellow", new ItemStack(ModItems.rune, 1, 2), new ItemStack(ModItems.manaResource, 1, 6));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_HYACIDUS), "petalPurple", "petalPurple", "petalMagenta", "petalMagenta", "petalGreen", new ItemStack(ModItems.rune, 1, 0), new ItemStack(ModItems.rune, 1, 7), new ItemStack(ModItems.manaResource, 1, 6));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_POLLIDISIAC), "petalRed", "petalRed", "petalPink", "petalPink", "petalOrange", new ItemStack(ModItems.rune, 1, 9), new ItemStack(ModItems.rune, 1, 1));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_CLAYCONIA), "petalLightGray", "petalLightGray", "petalGray", "petalCyan", new ItemStack(ModItems.rune, 1, 2));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_LOONIUM), "petalGreen", "petalGreen", "petalGreen", "petalGreen", "petalGray", new ItemStack(ModItems.rune, 1, 12), new ItemStack(ModItems.rune, 1, 10), new ItemStack(ModItems.rune, 1, 14), new ItemStack(ModItems.manaResource, 1, 6), new ItemStack(ModItems.manaResource, 1, 8));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_DAFFOMILL), "petalWhite", "petalWhite", "petalBrown", "petalYellow", new ItemStack(ModItems.rune, 1, 3), new ItemStack(ModItems.manaResource, 1, 6));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_VINCULOTUS), "petalBlack", "petalBlack", "petalPurple", "petalPurple", "petalGreen", new ItemStack(ModItems.rune, 1, 0), new ItemStack(ModItems.rune, 1, 12), new ItemStack(ModItems.manaResource, 1, 8), new ItemStack(ModItems.manaResource, 1, 6));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_SPECTRANTHEMUM), "petalWhite", "petalWhite", "petalLightGray", "petalLightGray", "petalCyan", new ItemStack(ModItems.rune, 1, 14), new ItemStack(ModItems.rune, 1, 0), new ItemStack(ModItems.manaResource, 1, 6), new ItemStack(ModItems.manaResource, 1, 8));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_MEDUMONE), "petalBrown", "petalBrown", "petalGray", "petalGray", new ItemStack(ModItems.rune, 1, 2), new ItemStack(ModItems.manaResource, 1, 6));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_MARIMORPHOSIS), "petalGray", "petalYellow", "petalGreen", "petalRed", new ItemStack(ModItems.rune, 1, 2), new ItemStack(ModItems.rune, 1, 1), new ItemStack(ModItems.manaResource, 1, 6));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_BUBBELL), "petalCyan", "petalCyan", "petalLightBlue", "petalLightBlue", "petalBlue", "petalBlue", new ItemStack(ModItems.rune, 1, 0), new ItemStack(ModItems.rune, 1, 5), new ItemStack(ModItems.manaResource, 1, 8));
        BotaniaHelper.addPetalRecipe(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_SOLEGNOLIA), "petalBrown", "petalBrown", "petalRed", "petalBlue", new ItemStack(ModItems.manaResource, 1, 6));
    }
}

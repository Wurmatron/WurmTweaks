package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import com.lulan.shincolle.init.ModBlocks;
import com.lulan.shincolle.init.ModItems;
import cpw.mods.fml.common.Optional;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.blocks.WurmTweaksBlocks;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeChecker;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.techreborn.TechRebornHelper;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

public class ShinColleRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		@Optional.Method (modid = "shincolle")
		public static void addRecipes () {
				r.addShapeless(new ItemStack(ModItems.AbyssMetal), TFCItems.wroughtIronIngot, ModItems.Grudge);
				r.addShapeless(new ItemStack(ModItems.BucketRepair), TFCItems.redSteelBucketEmpty, new ItemStack(ModItems.AbyssMetal));
				r.addShapeless(new ItemStack(ModItems.BucketRepair), TFCItems.blueSteelBucketEmpty, new ItemStack(ModItems.AbyssMetal));
				r.addShapeless(new ItemStack(ModItems.Ammo, 9, 0), new ItemStack(ModItems.Ammo, 1, 1));
				r.addShapeless(new ItemStack(ModItems.Ammo, 9, 2), new ItemStack(ModItems.Ammo, 1, 3));
				r.addShapeless(new ItemStack(ModItems.AbyssNugget, 9, 0), new ItemStack(ModItems.AbyssMetal, 1, 0));
				r.addShapeless(new ItemStack(ModItems.AbyssMetal, 9, 0), new ItemStack(ModBlocks.BlockAbyssium));
				r.addShapeless(new ItemStack(ModBlocks.BlockAbyssium), WurmTweaksBlocks.blockWroughtIron, new ItemStack(ModBlocks.BlockGrudge));
				r.addShapeless(new ItemStack(ModItems.Grudge, 9, 0), new ItemStack(ModBlocks.BlockGrudge));
				r.addShapeless(new ItemStack(ModBlocks.BlockGrudge, 9, 0), new ItemStack(ModBlocks.BlockGrudgeHeavy));
				r.addShapeless(new ItemStack(ModItems.AbyssMetal, 4, 1), new ItemStack(ModBlocks.BlockPolymetalGravel));
				r.addShapeless(new ItemStack(ModItems.AbyssMetal, 9, 1), new ItemStack(ModBlocks.BlockPolymetal));
				r.addShapeless(new ItemStack(ModBlocks.BlockPolymetalGravel), new ItemStack(ModItems.AbyssMetal, 1, 1), new ItemStack(ModItems.AbyssMetal, 1, 1), new ItemStack(ModItems.AbyssMetal, 1, 1), new ItemStack(ModItems.AbyssMetal, 1, 1));
				r.addShapeless(new ItemStack(ModItems.AbyssMetal, 5, 1), new ItemStack(ModItems.ToyAirplane));
				r.addShapeless(new ItemStack(ModItems.AbyssNugget, 9, 1), new ItemStack(ModItems.AbyssMetal, 1, 1));
				r.addShapeless(new ItemStack(ModItems.InstantConMat, 8), new ItemStack(ModItems.KaitaiHammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.ShipSpawnEgg, 1, 0));
				r.addShapeless(new ItemStack(ModItems.InstantConMat, 32), new ItemStack(ModItems.KaitaiHammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.ShipSpawnEgg, 1, 1));
				r.addShapeless(new ItemStack(ModItems.ModernKit), new ItemStack(ModItems.KaitaiHammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.ShipSpawnEgg, 1, 0), new ItemStack(ModItems.ShipSpawnEgg, 1, 0), new ItemStack(ModItems.ShipSpawnEgg, 1, 0), new ItemStack(ModItems.ShipSpawnEgg, 1, 0), new ItemStack(ModItems.ShipSpawnEgg, 1, 0), new ItemStack(ModItems.ShipSpawnEgg, 1, 0), new ItemStack(ModItems.ShipSpawnEgg, 1, 0), new ItemStack(ModItems.ShipSpawnEgg, 1, 0));
				r.addShapeless(new ItemStack(ModItems.OwnerPaper), new ItemStack(ModItems.Grudge), Items.paper);
				r.addShapeless(new ItemStack(ModBlocks.BlockWaypoint, 16), new ItemStack(ModItems.Grudge), "packStick");
				r.addShapeless(new ItemStack(ModItems.CombatRation, 1, 0), "packGrain", Items.golden_carrot, new ItemStack(ModItems.Grudge), TFCHelper.getFood(TFCItems.riceWhole, 160));
				r.addShapeless(new ItemStack(ModItems.CombatRation, 1, 1), new ItemStack(ModItems.CombatRation, 1, 0), ModBlocks.BlockGrudge, ModBlocks.BlockPolymetalGravel);
				r.addShapeless(new ItemStack(ModItems.CombatRation, 1, 2), TFCHelper.getFood(TFCItems.fishRaw, 160), Items.golden_carrot, new ItemStack(ModItems.Grudge), TFCHelper.getFood(TFCItems.riceWhole, 160));
				r.addShapeless(new ItemStack(ModItems.CombatRation, 1, 2), "packMeat", Items.golden_carrot, new ItemStack(ModItems.Grudge), TFCHelper.getFood(TFCItems.riceWhole, 160));
				r.addShapeless(new ItemStack(ModItems.CombatRation, 1, 2), TFCHelper.getFood(TFCItems.fishRaw, 160), Items.golden_carrot, new ItemStack(ModItems.Grudge), TFCHelper.getFood(TFCItems.riceWhole, 160));
				r.addShapeless(new ItemStack(ModItems.CombatRation, 1, 2), Items.cooked_porkchop, Items.golden_carrot, new ItemStack(ModItems.Grudge), TFCHelper.getFood(TFCItems.riceWhole, 160));
				r.addShapeless(new ItemStack(ModItems.CombatRation, 1, 3), new ItemStack(ModItems.CombatRation, 1, 2), ModBlocks.BlockGrudge, ModBlocks.BlockPolymetalGravel);
				r.addShapeless(new ItemStack(ModItems.CombatRation, 1, 4), Items.snowball, Items.snowball, Items.snowball, Items.snowball, TFCHelper.getFood(TFCItems.cheese, 160), ModItems.Grudge);
				r.addShapeless(new ItemStack(ModItems.CombatRation, 1, 5), new ItemStack(ModItems.CombatRation, 1, 4), ModBlocks.BlockGrudge);
				r.addShaped(new ItemStack(ModItems.Ammo, 8, 0), "iii", "igi", "ipi", 'i', TFCItems.copperIngot, 'g', new ItemStack(ModItems.Grudge), 'p', Items.gunpowder);
				r.addShaped(new ItemStack(ModItems.Ammo, 8, 0), "iii", "igi", "ipi", 'i', TFCItems.tinIngot, 'g', new ItemStack(ModItems.Grudge), 'p', Items.gunpowder);
				r.addShaped(new ItemStack(ModItems.Ammo, 16, 0), "iii", "igi", "ipi", 'i', TFCItems.bismuthIngot, 'g', new ItemStack(ModItems.Grudge), 'p', Items.gunpowder);
				r.addShaped(new ItemStack(ModItems.Ammo, 16, 0), "iii", "igi", "ipi", 'i', TFCItems.leadIngot, 'g', new ItemStack(ModItems.Grudge), 'p', Items.gunpowder);
				r.addShaped(new ItemStack(ModItems.Ammo, 8, 0), "iii", "igi", "ipi", 'i', TFCItems.bronzeIngot, 'g', new ItemStack(ModItems.Grudge), 'p', Items.gunpowder);
				r.addShaped(new ItemStack(ModItems.Ammo, 32, 0), "iii", "igi", "ipi", 'i', new ItemStack(ModItems.AbyssMetal, 1, 0), 'g', new ItemStack(ModItems.Grudge), 'p', Items.gunpowder);
				r.addShaped(new ItemStack(ModItems.Ammo, 32, 0), "iii", "igi", "ipi", 'i', TFCItems.goldIngot, 'g', new ItemStack(ModItems.Grudge), 'p', Items.gunpowder);
				r.addShaped(new ItemStack(ModItems.Ammo, 32, 0), "iii", "igi", "ipi", 'i', TFCItems.steelIngot, 'g', new ItemStack(ModItems.Grudge), 'p', Items.gunpowder);
				r.addShaped(new ItemStack(ModItems.Ammo, 32, 0), "iii", "igi", "ipi", 'i', TFCItems.silverIngot, 'g', new ItemStack(ModItems.Grudge), 'p', Items.gunpowder);
				r.addShaped(new ItemStack(ModItems.Ammo, 64, 0), "iii", "igi", "ipi", 'i', "packGem", 'g', new ItemStack(ModItems.Grudge), 'p', Items.gunpowder);
				r.addShaped(new ItemStack(ModItems.Ammo, 64, 0), "iii", "igi", "ipi", 'i', TFCItems.blackSteelIngot, 'g', new ItemStack(ModItems.Grudge), 'p', Items.gunpowder);
				r.add3X(new ItemStack(ModItems.Ammo, 1, 1), new ItemStack(ModItems.Ammo, 1, 0));
				r.add3X(new ItemStack(ModItems.Ammo, 1, 3), new ItemStack(ModItems.Ammo, 1, 2));
				r.addShaped(new ItemStack(ModBlocks.BlockAbyssium), "aaa", "aaa", "aaa", 'a', new ItemStack(ModItems.AbyssMetal, 1, 0));
				r.addShaped(new ItemStack(ModItems.AbyssMetal, 1, 0), "aaa", "aaa", "aaa", 'a', new ItemStack(ModItems.AbyssNugget, 1, 0));
				r.addShaped(new ItemStack(ModBlocks.BlockGrudge), "aaa", "aaa", "aaa", 'a', new ItemStack(ModItems.Grudge));
				r.addShaped(new ItemStack(ModBlocks.BlockGrudgeHeavy), "aaa", "aaa", "aaa", 'a', new ItemStack(ModBlocks.BlockGrudge));
				r.addShaped(new ItemStack(ModBlocks.BlockPolymetal), "aaa", "aaa", "aaa", 'a', new ItemStack(ModItems.AbyssMetal, 1, 1));
				r.addShaped(new ItemStack(ModItems.AbyssMetal, 1, 1), "aaa", "aaa", "aaa", 'a', new ItemStack(ModItems.AbyssNugget, 1, 1));
				r.addShaped(new ItemStack(ModBlocks.BlockDesk), "abc", "ooo", "o o", 'a', new ItemStack(ModBlocks.BlockDesk), 'b', new ItemStack(ModItems.DeskItemBook), 'c', Blocks.wool, 'o', Blocks.obsidian);
				r.addShaped(new ItemStack(ModItems.DeskItemBook), "ggg", "gbg", "ggg", 'g', new ItemStack(ModItems.Grudge), 'b', Items.writable_book);
				r.addShaped(new ItemStack(ModItems.DeskItemRadar), "ggg", "gbg", "ggg", 'g', new ItemStack(ModItems.Grudge), 'b', Items.compass);
				r.addBasicMachineRecipe(new ItemStack(ModBlocks.BlockSmallShipyard), WurmTweaksItems.gearMixedSheet, WurmTweaksItems.ingotTitanium, WurmTweaksItems.ingotGreenSteel, WurmTweaksItems.itemMachineFrame);
				r.addShaped(new ItemStack(ModItems.MarriageRing), "asa", "a a", "aaa", 's', Items.nether_star, 'a', new ItemStack(ModItems.AbyssMetal, 1, 0));
				r.addShaped(new ItemStack(ModItems.KaitaiHammer), "aaa", "aaa", " s ", 's', "packStick", 'a', new ItemStack(ModItems.AbyssMetal, 1, 0));
				r.addShaped(new ItemStack(ModItems.PointerItem), "  g", " p ", "p  ", 'g', new ItemStack(ModBlocks.BlockGrudge), 'p', new ItemStack(ModItems.AbyssMetal, 1, 1));
				r.addShaped(new ItemStack(ModItems.ToyAirplane), " a ", "aaa", " a ", 'a', new ItemStack(ModItems.AbyssMetal, 1, 1));
				r.addShaped(new ItemStack(ModItems.RepairGoddess, 1, 0), "hgh", "gdg", "hgh", 'd', "packGemExquisite", 'g', new ItemStack(ModBlocks.BlockGrudge), 'h', new ItemStack(ModBlocks.BlockGrudgeHeavy));
				r.addShaped(new ItemStack(ModItems.RepairGoddess, 1, 0), "ghg", "hdh", "ghg", 'd', "packGemExquisite", 'g', new ItemStack(ModBlocks.BlockGrudge), 'h', new ItemStack(ModBlocks.BlockGrudgeHeavy));
				r.addShaped(new ItemStack(ModItems.TargetWrench), "a a", "aaa", " a ", 'a', new ItemStack(ModItems.AbyssMetal, 1, 0));
				r.addShaped(new ItemStack(ModBlocks.BlockVolBlock), "gog", "olo", "gog", 'g', new ItemStack(ModBlocks.BlockGrudgeHeavy), 'l', Items.lava_bucket, 'o', Blocks.obsidian);
				r.addShaped(new ItemStack(ModBlocks.BlockVolBlock), "gog", "olo", "gog", 'g', Blocks.obsidian, 'l', Items.lava_bucket, 'o', new ItemStack(ModBlocks.BlockGrudgeHeavy));
				r.addShaped(new ItemStack(ModBlocks.BlockVolCore), "gog", "olo", "gog", 'g', new ItemStack(ModBlocks.BlockVolCore), 'l', Items.lava_bucket, 'o', Blocks.obsidian);
				r.addShaped(new ItemStack(ModBlocks.BlockVolCore), "gog", "olo", "gog", 'g', Blocks.obsidian, 'l', Items.lava_bucket, 'o', ModBlocks.BlockVolCore);
				r.addShaped(new ItemStack(ModBlocks.BlockFrame, 16), "a a", " o ", "a a", 'o', Blocks.obsidian, 'a', new ItemStack(ModItems.AbyssMetal, 1, 0));
				r.addShaped(new ItemStack(ModBlocks.BlockCrane), "aaa", "aga", "apa", 'a', new ItemStack(ModItems.AbyssMetal, 1, 0), 'p', Blocks.piston, 'g', new ItemStack(ModBlocks.BlockGrudge));
				r.addShaped(new ItemStack(ModItems.CombatRation, 1, 0), "www", "bgc", "www", 'b', "packGrain", 'c', Items.golden_carrot, 'g', new ItemStack(ModItems.Grudge), 'w', "packGrain");
				r.addShaped(new ItemStack(ModItems.CombatRation, 1, 2), "www", "bgc", "www", 'b', "packMeat", 'c', Items.golden_carrot, 'g', new ItemStack(ModItems.Grudge), 'w', "packGrain");
				r.addShaped(new ItemStack(ModItems.CombatRation, 1, 2), "www", "bgc", "www", 'b', "packMeat", 'c', Items.golden_carrot, 'g', new ItemStack(ModItems.Grudge), 'w', "packGrain");
				r.addShaped(new ItemStack(ModItems.CombatRation, 1, 2), "www", "bgc", "www", 'b', "packMeat", 'c', Items.golden_carrot, 'g', new ItemStack(ModItems.Grudge), 'w', "packGrain");
				r.addShaped(new ItemStack(ModItems.CombatRation, 1, 2), "www", "bgc", "www", 'b', "packMeat", 'c', Items.golden_carrot, 'g', new ItemStack(ModItems.Grudge), 'w', "packGrain");
				if (RecipeChecker.modExists("techreborn")) {
						addCentrifugeRecipes();
						addElectrolyzerRecipes();
				}
		}

		@Optional.Method (modid = "techreborn")
		private static void addCentrifugeRecipes () {
				TechRebornHelper.addCentrifugeRecipe(WurmTweaksItems.itemMixedSheet, null, new ItemStack(ModItems.AbyssMetal, 4, 1), null, null, null, 800, 128);
		}

		@Optional.Method (modid = "techreborn")
		private static void addElectrolyzerRecipes () {
				TechRebornHelper.addIndustrialElectrolyzerRecipe(WurmTweaksItems.itemMixedSheet, null, new ItemStack(ModItems.AbyssMetal, 4, 1), null, null, null, 800, 128);
		}
}

package wurmcraft.wurmatron.common.handler;

import advsolar.common.AdvancedSolarPanel;
import am2.items.ItemsCommonProxy;
import codechicken.wirelessredstone.addons.WirelessRedstoneAddons;
import com.bioxx.tfc.api.TFCItems;
import com.lulan.shincolle.init.ModBlocks;
import com.lulan.shincolle.init.ModItems;
import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.ironchest.IronChest;
import mrtjp.projectred.core.PartDefs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.oredict.OreDictionary;
import powercrystals.minefactoryreloaded.setup.MFRThings;
import thaumcraft.api.internal.WeightedRandomLoot;
import thaumcraft.common.config.ConfigItems;

import java.util.Random;

public class LootHandler {

		public static void init () {
				WeightedRandomLoot.lootBagCommon.clear();
				WeightedRandomLoot.lootBagRare.clear();
				WeightedRandomLoot.lootBagUncommon.clear();
				for (WeightedRandomChestContent mineshaft : ChestGenHooks.getInfo("mineshaftCorridor").getItems(new Random()))
						ChestGenHooks.getInfo("mineshaftCorridor").removeItem(mineshaft.theItemId);
				for (WeightedRandomChestContent pyramidDeserty : ChestGenHooks.getInfo("pyramidDesertyChest").getItems(new Random()))
						ChestGenHooks.getInfo("pyramidDeserty").removeItem(pyramidDeserty.theItemId);
				for (WeightedRandomChestContent pyramidJungle : ChestGenHooks.getInfo("pyramidJungleChest").getItems(new Random()))
						ChestGenHooks.getInfo("pyramidJungleChest").removeItem(pyramidJungle.theItemId);
				for (WeightedRandomChestContent pyramidJungleDispenser : ChestGenHooks.getInfo("pyramidJungleDispenser").getItems(new Random()))
						ChestGenHooks.getInfo("pyramidJungleDispenser").removeItem(pyramidJungleDispenser.theItemId);
				for (WeightedRandomChestContent strongholdCorridor : ChestGenHooks.getInfo("strongholdCorridor").getItems(new Random()))
						ChestGenHooks.getInfo("strongholdCorridor").removeItem(strongholdCorridor.theItemId);
				for (WeightedRandomChestContent strongholdLibrary : ChestGenHooks.getInfo("strongholdLibrary").getItems(new Random()))
						ChestGenHooks.getInfo("strongholdLibrary").removeItem(strongholdLibrary.theItemId);
				for (WeightedRandomChestContent strongholdCrossing : ChestGenHooks.getInfo("strongholdCrossing").getItems(new Random()))
						ChestGenHooks.getInfo("strongholdCrossing").removeItem(strongholdCrossing.theItemId);
				for (WeightedRandomChestContent villageBlacksmith : ChestGenHooks.getInfo("villageBlacksmith").getItems(new Random()))
						ChestGenHooks.getInfo("villageBlacksmith").removeItem(villageBlacksmith.theItemId);
				for (WeightedRandomChestContent bonusChest : ChestGenHooks.getInfo("bonusChest").getItems(new Random()))
						ChestGenHooks.getInfo("bonusChest").removeItem(bonusChest.theItemId);
				for (WeightedRandomChestContent dungeonChest : ChestGenHooks.getInfo("dungeonChest").getItems(new Random()))
						ChestGenHooks.getInfo("dungeonChest").removeItem(dungeonChest.theItemId);
				// TO Keep Game from Crashing
				addDungeonLoot("villageBlacksmith", new ItemStack(Items.book), 1, 1, 1);
				addDungeonLoot("strongholdCrossing", new ItemStack(Items.book), 1, 1, 1);
				addDungeonLoot("strongholdLibrary", new ItemStack(Items.book), 1, 1, 1);
				addDungeonLoot("strongholdCorridor", new ItemStack(Items.book), 1, 1, 1);
				addDungeonLoot("pyramidJungleDispenser", new ItemStack(Items.book), 1, 1, 1);
				addDungeonLoot("pyramidJungleChest", new ItemStack(Items.book), 1, 1, 1);
				addDungeonLoot("pyramidDeserty", new ItemStack(Items.book), 1, 1, 1);
				addDungeonLoot("mineshaftCorridor", new ItemStack(Items.book), 1, 1, 1);
				// Bonus Chest Loot
				addDungeonLoot("bonusChest", new ItemStack(TFCItems.copperPick, 1, 0), 1, 1, 20);
				addDungeonLoot("bonusChest", new ItemStack(TFCItems.copperAxe, 1, 0), 1, 1, 18);
				addDungeonLoot("bonusChest", new ItemStack(TFCItems.copperSaw, 1, 0), 1, 1, 16);
				addDungeonLoot("bonusChest", new ItemStack(TFCItems.copperShovel, 1, 0), 1, 1, 22);
				addDungeonLoot("bonusChest", new ItemStack(TFCItems.copperSword, 1, 0), 1, 1, 5);
				addDungeonLoot("bonusChest", new ItemStack(TFCItems.smallOreChunk, 1, 0), 6, 15, 3);
				for (ItemStack bread : OreDictionary.getOres("packBread"))
						addDungeonLoot("bonusChest", bread, 1, 1, 20);
				addDungeonLoot("bonusChest", new ItemStack(TFCItems.potteryJug, 1, 2), 1, 1, 6);
				addDungeonLoot("bonusChest", new ItemStack(TFCItems.potterySmallVessel, 1, 1), 1, 1, 12);
				// Dungeon Loot
				addDungeonLoot("dungeonChest", new ItemStack(ItemsCommonProxy.rune, 1, 17), 1, 1, 45);
				addDungeonLoot("dungeonChest", new ItemStack(ItemsCommonProxy.rune, 1, 18), 1, 1, 35);
				addDungeonLoot("dungeonChest", new ItemStack(ItemsCommonProxy.rune, 1, 19), 1, 1, 25);
				for (int i = 0; i < 10; i++)
						addDungeonLoot("dungeonChest", new ItemStack(ItemsCommonProxy.bookAffinity, 1, i), 1, 1, 2);
				addDungeonLoot("dungeonChest", new ItemStack(ConfigItems.itemResource, 1, 9), 1, 6, 120);
				addDungeonLoot("dungeonChest", PartDefs.WHITEILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.ORANGEILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.MAGENTAILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.LIGHTBLUEILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.YELLOWILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.LIMEILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.PINKILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.GREYILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.LIGHTGREYILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.CYANILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.PURPLEILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.BLUEILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.BROWNILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.GREENILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.REDILLUMAR().makeStack(), 1, 18, 200);
				addDungeonLoot("dungeonChest", PartDefs.BLACKILLUMAR().makeStack(), 1, 18, 200);
				for (int t = 0; t < 10; t++)
						addDungeonLoot("dungeonChest", new ItemStack(ItemsCommonProxy.bookAffinity, 1, t), 1, 1, 1);
				addDungeonLoot("dungeonChest", new ItemStack(IronChest.ironChestBlock, 1, 3), 1, 1, 200);
				addDungeonLoot("dungeonChest", new ItemStack(IronChest.ironChestBlock, 1, 0), 1, 1, 50);
				addDungeonLoot("dungeonChest", new ItemStack(MFRThings.rubberSaplingItem, 1, 0), 1, 3, 100);
				addDungeonLoot("dungeonChest", new ItemStack(MFRThings.rubberSaplingItem, 1, 1), 1, 1, 50);
				addDungeonLoot("dungeonChest", new ItemStack(MFRThings.rubberSaplingItem, 1, 2), 1, 1, 10);
				addDungeonLoot("dungeonChest", new ItemStack(MFRThings.rubberSaplingItem, 1, 3), 1, 1, 1);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.leather, 1, 0), 1, 12, 250);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.coal, 1, 0), 4, 48, 200);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.coal, 1, 1), 8, 64, 150);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.jute), 3, 32, 200);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.bismuthBronzeJavelinHead), 1, 1, 50);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.blackBronzeJavelinHead), 1, 1, 40);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.wroughtIronJavelinHead), 1, 1, 30);
				addDungeonLoot("dungeonChest", new ItemStack(ModBlocks.BlockGrudge), 1, 5, 80);
				addDungeonLoot("dungeonChest", new ItemStack(ModItems.DeskItemBook), 1, 1, 100);
				addDungeonLoot("dungeonChest", new ItemStack(ModItems.InstantConMat), 1, 24, 50);
				addDungeonLoot("dungeonChest", new ItemStack(ModItems.ModernKit), 1, 1, 2);
				addDungeonLoot("dungeonChest", new ItemStack(WirelessRedstoneAddons.rep), 1, 3, 2);
				addDungeonLoot("dungeonChest", new ItemStack(ConfigItems.itemLootbag, 1, 0), 1, 1, 10);
				addDungeonLoot("dungeonChest", new ItemStack(ConfigItems.itemLootbag, 1, 1), 1, 1, 5);
				addDungeonLoot("dungeonChest", new ItemStack(ConfigItems.itemLootbag, 1, 2), 1, 1, 1);
				addDungeonLoot("dungeonChest", new ItemStack(MFRThings.safariNetSingleItem), 1, 1, 250);
				addDungeonLoot("dungeonChest", new ItemStack(ExtraUtils.goldenLasso, 1, 0), 1, 1, 40);
				addDungeonLoot("dungeonChest", new ItemStack(ExtraUtils.enderLily, 1, 0), 1, 24, 10);
				for (ItemStack seeds : OreDictionary.getOres("packSeed"))
						addDungeonLoot("dungeonChest", seeds, 1, 1, 10);
				for (ItemStack seeds : OreDictionary.getOres("packMeat"))
						addDungeonLoot("dungeonChest", seeds, 1, 1, 20);
				for (ItemStack seeds : OreDictionary.getOres("packFruit"))
						addDungeonLoot("dungeonChest", seeds, 1, 1, 20);
				for (ItemStack seeds : OreDictionary.getOres("packGrain"))
						addDungeonLoot("dungeonChest", seeds, 1, 1, 20);
				for (ItemStack seeds : OreDictionary.getOres("packVegtable"))
						addDungeonLoot("dungeonChest", seeds, 1, 1, 20);
				addDungeonLoot("dungeonChest", AdvancedSolarPanel.itemSunnariumPart, 1, 4, 100);
				addDungeonLoot("dungeonChest", new ItemStack(Items.redstone), 1, 36, 25);
				addDungeonLoot("dungeonChest", new ItemStack(Items.glowstone_dust), 1, 36, 50);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.wool), 1, 3, 25);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.potterySmallVessel, 1, 1), 1, 8, 20);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.potterySmallVessel, 1, 1), 1, 8, 20);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.bismuthBronzeKnifeHead, 1, 0), 1, 1, 30);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.blackBronzeKnifeHead, 1, 0), 1, 1, 30);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.bronzeKnifeHead, 1, 0), 1, 1, 30);
				addDungeonLoot("dungeonChest", new ItemStack(TFCItems.wroughtIronKnifeHead, 1, 0), 1, 1, 50);
		}

		public static void addLootBagLoot (int type, ItemStack stack, int weight) {
				if (type == 0)
						WeightedRandomLoot.lootBagCommon.add(new WeightedRandomLoot(stack, weight));
				if (type == 1)
						WeightedRandomLoot.lootBagUncommon.add(new WeightedRandomLoot(stack, weight));
				if (type == 2)
						WeightedRandomLoot.lootBagRare.add(new WeightedRandomLoot(stack, weight));
		}

		public static void addDungeonLoot (String type, ItemStack item, int min, int max, int rarity) {
				ChestGenHooks.addItem(type, new WeightedRandomChestContent(item, min, max, rarity));
		}
}

package wurmcraft.wurmatron.common.items;

import com.bioxx.tfc.api.Enums.EnumFoodGroup;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;

import java.util.ArrayList;
import java.util.HashMap;

public class WTItems {

		public static ArrayList<String> itemMaterialNames = new ArrayList<String>();
		public static ArrayList<String> itemSpecialNames = new ArrayList<String>();
		public static ArrayList<String> itemBasicFoodNames = new ArrayList<String>();
		public static ArrayList<String> itemPillNames = new ArrayList<String>();

		public static HashMap<String, EnumChatFormatting> itemSpecialColors = new HashMap<String, EnumChatFormatting>();
		public static HashMap<String, EnumFoodGroup[]> itemBasicFoodGroups = new HashMap<String, EnumFoodGroup[]>();
		public static HashMap<String, EnumFoodGroup[]> itemPillFoodGroups = new HashMap<String, EnumFoodGroup[]>();

		public static Item itemMaterial;
		public static Item itemSpecial;
		public static Item itemBasicFood;
		public static Item itemPill;
		public static Item creditBismuth;
		public static Item creditCopper;
		public static Item creditGold;
		public static Item creditIron;
		public static Item creditLead;
		public static Item creditNickel;
		public static Item creditPlatinum;
		public static Item creditSilver;
		public static Item creditTin;
		public static Item creditZinc;

		public static void registerItems () {
				itemMaterialNames.add("solarCore");
				itemMaterialNames.add("craftingCore");
				itemMaterialNames.add("greenSteel");
				itemMaterialNames.add("energyReactor");
				itemMaterialNames.add("mixedSheet");
				itemMaterialNames.add("pinkSteel");
				itemMaterialNames.add("yellowSteel");
				itemMaterialNames.add("orangeSteel");
				itemMaterialNames.add("purpleSteel");
				itemMaterialNames.add("cyanSteel");
				itemMaterialNames.add("brownSteel");
				itemMaterialNames.add("graySteel");
				itemMaterialNames.add("rainbowSteel");
				itemMaterialNames.add("magicChunk");
				itemMaterialNames.add("quantumCore");
				itemMaterialNames.add("quantumSingularity");
				itemMaterialNames.add("quantumFoam");
				itemMaterialNames.add("halfium");
				itemMaterialNames.add("titanium");
				itemMaterialNames.add("francium");
				itemMaterialNames.add("autocore");
				itemMaterialNames.add("radiationShielding");
				itemMaterialNames.add("stableMagicEssence");
				itemMaterialNames.add("bloodInfused");
				itemMaterialNames.add("natureCore");
				itemMaterialNames.add("natureCoreMK2");
				itemMaterialNames.add("antimatter");
				itemMaterialNames.add("engineCoil");
				itemMaterialNames.add("quarryCore");
				itemMaterialNames.add("geatMixedSheet");
				itemMaterialNames.add("miningCore");
				itemMaterialNames.add("refiningModule");
				itemMaterialNames.add("computationalCore");
				itemMaterialNames.add("machineFrame");
				itemMaterialNames.add("spaceModule");
				itemMaterialNames.add("unstableMatter");
				itemMaterialNames.add("jetpackParts");
				itemMaterialNames.add("electroMagneticShielding");
				itemMaterialNames.add("electroShielding");
				itemMaterialNames.add("wandParts");
				registerItem(itemMaterial = new ItemMaterial(itemMaterialNames), "itemMaterial");
				itemSpecialColors.put("creativeParts", EnumChatFormatting.DARK_PURPLE);
				itemSpecialColors.put("redMatter", EnumChatFormatting.DARK_RED);
				itemSpecialColors.put("darkMatter", EnumChatFormatting.GRAY);
				itemSpecialColors.put("darkMatter", EnumChatFormatting.DARK_PURPLE);
				itemSpecialNames.add("darkMatter");
				itemSpecialNames.add("redMatter");
				itemSpecialNames.add("creativeParts");
				itemSpecialNames.add("creativePartsEnergy");
				registerItem(itemSpecial = new ItemSpecial(itemSpecialNames, itemSpecialColors), "itemSpecial");
				itemBasicFoodGroups.put("foodFruit", new EnumFoodGroup[] {EnumFoodGroup.Fruit});
				itemBasicFoodGroups.put("foodGrain", new EnumFoodGroup[] {EnumFoodGroup.Grain});
				itemBasicFoodGroups.put("foodProtein", new EnumFoodGroup[] {EnumFoodGroup.Protein});
				itemBasicFoodGroups.put("foodVegetable", new EnumFoodGroup[] {EnumFoodGroup.Vegetable});
				itemBasicFoodGroups.put("foodDairy", new EnumFoodGroup[] {EnumFoodGroup.Dairy});
				itemBasicFoodGroups.put("humanSoul", new EnumFoodGroup[] {EnumFoodGroup.Protein});
				itemBasicFoodGroups.put("melonBread", new EnumFoodGroup[] {EnumFoodGroup.Grain});
				itemBasicFoodNames.add("foodFruit");
				itemBasicFoodNames.add("foodGrain");
				itemBasicFoodNames.add("foodProtein");
				itemBasicFoodNames.add("foodVegetable");
				itemBasicFoodNames.add("foodDairy");
				itemBasicFoodNames.add("humanSoul");
				itemBasicFoodNames.add("melonBread");
				registerItem(itemBasicFood = new ItemBasicTFCFood(itemBasicFoodNames, itemBasicFoodGroups), "iemBasicFood");
				itemPillFoodGroups.put("pillFruit", new EnumFoodGroup[] {EnumFoodGroup.Fruit});
				itemPillFoodGroups.put("pillGrain", new EnumFoodGroup[] {EnumFoodGroup.Grain});
				itemPillFoodGroups.put("pillProtein", new EnumFoodGroup[] {EnumFoodGroup.Protein});
				itemPillFoodGroups.put("pillVegetable", new EnumFoodGroup[] {EnumFoodGroup.Vegetable});
				itemPillFoodGroups.put("pillDairy", new EnumFoodGroup[] {EnumFoodGroup.Dairy});
				itemPillFoodGroups.put("pillAll", new EnumFoodGroup[] {EnumFoodGroup.Dairy, EnumFoodGroup.Fruit, EnumFoodGroup.Grain, EnumFoodGroup.Protein, EnumFoodGroup.Vegetable});
				itemPillNames.add("pillFruit");
				itemPillNames.add("pillGrain");
				itemPillNames.add("pillProtein");
				itemPillNames.add("pillVegetable");
				itemPillNames.add("pillDairy");
				itemPillNames.add("pillAll");
				registerItem(itemPill = new ItemPill(itemPillNames, itemPillFoodGroups), "itemPill");
				registerItem(creditBismuth = new ItemCredit("bismuthCredit"), "creditBismuth");
				registerItem(creditCopper = new ItemCredit("copperCredit"), "creditCopper");
				registerItem(creditGold = new ItemCredit("goldCredit"), "creditGold");
				registerItem(creditIron = new ItemCredit("ironCredit"), "creditIron");
				registerItem(creditLead = new ItemCredit("leadCredit"), "creditLead");
				registerItem(creditNickel = new ItemCredit("nickelCredit"), "creditNickel");
				registerItem(creditPlatinum = new ItemCredit("platinumCredit"), "creditPlatinum");
				registerItem(creditSilver = new ItemCredit("silverCredit"), "creditSilver");
				registerItem(creditTin = new ItemCredit("tinCredit"), "creditTin");
				registerItem(creditZinc = new ItemCredit("zincCredit"), "creditZinc");
		}

		private static void registerItem (Item item, String name) {
				GameRegistry.registerItem(item, name);
		}
}

package wurmcraft.wurmatron.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class WTItems {

		public static ArrayList<String> itemMaterialNames = new ArrayList<String>();

		public static Item itemMaterial;

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
				registerItem(itemMaterial = new ItemMaterial(itemMaterialNames), "itemMaterial");
		}

		private static void registerItem (Item item, String name) {
				GameRegistry.registerItem(item, name);
		}
}

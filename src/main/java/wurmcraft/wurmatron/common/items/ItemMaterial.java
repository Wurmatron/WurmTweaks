package wurmcraft.wurmatron.common.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.ArrayList;
import java.util.List;

public class ItemMaterial extends Item {

		private static ArrayList<String> itemNames = new ArrayList<String>();
		private IIcon[] icons;

		public ItemMaterial (ArrayList<String> names) {
				setCreativeTab(CreativeTabs.tabMaterials);
				setUnlocalizedName("itemMaterial");
				setHasSubtypes(true);
				itemNames = names;
				icons = new IIcon[itemNames.size() + 1];
		}

		@Override
		public String getItemStackDisplayName (ItemStack stack) {
				return StatCollector.translateToLocal("item." + ItemMaterial.itemNames.get(stack.getItemDamage()) + ".name");
		}

		@Override
		public void registerIcons (IIconRegister iicon) {
				for (int m = 0; m < itemNames.size(); m++)
						icons[m] = iicon.registerIcon(Global.MODID + ":" + itemNames.get(m));
		}

		@Override
		public IIcon getIconFromDamage (int meta) {
				if (meta > itemNames.size() + 1)
						meta = 0;
				return icons[meta];
		}

		@Override
		public void getSubItems (Item item, CreativeTabs tab, List sub) {
				for (int m = 0; m < itemNames.size(); m++)
						sub.add(new ItemStack(this, 1, m));
		}
}

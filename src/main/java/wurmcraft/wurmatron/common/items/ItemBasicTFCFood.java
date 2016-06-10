package wurmcraft.wurmatron.common.items;

import com.bioxx.tfc.Core.Player.FoodStatsTFC;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.api.Enums.EnumFoodGroup;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ItemBasicTFCFood extends Item {

		private static ArrayList<String> foodNames = new ArrayList<String>();
		private static HashMap<String, EnumFoodGroup[]> foodTypes = new HashMap<String, EnumFoodGroup[]>();
		private IIcon[] icons;

		public ItemBasicTFCFood (ArrayList<String> foodNames, HashMap<String, EnumFoodGroup[]> foodTypes) {
				setCreativeTab(CreativeTabs.tabMaterials);
				setUnlocalizedName("itemBasicFood");
				setHasSubtypes(true);
				this.foodNames = foodNames;
				this.foodTypes = foodTypes;
				icons = new IIcon[foodNames.size() + 1];
		}

		@Override
		public String getItemStackDisplayName (ItemStack stack) {
				return StatCollector.translateToLocal("item." + foodNames.get(stack.getItemDamage()) + ".name");
		}

		@Override
		public void registerIcons (IIconRegister iicon) {
				for (int m = 0; m < foodNames.size(); m++)
						icons[m] = iicon.registerIcon(Global.MODID + ":" + foodNames.get(m));
		}

		@Override
		public IIcon getIconFromDamage (int meta) {
				if (meta > foodNames.size() + 1)
						meta = 0;
				return icons[meta];
		}

		@Override
		public void getSubItems (Item item, CreativeTabs tab, List sub) {
				for (int m = 0; m < foodNames.size(); m++)
						sub.add(new ItemStack(this, 1, m));
		}

		@Override
		public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean adv) {
				for (int g = 0; g < foodTypes.get(foodNames.get(stack.getItemDamage())).length; g++) {
						EnumFoodGroup group = foodTypes.get(foodNames.get(stack.getItemDamage()))[g];
						list.add(getColorFromFoodType(group) + getStringFromFoodType(group));
				}
		}

		private EnumChatFormatting getColorFromFoodType (EnumFoodGroup group) {
				if (group.equals(EnumFoodGroup.Dairy))
						return EnumChatFormatting.WHITE;
				if (group.equals(EnumFoodGroup.Fruit))
						return EnumChatFormatting.DARK_PURPLE;
				if (group.equals(EnumFoodGroup.Grain))
						return EnumChatFormatting.YELLOW;
				if (group.equals(EnumFoodGroup.Protein))
						return EnumChatFormatting.DARK_RED;
				if (group.equals(EnumFoodGroup.Vegetable))
						return EnumChatFormatting.DARK_GREEN;
				return EnumChatFormatting.GRAY;
		}

		private String getStringFromFoodType (EnumFoodGroup group) {
				if (group.equals(EnumFoodGroup.Dairy))
						return "Dairy";
				if (group.equals(EnumFoodGroup.Fruit))
						return "Fruit";
				if (group.equals(EnumFoodGroup.Grain))
						return "Grain";
				if (group.equals(EnumFoodGroup.Protein))
						return "Protein";
				if (group.equals(EnumFoodGroup.Vegetable))
						return "Vegetable";
				return "none";
		}

		@Override
		public ItemStack onItemRightClick (ItemStack stack, World world, EntityPlayer player) {
				FoodStatsTFC foodstats = TFC_Core.getPlayerFoodStats(player);
				if (foodstats.needFood())
						player.setItemInUse(stack, 32);
				return stack;
		}

		@Override
		public ItemStack onEaten (ItemStack stack, World world, EntityPlayer player) {
				FoodStatsTFC foodstats = TFC_Core.getPlayerFoodStats(player);
				if (!world.isRemote) {
						float eatAmount = foodstats.getMaxStomach(foodstats.player) - foodstats.stomachLevel - 20f > 0 ? 20f : foodstats.getMaxStomach(foodstats.player);
						for (int g = 0; g < foodTypes.get(foodNames.get(stack.getItemDamage())).length; g++) {
								foodstats.addNutrition(foodTypes.get(foodNames.get(stack.getItemDamage()))[g], eatAmount);
								foodstats.stomachLevel = +eatAmount;
						}
				}
				world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
				TFC_Core.setPlayerFoodStats(player, foodstats);
				return stack;
		}

		public int getMaxItemUseDuration (ItemStack stack) {
				return 32;
		}

		public EnumAction getItemUseAction (ItemStack stack) {
				return EnumAction.eat;
		}
}

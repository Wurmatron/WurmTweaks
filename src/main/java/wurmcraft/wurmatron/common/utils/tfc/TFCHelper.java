package wurmcraft.wurmatron.common.utils.tfc;

import com.bioxx.tfc.api.TFCBlocks;
import cpw.mods.fml.common.Optional;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class TFCHelper {

    public static final ItemStack[] sand = new ItemStack[] {new ItemStack(TFCBlocks.sand,1,0), new ItemStack(TFCBlocks.sand,1,1), new ItemStack(TFCBlocks.sand,1,2), new ItemStack(TFCBlocks.sand,1,3), new ItemStack(TFCBlocks.sand,1,4), new ItemStack(TFCBlocks.sand,1,5), new ItemStack(TFCBlocks.sand,1,6), new ItemStack(TFCBlocks.sand,1,7), new ItemStack(TFCBlocks.sand,1,8), new ItemStack(TFCBlocks.sand,1,9), new ItemStack(TFCBlocks.sand,1,10), new ItemStack(TFCBlocks.sand,1,11), new ItemStack(TFCBlocks.sand,1,12), new ItemStack(TFCBlocks.sand,1,13), new ItemStack(TFCBlocks.sand,1,14), new ItemStack(TFCBlocks.sand,1,15), new ItemStack(TFCBlocks.sand2,1,0), new ItemStack(TFCBlocks.sand2,1,1), new ItemStack(TFCBlocks.sand2,1,2), new ItemStack(TFCBlocks.sand2,1,3), new ItemStack(TFCBlocks.sand2,1,4)};

    @Optional.Method(modid = "terrafirmacraft")
    public static ItemStack getFood(Item item, float size) {
        ItemStack food = new ItemStack(item, 1, 0);
        food.stackTagCompound = new NBTTagCompound();
        food.stackTagCompound.setFloat("foodDecay", 0f);
        food.stackTagCompound.setFloat("foodWeight", size);
        return food;
    }
}

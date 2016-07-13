package wurmcraft.wurmatron.common.items;

import com.bioxx.tfc.Core.Player.FoodStatsTFC;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Core.TFC_Time;
import com.bioxx.tfc.api.Enums.EnumItemReach;
import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;
import com.bioxx.tfc.api.Interfaces.ISize;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCFluids;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidContainerItem;
import wurmcraft.wurmatron.WurmTweaks;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.List;

public class ItemWaterJug extends Item implements ISize, IFluidContainerItem {

		private int capacity;
		private static final int drainAmount = 333;

		public ItemWaterJug (int size) {
				super();
				setMaxStackSize(1);
				this.capacity = size;
				setMaxDamage(size * drainAmount);
				setMaxStackSize(1);
				setUnlocalizedName("itemJug_" + size);
				setCreativeTab(WurmTweaks.tabWurmTweaks);
		}

		@SideOnly (Side.CLIENT)
		@Override
		public void registerIcons (IIconRegister registerer) {
				this.itemIcon = registerer.registerIcon(Global.MODID + ":" + getUnlocalizedName());
		}

		@Override
		public ItemStack onItemRightClick (ItemStack stack, World world, EntityPlayer player) {
				if (player.capabilities.isCreativeMode)
						return stack;
				if (getFluid(stack) == null && stack.getItemDamage() != (capacity * drainAmount))
						stack.setItemDamage(capacity * drainAmount);
				if (player.isSneaking()) {
						drain(stack, (capacity * drainAmount), true);
						player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA + "You seem to have dumped your jug"));
						return stack;
				}
				MovingObjectPosition mop = getMovingObjectPositionFromPlayer(world, player, true);
				if (mop == null) {
						if (stack.getItemDamage() == (capacity * drainAmount))
								player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Seems to be empty"));
						else
								player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
						return stack;
				} else {
						if (mop.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
								WorldPos wp = findWater(world, mop.blockX, mop.blockY, mop.blockZ, mop.sideHit);
								if (!world.canMineBlock(player, wp.getX(), wp.getY(), wp.getZ()))
										return stack;
								if (!player.canPlayerEdit(wp.getX(), wp.getY(), wp.getZ(), mop.sideHit, stack))
										return stack;
								if (wp.isWater()) {
										if (stack.getItemDamage() > 0) {
												fillJug(world, stack, wp.getX(), wp.getY(), wp.getZ(), (capacity * drainAmount));
												double xHit = mop.hitVec.xCoord;
												double yHit = mop.hitVec.yCoord;
												if (world.getBlockMetadata(wp.getX(), wp.getY(), wp.getZ()) > 0 && mop.sideHit == 1) yHit += 1;
												double zHit = mop.hitVec.zCoord;
												for (int l = 0; l < 5; l++)
														world.spawnParticle("splash", xHit, yHit, zHit, (-0.5F + world.rand.nextFloat()), (-0.5F + world.rand.nextFloat()), (-0.5F + world.rand.nextFloat()));
												world.playSoundAtEntity(player, "random.splash", 0.2F, world.rand.nextFloat() * 0.1F + 0.9F);
										} else {
												player.setItemInUse(stack, stack.getMaxItemUseDuration());
										}
								} else if (!(stack.getItemDamage() == (capacity * drainAmount)))
										player.setItemInUse(stack, getMaxItemUseDuration(stack));
						} else if (mop.typeOfHit == MovingObjectPosition.MovingObjectType.MISS) {
								if (stack.getItemDamage() == (capacity * drainAmount))
										player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Seems to be empty"));
								else
										player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
								return stack;
						} else if (mop.typeOfHit == MovingObjectPosition.MovingObjectType.ENTITY) {
								if (stack.getItemDamage() == (capacity * drainAmount))
										player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Seems to be empty"));
								else
										player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
								return stack;
						}
				}
				return stack;
		}

		@Override
		public ItemStack onEaten (ItemStack stack, World world, EntityPlayer player) {
				if (!world.isRemote && !player.capabilities.isCreativeMode && player instanceof EntityPlayerMP) {
						FluidStack fs = getFluid(stack);
						if (fs != null) {
								EntityPlayerMP p = (EntityPlayerMP) player;
								FoodStatsTFC s = TFC_Core.getPlayerFoodStats(p);
								float maxWater = s.getMaxWater(p);
								int playerFillAmount = (int) maxWater / 2;
								if (fs.getFluid() == TFCFluids.FRESHWATER) {
										s.restoreWater(p, playerFillAmount);
										drain(stack, drainAmount, true);
								} else if (fs.getFluid() == TFCFluids.BEER || fs.getFluid() == TFCFluids.CIDER || fs.getFluid() == TFCFluids.CORNWHISKEY || fs.getFluid() == TFCFluids.RUM || fs.getFluid() == TFCFluids.RYEWHISKEY || fs.getFluid() == TFCFluids.SAKE || fs.getFluid() == TFCFluids.VODKA || fs.getFluid() == TFCFluids.WHISKEY) {
										if (s.needDrink()) {
												s.restoreWater(p, playerFillAmount);
												drain(stack, drainAmount, true);
												int time = world.rand.nextInt(1000) + 400;
												s.consumeAlcohol();
												if (world.rand.nextInt(100) == 0) p.addPotionEffect(new PotionEffect(8, time, 4));
												if (world.rand.nextInt(100) == 0) p.addPotionEffect(new PotionEffect(5, time, 4));
												if (world.rand.nextInt(100) == 0) p.addPotionEffect(new PotionEffect(8, time, 4));
												if (world.rand.nextInt(200) == 0) p.addPotionEffect(new PotionEffect(10, time, 4));
												if (world.rand.nextInt(150) == 0) p.addPotionEffect(new PotionEffect(12, time, 4));
												if (world.rand.nextInt(180) == 0) p.addPotionEffect(new PotionEffect(13, time, 4));
												int levelMod = 250 * p.experienceLevel;
												if (s.soberTime > TFC_Time.getTotalTicks() + 3000 + levelMod) {
														if (s.soberTime > TFC_Time.getTotalTicks() + 5000 + levelMod) {
																if (world.rand.nextInt(4) == 0)
																		p.addPotionEffect(new PotionEffect(18, time, 4));
																if (s.soberTime > TFC_Time.getTotalTicks() + 7000 + levelMod) {
																		if (world.rand.nextInt(2) == 0)
																				p.addPotionEffect(new PotionEffect(15, time, 4));
																		if (s.soberTime > TFC_Time.getTotalTicks() + 8000 + levelMod) {
																				if (world.rand.nextInt(10) == 0)
																						p.addPotionEffect(new PotionEffect(20, time, 4));
																		}
																		if (s.soberTime > TFC_Time.getTotalTicks() + 10000 + levelMod) {
																				s.soberTime = 0;
																				player.attackEntityFrom((new DamageSource("alcohol")).setDamageBypassesArmor().setDamageIsAbsolute(), player.getMaxHealth());
																		}
																}
														}
												}
												TFC_Core.setPlayerFoodStats(player, s);
										}
								}
								if (!s.needDrink())
										world.playSoundAtEntity(p, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
						}
				}
				return stack;
		}

		@Override
		public EnumAction getItemUseAction (ItemStack sac) {
				return EnumAction.drink;
		}

		@Override
		public int getMaxItemUseDuration (ItemStack sac) {
				return 32;
		}

		@Override
		public EnumSize getSize (ItemStack itemStack) {
				return EnumSize.SMALL;
		}

		@Override
		public EnumWeight getWeight (ItemStack itemStack) {
				return EnumWeight.MEDIUM;
		}

		@Override
		public EnumItemReach getReach (ItemStack itemStack) {
				return EnumItemReach.SHORT;
		}

		@Override
		public boolean canStack () {
				return false;
		}

		@Override
		public FluidStack getFluid (ItemStack stack) {
				if (stack.getTagCompound() == null || !stack.getTagCompound().hasKey("Fluid"))
						return null;
				return FluidStack.loadFluidStackFromNBT(stack.getTagCompound().getCompoundTag("Fluid"));
		}

		@Override
		public int getCapacity (ItemStack container) {
				return capacity * drainAmount;
		}

		private static boolean isValidFluid (FluidStack fluid) {
				return (fluid.getFluid() == TFCFluids.FRESHWATER || fluid.getFluid() == TFCFluids.BEER || fluid.getFluid() == TFCFluids.CIDER || fluid.getFluid() == TFCFluids.CORNWHISKEY || fluid.getFluid() == TFCFluids.RUM || fluid.getFluid() == TFCFluids.RYEWHISKEY || fluid.getFluid() == TFCFluids.SAKE || fluid.getFluid() == TFCFluids.VODKA || fluid.getFluid() == TFCFluids.WHISKEY);
		}

		@Override
		public int fill (ItemStack stack, FluidStack fluid, boolean doFill) {
				if (fluid == null || !isValidFluid(fluid))
						return 0;
				if (stack.getTagCompound() == null)
						stack.stackTagCompound = new NBTTagCompound();
				if (!stack.getTagCompound().hasKey("Fluid")) {
						NBTTagCompound nbt = fluid.writeToNBT(new NBTTagCompound());
						if ((capacity * drainAmount) < fluid.amount) {
								nbt.setInteger("Amount", (capacity * drainAmount));
								stack.getTagCompound().setTag("Fluid", nbt);
								stack.setItemDamage(0);
								return (capacity * drainAmount);
						}
						stack.getTagCompound().setTag("Fluid", nbt);
						stack.setItemDamage((capacity * drainAmount) - fluid.amount);
						return fluid.amount;
				}
				NBTTagCompound nbt = stack.getTagCompound().getCompoundTag("Fluid");
				FluidStack f = FluidStack.loadFluidStackFromNBT(nbt);
				if (!f.isFluidEqual(fluid))
						return 0;
				int filled = (capacity * drainAmount) - f.amount;
				if (fluid.amount < filled) {
						f.amount += fluid.amount;
						filled = fluid.amount;
				} else
						fluid.amount = (capacity * drainAmount);
				stack.getTagCompound().setTag("Fluid", fluid.writeToNBT(nbt));
				stack.setItemDamage(filled);
				return filled;
		}

		@Override
		public FluidStack drain (ItemStack stack, int maxDrain, boolean doDrain) {
				if (stack.getTagCompound() == null || !stack.getTagCompound().hasKey("Fluid"))
						return null;
				FluidStack f = FluidStack.loadFluidStackFromNBT(stack.getTagCompound().getCompoundTag("Fluid"));
				if (f == null)
						return null;
				int currentAmount = f.amount;
				f.amount = Math.min(f.amount, maxDrain);
				if (doDrain) {
						if (currentAmount == f.amount) {
								stack.getTagCompound().removeTag("Fluid");
								if (stack.getTagCompound().hasNoTags())
										stack.stackTagCompound = null;
								stack.setItemDamage((capacity * drainAmount));
								return f;
						}
						NBTTagCompound nbt = stack.getTagCompound().getCompoundTag("Fluid");
						nbt.setInteger("Amount", currentAmount - f.amount);
						stack.getTagCompound().setTag("Fluid", nbt);
						stack.setItemDamage((capacity * drainAmount) - (currentAmount - f.amount));
				}
				return f;
		}

		private void fillJug (World world, ItemStack stack, int x, int y, int z, int amount) {
				Block b = world.getBlock(x, y, z);
				if (b == TFCBlocks.freshWater || b == TFCBlocks.freshWaterStationary) {
						FluidStack fs = FluidRegistry.getFluidStack(TFCFluids.FRESHWATER.getName(), amount);
						fill(stack, fs, true);
				}
		}

		@Override
		public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean adv) {
				super.addInformation(stack, player, list, adv);
				list.add(EnumChatFormatting.AQUA + "Capacity: " + (capacity * drainAmount));
				list.add(EnumChatFormatting.AQUA + "Fill Amount: " + "half ");
				if (adv) {
						EntityPlayerMP p = (EntityPlayerMP) player;
						FoodStatsTFC s = TFC_Core.getPlayerFoodStats(p);
						list.add(EnumChatFormatting.GRAY + "(" + s.waterLevel + ") -> (" + (s.waterLevel + s.waterLevel / 2));
				}
		}

		private WorldPos findWater (World world, int x, int y, int z, int side) {
				WorldPos wp = new WorldPos();
				wp.setX(x);
				wp.setY(y);
				wp.setZ(z);
				wp.setWater(false);
				Block block = world.getBlock(wp.getX(), wp.getY(), wp.getZ());
				if (block == TFCBlocks.freshWater || block == TFCBlocks.freshWaterStationary) {
						wp.setWater(true);
						return wp;
				} else {
						switch (side) {
								case 1:
										wp.setY(wp.getY() + 1);
										break;
								case 2:
										wp.setZ(wp.getZ() - 1);
										break;
								case 3:
										wp.setZ(wp.getZ() + 1);
										break;
								case 4:
										wp.setX(wp.getX() - 1);
										break;
								case 5:
										wp.setX(wp.getX() + 1);
										break;
						}
						block = world.getBlock(wp.getX(), wp.getY(), wp.getZ());
						if (block == TFCBlocks.freshWater || block == TFCBlocks.freshWaterStationary) {
								wp.setWater(true);
								return wp;
						}
				}

				return wp;
		}

		public class WorldPos {

				private int x;
				private int y;
				private int z;
				private boolean isWater;

				public int getX () {
						return x;
				}

				public void setX (int x) {
						this.x = x;
				}

				public int getY () {
						return y;
				}

				public void setY (int y) {
						this.y = y;
				}

				public int getZ () {
						return z;
				}

				public void setZ (int z) {
						this.z = z;
				}

				public boolean isWater () {
						return isWater;
				}

				public void setWater (boolean isWater) {
						this.isWater = isWater;
				}
		}
}

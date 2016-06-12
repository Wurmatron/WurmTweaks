package wurmcraft.wurmatron.common.items;

import com.bioxx.tfc.Core.Player.FoodStatsTFC;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Core.TFC_Time;
import com.bioxx.tfc.api.Enums.EnumFoodGroup;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCFluids;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidContainerItem;
import wurmcraft.wurmatron.common.reference.Global;

import java.util.ArrayList;
import java.util.List;

public class ItemJug extends Item implements IFluidContainerItem {

		private ArrayList<Integer> jugAmount;

		public ItemJug (ArrayList<Integer> amounts) {
				setMaxStackSize(1);
				setUnlocalizedName("itemJug");
				jugAmount = amounts;
		}

		public static ItemStack setCapacity (int capacity) {
				ItemStack stack = new ItemStack(WTItems.itemJug);
				NBTTagCompound nbt = new NBTTagCompound();
				nbt.setInteger("capacity", capacity);
				stack.setTagCompound(nbt);
				return stack;
		}

		@Override
		public void getSubItems (Item item, CreativeTabs tab, List list) {
				list.add(setCapacity(2000));
				list.add(setCapacity(3000));
				list.add(setCapacity(4000));
				list.add(setCapacity(5000));
				list.add(setCapacity(6000));
				list.add(setCapacity(7000));
				list.add(setCapacity(8000));
				list.add(setCapacity(9000));
				list.add(setCapacity(10000));
				list.add(setCapacity(11000));
				list.add(setCapacity(12000));
				list.add(setCapacity(13000));
				list.add(setCapacity(14000));
				list.add(setCapacity(15000));
				list.add(setCapacity(16000));
				list.add(setCapacity(17000));
				list.add(setCapacity(18000));
				list.add(setCapacity(19000));
				list.add(setCapacity(20000));
				list.add(setCapacity(21000));
				list.add(setCapacity(22000));
				list.add(setCapacity(23000));
				list.add(setCapacity(24000));
		}

		@Override
		public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean adv) {
				list.add(EnumChatFormatting.GRAY + "Capacity: " + getCapacity(stack));
				if (!adv)
						list.add(EnumChatFormatting.BLUE + "Level: " + getFluid(stack).amount / 1000);
				else
						list.add(EnumChatFormatting.BLUE + "Level: " + getFluid(stack).amount);
				if (getFluid(stack) != null)
						list.add(EnumChatFormatting.YELLOW + "Fluid: " + getFluid(stack).getLocalizedName());
		}

		@Override
		public ItemStack onItemRightClick (ItemStack sac, World world, EntityPlayer player) {
				if (player.capabilities.isCreativeMode)
						return sac;
				if (player.isSneaking()) {
						drain(sac, getCapacity(sac), true);
						return sac;
				}
				MovingObjectPosition mop = this.getMovingObjectPositionFromPlayer(world, player, true);
				if (mop == null) {
						if (sac.getItemDamage() == sac.getMaxDamage()) {
								if (player instanceof EntityPlayerMP)
										player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_AQUA + StatCollector.translateToLocal("This is Empty")));
						} else
								player.setItemInUse(sac, getMaxItemUseDuration(sac));
						return sac;
				} else {
						if (mop.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
								WPos wp = findWater(world, mop.blockX, mop.blockY, mop.blockZ, mop.sideHit);
								if (!world.canMineBlock(player, wp.getX(), wp.getY(), wp.getZ()))
										return sac;
								if (!player.canPlayerEdit(wp.getX(), wp.getY(), wp.getZ(), mop.sideHit, sac))
										return sac;
								if (wp.isWater()) {
										if (getFluid(sac).amount < sac.getTagCompound().getInteger("capacity")) {
												fillSac(world, sac, wp.getX(), wp.getY(), wp.getZ(), sac.getTagCompound().getInteger("capacity"));
												double xHit = mop.hitVec.xCoord;
												double yHit = mop.hitVec.yCoord;
												if (world.getBlockMetadata(wp.getX(), wp.getY(), wp.getZ()) > 0 && mop.sideHit == 1)
														yHit += 1;
												double zHit = mop.hitVec.zCoord;
												for (int l = 0; l < 5; l++) {
														world.spawnParticle("splash", xHit, yHit, zHit, (-0.5F + world.rand.nextFloat()), (-0.5F + world.rand.nextFloat()), (-0.5F + world.rand.nextFloat()));
												}
												world.playSoundAtEntity(player, "random.splash", 0.2F, world.rand.nextFloat() * 0.1F + 0.9F);
										} else
												player.setItemInUse(sac, this.getMaxItemUseDuration(sac));
								} else {
										if (sac.getItemDamage() == sac.getMaxDamage()) {
										} else
												player.setItemInUse(sac, this.getMaxItemUseDuration(sac));
								}
						}
						return sac;
				}
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
		public ItemStack onEaten (ItemStack sac, World world, EntityPlayer player) {
				if (!world.isRemote && !player.capabilities.isCreativeMode && player instanceof EntityPlayerMP) {
						FluidStack sacFS = this.getFluid(sac);
						if (sacFS != null) {
								EntityPlayerMP p = (EntityPlayerMP) player;
								FoodStatsTFC fs = TFC_Core.getPlayerFoodStats(p);
								float nwl = fs.getMaxWater(p);
								int rw = (int) fs.getMaxWater(p) - (int) fs.waterLevel;
								if (sacFS.getFluid() == TFCFluids.FRESHWATER) {
										if (fs.needDrink()) {
												fs.restoreWater(p, rw);
												this.drain(sac, 1, true);
										}
								} else if (sacFS.getFluid() == TFCFluids.SALTWATER && fs.needDrink()) {
										fs.restoreWater(p, -rw);
										this.drain(sac, 1, true);
										p.getServerForPlayer().getEntityTracker().func_151248_b(p, new S0BPacketAnimation(p, 4));
								} else if (isAlcohol(sacFS)) {
										if (fs.needDrink()) {
												fs.restoreWater(p, 3200);
												this.drain(sac, 1, true);
												int time = world.rand.nextInt(1000) + 400;
												fs.consumeAlcohol();
												if (world.rand.nextInt(100) == 0) p.addPotionEffect(new PotionEffect(8, time, 4));
												if (world.rand.nextInt(100) == 0) p.addPotionEffect(new PotionEffect(5, time, 4));
												if (world.rand.nextInt(100) == 0) p.addPotionEffect(new PotionEffect(8, time, 4));
												if (world.rand.nextInt(200) == 0) p.addPotionEffect(new PotionEffect(10, time, 4));
												if (world.rand.nextInt(150) == 0) p.addPotionEffect(new PotionEffect(12, time, 4));
												if (world.rand.nextInt(180) == 0) p.addPotionEffect(new PotionEffect(13, time, 4));
												int levelMod = 250 * p.experienceLevel;
												if (fs.soberTime > TFC_Time.getTotalTicks() + 3000 + levelMod) {
														if (fs.soberTime > TFC_Time.getTotalTicks() + 5000 + levelMod) {
																if (world.rand.nextInt(4) == 0)
																		p.addPotionEffect(new PotionEffect(18, time, 4));
																if (fs.soberTime > TFC_Time.getTotalTicks() + 7000 + levelMod) {
																		if (world.rand.nextInt(2) == 0)
																				p.addPotionEffect(new PotionEffect(15, time, 4));
																		if (fs.soberTime > TFC_Time.getTotalTicks() + 8000 + levelMod) {
																				if (world.rand.nextInt(10) == 0)
																						p.addPotionEffect(new PotionEffect(20, time, 4));
																		}
																		if (fs.soberTime > TFC_Time.getTotalTicks() + 10000 + levelMod) {
																				fs.soberTime = 0;
																				player.attackEntityFrom((new DamageSource("alcohol")).setDamageBypassesArmor().setDamageIsAbsolute(), player.getMaxHealth());
																		}
																}
														}
												}
												TFC_Core.setPlayerFoodStats(player, fs);
										}
								} else if (sacFS.getFluid() == TFCFluids.MILK && fs.needFood()) {
										if (fs.needDrink()) {
												fs.restoreWater(p, rw);
												this.drain(sac, 1, true);
												fs.addNutrition(EnumFoodGroup.Dairy, 20);
												TFC_Core.setPlayerFoodStats(player, fs);
										}
								}
								if (!fs.needDrink()) {
										world.playSoundAtEntity(p, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
								}
						}
				}
				return sac;
		}


		@SideOnly (Side.CLIENT)
		@Override
		public void registerIcons (IIconRegister registerer) {
				this.itemIcon = registerer.registerIcon(Global.MODID + ":" + getUnlocalizedName());
		}

		private void fillSac (World world, ItemStack sac, int x, int y, int z, int amount) {
				Block b = world.getBlock(x, y, z);
				if (isFreshWater(b) || isHotWater(b)) {
						FluidStack fs = FluidRegistry.getFluidStack(TFCFluids.FRESHWATER.getName(), amount);
						fill(sac, fs, true);
				}
				if (isSaltWater(b)) {
						FluidStack fs = FluidRegistry.getFluidStack(TFCFluids.SALTWATER.getName(), amount);
						fill(sac, fs, true);
				}
		}

		private boolean isFreshWater (Block block) {
				return block == TFCBlocks.freshWater || block == TFCBlocks.freshWaterStationary;
		}

		private boolean isHotWater (Block block) {
				return block == TFCBlocks.hotWater || block == TFCBlocks.hotWaterStationary;
		}

		private boolean isSaltWater (Block block) {
				return block == TFCBlocks.saltWater || block == TFCBlocks.saltWaterStationary;
		}

		private boolean isAlcohol (FluidStack fs) {
				return fs.getFluid() == TFCFluids.BEER || fs.getFluid() == TFCFluids.CIDER || fs.getFluid() == TFCFluids.CORNWHISKEY || fs.getFluid() == TFCFluids.RUM || fs.getFluid() == TFCFluids.RYEWHISKEY || fs.getFluid() == TFCFluids.SAKE || fs.getFluid() == TFCFluids.VODKA || fs.getFluid() == TFCFluids.WHISKEY;
		}

		@Override
		public FluidStack getFluid (ItemStack container) {
				if (container.stackTagCompound == null || !container.stackTagCompound.hasKey("Fluid"))
						return null;
				return FluidStack.loadFluidStackFromNBT(container.stackTagCompound.getCompoundTag("Fluid"));
		}

		@Override
		public int getCapacity (ItemStack stack) {
				return stack.getTagCompound().getInteger("capacity");
		}

		@Override
		public int fill (ItemStack container, FluidStack resource, boolean doFill) {
				if (resource == null || !isValidFluid(resource))
						return 0;
				if (!doFill) {
						if (container.stackTagCompound == null || !container.stackTagCompound.hasKey("Fluid"))
								return Math.min(getCapacity(container), resource.amount);
						FluidStack stack = FluidStack.loadFluidStackFromNBT(container.stackTagCompound.getCompoundTag("Fluid"));
						if (stack == null)
								return Math.min(getCapacity(container), resource.amount);
						if (!stack.isFluidEqual(resource))
								return 0;
						return Math.min(getCapacity(container) - stack.amount, resource.amount);
				}
				if (container.stackTagCompound == null)
						container.stackTagCompound = new NBTTagCompound();
				if (!container.stackTagCompound.hasKey("Fluid")) {
						NBTTagCompound fluidTag = resource.writeToNBT(new NBTTagCompound());

						if (getCapacity(container) < resource.amount) {
								fluidTag.setInteger("Amount", getCapacity(container));
								container.stackTagCompound.setTag("Fluid", fluidTag);
								return getCapacity(container);
						}
						container.stackTagCompound.setTag("Fluid", fluidTag);
						return resource.amount;
				}
				NBTTagCompound fluidTag = container.stackTagCompound.getCompoundTag("Fluid");
				FluidStack stack = FluidStack.loadFluidStackFromNBT(fluidTag);
				if (!stack.isFluidEqual(resource))
						return 0;
				int filled = getCapacity(container) - stack.amount;
				if (resource.amount < filled) {
						stack.amount += resource.amount;
						filled = resource.amount;
				} else {
						stack.amount = getCapacity(container);
				}
				container.stackTagCompound.setTag("Fluid", stack.writeToNBT(fluidTag));
				return filled;
		}

		@Override
		public FluidStack drain (ItemStack container, int maxDrain, boolean doDrain) {
				if (container.stackTagCompound == null || !container.stackTagCompound.hasKey("Fluid"))
						return null;
				FluidStack stack = FluidStack.loadFluidStackFromNBT(container.stackTagCompound.getCompoundTag("Fluid"));
				if (stack == null)
						return null;
				int currentAmount = stack.amount;
				stack.amount = Math.min(stack.amount, maxDrain);
				if (doDrain) {
						if (currentAmount == stack.amount) {
								container.stackTagCompound.removeTag("Fluid");
								if (container.stackTagCompound.hasNoTags())
										container.stackTagCompound = null;
								return stack;
						}
						NBTTagCompound fluidTag = container.stackTagCompound.getCompoundTag("Fluid");
						fluidTag.setInteger("Amount", currentAmount - stack.amount);
						container.stackTagCompound.setTag("Fluid", fluidTag);
				}
				return stack;
		}

		private boolean isValidFluid (FluidStack fs) {
				return fs.getFluid() == TFCFluids.BEER || fs.getFluid() == TFCFluids.CIDER || fs.getFluid() == TFCFluids.CORNWHISKEY || fs.getFluid() == TFCFluids.FRESHWATER || fs.getFluid() == TFCFluids.HOTWATER || fs.getFluid() == TFCFluids.MILK || fs.getFluid() == TFCFluids.RUM || fs.getFluid() == TFCFluids.RYEWHISKEY || fs.getFluid() == TFCFluids.SAKE || fs.getFluid() == TFCFluids.SALTWATER || fs.getFluid() == TFCFluids.VODKA || fs.getFluid() == TFCFluids.WHISKEY;
		}

		private WPos findWater (World world, int x, int y, int z, int side) {
				WPos wp = new WPos();
				wp.setX(x);
				wp.setY(y);
				wp.setZ(z);
				wp.setWater(false);
				Block block = world.getBlock(wp.getX(), wp.getY(), wp.getZ());
				if (isFreshWater(block) || isHotWater(block) || isSaltWater(block)) {
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
						if (isFreshWater(block) || isHotWater(block) || isSaltWater(block)) {
								wp.setWater(true);
								return wp;
						}
				}

				return wp;
		}

		public class WPos {

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

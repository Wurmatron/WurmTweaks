package wurmcraft.wurmatron.common.recipes.mods;

import com.bioxx.tfc.api.TFCItems;
import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import tombenpotter.emt.common.init.BlockRegistry;
import tombenpotter.emt.common.init.ItemRegistry;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.RecipeHelper;
import wurmcraft.wurmatron.common.utils.nbt.ItemNBT;
import wurmcraft.wurmatron.common.utils.thaumcraft.ThaumcraftHelper;

public class ElectroMagicRecipes {

		private static final RecipeHelper r = new RecipeHelper();

		public static void addRecipes () {
				ThaumcraftHelper.addInfusion("Infused Quantum Armor", new ItemStack(ItemRegistry.quantumArmor, 1, 27), 8, new AspectList().add(Aspect.AIR, 64).add(Aspect.MECHANISM, 64).add(Aspect.ENERGY, 32).add(Aspect.ARMOR, 32).add(Aspect.LIFE, 32), new ItemStack(IC2Items.getItem("quantumBodyarmor").getItem(), 1, OreDictionary.WILDCARD_VALUE), new ItemStack[] {IC2Items.getItem("iridiumPlate"), IC2Items.getItem("iridiumPlate"), IC2Items.getItem("iridiumPlate"), new ItemStack(BlockRegistry.shield, 1, 0), new ItemStack(BlockRegistry.shield, 1, 0)});
				ThaumcraftHelper.addInfusion("Quantum Wings", new ItemStack(ItemRegistry.quantumWing, 1, 27), 12, new AspectList().add(Aspect.AIR, 32).add(Aspect.MECHANISM, 64).add(Aspect.ENTROPY, 32).add(Aspect.ARMOR, 64).add(Aspect.LIGHT, 32), new ItemStack(ItemRegistry.nanoWing, 1, OreDictionary.WILDCARD_VALUE), new ItemStack[] {IC2Items.getItem("iridiumPlate"), IC2Items.getItem("iridiumPlate"), new ItemStack(IC2Items.getItem("quantumBodyarmor").getItem(), 1, OreDictionary.WILDCARD_VALUE)});
				ThaumcraftHelper.addInfusion("Nanosuit Wings", new ItemStack(ItemRegistry.nanoWing, 1, 27), 12, new AspectList().add(Aspect.AIR, 32).add(Aspect.MECHANISM, 64).add(Aspect.ENTROPY, 32).add(Aspect.ARMOR, 64).add(Aspect.LIGHT, 32), new ItemStack(ItemRegistry.thaumiumWing, 1, OreDictionary.WILDCARD_VALUE), new ItemStack[] {IC2Items.getItem("carbonPlate"), IC2Items.getItem("carbonPlate"), new ItemStack(IC2Items.getItem("nanoBodyarmor").getItem(), 1, OreDictionary.WILDCARD_VALUE)});
				ThaumcraftHelper.addShaped("Thaumium Reinforced Wings", new ItemStack(ItemRegistry.thaumiumWing, 1, 27), new AspectList().add(Aspect.AIR, 50).add(Aspect.EARTH, 50).add(Aspect.ENTROPY, 50), "FXA", "FXA", "FXA", new ItemStack(ItemRegistry.materials, 1, 13), 'X', new ItemStack(ConfigItems.itemResource, 1, 2), 'A', TFCItems.redSteelSheet2x);
				ThaumcraftHelper.addShaped("Thaumium Reinforced Wings", new ItemStack(ItemRegistry.thaumiumWing, 1, 27), new AspectList().add(Aspect.AIR, 50).add(Aspect.EARTH, 50).add(Aspect.ENTROPY, 50), "FXA", "FXA", "FXA", new ItemStack(ItemRegistry.materials, 1, 13), 'X', new ItemStack(ConfigItems.itemResource, 1, 2), 'A', TFCItems.blackSteelSheet2x);
				r.addShaped(new ItemStack(ItemRegistry.materials, 1, 11), "FFF", "AAA", "FFF", 'F', Items.paper, 'A', "packLog");
				r.add2X(new ItemStack(ItemRegistry.materials, 1, 7), Items.feather);
				r.addShaped(new ItemStack(ItemRegistry.featherWing), "FXA", "FXA", "FXA", 'F', new ItemStack(ItemRegistry.materials, 1, 7), 'X', "packRubber", 'A', new ItemStack(ItemRegistry.materials, 1, 11));
				ThaumcraftHelper.removeResearch("Etheral Processor");
				ThaumcraftHelper.refreshResearch("Aer Generator");
				ThaumcraftHelper.removeResearch("Ignis Generator");
				ThaumcraftHelper.removeResearch("Arbor Generator");
				ThaumcraftHelper.removeResearch("Auram Generator");
				ThaumcraftHelper.addInfusion("Potentia Generator", new ItemStack(BlockRegistry.essentiaGens, 1, 0), 8, new AspectList().add(Aspect.AIR, 32).add(Aspect.FIRE, 32).add(Aspect.AURA, 12), IC2Items.getItem("generator"), new ItemStack[] {new ItemStack(Blocks.hopper), new ItemStack(ConfigItems.itemFocusTrade), IC2Items.getItem("advancedMachine"), WurmTweaksItems.itemMachineFrame});
				ThaumcraftHelper.addInfusion("Industrial Wand Charging Station", new ItemStack(BlockRegistry.emtMachines), 24, new AspectList().add(Aspect.CRAFT, 48).add(Aspect.AURA, 48).add(Aspect.MAGIC, 64).add(Aspect.ENERGY, 32), new ItemStack(ConfigBlocks.blockStoneDevice, 1, 5), new ItemStack[] {IC2Items.getItem("iridiumPlate"), IC2Items.getItem("iridiumPlate"), new ItemStack(TFCItems.redSteelSheet2x), WurmTweaksItems.stableMagicEssence, WurmTweaksItems.itemNatureCoreMK2});
				ThaumcraftHelper.addInfusion("Mjolnir", ItemNBT.addDamage(new ItemStack(ItemRegistry.electricThorHammer, 1, 0), 860), 8, new AspectList().add(Aspect.DARKNESS, 48).add(Aspect.DEATH, 32), new ItemStack(ItemRegistry.thorHammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack[] {new ItemStack(ItemRegistry.itemEMTItems, 1, 6), new ItemStack(ItemRegistry.itemEMTItems, 1, 6), new ItemStack(ItemRegistry.itemEMTItems, 1, 6), new ItemStack(ConfigItems.itemFocusShock, 1, 0)});
				ThaumcraftHelper.removeResearch("Thaumium Chainsaw");
				ThaumcraftHelper.removeResearch("Thaumium Drill");
				ThaumcraftHelper.removeResearch("Thaumium Omnitool");
				ThaumcraftHelper.removeResearch("Diamond Chainsaw");
				ThaumcraftHelper.removeResearch("Thaumium Chainsaw");
				ThaumcraftHelper.removeResearch("Chainsaw of the Stream");
				ThaumcraftHelper.removeResearch("Iron Omnitool");
				ThaumcraftHelper.removeResearch("Electric Hoe of Growth");
				ThaumcraftHelper.removeResearch("Drill of the Rockbreaker");
				ThaumcraftHelper.addShaped("Electric Goggles", new ItemStack(ItemRegistry.electricGoggles, 1, 27), new AspectList().add(Aspect.AIR, 20).add(Aspect.WATER, 20).add(Aspect.ORDER, 20), " H ", "BXB", "BAB", 'H', TFCItems.redSteelHelmet, 'B', IC2Items.getItem("reBattery"), 'X', ConfigItems.itemGoggles, 'B', IC2Items.getItem("advancedCircuit"), 'A', WurmTweaksItems.stableMagicEssence);
				ThaumcraftHelper.addInfusion("Nanosuit Goggles of Revealing", new ItemStack(ItemRegistry.nanoThaumicHelmet, 1, 27), 4, new AspectList().add(Aspect.MOTION, 48).add(Aspect.ENERGY, 32).add(Aspect.ARMOR, 32), new ItemStack(ItemRegistry.electricGoggles, 1, OreDictionary.WILDCARD_VALUE), new ItemStack[] {new ItemStack(IC2Items.getItem("nanoHelmet").getItem(), 1, OreDictionary.WILDCARD_VALUE), IC2Items.getItem("carbonPlate"), IC2Items.getItem("carbonPlate"), IC2Items.getItem("advancedCircuit")});
				ThaumcraftHelper.addInfusion("Quantum Boots of the Traveller", new ItemStack(ItemRegistry.quantumThaumicHelmet, 1, 27), 12, new AspectList().add(Aspect.MOTION, 32).add(Aspect.SENSES, 32).add(Aspect.AIR, 32), new ItemStack(ItemRegistry.nanoThaumicHelmet, 1, OreDictionary.WILDCARD_VALUE), new ItemStack[] {IC2Items.getItem("iridiumPlate"), IC2Items.getItem("iridiumPlate"), new ItemStack(IC2Items.getItem("quantumHelmet").getItem(), 1, OreDictionary.WILDCARD_VALUE), IC2Items.getItem("advancedCircuit")});
				ThaumcraftHelper.addInfusion("Electric Boots of the Traveller", new ItemStack(ItemRegistry.electricBootsTraveller, 1, 27), 2, new AspectList().add(Aspect.MOTION, 32).add(Aspect.ENERGY, 32).add(Aspect.ARMOR, 16), new ItemStack(ConfigItems.itemBootsTraveller, 1, OreDictionary.WILDCARD_VALUE), new ItemStack[] {IC2Items.getItem("elemotor"), IC2Items.getItem("coil"), new ItemStack(IC2Items.getItem("advBattery").getItem(), 1, OreDictionary.WILDCARD_VALUE)});
				ThaumcraftHelper.addInfusion("Nano Boots of the Traveller", new ItemStack(ItemRegistry.nanoBootsTraveller, 1, 27), 4, new AspectList().add(Aspect.MOTION, 48).add(Aspect.ENERGY, 32).add(Aspect.ARMOR, 64), new ItemStack(ItemRegistry.electricBootsTraveller, 1, OreDictionary.WILDCARD_VALUE), new ItemStack[] {new ItemStack(IC2Items.getItem("nanoHelmet").getItem(), 1, OreDictionary.WILDCARD_VALUE), new ItemStack(IC2Items.getItem("energyCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE), WurmTweaksItems.itemMixedSheet});
				ThaumcraftHelper.addInfusion("Quantum Boots of the Traveller", new ItemStack(ItemRegistry.quantumBootsTraveller, 1, 27), 12, new AspectList().add(Aspect.MOTION, 128).add(Aspect.MAGIC, 64), new ItemStack(ItemRegistry.nanoBootsTraveller, 1, OreDictionary.WILDCARD_VALUE), new ItemStack[] {new ItemStack(IC2Items.getItem("quantumBoots").getItem(), 1, OreDictionary.WILDCARD_VALUE), IC2Items.getItem("iridiumPlate"), IC2Items.getItem("iridiumPlate"), new ItemStack(IC2Items.getItem("lapotronCrystal").getItem(), 1, OreDictionary.WILDCARD_VALUE)});
				ThaumcraftHelper.removeResearch("Explosion Focus");
				ThaumcraftHelper.removeResearch("Kris-tmas Focus");
				ThaumcraftHelper.removeResearch("Wand Focus: Charging");
				ThaumcraftHelper.removeResearch("Wand Focus: Wand Charging");
				ThaumcraftHelper.addInfusion("Inventory Charging Ring", new ItemStack(ItemRegistry.emtBauble, 1, 1), 12, new AspectList().add(Aspect.MAGIC, 64).add(Aspect.ENERGY, 32), WurmTweaksItems.clumpPlatinum, new ItemStack[] {IC2Items.getItem("semifluidGenerator"), IC2Items.getItem("stirlingGenerator"), IC2Items.getItem("generator"), new ItemStack(IC2Items.getItem("generator").getItem(), 1, 1), new ItemStack(IC2Items.getItem("generator").getItem(), 1, 2)});
				ThaumcraftHelper.removeResearch("Armor Charging Ring");
				ThaumcraftHelper.removeResearch("Tiny Uranium");
				ThaumcraftHelper.addShaped("Compressed Solars", new ItemStack(BlockRegistry.emtSolars, 1, 0), new AspectList().add(Aspect.FIRE, 8).add(Aspect.AIR, 8).add(Aspect.EARTH, 8).add(Aspect.ENTROPY, 8).add(Aspect.WATER, 8), "XXX", "XXX", "XXX", new ItemStack(IC2Items.getItem("generator").getItem(), 1, 3));
				ThaumcraftHelper.addShaped("Compressed Solars", new ItemStack(BlockRegistry.emtSolars, 1, 1), new AspectList().add(Aspect.FIRE, 8).add(Aspect.AIR, 8).add(Aspect.EARTH, 8).add(Aspect.ENTROPY, 8).add(Aspect.WATER, 8), "XXX", "XXX", "XXX", new ItemStack(BlockRegistry.emtSolars, 1, 0));
				ThaumcraftHelper.addInfusion("Compressed Solars", new ItemStack(BlockRegistry.emtSolars, 1, 2), 1, new AspectList().add(Aspect.FIRE, 8).add(Aspect.AIR, 8).add(Aspect.EARTH, 8).add(Aspect.ENTROPY, 8).add(Aspect.WATER, 8), new ItemStack(BlockRegistry.emtSolars, 1, 1), new ItemStack[] {new ItemStack(BlockRegistry.emtSolars, 1, 1), new ItemStack(BlockRegistry.emtSolars, 1, 1), new ItemStack(BlockRegistry.emtSolars, 1, 1), new ItemStack(BlockRegistry.emtSolars, 1, 1), new ItemStack(BlockRegistry.emtSolars, 1, 1), new ItemStack(BlockRegistry.emtSolars, 1, 1), new ItemStack(BlockRegistry.emtSolars, 1, 1), new ItemStack(BlockRegistry.emtSolars, 1, 1)});
				ThaumcraftHelper.addCrucible("Air Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 15), new ItemStack(BlockRegistry.emtSolars, 1, 0), new AspectList().add(Aspect.AIR, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Air Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars2, 1, 0), new ItemStack(BlockRegistry.emtSolars, 1, 1), new AspectList().add(Aspect.AIR, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Air Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars2, 1, 1), new ItemStack(BlockRegistry.emtSolars, 1, 2), new AspectList().add(Aspect.AIR, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Fire Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 12), new ItemStack(BlockRegistry.emtSolars, 1, 0), new AspectList().add(Aspect.FIRE, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Fire Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 13), new ItemStack(BlockRegistry.emtSolars, 1, 1), new AspectList().add(Aspect.FIRE, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Fire Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 14), new ItemStack(BlockRegistry.emtSolars, 1, 2), new AspectList().add(Aspect.FIRE, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Earth Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars2, 1, 2), new ItemStack(BlockRegistry.emtSolars, 1, 0), new AspectList().add(Aspect.EARTH, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Earth Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars2, 1, 3), new ItemStack(BlockRegistry.emtSolars, 1, 1), new AspectList().add(Aspect.EARTH, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Earth Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars2, 1, 4), new ItemStack(BlockRegistry.emtSolars, 1, 2), new AspectList().add(Aspect.EARTH, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Water Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 3), new ItemStack(BlockRegistry.emtSolars, 1, 0), new AspectList().add(Aspect.WATER, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Water Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 4), new ItemStack(BlockRegistry.emtSolars, 1, 1), new AspectList().add(Aspect.WATER, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Water Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 5), new ItemStack(BlockRegistry.emtSolars, 1, 2), new AspectList().add(Aspect.WATER, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Order Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 9), new ItemStack(BlockRegistry.emtSolars, 1, 0), new AspectList().add(Aspect.ORDER, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Order Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 10), new ItemStack(BlockRegistry.emtSolars, 1, 1), new AspectList().add(Aspect.ORDER, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Order Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 11), new ItemStack(BlockRegistry.emtSolars, 1, 2), new AspectList().add(Aspect.ORDER, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Entropy Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 6), new ItemStack(BlockRegistry.emtSolars, 1, 0), new AspectList().add(Aspect.ENTROPY, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Entropy Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 7), new ItemStack(BlockRegistry.emtSolars, 1, 1), new AspectList().add(Aspect.ENTROPY, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.addCrucible("Entropy Infused Solar Panels", new ItemStack(BlockRegistry.emtSolars, 1, 8), new ItemStack(BlockRegistry.emtSolars, 1, 2), new AspectList().add(Aspect.ENTROPY, 16).add(Aspect.PLANT, 16).add(Aspect.MAGIC, 16));
				ThaumcraftHelper.removeResearch("Thaumium Plate");
		}
}

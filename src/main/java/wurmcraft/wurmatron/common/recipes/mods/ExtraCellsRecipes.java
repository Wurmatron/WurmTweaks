package wurmcraft.wurmatron.common.recipes.mods;

import appeng.api.util.AEColor;
import appeng.core.Api;
import cofh.thermaldynamics.duct.TDDucts;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import extracells.ExtraCellsApiInstance;
import extracells.registries.BlockEnum;
import extracells.registries.ItemEnum;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.api.IModRecipes;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.utils.tfc.TFCHelper;

public class ExtraCellsRecipes implements IModRecipes {


		@Optional.Method (modid = "extracells")
		@Override
		public void addRecipes () {
				r.addCircle(ExtraCellsApiInstance.instance.blocks().walrus().maybeStack(1).get(), TFCHelper.getFood(TFCItems.fishRaw, 160));
				r.addShapeless(ExtraCellsApiInstance.instance.blocks().fluidCrafter().maybeStack(1).get(), Api.INSTANCE.blocks().blockMolecularAssembler, ExtraCellsApiInstance.instance.parts().partFluidStorageBus().maybeStack(1).get());
				r.addCrossWCenter(ExtraCellsApiInstance.instance.blocks().blockInterface().maybeStack(1).get(), TDDucts.fluidSuper.itemStack,"packGlass",Api.INSTANCE.blocks().blockInterface.stack(1));
				r.addShapeless(ExtraCellsApiInstance.instance.blocks().fluidFiller().maybeStack(1).get(), ExtraCellsApiInstance.instance.blocks().fluidCrafter().maybeStack(1).get(), ExtraCellsApiInstance.instance.parts().partFluidTerminal().maybeStack(1).get());
				r.addShapeless(ExtraCellsApiInstance.instance.parts().partFluidExportBus().maybeStack(2).get(), WurmTweaksItems.itemMixedSheet, Blocks.piston, (new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, OreDictionary.WILDCARD_VALUE)), "packGlass");
				r.addShapeless(ExtraCellsApiInstance.instance.parts().partFluidImportBus().maybeStack(2).get(), WurmTweaksItems.itemMixedSheet, Blocks.sticky_piston, new ItemStack(Api.INSTANCE.parts().partCableGlass.item(AEColor.Black), 1, OreDictionary.WILDCARD_VALUE));
				r.addShapeless(ExtraCellsApiInstance.instance.parts().partOreDictExportBus().maybeStack(1).get(), Api.INSTANCE.parts().partExportBus, "packIngot");
				r.addShapeless(ExtraCellsApiInstance.instance.parts().partFluidStorageBus().maybeStack(1).get(), Api.INSTANCE.parts().partStorageBus.stack(1), ExtraCellsApiInstance.instance.parts().partFluidTerminal());
				r.addShapeless(ExtraCellsApiInstance.instance.parts().partFluidTerminal().maybeStack(1).get(), Api.INSTANCE.parts().partTerminal.stack(1), ExtraCellsApiInstance.instance.parts().partFluidStorageBus());
				r.addShapeless(ExtraCellsApiInstance.instance.parts().partFluidLevelEmitter().maybeStack(1).get(), Api.INSTANCE.parts().partLevelEmitter, TDDucts.fluidBasic);
				r.addShapeless(ExtraCellsApiInstance.instance.parts().partDrive().maybeStack(1).get(), Api.INSTANCE.blocks().blockDrive, WurmTweaksItems.gearMixedSheet);
				r.addShapeless(ExtraCellsApiInstance.instance.parts().partBattery().maybeStack(1).get(), Api.INSTANCE.blocks().blockEnergyCell, WurmTweaksItems.gearMixedSheet);
				r.addShaped(new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 1),"GSG", "S S", "TTT", 'G', "wurmglass", 'S', WurmTweaksItems.itemQuantumCore, 'T', BlockEnum.CERTUSTANK.getBlock());
				r.addShaped(new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 0), "GSG", "S S", "TTT", 'G', "wurmglass", 'S',  WurmTweaksItems.itemQuantumCore, 'T', new ItemStack(TFCItems.gemDiamond, 1, 2));
				r.addShaped(new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 0),"PCP", "XAX", "PXP", 'P',  WurmTweaksItems.itemQuantumCore, 'C', Api.INSTANCE.materials().materialEngProcessor, 'X', Api.INSTANCE.materials().materialCell64kPart, 'A', Api.INSTANCE.materials().materialEngProcessor);
				r.addShaped(new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 1), "PCP", "XAX", "PXP", 'P',  WurmTweaksItems.itemQuantumCore, 'C', Api.INSTANCE.materials().materialEngProcessor, 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 0), 'A',Api.INSTANCE.materials().materialEngProcessor);
				r.addShaped(new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 2), "PCP", "XAX", "PXP", 'P',  WurmTweaksItems.itemQuantumCore, 'C', Api.INSTANCE.materials().materialEngProcessor, 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 1), 'A', Api.INSTANCE.materials().materialEngProcessor);
				r.addShaped(new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 3), "PCP", "XAX", "PXP", 'P',  WurmTweaksItems.itemQuantumCore, 'C',Api.INSTANCE.materials().materialEngProcessor, 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 2), 'A',Api.INSTANCE.materials().materialEngProcessor);
				r.addShaped(new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 4), "ISI", "SPS", "ISI", 'I', TFCItems.blueSteelIngot, 'S', TFCItems.redSteelSheet, 'P',Api.INSTANCE.materials().materialEngProcessor);
				r.addShaped(new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 5), "SES", "XGX", "SXS", 'S',  WurmTweaksItems.itemQuantumCore, 'E', Api.INSTANCE.materials().materialEngProcessor, 'G', "packGlass", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 4));
				r.addShaped(new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 6), "SES", "XGX", "SXS", 'S',  WurmTweaksItems.itemQuantumCore, 'E', Api.INSTANCE.materials().materialEngProcessor, 'G', "packGlass", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 5));
				r.addShaped(new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 7), "SES", "XGX", "SXS", 'S',  WurmTweaksItems.itemQuantumCore, 'E', Api.INSTANCE.materials().materialEngProcessor, 'G', "packGlass", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 6));
				r.addShaped(new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 8),"SES", "XGX", "SXS", 'S',  WurmTweaksItems.itemQuantumCore, 'E', Api.INSTANCE.materials().materialEngProcessor, 'G', "packGlass", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 7));
				r.addShaped(new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 9), "SES", "XGX", "SXS", 'S',  WurmTweaksItems.itemQuantumCore, 'E', Api.INSTANCE.materials().materialEngProcessor, 'G', "packGlass", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 8));
				r.addShaped(new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 10), "SES", "XGX", "SXS", 'S',  WurmTweaksItems.itemQuantumCore, 'E', Api.INSTANCE.materials().materialEngProcessor, 'G', "packGlass", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 9));
				r.addShaped(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(), 1, 0), "GSG", "SXS", "TTT", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 0), 'G', "packGlass", 'S',  WurmTweaksItems.itemQuantumCore, 'T', new ItemStack(TFCItems.gemDiamond, 1, 2));
				r.addShaped(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(), 1, 1), "GSG", "SXS", "TTT", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 1), 'G', "packGlass", 'S',  WurmTweaksItems.itemQuantumCore, 'T', new ItemStack(TFCItems.gemDiamond, 1, 2));
				r.addShaped(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(), 1, 2), "GSG", "SXS", "TTT", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 2), 'G', "packGlass", 'S',  WurmTweaksItems.itemQuantumCore, 'T', new ItemStack(TFCItems.gemDiamond, 1, 2));
				r.addShaped(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(), 1, 3), "GSG", "SXS", "TTT", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 3), 'G', "packGlass", 'S',  WurmTweaksItems.itemQuantumCore, 'T', new ItemStack(TFCItems.gemDiamond, 1, 2));
				r.addShaped(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 0), "GSG", "SXS", "TTT", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 4), 'G', "packGlass", 'S',  WurmTweaksItems.itemQuantumCore, 'T', BlockEnum.CERTUSTANK.getBlock());
				r.addShaped(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 1), "GSG", "SXS", "TTT", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 5), 'G', "packGlass", 'S',  WurmTweaksItems.itemQuantumCore, 'T', BlockEnum.CERTUSTANK.getBlock());
				r.addShaped(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 2), "GSG", "SXS", "TTT", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 6), 'G', "packGlass", 'S', WurmTweaksItems.itemQuantumCore, 'T', BlockEnum.CERTUSTANK.getBlock());
				r.addShaped(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 3),"GSG", "SXS", "TTT", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 7), 'G', "packGlass", 'S',  WurmTweaksItems.itemQuantumCore, 'T', BlockEnum.CERTUSTANK.getBlock());
				r.addShaped(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 4), "GSG", "SXS", "TTT", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 8), 'G', "packGlass", 'S',  WurmTweaksItems.itemQuantumCore, 'T', BlockEnum.CERTUSTANK.getBlock());
				r.addShaped(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 5), "GSG", "SXS", "TTT", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 9), 'G', "packGlass", 'S',  WurmTweaksItems.itemQuantumCore, 'T', BlockEnum.CERTUSTANK.getBlock());
				r.addShaped(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 6), "GSG", "SXS", "TTT", 'X', new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 10), 'G', "packGlass", 'S',  WurmTweaksItems.itemQuantumCore, 'T', BlockEnum.CERTUSTANK.getBlock());
				r.addShapeless(new ItemStack(ItemEnum.FLUIDSTORAGEPORTABLE.getItem(), 1, 0), Api.INSTANCE.blocks().blockChest.block(), Api.INSTANCE.blocks().blockEnergyCellDense.block(), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 4));
				r.addShapeless(new ItemStack(ItemEnum.FLUIDWIRELESSTERMINAL.getItem(), 1, 0), Api.INSTANCE.materials().materialWireless.item(), Api.INSTANCE.blocks().blockEnergyCellDense.block(), Api.INSTANCE.items().itemWirelessTerminal.item());
				r.addShapeless(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(), 1, 0), new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 0), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 0));
				r.addShapeless(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(), 1, 1), new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 0), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 1));
				r.addShapeless(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(), 1, 2), new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 0), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 2));
				r.addShapeless(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(), 1, 3), new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 0), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 3));
				r.addShapeless(new ItemStack(ItemEnum.PHYSICALSTORAGE.getItem(), 1, 4),  Api.INSTANCE.materials().materialCell1kPart, Api.INSTANCE.materials().materialEmptyStorageCell.item(), "packChest");
				r.addShapeless(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 0),new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 4));
				r.addShapeless(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 1), new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 5));
				r.addShapeless(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 2), new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 6));
				r.addShapeless(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 3), new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 7));
				r.addShapeless(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 4), new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 8));
				r.addShapeless(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 5), new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 9));
				r.addShapeless(new ItemStack(ItemEnum.FLUIDSTORAGE.getItem(), 1, 6), new ItemStack(ItemEnum.STORAGECASING.getItem(), 1, 1), new ItemStack(ItemEnum.STORAGECOMPONET.getItem(), 1, 10));
		}
}
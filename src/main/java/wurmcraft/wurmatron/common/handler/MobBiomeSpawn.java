package wurmcraft.wurmatron.common.handler;

import am2.entities.EntityManaCreeper;
import com.bioxx.tfc.WorldGen.TFCBiome;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.ArrayList;

public class MobBiomeSpawn {

		private static ArrayList<BiomeGenBase> tfcBiomeLand = new ArrayList<BiomeGenBase>();

		public static void init () {
				tfcBiomeLand.add(TFCBiome.BEACH);
				tfcBiomeLand.add(TFCBiome.GRAVEL_BEACH);
				tfcBiomeLand.add(TFCBiome.HELL);
				tfcBiomeLand.add(TFCBiome.HIGH_HILLS);
				tfcBiomeLand.add(TFCBiome.HIGH_HILLS_EDGE);
				tfcBiomeLand.add(TFCBiome.HIGH_PLAINS);
				tfcBiomeLand.add(TFCBiome.BEACH);
				tfcBiomeLand.add(TFCBiome.MOUNTAINS);
				tfcBiomeLand.add(TFCBiome.MOUNTAINS_EDGE);
				tfcBiomeLand.add(TFCBiome.PLAINS);
				tfcBiomeLand.add(TFCBiome.roofedForest);
				tfcBiomeLand.add(TFCBiome.ROLLING_HILLS);
				tfcBiomeLand.add(TFCBiome.swampland);
				tfcBiomeLand.add(TFCBiome.savanna);
				tfcBiomeLand.add(TFCBiome.savannaPlateau);
				tfcBiomeLand.add(TFCBiome.mesa);
				tfcBiomeLand.add(TFCBiome.mesaPlateau);
				tfcBiomeLand.add(TFCBiome.mesaPlateau_F);
				tfcBiomeLand.add(TFCBiome.birchForest);
				tfcBiomeLand.add(TFCBiome.birchForestHills);
				tfcBiomeLand.add(TFCBiome.taiga);
				tfcBiomeLand.add(TFCBiome.taigaHills);
				tfcBiomeLand.add(TFCBiome.coldTaiga);
				tfcBiomeLand.add(TFCBiome.coldTaigaHills);
				tfcBiomeLand.add(TFCBiome.megaTaiga);
				tfcBiomeLand.add(TFCBiome.megaTaigaHills);
				tfcBiomeLand.add(TFCBiome.iceMountains);
				tfcBiomeLand.add(TFCBiome.icePlains);
				for (BiomeGenBase biome : tfcBiomeLand) {
						addBiome(EntityManaCreeper.class, 20, 2, 25, EnumCreatureType.monster, biome);
				}
		}

		public static void addBiome (String entityName, int rarity, int min, int max, EnumCreatureType type, BiomeGenBase biome) {
				EntityRegistry.addSpawn(entityName, rarity, min, max, type, biome);
		}

		public static void addBiome (Class<? extends EntityLiving> entityName, int rarity, int min, int max, EnumCreatureType type, BiomeGenBase biome) {
				EntityRegistry.addSpawn(entityName, rarity, min, max, type, biome);
		}
}

package wurmcraft.wurmatron.common.handler;

import am2.bosses.EntityWaterGuardian;
import am2.entities.EntityDarkMage;
import am2.entities.EntityDryad;
import am2.entities.EntityLightMage;
import am2.entities.EntityManaCreeper;
import cofh.thermalfoundation.entity.monster.EntityBlitz;
import cofh.thermalfoundation.entity.monster.EntityBlizz;
import com.bioxx.tfc.Entities.Mobs.*;
import com.bioxx.tfc.WorldGen.TFCBiome;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.world.biome.BiomeGenBase;
import thaumcraft.common.entities.monster.*;
import thaumcraft.common.entities.monster.boss.EntityEldritchGolem;
import thehippomaster.MutantCreatures.MutantCreeper;
import thehippomaster.MutantCreatures.MutantEnderman;
import thehippomaster.MutantCreatures.MutantZombie;

import java.util.ArrayList;

public class MobBiomeSpawn {

		private static ArrayList<BiomeGenBase> tfcBiomeLand = new ArrayList<BiomeGenBase>();
		private static ArrayList<BiomeGenBase> tfcWater = new ArrayList<BiomeGenBase>();

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
				tfcWater.add(TFCBiome.swampland);
				tfcWater.add(TFCBiome.river);
				tfcWater.add(TFCBiome.frozenOcean);
				tfcWater.add(TFCBiome.ocean);
				tfcWater.add(TFCBiome.deepOcean);
				for (BiomeGenBase biome : tfcBiomeLand) {
						addBiome(EntityManaCreeper.class, 40, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityDryad.class, 15, 1, 5, EnumCreatureType.monster, biome);
						addBiome(EntityInhabitedZombie.class, 25, 1, 5, EnumCreatureType.monster, biome);
						addBiome(EntitySilverfishTFC.class, 30, 2, 5, EnumCreatureType.monster, biome);
						addBiome(EntityDarkMage.class, 20, 1, 2, EnumCreatureType.ambient, biome);
						addBiome(EntityLightMage.class, 30, 1, 5, EnumCreatureType.ambient, biome);
						addBiome(EntityBlazeTFC.class, 20, 1, 2, EnumCreatureType.monster, biome);
						addBiome(EntityGhastTFC.class, 25, 1, 4, EnumCreatureType.monster, biome);
						addBiome(EntityGiantZombie.class, 6, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityEldritchGuardian.class, 12, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityEldritchGolem.class, 1, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityEldritchCrab.class, 24, 1, 5, EnumCreatureType.monster, biome);
						addBiome(EntityBlitz.class, 5, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityBlizz.class, 5, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityCultistKnight.class, 20, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityMindSpider.class, 50, 3, 10, EnumCreatureType.monster, biome);
						addBiome(MutantCreeper.class, 25, 1, 1, EnumCreatureType.monster, biome);
						addBiome(MutantEnderman.class, 25, 1, 1, EnumCreatureType.monster, biome);
						addBiome(MutantZombie.class, 35, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityEndermanTFC.class, 50, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntityZombieTFC.class, 70, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntitySkeletonTFC.class, 60, 1, 1, EnumCreatureType.monster, biome);
						addBiome(EntitySpiderTFC.class, 60, 1, 1, EnumCreatureType.monster, biome);
				}
				for (BiomeGenBase biome : tfcWater) {
						addBiome(EntityWaterGuardian.class, 5, 1, 2, EnumCreatureType.waterCreature, biome);
				}
		}

		public static void addBiome (String entityName, int rarity, int min, int max, EnumCreatureType type, BiomeGenBase biome) {
				EntityRegistry.addSpawn(entityName, rarity, min, max, type, biome);
		}

		public static void addBiome (Class<? extends EntityLiving> entityName, int rarity, int min, int max, EnumCreatureType type, BiomeGenBase biome) {
				EntityRegistry.addSpawn(entityName, rarity, min, max, type, biome);
		}
}

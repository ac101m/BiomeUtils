package kaptainwutax.biomeutils.layer.land;

import kaptainwutax.biomeutils.Biome;
import kaptainwutax.biomeutils.layer.BiomeLayer;
import kaptainwutax.seedutils.mc.MCVersion;

public class BaseBiomesLayer extends BiomeLayer {
    // TODO introduce Default1_1 back
    public static final Biome[] DRY_BIOMES = new Biome[] {
            Biome.DESERT, Biome.DESERT, Biome.DESERT, Biome.SAVANNA, Biome.SAVANNA, Biome.PLAINS
    };

    public static final Biome[] TEMPERATE_BIOMES = new Biome[] {
            Biome.FOREST, Biome.DARK_FOREST, Biome.MOUNTAINS, Biome.PLAINS, Biome.BIRCH_FOREST, Biome.SWAMP
    };

    public static final Biome[] COOL_BIOMES = new Biome[] {
            Biome.FOREST, Biome.MOUNTAINS, Biome.TAIGA, Biome.PLAINS
    };

    public static final Biome[] SNOWY_BIOMES = new Biome[] {
            Biome.SNOWY_TUNDRA, Biome.SNOWY_TUNDRA, Biome.SNOWY_TUNDRA, Biome.SNOWY_TAIGA
    };

    public static final Biome[] OLD_BIOMES = new Biome[] {
            Biome.DESERT, Biome.FOREST, Biome.MOUNTAINS, Biome.SWAMP, Biome.PLAINS, Biome.TAIGA, Biome.JUNGLE
    };

    public static final Biome[] OLD_BIOMES_DEFAULT_1_1 = new Biome[] {
            Biome.DESERT, Biome.FOREST, Biome.MOUNTAINS, Biome.SWAMP, Biome.PLAINS, Biome.TAIGA
    };

    public BaseBiomesLayer(MCVersion version, long worldSeed, long salt, BiomeLayer parent) {
        super(version, worldSeed, salt, parent);
    }

    @Override
    public int sample(int x, int y, int z) {
        this.setSeed(x, z);
        int center = this.getParent().get(x, y, z);
        int specialBits = (center >> 8) & 15; //the nextInt(15) + 1 in ClimateLayer.Special
        center &= ~0xF00; //removes the 4 special bits and keeps everything else

        if (is1_6down.call()) {
            // adapting the code below is too hard for this one
            return this.sampleOld(center);
        }

        if (Biome.isOcean(center) || center == Biome.MUSHROOM_FIELDS.getId()) return center;

        if (center == Biome.PLAINS.getId()) {
            if (specialBits > 0) {
                return this.nextInt(3) == 0 ? Biome.BADLANDS_PLATEAU.getId() : Biome.WOODED_BADLANDS_PLATEAU.getId();
            }

            return DRY_BIOMES[this.nextInt(DRY_BIOMES.length)].getId();
        } else if (center == Biome.DESERT.getId()) {
            if (specialBits > 0) {
                return Biome.JUNGLE.getId();
            }

            return TEMPERATE_BIOMES[this.nextInt(TEMPERATE_BIOMES.length)].getId();
        } else if (center == Biome.MOUNTAINS.getId()) {
            if (specialBits > 0) {
                return Biome.GIANT_TREE_TAIGA.getId();
            }

            return COOL_BIOMES[this.nextInt(COOL_BIOMES.length)].getId();
        } else if (center == Biome.FOREST.getId()) {
            return SNOWY_BIOMES[this.nextInt(SNOWY_BIOMES.length)].getId();
        }

        return Biome.MUSHROOM_FIELDS.getId();
    }

    private int sampleOld(int center) {
        if (Biome.isShallowOcean(center, this)) {
            return Biome.OCEAN.getId();
        }
        if (center == Biome.MUSHROOM_FIELDS.getId()) {
            return Biome.MUSHROOM_FIELDS.getId();
        }
        Biome[] biomeList = isDefault1_1 ? OLD_BIOMES_DEFAULT_1_1 : OLD_BIOMES;
        Biome oldBiome = biomeList[this.nextInt(biomeList.length)];
        if (center == Biome.PLAINS.getId()) {
            return oldBiome.getId();
        }
        if (is1_2down.call()){
            return Biome.SNOWY_TUNDRA.getId();
        }
        if (oldBiome == Biome.TAIGA) {
            return Biome.TAIGA.getId();
        } else {
            return Biome.SNOWY_TUNDRA.getId();
        }
    }

}

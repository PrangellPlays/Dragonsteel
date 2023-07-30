package net.prangellplays.dragonsteel.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class DragonsteelPlacedFeatures {

    public static final Holder<PlacedFeature> DRAGON_LILY_PLACED = PlacementUtils.register("dragon_lily_placed",
            DragonsteelFeatures.DRAGON_LILY, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
}

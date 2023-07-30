package net.prangellplays.dragonsteel.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.prangellplays.dragonsteel.registry.DragonsteelBlocks;

public class DragonsteelFeatures {

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DRAGON_LILY =
            FeatureUtils.register("flower_dragon_lily", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DragonsteelBlocks.DRAGON_LILY.get())))));
}

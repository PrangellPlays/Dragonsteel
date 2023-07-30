package net.prangellplays.dragonsteel.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.prangellplays.dragonsteel.registry.DragonsteelItems;

public class DragonsteelItemTier {
    public static final ForgeTier FLAME_DRAGONSTEEL = new ForgeTier(9, 0, 9.0f, 14.5f, 15, BlockTags.NEEDS_DIAMOND_TOOL, () -> {
        return Ingredient.of(DragonsteelItems.FLAME_DRAGONSTEEL.get());
    });
}

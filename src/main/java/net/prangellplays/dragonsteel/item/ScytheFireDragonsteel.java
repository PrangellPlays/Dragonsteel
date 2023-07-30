package net.prangellplays.dragonsteel.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeTier;

public class ScytheFireDragonsteel extends SwordItem {
    public ScytheFireDragonsteel(ForgeTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setSecondsOnFire(5);
        return super.hurtEnemy(stack, target, attacker);
    }
}

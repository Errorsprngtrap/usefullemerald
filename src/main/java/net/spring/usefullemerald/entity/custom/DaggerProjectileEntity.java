package net.spring.usefullemerald.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.spring.usefullemerald.entity.ModEntities;
import net.spring.usefullemerald.items.ModItems;
import org.jspecify.annotations.Nullable;

public class DaggerProjectileEntity extends AbstractArrow {
    public DaggerProjectileEntity(EntityType<? extends AbstractArrow> entityType, Level level) {
        super(entityType, level);
    }

    public DaggerProjectileEntity(LivingEntity shooter, Level level) {
        super(ModEntities.DAGGER.get(),shooter, level, new ItemStack(ModItems.EMERALD_DAGGER.get()), null);
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        super.onHitEntity(result);
        System.out.println("Hit an entity");
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItems.EMERALD_DAGGER.get());
    }
}

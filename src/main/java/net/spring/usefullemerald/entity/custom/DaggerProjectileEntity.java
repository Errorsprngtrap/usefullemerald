package net.spring.usefullemerald.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.spring.usefullemerald.entity.ModEntities;
import net.spring.usefullemerald.items.ModItems;
import org.jspecify.annotations.Nullable;

public class DaggerProjectileEntity extends AbstractArrow {
    private float rotation;
    public DaggerProjectileEntity(EntityType<? extends AbstractArrow> entityType, Level level) {
        super(entityType, level);
    }

    public DaggerProjectileEntity(LivingEntity shooter, Level level) {
        super(ModEntities.DAGGER.get(),shooter, level, new ItemStack(ModItems.EMERALD_DAGGER.get()), null);
    }

    public float getRenderingRotation() {
        rotation += 0.5f;
        if(rotation >= 360) {
            rotation = 0;
        }
        return rotation;
    }


    @Override
    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItems.EMERALD_DAGGER.get());
    }
}

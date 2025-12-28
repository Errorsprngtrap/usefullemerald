package net.spring.usefullemerald.enchantment.custom;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.phys.Vec3;
import org.slf4j.Logger;

public record PoisonDaggerEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<PoisonDaggerEnchantmentEffect> CODEC = MapCodec.unit(PoisonDaggerEnchantmentEffect::new);
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void apply(ServerLevel serverLevel, int level, EnchantedItemInUse enchantedItemInUse, Entity entity, Vec3 vec3) {
        if (!(entity instanceof LivingEntity livingEntity)) {
            LOGGER.info("Returned");
            return;
        }
        int time;
        int levelEffect;
        switch (level) {
            case 1 -> {
                time = 40;
                levelEffect = 0;
            }
            case 2 -> {
                time = 60;
                levelEffect = 0;
            }
            case 3 -> {
                time = 80;
                levelEffect = 1;
            }
            default -> {
                return;
            }
        }

        livingEntity.addEffect(new MobEffectInstance(
                MobEffects.POISON,
                time,
                levelEffect
                )
        );
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec() {
        return CODEC;
    }
}

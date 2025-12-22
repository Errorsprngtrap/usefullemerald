package net.spring.usefullemerald.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

import java.util.Random;

public class BleedEffect extends MobEffect {

    protected BleedEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        Random rand = new Random();
        int rd = rand.nextInt(50);
        if  (rd == 0) {
            entity.hurtServer(level, level.damageSources().magic(),1);
            return true;
        }
        return super.applyEffectTick(level,entity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }

}

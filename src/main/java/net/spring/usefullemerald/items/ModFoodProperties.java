package net.spring.usefullemerald.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class ModFoodProperties {
    public static final FoodProperties EMERALD_APPLE = new FoodProperties.Builder()
            .saturationModifier(1f).nutrition(3).alwaysEdible().build();

    public static final Consumable EMERALD_APPLE_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(
                    List.of(
                            new MobEffectInstance(MobEffects.ABSORPTION,200),
                            new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE,600),
                            new MobEffectInstance(MobEffects.JUMP_BOOST,400,1),
                            new MobEffectInstance(MobEffects.SPEED,400,1)
                    )
            )
    ).build();
}

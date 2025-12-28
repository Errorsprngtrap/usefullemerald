package net.spring.usefullemerald.items.custom;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.spring.usefullemerald.effect.ModEffects;

import static net.minecraft.world.entity.ai.attributes.Attributes.*;


public class Dagger extends Item {
    private final Holder<MobEffect> effect;

    public Dagger(Properties properties, Holder<MobEffect> effect) {
        super(properties);
        this.effect = effect;
    }


    @Override
    public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.level().isClientSide()) {
            target.addEffect(new MobEffectInstance(effect,60),attacker);
        }
        stack.hurtAndBreak(1,attacker, EquipmentSlot.MAINHAND);
        super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public ItemAttributeModifiers getDefaultAttributeModifiers(ItemStack stack) {
        return ItemAttributeModifiers.builder().add(ENTITY_INTERACTION_RANGE,
                new AttributeModifier(
                        ResourceLocation.fromNamespaceAndPath("usefullemerald","dagger_range"),
                        -1f,
                        AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.MAINHAND)
                .add(ATTACK_DAMAGE,
                        new AttributeModifier(
                                ResourceLocation.fromNamespaceAndPath("usefullemerald","dagger_damage"),
                                2.5f,
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND)
                .add(ATTACK_SPEED,
                        new AttributeModifier(
                                ResourceLocation.fromNamespaceAndPath("usefullemerald","dagger_speed"),
                                -2.25f,
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND)
                .build();
    }
}
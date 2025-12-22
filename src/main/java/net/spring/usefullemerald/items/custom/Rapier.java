package net.spring.usefullemerald.items.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemAttributeModifiers;

import static net.minecraft.world.entity.ai.attributes.Attributes.*;

public class Rapier extends Item {
    public Rapier(Properties properties) {
        super(properties);
    }

    @Override
    public ItemAttributeModifiers getDefaultAttributeModifiers(ItemStack stack) {
        return ItemAttributeModifiers.builder()
                .add(ENTITY_INTERACTION_RANGE,
                new AttributeModifier(ResourceLocation.fromNamespaceAndPath("usefullemerald","rapierrange"),
                        1f, AttributeModifier.Operation.ADD_VALUE),
                EquipmentSlotGroup.MAINHAND)
                .add(ATTACK_DAMAGE,
                        new AttributeModifier(ResourceLocation.fromNamespaceAndPath("usefullemerald","rapierdamage"),
                                3f, AttributeModifier.Operation.ADD_VALUE),
                        EquipmentSlotGroup.MAINHAND)
                .add(ATTACK_SPEED,
                        new AttributeModifier(ResourceLocation.fromNamespaceAndPath("usefullemerald","rapierspd"),
                                -2f, AttributeModifier.Operation.ADD_VALUE),
                        EquipmentSlotGroup.MAINHAND)
                .build();
    }
}

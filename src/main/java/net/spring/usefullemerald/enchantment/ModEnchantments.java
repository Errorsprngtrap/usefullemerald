package net.spring.usefullemerald.enchantment;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.enchantment.EnchantmentTarget;
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.enchantment.custom.PoisonDaggerEnchantmentEffect;
import net.spring.usefullemerald.util.ModTags;


public class ModEnchantments {
    public static final ResourceKey<Enchantment> POISON_DAGGER = ResourceKey.create(Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(UsefullEmerald.MODID,"poison_dagger"));

    public static final ResourceKey<Enchantment> POINTY_RAPIER = ResourceKey.create(Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(UsefullEmerald.MODID,"pointy_rapier"));

    public static void bootstrap(BootstrapContext<Enchantment> context){
        var enchantments = context.lookup(Registries.ENCHANTMENT);
        var items = context.lookup(Registries.ITEM);

        register(context,POISON_DAGGER,Enchantment.enchantment(Enchantment.definition(
                items.getOrThrow(ModTags.Items.DAGGER),
                items.getOrThrow(ModTags.Items.DAGGER),
                3,
                3,
                Enchantment.dynamicCost(2,7),
                Enchantment.dynamicCost(20,7),
                1,
                EquipmentSlotGroup.MAINHAND))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER,EnchantmentTarget.VICTIM,
                        new PoisonDaggerEnchantmentEffect())
        );

        register(context,POINTY_RAPIER,Enchantment.enchantment(Enchantment.definition(
                        items.getOrThrow(ModTags.Items.RAPIER),
                        items.getOrThrow(ModTags.Items.RAPIER),
                        3,
                        3,
                        Enchantment.dynamicCost(2,7),
                        Enchantment.dynamicCost(20,7),
                        1,
                        EquipmentSlotGroup.MAINHAND))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER,EnchantmentTarget.VICTIM,
                        new PoisonDaggerEnchantmentEffect())
        );
    }

    private static void register(BootstrapContext<Enchantment> registry, ResourceKey<Enchantment> key, Enchantment.Builder builder) {
        registry.register(key,builder.build(key.location()));
    }
}

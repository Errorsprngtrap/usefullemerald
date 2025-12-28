package net.spring.usefullemerald.enchantment;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.enchantment.custom.PointyRapierEnchantmentEffect;
import net.spring.usefullemerald.enchantment.custom.PoisonDaggerEnchantmentEffect;

import java.util.function.Supplier;

public class ModEnchantmentEffects {
    public static final DeferredRegister<MapCodec<? extends EnchantmentEntityEffect>> ENTITY_ENCHANTMENT_EFFECTS =
            DeferredRegister.create(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, UsefullEmerald.MODID);

    public static final Supplier<MapCodec<? extends  EnchantmentEntityEffect>> POISON_DAGGER =
            ENTITY_ENCHANTMENT_EFFECTS.register("poison_dagger", () -> PoisonDaggerEnchantmentEffect.CODEC);

    public static final Supplier<MapCodec<? extends  EnchantmentEntityEffect>> POINTY_RAPIER =
            ENTITY_ENCHANTMENT_EFFECTS.register("pointy_rapier", () -> PointyRapierEnchantmentEffect.CODEC);

    public static void register(IEventBus eventBus) {
        ENTITY_ENCHANTMENT_EFFECTS.register(eventBus);
    }
}

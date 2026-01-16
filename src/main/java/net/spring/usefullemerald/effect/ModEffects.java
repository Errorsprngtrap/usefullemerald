package net.spring.usefullemerald.effect;

import com.google.common.eventbus.EventBus;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spring.usefullemerald.UsefullEmerald;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, UsefullEmerald.MODID);

    public static final Holder<MobEffect> BLEED_EFFECT = MOB_EFFECTS.register("bleed",
            () -> new BleedEffect(MobEffectCategory.HARMFUL,0xb00e0e));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}

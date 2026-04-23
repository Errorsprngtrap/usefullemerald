package net.spring.usefullemerald.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.entity.custom.DaggerProjectileEntity;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(
            BuiltInRegistries.ENTITY_TYPE, UsefullEmerald.MODID
    );
    public static ResourceKey<EntityType<?>> DAGGER_KEY = ResourceKey.create(Registries.ENTITY_TYPE, Identifier.withDefaultNamespace("dagger"));

    public static final Supplier<EntityType<DaggerProjectileEntity>> DAGGER =
            ENTITY_TYPES.register("tomahawk", () -> EntityType.Builder.<DaggerProjectileEntity>of(DaggerProjectileEntity::new, MobCategory.MISC)
                    .sized(0.4f, 0.25f).build(DAGGER_KEY)
            );



    public static void register(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }
}

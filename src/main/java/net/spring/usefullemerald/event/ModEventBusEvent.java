package net.spring.usefullemerald.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.entity.client.DaggerProjectileModel;

@EventBusSubscriber(modid = UsefullEmerald.MODID)
public class ModEventBusEvent {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DaggerProjectileModel.LAYER_LOCATION, DaggerProjectileModel::createBodyLayer);
    }
}

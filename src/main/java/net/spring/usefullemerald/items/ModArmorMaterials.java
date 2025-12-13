package net.spring.usefullemerald.items;


import net.minecraft.Util;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.neoforged.neoforge.common.Tags;

import java.rmi.registry.Registry;
import java.util.EnumMap;

public class ModArmorMaterials {
    //static ResourceKey<? extends Registry<EquipmentAsset>> Root_ID = ResourceKey.createRegistryKey(Identifier)
    public static final ResourceKey<EquipmentAsset> EMERALD = ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.fromNamespaceAndPath("usefullemerald", "emerald"));

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(
             15,
            Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 4);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 4);
            }),
            20,
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0,
            0,
            Tags.Items.GEMS_EMERALD,
            EMERALD
    );
}

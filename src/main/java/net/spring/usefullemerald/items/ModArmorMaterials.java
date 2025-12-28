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
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.util.ModTags;

import java.util.EnumMap;

public class ModArmorMaterials {

    public static ResourceKey<EquipmentAsset> EMERALD = ResourceKey.create(
            ResourceKey.createRegistryKey(ResourceLocation.withDefaultNamespace("equipment_asset")),
            ResourceLocation.fromNamespaceAndPath(UsefullEmerald.MODID, "emerald"));
    public static ResourceKey<EquipmentAsset> REINFORCED_EMERALD = ResourceKey.create(
            ResourceKey.createRegistryKey(ResourceLocation.withDefaultNamespace("equipment_asset")),
            ResourceLocation.fromNamespaceAndPath(UsefullEmerald.MODID, "reinforced_emerald"));

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(
            1500,
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

    public static final ArmorMaterial REINFORCED_EMERALD_ARMOR_MATERIAL = new ArmorMaterial(
            2000,
            Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 5);
                map.put(ArmorType.CHESTPLATE, 7);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 5);
            }),
            25,
            SoundEvents.ARMOR_EQUIP_GENERIC,
            1,
            1,
            ModTags.Items.REINFORCED_EMERALD,
            REINFORCED_EMERALD
    );

}

package net.spring.usefullemerald.items;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.enchantment.Enchantable;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.effect.ModEffects;
import net.spring.usefullemerald.items.custom.Dagger;
import net.spring.usefullemerald.items.custom.Rapier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UsefullEmerald.MODID);

    //items
    public static final DeferredItem<Item> EMERALD_NUGGET = ITEMS.registerSimpleItem(
            "emerald_nugget"
    );

    public static final DeferredItem<Item> REINFORCED_EMERALD = ITEMS.registerSimpleItem(
            "reinforced_emerald"
    );


    //tools
    public static final DeferredItem<Item> EMERALD_SWORD = ITEMS.registerItem(
            "emerald_sword",
            props -> new Item(
                    // The item properties.
                    props.sword(ModToolMaterial.EMERALD,4f,-2f)
            )
    );

    public static final DeferredItem<Item> EMERALD_PICKAXE = ITEMS.registerItem(
            "emerald_pickaxe",
            props -> new Item(
                    props.pickaxe(ModToolMaterial.EMERALD,2f,-2.5f)
            )
    );

    public static final DeferredItem<Item> EMERALD_AXE = ITEMS.registerItem(
            "emerald_axe",
            props -> new AxeItem(
                    ModToolMaterial.EMERALD,4.5f,-3f,props)
    );

    public static final DeferredItem<Item> EMERALD_SHOVEL = ITEMS.registerItem(
            "emerald_shovel",
            props -> new ShovelItem(
                    ModToolMaterial.EMERALD,2f,-2.4f,props)
    );

    public static final DeferredItem<Item> EMERALD_HOE = ITEMS.registerItem(
            "emerald_hoe",
            props -> new HoeItem(
                    ModToolMaterial.EMERALD,2f,-2.5f,props)
    );

    //dagger
    public static final DeferredItem<Item> EMERALD_DAGGER = ITEMS.registerItem(
            "emerald_dagger",
            props -> new Dagger(props.durability(250)
                    .component(DataComponents.ENCHANTABLE,new Enchantable(10))
                    , ModEffects.BLEED_EFFECT)
    );

    //rapier
    public static final DeferredItem<Item> EMERALD_RAPIER = ITEMS.registerItem(
            "emerald_rapier",
            props -> new Rapier(props.durability(250)
                    .component(DataComponents.ENCHANTABLE,new Enchantable(10)))
    );

    //food
    public static final DeferredItem<Item> EMERALD_APPLE = ITEMS.registerItem(
            "emerald_apple",
            properties ->  new Item(properties.food(
                    ModFoodProperties.EMERALD_APPLE,
                    ModFoodProperties.EMERALD_APPLE_EFFECT
            ))
    );

    //armor
    public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.registerItem(
            "emerald_helmet",
            properties ->  new Item(properties.humanoidArmor(
                    ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.HELMET
            ))
    );

    public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.registerItem(
            "emerald_chestplate",
            properties ->  new Item(properties.humanoidArmor(
                    ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE
            ))
    );

    public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.registerItem(
            "emerald_leggings",
            properties ->  new Item(properties.humanoidArmor(
                    ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS
            ))
    );

    public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.registerItem(
            "emerald_boots",
            properties ->  new Item(properties.humanoidArmor(
                    ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS
            ))
    );

    public static final DeferredItem<Item> REINFORCED_EMERALD_HELMET = ITEMS.registerItem(
            "reinforced_emerald_helmet",
            properties ->  new Item(properties.humanoidArmor(
                    ModArmorMaterials.REINFORCED_EMERALD_ARMOR_MATERIAL, ArmorType.HELMET
            ))
    );

    public static final DeferredItem<Item> REINFORCED_EMERALD_CHESTPLATE = ITEMS.registerItem(
            "reinforced_emerald_chestplate",
            properties ->  new Item(properties.humanoidArmor(
                    ModArmorMaterials.REINFORCED_EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE
            ))
    );

    public static final DeferredItem<Item> REINFORCED_EMERALD_LEGGINGS = ITEMS.registerItem(
            "reinforced_emerald_leggings",
            properties ->  new Item(properties.humanoidArmor(
                    ModArmorMaterials.REINFORCED_EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS
            ))
    );

    public static final DeferredItem<Item> REINFORCED_EMERALD_BOOTS = ITEMS.registerItem(
            "reinforced_emerald_boots",
            properties ->  new Item(properties.humanoidArmor(
                    ModArmorMaterials.REINFORCED_EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS
            ))
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package net.spring.usefullemerald.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.items.ModItems;
import net.spring.usefullemerald.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, UsefullEmerald.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.PICKAXES)
                .add(ModItems.EMERALD_PICKAXE.get());
        tag(ItemTags.SHOVELS)
            .add(ModItems.EMERALD_SHOVEL.get());
        tag(ItemTags.SWORDS)
                .add(ModItems.EMERALD_SWORD.get());
        tag(ItemTags.AXES)
                .add(ModItems.EMERALD_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.EMERALD_HOE.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.REINFORCED_EMERALD_BOOTS.get())
                .add(ModItems.REINFORCED_EMERALD_LEGGINGS.get())
                .add(ModItems.REINFORCED_EMERALD_CHESTPLATE.get())
                .add(ModItems.REINFORCED_EMERALD_HELMET.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.EMERALD_BOOTS.get());

        tag(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.REINFORCED_EMERALD_HELMET.get())
                .add(ModItems.EMERALD_HELMET.get());

        tag(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.REINFORCED_EMERALD_CHESTPLATE.get())
                .add(ModItems.EMERALD_CHESTPLATE.get());

        tag(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.REINFORCED_EMERALD_LEGGINGS.get())
                .add(ModItems.EMERALD_LEGGINGS.get());

        tag(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.REINFORCED_EMERALD_BOOTS.get())
                .add(ModItems.EMERALD_BOOTS.get());

        //tag(ItemTags.WEAPON_ENCHANTABLE)
                //.add(ModItems.EMERALD_DAGGER.get())
                //.add(ModItems.EMERALD_RAPIER.get());

        tag(ModTags.Items.DAGGER)
                .add(ModItems.EMERALD_DAGGER.get());

        tag(ModTags.Items.RAPIER)
                .add(ModItems.EMERALD_RAPIER.get());

        tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.EMERALD_DAGGER.get())
                .add(ModItems.EMERALD_RAPIER.get());

    }
}

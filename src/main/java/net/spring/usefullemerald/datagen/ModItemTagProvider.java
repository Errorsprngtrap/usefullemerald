package net.spring.usefullemerald.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.items.ModItems;

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

    }

}

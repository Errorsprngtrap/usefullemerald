package net.spring.usefullemerald.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.spring.usefullemerald.UsefullEmerald;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, UsefullEmerald.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}

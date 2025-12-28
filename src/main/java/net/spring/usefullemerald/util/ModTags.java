package net.spring.usefullemerald.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.spring.usefullemerald.UsefullEmerald;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_EMERALD_TOOL = createTag("needs_emerald_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = createTag("incorrect_for_emerald_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(UsefullEmerald.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> REINFORCED_EMERALD = createTag("reinforced_emerald");
        public static final TagKey<Item> DAGGER = createTag("dagger");
        public static final TagKey<Item> RAPIER = createTag("rapier");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(UsefullEmerald.MODID, name));
        }
    }


}

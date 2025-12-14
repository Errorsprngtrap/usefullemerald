package net.spring.usefullemerald.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.items.ModArmorMaterials;
import net.spring.usefullemerald.block.ModBlocks;
import net.spring.usefullemerald.items.ModItems;

import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, UsefullEmerald.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        super.registerModels(blockModels, itemModels);

        itemModels.generateFlatItem(ModItems.EMERALD_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.REINFORCED_EMERALD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_APPLE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.EMERALD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateTrimmableItem(ModItems.EMERALD_HELMET.get(), ModArmorMaterials.EMERALD,ResourceLocation.fromNamespaceAndPath(UsefullEmerald.MODID, "emerald"),false);
        itemModels.generateTrimmableItem(ModItems.EMERALD_CHESTPLATE.get(), ModArmorMaterials.EMERALD,ResourceLocation.fromNamespaceAndPath(UsefullEmerald.MODID, "emerald"),false);
        itemModels.generateTrimmableItem(ModItems.EMERALD_LEGGINGS.get(), ModArmorMaterials.EMERALD,ResourceLocation.fromNamespaceAndPath(UsefullEmerald.MODID, "emerald"),false);
        itemModels.generateTrimmableItem(ModItems.EMERALD_BOOTS.get(), ModArmorMaterials.EMERALD,ResourceLocation.fromNamespaceAndPath(UsefullEmerald.MODID, "emerald"),false);

        //Block
        blockModels.createTrivialCube(ModBlocks.REINFORCED_EMERALD_ORE.get());
    }

    //add filter for custom block
    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream();
    }
    //add filter for custom item
    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return ModItems.ITEMS.getEntries().stream();
    }
}

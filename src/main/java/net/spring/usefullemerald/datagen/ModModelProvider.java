package net.spring.usefullemerald.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
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

        itemModels.generateFlatItem(ModItems.EMERALD_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.REINFORCED_EMERALD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_APPLE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.EMERALD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_DAGGER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.EMERALD_RAPIER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateTrimmableItem(ModItems.EMERALD_HELMET.get(), ModArmorMaterials.EMERALD,ItemModelGenerators.TRIM_PREFIX_HELMET,false);
        itemModels.generateTrimmableItem(ModItems.EMERALD_CHESTPLATE.get(), ModArmorMaterials.EMERALD,ItemModelGenerators.TRIM_PREFIX_CHESTPLATE,false);
        itemModels.generateTrimmableItem(ModItems.EMERALD_LEGGINGS.get(), ModArmorMaterials.EMERALD,ItemModelGenerators.TRIM_PREFIX_LEGGINGS,false);
        itemModels.generateTrimmableItem(ModItems.EMERALD_BOOTS.get(), ModArmorMaterials.EMERALD,ItemModelGenerators.TRIM_PREFIX_BOOTS,false);

        itemModels.generateTrimmableItem(ModItems.REINFORCED_EMERALD_HELMET.get(), ModArmorMaterials.REINFORCED_EMERALD,ItemModelGenerators.TRIM_PREFIX_HELMET,false);
        itemModels.generateTrimmableItem(ModItems.REINFORCED_EMERALD_CHESTPLATE.get(), ModArmorMaterials.REINFORCED_EMERALD,ItemModelGenerators.TRIM_PREFIX_CHESTPLATE,false);
        itemModels.generateTrimmableItem(ModItems.REINFORCED_EMERALD_LEGGINGS.get(), ModArmorMaterials.REINFORCED_EMERALD,ItemModelGenerators.TRIM_PREFIX_LEGGINGS,false);
        itemModels.generateTrimmableItem(ModItems.REINFORCED_EMERALD_BOOTS.get(), ModArmorMaterials.REINFORCED_EMERALD,ItemModelGenerators.TRIM_PREFIX_BOOTS,false);

        //Block
        blockModels.family(ModBlocks.REINFORCED_EMERALD_BLOCK.get())
                .stairs(ModBlocks.REINFORCED_EMERALD_STAIR_BLOCK.get())
                .slab(ModBlocks.REINFORCED_EMERALD_SLAB_BLOCK.get());

        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_REINFORCED_EMERALD_ORE.get());
        blockModels.createTrivialCube(ModBlocks.REINFORCED_EMERALD_ORE.get());
        blockModels.createTrivialCube(ModBlocks.GLOW_REINFORCED_EMERALD.get());

        blockModels.createHorizontallyRotatedBlock(ModBlocks.REINFORCED_EMERALD_PILLAR_BLOCK.get(),
                TexturedModel.ORIENTABLE_ONLY_TOP.updateTexture(TextureMapping ->
                        TextureMapping.put(TextureSlot.SIDE,this.modLocation("block/reinforced_emerald_pillar_block"))
                                .put(TextureSlot.FRONT,this.modLocation("block/reinforced_emerald_pillar_block"))
                                .put(TextureSlot.BOTTOM, this.modLocation("block/reinforced_emerald_block"))
                                .put(TextureSlot.TOP, this.modLocation("block/reinforced_emerald_block"))
                )
        );

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

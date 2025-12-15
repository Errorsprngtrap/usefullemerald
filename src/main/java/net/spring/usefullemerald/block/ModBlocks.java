package net.spring.usefullemerald.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.items.ModItems;

import java.util.function.Function;


public class ModBlocks {
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(UsefullEmerald.MODID);

    public static final DeferredBlock<Block> REINFORCED_EMERALD_ORE = registerBlock(
            "reinforced_emerald_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(1, 3),
                    properties.requiresCorrectToolForDrops().sound(SoundType.STONE).strength(2f)
            )
    );

    public static final DeferredBlock<Block> DEEPSLATE_REINFORCED_EMERALD_ORE = registerBlock(
            "deepslate_reinforced_emerald_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(1, 3),
                    properties.requiresCorrectToolForDrops().sound(SoundType.STONE).strength(2f).destroyTime(3f)
            )
    );

    public static final DeferredBlock<Block> REINFORCED_EMERALD_BLOCK = registerBlock(
            "reinforced_emerald_block",
            (properties) -> new Block(properties.requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .strength(5f)
                    .destroyTime(6f)
                    .explosionResistance(10f)
            )
    );

    public static final DeferredBlock<Block> GLOW_REINFORCED_EMERALD = registerBlock(
            "glow_reinforced_emerald",
            (properties) -> new Block(properties.requiresCorrectToolForDrops()
                    .sound(SoundType.GLASS)
                    .strength(1f)
                    .destroyTime(0.25f)
                    .lightLevel((p_50876_) -> 15)
            )
    );


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

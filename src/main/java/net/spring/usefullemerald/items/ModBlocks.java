package net.spring.usefullemerald.items;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spring.usefullemerald.UsefullEmerald;

public class ModBlocks {
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(UsefullEmerald.MODID);

    public static final DeferredBlock<Block> REINFORCED_EMERALD_ORE = BLOCKS.registerBlock(
            "REINFORCED_EMERALD_ORE",
            properties -> new DropExperienceBlock(UniformInt.of(1, 3),
                    properties.requiresCorrectToolForDrops().sound(SoundType.STONE)
            )
    );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

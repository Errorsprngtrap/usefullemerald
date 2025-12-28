package net.spring.usefullemerald;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spring.usefullemerald.block.ModBlocks;
import net.spring.usefullemerald.items.ModItems;

import java.util.function.Supplier;

public class ModCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB,UsefullEmerald.MODID);

    public static final Supplier<CreativeModeTab> USEFULL_EMERALD_TAB = CREATIVE_MODE_TAB.register(
            "usefull_emerald_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EMERALD_NUGGET.get()))
            .title(Component.translatable("creativetab.usefull_emerald.emerald_nugget"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.EMERALD_NUGGET);
                        output.accept(ModItems.REINFORCED_EMERALD);
                        output.accept(ModItems.EMERALD_APPLE);
                        output.accept(ModItems.EMERALD_AXE);
                        output.accept(ModItems.EMERALD_SHOVEL);
                        output.accept(ModItems.EMERALD_SWORD);
                        output.accept(ModItems.EMERALD_PICKAXE);
                        output.accept(ModItems.EMERALD_HOE);
                        output.accept(ModItems.EMERALD_HELMET);
                        output.accept(ModItems.EMERALD_CHESTPLATE);
                        output.accept(ModItems.EMERALD_LEGGINGS);
                        output.accept(ModItems.EMERALD_BOOTS);
                        output.accept(ModItems.REINFORCED_EMERALD_HELMET);
                        output.accept(ModItems.REINFORCED_EMERALD_CHESTPLATE);
                        output.accept(ModItems.REINFORCED_EMERALD_LEGGINGS);
                        output.accept(ModItems.REINFORCED_EMERALD_BOOTS);
                        output.accept(ModBlocks.DEEPSLATE_REINFORCED_EMERALD_ORE);
                        output.accept(ModBlocks.REINFORCED_EMERALD_ORE);
                        output.accept(ModBlocks.REINFORCED_EMERALD_BLOCK);
                        output.accept(ModBlocks.GLOW_REINFORCED_EMERALD);
                        output.accept(ModItems.EMERALD_DAGGER);
                        output.accept(ModItems.EMERALD_RAPIER);

                    }).build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}

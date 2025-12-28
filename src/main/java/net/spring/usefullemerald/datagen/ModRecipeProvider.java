package net.spring.usefullemerald.datagen;

import com.jcraft.jorbis.Block;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.spring.usefullemerald.block.ModBlocks;
import net.spring.usefullemerald.items.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {

    protected ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {

        protected Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider,recipeOutput);
        }

        @Override
        public String getName() {
            return "My Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        List<ItemLike> ReinforcedEmerald_Smeltable = List.of(ModBlocks.REINFORCED_EMERALD_ORE,
                ModBlocks.DEEPSLATE_REINFORCED_EMERALD_ORE);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REINFORCED_EMERALD_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.REINFORCED_EMERALD.get())
                .unlockedBy("has_reinforced_emerald",has(ModItems.REINFORCED_EMERALD))
                .save(output);

        shapeless(RecipeCategory.MISC,ModItems.REINFORCED_EMERALD.get(),9)
                .requires(ModBlocks.REINFORCED_EMERALD_BLOCK)
                .unlockedBy("has_reinforced_emerald_block",has(ModBlocks.REINFORCED_EMERALD_BLOCK))
                .save(output);

        shapeless(RecipeCategory.MISC,ModItems.EMERALD_NUGGET.get(),9)
                .requires(Items.EMERALD)
                .unlockedBy("has_emerald",has(Items.EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOW_REINFORCED_EMERALD.get())
                .pattern("BBB")
                .pattern("BLB")
                .pattern("BBB")
                .define('B', ModItems.EMERALD_NUGGET.get())
                .define('L', Blocks.GLOWSTONE)
                .unlockedBy("has_emerald_nugget",has(ModItems.EMERALD_NUGGET))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" L ")
                .define('B', Items.EMERALD)
                .define('L', Items.STICK)
                .unlockedBy("has_emerald",has(Items.EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_PICKAXE.get())
                .pattern("BBB")
                .pattern(" L ")
                .pattern(" L ")
                .define('B', Items.EMERALD)
                .define('L', Items.STICK)
                .unlockedBy("has_emerald",has(Items.EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_HOE.get())
                .pattern(" BB")
                .pattern(" L ")
                .pattern(" L ")
                .define('B', Items.EMERALD)
                .define('L', Items.STICK)
                .unlockedBy("has_emerald",has(Items.EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_AXE.get())
                .pattern(" BB")
                .pattern(" LB")
                .pattern(" L ")
                .define('B', Items.EMERALD)
                .define('L', Items.STICK)
                .unlockedBy("has_emerald",has(Items.EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_SHOVEL.get())
                .pattern(" B ")
                .pattern(" L ")
                .pattern(" L ")
                .define('B', Items.EMERALD)
                .define('L', Items.STICK)
                .unlockedBy("has_emerald",has(Items.EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_DAGGER.get())
                .pattern("   ")
                .pattern(" B ")
                .pattern("L  ")
                .define('B', ModItems.REINFORCED_EMERALD.get())
                .define('L', Items.STICK)
                .unlockedBy("has_emerald",has(ModItems.REINFORCED_EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_RAPIER.get())
                .pattern("  B")
                .pattern(" B ")
                .pattern("L  ")
                .define('B', ModItems.REINFORCED_EMERALD.get())
                .define('L', Items.STICK)
                .unlockedBy("has_emerald",has(ModItems.REINFORCED_EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_HELMET.get())
                .pattern("BBB")
                .pattern("B B")
                .define('B', Items.EMERALD)
                .unlockedBy("has_emerald",has(Items.EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_BOOTS.get())
                .pattern("B B")
                .pattern("B B")
                .define('B', Items.EMERALD)
                .unlockedBy("has_emerald",has(Items.EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_LEGGINGS.get())
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .define('B', Items.EMERALD)
                .unlockedBy("has_emerald",has(Items.EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_CHESTPLATE.get())
                .pattern("B B")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.EMERALD)
                .unlockedBy("has_emerald",has(Items.EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.EMERALD_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('B', ModItems.REINFORCED_EMERALD.get())
                .define('A', Items.APPLE)
                .unlockedBy("has_emerald",has(Items.EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, Items.EMERALD)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.EMERALD_NUGGET)
                .unlockedBy("has_emerald_nugget",has(ModItems.EMERALD_NUGGET))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.REINFORCED_EMERALD_HELMET.get())
                .pattern("BBB")
                .pattern("B B")
                .define('B', ModItems.REINFORCED_EMERALD.get())
                .unlockedBy("has_reinforced_emerald",has(ModItems.REINFORCED_EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.REINFORCED_EMERALD_BOOTS.get())
                .pattern("B B")
                .pattern("B B")
                .define('B', ModItems.REINFORCED_EMERALD.get())
                .unlockedBy("has_reinforced_emerald",has(ModItems.REINFORCED_EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.REINFORCED_EMERALD_LEGGINGS.get())
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .define('B', ModItems.REINFORCED_EMERALD.get())
                .unlockedBy("has_reinforced_emerald",has(ModItems.REINFORCED_EMERALD))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.REINFORCED_EMERALD_CHESTPLATE.get())
                .pattern("B B")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.REINFORCED_EMERALD.get())
                .unlockedBy("has_reinforced_emerald",has(ModItems.REINFORCED_EMERALD))
                .save(output);

        oreSmelting(ReinforcedEmerald_Smeltable,RecipeCategory.MISC,ModItems.REINFORCED_EMERALD,10,200,"emerald");
        oreBlasting(ReinforcedEmerald_Smeltable,RecipeCategory.MISC,ModItems.REINFORCED_EMERALD,10,100,"emerald");

    }


}

package net.blacksoul.blacksoulsultimatestones.datagen;

import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
import net.blacksoul.blacksoulsultimatestones.block.ModItemGroups;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                //ANDESITE

                //ANDESITE BRICKS
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);
                createStairsRecipe(ModBlocks.ANDESITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS))
                        .criterion(hasItem(ModBlocks.ANDESITE_BRICKS), conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS))
                        .criterion(hasItem(ModBlocks.ANDESITE_BRICKS), conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.ANDESITE_BRICKS)
                        .criterion(hasItem(ModBlocks.ANDESITE_BRICKS), conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                        .offerTo(exporter);

                //ANDESITE PILLAR
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_PILLAR, Blocks.ANDESITE);

                //ANDESITE TILES
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILE_SLAB, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILE_STAIRS, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILE_WALL, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILE_SLAB, ModBlocks.ANDESITE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILE_STAIRS, ModBlocks.ANDESITE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILE_WALL, ModBlocks.ANDESITE_TILES);
                createStairsRecipe(ModBlocks.ANDESITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.ANDESITE_TILES))
                        .criterion(hasItem(ModBlocks.ANDESITE_TILES), conditionsFromItem(ModBlocks.ANDESITE_TILES))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILE_SLAB, Ingredient.ofItems(ModBlocks.ANDESITE_TILES))
                        .criterion(hasItem(ModBlocks.ANDESITE_TILES), conditionsFromItem(ModBlocks.ANDESITE_TILES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.ANDESITE_TILES)
                        .criterion(hasItem(ModBlocks.ANDESITE_TILES), conditionsFromItem(ModBlocks.ANDESITE_TILES))
                        .offerTo(exporter);

                //CHISELED ANDESITE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE, Blocks.ANDESITE);

                //COBBLED ANDESITE
                List<ItemConvertible> ANDESITE_SMELTABLES = List.of(ModBlocks.COBBLED_ANDESITE);
                offerSmelting(ANDESITE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, Blocks.ANDESITE, 0.1f, 200, "andesite");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ANDESITE_SLAB, ModBlocks.COBBLED_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ANDESITE_STAIRS, ModBlocks.COBBLED_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ANDESITE_WALL, ModBlocks.COBBLED_ANDESITE);
                createStairsRecipe(ModBlocks.COBBLED_ANDESITE_STAIRS, Ingredient.ofItems(ModBlocks.COBBLED_ANDESITE))
                        .criterion(hasItem(ModBlocks.COBBLED_ANDESITE), conditionsFromItem(ModBlocks.COBBLED_ANDESITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ANDESITE_SLAB, Ingredient.ofItems(ModBlocks.COBBLED_ANDESITE))
                        .criterion(hasItem(ModBlocks.COBBLED_ANDESITE), conditionsFromItem(ModBlocks.COBBLED_ANDESITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ANDESITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.COBBLED_ANDESITE)
                        .criterion(hasItem(ModBlocks.COBBLED_ANDESITE), conditionsFromItem(ModBlocks.COBBLED_ANDESITE))
                        .offerTo(exporter);

                //CRACKED ANDESITE BRICKS
                List<ItemConvertible> CRACKED_ANDESITE_BRICK_SMELTABLES = List.of(ModBlocks.ANDESITE_BRICKS);
                offerSmelting(CRACKED_ANDESITE_BRICK_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICKS, 0.1f, 200, "andesite");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, ModBlocks.CRACKED_ANDESITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS, ModBlocks.CRACKED_ANDESITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL, ModBlocks.CRACKED_ANDESITE_BRICKS);
                createStairsRecipe(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.CRACKED_ANDESITE_BRICKS))
                        .criterion(hasItem(ModBlocks.CRACKED_ANDESITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_ANDESITE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.CRACKED_ANDESITE_BRICKS))
                        .criterion(hasItem(ModBlocks.CRACKED_ANDESITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_ANDESITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICK_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.CRACKED_ANDESITE_BRICKS)
                        .criterion(hasItem(ModBlocks.CRACKED_ANDESITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_ANDESITE_BRICKS))
                        .offerTo(exporter);

                //CUT ANDESITE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_ANDESITE_SLAB, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_ANDESITE_STAIRS, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_ANDESITE_WALL, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_ANDESITE_SLAB, ModBlocks.CUT_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_ANDESITE_STAIRS, ModBlocks.CUT_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_ANDESITE_WALL, ModBlocks.CUT_ANDESITE);
                createStairsRecipe(ModBlocks.CUT_ANDESITE_STAIRS, Ingredient.ofItems(ModBlocks.CUT_ANDESITE))
                        .criterion(hasItem(ModBlocks.CUT_ANDESITE), conditionsFromItem(ModBlocks.CUT_ANDESITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_ANDESITE_SLAB, Ingredient.ofItems(ModBlocks.CUT_ANDESITE))
                        .criterion(hasItem(ModBlocks.CUT_ANDESITE), conditionsFromItem(ModBlocks.CUT_ANDESITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_ANDESITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.CUT_ANDESITE)
                        .criterion(hasItem(ModBlocks.CUT_ANDESITE), conditionsFromItem(ModBlocks.CUT_ANDESITE))
                        .offerTo(exporter);

                //DARK ANDESITE
                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_ANDESITE)
                        .input(Blocks.ANDESITE)
                        .input(Items.BLACK_DYE)
                        .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_ANDESITE_SLAB, ModBlocks.DARK_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_ANDESITE_STAIRS, ModBlocks.DARK_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_ANDESITE_WALL, ModBlocks.DARK_ANDESITE);
                createStairsRecipe(ModBlocks.DARK_ANDESITE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_ANDESITE))
                        .criterion(hasItem(ModBlocks.DARK_ANDESITE), conditionsFromItem(ModBlocks.DARK_ANDESITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_ANDESITE_SLAB, Ingredient.ofItems(ModBlocks.DARK_ANDESITE))
                        .criterion(hasItem(ModBlocks.DARK_ANDESITE), conditionsFromItem(ModBlocks.DARK_ANDESITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_ANDESITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.DARK_ANDESITE)
                        .criterion(hasItem(ModBlocks.DARK_ANDESITE), conditionsFromItem(ModBlocks.DARK_ANDESITE))
                        .offerTo(exporter);

                //POLISHED ANDESITE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.POLISHED_ANDESITE)
                        .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                        .offerTo(exporter);

                //SMOOTH ANDESITE
                List<ItemConvertible> SMOOTH_ANDESITE_SMELTABLES = List.of(Blocks.ANDESITE);
                offerSmelting(SMOOTH_ANDESITE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ANDESITE, 0.1f, 200, "andesite");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ANDESITE_SLAB, ModBlocks.SMOOTH_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ANDESITE_STAIRS, ModBlocks.SMOOTH_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ANDESITE_WALL, ModBlocks.SMOOTH_ANDESITE);
                createStairsRecipe(ModBlocks.SMOOTH_ANDESITE_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_ANDESITE))
                        .criterion(hasItem(ModBlocks.SMOOTH_ANDESITE), conditionsFromItem(ModBlocks.SMOOTH_ANDESITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ANDESITE_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_ANDESITE))
                        .criterion(hasItem(ModBlocks.SMOOTH_ANDESITE), conditionsFromItem(ModBlocks.SMOOTH_ANDESITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ANDESITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.SMOOTH_ANDESITE)
                        .criterion(hasItem(ModBlocks.SMOOTH_ANDESITE), conditionsFromItem(ModBlocks.SMOOTH_ANDESITE))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "BlackSoul's Ultimate Stones Recipes";
    }
}

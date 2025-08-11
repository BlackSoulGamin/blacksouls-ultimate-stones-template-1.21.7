package net.blacksoul.blacksoulsultimatestones.datagen;

import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
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
                //SMOOTHSTONE
                List<ItemConvertible> SMOOTHSTONE_SMELTABLES = List.of(ModBlocks.SMOOTH_STONE, ModBlocks.COBBLED_SMOOTHSTONE);
                offerSmelting(SMOOTHSTONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_STONE, 0.1f, 200, "stone");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_STAIRS, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_WALL, Blocks.SMOOTH_STONE);
                createStairsRecipe(ModBlocks.SMOOTHSTONE_STAIRS, Ingredient.ofItems(Blocks.SMOOTH_STONE))
                        .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.SMOOTH_STONE)
                        .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                        .offerTo(exporter);

                //SMOOTHSTONE BRICKS
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_BRICKS, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_BRICK_SLAB, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_BRICK_STAIRS, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_BRICK_WALL, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_BRICK_SLAB, ModBlocks.SMOOTHSTONE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_BRICK_STAIRS, ModBlocks.SMOOTHSTONE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_BRICK_WALL, ModBlocks.SMOOTHSTONE_BRICKS);
                createStairsRecipe(ModBlocks.SMOOTHSTONE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTHSTONE_BRICKS))
                        .criterion(hasItem(ModBlocks.SMOOTHSTONE_BRICKS), conditionsFromItem(ModBlocks.SMOOTHSTONE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.SMOOTHSTONE_BRICKS))
                        .criterion(hasItem(ModBlocks.SMOOTHSTONE_BRICKS), conditionsFromItem(ModBlocks.SMOOTHSTONE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_BRICK_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.SMOOTHSTONE_BRICKS)
                        .criterion(hasItem(ModBlocks.SMOOTHSTONE_BRICKS), conditionsFromItem(ModBlocks.SMOOTHSTONE_BRICKS))
                        .offerTo(exporter);

                //SMOOTHSTONE PILLAR
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_PILLAR, Blocks.SMOOTH_STONE);

                //SMOOTHSTONE TILES
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_TILES, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_TILE_SLAB, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_TILE_STAIRS, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_TILE_WALL, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_TILE_SLAB, ModBlocks.SMOOTHSTONE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_TILE_STAIRS, ModBlocks.SMOOTHSTONE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_TILE_WALL, ModBlocks.SMOOTHSTONE_TILES);
                createStairsRecipe(ModBlocks.SMOOTHSTONE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTHSTONE_TILES))
                        .criterion(hasItem(ModBlocks.SMOOTHSTONE_TILES), conditionsFromItem(ModBlocks.SMOOTHSTONE_TILES))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_TILE_SLAB, Ingredient.ofItems(ModBlocks.SMOOTHSTONE_TILES))
                        .criterion(hasItem(ModBlocks.SMOOTHSTONE_TILES), conditionsFromItem(ModBlocks.SMOOTHSTONE_TILES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTHSTONE_TILE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.SMOOTHSTONE_TILES)
                        .criterion(hasItem(ModBlocks.SMOOTHSTONE_TILES), conditionsFromItem(ModBlocks.SMOOTHSTONE_TILES))
                        .offerTo(exporter);

                //CHISELED SMOOTHSTONE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTHSTONE, Blocks.SMOOTH_STONE);

                //COBBLED SMOOTHSTONE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_SMOOTHSTONE_SLAB, ModBlocks.COBBLED_SMOOTHSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_SMOOTHSTONE_STAIRS, ModBlocks.COBBLED_SMOOTHSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_SMOOTHSTONE_WALL, ModBlocks.COBBLED_SMOOTHSTONE);
                createStairsRecipe(ModBlocks.COBBLED_SMOOTHSTONE_STAIRS, Ingredient.ofItems(ModBlocks.COBBLED_SMOOTHSTONE))
                        .criterion(hasItem(ModBlocks.COBBLED_SMOOTHSTONE), conditionsFromItem(ModBlocks.COBBLED_SMOOTHSTONE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_SMOOTHSTONE_SLAB, Ingredient.ofItems(ModBlocks.COBBLED_SMOOTHSTONE))
                        .criterion(hasItem(ModBlocks.COBBLED_SMOOTHSTONE), conditionsFromItem(ModBlocks.COBBLED_SMOOTHSTONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_SMOOTHSTONE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.COBBLED_SMOOTHSTONE)
                        .criterion(hasItem(ModBlocks.COBBLED_SMOOTHSTONE), conditionsFromItem(ModBlocks.COBBLED_SMOOTHSTONE))
                        .offerTo(exporter);

                //CRACKED SMOOTHSTONE BRICKS
                List<ItemConvertible> CRACKED_SMOOTHSTONE_BRICK_SMELTABLES = List.of(ModBlocks.SMOOTHSTONE_BRICKS);
                offerSmelting(CRACKED_SMOOTHSTONE_BRICK_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SMOOTHSTONE_BRICKS, 0.1f, 200, "smoothstone");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SMOOTHSTONE_BRICK_SLAB, ModBlocks.CRACKED_SMOOTHSTONE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SMOOTHSTONE_BRICK_STAIRS, ModBlocks.CRACKED_SMOOTHSTONE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SMOOTHSTONE_BRICK_WALL, ModBlocks.CRACKED_SMOOTHSTONE_BRICKS);
                createStairsRecipe(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS))
                        .criterion(hasItem(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SMOOTHSTONE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS))
                        .criterion(hasItem(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SMOOTHSTONE_BRICK_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.CRACKED_SMOOTHSTONE_BRICKS)
                        .criterion(hasItem(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS))
                        .offerTo(exporter);

                //CUT SMOOTHSTONE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SMOOTHSTONE_SLAB, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SMOOTHSTONE_STAIRS, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SMOOTHSTONE_WALL, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SMOOTHSTONE_SLAB, ModBlocks.CUT_SMOOTHSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SMOOTHSTONE_STAIRS, ModBlocks.CUT_SMOOTHSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SMOOTHSTONE_WALL, ModBlocks.CUT_SMOOTHSTONE);
                createStairsRecipe(ModBlocks.CUT_SMOOTHSTONE_STAIRS, Ingredient.ofItems(ModBlocks.CUT_SMOOTHSTONE))
                        .criterion(hasItem(ModBlocks.CUT_SMOOTHSTONE), conditionsFromItem(ModBlocks.CUT_SMOOTHSTONE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SMOOTHSTONE_SLAB, Ingredient.ofItems(ModBlocks.CUT_SMOOTHSTONE))
                        .criterion(hasItem(ModBlocks.CUT_SMOOTHSTONE), conditionsFromItem(ModBlocks.CUT_SMOOTHSTONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SMOOTHSTONE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.CUT_SMOOTHSTONE)
                        .criterion(hasItem(ModBlocks.CUT_SMOOTHSTONE), conditionsFromItem(ModBlocks.CUT_SMOOTHSTONE))
                        .offerTo(exporter);

                //DARK SMOOTHSTONE
                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SMOOTHSTONE)
                        .input(Blocks.SMOOTH_STONE)
                        .input(Items.BLACK_DYE)
                        .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SMOOTHSTONE_SLAB, ModBlocks.DARK_SMOOTHSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SMOOTHSTONE_STAIRS, ModBlocks.DARK_SMOOTHSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SMOOTHSTONE_WALL, ModBlocks.DARK_SMOOTHSTONE);
                createStairsRecipe(ModBlocks.DARK_SMOOTHSTONE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_SMOOTHSTONE))
                        .criterion(hasItem(ModBlocks.DARK_SMOOTHSTONE), conditionsFromItem(ModBlocks.DARK_SMOOTHSTONE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SMOOTHSTONE_SLAB, Ingredient.ofItems(ModBlocks.DARK_SMOOTHSTONE))
                        .criterion(hasItem(ModBlocks.DARK_SMOOTHSTONE), conditionsFromItem(ModBlocks.DARK_SMOOTHSTONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SMOOTHSTONE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.DARK_SMOOTHSTONE)
                        .criterion(hasItem(ModBlocks.DARK_SMOOTHSTONE), conditionsFromItem(ModBlocks.DARK_SMOOTHSTONE))
                        .offerTo(exporter);

                //POLISHED SMOOTHSTONE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SMOOTHSTONE_SLAB, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SMOOTHSTONE_STAIRS, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SMOOTHSTONE_WALL, Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SMOOTHSTONE_SLAB, ModBlocks.POLISHED_SMOOTHSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SMOOTHSTONE_STAIRS, ModBlocks.POLISHED_SMOOTHSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SMOOTHSTONE_WALL, ModBlocks.POLISHED_SMOOTHSTONE);
                createStairsRecipe(ModBlocks.POLISHED_SMOOTHSTONE_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_SMOOTHSTONE))
                        .criterion(hasItem(ModBlocks.POLISHED_SMOOTHSTONE), conditionsFromItem(ModBlocks.POLISHED_SMOOTHSTONE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SMOOTHSTONE_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_SMOOTHSTONE))
                        .criterion(hasItem(ModBlocks.POLISHED_SMOOTHSTONE), conditionsFromItem(ModBlocks.POLISHED_SMOOTHSTONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SMOOTHSTONE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.POLISHED_SMOOTHSTONE)
                        .criterion(hasItem(ModBlocks.POLISHED_SMOOTHSTONE), conditionsFromItem(ModBlocks.POLISHED_SMOOTHSTONE))
                        .offerTo(exporter);

                //SMOOTH SMOOTHSTONE
                List<ItemConvertible> SMOOTH_SMOOTHSTONE_SMELTABLES = List.of(Blocks.SMOOTH_STONE);
                offerSmelting(SMOOTH_SMOOTHSTONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SMOOTHSTONE, 0.1f, 200, "smoothstone");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SMOOTHSTONE_SLAB, ModBlocks.SMOOTH_SMOOTHSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SMOOTHSTONE_STAIRS, ModBlocks.SMOOTH_SMOOTHSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SMOOTHSTONE_WALL, ModBlocks.SMOOTH_SMOOTHSTONE);
                createStairsRecipe(ModBlocks.SMOOTH_SMOOTHSTONE_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_SMOOTHSTONE))
                        .criterion(hasItem(ModBlocks.SMOOTH_SMOOTHSTONE), conditionsFromItem(ModBlocks.SMOOTH_SMOOTHSTONE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SMOOTHSTONE_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_SMOOTHSTONE))
                        .criterion(hasItem(ModBlocks.SMOOTH_SMOOTHSTONE), conditionsFromItem(ModBlocks.SMOOTH_SMOOTHSTONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SMOOTHSTONE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.SMOOTH_SMOOTHSTONE)
                        .criterion(hasItem(ModBlocks.SMOOTH_SMOOTHSTONE), conditionsFromItem(ModBlocks.SMOOTH_SMOOTHSTONE))
                        .offerTo(exporter);

                //STONE
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.STONE)
                        .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                        .offerTo(exporter);

                //STONE PILLAR
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_PILLAR, Blocks.STONE);

                //STONE TILES
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILES, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_WALL, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, ModBlocks.STONE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, ModBlocks.STONE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_WALL, ModBlocks.STONE_TILES);
                createStairsRecipe(ModBlocks.STONE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.STONE_TILES))
                        .criterion(hasItem(ModBlocks.STONE_TILES), conditionsFromItem(ModBlocks.STONE_TILES))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, Ingredient.ofItems(ModBlocks.STONE_TILES))
                        .criterion(hasItem(ModBlocks.STONE_TILES), conditionsFromItem(ModBlocks.STONE_TILES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.STONE_TILES)
                        .criterion(hasItem(ModBlocks.STONE_TILES), conditionsFromItem(ModBlocks.STONE_TILES))
                        .offerTo(exporter);

                //CRACKED STONE BRICKS
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);
                createStairsRecipe(ModBlocks.CRACKED_STONE_BRICK_STAIRS, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                        .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                        .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.CRACKED_STONE_BRICKS)
                        .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                        .offerTo(exporter);

                //CUT STONE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STONE_SLAB, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STONE_STAIRS, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STONE_WALL, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STONE_SLAB, ModBlocks.CUT_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STONE_STAIRS, ModBlocks.CUT_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STONE_WALL, ModBlocks.CUT_STONE);
                createStairsRecipe(ModBlocks.CUT_STONE_STAIRS, Ingredient.ofItems(ModBlocks.CUT_STONE))
                        .criterion(hasItem(ModBlocks.CUT_STONE), conditionsFromItem(ModBlocks.CUT_STONE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STONE_SLAB, Ingredient.ofItems(ModBlocks.CUT_STONE))
                        .criterion(hasItem(ModBlocks.CUT_STONE), conditionsFromItem(ModBlocks.CUT_STONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STONE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.CUT_STONE)
                        .criterion(hasItem(ModBlocks.CUT_STONE), conditionsFromItem(ModBlocks.CUT_STONE))
                        .offerTo(exporter);

                //DARK STONE
                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_STONE)
                        .input(Blocks.STONE)
                        .input(Items.BLACK_DYE)
                        .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_STONE_SLAB, ModBlocks.DARK_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_STONE_STAIRS, ModBlocks.DARK_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_STONE_WALL, ModBlocks.DARK_STONE);
                createStairsRecipe(ModBlocks.DARK_STONE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_STONE))
                        .criterion(hasItem(ModBlocks.DARK_STONE), conditionsFromItem(ModBlocks.DARK_STONE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_STONE_SLAB, Ingredient.ofItems(ModBlocks.DARK_STONE))
                        .criterion(hasItem(ModBlocks.DARK_STONE), conditionsFromItem(ModBlocks.DARK_STONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_STONE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.DARK_STONE)
                        .criterion(hasItem(ModBlocks.DARK_STONE), conditionsFromItem(ModBlocks.DARK_STONE))
                        .offerTo(exporter);

                //POLISHED STONE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE_SLAB, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE_STAIRS, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE_WALL, Blocks.STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE_SLAB, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE_STAIRS, ModBlocks.POLISHED_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE_WALL, ModBlocks.POLISHED_STONE);
                createStairsRecipe(ModBlocks.POLISHED_STONE_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_STONE))
                        .criterion(hasItem(ModBlocks.POLISHED_STONE), conditionsFromItem(ModBlocks.POLISHED_STONE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_STONE))
                        .criterion(hasItem(ModBlocks.POLISHED_STONE), conditionsFromItem(ModBlocks.POLISHED_STONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_STONE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.POLISHED_STONE)
                        .criterion(hasItem(ModBlocks.POLISHED_STONE), conditionsFromItem(ModBlocks.POLISHED_STONE))
                        .offerTo(exporter);

                //SMOOTH STONE
                List<ItemConvertible> SMOOTH_STONE_SMELTABLES = List.of(Blocks.STONE);
                offerSmelting(SMOOTH_STONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE, 0.1f, 200, "stone");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_SLAB, ModBlocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, ModBlocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL, ModBlocks.SMOOTH_STONE);
                createStairsRecipe(ModBlocks.SMOOTH_STONE_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_STONE))
                        .criterion(hasItem(ModBlocks.SMOOTH_STONE), conditionsFromItem(ModBlocks.SMOOTH_STONE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_STONE))
                        .criterion(hasItem(ModBlocks.SMOOTH_STONE), conditionsFromItem(ModBlocks.SMOOTH_STONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.SMOOTH_STONE)
                        .criterion(hasItem(ModBlocks.SMOOTH_STONE), conditionsFromItem(ModBlocks.SMOOTH_STONE))
                        .offerTo(exporter);

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

                //DIORITE

                //DIORITE BRICKS
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);
                createStairsRecipe(ModBlocks.DIORITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.DIORITE_BRICKS))
                        .criterion(hasItem(ModBlocks.DIORITE_BRICKS), conditionsFromItem(ModBlocks.DIORITE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.DIORITE_BRICKS))
                        .criterion(hasItem(ModBlocks.DIORITE_BRICKS), conditionsFromItem(ModBlocks.DIORITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.DIORITE_BRICKS)
                        .criterion(hasItem(ModBlocks.DIORITE_BRICKS), conditionsFromItem(ModBlocks.DIORITE_BRICKS))
                        .offerTo(exporter);

                //DIORITE PILLAR
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_PILLAR, Blocks.DIORITE);

                //DIORITE TILES
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILE_SLAB, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILE_STAIRS, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILE_WALL, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILE_SLAB, ModBlocks.DIORITE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILE_STAIRS, ModBlocks.DIORITE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILE_WALL, ModBlocks.DIORITE_TILES);
                createStairsRecipe(ModBlocks.DIORITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.DIORITE_TILES))
                        .criterion(hasItem(ModBlocks.DIORITE_TILES), conditionsFromItem(ModBlocks.DIORITE_TILES))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILE_SLAB, Ingredient.ofItems(ModBlocks.DIORITE_TILES))
                        .criterion(hasItem(ModBlocks.DIORITE_TILES), conditionsFromItem(ModBlocks.DIORITE_TILES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.DIORITE_TILES)
                        .criterion(hasItem(ModBlocks.DIORITE_TILES), conditionsFromItem(ModBlocks.DIORITE_TILES))
                        .offerTo(exporter);

                //CHISELED DIORITE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE, Blocks.DIORITE);

                //COBBLED DIORITE
                List<ItemConvertible> DIORITE_SMELTABLES = List.of(ModBlocks.COBBLED_DIORITE);
                offerSmelting(DIORITE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, Blocks.DIORITE, 0.1f, 200, "diorite");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_DIORITE_SLAB, ModBlocks.COBBLED_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_DIORITE_STAIRS, ModBlocks.COBBLED_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_DIORITE_WALL, ModBlocks.COBBLED_DIORITE);
                createStairsRecipe(ModBlocks.COBBLED_DIORITE_STAIRS, Ingredient.ofItems(ModBlocks.COBBLED_DIORITE))
                        .criterion(hasItem(ModBlocks.COBBLED_DIORITE), conditionsFromItem(ModBlocks.COBBLED_DIORITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_DIORITE_SLAB, Ingredient.ofItems(ModBlocks.COBBLED_DIORITE))
                        .criterion(hasItem(ModBlocks.COBBLED_DIORITE), conditionsFromItem(ModBlocks.COBBLED_DIORITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_DIORITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.COBBLED_DIORITE)
                        .criterion(hasItem(ModBlocks.COBBLED_DIORITE), conditionsFromItem(ModBlocks.COBBLED_DIORITE))
                        .offerTo(exporter);

                //CRACKED DIORITE BRICKS
                List<ItemConvertible> CRACKED_DIORITE_BRICK_SMELTABLES = List.of(ModBlocks.DIORITE_BRICKS);
                offerSmelting(CRACKED_DIORITE_BRICK_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICKS, 0.1f, 200, "diorite");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB, ModBlocks.CRACKED_DIORITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_STAIRS, ModBlocks.CRACKED_DIORITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_WALL, ModBlocks.CRACKED_DIORITE_BRICKS);
                createStairsRecipe(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.CRACKED_DIORITE_BRICKS))
                        .criterion(hasItem(ModBlocks.CRACKED_DIORITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_DIORITE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.CRACKED_DIORITE_BRICKS))
                        .criterion(hasItem(ModBlocks.CRACKED_DIORITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_DIORITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICK_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.CRACKED_DIORITE_BRICKS)
                        .criterion(hasItem(ModBlocks.CRACKED_DIORITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_DIORITE_BRICKS))
                        .offerTo(exporter);

                //CUT DIORITE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_DIORITE_SLAB, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_DIORITE_STAIRS, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_DIORITE_WALL, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_DIORITE_SLAB, ModBlocks.CUT_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_DIORITE_STAIRS, ModBlocks.CUT_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_DIORITE_WALL, ModBlocks.CUT_DIORITE);
                createStairsRecipe(ModBlocks.CUT_DIORITE_STAIRS, Ingredient.ofItems(ModBlocks.CUT_DIORITE))
                        .criterion(hasItem(ModBlocks.CUT_DIORITE), conditionsFromItem(ModBlocks.CUT_DIORITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_DIORITE_SLAB, Ingredient.ofItems(ModBlocks.CUT_DIORITE))
                        .criterion(hasItem(ModBlocks.CUT_DIORITE), conditionsFromItem(ModBlocks.CUT_DIORITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_DIORITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.CUT_DIORITE)
                        .criterion(hasItem(ModBlocks.CUT_DIORITE), conditionsFromItem(ModBlocks.CUT_DIORITE))
                        .offerTo(exporter);

                //DARK DIORITE
                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_DIORITE)
                        .input(Blocks.DIORITE)
                        .input(Items.BLACK_DYE)
                        .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_DIORITE_SLAB, ModBlocks.DARK_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_DIORITE_STAIRS, ModBlocks.DARK_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_DIORITE_WALL, ModBlocks.DARK_DIORITE);
                createStairsRecipe(ModBlocks.DARK_DIORITE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_DIORITE))
                        .criterion(hasItem(ModBlocks.DARK_DIORITE), conditionsFromItem(ModBlocks.DARK_DIORITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_DIORITE_SLAB, Ingredient.ofItems(ModBlocks.DARK_DIORITE))
                        .criterion(hasItem(ModBlocks.DARK_DIORITE), conditionsFromItem(ModBlocks.DARK_DIORITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_DIORITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.DARK_DIORITE)
                        .criterion(hasItem(ModBlocks.DARK_DIORITE), conditionsFromItem(ModBlocks.DARK_DIORITE))
                        .offerTo(exporter);

                //POLISHED DIORITE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.POLISHED_DIORITE)
                        .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                        .offerTo(exporter);

                //SMOOTH DIORITE
                List<ItemConvertible> SMOOTH_DIORITE_SMELTABLES = List.of(Blocks.DIORITE);
                offerSmelting(SMOOTH_DIORITE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DIORITE, 0.1f, 200, "diorite");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DIORITE_SLAB, ModBlocks.SMOOTH_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DIORITE_STAIRS, ModBlocks.SMOOTH_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DIORITE_WALL, ModBlocks.SMOOTH_DIORITE);
                createStairsRecipe(ModBlocks.SMOOTH_DIORITE_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_DIORITE))
                        .criterion(hasItem(ModBlocks.SMOOTH_DIORITE), conditionsFromItem(ModBlocks.SMOOTH_DIORITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DIORITE_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_DIORITE))
                        .criterion(hasItem(ModBlocks.SMOOTH_DIORITE), conditionsFromItem(ModBlocks.SMOOTH_DIORITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DIORITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.SMOOTH_DIORITE)
                        .criterion(hasItem(ModBlocks.SMOOTH_DIORITE), conditionsFromItem(ModBlocks.SMOOTH_DIORITE))
                        .offerTo(exporter);

                //GRANITE

                //GRANITE BRICKS
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);
                createStairsRecipe(ModBlocks.GRANITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.GRANITE_BRICKS))
                        .criterion(hasItem(ModBlocks.GRANITE_BRICKS), conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.GRANITE_BRICKS))
                        .criterion(hasItem(ModBlocks.GRANITE_BRICKS), conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.GRANITE_BRICKS)
                        .criterion(hasItem(ModBlocks.GRANITE_BRICKS), conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                        .offerTo(exporter);

                //GRANITE PILLAR
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_PILLAR, Blocks.GRANITE);

                //GRANITE TILES
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_SLAB, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_STAIRS, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_WALL, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_SLAB, ModBlocks.GRANITE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_STAIRS, ModBlocks.GRANITE_TILES);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_WALL, ModBlocks.GRANITE_TILES);
                createStairsRecipe(ModBlocks.GRANITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.GRANITE_TILES))
                        .criterion(hasItem(ModBlocks.GRANITE_TILES), conditionsFromItem(ModBlocks.GRANITE_TILES))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_SLAB, Ingredient.ofItems(ModBlocks.GRANITE_TILES))
                        .criterion(hasItem(ModBlocks.GRANITE_TILES), conditionsFromItem(ModBlocks.GRANITE_TILES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.GRANITE_TILES)
                        .criterion(hasItem(ModBlocks.GRANITE_TILES), conditionsFromItem(ModBlocks.GRANITE_TILES))
                        .offerTo(exporter);

                //CHISELED GRANITE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE, Blocks.GRANITE);

                //COBBLED GRANITE
                List<ItemConvertible> GRANITE_SMELTABLES = List.of(ModBlocks.COBBLED_GRANITE);
                offerSmelting(GRANITE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, Blocks.GRANITE, 0.1f, 200, "granite");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_GRANITE_SLAB, ModBlocks.COBBLED_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_GRANITE_STAIRS, ModBlocks.COBBLED_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_GRANITE_WALL, ModBlocks.COBBLED_GRANITE);
                createStairsRecipe(ModBlocks.COBBLED_GRANITE_STAIRS, Ingredient.ofItems(ModBlocks.COBBLED_GRANITE))
                        .criterion(hasItem(ModBlocks.COBBLED_GRANITE), conditionsFromItem(ModBlocks.COBBLED_GRANITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_GRANITE_SLAB, Ingredient.ofItems(ModBlocks.COBBLED_GRANITE))
                        .criterion(hasItem(ModBlocks.COBBLED_GRANITE), conditionsFromItem(ModBlocks.COBBLED_GRANITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_GRANITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.COBBLED_GRANITE)
                        .criterion(hasItem(ModBlocks.COBBLED_GRANITE), conditionsFromItem(ModBlocks.COBBLED_GRANITE))
                        .offerTo(exporter);

                //CRACKED GRANITE BRICKS
                List<ItemConvertible> CRACKED_GRANITE_BRICK_SMELTABLES = List.of(ModBlocks.GRANITE_BRICKS);
                offerSmelting(CRACKED_GRANITE_BRICK_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICKS, 0.1f, 200, "granite");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB, ModBlocks.CRACKED_GRANITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS, ModBlocks.CRACKED_GRANITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL, ModBlocks.CRACKED_GRANITE_BRICKS);
                createStairsRecipe(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.CRACKED_GRANITE_BRICKS))
                        .criterion(hasItem(ModBlocks.CRACKED_GRANITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_GRANITE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.CRACKED_GRANITE_BRICKS))
                        .criterion(hasItem(ModBlocks.CRACKED_GRANITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_GRANITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.CRACKED_GRANITE_BRICKS)
                        .criterion(hasItem(ModBlocks.CRACKED_GRANITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_GRANITE_BRICKS))
                        .offerTo(exporter);

                //CUT GRANITE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_GRANITE_SLAB, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_GRANITE_STAIRS, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_GRANITE_WALL, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_GRANITE_SLAB, ModBlocks.CUT_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_GRANITE_STAIRS, ModBlocks.CUT_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_GRANITE_WALL, ModBlocks.CUT_GRANITE);
                createStairsRecipe(ModBlocks.CUT_GRANITE_STAIRS, Ingredient.ofItems(ModBlocks.CUT_GRANITE))
                        .criterion(hasItem(ModBlocks.CUT_GRANITE), conditionsFromItem(ModBlocks.CUT_GRANITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_GRANITE_SLAB, Ingredient.ofItems(ModBlocks.CUT_GRANITE))
                        .criterion(hasItem(ModBlocks.CUT_GRANITE), conditionsFromItem(ModBlocks.CUT_GRANITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_GRANITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.CUT_GRANITE)
                        .criterion(hasItem(ModBlocks.CUT_GRANITE), conditionsFromItem(ModBlocks.CUT_GRANITE))
                        .offerTo(exporter);

                //DARK GRANITE
                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRANITE)
                        .input(Blocks.GRANITE)
                        .input(Items.BLACK_DYE)
                        .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRANITE_SLAB, ModBlocks.DARK_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRANITE_STAIRS, ModBlocks.DARK_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRANITE_WALL, ModBlocks.DARK_GRANITE);
                createStairsRecipe(ModBlocks.DARK_GRANITE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_GRANITE))
                        .criterion(hasItem(ModBlocks.DARK_GRANITE), conditionsFromItem(ModBlocks.DARK_GRANITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRANITE_SLAB, Ingredient.ofItems(ModBlocks.DARK_GRANITE))
                        .criterion(hasItem(ModBlocks.DARK_GRANITE), conditionsFromItem(ModBlocks.DARK_GRANITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRANITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.DARK_GRANITE)
                        .criterion(hasItem(ModBlocks.DARK_GRANITE), conditionsFromItem(ModBlocks.DARK_GRANITE))
                        .offerTo(exporter);

                //POLISHED GRANITE
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.POLISHED_GRANITE)
                        .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                        .offerTo(exporter);

                //SMOOTH GRANITE
                List<ItemConvertible> SMOOTH_GRANITE_SMELTABLES = List.of(Blocks.GRANITE);
                offerSmelting(SMOOTH_GRANITE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GRANITE, 0.1f, 200, "granite");
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GRANITE_SLAB, ModBlocks.SMOOTH_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GRANITE_STAIRS, ModBlocks.SMOOTH_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GRANITE_WALL, ModBlocks.SMOOTH_GRANITE);
                createStairsRecipe(ModBlocks.SMOOTH_GRANITE_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_GRANITE))
                        .criterion(hasItem(ModBlocks.SMOOTH_GRANITE), conditionsFromItem(ModBlocks.SMOOTH_GRANITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GRANITE_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_GRANITE))
                        .criterion(hasItem(ModBlocks.SMOOTH_GRANITE), conditionsFromItem(ModBlocks.SMOOTH_GRANITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GRANITE_WALL, 6)
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.SMOOTH_GRANITE)
                        .criterion(hasItem(ModBlocks.SMOOTH_GRANITE), conditionsFromItem(ModBlocks.SMOOTH_GRANITE))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "BlackSoul's Ultimate Stones Recipes";
    }
}

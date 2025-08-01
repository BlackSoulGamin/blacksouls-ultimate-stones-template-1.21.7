package net.blacksoul.blacksoulsultimatestones.datagen;

import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
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
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.ANDESITE, ModBlocks.ANDESITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICK_SLAB);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICK_STAIRS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICK_WALL);
            }
        };
    }

    @Override
    public String getName() {
        return "BlackSoul's Ultimate Stones Recipes";
    }
}

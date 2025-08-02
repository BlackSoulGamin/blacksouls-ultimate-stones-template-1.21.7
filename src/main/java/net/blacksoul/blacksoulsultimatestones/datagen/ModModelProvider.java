package net.blacksoul.blacksoulsultimatestones.datagen;

import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.TexturedModel;
import net.minecraft.data.family.BlockFamily;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //ANDESITE

        //ANDESITE BRICKS
        BlockStateModelGenerator.BlockTexturePool andesiteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS);
        andesiteBrickPool.stairs(ModBlocks.ANDESITE_BRICK_STAIRS);
        andesiteBrickPool.slab(ModBlocks.ANDESITE_BRICK_SLAB);
        andesiteBrickPool.wall(ModBlocks.ANDESITE_BRICK_WALL);

        //ANDESITE PILLAR
        blockStateModelGenerator.registerAxisRotated(ModBlocks.ANDESITE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

        //ANDESITE TILES
        BlockStateModelGenerator.BlockTexturePool andesiteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_TILES);
        andesiteTilePool.stairs(ModBlocks.ANDESITE_TILE_STAIRS);
        andesiteTilePool.slab(ModBlocks.ANDESITE_TILE_SLAB);
        andesiteTilePool.wall(ModBlocks.ANDESITE_TILE_WALL);

        //CHISELED ANDESITE
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_ANDESITE);

        //COBBLED ANDESITE
        BlockStateModelGenerator.BlockTexturePool cobbledAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_ANDESITE);
        cobbledAndesitePool.stairs(ModBlocks.COBBLED_ANDESITE_STAIRS);
        cobbledAndesitePool.slab(ModBlocks.COBBLED_ANDESITE_SLAB);
        cobbledAndesitePool.wall(ModBlocks.COBBLED_ANDESITE_WALL);

        //CRACKED ANDESITE BRICKS
        BlockStateModelGenerator.BlockTexturePool crackedAndesiteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_ANDESITE_BRICKS);
        crackedAndesiteBrickPool.stairs(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
        crackedAndesiteBrickPool.slab(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB);
        crackedAndesiteBrickPool.wall(ModBlocks.CRACKED_ANDESITE_BRICK_WALL);

        //CUT ANDESITE
        blockStateModelGenerator.registerSingleton(ModBlocks.CUT_ANDESITE, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

        //DARK ANDESITE
        BlockStateModelGenerator.BlockTexturePool darkAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_ANDESITE);
        darkAndesitePool.stairs(ModBlocks.DARK_ANDESITE_STAIRS);
        darkAndesitePool.slab(ModBlocks.DARK_ANDESITE_SLAB);
        darkAndesitePool.wall(ModBlocks.DARK_ANDESITE_WALL);

        //POLISHED ANDESITE
        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        polishedAndesitePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);

        //SMOOTH ANDESITE
        BlockStateModelGenerator.BlockTexturePool smoothAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_ANDESITE);
        smoothAndesitePool.stairs(ModBlocks.SMOOTH_ANDESITE_STAIRS);
        smoothAndesitePool.slab(ModBlocks.SMOOTH_ANDESITE_SLAB);
        smoothAndesitePool.wall(ModBlocks.SMOOTH_ANDESITE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}

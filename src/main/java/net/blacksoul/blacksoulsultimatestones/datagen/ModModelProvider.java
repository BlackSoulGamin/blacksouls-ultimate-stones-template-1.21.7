package net.blacksoul.blacksoulsultimatestones.datagen;

import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //SMOOTHSTONE
        BlockStateModelGenerator.BlockTexturePool smoothstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        smoothstonePool.stairs(ModBlocks.SMOOTHSTONE_STAIRS);
        smoothstonePool.wall(ModBlocks.SMOOTHSTONE_WALL);

        //SMOOTHSTONE BRICKS
        BlockStateModelGenerator.BlockTexturePool smoothstoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTHSTONE_BRICKS);
        smoothstoneBrickPool.stairs(ModBlocks.SMOOTHSTONE_BRICK_STAIRS);
        smoothstoneBrickPool.slab(ModBlocks.SMOOTHSTONE_BRICK_SLAB);
        smoothstoneBrickPool.wall(ModBlocks.SMOOTHSTONE_BRICK_WALL);

        //SMOOTHSTONE PILLAR
        blockStateModelGenerator.registerAxisRotated(ModBlocks.SMOOTHSTONE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

        //SMOOTHSTONE TILES
        BlockStateModelGenerator.BlockTexturePool smoothstoneTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTHSTONE_TILES);
        smoothstoneTilePool.stairs(ModBlocks.SMOOTHSTONE_TILE_STAIRS);
        smoothstoneTilePool.slab(ModBlocks.SMOOTHSTONE_TILE_SLAB);
        smoothstoneTilePool.wall(ModBlocks.SMOOTHSTONE_TILE_WALL);

        //CHISELED SMOOTHSTONE
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_SMOOTHSTONE);

        //COBBLED SMOOTHSTONE
        BlockStateModelGenerator.BlockTexturePool cobbledSmoothstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_SMOOTHSTONE);
        cobbledSmoothstonePool.stairs(ModBlocks.COBBLED_SMOOTHSTONE_STAIRS);
        cobbledSmoothstonePool.slab(ModBlocks.COBBLED_SMOOTHSTONE_SLAB);
        cobbledSmoothstonePool.wall(ModBlocks.COBBLED_SMOOTHSTONE_WALL);

        //CRACKED SMOOTHSTONE BRICKS
        BlockStateModelGenerator.BlockTexturePool crackedSmoothstoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS);
        crackedSmoothstoneBrickPool.stairs(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_STAIRS);
        crackedSmoothstoneBrickPool.slab(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_SLAB);
        crackedSmoothstoneBrickPool.wall(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_WALL);

        //CUT SMOOTHSTONE
        blockStateModelGenerator.registerSingleton(ModBlocks.CUT_SMOOTHSTONE, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

        //DARK SMOOTHSTONE
        BlockStateModelGenerator.BlockTexturePool darkSmoothstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_SMOOTHSTONE);
        darkSmoothstonePool.stairs(ModBlocks.DARK_SMOOTHSTONE_STAIRS);
        darkSmoothstonePool.slab(ModBlocks.DARK_SMOOTHSTONE_SLAB);
        darkSmoothstonePool.wall(ModBlocks.DARK_SMOOTHSTONE_WALL);

        //POLISHED SMOOTHSTONE
        BlockStateModelGenerator.BlockTexturePool polishedSmoothstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_SMOOTHSTONE);
        polishedSmoothstonePool.stairs(ModBlocks.POLISHED_SMOOTHSTONE_STAIRS);
        polishedSmoothstonePool.slab(ModBlocks.POLISHED_SMOOTHSTONE_SLAB);
        polishedSmoothstonePool.wall(ModBlocks.POLISHED_SMOOTHSTONE_WALL);

        //SMOOTH SMOOTHSTONE
        BlockStateModelGenerator.BlockTexturePool smoothSmoothstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_SMOOTHSTONE);
        smoothSmoothstonePool.stairs(ModBlocks.SMOOTH_SMOOTHSTONE_STAIRS);
        smoothSmoothstonePool.slab(ModBlocks.SMOOTH_SMOOTHSTONE_SLAB);
        smoothSmoothstonePool.wall(ModBlocks.SMOOTH_SMOOTHSTONE_WALL);

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

        //DIORITE

        //DIORITE BRICKS
        BlockStateModelGenerator.BlockTexturePool dioriteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS);
        dioriteBrickPool.stairs(ModBlocks.DIORITE_BRICK_STAIRS);
        dioriteBrickPool.slab(ModBlocks.DIORITE_BRICK_SLAB);
        dioriteBrickPool.wall(ModBlocks.DIORITE_BRICK_WALL);

        //DIORITE PILLAR
        blockStateModelGenerator.registerAxisRotated(ModBlocks.DIORITE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

        //DIORITE TILES
        BlockStateModelGenerator.BlockTexturePool dioriteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_TILES);
        dioriteTilePool.stairs(ModBlocks.DIORITE_TILE_STAIRS);
        dioriteTilePool.slab(ModBlocks.DIORITE_TILE_SLAB);
        dioriteTilePool.wall(ModBlocks.DIORITE_TILE_WALL);

        //CHISELED DIORITE
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_DIORITE);

        //COBBLED DIORITE
        BlockStateModelGenerator.BlockTexturePool cobbledDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_DIORITE);
        cobbledDioritePool.stairs(ModBlocks.COBBLED_DIORITE_STAIRS);
        cobbledDioritePool.slab(ModBlocks.COBBLED_DIORITE_SLAB);
        cobbledDioritePool.wall(ModBlocks.COBBLED_DIORITE_WALL);

        //CRACKED DIORITE BRICKS
        BlockStateModelGenerator.BlockTexturePool crackedDioriteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_DIORITE_BRICKS);
        crackedDioriteBrickPool.stairs(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS);
        crackedDioriteBrickPool.slab(ModBlocks.CRACKED_DIORITE_BRICK_SLAB);
        crackedDioriteBrickPool.wall(ModBlocks.CRACKED_DIORITE_BRICK_WALL);

        //CUT DIORITE
        blockStateModelGenerator.registerSingleton(ModBlocks.CUT_DIORITE, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

        //DARK DIORITE
        BlockStateModelGenerator.BlockTexturePool darkDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_DIORITE);
        darkDioritePool.stairs(ModBlocks.DARK_DIORITE_STAIRS);
        darkDioritePool.slab(ModBlocks.DARK_DIORITE_SLAB);
        darkDioritePool.wall(ModBlocks.DARK_DIORITE_WALL);

        //POLISHED DIORITE
        BlockStateModelGenerator.BlockTexturePool polishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        polishedDioritePool.wall(ModBlocks.POLISHED_DIORITE_WALL);

        //SMOOTH DIORITE
        BlockStateModelGenerator.BlockTexturePool smoothDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_DIORITE);
        smoothDioritePool.stairs(ModBlocks.SMOOTH_DIORITE_STAIRS);
        smoothDioritePool.slab(ModBlocks.SMOOTH_DIORITE_SLAB);
        smoothDioritePool.wall(ModBlocks.SMOOTH_DIORITE_WALL);

        //GRANITE

        //GRANITE BRICKS
        BlockStateModelGenerator.BlockTexturePool graniteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS);
        graniteBrickPool.stairs(ModBlocks.GRANITE_BRICK_STAIRS);
        graniteBrickPool.slab(ModBlocks.GRANITE_BRICK_SLAB);
        graniteBrickPool.wall(ModBlocks.GRANITE_BRICK_WALL);

        //GRANITE PILLAR
        blockStateModelGenerator.registerAxisRotated(ModBlocks.GRANITE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

        //GRANITE TILES
        BlockStateModelGenerator.BlockTexturePool graniteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_TILES);
        graniteTilePool.stairs(ModBlocks.GRANITE_TILE_STAIRS);
        graniteTilePool.slab(ModBlocks.GRANITE_TILE_SLAB);
        graniteTilePool.wall(ModBlocks.GRANITE_TILE_WALL);

        //CHISELED GRANITE
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_GRANITE);

        //COBBLED GRANITE
        BlockStateModelGenerator.BlockTexturePool cobbledGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_GRANITE);
        cobbledGranitePool.stairs(ModBlocks.COBBLED_GRANITE_STAIRS);
        cobbledGranitePool.slab(ModBlocks.COBBLED_GRANITE_SLAB);
        cobbledGranitePool.wall(ModBlocks.COBBLED_GRANITE_WALL);

        //CRACKED GRANITE BRICKS
        BlockStateModelGenerator.BlockTexturePool crackedGraniteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_GRANITE_BRICKS);
        crackedGraniteBrickPool.stairs(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS);
        crackedGraniteBrickPool.slab(ModBlocks.CRACKED_GRANITE_BRICK_SLAB);
        crackedGraniteBrickPool.wall(ModBlocks.CRACKED_GRANITE_BRICK_WALL);

        //CUT GRANITE
        blockStateModelGenerator.registerSingleton(ModBlocks.CUT_GRANITE, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

        //DARK GRANITE
        BlockStateModelGenerator.BlockTexturePool darkGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_GRANITE);
        darkGranitePool.stairs(ModBlocks.DARK_GRANITE_STAIRS);
        darkGranitePool.slab(ModBlocks.DARK_GRANITE_SLAB);
        darkGranitePool.wall(ModBlocks.DARK_GRANITE_WALL);

        //POLISHED GRANITE
        BlockStateModelGenerator.BlockTexturePool polishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        polishedGranitePool.wall(ModBlocks.POLISHED_GRANITE_WALL);

        //SMOOTH GRANITE
        BlockStateModelGenerator.BlockTexturePool smoothGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_GRANITE);
        smoothGranitePool.stairs(ModBlocks.SMOOTH_GRANITE_STAIRS);
        smoothGranitePool.slab(ModBlocks.SMOOTH_GRANITE_SLAB);
        smoothGranitePool.wall(ModBlocks.SMOOTH_GRANITE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}

package net.blacksoul.blacksoulsultimatestones.datagen;

import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider{

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                //SMOOTHSTONE
                .add(Blocks.SMOOTH_STONE)
                .add(ModBlocks.SMOOTHSTONE_STAIRS)
                .add(ModBlocks.SMOOTHSTONE_WALL)

                //SMOOTHSTONE BRICKS
                .add(ModBlocks.SMOOTHSTONE_BRICKS)
                .add(ModBlocks.SMOOTHSTONE_BRICK_SLAB)
                .add(ModBlocks.SMOOTHSTONE_BRICK_STAIRS)
                .add(ModBlocks.SMOOTHSTONE_BRICK_WALL)

                //SMOOTHSTONE PILLAR
                .add(ModBlocks.SMOOTHSTONE_PILLAR)

                //SMOOTHSTONE TILES
                .add(ModBlocks.SMOOTHSTONE_TILES)
                .add(ModBlocks.SMOOTHSTONE_TILE_SLAB)
                .add(ModBlocks.SMOOTHSTONE_TILE_STAIRS)
                .add(ModBlocks.SMOOTHSTONE_TILE_WALL)

                //CHISELED SMOOTHSTONE
                .add(ModBlocks.CHISELED_SMOOTHSTONE)

                //COBBLED SMOOTHSTONE
                .add(ModBlocks.COBBLED_SMOOTHSTONE)
                .add(ModBlocks.COBBLED_SMOOTHSTONE_SLAB)
                .add(ModBlocks.COBBLED_SMOOTHSTONE_STAIRS)
                .add(ModBlocks.COBBLED_SMOOTHSTONE_WALL)

                //CRACKED SMOOTHSTONE BRICKS
                .add(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS)
                .add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_SLAB)
                .add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_STAIRS)
                .add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_WALL)

                //CUT SMOOTHSTONE
                .add(ModBlocks.CUT_SMOOTHSTONE)
                .add(ModBlocks.CUT_SMOOTHSTONE_SLAB)
                .add(ModBlocks.CUT_SMOOTHSTONE_STAIRS)
                .add(ModBlocks.CUT_SMOOTHSTONE_WALL)

                //DARK SMOOTHSTONE
                .add(ModBlocks.DARK_SMOOTHSTONE)
                .add(ModBlocks.DARK_SMOOTHSTONE_SLAB)
                .add(ModBlocks.DARK_SMOOTHSTONE_STAIRS)
                .add(ModBlocks.DARK_SMOOTHSTONE_WALL)

                //POLISHED SMOOTHSTONE
                .add(ModBlocks.POLISHED_SMOOTHSTONE)
                .add(ModBlocks.POLISHED_SMOOTHSTONE_SLAB)
                .add(ModBlocks.POLISHED_SMOOTHSTONE_STAIRS)
                .add(ModBlocks.POLISHED_SMOOTHSTONE_WALL)

                //SMOOTH SMOOTHSTONE
                .add(ModBlocks.SMOOTH_SMOOTHSTONE)
                .add(ModBlocks.SMOOTH_SMOOTHSTONE_SLAB)
                .add(ModBlocks.SMOOTH_SMOOTHSTONE_STAIRS)
                .add(ModBlocks.SMOOTH_SMOOTHSTONE_WALL)

                //ANDESITE
                .add(Blocks.ANDESITE)

                //ANDESITE BRICKS
                .add(ModBlocks.ANDESITE_BRICKS)
                .add(ModBlocks.ANDESITE_BRICK_SLAB)
                .add(ModBlocks.ANDESITE_BRICK_STAIRS)
                .add(ModBlocks.ANDESITE_BRICK_WALL)

                //ANDESITE PILLAR
                .add(ModBlocks.ANDESITE_PILLAR)

                //ANDESITE TILES
                .add(ModBlocks.ANDESITE_TILES)
                .add(ModBlocks.ANDESITE_TILE_SLAB)
                .add(ModBlocks.ANDESITE_TILE_STAIRS)
                .add(ModBlocks.ANDESITE_TILE_WALL)

                //CHISELED ANDESITE
                .add(ModBlocks.CHISELED_ANDESITE)

                //COBBLED ANDESITE
                .add(ModBlocks.COBBLED_ANDESITE)
                .add(ModBlocks.COBBLED_ANDESITE_SLAB)
                .add(ModBlocks.COBBLED_ANDESITE_STAIRS)
                .add(ModBlocks.COBBLED_ANDESITE_WALL)

                //CRACKED ANDESITE BRICKS
                .add(ModBlocks.CRACKED_ANDESITE_BRICKS)
                .add(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB)
                .add(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS)
                .add(ModBlocks.CRACKED_ANDESITE_BRICK_WALL)

                //CUT ANDESITE
                .add(ModBlocks.CUT_ANDESITE)
                .add(ModBlocks.CUT_ANDESITE_SLAB)
                .add(ModBlocks.CUT_ANDESITE_STAIRS)
                .add(ModBlocks.CUT_ANDESITE_WALL)

                //DARK ANDESITE
                .add(ModBlocks.DARK_ANDESITE)
                .add(ModBlocks.DARK_ANDESITE_SLAB)
                .add(ModBlocks.DARK_ANDESITE_STAIRS)
                .add(ModBlocks.DARK_ANDESITE_WALL)

                //POLISHED ANDESITE
                .add(ModBlocks.POLISHED_ANDESITE_WALL)

                //SMOOTH ANDESITE
                .add(ModBlocks.SMOOTH_ANDESITE)
                .add(ModBlocks.SMOOTH_ANDESITE_SLAB)
                .add(ModBlocks.SMOOTH_ANDESITE_STAIRS)
                .add(ModBlocks.SMOOTH_ANDESITE_WALL)

                //DIORITE
                .add(Blocks.DIORITE)

                //DIORITE BRICKS
                .add(ModBlocks.DIORITE_BRICKS)
                .add(ModBlocks.DIORITE_BRICK_SLAB)
                .add(ModBlocks.DIORITE_BRICK_STAIRS)
                .add(ModBlocks.DIORITE_BRICK_WALL)

                //DIORITE PILLAR
                .add(ModBlocks.DIORITE_PILLAR)

                //DIORITE TILES
                .add(ModBlocks.DIORITE_TILES)
                .add(ModBlocks.DIORITE_TILE_SLAB)
                .add(ModBlocks.DIORITE_TILE_STAIRS)
                .add(ModBlocks.DIORITE_TILE_WALL)

                //CHISELED DIORITE
                .add(ModBlocks.CHISELED_DIORITE)

                //COBBLED DIORITE
                .add(ModBlocks.COBBLED_DIORITE)
                .add(ModBlocks.COBBLED_DIORITE_SLAB)
                .add(ModBlocks.COBBLED_DIORITE_STAIRS)
                .add(ModBlocks.COBBLED_DIORITE_WALL)

                //CRACKED DIORITE BRICKS
                .add(ModBlocks.CRACKED_DIORITE_BRICKS)
                .add(ModBlocks.CRACKED_DIORITE_BRICK_SLAB)
                .add(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS)
                .add(ModBlocks.CRACKED_DIORITE_BRICK_WALL)

                //CUT DIORITE
                .add(ModBlocks.CUT_DIORITE)
                .add(ModBlocks.CUT_DIORITE_SLAB)
                .add(ModBlocks.CUT_DIORITE_STAIRS)
                .add(ModBlocks.CUT_DIORITE_WALL)

                //DARK DIORITE
                .add(ModBlocks.DARK_DIORITE)
                .add(ModBlocks.DARK_DIORITE_SLAB)
                .add(ModBlocks.DARK_DIORITE_STAIRS)
                .add(ModBlocks.DARK_DIORITE_WALL)

                //POLISHED DIORITE
                .add(ModBlocks.POLISHED_DIORITE_WALL)

                //SMOOTH DIORITE
                .add(ModBlocks.SMOOTH_DIORITE)
                .add(ModBlocks.SMOOTH_DIORITE_SLAB)
                .add(ModBlocks.SMOOTH_DIORITE_STAIRS)
                .add(ModBlocks.SMOOTH_DIORITE_WALL)

                //GRANITE
                .add(Blocks.GRANITE)

                //GRANITE BRICKS
                .add(ModBlocks.GRANITE_BRICKS)
                .add(ModBlocks.GRANITE_BRICK_SLAB)
                .add(ModBlocks.GRANITE_BRICK_STAIRS)
                .add(ModBlocks.GRANITE_BRICK_WALL)

                //GRANITE PILLAR
                .add(ModBlocks.GRANITE_PILLAR)

                //GRANITE TILES
                .add(ModBlocks.GRANITE_TILES)
                .add(ModBlocks.GRANITE_TILE_SLAB)
                .add(ModBlocks.GRANITE_TILE_STAIRS)
                .add(ModBlocks.GRANITE_TILE_WALL)

                //CHISELED GRANITE
                .add(ModBlocks.CHISELED_GRANITE)

                //COBBLED GRANITE
                .add(ModBlocks.COBBLED_GRANITE)
                .add(ModBlocks.COBBLED_GRANITE_SLAB)
                .add(ModBlocks.COBBLED_GRANITE_STAIRS)
                .add(ModBlocks.COBBLED_GRANITE_WALL)

                //CRACKED GRANITE BRICKS
                .add(ModBlocks.CRACKED_GRANITE_BRICKS)
                .add(ModBlocks.CRACKED_GRANITE_BRICK_SLAB)
                .add(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS)
                .add(ModBlocks.CRACKED_GRANITE_BRICK_WALL)

                //CUT GRANITE
                .add(ModBlocks.CUT_GRANITE)
                .add(ModBlocks.CUT_GRANITE_SLAB)
                .add(ModBlocks.CUT_GRANITE_STAIRS)
                .add(ModBlocks.CUT_GRANITE_WALL)

                //DARK GRANITE
                .add(ModBlocks.DARK_GRANITE)
                .add(ModBlocks.DARK_GRANITE_SLAB)
                .add(ModBlocks.DARK_GRANITE_STAIRS)
                .add(ModBlocks.DARK_GRANITE_WALL)

                //POLISHED GRANITE
                .add(ModBlocks.POLISHED_GRANITE_WALL)

                //SMOOTH GRANITE
                .add(ModBlocks.SMOOTH_GRANITE)
                .add(ModBlocks.SMOOTH_GRANITE_SLAB)
                .add(ModBlocks.SMOOTH_GRANITE_STAIRS)
                .add(ModBlocks.SMOOTH_GRANITE_WALL);

        valueLookupBuilder(BlockTags.WALLS)
                //SMOOTHSTONE
                .add(ModBlocks.SMOOTHSTONE_WALL)

                //SMOOTHSTONE BRICKS
                .add(ModBlocks.SMOOTHSTONE_BRICK_WALL)

                //SMOOTHSTONE TILES
                .add(ModBlocks.SMOOTHSTONE_TILE_WALL)

                //COBBLED SMOOTHSTONE
                .add(ModBlocks.COBBLED_SMOOTHSTONE_WALL)

                //CRACKED SMOOTHSTONE BRICKS
                .add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_WALL)

                //CUT SMOOTHSTONE
                .add(ModBlocks.CUT_SMOOTHSTONE_WALL)

                //DARK SMOOTHSTONE
                .add(ModBlocks.DARK_SMOOTHSTONE_WALL)

                //POLISHED SMOOTHSTONE
                .add(ModBlocks.POLISHED_SMOOTHSTONE_WALL)

                //SMOOTH SMOOTHSTONE
                .add(ModBlocks.SMOOTH_SMOOTHSTONE_WALL)

                //ANDESITE

                //ANDESITE BRICKS
                .add(ModBlocks.ANDESITE_BRICK_WALL)

                //ANDESITE TILES
                .add(ModBlocks.ANDESITE_TILE_WALL)

                //COBBLED ANDESITE
                .add(ModBlocks.COBBLED_SMOOTHSTONE_WALL)

                //CRACKED ANDESITE BRICKS
                .add(ModBlocks.CRACKED_ANDESITE_BRICK_WALL)

                //CUT ANDESITE
                .add(ModBlocks.CUT_ANDESITE_WALL)

                //DARK ANDESITE
                .add(ModBlocks.DARK_ANDESITE_WALL)

                //POLISHED ANDESITE
                .add(ModBlocks.POLISHED_ANDESITE_WALL)

                //SMOOTH ANDESITE
                .add(ModBlocks.SMOOTH_ANDESITE_WALL)

                //DIORITE

                //DIORITE BRICKS
                .add(ModBlocks.DIORITE_BRICK_WALL)

                //DIORITE TILES
                .add(ModBlocks.DIORITE_TILE_WALL)

                //COBBLED DIORITE
                .add(ModBlocks.COBBLED_DIORITE_WALL)

                //CRACKED DIORITE BRICKS
                .add(ModBlocks.CRACKED_DIORITE_BRICK_WALL)

                //CUT DIORITE
                .add(ModBlocks.CUT_DIORITE_WALL)

                //DARK DIORITE
                .add(ModBlocks.DARK_DIORITE_WALL)

                //POLISHED DIORITE
                .add(ModBlocks.POLISHED_DIORITE_WALL)

                //SMOOTH DIORITE
                .add(ModBlocks.SMOOTH_DIORITE_WALL)

                //GRANITE

                //GRANITE BRICKS
                .add(ModBlocks.GRANITE_BRICK_WALL)

                //GRANITE TILES
                .add(ModBlocks.GRANITE_TILE_WALL)

                //COBBLED GRANITE
                .add(ModBlocks.COBBLED_GRANITE_WALL)

                //CRACKED GRANITE BRICKS
                .add(ModBlocks.CRACKED_GRANITE_BRICK_WALL)

                //CUT GRANITE
                .add(ModBlocks.CUT_GRANITE_WALL)

                //DARK GRANITE
                .add(ModBlocks.DARK_GRANITE_WALL)

                //POLISHED GRANITE
                .add(ModBlocks.POLISHED_GRANITE_WALL)

                //SMOOTH GRANITE
                .add(ModBlocks.SMOOTH_GRANITE_WALL);

        valueLookupBuilder(BlockTags.STAIRS)
                //SMOOTHSTONE
                .add(ModBlocks.SMOOTHSTONE_STAIRS)

                //SMOOTHSTONE BRICKS
                .add(ModBlocks.SMOOTHSTONE_BRICK_STAIRS)

                //SMOOTHSTONE TILES
                .add(ModBlocks.SMOOTHSTONE_TILE_STAIRS)

                //COBBLED SMOOTHSTONE
                .add(ModBlocks.COBBLED_SMOOTHSTONE_STAIRS)

                //CRACKED SMOOTHSTONE BRICKS
                .add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_STAIRS)

                //CUT SMOOTHSTONE
                .add(ModBlocks.CUT_SMOOTHSTONE_STAIRS)

                //DARK SMOOTHSTONE
                .add(ModBlocks.DARK_SMOOTHSTONE_STAIRS)

                //POLISHED SMOOTHSTONE
                .add(ModBlocks.POLISHED_SMOOTHSTONE_STAIRS)

                //SMOOTH SMOOTHSTONE
                .add(ModBlocks.SMOOTH_SMOOTHSTONE_STAIRS)

                //ANDESITE

                //ANDESITE BRICKS
                .add(ModBlocks.ANDESITE_BRICK_STAIRS)

                //ANDESITE TILES
                .add(ModBlocks.ANDESITE_TILE_STAIRS)

                //COBBLED ANDESITE
                .add(ModBlocks.COBBLED_ANDESITE_STAIRS)

                //CRACKED ANDESITE BRICKS
                .add(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS)

                //CUT ANDESITE
                .add(ModBlocks.CUT_ANDESITE_STAIRS)

                //DARK ANDESITE
                .add(ModBlocks.DARK_ANDESITE_STAIRS)

                //SMOOTH ANDESITE
                .add(ModBlocks.SMOOTH_ANDESITE_STAIRS)

                //DIORITE

                //DIORITE BRICKS
                .add(ModBlocks.DIORITE_BRICK_STAIRS)

                //DIORITE TILES
                .add(ModBlocks.DIORITE_TILE_STAIRS)

                //COBBLED DIORITE
                .add(ModBlocks.COBBLED_DIORITE_STAIRS)

                //CRACKED DIORITE BRICKS
                .add(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS)

                //CUT DIORITE
                .add(ModBlocks.CUT_DIORITE_STAIRS)

                //DARK DIORITE
                .add(ModBlocks.DARK_DIORITE_STAIRS)

                //SMOOTH DIORITE
                .add(ModBlocks.SMOOTH_DIORITE_STAIRS)

                //GRANITE

                //GRANITE BRICKS
                .add(ModBlocks.GRANITE_BRICK_STAIRS)

                //GRANITE TILES
                .add(ModBlocks.GRANITE_TILE_STAIRS)

                //COBBLED GRANITE
                .add(ModBlocks.COBBLED_GRANITE_STAIRS)

                //CRACKED GRANITE BRICKS
                .add(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS)

                //CUT GRANITE
                .add(ModBlocks.CUT_GRANITE_STAIRS)

                //DARK GRANITE
                .add(ModBlocks.DARK_GRANITE_STAIRS)

                //SMOOTH GRANITE
                .add(ModBlocks.SMOOTH_GRANITE_STAIRS);

        valueLookupBuilder(BlockTags.SLABS)
                //SMOOTHSTONE

                //SMOOTHSTONE BRICKS
                .add(ModBlocks.SMOOTHSTONE_BRICK_SLAB)

                //SMOOTHSTONE TILES
                .add(ModBlocks.SMOOTHSTONE_TILE_SLAB)

                //COBBLED SMOOTHSTONE
                .add(ModBlocks.COBBLED_SMOOTHSTONE_SLAB)

                //CRACKED SMOOTHSTONE BRICKS
                .add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_SLAB)

                //CUT SMOOTHSTONE
                .add(ModBlocks.CUT_SMOOTHSTONE_SLAB)

                //DARK SMOOTHSTONE
                .add(ModBlocks.DARK_SMOOTHSTONE_SLAB)

                //POLISHED SMOOTHSTONE
                .add(ModBlocks.POLISHED_SMOOTHSTONE_SLAB)

                //SMOOTH SMOOTHSTONE
                .add(ModBlocks.SMOOTH_SMOOTHSTONE_SLAB)

                //ANDESITE

                //ANDESITE BRICKS
                .add(ModBlocks.ANDESITE_BRICK_SLAB)

                //ANDESITE TILES
                .add(ModBlocks.ANDESITE_TILE_SLAB)

                //COBBLED ANDESITE
                .add(ModBlocks.COBBLED_ANDESITE_SLAB)

                //CRACKED ANDESITE BRICKS
                .add(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB)

                //CUT ANDESITE
                .add(ModBlocks.CUT_ANDESITE_SLAB)

                //DARK ANDESITE
                .add(ModBlocks.DARK_ANDESITE_SLAB)

                //SMOOTH ANDESITE
                .add(ModBlocks.SMOOTH_ANDESITE_SLAB)

                //DIORITE

                //DIORITE BRICKS
                .add(ModBlocks.DIORITE_BRICK_SLAB)

                //DIORITE TILES
                .add(ModBlocks.DIORITE_TILE_SLAB)

                //COBBLED DIORITE
                .add(ModBlocks.COBBLED_DIORITE_SLAB)

                //CRACKED DIORITE BRICKS
                .add(ModBlocks.CRACKED_DIORITE_BRICK_SLAB)

                //CUT DIORITE
                .add(ModBlocks.CUT_DIORITE_SLAB)

                //DARK DIORITE
                .add(ModBlocks.DARK_DIORITE_SLAB)

                //SMOOTH DIORITE
                .add(ModBlocks.SMOOTH_DIORITE_SLAB)

                //GRANITE

                //GRANITE BRICKS
                .add(ModBlocks.GRANITE_BRICK_SLAB)

                //GRANITE TILES
                .add(ModBlocks.GRANITE_TILE_SLAB)

                //COBBLED GRANITE
                .add(ModBlocks.COBBLED_GRANITE_SLAB)

                //CRACKED GRANITE BRICKS
                .add(ModBlocks.CRACKED_GRANITE_BRICK_SLAB)

                //CUT GRANITE
                .add(ModBlocks.CUT_GRANITE_SLAB)

                //DARK GRANITE
                .add(ModBlocks.DARK_GRANITE_SLAB)

                //SMOOTH GRANITE
                .add(ModBlocks.SMOOTH_GRANITE_SLAB);
    }
}

package net.blacksoul.blacksoulsultimatestones.datagen;

import net.blacksoul.blacksoulsultimatestones.BlackSoulsUltimateStones;
import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider{

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
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
                .add(ModBlocks.SMOOTH_ANDESITE_WALL);

        valueLookupBuilder(BlockTags.WALLS)
                //ANDESITE

                //ANDESITE BRICKS
                .add(ModBlocks.ANDESITE_BRICK_WALL)

                //ANDESITE TILES
                .add(ModBlocks.ANDESITE_TILE_WALL)

                //COBBLED ANDESITE
                .add(ModBlocks.COBBLED_ANDESITE_WALL)

                //CRACKED ANDESITE BRICKS
                .add(ModBlocks.CRACKED_ANDESITE_BRICK_WALL)

                //CUT ANDESITE
                .add(ModBlocks.CUT_ANDESITE_WALL)

                //DARK ANDESITE
                .add(ModBlocks.DARK_ANDESITE_WALL)

                //POLISHED ANDESITE
                .add(ModBlocks.POLISHED_ANDESITE_WALL)

                //SMOOTH ANDESITE
                .add(ModBlocks.SMOOTH_ANDESITE_WALL);

        valueLookupBuilder(BlockTags.STAIRS)
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
                .add(ModBlocks.SMOOTH_ANDESITE_STAIRS);

        valueLookupBuilder(BlockTags.SLABS)
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
                .add(ModBlocks.SMOOTH_ANDESITE_SLAB);
    }
}

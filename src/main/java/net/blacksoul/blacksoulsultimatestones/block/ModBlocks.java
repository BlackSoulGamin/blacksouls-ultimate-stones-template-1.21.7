package net.blacksoul.blacksoulsultimatestones.block;

import net.blacksoul.blacksoulsultimatestones.BlackSoulsUltimateStones;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    //SMOOTHSTONE
    public static final Block SMOOTHSTONE_STAIRS = registerBlock(
            "smoothstone_stairs", properties  -> new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTHSTONE_WALL = registerBlock(
            "smoothstone_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //SMOOTHSTONE BRICKS
    public static final Block SMOOTHSTONE_BRICKS = registerBlock(
            "smoothstone_bricks", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTHSTONE_BRICK_STAIRS = registerBlock(
            "smoothstone_brick_stairs", properties  -> new StairsBlock(ModBlocks.SMOOTHSTONE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTHSTONE_BRICK_SLAB = registerBlock(
            "smoothstone_brick_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTHSTONE_BRICK_WALL = registerBlock(
            "smoothstone_brick_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //SMOOTHSTONE PILLAR
    public static final Block SMOOTHSTONE_PILLAR = registerBlock(
            "smoothstone_pillar", properties  -> new PillarBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    //SMOOTHSTONE TILES
    public static final Block SMOOTHSTONE_TILES = registerBlock(
            "smoothstone_tiles", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTHSTONE_TILE_STAIRS = registerBlock(
            "smoothstone_tile_stairs", properties  -> new StairsBlock(ModBlocks.SMOOTHSTONE_TILES.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTHSTONE_TILE_SLAB = registerBlock(
            "smoothstone_tile_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTHSTONE_TILE_WALL = registerBlock(
            "smoothstone_tile_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CHISELED SMOOTHSTONE
    public static final Block CHISELED_SMOOTHSTONE = registerBlock(
            "chiseled_smoothstone", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    //COBBLED SMOOTHSTONE
    public static final Block COBBLED_SMOOTHSTONE = registerBlock(
            "cobbled_smoothstone", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_SMOOTHSTONE_STAIRS = registerBlock(
            "cobbled_smoothstone_stairs", properties  -> new StairsBlock(ModBlocks.COBBLED_SMOOTHSTONE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_SMOOTHSTONE_SLAB = registerBlock(
            "cobbled_smoothstone_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_SMOOTHSTONE_WALL = registerBlock(
            "cobbled_smoothstone_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CRACKED SMOOTHSTONE BRICKS
    public static final Block CRACKED_SMOOTHSTONE_BRICKS = registerBlock(
            "cracked_smoothstone_bricks", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_SMOOTHSTONE_BRICK_STAIRS = registerBlock(
            "cracked_smoothstone_brick_stairs", properties  -> new StairsBlock(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_SMOOTHSTONE_BRICK_SLAB = registerBlock(
            "cracked_smoothstone_brick_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_SMOOTHSTONE_BRICK_WALL = registerBlock(
            "cracked_smoothstone_brick_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CUT SMOOTHSTONE
    public static final Block CUT_SMOOTHSTONE = registerBlock(
            "cut_smoothstone", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_SMOOTHSTONE_STAIRS = registerBlock(
            "cut_smoothstone_stairs", properties  -> new StairsBlock(ModBlocks.CUT_SMOOTHSTONE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_SMOOTHSTONE_SLAB = registerBlock(
            "cut_smoothstone_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_SMOOTHSTONE_WALL = registerBlock(
            "cut_smoothstone_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //DARK SMOOTHSTONE
    public static final Block DARK_SMOOTHSTONE = registerBlock(
            "dark_smoothstone", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_SMOOTHSTONE_STAIRS = registerBlock(
            "dark_smoothstone_stairs", properties  -> new StairsBlock(ModBlocks.DARK_SMOOTHSTONE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_SMOOTHSTONE_SLAB = registerBlock(
            "dark_smoothstone_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_SMOOTHSTONE_WALL = registerBlock(
            "dark_smoothstone_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //POLISHED SMOOTHSTONE
    public static final Block POLISHED_SMOOTHSTONE = registerBlock(
            "polished_smoothstone", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block POLISHED_SMOOTHSTONE_STAIRS = registerBlock(
            "polished_smoothstone_stairs", properties  -> new StairsBlock(ModBlocks.POLISHED_SMOOTHSTONE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block POLISHED_SMOOTHSTONE_SLAB = registerBlock(
            "polished_smoothstone_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block POLISHED_SMOOTHSTONE_WALL = registerBlock(
            "polished_smoothstone_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //SMOOTH SMOOTHSTONE
    public static final Block SMOOTH_SMOOTHSTONE = registerBlock(
            "smooth_smoothstone", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_SMOOTHSTONE_STAIRS = registerBlock(
            "smooth_smoothstone_stairs", properties  -> new StairsBlock(ModBlocks.SMOOTH_SMOOTHSTONE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_SMOOTHSTONE_SLAB = registerBlock(
            "smooth_smoothstone_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_SMOOTHSTONE_WALL = registerBlock(
            "smooth_smoothstone_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //STONE
    public static final Block STONE_WALL = registerBlock(
            "stone_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //STONE PILLAR
    public static final Block STONE_PILLAR = registerBlock(
            "stone_pillar", properties  -> new PillarBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    //STONE TILES
    public static final Block STONE_TILES = registerBlock(
            "stone_tiles", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block STONE_TILE_STAIRS = registerBlock(
            "stone_tile_stairs", properties  -> new StairsBlock(ModBlocks.STONE_TILES.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block STONE_TILE_SLAB = registerBlock(
            "stone_tile_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block STONE_TILE_WALL = registerBlock(
            "stone_tile_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CRACKED STONE BRICKS
    public static final Block CRACKED_STONE_BRICK_STAIRS = registerBlock(
            "cracked_stone_brick_stairs", properties  -> new StairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_STONE_BRICK_SLAB = registerBlock(
            "cracked_stone_brick_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_STONE_BRICK_WALL = registerBlock(
            "cracked_stone_brick_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CUT STONE
    public static final Block CUT_STONE = registerBlock(
            "cut_stone", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_STONE_STAIRS = registerBlock(
            "cut_stone_stairs", properties  -> new StairsBlock(ModBlocks.CUT_STONE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_STONE_SLAB = registerBlock(
            "cut_stone_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_STONE_WALL = registerBlock(
            "cut_stone_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //DARK STONE
    public static final Block DARK_STONE = registerBlock(
            "dark_stone", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_STONE_STAIRS = registerBlock(
            "dark_stone_stairs", properties  -> new StairsBlock(ModBlocks.DARK_STONE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_STONE_SLAB = registerBlock(
            "dark_stone_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_STONE_WALL = registerBlock(
            "dark_stone_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //POLISHED STONE
    public static final Block POLISHED_STONE = registerBlock(
            "polished_stone", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block POLISHED_STONE_STAIRS = registerBlock(
            "polished_stone_stairs", properties  -> new StairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block POLISHED_STONE_SLAB = registerBlock(
            "polished_stone_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block POLISHED_STONE_WALL = registerBlock(
            "polished_stone_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //SMOOTH STONE
    public static final Block SMOOTH_STONE = registerBlock(
            "smooth_stone", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_STONE_STAIRS = registerBlock(
            "smooth_stone_stairs", properties  -> new StairsBlock(ModBlocks.SMOOTH_STONE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_STONE_SLAB = registerBlock(
            "smooth_stone_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_STONE_WALL = registerBlock(
            "smooth_stone_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //ANDESITE

    //ANDESITE BRICKS
    public static final Block ANDESITE_BRICKS = registerBlock(
            "andesite_bricks", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ANDESITE_BRICK_STAIRS = registerBlock(
            "andesite_brick_stairs", properties  -> new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ANDESITE_BRICK_SLAB = registerBlock(
            "andesite_brick_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ANDESITE_BRICK_WALL = registerBlock(
            "andesite_brick_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //ANDESITE PILLAR
    public static final Block ANDESITE_PILLAR = registerBlock(
            "andesite_pillar", properties  -> new PillarBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    //ANDESITE TILES
    public static final Block ANDESITE_TILES = registerBlock(
            "andesite_tiles", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ANDESITE_TILE_STAIRS = registerBlock(
            "andesite_tile_stairs", properties  -> new StairsBlock(ModBlocks.ANDESITE_TILES.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ANDESITE_TILE_SLAB = registerBlock(
            "andesite_tile_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ANDESITE_TILE_WALL = registerBlock(
            "andesite_tile_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CHISELED ANDESITE
    public static final Block CHISELED_ANDESITE = registerBlock(
            "chiseled_andesite", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    //COBBLED ANDESITE
    public static final Block COBBLED_ANDESITE = registerBlock(
            "cobbled_andesite", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_ANDESITE_STAIRS = registerBlock(
            "cobbled_andesite_stairs", properties  -> new StairsBlock(ModBlocks.COBBLED_ANDESITE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_ANDESITE_SLAB = registerBlock(
            "cobbled_andesite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_ANDESITE_WALL = registerBlock(
            "cobbled_andesite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CRACKED ANDESITE BRICKS
    public static final Block CRACKED_ANDESITE_BRICKS = registerBlock(
            "cracked_andesite_bricks", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_ANDESITE_BRICK_STAIRS = registerBlock(
            "cracked_andesite_brick_stairs", properties  -> new StairsBlock(ModBlocks.CRACKED_ANDESITE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_ANDESITE_BRICK_SLAB = registerBlock(
            "cracked_andesite_brick_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_ANDESITE_BRICK_WALL = registerBlock(
            "cracked_andesite_brick_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CUT ANDESITE
    public static final Block CUT_ANDESITE = registerBlock(
            "cut_andesite", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_ANDESITE_STAIRS = registerBlock(
            "cut_andesite_stairs", properties  -> new StairsBlock(ModBlocks.CUT_ANDESITE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_ANDESITE_SLAB = registerBlock(
            "cut_andesite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_ANDESITE_WALL = registerBlock(
            "cut_andesite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //DARK ANDESITE
    public static final Block DARK_ANDESITE = registerBlock(
            "dark_andesite", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_ANDESITE_STAIRS = registerBlock(
            "dark_andesite_stairs", properties  -> new StairsBlock(ModBlocks.DARK_ANDESITE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_ANDESITE_SLAB = registerBlock(
            "dark_andesite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_ANDESITE_WALL = registerBlock(
            "dark_andesite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //POLISHED ANDESITE
    public static final Block POLISHED_ANDESITE_WALL = registerBlock(
            "polished_andesite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //SMOOTH ANDESITE
    public static final Block SMOOTH_ANDESITE = registerBlock(
            "smooth_andesite", properties  -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_ANDESITE_STAIRS = registerBlock(
            "smooth_andesite_stairs", properties  -> new StairsBlock(ModBlocks.SMOOTH_ANDESITE.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_ANDESITE_SLAB = registerBlock(
            "smooth_andesite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_ANDESITE_WALL = registerBlock(
            "smooth_andesite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //DIORITE

    //DIORITE BRICKS
    public static final Block DIORITE_BRICKS = registerBlock(
            "diorite_bricks", properties  -> new Block(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DIORITE_BRICK_STAIRS = registerBlock(
            "diorite_brick_stairs", properties  -> new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DIORITE_BRICK_SLAB = registerBlock(
            "diorite_brick_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DIORITE_BRICK_WALL = registerBlock(
            "diorite_brick_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //DIORITE PILLAR
    public static final Block DIORITE_PILLAR = registerBlock(
            "diorite_pillar", properties  -> new PillarBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    //DIORITE TILES
    public static final Block DIORITE_TILES = registerBlock(
            "diorite_tiles", properties  -> new Block(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DIORITE_TILE_STAIRS = registerBlock(
            "diorite_tile_stairs", properties  -> new StairsBlock(ModBlocks.DIORITE_TILES.getDefaultState(), properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DIORITE_TILE_SLAB = registerBlock(
            "diorite_tile_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DIORITE_TILE_WALL = registerBlock(
            "diorite_tile_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CHISELED DIORITE
    public static final Block CHISELED_DIORITE = registerBlock(
            "chiseled_diorite", properties  -> new Block(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    //COBBLED DIORITE
    public static final Block COBBLED_DIORITE = registerBlock(
            "cobbled_diorite", properties  -> new Block(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_DIORITE_STAIRS = registerBlock(
            "cobbled_diorite_stairs", properties  -> new StairsBlock(ModBlocks.COBBLED_DIORITE.getDefaultState(), properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_DIORITE_SLAB = registerBlock(
            "cobbled_diorite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_DIORITE_WALL = registerBlock(
            "cobbled_diorite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CRACKED DIORITE BRICKS
    public static final Block CRACKED_DIORITE_BRICKS = registerBlock(
            "cracked_diorite_bricks", properties  -> new Block(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_DIORITE_BRICK_STAIRS = registerBlock(
            "cracked_diorite_brick_stairs", properties  -> new StairsBlock(ModBlocks.CRACKED_DIORITE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_DIORITE_BRICK_SLAB = registerBlock(
            "cracked_diorite_brick_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_DIORITE_BRICK_WALL = registerBlock(
            "cracked_diorite_brick_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CUT DIORITE
    public static final Block CUT_DIORITE = registerBlock(
            "cut_diorite", properties  -> new Block(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_DIORITE_STAIRS = registerBlock(
            "cut_diorite_stairs", properties  -> new StairsBlock(ModBlocks.CUT_DIORITE.getDefaultState(), properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_DIORITE_SLAB = registerBlock(
            "cut_diorite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_DIORITE_WALL = registerBlock(
            "cut_diorite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //DARK DIORITE
    public static final Block DARK_DIORITE = registerBlock(
            "dark_diorite", properties  -> new Block(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_DIORITE_STAIRS = registerBlock(
            "dark_diorite_stairs", properties  -> new StairsBlock(ModBlocks.DARK_DIORITE.getDefaultState(), properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_DIORITE_SLAB = registerBlock(
            "dark_diorite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_DIORITE_WALL = registerBlock(
            "dark_diorite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //POLISHED DIORITE
    public static final Block POLISHED_DIORITE_WALL = registerBlock(
            "polished_diorite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //SMOOTH DIORITE
    public static final Block SMOOTH_DIORITE = registerBlock(
            "smooth_diorite", properties  -> new Block(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_DIORITE_STAIRS = registerBlock(
            "smooth_diorite_stairs", properties  -> new StairsBlock(ModBlocks.SMOOTH_DIORITE.getDefaultState(), properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_DIORITE_SLAB = registerBlock(
            "smooth_diorite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_DIORITE_WALL = registerBlock(
            "smooth_diorite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.OFF_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //GRANITE

    //GRANITE BRICKS
    public static final Block GRANITE_BRICKS = registerBlock(
            "granite_bricks", properties  -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block GRANITE_BRICK_STAIRS = registerBlock(
            "granite_brick_stairs", properties  -> new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block GRANITE_BRICK_SLAB = registerBlock(
            "granite_brick_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block GRANITE_BRICK_WALL = registerBlock(
            "granite_brick_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //GRANITE PILLAR
    public static final Block GRANITE_PILLAR = registerBlock(
            "granite_pillar", properties  -> new PillarBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    //GRANITE TILES
    public static final Block GRANITE_TILES = registerBlock(
            "granite_tiles", properties  -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block GRANITE_TILE_STAIRS = registerBlock(
            "granite_tile_stairs", properties  -> new StairsBlock(ModBlocks.GRANITE_TILES.getDefaultState(), properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block GRANITE_TILE_SLAB = registerBlock(
            "granite_tile_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block GRANITE_TILE_WALL = registerBlock(
            "granite_tile_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CHISELED GRANITE
    public static final Block CHISELED_GRANITE = registerBlock(
            "chiseled_granite", properties  -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    //COBBLED GRANITE
    public static final Block COBBLED_GRANITE = registerBlock(
            "cobbled_granite", properties  -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_GRANITE_STAIRS = registerBlock(
            "cobbled_granite_stairs", properties  -> new StairsBlock(ModBlocks.COBBLED_GRANITE.getDefaultState(), properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_GRANITE_SLAB = registerBlock(
            "cobbled_granite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block COBBLED_GRANITE_WALL = registerBlock(
            "cobbled_granite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CRACKED GRANITE BRICKS
    public static final Block CRACKED_GRANITE_BRICKS = registerBlock(
            "cracked_granite_bricks", properties  -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_GRANITE_BRICK_STAIRS = registerBlock(
            "cracked_granite_brick_stairs", properties  -> new StairsBlock(ModBlocks.CRACKED_GRANITE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_GRANITE_BRICK_SLAB = registerBlock(
            "cracked_granite_brick_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CRACKED_GRANITE_BRICK_WALL = registerBlock(
            "cracked_granite_brick_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //CUT GRANITE
    public static final Block CUT_GRANITE = registerBlock(
            "cut_granite", properties  -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_GRANITE_STAIRS = registerBlock(
            "cut_granite_stairs", properties  -> new StairsBlock(ModBlocks.CUT_GRANITE.getDefaultState(), properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_GRANITE_SLAB = registerBlock(
            "cut_granite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block CUT_GRANITE_WALL = registerBlock(
            "cut_granite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //DARK GRANITE
    public static final Block DARK_GRANITE = registerBlock(
            "dark_granite", properties  -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_GRANITE_STAIRS = registerBlock(
            "dark_granite_stairs", properties  -> new StairsBlock(ModBlocks.DARK_GRANITE.getDefaultState(), properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_GRANITE_SLAB = registerBlock(
            "dark_granite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DARK_GRANITE_WALL = registerBlock(
            "dark_granite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //POLISHED GRANITE
    public static final Block POLISHED_GRANITE_WALL = registerBlock(
            "polished_granite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));

    //SMOOTH GRANITE
    public static final Block SMOOTH_GRANITE = registerBlock(
            "smooth_granite", properties  -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_GRANITE_STAIRS = registerBlock(
            "smooth_granite_stairs", properties  -> new StairsBlock(ModBlocks.SMOOTH_GRANITE.getDefaultState(), properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_GRANITE_SLAB = registerBlock(
            "smooth_granite_slab", properties  -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block SMOOTH_GRANITE_WALL = registerBlock(
            "smooth_granite_wall", properties  -> new WallBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()
            ));


    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
       Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BlackSoulsUltimateStones.MOD_ID, name))));
       registerBlockItem(name, toRegister);
       return Registry.register(Registries.BLOCK, Identifier.of(BlackSoulsUltimateStones.MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<AbstractBlock.Settings, Block> function) {
        return Registry.register(Registries.BLOCK, Identifier.of(BlackSoulsUltimateStones.MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BlackSoulsUltimateStones.MOD_ID, name)))));
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BlackSoulsUltimateStones.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlackSoulsUltimateStones.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        BlackSoulsUltimateStones.LOGGER.info("Registering Mod Blocks for " + BlackSoulsUltimateStones.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            //SMOOTHSTONE
            entries.add(ModBlocks.SMOOTHSTONE_STAIRS);
            entries.add(ModBlocks.SMOOTHSTONE_WALL);

            //SMOOTHSTONE BRICKS
            entries.add(ModBlocks.SMOOTHSTONE_BRICKS);
            entries.add(ModBlocks.SMOOTHSTONE_BRICK_STAIRS);
            entries.add(ModBlocks.SMOOTHSTONE_BRICK_SLAB);
            entries.add(ModBlocks.SMOOTHSTONE_BRICK_WALL);

            //SMOOTHSTONE PILLAR
            entries.add(ModBlocks.SMOOTHSTONE_PILLAR);

            //SMOOTHSTONE TILES
            entries.add(ModBlocks.SMOOTHSTONE_TILES);
            entries.add(ModBlocks.SMOOTHSTONE_TILE_STAIRS);
            entries.add(ModBlocks.SMOOTHSTONE_TILE_SLAB);
            entries.add(ModBlocks.SMOOTHSTONE_TILE_WALL);

            //CHISELED SMOOTHSTONE
            entries.add(ModBlocks.CHISELED_SMOOTHSTONE);

            //COBBLED SMOOTHSTONE
            entries.add(ModBlocks.COBBLED_SMOOTHSTONE);
            entries.add(ModBlocks.COBBLED_SMOOTHSTONE_STAIRS);
            entries.add(ModBlocks.COBBLED_SMOOTHSTONE_SLAB);
            entries.add(ModBlocks.COBBLED_SMOOTHSTONE_WALL);

            //CRACKED SMOOTHSTONE BRICKS
            entries.add(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS);
            entries.add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_STAIRS);
            entries.add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_SLAB);
            entries.add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_WALL);

            //CUT SMOOTHSTONE
            entries.add(ModBlocks.CUT_SMOOTHSTONE);
            entries.add(ModBlocks.CUT_SMOOTHSTONE_STAIRS);
            entries.add(ModBlocks.CUT_SMOOTHSTONE_SLAB);
            entries.add(ModBlocks.CUT_SMOOTHSTONE_WALL);

            //DARK SMOOTHSTONE
            entries.add(ModBlocks.DARK_SMOOTHSTONE);
            entries.add(ModBlocks.DARK_SMOOTHSTONE_STAIRS);
            entries.add(ModBlocks.DARK_SMOOTHSTONE_SLAB);
            entries.add(ModBlocks.DARK_SMOOTHSTONE_WALL);

            //POLISHED SMOOTHSTONE
            entries.add(ModBlocks.POLISHED_SMOOTHSTONE);
            entries.add(ModBlocks.POLISHED_SMOOTHSTONE_STAIRS);
            entries.add(ModBlocks.POLISHED_SMOOTHSTONE_SLAB);
            entries.add(ModBlocks.POLISHED_SMOOTHSTONE_WALL);

            //SMOOTH SMOOTHSTONE
            entries.add(ModBlocks.SMOOTH_SMOOTHSTONE);
            entries.add(ModBlocks.SMOOTH_SMOOTHSTONE_STAIRS);
            entries.add(ModBlocks.SMOOTH_SMOOTHSTONE_SLAB);
            entries.add(ModBlocks.SMOOTH_SMOOTHSTONE_WALL);

            //STONE
            entries.add(ModBlocks.STONE_WALL);

            //STONE PILLAR
            entries.add(ModBlocks.STONE_PILLAR);

            //STONE TILES
            entries.add(ModBlocks.STONE_TILES);
            entries.add(ModBlocks.STONE_TILE_STAIRS);
            entries.add(ModBlocks.STONE_TILE_SLAB);
            entries.add(ModBlocks.STONE_TILE_WALL);

            //CRACKED STONE BRICKS
            entries.add(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
            entries.add(ModBlocks.CRACKED_STONE_BRICK_SLAB);
            entries.add(ModBlocks.CRACKED_STONE_BRICK_WALL);

            //CUT STONE
            entries.add(ModBlocks.CUT_STONE);
            entries.add(ModBlocks.CUT_STONE_STAIRS);
            entries.add(ModBlocks.CUT_STONE_SLAB);
            entries.add(ModBlocks.CUT_STONE_WALL);

            //DARK STONE
            entries.add(ModBlocks.DARK_STONE);
            entries.add(ModBlocks.DARK_STONE_STAIRS);
            entries.add(ModBlocks.DARK_STONE_SLAB);
            entries.add(ModBlocks.DARK_STONE_WALL);

            //POLISHED STONE
            entries.add(ModBlocks.POLISHED_STONE);
            entries.add(ModBlocks.POLISHED_STONE_STAIRS);
            entries.add(ModBlocks.POLISHED_STONE_SLAB);
            entries.add(ModBlocks.POLISHED_STONE_WALL);

            //SMOOTH STONE
            entries.add(ModBlocks.SMOOTH_STONE);
            entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
            entries.add(ModBlocks.SMOOTH_STONE_SLAB);
            entries.add(ModBlocks.SMOOTH_STONE_WALL);

            //ANDESITE

            //ANDESITE BRICKS
            entries.add(ModBlocks.ANDESITE_BRICKS);
            entries.add(ModBlocks.ANDESITE_BRICK_STAIRS);
            entries.add(ModBlocks.ANDESITE_BRICK_SLAB);
            entries.add(ModBlocks.ANDESITE_BRICK_WALL);

            //ANDESITE PILLAR
            entries.add(ModBlocks.ANDESITE_PILLAR);

            //ANDESITE TILES
            entries.add(ModBlocks.ANDESITE_TILES);
            entries.add(ModBlocks.ANDESITE_TILE_STAIRS);
            entries.add(ModBlocks.ANDESITE_TILE_SLAB);
            entries.add(ModBlocks.ANDESITE_TILE_WALL);

            //CHISELED ANDESITE
            entries.add(ModBlocks.CHISELED_ANDESITE);

            //COBBLED ANDESITE
            entries.add(ModBlocks.COBBLED_ANDESITE);
            entries.add(ModBlocks.COBBLED_ANDESITE_STAIRS);
            entries.add(ModBlocks.COBBLED_ANDESITE_SLAB);
            entries.add(ModBlocks.COBBLED_ANDESITE_WALL);

            //CRACKED ANDESITE BRICKS
            entries.add(ModBlocks.CRACKED_ANDESITE_BRICKS);
            entries.add(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
            entries.add(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB);
            entries.add(ModBlocks.CRACKED_ANDESITE_BRICK_WALL);

            //CUT ANDESITE
            entries.add(ModBlocks.CUT_ANDESITE);
            entries.add(ModBlocks.CUT_ANDESITE_STAIRS);
            entries.add(ModBlocks.CUT_ANDESITE_SLAB);
            entries.add(ModBlocks.CUT_ANDESITE_WALL);

            //DARK ANDESITE
            entries.add(ModBlocks.DARK_ANDESITE);
            entries.add(ModBlocks.DARK_ANDESITE_STAIRS);
            entries.add(ModBlocks.DARK_ANDESITE_SLAB);
            entries.add(ModBlocks.DARK_ANDESITE_WALL);

            //POLISHED ANDESITE
            entries.add(ModBlocks.POLISHED_ANDESITE_WALL);

            //SMOOTH ANDESITE
            entries.add(ModBlocks.SMOOTH_ANDESITE);
            entries.add(ModBlocks.SMOOTH_ANDESITE_STAIRS);
            entries.add(ModBlocks.SMOOTH_ANDESITE_SLAB);
            entries.add(ModBlocks.SMOOTH_ANDESITE_WALL);

            //DIORITE

            //DIORITE BRICKS
            entries.add(ModBlocks.DIORITE_BRICKS);
            entries.add(ModBlocks.DIORITE_BRICK_STAIRS);
            entries.add(ModBlocks.DIORITE_BRICK_SLAB);
            entries.add(ModBlocks.DIORITE_BRICK_WALL);

            //DIORITE PILLAR
            entries.add(ModBlocks.DIORITE_PILLAR);

            //DIORITE TILES
            entries.add(ModBlocks.DIORITE_TILES);
            entries.add(ModBlocks.DIORITE_TILE_STAIRS);
            entries.add(ModBlocks.DIORITE_TILE_SLAB);
            entries.add(ModBlocks.DIORITE_TILE_WALL);

            //CHISELED DIORITE
            entries.add(ModBlocks.CHISELED_DIORITE);

            //COBBLED DIORITE
            entries.add(ModBlocks.COBBLED_DIORITE);
            entries.add(ModBlocks.COBBLED_DIORITE_STAIRS);
            entries.add(ModBlocks.COBBLED_DIORITE_SLAB);
            entries.add(ModBlocks.COBBLED_DIORITE_WALL);

            //CRACKED DIORITE BRICKS
            entries.add(ModBlocks.CRACKED_DIORITE_BRICKS);
            entries.add(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS);
            entries.add(ModBlocks.CRACKED_DIORITE_BRICK_SLAB);
            entries.add(ModBlocks.CRACKED_DIORITE_BRICK_WALL);

            //CUT DIORITE
            entries.add(ModBlocks.CUT_DIORITE);
            entries.add(ModBlocks.CUT_DIORITE_STAIRS);
            entries.add(ModBlocks.CUT_DIORITE_SLAB);
            entries.add(ModBlocks.CUT_DIORITE_WALL);

            //DARK DIORITE
            entries.add(ModBlocks.DARK_DIORITE);
            entries.add(ModBlocks.DARK_DIORITE_STAIRS);
            entries.add(ModBlocks.DARK_DIORITE_SLAB);
            entries.add(ModBlocks.DARK_DIORITE_WALL);

            //POLISHED DIORITE
            entries.add(ModBlocks.POLISHED_DIORITE_WALL);

            //SMOOTH DIORITE
            entries.add(ModBlocks.SMOOTH_DIORITE);
            entries.add(ModBlocks.SMOOTH_DIORITE_STAIRS);
            entries.add(ModBlocks.SMOOTH_DIORITE_SLAB);
            entries.add(ModBlocks.SMOOTH_DIORITE_WALL);

            //GRANITE

            //GRANITE BRICKS
            entries.add(ModBlocks.GRANITE_BRICKS);
            entries.add(ModBlocks.GRANITE_BRICK_STAIRS);
            entries.add(ModBlocks.GRANITE_BRICK_SLAB);
            entries.add(ModBlocks.GRANITE_BRICK_WALL);

            //GRANITE PILLAR
            entries.add(ModBlocks.GRANITE_PILLAR);

            //GRANITE TILES
            entries.add(ModBlocks.GRANITE_TILES);
            entries.add(ModBlocks.GRANITE_TILE_STAIRS);
            entries.add(ModBlocks.GRANITE_TILE_SLAB);
            entries.add(ModBlocks.GRANITE_TILE_WALL);

            //CHISELED GRANITE
            entries.add(ModBlocks.CHISELED_GRANITE);

            //COBBLED GRANITE
            entries.add(ModBlocks.COBBLED_GRANITE);
            entries.add(ModBlocks.COBBLED_GRANITE_STAIRS);
            entries.add(ModBlocks.COBBLED_GRANITE_SLAB);
            entries.add(ModBlocks.COBBLED_GRANITE_WALL);

            //CRACKED GRANITE BRICKS
            entries.add(ModBlocks.CRACKED_GRANITE_BRICKS);
            entries.add(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS);
            entries.add(ModBlocks.CRACKED_GRANITE_BRICK_SLAB);
            entries.add(ModBlocks.CRACKED_GRANITE_BRICK_WALL);

            //CUT GRANITE
            entries.add(ModBlocks.CUT_GRANITE);
            entries.add(ModBlocks.CUT_GRANITE_STAIRS);
            entries.add(ModBlocks.CUT_GRANITE_SLAB);
            entries.add(ModBlocks.CUT_GRANITE_WALL);

            //DARK GRANITE
            entries.add(ModBlocks.DARK_GRANITE);
            entries.add(ModBlocks.DARK_GRANITE_STAIRS);
            entries.add(ModBlocks.DARK_GRANITE_SLAB);
            entries.add(ModBlocks.DARK_GRANITE_WALL);

            //POLISHED GRANITE
            entries.add(ModBlocks.POLISHED_GRANITE_WALL);

            //SMOOTH GRANITE
            entries.add(ModBlocks.SMOOTH_GRANITE);
            entries.add(ModBlocks.SMOOTH_GRANITE_STAIRS);
            entries.add(ModBlocks.SMOOTH_GRANITE_SLAB);
            entries.add(ModBlocks.SMOOTH_GRANITE_WALL);
        });
    }
}

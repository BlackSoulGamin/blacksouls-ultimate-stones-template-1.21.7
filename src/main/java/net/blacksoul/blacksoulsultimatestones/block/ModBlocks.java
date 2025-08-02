package net.blacksoul.blacksoulsultimatestones.block;

import net.blacksoul.blacksoulsultimatestones.BlackSoulsUltimateStones;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.data.family.BlockFamily;
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
        });
    }
}

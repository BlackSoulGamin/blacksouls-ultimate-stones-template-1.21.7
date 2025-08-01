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
    public static final Block ANDESITE_BRICKS = registerBlock(
            "andesite_bricks", properties  -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ANDESITE_BRICK_STAIRS = registerBlock(
            "andesite_brick_stairs", properties  -> new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(), properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ANDESITE_BRICK_SLAB = registerBlock(
            "andesite_brick_slab", properties  -> new SlabBlock(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ANDESITE_BRICK_WALL = registerBlock(
            "andesite_brick_wall", properties  -> new WallBlock(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
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
            entries.add(ModBlocks.ANDESITE_BRICKS);
        });
    }
}

package net.blacksoul.blacksoulsultimatestones.block;

import net.blacksoul.blacksoulsultimatestones.BlackSoulsUltimateStones;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BLACKSOULS_ULTIMATE_STONES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BlackSoulsUltimateStones.MOD_ID, "blacksouls-ultimate-stones"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ANDESITE_BRICKS))
                    .displayName(Text.translatable("itemgroup.blacksouls-ultimate-stones"))
                    .entries((displayContext, entries) -> {
                        //SMOOTHSTONE
                        entries.add(ModBlocks.SMOOTHSTONE_STAIRS);
                        entries.add(ModBlocks.SMOOTHSTONE_WALL);

                        //COBBLED SMOOTHSTONE
                        entries.add(ModBlocks.COBBLED_SMOOTHSTONE);
                        entries.add(ModBlocks.COBBLED_SMOOTHSTONE_STAIRS);
                        entries.add(ModBlocks.COBBLED_SMOOTHSTONE_SLAB);
                        entries.add(ModBlocks.COBBLED_SMOOTHSTONE_WALL);

                        //SMOOTH SMOOTHSTONE
                        entries.add(ModBlocks.SMOOTH_SMOOTHSTONE);
                        entries.add(ModBlocks.SMOOTH_SMOOTHSTONE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_SMOOTHSTONE_SLAB);
                        entries.add(ModBlocks.SMOOTH_SMOOTHSTONE_WALL);

                        //POLISHED SMOOTHSTONE
                        entries.add(ModBlocks.POLISHED_SMOOTHSTONE);
                        entries.add(ModBlocks.POLISHED_SMOOTHSTONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_SMOOTHSTONE_SLAB);
                        entries.add(ModBlocks.POLISHED_SMOOTHSTONE_WALL);

                        //CHISELED SMOOTHSTONE
                        entries.add(ModBlocks.CHISELED_SMOOTHSTONE);

                        //CUT SMOOTHSTONE
                        entries.add(ModBlocks.CUT_SMOOTHSTONE);
                        entries.add(ModBlocks.CUT_SMOOTHSTONE_STAIRS);
                        entries.add(ModBlocks.CUT_SMOOTHSTONE_SLAB);
                        entries.add(ModBlocks.CUT_SMOOTHSTONE_WALL);

                        //SMOOTHSTONE BRICKS
                        entries.add(ModBlocks.SMOOTHSTONE_BRICKS);
                        entries.add(ModBlocks.SMOOTHSTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.SMOOTHSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.SMOOTHSTONE_BRICK_WALL);

                        //CRACKED SMOOTHSTONE BRICKS
                        entries.add(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS);
                        entries.add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_WALL);

                        //SMOOTHSTONE PILLAR
                        entries.add(ModBlocks.SMOOTHSTONE_PILLAR);

                        //SMOOTHSTONE TILES
                        entries.add(ModBlocks.SMOOTHSTONE_TILES);
                        entries.add(ModBlocks.SMOOTHSTONE_TILE_STAIRS);
                        entries.add(ModBlocks.SMOOTHSTONE_TILE_SLAB);
                        entries.add(ModBlocks.SMOOTHSTONE_TILE_WALL);

                        //DARK SMOOTHSTONE
                        entries.add(ModBlocks.DARK_SMOOTHSTONE);
                        entries.add(ModBlocks.DARK_SMOOTHSTONE_STAIRS);
                        entries.add(ModBlocks.DARK_SMOOTHSTONE_SLAB);
                        entries.add(ModBlocks.DARK_SMOOTHSTONE_WALL);

                        //STONE
                        entries.add(ModBlocks.STONE_WALL);

                        //SMOOTH STONE
                        entries.add(ModBlocks.SMOOTH_STONE);
                        entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_STONE_SLAB);
                        entries.add(ModBlocks.SMOOTH_STONE_WALL);

                        //POLISHED STONE
                        entries.add(ModBlocks.POLISHED_STONE);
                        entries.add(ModBlocks.POLISHED_STONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_STONE_SLAB);
                        entries.add(ModBlocks.POLISHED_STONE_WALL);

                        //CUT STONE
                        entries.add(ModBlocks.CUT_STONE);
                        entries.add(ModBlocks.CUT_STONE_STAIRS);
                        entries.add(ModBlocks.CUT_STONE_SLAB);
                        entries.add(ModBlocks.CUT_STONE_WALL);

                        //CRACKED STONE BRICKS
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_WALL);

                        //STONE PILLAR
                        entries.add(ModBlocks.STONE_PILLAR);

                        //STONE TILES
                        entries.add(ModBlocks.STONE_TILES);
                        entries.add(ModBlocks.STONE_TILE_STAIRS);
                        entries.add(ModBlocks.STONE_TILE_SLAB);
                        entries.add(ModBlocks.STONE_TILE_WALL);

                        //DARK STONE
                        entries.add(ModBlocks.DARK_STONE);
                        entries.add(ModBlocks.DARK_STONE_STAIRS);
                        entries.add(ModBlocks.DARK_STONE_SLAB);
                        entries.add(ModBlocks.DARK_STONE_WALL);

                        //MOSSY STONE
                        entries.add(ModBlocks.MOSSY_STONE);
                        entries.add(ModBlocks.MOSSY_STONE_STAIRS);
                        entries.add(ModBlocks.MOSSY_STONE_SLAB);
                        entries.add(ModBlocks.MOSSY_STONE_WALL);

                        //SMOOTH MOSSY STONE
                        entries.add(ModBlocks.SMOOTH_MOSSY_STONE);
                        entries.add(ModBlocks.SMOOTH_MOSSY_STONE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_MOSSY_STONE_SLAB);
                        entries.add(ModBlocks.SMOOTH_MOSSY_STONE_WALL);

                        //POLISHED MOSSY STONE
                        entries.add(ModBlocks.POLISHED_MOSSY_STONE);
                        entries.add(ModBlocks.POLISHED_MOSSY_STONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_MOSSY_STONE_SLAB);
                        entries.add(ModBlocks.POLISHED_MOSSY_STONE_WALL);

                        //CHISELED MOSSY STONE
                        entries.add(ModBlocks.CHISELED_MOSSY_STONE);

                        //CUT MOSSY STONE
                        entries.add(ModBlocks.CUT_MOSSY_STONE);
                        entries.add(ModBlocks.CUT_MOSSY_STONE_STAIRS);
                        entries.add(ModBlocks.CUT_MOSSY_STONE_SLAB);
                        entries.add(ModBlocks.CUT_MOSSY_STONE_WALL);

                        //CRACKED MOSSY STONE BRICKS
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS);
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICK_WALL);

                        //MOSSY STONE PILLAR
                        entries.add(ModBlocks.MOSSY_STONE_PILLAR);

                        //MOSSY STONE TILES
                        entries.add(ModBlocks.MOSSY_STONE_TILES);
                        entries.add(ModBlocks.MOSSY_STONE_TILE_STAIRS);
                        entries.add(ModBlocks.MOSSY_STONE_TILE_SLAB);
                        entries.add(ModBlocks.MOSSY_STONE_TILE_WALL);

                        //DARK MOSSY STONE
                        entries.add(ModBlocks.DARK_MOSSY_STONE);
                        entries.add(ModBlocks.DARK_MOSSY_STONE_STAIRS);
                        entries.add(ModBlocks.DARK_MOSSY_STONE_SLAB);
                        entries.add(ModBlocks.DARK_MOSSY_STONE_WALL);

                        //GRANITE

                        //COBBLED GRANITE
                        entries.add(ModBlocks.COBBLED_GRANITE);
                        entries.add(ModBlocks.COBBLED_GRANITE_STAIRS);
                        entries.add(ModBlocks.COBBLED_GRANITE_SLAB);
                        entries.add(ModBlocks.COBBLED_GRANITE_WALL);

                        //SMOOTH GRANITE
                        entries.add(ModBlocks.SMOOTH_GRANITE);
                        entries.add(ModBlocks.SMOOTH_GRANITE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_GRANITE_SLAB);
                        entries.add(ModBlocks.SMOOTH_GRANITE_WALL);

                        //POLISHED GRANITE
                        entries.add(ModBlocks.POLISHED_GRANITE_WALL);

                        //CHISELED GRANITE
                        entries.add(ModBlocks.CHISELED_GRANITE);

                        //CUT GRANITE
                        entries.add(ModBlocks.CUT_GRANITE);
                        entries.add(ModBlocks.CUT_GRANITE_STAIRS);
                        entries.add(ModBlocks.CUT_GRANITE_SLAB);
                        entries.add(ModBlocks.CUT_GRANITE_WALL);

                        //GRANITE BRICKS
                        entries.add(ModBlocks.GRANITE_BRICKS);
                        entries.add(ModBlocks.GRANITE_BRICK_STAIRS);
                        entries.add(ModBlocks.GRANITE_BRICK_SLAB);
                        entries.add(ModBlocks.GRANITE_BRICK_WALL);

                        //CRACKED GRANITE BRICKS
                        entries.add(ModBlocks.CRACKED_GRANITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_GRANITE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_GRANITE_BRICK_WALL);

                        //GRANITE PILLAR
                        entries.add(ModBlocks.GRANITE_PILLAR);

                        //GRANITE TILES
                        entries.add(ModBlocks.GRANITE_TILES);
                        entries.add(ModBlocks.GRANITE_TILE_STAIRS);
                        entries.add(ModBlocks.GRANITE_TILE_SLAB);
                        entries.add(ModBlocks.GRANITE_TILE_WALL);

                        //DARK GRANITE
                        entries.add(ModBlocks.DARK_GRANITE);
                        entries.add(ModBlocks.DARK_GRANITE_STAIRS);
                        entries.add(ModBlocks.DARK_GRANITE_SLAB);
                        entries.add(ModBlocks.DARK_GRANITE_WALL);

                        //DIORITE

                        //COBBLED DIORITE
                        entries.add(ModBlocks.COBBLED_DIORITE);
                        entries.add(ModBlocks.COBBLED_DIORITE_STAIRS);
                        entries.add(ModBlocks.COBBLED_DIORITE_SLAB);
                        entries.add(ModBlocks.COBBLED_DIORITE_WALL);

                        //SMOOTH DIORITE
                        entries.add(ModBlocks.SMOOTH_DIORITE);
                        entries.add(ModBlocks.SMOOTH_DIORITE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_DIORITE_SLAB);
                        entries.add(ModBlocks.SMOOTH_DIORITE_WALL);

                        //POLISHED DIORITE
                        entries.add(ModBlocks.POLISHED_DIORITE_WALL);

                        //CHISELED DIORITE
                        entries.add(ModBlocks.CHISELED_DIORITE);

                        //CUT DIORITE
                        entries.add(ModBlocks.CUT_DIORITE);
                        entries.add(ModBlocks.CUT_DIORITE_STAIRS);
                        entries.add(ModBlocks.CUT_DIORITE_SLAB);
                        entries.add(ModBlocks.CUT_DIORITE_WALL);

                        //DIORITE BRICKS
                        entries.add(ModBlocks.DIORITE_BRICKS);
                        entries.add(ModBlocks.DIORITE_BRICK_STAIRS);
                        entries.add(ModBlocks.DIORITE_BRICK_SLAB);
                        entries.add(ModBlocks.DIORITE_BRICK_WALL);

                        //CRACKED DIORITE BRICKS
                        entries.add(ModBlocks.CRACKED_DIORITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_DIORITE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_DIORITE_BRICK_WALL);

                        //DIORITE PILLAR
                        entries.add(ModBlocks.DIORITE_PILLAR);

                        //DIORITE TILES
                        entries.add(ModBlocks.DIORITE_TILES);
                        entries.add(ModBlocks.DIORITE_TILE_STAIRS);
                        entries.add(ModBlocks.DIORITE_TILE_SLAB);
                        entries.add(ModBlocks.DIORITE_TILE_WALL);

                        //DARK DIORITE
                        entries.add(ModBlocks.DARK_DIORITE);
                        entries.add(ModBlocks.DARK_DIORITE_STAIRS);
                        entries.add(ModBlocks.DARK_DIORITE_SLAB);
                        entries.add(ModBlocks.DARK_DIORITE_WALL);

                        //ANDESITE

                        //COBBLED ANDESITE
                        entries.add(ModBlocks.COBBLED_ANDESITE);
                        entries.add(ModBlocks.COBBLED_ANDESITE_STAIRS);
                        entries.add(ModBlocks.COBBLED_ANDESITE_SLAB);
                        entries.add(ModBlocks.COBBLED_ANDESITE_WALL);

                        //SMOOTH ANDESITE
                        entries.add(ModBlocks.SMOOTH_ANDESITE);
                        entries.add(ModBlocks.SMOOTH_ANDESITE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_ANDESITE_SLAB);
                        entries.add(ModBlocks.SMOOTH_ANDESITE_WALL);

                        //POLISHED ANDESITE
                        entries.add(ModBlocks.POLISHED_ANDESITE_WALL);

                        //CHISELED ANDESITE
                        entries.add(ModBlocks.CHISELED_ANDESITE);

                        //CUT ANDESITE
                        entries.add(ModBlocks.CUT_ANDESITE);
                        entries.add(ModBlocks.CUT_ANDESITE_STAIRS);
                        entries.add(ModBlocks.CUT_ANDESITE_SLAB);
                        entries.add(ModBlocks.CUT_ANDESITE_WALL);

                        //ANDESITE BRICKS
                        entries.add(ModBlocks.ANDESITE_BRICKS);
                        entries.add(ModBlocks.ANDESITE_BRICK_STAIRS);
                        entries.add(ModBlocks.ANDESITE_BRICK_SLAB);
                        entries.add(ModBlocks.ANDESITE_BRICK_WALL);

                        //CRACKED ANDESITE BRICKS
                        entries.add(ModBlocks.CRACKED_ANDESITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_ANDESITE_BRICK_WALL);

                        //ANDESITE PILLAR
                        entries.add(ModBlocks.ANDESITE_PILLAR);

                        //ANDESITE TILES
                        entries.add(ModBlocks.ANDESITE_TILES);
                        entries.add(ModBlocks.ANDESITE_TILE_STAIRS);
                        entries.add(ModBlocks.ANDESITE_TILE_SLAB);
                        entries.add(ModBlocks.ANDESITE_TILE_WALL);

                        //DARK ANDESITE
                        entries.add(ModBlocks.DARK_ANDESITE);
                        entries.add(ModBlocks.DARK_ANDESITE_STAIRS);
                        entries.add(ModBlocks.DARK_ANDESITE_SLAB);
                        entries.add(ModBlocks.DARK_ANDESITE_WALL);

                        //DEEPSLATE

                        //SMOOTH DEEPSLATE
                        entries.add(ModBlocks.SMOOTH_DEEPSLATE);
                        entries.add(ModBlocks.SMOOTH_DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.SMOOTH_DEEPSLATE_WALL);

                        //CUT DEEPSLATE
                        entries.add(ModBlocks.CUT_DEEPSLATE);
                        entries.add(ModBlocks.CUT_DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.CUT_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.CUT_DEEPSLATE_WALL);

                        //CRACKED DEEPSLATE BRICKS
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL);

                        //DEEPSLATE PILLAR
                        entries.add(ModBlocks.DEEPSLATE_PILLAR);

                        //DARK DEEPSLATE
                        entries.add(ModBlocks.DARK_DEEPSLATE);
                        entries.add(ModBlocks.DARK_DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.DARK_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.DARK_DEEPSLATE_WALL);
                    }).build());

    public static void registerItemGroups() {
        BlackSoulsUltimateStones.LOGGER.info("Registering Item Groups for " + BlackSoulsUltimateStones.MOD_ID);
    }
}

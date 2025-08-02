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
                        //ANDESITE

                        //ANDESITE BRICKS
                        entries.add(ModBlocks.ANDESITE_BRICKS);
                        entries.add(ModBlocks.ANDESITE_BRICK_SLAB);
                        entries.add(ModBlocks.ANDESITE_BRICK_STAIRS);
                        entries.add(ModBlocks.ANDESITE_BRICK_WALL);

                        //ANDESITE PILLAR
                        entries.add(ModBlocks.ANDESITE_PILLAR);

                        //ANDESITE TILES
                        entries.add(ModBlocks.ANDESITE_TILES);
                        entries.add(ModBlocks.ANDESITE_TILE_SLAB);
                        entries.add(ModBlocks.ANDESITE_TILE_STAIRS);
                        entries.add(ModBlocks.ANDESITE_TILE_WALL);

                        //CHISELED ANDESITE
                        entries.add(ModBlocks.CHISELED_ANDESITE);

                        //COBBLED ANDESITE
                        entries.add(ModBlocks.COBBLED_ANDESITE);
                        entries.add(ModBlocks.COBBLED_ANDESITE_SLAB);
                        entries.add(ModBlocks.COBBLED_ANDESITE_STAIRS);
                        entries.add(ModBlocks.COBBLED_ANDESITE_WALL);

                        //CRACKED ANDESITE BRICKS
                        entries.add(ModBlocks.CRACKED_ANDESITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_ANDESITE_BRICK_WALL);

                        //CUT ANDESITE
                        entries.add(ModBlocks.CUT_ANDESITE);
                        entries.add(ModBlocks.CUT_ANDESITE_SLAB);
                        entries.add(ModBlocks.CUT_ANDESITE_STAIRS);
                        entries.add(ModBlocks.CUT_ANDESITE_WALL);

                        //DARK ANDESITE
                        entries.add(ModBlocks.DARK_ANDESITE);
                        entries.add(ModBlocks.DARK_ANDESITE_SLAB);
                        entries.add(ModBlocks.DARK_ANDESITE_STAIRS);
                        entries.add(ModBlocks.DARK_ANDESITE_WALL);

                        //POLISHED ANDESITE
                        entries.add(ModBlocks.POLISHED_ANDESITE_WALL);

                        //SMOOTH ANDESITE
                        entries.add(ModBlocks.SMOOTH_ANDESITE);
                        entries.add(ModBlocks.SMOOTH_ANDESITE_SLAB);
                        entries.add(ModBlocks.SMOOTH_ANDESITE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_ANDESITE_WALL);
                    }).build());

    public static void registerItemGroups() {
        BlackSoulsUltimateStones.LOGGER.info("Registering Item Groups for " + BlackSoulsUltimateStones.MOD_ID);
    }
}

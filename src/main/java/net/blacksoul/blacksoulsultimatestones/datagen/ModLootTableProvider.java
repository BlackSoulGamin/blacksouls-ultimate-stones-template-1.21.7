package net.blacksoul.blacksoulsultimatestones.datagen;

import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //SMOOTHSTONE
        addDrop(Blocks.SMOOTH_STONE, stoneDrops(Blocks.SMOOTH_STONE, ModBlocks.COBBLED_SMOOTHSTONE));
        addDrop(ModBlocks.SMOOTHSTONE_STAIRS);
        addDrop(ModBlocks.SMOOTHSTONE_WALL);

        //SMOOTHSTONE BRICKS
        addDrop(ModBlocks.SMOOTHSTONE_BRICKS);
        addDrop(ModBlocks.SMOOTHSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.SMOOTHSTONE_BRICK_WALL);
        addDrop(ModBlocks.SMOOTHSTONE_BRICK_SLAB, slabDrops(ModBlocks.SMOOTHSTONE_BRICK_SLAB));

        //SMOOTHSTONE PILLAR
        addDrop(ModBlocks.SMOOTHSTONE_PILLAR);

        //SMOOTHSTONE TILES
        addDrop(ModBlocks.SMOOTHSTONE_TILES);
        addDrop(ModBlocks.SMOOTHSTONE_TILE_STAIRS);
        addDrop(ModBlocks.SMOOTHSTONE_TILE_WALL);
        addDrop(ModBlocks.SMOOTHSTONE_TILE_SLAB, slabDrops(ModBlocks.SMOOTHSTONE_TILE_SLAB));

        //CHISELED SMOOTHSTONE
        addDrop(ModBlocks.CHISELED_SMOOTHSTONE);

        //COBBLED SMOOTHSTONE
        addDrop(ModBlocks.COBBLED_SMOOTHSTONE);
        addDrop(ModBlocks.COBBLED_SMOOTHSTONE_STAIRS);
        addDrop(ModBlocks.COBBLED_SMOOTHSTONE_WALL);
        addDrop(ModBlocks.COBBLED_SMOOTHSTONE_SLAB, slabDrops(ModBlocks.COBBLED_SMOOTHSTONE_SLAB));

        //CRACKED SMOOTHSTONE BRICKS
        addDrop(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS);
        addDrop(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_SMOOTHSTONE_BRICK_SLAB));

        //CUT SMOOTHSTONE
        addDrop(ModBlocks.CUT_SMOOTHSTONE);
        addDrop(ModBlocks.CUT_SMOOTHSTONE_STAIRS);
        addDrop(ModBlocks.CUT_SMOOTHSTONE_WALL);
        addDrop(ModBlocks.CUT_SMOOTHSTONE_SLAB, slabDrops(ModBlocks.CUT_SMOOTHSTONE_SLAB));

        //DARK SMOOTHSTONE
        addDrop(ModBlocks.DARK_SMOOTHSTONE);
        addDrop(ModBlocks.DARK_SMOOTHSTONE_STAIRS);
        addDrop(ModBlocks.DARK_SMOOTHSTONE_WALL);
        addDrop(ModBlocks.DARK_SMOOTHSTONE_SLAB, slabDrops(ModBlocks.DARK_SMOOTHSTONE_SLAB));

        //POLISHED SMOOTHSTONE
        addDrop(ModBlocks.POLISHED_SMOOTHSTONE_WALL);

        //SMOOTH SMOOTHSTONE
        addDrop(ModBlocks.SMOOTH_SMOOTHSTONE);
        addDrop(ModBlocks.SMOOTH_SMOOTHSTONE_STAIRS);
        addDrop(ModBlocks.SMOOTH_SMOOTHSTONE_WALL);
        addDrop(ModBlocks.SMOOTH_SMOOTHSTONE_SLAB, slabDrops(ModBlocks.SMOOTH_SMOOTHSTONE_SLAB));

        //ANDESITE
        addDrop(Blocks.ANDESITE, stoneDrops(Blocks.ANDESITE, ModBlocks.COBBLED_ANDESITE));

        //ANDESITE BRICKS
        addDrop(ModBlocks.ANDESITE_BRICKS);
        addDrop(ModBlocks.ANDESITE_BRICK_STAIRS);
        addDrop(ModBlocks.ANDESITE_BRICK_WALL);
        addDrop(ModBlocks.ANDESITE_BRICK_SLAB, slabDrops(ModBlocks.ANDESITE_BRICK_SLAB));

        //ANDESITE PILLAR
        addDrop(ModBlocks.ANDESITE_PILLAR);

        //ANDESITE TILES
        addDrop(ModBlocks.ANDESITE_TILES);
        addDrop(ModBlocks.ANDESITE_TILE_STAIRS);
        addDrop(ModBlocks.ANDESITE_TILE_WALL);
        addDrop(ModBlocks.ANDESITE_TILE_SLAB, slabDrops(ModBlocks.ANDESITE_TILE_SLAB));

        //CHISELED ANDESITE
        addDrop(ModBlocks.CHISELED_ANDESITE);

        //COBBLED ANDESITE
        addDrop(ModBlocks.COBBLED_ANDESITE);
        addDrop(ModBlocks.COBBLED_ANDESITE_STAIRS);
        addDrop(ModBlocks.COBBLED_ANDESITE_WALL);
        addDrop(ModBlocks.COBBLED_ANDESITE_SLAB, slabDrops(ModBlocks.COBBLED_ANDESITE_SLAB));

        //CRACKED ANDESITE BRICKS
        addDrop(ModBlocks.CRACKED_ANDESITE_BRICKS);
        addDrop(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_ANDESITE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB));

        //CUT ANDESITE
        addDrop(ModBlocks.CUT_ANDESITE);
        addDrop(ModBlocks.CUT_ANDESITE_STAIRS);
        addDrop(ModBlocks.CUT_ANDESITE_WALL);
        addDrop(ModBlocks.CUT_ANDESITE_SLAB, slabDrops(ModBlocks.CUT_ANDESITE_SLAB));

        //DARK ANDESITE
        addDrop(ModBlocks.DARK_ANDESITE);
        addDrop(ModBlocks.DARK_ANDESITE_STAIRS);
        addDrop(ModBlocks.DARK_ANDESITE_WALL);
        addDrop(ModBlocks.DARK_ANDESITE_SLAB, slabDrops(ModBlocks.DARK_ANDESITE_SLAB));

        //POLISHED ANDESITE
        addDrop(ModBlocks.POLISHED_ANDESITE_WALL);

        //SMOOTH ANDESITE
        addDrop(ModBlocks.SMOOTH_ANDESITE);
        addDrop(ModBlocks.SMOOTH_ANDESITE_STAIRS);
        addDrop(ModBlocks.SMOOTH_ANDESITE_WALL);
        addDrop(ModBlocks.SMOOTH_ANDESITE_SLAB, slabDrops(ModBlocks.SMOOTH_ANDESITE_SLAB));

        //DIORITE
        addDrop(Blocks.DIORITE, stoneDrops(Blocks.DIORITE, ModBlocks.COBBLED_DIORITE));

        //DIORITE BRICKS
        addDrop(ModBlocks.DIORITE_BRICKS);
        addDrop(ModBlocks.DIORITE_BRICK_STAIRS);
        addDrop(ModBlocks.DIORITE_BRICK_WALL);
        addDrop(ModBlocks.DIORITE_BRICK_SLAB, slabDrops(ModBlocks.DIORITE_BRICK_SLAB));

        //DIORITE PILLAR
        addDrop(ModBlocks.DIORITE_PILLAR);

        //DIORITE TILES
        addDrop(ModBlocks.DIORITE_TILES);
        addDrop(ModBlocks.DIORITE_TILE_STAIRS);
        addDrop(ModBlocks.DIORITE_TILE_WALL);
        addDrop(ModBlocks.DIORITE_TILE_SLAB, slabDrops(ModBlocks.DIORITE_TILE_SLAB));

        //CHISELED DIORITE
        addDrop(ModBlocks.CHISELED_DIORITE);

        //COBBLED DIORITE
        addDrop(ModBlocks.COBBLED_DIORITE);
        addDrop(ModBlocks.COBBLED_DIORITE_STAIRS);
        addDrop(ModBlocks.COBBLED_DIORITE_WALL);
        addDrop(ModBlocks.COBBLED_DIORITE_SLAB, slabDrops(ModBlocks.COBBLED_DIORITE_SLAB));

        //CRACKED DIORITE BRICKS
        addDrop(ModBlocks.CRACKED_DIORITE_BRICKS);
        addDrop(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_DIORITE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_DIORITE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_DIORITE_BRICK_SLAB));

        //CUT DIORITE
        addDrop(ModBlocks.CUT_DIORITE);
        addDrop(ModBlocks.CUT_DIORITE_STAIRS);
        addDrop(ModBlocks.CUT_DIORITE_WALL);
        addDrop(ModBlocks.CUT_DIORITE_SLAB, slabDrops(ModBlocks.CUT_DIORITE_SLAB));

        //DARK DIORITE
        addDrop(ModBlocks.DARK_DIORITE);
        addDrop(ModBlocks.DARK_DIORITE_STAIRS);
        addDrop(ModBlocks.DARK_DIORITE_WALL);
        addDrop(ModBlocks.DARK_DIORITE_SLAB, slabDrops(ModBlocks.DARK_DIORITE_SLAB));

        //POLISHED DIORITE
        addDrop(ModBlocks.POLISHED_DIORITE_WALL);

        //SMOOTH DIORITE
        addDrop(ModBlocks.SMOOTH_DIORITE);
        addDrop(ModBlocks.SMOOTH_DIORITE_STAIRS);
        addDrop(ModBlocks.SMOOTH_DIORITE_WALL);
        addDrop(ModBlocks.SMOOTH_DIORITE_SLAB, slabDrops(ModBlocks.SMOOTH_DIORITE_SLAB));

        //GRANITE
        addDrop(Blocks.GRANITE, stoneDrops(Blocks.GRANITE, ModBlocks.COBBLED_GRANITE));

        //GRANITE BRICKS
        addDrop(ModBlocks.GRANITE_BRICKS);
        addDrop(ModBlocks.GRANITE_BRICK_STAIRS);
        addDrop(ModBlocks.GRANITE_BRICK_WALL);
        addDrop(ModBlocks.GRANITE_BRICK_SLAB, slabDrops(ModBlocks.GRANITE_BRICK_SLAB));

        //GRANITE PILLAR
        addDrop(ModBlocks.GRANITE_PILLAR);

        //GRANITE TILES
        addDrop(ModBlocks.GRANITE_TILES);
        addDrop(ModBlocks.GRANITE_TILE_STAIRS);
        addDrop(ModBlocks.GRANITE_TILE_WALL);
        addDrop(ModBlocks.GRANITE_TILE_SLAB, slabDrops(ModBlocks.GRANITE_TILE_SLAB));

        //CHISELED GRANITE
        addDrop(ModBlocks.CHISELED_GRANITE);

        //COBBLED GRANITE
        addDrop(ModBlocks.COBBLED_GRANITE);
        addDrop(ModBlocks.COBBLED_GRANITE_STAIRS);
        addDrop(ModBlocks.COBBLED_GRANITE_WALL);
        addDrop(ModBlocks.COBBLED_GRANITE_SLAB, slabDrops(ModBlocks.COBBLED_GRANITE_SLAB));

        //CRACKED GRANITE BRICKS
        addDrop(ModBlocks.CRACKED_GRANITE_BRICKS);
        addDrop(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_GRANITE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_GRANITE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_GRANITE_BRICK_SLAB));

        //CUT GRANITE
        addDrop(ModBlocks.CUT_GRANITE);
        addDrop(ModBlocks.CUT_GRANITE_STAIRS);
        addDrop(ModBlocks.CUT_GRANITE_WALL);
        addDrop(ModBlocks.CUT_GRANITE_SLAB, slabDrops(ModBlocks.CUT_GRANITE_SLAB));

        //DARK GRANITE
        addDrop(ModBlocks.DARK_GRANITE);
        addDrop(ModBlocks.DARK_GRANITE_STAIRS);
        addDrop(ModBlocks.DARK_GRANITE_WALL);
        addDrop(ModBlocks.DARK_GRANITE_SLAB, slabDrops(ModBlocks.DARK_GRANITE_SLAB));

        //POLISHED GRANITE
        addDrop(ModBlocks.POLISHED_GRANITE_WALL);

        //SMOOTH GRANITE
        addDrop(ModBlocks.SMOOTH_GRANITE);
        addDrop(ModBlocks.SMOOTH_GRANITE_STAIRS);
        addDrop(ModBlocks.SMOOTH_GRANITE_WALL);
        addDrop(ModBlocks.SMOOTH_GRANITE_SLAB, slabDrops(ModBlocks.SMOOTH_GRANITE_SLAB));

    }
    public LootTable.Builder stoneDrops(Block withSilkTouch, Block withoutSilkTouch) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(
                withSilkTouch,
                this.applyExplosionDecay(
                        withSilkTouch, ItemEntry.builder(withoutSilkTouch)
                )
        );
    }
}

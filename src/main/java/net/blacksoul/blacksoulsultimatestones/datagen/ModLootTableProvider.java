package net.blacksoul.blacksoulsultimatestones.datagen;

import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
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

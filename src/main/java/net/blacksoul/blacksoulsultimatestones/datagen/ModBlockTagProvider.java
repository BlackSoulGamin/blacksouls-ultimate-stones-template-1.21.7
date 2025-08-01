package net.blacksoul.blacksoulsultimatestones.datagen;

import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
                .add(ModBlocks.ANDESITE_BRICKS)
                .add(ModBlocks.ANDESITE_BRICK_SLAB)
                .add(ModBlocks.ANDESITE_BRICK_STAIRS)
                .add(ModBlocks.ANDESITE_BRICK_WALL);

        valueLookupBuilder(BlockTags.FENCES)
                .add(ModBlocks.ANDESITE_BRICK_WALL);

    }
}

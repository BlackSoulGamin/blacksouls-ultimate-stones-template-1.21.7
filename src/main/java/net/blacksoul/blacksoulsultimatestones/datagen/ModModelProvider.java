package net.blacksoul.blacksoulsultimatestones.datagen;

import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool andesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS);
        andesitePool.stairs(ModBlocks.ANDESITE_BRICK_STAIRS);
        andesitePool.slab(ModBlocks.ANDESITE_BRICK_SLAB);
        andesitePool.wall(ModBlocks.ANDESITE_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}

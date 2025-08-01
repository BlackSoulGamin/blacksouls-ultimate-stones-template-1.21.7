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
                    .displayName(Text.translatable("itemgroup.blacksouls-ultimate-stones.blacksouls_ultimate_stones"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ANDESITE_BRICKS);
                        entries.add(ModBlocks.ANDESITE_BRICK_SLAB);
                        entries.add(ModBlocks.ANDESITE_BRICK_STAIRS);
                        entries.add(ModBlocks.ANDESITE_BRICK_WALL);
                    }).build());

    public static void registerItemGroups() {
        BlackSoulsUltimateStones.LOGGER.info("Registering Item Groups for " + BlackSoulsUltimateStones.MOD_ID);
    }
}

package net.blacksoul.blacksoulsultimatestones;

import net.blacksoul.blacksoulsultimatestones.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlackSoulsUltimateStones implements ModInitializer {
	public static final String MOD_ID = "blacksouls-ultimate-stones";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}
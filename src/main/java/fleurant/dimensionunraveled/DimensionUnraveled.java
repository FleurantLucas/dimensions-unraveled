package fleurant.dimensionunraveled;

import fleurant.dimensionunraveled.block.ModBlocks;
import fleurant.dimensionunraveled.item.ModItemGroups;
import fleurant.dimensionunraveled.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DimensionUnraveled implements ModInitializer {
	public static final String MOD_ID = "dimension-unraveled";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemsGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}

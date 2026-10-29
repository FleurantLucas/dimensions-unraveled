package fleurant.dimensionunraveled.item;

import fleurant.dimensionunraveled.DimensionUnraveled;
import fleurant.dimensionunraveled.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ORANGE_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(DimensionUnraveled.MOD_ID, "orange_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ORANGE_GARNET))
                    .displayName(Text.translatable("itemgroup.dimension-unraveled.orange_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ORANGE_GARNET);
                        entries.add(ModItems.RAW_ORANGE_GARNET);
                    }).build());

    public static final ItemGroup ORANGE_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(DimensionUnraveled.MOD_ID, "orange_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ORANGE_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.dimension-unraveled.orange_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ORANGE_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_ORANGE_GARNET_BLOCK);
                    }).build());

    public static void registerItemsGroups() {
        DimensionUnraveled.LOGGER.info("Registering Item Groups for " + DimensionUnraveled.MOD_ID);
    }

}

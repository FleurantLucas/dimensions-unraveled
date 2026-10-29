package fleurant.dimensionunraveled.item;

import fleurant.dimensionunraveled.DimensionUnraveled;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ORANGE_GARNET = registerItem("orange_garnet", new Item(new Item.Settings()));
    public static final Item RAW_ORANGE_GARNET = registerItem("raw_orange_garnet", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DimensionUnraveled.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DimensionUnraveled.LOGGER.info("Registering Mod Items for " + DimensionUnraveled.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
//            entries.add(ORANGE_GARNET);
//            entries.add(RAW_ORANGE_GARNET);
//        });
    }

}

package net.nolan.mccourse.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nolan.mccourse.MCCourseMod;
import net.nolan.mccourse.block.ModBlocks;

public class ModItems {

    public static final Item ENDERITE = registerItem("enderite",
            new Item(new FabricItemSettings()));

    public static final Item RAW_ENDERITE = registerItem("raw_enderite",
            new Item(new FabricItemSettings()));

    public static final Item ENDERITE_SWORD = registerItem("enderite_sword",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }



    private static void itemGroupNatural(FabricItemGroupEntries entries) {

        entries.add(ModBlocks.END_PLASM_GRASS);
        entries.add(ModBlocks.ENDERITE_ORE);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(ENDERITE);
        entries.add(RAW_ENDERITE);
    }

    private static void itemGroupCombat(FabricItemGroupEntries entries) {
        entries.add(ENDERITE_SWORD);
    }

    public static void registerModItems() {
        MCCourseMod.LOGGER.info("registering mod items for" + MCCourseMod.MOD_ID );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::itemGroupNatural);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::itemGroupCombat);
    }
}

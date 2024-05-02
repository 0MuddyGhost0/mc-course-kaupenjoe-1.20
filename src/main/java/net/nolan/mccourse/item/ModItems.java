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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }



    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(ENDERITE);
        entries.add(ModBlocks.END_PLASM_GRASS);
        entries.add(ModBlocks.ENDERITE_ORE);
    }
    public static void registerModItems() {
        MCCourseMod.LOGGER.info("registering mod items for" + MCCourseMod.MOD_ID );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}

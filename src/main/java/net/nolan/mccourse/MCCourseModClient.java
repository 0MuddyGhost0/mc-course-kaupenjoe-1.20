package net.nolan.mccourse;

import net.fabricmc.api.ClientModInitializer;
import net.nolan.mccourse.item.ModItemGroup;
import net.nolan.mccourse.item.ModItems;

public class MCCourseModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItemGroup.registerItemGroups();

    }
}

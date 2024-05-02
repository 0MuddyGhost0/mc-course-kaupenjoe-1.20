package net.nolan.mccourse.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nolan.mccourse.MCCourseMod;
import net.nolan.mccourse.block.ModBlocks;

public class ModItemGroup {

    public static final ItemGroup ENDMATICA = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCCourseMod.MOD_ID, "endmatica"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.Endmatica"))
                    .icon(() -> new ItemStack(ModBlocks.END_PLASM_GRASS)).entries((displayContext, entries) -> {

                        entries.add(ModItems.ENDERITE);

                        entries.add(ModBlocks.END_PLASM_GRASS);
                        entries.add(ModBlocks.ENDERITE_ORE);

                    }).build());

    public  static void registerItemGroups() {

    }
}

package org.zb.zbcraft;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class zbItemGroup {
    public static final ItemGroup ZbItemGroups = FabricItemGroup.builder()
            .icon(() -> new ItemStack(zbItems.zb_item))
            .displayName(Text.translatable("itemGroup.zbcraft.zb_item_groups"))
            .entries((context, entries) -> {
                entries.add(zbItems.zb_item);
                entries.add(zbBlocks.zb_block.asItem());
                entries.add(zbBlocks.hsannu_block.asItem());
            })
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, Identifier.of("zbcraft", "zbcraft"), ZbItemGroups);

    }
}
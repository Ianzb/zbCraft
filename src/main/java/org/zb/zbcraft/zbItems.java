package org.zb.zbcraft;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.zb.zbcraft.item.zbItem;

public final class zbItems {

    // 新物品的实例
    public static final Item zb_item = register("zb_item", new zbItem(new Item.Settings()));

    private zbItems() {}

    public static <T extends Item> T register(String path, T item) {
        return Registry.register(Registries.ITEM, Identifier.of("zbcraft", path), item);
    }

    public static void initialize() {
    }
}

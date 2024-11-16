package org.zb.zbcraft;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.zb.zbcraft.block.hsannuBlock;
import org.zb.zbcraft.block.zbBlock;

public class zbBlocks {
    public static final Block zb_block = register("zb_block", new zbBlock(Block.Settings.create().requiresTool().strength(25f, 1500f)));
    public static final Block hsannu_block = register("hsannu_block", new hsannuBlock(Block.Settings.create().requiresTool().strength(25f, 1500f)));

    private zbBlocks() {
    }

    private static <T extends Block> T register(String path, T block) {
        Registry.register(Registries.BLOCK, Identifier.of("zbcraft", path), block);
        Registry.register(Registries.ITEM, Identifier.of("zbcraft", path), new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static void initialize() {
    }
}
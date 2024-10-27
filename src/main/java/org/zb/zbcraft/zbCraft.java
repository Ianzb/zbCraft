package org.zb.zbcraft;

import net.fabricmc.api.ModInitializer;

public class zbCraft implements ModInitializer {

    @Override
    public void onInitialize() {
        zbItems.initialize();
        zbBlocks.initialize();
        zbItemGroup.initialize();
    }
}

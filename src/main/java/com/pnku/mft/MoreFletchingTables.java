package com.pnku.mft;

import com.pnku.mft.init.MftBlockInit;
import com.pnku.mft.init.MftItemInit;
import com.pnku.mft.poi.MftPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class MoreFletchingTables implements ModInitializer {
    public static final String MODID = "lolmft";

    @Override
    public void onInitialize() {
        MftBlockInit.registerBlocks();
        MftItemInit.registerItems();
        MftPointOfInterestTypes.init();
    }

    public static ResourceLocation asId(String path) {
        return new ResourceLocation(MODID, path);
    }
}
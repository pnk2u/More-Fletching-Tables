package de.pnku.mft;

import de.pnku.mft.init.MftBlockInit;
import de.pnku.mft.init.MftItemInit;
import de.pnku.mft.poi.MftPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;

public class MoreFletchingTables implements ModInitializer {
    public static final String MODID = "lolmft";

    @Override
    public void onInitialize() {
        MftBlockInit.registerBlocks();
        MftItemInit.registerItems();
        MftPointOfInterestTypes.init();
    }

    public static Identifier asId(String path) {
        return Identifier.fromNamespaceAndPath(MODID, path);
    }
}
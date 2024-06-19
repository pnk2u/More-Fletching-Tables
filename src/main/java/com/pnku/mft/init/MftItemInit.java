package com.pnku.mft.init;

import com.pnku.mft.MoreFletchingTables;
import com.pnku.mft.block.MoreFletchingTablesBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class MftItemInit {
    public static final BlockItem OAK_FLETCHING_TABLE_I = new BlockItem(MftBlockInit.OAK_FLETCHING_TABLE, new Item.Settings());
    public static final BlockItem SPRUCE_FLETCHING_TABLE_I = new BlockItem(MftBlockInit.SPRUCE_FLETCHING_TABLE, new Item.Settings());
    public static final BlockItem JUNGLE_FLETCHING_TABLE_I = new BlockItem(MftBlockInit.JUNGLE_FLETCHING_TABLE, new Item.Settings());
    public static final BlockItem ACACIA_FLETCHING_TABLE_I = new BlockItem(MftBlockInit.ACACIA_FLETCHING_TABLE, new Item.Settings());
    public static final BlockItem DARK_OAK_FLETCHING_TABLE_I = new BlockItem(MftBlockInit.DARK_OAK_FLETCHING_TABLE, new Item.Settings());
    public static final BlockItem MANGROVE_FLETCHING_TABLE_I = new BlockItem(MftBlockInit.MANGROVE_FLETCHING_TABLE, new Item.Settings());
    public static final BlockItem CHERRY_FLETCHING_TABLE_I = new BlockItem(MftBlockInit.CHERRY_FLETCHING_TABLE, new Item.Settings());
    public static final BlockItem BAMBOO_FLETCHING_TABLE_I = new BlockItem(MftBlockInit.BAMBOO_FLETCHING_TABLE, new Item.Settings());
    public static final BlockItem CRIMSON_FLETCHING_TABLE_I = new BlockItem(MftBlockInit.CRIMSON_FLETCHING_TABLE, new Item.Settings());
    public static final BlockItem WARPED_FLETCHING_TABLE_I = new BlockItem(MftBlockInit.WARPED_FLETCHING_TABLE, new Item.Settings());


    public static void registerItems() {
        registerItem(OAK_FLETCHING_TABLE_I, Items.FLETCHING_TABLE);
        registerItem(SPRUCE_FLETCHING_TABLE_I, OAK_FLETCHING_TABLE_I);
        registerItem(JUNGLE_FLETCHING_TABLE_I, SPRUCE_FLETCHING_TABLE_I);
        registerItem(ACACIA_FLETCHING_TABLE_I, JUNGLE_FLETCHING_TABLE_I);
        registerItem(DARK_OAK_FLETCHING_TABLE_I, ACACIA_FLETCHING_TABLE_I);
        registerItem(MANGROVE_FLETCHING_TABLE_I, DARK_OAK_FLETCHING_TABLE_I);
        registerItem(CHERRY_FLETCHING_TABLE_I, MANGROVE_FLETCHING_TABLE_I);
        registerItem(BAMBOO_FLETCHING_TABLE_I, CHERRY_FLETCHING_TABLE_I);
        registerItem(CRIMSON_FLETCHING_TABLE_I, BAMBOO_FLETCHING_TABLE_I);
        registerItem(WARPED_FLETCHING_TABLE_I, CRIMSON_FLETCHING_TABLE_I);
    }

    private static void registerItem(BlockItem fletchingTable, Item fletchingTableAfter) {
        Registry.register(Registries.ITEM, MoreFletchingTables.asId(((MoreFletchingTablesBlock) fletchingTable.getBlock()).fletchingtableType + "_fletching_table"), fletchingTable);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> entries.addAfter(fletchingTableAfter, fletchingTable));
    }
}
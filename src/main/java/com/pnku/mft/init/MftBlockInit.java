package com.pnku.mft.init;

import com.pnku.mft.MoreFletchingTables;
import com.pnku.mft.block.MoreFletchingTablesBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

import java.util.ArrayList;
import java.util.List;

public class MftBlockInit {
    public static final MoreFletchingTablesBlock OAK_FLETCHING_TABLE = new MoreFletchingTablesBlock(MapColor.OAK_TAN, "oak");
    public static final MoreFletchingTablesBlock SPRUCE_FLETCHING_TABLE = new MoreFletchingTablesBlock(MapColor.SPRUCE_BROWN, "spruce");
    public static final MoreFletchingTablesBlock JUNGLE_FLETCHING_TABLE = new MoreFletchingTablesBlock(MapColor.DIRT_BROWN, "jungle");
    public static final MoreFletchingTablesBlock ACACIA_FLETCHING_TABLE = new MoreFletchingTablesBlock(MapColor.ORANGE, "acacia");
    public static final MoreFletchingTablesBlock DARK_OAK_FLETCHING_TABLE = new MoreFletchingTablesBlock(MapColor.BROWN, "dark_oak");
    public static final MoreFletchingTablesBlock MANGROVE_FLETCHING_TABLE = new MoreFletchingTablesBlock(MapColor.RED, "mangrove");
    public static final MoreFletchingTablesBlock CHERRY_FLETCHING_TABLE = new MoreFletchingTablesBlock(MapColor.TERRACOTTA_WHITE, BlockSoundGroup.CHERRY_WOOD, "cherry");
    public static final MoreFletchingTablesBlock BAMBOO_FLETCHING_TABLE = new MoreFletchingTablesBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD, "bamboo");
    public static final MoreFletchingTablesBlock CRIMSON_FLETCHING_TABLE = new MoreFletchingTablesBlock(MapColor.DULL_PINK, BlockSoundGroup.NETHER_WOOD, "crimson");
    public static final MoreFletchingTablesBlock WARPED_FLETCHING_TABLE = new MoreFletchingTablesBlock(MapColor.DARK_AQUA, BlockSoundGroup.NETHER_WOOD, "warped");

    public static final List<Block> more_fletching_tables = new ArrayList<>();


    public static void registerBlocks() {
        registerBlock(OAK_FLETCHING_TABLE);
        registerBlock(SPRUCE_FLETCHING_TABLE);
        registerBlock(JUNGLE_FLETCHING_TABLE);
        registerBlock(ACACIA_FLETCHING_TABLE);
        registerBlock(DARK_OAK_FLETCHING_TABLE);
        registerBlock(MANGROVE_FLETCHING_TABLE);
        registerBlock(CHERRY_FLETCHING_TABLE);
        registerBlock(BAMBOO_FLETCHING_TABLE);
        registerBlock(CRIMSON_FLETCHING_TABLE);
        registerBlock(WARPED_FLETCHING_TABLE);

    }

    private static void registerBlock(MoreFletchingTablesBlock fletching_table) {
        Registry.register(Registries.BLOCK, MoreFletchingTables.asId(fletching_table.fletchingtableType + "_fletching_table"), fletching_table);
        more_fletching_tables.add(fletching_table);
    }
}
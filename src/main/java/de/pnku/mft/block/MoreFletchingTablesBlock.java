package de.pnku.mft.block;

import de.pnku.mft.MoreFletchingTables;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FletchingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;


public class MoreFletchingTablesBlock extends FletchingTableBlock {
    public final String fletchingtableType;

    public MoreFletchingTablesBlock(MapColor colour, String fletchingtableType) {
        super(Properties.ofFullCopy(Blocks.FLETCHING_TABLE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreFletchingTables.asId(fletchingtableType + "_fletching_table"))));
        this.fletchingtableType = fletchingtableType;
    }

    public MoreFletchingTablesBlock(MapColor colour, SoundType soundType, String fletchingtableType) {
        super(Properties.ofFullCopy(Blocks.FLETCHING_TABLE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreFletchingTables.asId(fletchingtableType + "_fletching_table"))).sound(soundType));
        this.fletchingtableType = fletchingtableType;
    }
}
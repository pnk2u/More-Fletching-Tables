package de.pnku.mft.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FletchingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;


public class MoreFletchingTablesBlock extends FletchingTableBlock {
    public final String fletchingtableType;

    public MoreFletchingTablesBlock(MapColor colour, String fletchingtableType) {
        super(Properties.ofFullCopy(Blocks.FLETCHING_TABLE).mapColor(colour));
        this.fletchingtableType = fletchingtableType;
    }

    public MoreFletchingTablesBlock(MapColor colour, SoundType soundType, String fletchingtableType) {
        super(Properties.ofFullCopy(Blocks.FLETCHING_TABLE).mapColor(colour).sound(soundType));
        this.fletchingtableType = fletchingtableType;
    }
}
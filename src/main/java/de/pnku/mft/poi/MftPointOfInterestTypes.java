package de.pnku.mft.poi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import de.pnku.mft.init.MftBlockInit;
import de.pnku.mft.mixin.PoiTypesAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MftPointOfInterestTypes {
    public static void init() {
        Map<BlockState, Holder<PoiType>> poiStatesToType = PoiTypesAccessor
                .getPointOfInterestStatesToType();

        Holder<PoiType> fletcherEntry = BuiltInRegistries.POINT_OF_INTEREST_TYPE
                .get(PoiTypes.FLETCHER).get();

        PoiType fletcherPoiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.getValue(PoiTypes.FLETCHER);

        List<BlockState> fletcherBlockStates = new ArrayList<BlockState>(fletcherPoiType.matchingStates);

        for (Block block : MftBlockInit.more_fletching_tables) {
            ImmutableList<BlockState> blockStates = block.getStateDefinition().getPossibleStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, fletcherEntry);
            }

            fletcherBlockStates.addAll(blockStates);
        }

        fletcherPoiType.matchingStates = ImmutableSet.copyOf(fletcherBlockStates);
    }
}
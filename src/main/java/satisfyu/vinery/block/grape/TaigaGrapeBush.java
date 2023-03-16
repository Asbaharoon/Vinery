package satisfyu.vinery.block.grape;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import satisfyu.vinery.util.GrapevineType;

import java.util.Iterator;

public class TaigaGrapeBush extends GrapeBush {

    public TaigaGrapeBush(Settings settings, GrapevineType type) {
        super(settings, type, 5);
    }

    @Override
    public boolean canGrowPlace(WorldView world, BlockPos blockPos, BlockState blockState) {
        System.out.println(world.getBaseLightLevel(blockPos, 0));
        if (world.getBaseLightLevel(blockPos, 0) <= 9) {
            return false;
        }
        int size = 4;
        Iterator<BlockPos> var2 = BlockPos.iterate(blockPos.add(-size, -2, -size), blockPos.add(size, 1, size)).iterator();

        BlockPos pos;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            pos = var2.next();
        } while(!(world.getBlockState(pos).getBlock() == Blocks.PODZOL || world.getBlockState(pos).getBlock() == Blocks.COARSE_DIRT));

        return true;
    }
}
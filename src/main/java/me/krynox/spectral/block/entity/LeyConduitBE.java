package me.krynox.spectral.block.entity;

import me.krynox.spectral.Spectral;
import me.krynox.spectral.setup.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class LeyConduitBE extends BlockEntity {
    public LeyConduitBE(BlockPos pPos, BlockState pBlockState) {
        super(Registration.LEY_CONDUIT_BE.get(), pPos, pBlockState);
    }

    private int i = 0;

    public static void tick(Level level, BlockPos pos, BlockState blockState, LeyConduitBE be) {
        if(!level.isClientSide) {
            be.i++;
            if (be.i % 40 == 0) Spectral.LOGGER.info("TICK!");
        }
    }
}
package com.first.firstmod.block.custom;

import com.first.firstmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class MagicBlock extends Block {
    public MagicBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {

        pLevel.playSound(pPlayer, pPos, SoundEvents.AMETHYST_CLUSTER_PLACE, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (pEntity instanceof ItemEntity itemEntity) {
            if (itemEntity.getItem().getItem() == ModItems.RAW_ALEXANDRITE.get()) {
                itemEntity.setItem(new ItemStack(ModItems.ALEXANDRITE.get(), itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.RABBIT_FOOT) {
                itemEntity.setItem(new ItemStack(Items.EMERALD, itemEntity.getItem().getCount()));
            }

            if (itemEntity.getItem().getItem() == ModItems.ALEXANDRITE.get() ) {
                Thread delayedAction = new Thread() {
                    public void run() {
                        try {
                            Thread.sleep(5000);
                            itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }

                    }
                };
                delayedAction.start();
            }
        }

        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}

package com.cha1rate.brassmod.item;

import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Instrument;
import net.minecraft.world.item.InstrumentItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;

public class TromboneItem extends InstrumentItem {

    public TromboneItem(Properties properties, TagKey<Instrument> instrumentTag) {
        super(properties, instrumentTag);
    }

    @Override
    @Nonnull
    public InteractionResultHolder<ItemStack> use(
            @Nonnull Level level,
            @Nonnull Player player,
            @Nonnull InteractionHand hand) {
        InteractionResultHolder<ItemStack> result = super.use(level, player, hand);

        if (!level.isClientSide()) {
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, 0));
        }

        return result;
    }
}

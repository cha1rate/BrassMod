package com.cha1rate.brassmod.datagen.server;

import com.cha1rate.brassmod.BrassMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

import java.util.concurrent.CompletableFuture;

public class BrassGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public BrassGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, BrassMod.MOD_ID, registries);
    }

    @Override
    protected void start(HolderLookup.Provider registries) {

    }
}

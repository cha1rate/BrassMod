package com.cha1rate.brassmod.datagen.client;

import com.cha1rate.brassmod.BrassMod;
import com.cha1rate.brassmod.registry.BrassItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BrassItemModelProvider extends ItemModelProvider {
    public BrassItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BrassMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(BrassItems.SILVER_BRASS_INGOT.get());
        basicItem(BrassItems.GOLD_BRASS_INGOT.get());
    }
}

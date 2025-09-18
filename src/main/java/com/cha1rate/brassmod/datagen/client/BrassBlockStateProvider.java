package com.cha1rate.brassmod.datagen.client;

import com.cha1rate.brassmod.BrassMod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BrassBlockStateProvider extends BlockStateProvider {
    public BrassBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BrassMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        simpleBlockWithItem(BrassBlocks.HOGE.get(), cubeAll(BrassBlocks.HOGE.get()));
//        simpleBlockWithItem(BrassBlocks.Hoge)
    }

    private void simpleBlockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}

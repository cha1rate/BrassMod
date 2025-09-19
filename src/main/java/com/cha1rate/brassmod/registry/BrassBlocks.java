package com.cha1rate.brassmod.registry;

import com.cha1rate.brassmod.BrassMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BrassBlocks {
    // レジストリを作成
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BrassMod.MOD_ID);

    // ブロックを作成&レジストリに追加
    public static final RegistryObject<Block> MUSIC_STAND = registerBlockWithItem("music_stand",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f)
                    .noOcclusion()
                    .sound(SoundType.STEM)));

    // ブロック&アイテムを作成
    public static <T extends Block> RegistryObject<T> registerBlockWithItem(String name, Supplier<T> supplier) {
        // ブロックレジストリにブロックを登録
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        // アイテムレジストリにBlockItemを登録
        BrassItems.ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    // イベントバスに登録
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

package com.cha1rate.brassmod.registry;

import com.cha1rate.brassmod.BrassMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BrassItems {
    // レジストリを追加
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BrassMod.MOD_ID);

    // アイテムを作成 & レジストリに登録
    public static final RegistryObject<Item> TRUMPET = ITEMS.register("trumpet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TROMBONE = ITEMS.register("trombone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORN = ITEMS.register("horn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EUPHONIUM = ITEMS.register("euphonium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUBA = ITEMS.register("tuba",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_BRASS_INGOT = ITEMS.register("silver_brass_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_BRASS_INGOT = ITEMS.register("gold_brass_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package com.cha1rate.brassmod.registry;

import com.cha1rate.brassmod.BrassMod;
import com.cha1rate.brassmod.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
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
            () -> new TrumpetItem(new Item.Properties(),
                    TagKey.create(Registries.INSTRUMENT, ResourceLocation.fromNamespaceAndPath("brassmod", "trumpet_sound")))
    );

    public static final RegistryObject<Item> TROMBONE = ITEMS.register("trombone",
            () -> new TromboneItem(new Item.Properties(),
                    TagKey.create(Registries.INSTRUMENT, ResourceLocation.fromNamespaceAndPath("brassmod", "trombone_sound")))
    );
    public static final RegistryObject<Item> HORN = ITEMS.register("horn",
            () -> new HornItem(new Item.Properties(),
                    TagKey.create(Registries.INSTRUMENT, ResourceLocation.fromNamespaceAndPath("brassmod", "horn_sound")))
    );
    public static final RegistryObject<Item> EUPHONIUM = ITEMS.register("euphonium",
            () -> new EuphoniumItem(new Item.Properties(),
                    TagKey.create(Registries.INSTRUMENT, ResourceLocation.fromNamespaceAndPath("brassmod", "euphonium_sound")))
    );
    public static final RegistryObject<Item> TUBA = ITEMS.register("tuba",
            () -> new TubaItem(new Item.Properties(),
                    TagKey.create(Registries.INSTRUMENT, ResourceLocation.fromNamespaceAndPath("brassmod", "tuba_sound")))
    );

    public static final RegistryObject<Item> SILVER_BRASS_INGOT = ITEMS.register("silver_brass_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_BRASS_INGOT = ITEMS.register("gold_brass_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

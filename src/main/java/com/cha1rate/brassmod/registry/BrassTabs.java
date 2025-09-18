package com.cha1rate.brassmod.registry;

import com.cha1rate.brassmod.BrassMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BrassTabs {
    // レジストリを作成
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BrassMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BRASS_TAB =
            TABS.register("brass_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetabs.brass_tab"))
                    .icon(BrassItems.TRUMPET.get()::getDefaultInstance)
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(BrassItems.TRUMPET.get());
                        pOutput.accept(BrassItems.TROMBONE.get());
                        pOutput.accept(BrassItems.HORN.get());
                        pOutput.accept(BrassItems.EUPHONIUM.get());
                        pOutput.accept(BrassItems.TUBA.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}

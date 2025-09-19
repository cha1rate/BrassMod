package com.cha1rate.brassmod.datagen;

import com.cha1rate.brassmod.BrassMod;
import com.cha1rate.brassmod.datagen.client.*;
import com.cha1rate.brassmod.datagen.server.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = BrassMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BrassDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // アイテムモデル
        generator.addProvider(event.includeClient(), new BrassItemModelProvider(packOutput, existingFileHelper));
        // ブロックモデル
        generator.addProvider(event.includeClient(), new BrassBlockStateProvider(packOutput, existingFileHelper));
        // 言語ファイル
        generator.addProvider(event.includeClient(), new JAJPLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new ENUSLanguageProvider(packOutput));

        // ブロックタグ
        BrassBlockTagsProvider blockTagsProvider = generator.addProvider(event.includeServer(),
                new BrassBlockTagsProvider(packOutput, lookupProvider, existingFileHelper));
        // アイテムタグ
        generator.addProvider(event.includeServer(),
                new BrassItemTagsProvider(packOutput, lookupProvider,
                        blockTagsProvider.contentsGetter(), existingFileHelper));
        // ルートテーブル
        generator.addProvider(event.includeServer(), BrassLootTables.create(packOutput, lookupProvider));
        // レシピ
        generator.addProvider(event.includeServer(), new BrassRecipeProvider(packOutput, lookupProvider));
        // 進捗
        generator.addProvider(event.includeServer(), new BrassAdvancementsProvider(packOutput, lookupProvider, existingFileHelper));
        // データパック
        generator.addProvider(event.includeServer(), new BrassDatapacksProvider(packOutput, lookupProvider));
        // GlobalLootModifier
        generator.addProvider(event.includeServer(),
                new BrassGlobalLootModifierProvider(packOutput, lookupProvider));
    }
}

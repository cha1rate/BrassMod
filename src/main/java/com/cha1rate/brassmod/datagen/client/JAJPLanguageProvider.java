package com.cha1rate.brassmod.datagen.client;

import com.cha1rate.brassmod.BrassMod;
import com.cha1rate.brassmod.registry.BrassBlocks;
import com.cha1rate.brassmod.registry.BrassItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class JAJPLanguageProvider extends LanguageProvider {
    public JAJPLanguageProvider(PackOutput output) {
        super(output, BrassMod.MOD_ID, Locale.JAPAN.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        addItem(BrassItems.TRUMPET, "トランペット");
        addItem(BrassItems.TROMBONE, "トロンボーン");
        addItem(BrassItems.HORN, "ホルン");
        addItem(BrassItems.EUPHONIUM, "ユーフォニアム");
        addItem(BrassItems.TUBA, "テューバ");
        addBlock(BrassBlocks.MUSIC_STAND, "譜面台");
        addItem(BrassItems.SILVER_BRASS_INGOT, "銀の真鍮インゴット");
        addItem(BrassItems.GOLD_BRASS_INGOT, "金の真鍮インゴット");

        add("creativetabs.brass_tab","ブラス");
    }
}

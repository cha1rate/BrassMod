package com.cha1rate.brassmod.datagen.client;

import com.cha1rate.brassmod.BrassMod;
import com.cha1rate.brassmod.registry.BrassBlocks;
import com.cha1rate.brassmod.registry.BrassItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class ENUSLanguageProvider extends LanguageProvider {
    public ENUSLanguageProvider(PackOutput output) {
        super(output, BrassMod.MOD_ID, Locale.US.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        addItem(BrassItems.TRUMPET, "Trumpet");
        addItem(BrassItems.TROMBONE, "Trombone");
        addItem(BrassItems.HORN, "Horn");
        addItem(BrassItems.EUPHONIUM, "Euphonium");
        addItem(BrassItems.TUBA, "Tuba");
        addBlock(BrassBlocks.MUSIC_STAND, "Music Stand");

        add("creativetabs.brass_tab","Brass");
    }
}

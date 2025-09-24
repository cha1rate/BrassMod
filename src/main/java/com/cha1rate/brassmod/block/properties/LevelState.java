package com.cha1rate.brassmod.block.properties;

import net.minecraft.util.StringRepresentable;

public enum LevelState implements StringRepresentable {
    DEFAULT,
    RED,
    BLUE;

    @Override
    public String getSerializedName() {
        return name().toLowerCase();
    }
}

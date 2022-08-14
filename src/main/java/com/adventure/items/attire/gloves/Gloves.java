package com.adventure.items.attire.gloves;

import com.adventure.items.attire.Attire;

public interface Gloves extends Attire {
    @Override
    default boolean isGloves() {
        return true;
    }
}

package com.adventure.items.attire.chest;

import com.adventure.items.attire.Attire;

public interface Vest extends Attire {
    @Override
    default boolean isChest() {
        return true;
    }
}

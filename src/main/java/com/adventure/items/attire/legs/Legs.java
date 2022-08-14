package com.adventure.items.attire.legs;

import com.adventure.items.attire.Attire;

public interface Legs extends Attire {
    @Override
    default boolean isLegs() {
        return true;
    }
}

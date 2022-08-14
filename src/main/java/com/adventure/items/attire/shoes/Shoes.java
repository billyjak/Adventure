package com.adventure.items.attire.shoes;

import com.adventure.items.attire.Attire;

public interface Shoes extends Attire {
    @Override
    default boolean isShoes() {
        return true;
    }
}

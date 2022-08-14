package com.adventure.items.attire.helmet;

import com.adventure.items.attire.Attire;

public interface Helmet extends Attire {
    @Override
    default boolean isHelmet() {
        return true;
    }
}

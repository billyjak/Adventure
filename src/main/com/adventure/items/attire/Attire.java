package main.com.adventure.items.attire;

public interface Attire {
    default boolean isChest() {
        return false;
    }
    default boolean isGloves() {
        return false;
    }
    default boolean isHelmet() {
        return false;
    }
    default boolean isLegs() {
        return false;
    }
    default boolean isShoes() {
        return false;
    }
}

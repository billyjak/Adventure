package main.com.adventure.items.attire.legs;

import main.com.adventure.items.Item;
import main.com.adventure.items.attire.ArmorPiece;

public abstract class Legs extends ArmorPiece {
    public Legs(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight, durability, condition, armorRating);
    }

}

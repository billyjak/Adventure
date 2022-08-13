package main.com.adventure.items.attire.gloves;

import main.com.adventure.items.Item;
import main.com.adventure.items.attire.ArmorPiece;

public abstract class Gloves extends ArmorPiece {
    public Gloves(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight, durability, condition, armorRating);
    }

}

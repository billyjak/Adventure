package main.com.adventure.items.attire.helmet;

import main.com.adventure.items.Item;
import main.com.adventure.items.attire.ArmorPiece;

public abstract class Helmet extends ArmorPiece {
    public Helmet(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight, durability, condition, armorRating);
    }

}

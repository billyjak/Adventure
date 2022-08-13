package main.com.adventure.items.attire.shoes;

import main.com.adventure.items.Item;
import main.com.adventure.items.attire.ArmorPiece;

public abstract class Shoes extends ArmorPiece {
    public Shoes(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight, durability, condition, armorRating);
    }
}

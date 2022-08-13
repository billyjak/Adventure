package main.com.adventure.items.attire.chest;

import main.com.adventure.items.Item;
import main.com.adventure.items.attire.ArmorPiece;

public abstract class Chest extends ArmorPiece {


    public Chest(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight, durability, condition, armorRating);
    }

}

package main.com.adventure.items.attire.chest;

import main.com.adventure.items.Item;
import main.com.adventure.items.attire.ArmorPiece;

public abstract class Chest extends ArmorPiece {
    private Integer armorRating;

    public Chest(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight, durability, condition);
        this.armorRating = armorRating;
    }


    public Integer getArmorRating() {
        return armorRating;
    }

    public void setArmorRating(Integer armorRating) {
        this.armorRating = armorRating;
    }
}

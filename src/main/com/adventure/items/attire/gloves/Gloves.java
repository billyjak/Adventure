package main.com.adventure.items.attire.gloves;

import main.com.adventure.items.Item;
import main.com.adventure.items.attire.ArmorPiece;

public abstract class Gloves extends ArmorPiece {
    private Integer armorRating;

    public Gloves(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
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

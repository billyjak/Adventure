package main.com.adventure.items.attire.legs;

import main.com.adventure.items.Item;

public abstract class Legs extends Item {
    private Integer armorRating;

    public Legs(Integer value, Integer weight, Integer armorRating) {
        super(value, weight);
        this.armorRating = armorRating;
    }

    public Integer getArmorRating() {
        return armorRating;
    }

    public void setArmorRating(Integer armorRating) {
        this.armorRating = armorRating;
    }
}

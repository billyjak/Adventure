package main.com.adventure.items.attire.shoes;

import main.com.adventure.items.Item;

public abstract class Shoes extends Item {
    private Integer armorRating;

    public Shoes(Integer value, Integer weight, Integer armorRating) {
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

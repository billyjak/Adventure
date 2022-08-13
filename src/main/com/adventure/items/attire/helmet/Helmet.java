package main.com.adventure.items.attire.helmet;

import main.com.adventure.items.Item;

public abstract class Helmet extends Item {
    private Integer armorRating;

    public Helmet(Integer value, Integer weight, Integer armorRating) {
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

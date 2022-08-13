package main.com.adventure.items.attire;

import main.com.adventure.items.Item;

public abstract class ArmorPiece extends Item {
    private Double durability;
    private Double condition;
    private Integer armorRating;
    public ArmorPiece(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight);
        this.durability = durability;
        this.condition = condition;
        this.armorRating = armorRating;
    }

    public Double getCondition() {
        return condition;
    }

    public void setCondition(Double condition) {
        this.condition = condition;
    }

    public Double getDurability() {
        return durability;
    }

    public void setDurability(Double durability) {
        this.durability = durability;
    }

    public Integer getArmorRating() {
        return armorRating;
    }

    public void setArmorRating(Integer armorRating) {
        this.armorRating = armorRating;
    }
}

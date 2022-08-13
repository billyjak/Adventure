package main.com.adventure.items.attire;

import main.com.adventure.items.Item;

public abstract class ArmorPiece extends Item {
    private final Double durability;
    private Double condition;
    public ArmorPiece(Integer value, Integer weight, Double durability, Double condition) {
        super(value, weight);
        this.durability = durability;
        this.condition = condition;
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

}

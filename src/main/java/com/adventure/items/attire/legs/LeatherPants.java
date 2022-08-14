package com.adventure.items.attire.legs;


import com.adventure.items.Item;

public class LeatherPants extends Item implements Legs {
    private Integer value;
    private Integer weight;
    private Integer durability;
    private Double condition;
    private Integer armorRating;

    public LeatherPants(Integer value, Integer weight, Integer durability, Double condition, Integer armorRating) {
        super(value, weight);
        this.durability = durability;
        this.condition = condition;
        this.armorRating = armorRating;
    }

    public static LeatherPants makeDefaultLeatherPants() {
        return new LeatherPants(5, 2, 20, 100.0, 2);
    }
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getDurability() {
        return durability;
    }

    public void setDurability(Integer durability) {
        this.durability = durability;
    }

    public Double getCondition() {
        return condition;
    }

    public void setCondition(Double condition) {
        this.condition = condition;
    }

    public Integer getArmorRating() {
        return armorRating;
    }

    public void setArmorRating(Integer armorRating) {
        this.armorRating = armorRating;
    }

}

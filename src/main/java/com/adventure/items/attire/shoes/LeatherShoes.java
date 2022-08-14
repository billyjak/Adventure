package com.adventure.items.attire.shoes;


import com.adventure.items.Item;

public class LeatherShoes extends Item {
    private Integer value;
    private Integer weight;
    private Integer durability;
    private Double condition;
    private Integer armorRating;

    public LeatherShoes(Integer value, Integer weight, Integer durability, Double condition, Integer armorRating) {
        super(value, weight);
        this.durability = durability;
        this.condition = condition;
        this.armorRating = armorRating;
    }
    public static LeatherShoes makeDefaultLeatherShoes() {
        return new LeatherShoes(3, 3, 20, 100.0, 3);
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getWeight() {
        return weight;
    }

    @Override
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

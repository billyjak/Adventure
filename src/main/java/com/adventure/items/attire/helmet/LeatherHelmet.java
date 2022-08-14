package com.adventure.items.attire.helmet;

import com.adventure.items.Item;

public class LeatherHelmet extends Item implements Helmet {
    private Integer value;
    private Integer weight;
    private Integer durability;
    private Double condition;
    private Integer armorRating;

    public LeatherHelmet(Integer value, Integer weight, Integer durability, Double condition, Integer armorRating) {
        super(value, weight);
        this.durability = durability;
        this.condition = condition;
        this.armorRating = armorRating;
    }
    public static LeatherHelmet makeDefaultLeatherHelmet() {
        return new LeatherHelmet(5, 3, 20, 100.0, 3);
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

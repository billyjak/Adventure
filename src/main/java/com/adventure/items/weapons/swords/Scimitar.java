package com.adventure.items.weapons.swords;

import com.adventure.items.Item;
import com.adventure.items.weapons.Weapon;

public class Scimitar extends Item implements Weapon {
    private Integer attackDamage;
    private Integer levelRequirement;
    private Boolean isOneHanded;
    private Integer durability;
    private Double condition;

    public Scimitar(Integer value, Integer weight, Integer attackDamage, Integer levelRequirement, Boolean isOneHanded, Integer durability, Double condition) {
        super(value, weight);
        this.attackDamage = attackDamage;
        this.levelRequirement = levelRequirement;
        this.isOneHanded = isOneHanded;
        this.durability = durability;
        this.condition = condition;
    }

    public static ShortSword makeDefaultScimitar() {
        return new ShortSword(30, 15, 5, 2, true, 20, 100.0);
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

    public Integer getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(Integer attackDamage) {
        this.attackDamage = attackDamage;
    }

    public Integer getLevelRequirement() {
        return levelRequirement;
    }

    public void setLevelRequirement(Integer levelRequirement) {
        this.levelRequirement = levelRequirement;
    }

    public Boolean getOneHanded() {
        return isOneHanded;
    }

    public void setOneHanded(Boolean oneHanded) {
        isOneHanded = oneHanded;
    }

    @Override
    public Integer attack() {
        return null;
    }

    @Override
    public void equip() {

    }
}
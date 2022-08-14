package com.adventure.items.weapons.bows;

import com.adventure.items.Item;
import com.adventure.items.weapons.Weapon;

public class ShortBow extends Item implements Weapon {
    private Integer attackDamage;
    private final Integer levelRequirement;
    private final Boolean isOneHanded;

    public ShortBow(Integer value, Integer weight, Integer attackDamage, Integer levelRequirement, Boolean isOneHanded) {
        super(value, weight);
        this.attackDamage = attackDamage;
        this.levelRequirement = levelRequirement;
        this.isOneHanded = isOneHanded;
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

    public Boolean getOneHanded() {
        return isOneHanded;
    }

    @Override
    public Integer attack() {
        return this.attackDamage;
    }

    @Override
    public void equip() {

    }
}


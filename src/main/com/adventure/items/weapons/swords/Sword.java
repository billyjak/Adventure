package main.com.adventure.items.weapons.swords;

import main.com.adventure.items.Item;
import main.com.adventure.items.weapons.Weapon;

public abstract class Sword extends Item implements Weapon {
    private Integer attackDamage;
    private Integer levelRequirement;
    private Boolean isOneHanded;

    public Sword(Integer value, Integer weight, Integer attackDamage, Integer levelRequirement, Boolean isOneHanded) {
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
    public void setLevelRequirement(Integer levelRequirement) {
        this.levelRequirement = levelRequirement;
    }

    public Boolean getIsOneHanded() {
        return isOneHanded;
    }

    public void setIsOneHanded(Boolean isOneHanded) {
        this.isOneHanded = isOneHanded;
    }

    @Override
    public Integer attack() {
        //TODO: Refactor class and child classes to have instance variables Durability and Condition and create
        // algorithm in attack() method that takes these variables into account.
        return this.attackDamage;
    }



    @Override
    public void equip() {

    }
    
}

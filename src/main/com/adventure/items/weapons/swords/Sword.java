package main.com.adventure.items.weapons.swords;

import main.com.adventure.items.Item;
import main.com.adventure.items.weapons.Weapon;

public abstract class Sword extends Item implements Weapon {
    private Integer attackDamage;
    private final Integer levelRequirement;
    private Boolean isOneHanded;

    public Sword(Integer attackDamage, Integer levelRequirement) {
        this.attackDamage = attackDamage;
        this.levelRequirement = levelRequirement;
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

    public void setIsOneHanded(Boolean isOneHanded) {
        this.isOneHanded = isOneHanded;
    }

    @Override
    public Integer attack() {
        return this.attackDamage;
    }

    @Override
    public void equip() {

    }
    
}

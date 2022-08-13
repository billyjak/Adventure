package main.com.adventure.items.weapons.hammers;

import main.com.adventure.items.weapons.Weapon;

public class GreatHammer implements Weapon {
    private Integer attackDamage;
    private final Integer levelRequirement;
    private final Boolean isOneHanded;

    public GreatHammer(Integer attackDamage, Integer levelRequirement) {
        this.attackDamage = attackDamage;
        this.levelRequirement = levelRequirement;
        this.isOneHanded = false;
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

package main.com.adventure.items.weapons.swords;

import main.com.adventure.items.weapons.Weapon;

public class GreatSword extends Sword implements Weapon {
    public GreatSword(Integer attackDamage, Integer levelRequirement) {
        super(attackDamage, levelRequirement);
        this.setIsOneHanded(false);
    }

}
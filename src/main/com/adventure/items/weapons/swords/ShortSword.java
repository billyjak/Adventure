package main.com.adventure.items.weapons.swords;

import main.com.adventure.items.weapons.Weapon;

public class ShortSword extends Sword implements Weapon {
    public ShortSword(Integer attackDamage, Integer levelRequirement) {
        super(attackDamage, levelRequirement);
        this.setIsOneHanded(true);
    }

}
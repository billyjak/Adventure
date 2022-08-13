package main.com.adventure.items.weapons.swords;

import main.com.adventure.items.weapons.Weapon;

public class LongSword extends Sword implements Weapon {
    public LongSword(Integer attackDamage, Integer levelRequirement) {
        super(attackDamage, levelRequirement);
        this.setIsOneHanded(true);
    }

}
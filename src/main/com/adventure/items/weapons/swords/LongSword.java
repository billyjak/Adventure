package main.com.adventure.items.weapons.swords;

import main.com.adventure.items.weapons.Weapon;

public class LongSword extends Sword implements Weapon {

    public LongSword(Integer value, Integer weight, Integer attackDamage, Integer levelRequirement, Boolean isOneHanded) {
        super(value, weight, attackDamage, levelRequirement, isOneHanded);
    }
}
package main.com.adventure.items.weapons.swords;

import main.com.adventure.items.weapons.Weapon;

public class ShortSword extends Sword implements Weapon {

    public ShortSword(Integer value, Integer weight, Integer attackDamage, Integer levelRequirement, Boolean isOneHanded) {
        super(value, weight, attackDamage, levelRequirement, isOneHanded);
    }

    public static ShortSword makeDefaultShortSword() {
        return new ShortSword(30, 15, 5, 1, true);
    }
}
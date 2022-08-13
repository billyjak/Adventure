package main.com.adventure.items.weapons.swords;

import main.com.adventure.items.weapons.Weapon;

public class Scimitar extends Sword implements Weapon {
    public Scimitar(Integer attackDamage, Integer levelRequirement) {
        super(attackDamage, levelRequirement);
        this.setIsOneHanded(true);
    }

}

package main.com.adventure.items.attire.gloves;

import main.com.adventure.items.attire.legs.LeatherPants;

public class LeatherGloves extends Gloves{

    public LeatherGloves(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight, durability, condition, armorRating);
    }
    public LeatherGloves(Double condition) {
        super(5, 2, 20.0, condition, 2);
    }
    public static LeatherGloves makeDefaultLeatherGloves() {
        return new LeatherGloves(5, 2, 20.0, 100.0, 2);
    }
}

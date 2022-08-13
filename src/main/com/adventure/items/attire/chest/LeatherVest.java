package main.com.adventure.items.attire.chest;

import main.com.adventure.items.attire.legs.LeatherPants;

public class LeatherVest extends Chest{
    public LeatherVest(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight, durability, condition, armorRating);
    }
    public LeatherVest(Double condition) {
        super(10, 8, 20.0, condition, 5);
    }
    public static LeatherVest makeDefaultLeatherVest() {
        return new LeatherVest(10, 8, 20.0, 100.0, 5);
    }
}

package main.com.adventure.items.attire.shoes;

import java.util.concurrent.locks.Condition;

public class LeatherShoes extends Shoes{
    public LeatherShoes(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight, durability, condition, armorRating);
    }
    public LeatherShoes(Double condition) {
        super(3, 3, 20.0, condition, 3);
    }

    public static LeatherShoes makeDefaultLeatherShoes() {
        return new LeatherShoes(3, 3, 20.0, 100.0, 3);
    }
}

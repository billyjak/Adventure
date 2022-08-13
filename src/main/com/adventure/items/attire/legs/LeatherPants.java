package main.com.adventure.items.attire.legs;

public class LeatherPants extends Legs{
    public LeatherPants(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight, durability, condition, armorRating);
    }
    public LeatherPants(Double condition) {
        super(10, 5, 20.0, condition, 8);
    }
    public static LeatherPants makeDefaultLeatherPants() {
        return new LeatherPants(5, 2, 20.0, 100.0, 2);
    }
}

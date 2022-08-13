package main.com.adventure.items.attire.helmet;

public class LeatherHelmet extends Helmet{
    public LeatherHelmet(Integer value, Integer weight, Double durability, Double condition, Integer armorRating) {
        super(value, weight, durability, condition, armorRating);
    }
    public LeatherHelmet(Double condition) {
        super(5, 3, 20.0, condition, 3);
    }
    public static LeatherHelmet makeDefaultLeatherHelmet() {
        return new LeatherHelmet(5, 3, 20.0, 100.0, 3);
    }
}

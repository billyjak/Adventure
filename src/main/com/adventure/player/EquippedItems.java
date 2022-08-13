package main.com.adventure.player;

import main.com.adventure.items.attire.*;
import main.com.adventure.items.attire.chest.Chest;
import main.com.adventure.items.attire.gloves.Gloves;
import main.com.adventure.items.attire.helmet.Helmet;
import main.com.adventure.items.attire.legs.Legs;
import main.com.adventure.items.attire.shoes.Shoes;

public class EquippedItems {
    private Chest chest;
    private Legs legs;
    private Gloves gloves;
    private Helmet helmet;
    private Shoes shoes;

    public EquippedItems(Chest chest, Legs legs, Gloves gloves, Helmet helmet, Shoes shoes) {
        this.chest = chest;
        this.legs = legs;
        this.gloves = gloves;
        this.helmet = helmet;
        this.shoes = shoes;
    }

    public EquippedItems() {
    }

    public Chest getChest() {
        return chest;
    }

    public void setChest(Chest chest) {
        this.chest = chest;
    }

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public Gloves getGloves() {
        return gloves;
    }

    public void setGloves(Gloves gloves) {
        this.gloves = gloves;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }
}

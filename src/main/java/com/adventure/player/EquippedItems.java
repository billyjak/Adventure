package com.adventure.player;


import com.adventure.items.Item;
import com.adventure.items.attire.chest.Vest;
import com.adventure.items.attire.gloves.Gloves;
import com.adventure.items.attire.helmet.Helmet;
import com.adventure.items.attire.legs.Legs;
import com.adventure.items.attire.shoes.Shoes;

import java.security.InvalidParameterException;

public class EquippedItems {
    private Item chest;
    private Item legs;
    private Item gloves;
    private Item helmet;
    private Item shoes;

    public EquippedItems(Item chest, Item legs, Item gloves, Item helmet, Item shoes) {
        if (chest instanceof Vest) {
        this.chest = chest;
        } else {
            throw new InvalidParameterException();
        }
        if (legs instanceof Legs) {
        this.legs = legs;
        } else {
            throw new InvalidParameterException();
        }
        if (gloves instanceof Gloves) {
        this.gloves = gloves;
        } else {
            throw new InvalidParameterException();
        }
        if (helmet instanceof Helmet) {
        this.helmet = helmet;
        } else {
            throw new InvalidParameterException();
        }
        if (shoes instanceof Shoes) {
            this.shoes = shoes;
        } else {
            throw new InvalidParameterException();
        }
    }

    public EquippedItems() {
    }

    public Item getChest() {
        return chest;
    }

    public void setChest(Item chest) {
        this.chest = chest;
    }

    public Item getLegs() {
        return legs;
    }

    public void setLegs(Item legs) {
        this.legs = legs;
    }

    public Item getGloves() {
        return gloves;
    }

    public void setGloves(Item gloves) {
        this.gloves = gloves;
    }

    public Item getHelmet() {
        return helmet;
    }

    public void setHelmet(Item helmet) {
        this.helmet = helmet;
    }

    public Item getShoes() {
        return shoes;
    }

    public void setShoes(Item shoes) {
        this.shoes = shoes;
    }
}

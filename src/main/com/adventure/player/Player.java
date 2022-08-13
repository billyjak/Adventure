package main.com.adventure.player;


import main.com.adventure.items.attire.chest.LeatherVest;
import main.com.adventure.items.attire.gloves.LeatherGloves;
import main.com.adventure.items.attire.helmet.LeatherHelmet;
import main.com.adventure.items.attire.legs.LeatherPants;
import main.com.adventure.items.attire.shoes.LeatherShoes;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Integer level;
    private Integer hitpoints;
    private Inventory inventory;
    private EquippedItems equippedItems;

    public Player(String name, Integer level, Integer hitpoints, Inventory inventory, EquippedItems equippedItems) {
        this.name = name;
        this.level = level;
        this.hitpoints = hitpoints;
        this.inventory = inventory;
        this.equippedItems = equippedItems;
    }
    public Player() {
    }

    public static Player initializePlayer(String name) {
        EquippedItems equippedItems = new EquippedItems();
        equippedItems.setChest(LeatherVest.makeDefaultLeatherVest());
        equippedItems.setLegs(LeatherPants.makeDefaultLeatherPants());
        equippedItems.setGloves(LeatherGloves.makeDefaultLeatherGloves());
        equippedItems.setHelmet(LeatherHelmet.makeDefaultLeatherHelmet());
        equippedItems.setShoes(LeatherShoes.makeDefaultLeatherShoes());
        return new Player(name, 1, 10, new Inventory(), equippedItems);
    }

    public String getName() {
        List<Integer> list = new ArrayList<>();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(Integer hitpoints) {
        this.hitpoints = hitpoints;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public EquippedItems getEquippedItems() {
        return equippedItems;
    }

    public void setEquippedItems(EquippedItems equippedItems) {
        this.equippedItems = equippedItems;
    }
}

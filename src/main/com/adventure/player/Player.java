package main.com.adventure.player;


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

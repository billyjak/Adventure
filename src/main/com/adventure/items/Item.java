package main.com.adventure.items;

public abstract class Item {
    private Integer value;
    private Integer weight;

    public Item(Integer value, Integer weight) {
        this.value = value;
        this.weight = weight;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

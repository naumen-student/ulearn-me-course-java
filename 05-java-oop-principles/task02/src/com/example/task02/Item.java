package com.example.task02;

/**
 * Товар в магазине
 */
public class Item {

    private final String name;
    private final long price;

    public Item(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("[%s:%d]", name, price);
    }
}

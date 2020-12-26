package com.example.task02;

public class Task02Main {

    private static final Item ITEM1 = new Item("Товар 1", 10);
    private static final Item ITEM3 = new Item("Товар 3", 30);
    private static final Item ITEM6 = new Item("Товар 6", 60);

    public static void main(String[] args) {
        DiscountBill bill = null;
        try {
            bill = new DiscountBill(30);
        } catch (Exception e) {
            e.printStackTrace();
        }

        bill.add(ITEM1, 2);
        bill.add(ITEM3, 3);
        bill.add(ITEM6, 4);
        System.out.format("Price: %s%n", bill.getPrice());
        System.out.format("Price with discount: %s%n", bill.getFinalPrice());
    }
}

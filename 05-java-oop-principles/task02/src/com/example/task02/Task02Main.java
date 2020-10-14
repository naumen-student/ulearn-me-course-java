package com.example.task02;

class DiscountBill extends Bill{
    public double discount;

    public double getDiscount(){
        return discount * 100;
    }

    public double getAbsoluteValueDiscount(){
        return Math.abs(super.getPrice() - getPrice());
    }

    public long getPrice(){
        long price = super.getPrice();
        return super.getPrice() - price * (long)discount;
    }

}


public class Task02Main {

    private static final Item ITEM1 = new Item("Товар 1", 10);
    private static final Item ITEM2 = new Item("Товар 2", 20);
    private static final Item ITEM3 = new Item("Товар 3", 30);
    private static final Item ITEM4 = new Item("Товар 4", 40);
    private static final Item ITEM5 = new Item("Товар 5", 50);
    private static final Item ITEM6 = new Item("Товар 6", 60);

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.add(ITEM1, 10);
        bill.add(ITEM3, 3);
        bill.add(ITEM6, 1);
        System.out.println(bill);
        bill.add(ITEM3, 3);
        System.out.println(bill);
    }
}

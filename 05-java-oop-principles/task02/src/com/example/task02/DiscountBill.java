package com.example.task02;

public class DiscountBill {

    public class DiscountBill extends Bill {

    }
        private final double discount;

        public DiscountBill(long discount) {this.discount = discount;}

        public double getDiscount() {return discount;}

        public double absoluteDiscount() {return super.getPrice() - this.getFinalPrice();}

        public double getFinalPrice() {return super.getPrice() * ((100 - discount) / 100);}

    }

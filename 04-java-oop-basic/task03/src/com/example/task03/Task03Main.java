package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
    Complex sumComp1 = new Complex(5, -6);
    Complex sumComp2 = new Complex(-3, 2);
    Complex sum = sumComp1.sum(sumComp2);
    System.out.println(sum.toString());

    Complex multComp1 = new Complex(2, 3);
    Complex multComp2 = new Complex(-1, 1);
    Complex mult = multComp1.mult(multComp2);
    System.out.println(mult.toString());
    }

    public static class Complex {
        private double x;
        private double y;

        public Complex(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Complex sum(Complex comp) {
           double resX = x + comp.x;
           double resY = y + comp.y;
           return new Complex(resX, resY);
        }

        public Complex mult(Complex comp) {
            double multX = x * comp.x;
            double multY = y * comp.y;
            return new Complex(multX - multY, x * comp.y + y * comp.x);
        }

        public String toString() {
            return String.format("z = %s + %si", x, y);
        }
    }
}

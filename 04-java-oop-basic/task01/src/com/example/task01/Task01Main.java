package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point(27, 31);
        Point p2 = new Point(30, 27);

        System.out.println(p1.distance(p2));
        System.out.println(p1.toString());
        p1.print();
        System.out.println(p1);
        System.out.println("Point 2:");
        p2.print();
        System.out.println(p2);
    }
}

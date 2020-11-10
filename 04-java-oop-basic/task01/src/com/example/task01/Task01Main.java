package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point(89, 90);
        p1.x = 10;
        p1.y = 45;
        Point p2 = new Point(45, 89 );
        p2.x = 78;
        p2.y = 12;

        System.out.println("Point 1:");
        p1.print();
        System.out.println(p1);
        System.out.println("Point 2:");
        p2.print();
        System.out.println(p2);
    }
}

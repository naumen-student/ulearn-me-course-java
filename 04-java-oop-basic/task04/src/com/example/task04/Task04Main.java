package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 5;
        p1.y = 10;
        Point p2 = new Point();
        p2.x = 10;
        p2.y = 10;
        Segment s = new Segment(p1, p2);
        System.out.println(s);
        Point p3 = new Point();
        p3.x = 6;
        p3.y = 10;
        System.out.println(s.isCollinearLine(p3));
        p3.x = 100;
        p3.y = 100;
        System.out.println(s.isCollinearLine(p3));
    }
}
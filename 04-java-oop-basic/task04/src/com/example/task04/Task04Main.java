package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line1 = new Line(-2, 0, 2, 0);
        Point p1 = new Point(0, 1);// Не на одной прямой
        Point p2 = new Point(0, 0);// На одной прямой
        System.out.println(line1.isCollinearLine(p1));
        System.out.println(line1.isCollinearLine(p2));
    }
}

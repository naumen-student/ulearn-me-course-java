package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(), new Point(10, 0));
        Point pOnLine = new Point(-5, 0);
        Point pNotOnLine = new Point(2, 10);
        System.out.println(line.isCollinearLine(pOnLine));
        System.out.println(line.isCollinearLine(pNotOnLine));
    }
}

package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(7, 5), new Point(3, 8));
        System.out.println(line);
        System.out.println(line.isCollinearLine(new Point(21, 6)));
    }
}

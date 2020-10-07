package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(11, 4), new Point(5, 6));
        System.out.println(line);
        System.out.println(line.isCollinearLine(new Point(5, 5)));
        System.out.println(line.isCollinearLine(new Point(6, 7)));
    }
}

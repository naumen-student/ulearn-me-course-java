package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(9,5), new Point(7, 6));
        boolean str = line.isCollinearLine(new Point(9,8));
        System.out.println(line);
    }
}

package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1,1), new Point(3, 3));
        System.out.println(line.toString());
        System.out.println(line.getP1().toString());
        System.out.println(line.getP2().toString());
        System.out.println(line.isCollinearLine(new Point(2,2)));
    }
}

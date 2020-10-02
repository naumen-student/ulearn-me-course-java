package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line =  new Line(new Point(0, 0), new Point(6, 6));
        System.out.println(line.getP1().toString());
        System.out.println(line.getP2().toString());
        System.out.println(line.toString());
        System.out.println(line.isCollinearLine(new Point(4, 4)));
    }
}

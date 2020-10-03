package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 1), new Point(3 , 3));
        System.out.println(line.isCollinear(new Point(2 ,2 )));
    }
}

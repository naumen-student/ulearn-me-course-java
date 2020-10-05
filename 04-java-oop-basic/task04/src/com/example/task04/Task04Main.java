package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        System.out.println(new Line(new Point(3, 17), new Point(5, 25))
                .isCollinearLine(new Point(1, 9)));
    }
}

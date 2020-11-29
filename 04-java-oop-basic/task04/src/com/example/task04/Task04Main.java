package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        boolean line = new Line(new Point(9, 10), new Point(5, 3)).isCollinearLine(new Point(4, 5));
        System.out.println(line);
    }
}


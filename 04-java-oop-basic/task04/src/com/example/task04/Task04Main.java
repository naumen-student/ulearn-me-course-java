package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Point p1 = new Point (0, 0);
        Point p2 = new Point (1, 1);
        int px = p1.getX ();
        Line line = new Line (p1, p2);
        Boolean b = line.isCollinearLine (new Point (0, 1));
    }
}

package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Points p1 = new Points (0, 0);
        Points p2 = new Points (1, 1);
        int px = p1.getX ();
        Lines line = new Lines (p1, p2);
        Boolean b = line.isCollinearLine (new Points (0, 1));
    }
}

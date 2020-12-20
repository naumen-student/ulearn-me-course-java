package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        Point[] points = {
                new Point(1, 2),
                new Point(4, 6)
        };

        PolygonalLine line = new PolygonalLine();
        line.setPoints(points);

        final double expected = line.getLength();
        points[1] = new Point(10, 20);
    }
}

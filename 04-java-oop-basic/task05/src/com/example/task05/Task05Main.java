package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points;
        points = new Point[]{
                new Point(0, 0),
                new Point(0, 1),
                new Point(1, 1)
        };
        PolygonalLine pLine = new PolygonalLine();
        pLine.setPoints(points);
        System.out.println(pLine.getLength());
        pLine.addPoint(3, 1);
        System.out.println(pLine.getLength());
    }
}

package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] a = {new Point(1,1), new Point(2,1)};
        PolygonalLine b = new PolygonalLine();
        b.setPoints(a);
        b.addPoint(new Point(2,2));
        b.addPoint(new Point(1,2));
        b.addPoint(new Point(1,1));
        System.out.println(b.getLength());
    }
}

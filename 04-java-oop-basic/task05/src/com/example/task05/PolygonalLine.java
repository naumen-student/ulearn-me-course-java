package com.example.task05;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PolygonalLine {
    private final ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point point : points) {
            this.points.add(new Point(point.getX(), point.getY()));
        }
    }

    public void addPoint(Point point) {
        this.points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        double len = 0.0;
        for (int i = 1; i < points.size(); i++) {
            len += points.get(i).getLength(points.get(i - 1));
        }
        return len;
    }

}

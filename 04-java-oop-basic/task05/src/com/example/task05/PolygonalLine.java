package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {
    private final ArrayList<Point> points = new ArrayList<>();
    public void setPoints(Point[] points) {
        for (Point point : points)
            addPoint(point);
    }

    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = points.size() - 2; i >= 0; i--)
            length += points.get(i).getLength(points.get(i + 1));
        return length;
    }

}

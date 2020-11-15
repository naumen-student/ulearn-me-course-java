package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {
    private final ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point p : points)
            addPoint(p);
    }

    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point currentPoint = points.get(i);
            length += currentPoint.getLength(points.get(i + 1));
        }
        return length;
    }
}
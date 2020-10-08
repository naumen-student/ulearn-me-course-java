package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {

    private final ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point p: points) {
            this.points.add(new Point(p.getX(), p.getY()));
        }
    }

    public void addPoint(Point point) {
        this.points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 1; i < points.size();i++)
            length += points.get(i-1).getLength(points.get(i));
        return length;
    }

}

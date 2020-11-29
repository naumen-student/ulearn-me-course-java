package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private ArrayList<Point> points;

    public PolygonalLine() {
        this.points = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        for (Point p: points)
            this.points.add(new Point(p.getX(), p.getY()));
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double result = 0;
        for (int i =0; i < points.size() - 1; i++)
            result += points.get(i).getLength(points.get(i + 1));
        return result;
    }

}

package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private final ArrayList<Point> pointsList = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point p : points)
            pointsList.add(new Point(p.getX(), p.getY()));
    }

    public void addPoint(Point point) {
        pointsList.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        pointsList.add(new Point(x, y));
    }

    public double getLength() {
        double result = 0;
        for (int i = 1; i < pointsList.size(); i++) {
            result += pointsList.get(i).getLength(pointsList.get(i - 1));
        }
        return result;
    }

}

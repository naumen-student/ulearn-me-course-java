package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point point : points) {
            addPoint(point);
        }
    }

    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }

    public void addPoint(double x, double y) {
        Point secondPoint = new Point(x, y);
        addPoint(secondPoint);
    }

    public double getLength() {
        double result = 0;
        for (int i = 0; i < points.size()-1; i++)
            result += points.get(i).getLength(points.get(i+1));
        return result;
    }

}

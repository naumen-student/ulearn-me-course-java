package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {
    private ArrayList<Point> pointList;

    public PolygonalLine() {
        pointList = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        for (Point point : points)
            pointList.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(Point point) {
        pointList.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        pointList.add(new Point(x, y));
    }

    public double getLength() {
        double result = 0;
        for (int i = 0; i < pointList.size() - 1; i++)
            result += pointList.get(i).getLength(pointList.get(i + 1));
        return result;
    }
}
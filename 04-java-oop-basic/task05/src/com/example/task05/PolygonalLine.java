package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {

    private ArrayList<Point> pointsArray = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point point : points)
            pointsArray.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(Point point) {
        pointsArray.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        pointsArray.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < pointsArray.size() - 1; i++)
            length += pointsArray.get(i).getLength(pointsArray.get(i + 1));
        return length;
    }

}

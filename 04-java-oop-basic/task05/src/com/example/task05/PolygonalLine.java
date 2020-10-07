package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;

public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        this.points = new ArrayList<>();
        Arrays.stream(points).forEach(this::addPoint);
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).getLength(points.get(i + 1));
        }

        return length;
    }

}

package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<Point>();

    public void setPoints(Point[] points) {
        if (points != null)
            for (Point point : points){
                this.points.add(new Point(point.getX(), point.getY()));
            }
    }

    public void addPoint(Point point) {
        if (point != null)
            this.points.add(new Point(point.getX(), point.getY()));
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

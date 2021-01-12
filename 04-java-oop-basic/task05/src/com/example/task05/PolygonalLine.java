package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {
    private final ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point point: points){
            this.points.add(new Point(point.getX(), point.getY()));
        }
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0.0;
        for (int i = 1; i < points.size(); i++){
            length += this.points.get(i).getLength(this.points.get(i - 1));
        }
        return length;
    }

}
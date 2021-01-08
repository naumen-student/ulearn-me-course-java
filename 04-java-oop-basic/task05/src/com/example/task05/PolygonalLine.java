package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {
    private final ArrayList<Point> points;

    public PolygonalLine(){
        points = new ArrayList<>();
    }
    public void setPoints(Point[] points) {
        this.points.clear();
        for (Point point : points){
            addPoint(point);
        }
    }

    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double lineLength = 0;
        for (int i = 0; i < points.size()-1; i++)
            lineLength += points.get(i).getLength(points.get(i + 1));
        return lineLength;
    }
}

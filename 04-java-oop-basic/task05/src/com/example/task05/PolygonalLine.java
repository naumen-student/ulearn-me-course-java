package com.example.task05;
import java.util.ArrayList;

public class PolygonalLine {
    private double length = 0;
    private ArrayList<Point> points = new ArrayList<Point>();

    public void setPoints(Point[] points) {
        for(int i = 0; i < points.length; i++){
            addPoint(points[i]);
        }
    }

    public void addPoint(Point point) {
        if (!points.isEmpty()) {
            length += points.get(points.size() - 1).getLength(point);
        }
        points.add(point);
    }


    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        return length;
    }

}

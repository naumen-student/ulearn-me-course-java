package com.example.task05;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonalLine {

    private final ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point point : points) {
            addPoint(point);
        }
    }
    public void addPoint(Point point){
        points.add(new Point(point.getX(), point.getY()));
    }


    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }


    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).getLength(points.get(i + 1));
        }
        return length;
    }

}

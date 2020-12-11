package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonalLine {

    List<Point> points = new ArrayList<Point>();

    public void setPoints(Point[] points) {
        Arrays.stream(points).forEach(point -> this.points.add(new Point(point.getX(), point.getY())));
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        points.add(point);
    }

    public double getLength() {
        double result = 0.0;
        Point temp = points.get(0);
        for (int i = 0; i < points.size(); i ++) {
            result += points.get(i).getLength(temp);
            temp = points.get(i);
        }
        return result;
    }

}

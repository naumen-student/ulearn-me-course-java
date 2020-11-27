package com.example.task05;

import java.util.*;

/**
 * Ломаная линия
 */
public class PolygonalLine {


    private List<Point> massivePoints = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point i : points) {
            massivePoints.add(new Point(i.getX(), i.getY()));
        }
    }


    public void addPoint(Point point) {
        massivePoints.add(new Point(point.getX(), point.getY()));
    }


    public void addPoint(double x, double y) {
        massivePoints.add(new Point(x, y));
    }


    public double getLength() {
        double length = 0;
        Point lastPoint = massivePoints.get(0);
        for (Point point : massivePoints){
            length += lastPoint.getLength(point);
            lastPoint = point;
        }
        return length;
    }

}

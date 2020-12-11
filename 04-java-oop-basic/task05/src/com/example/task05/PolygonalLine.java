package com.example.task05;

import java.util.ArrayList;


public class PolygonalLine {
    ArrayList<Point> pointList = new ArrayList<>();

    public void setPoints(Point[] points) {
        pointList = new ArrayList<>();
        for (Point point : points) {
            pointList.add(point.copyPoint());
        }
    }


    public void addPoint(Point point) {
        pointList.add(point.copyPoint());
    }


    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }


    public double getLength() {
        if ((long) pointList.size() > 0) {
            double length = 0;
            Point pointStart = pointList.get(0);
            for (Point point : pointList) {
                length += pointStart.getLength(point);
                pointStart = point;
            }
            return length;
        }
        return 0;
    }

}
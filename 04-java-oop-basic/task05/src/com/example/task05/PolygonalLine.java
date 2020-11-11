package com.example.task05;
import java.util.ArrayList;

public class PolygonalLine {
    private ArrayList<Point> points;

    public PolygonalLine() {
        this.points = new ArrayList<Point>();
    }

    public void setPoints(Point[] points) {
        for(int i = 0; i < points.length; i++) {
            this.points.add(new Point(points[i].getX(), points[i].getY()));
        }
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double result = 0;
        for(int i = 0; i < points.size() - 1; i++)
            result += points.get(i).getLength(points.get(i+1));
        return result;
        }
    }

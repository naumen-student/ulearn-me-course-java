package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {
    private ArrayList<Point> line;

    public PolygonalLine() {
        line = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        for (Point point : points)
            line.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(Point point) {
        line.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        line.add(new Point(x, y));
    }

    public double getLength() {
        double res = 0;
        for (int i = 0; i < line.size() - 1; i++)
            res += line.get(i).getLength(line.get(i + 1));
        return res;
    }
}

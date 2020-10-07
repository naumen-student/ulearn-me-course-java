package com.example.task05;
import java.util.ArrayList;

public class PolygonalLine {

    private final ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point point : points)
            addPoint(point);
    }

    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }

    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }


    public double getLength() {
        double res = 0;
        for (int i = 0; i < points.size() - 1; i++)
            res += points.get(i).getLength(points.get(i + 1));
        return res;
    }

}

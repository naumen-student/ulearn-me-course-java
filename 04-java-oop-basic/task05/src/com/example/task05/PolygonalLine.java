package com.example.task05;
import java.util.ArrayList;

public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point point : points)
            this.points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double result = 0;
        for (int i = 1; i < points.size(); i++) {
            result += points.
                    get(i).
                    getLength(points.get(i - 1));
        }
        return result;
    }

}

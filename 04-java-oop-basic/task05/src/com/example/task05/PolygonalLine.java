package com.example.task05;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        this.points = new ArrayList<>();
        for(Point pnow : points){
            this.points.add(new Point(pnow.getX(), pnow.getY()));
        }
    }

    public void addPoint(Point point) {
        this.points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    public double getLength() {
        double res = 0;
        for(int i = 1; i < points.size(); i++){
            res += points.get(i).getLength(points.get(i-1));
        }
        return res;
    }

}

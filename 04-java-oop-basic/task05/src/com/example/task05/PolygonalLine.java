package com.example.task05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points = new Point[0];

    public void setPoints(Point[] points) {

        this.points = new Point[points.length];

        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }


    public void addPoint(Point point) {

        Point[] newArray = new Point[points.length + 1];

        for (int i = 0; i < points.length; i++) {
            newArray[i] = new Point(points[i].getX(), points[i].getY());
        }

        newArray[newArray.length - 1] = new Point(point.getX(), point.getY());
        points = newArray;
    }


    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++)
            length += points[i].getLength(points[i + 1]);
        return length;
    }
}

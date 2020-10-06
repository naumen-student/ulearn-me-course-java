package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {

    private ArrayList<Point> listAllPoints = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point point : points) {
            addPoint(point);
        }
    }

    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }

    public void addPoint(double x, double y) {
        Point secondPoint = new Point(x, y);
        listAllPoints.add(secondPoint);
    }

    public double getLength() {
        double brokenLineLength = 0;
        // Перебираем все элементы листа: каждый элемент листа отправляем в метод getLength класса Point...
        // ...вместе со следующе-стоящим элементом листа. Расстояние полученное из getLength добавляем в brokenLineLength
        for (int index = 0; index < listAllPoints.size() - 1; index++)
            brokenLineLength += listAllPoints.get(index).getLength(listAllPoints.get(index + 1));
        return brokenLineLength;
    }

}

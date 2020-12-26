package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private final ArrayList<Point> points = new ArrayList<>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (Point p : points)
            this.points.add(new Point(p.getX(), p.getY()));
    }

    /**
     @@ -20,7 +25,7 @@ public void setPoints(Point[] points) {
      * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    /**
     @@ -30,7 +35,7 @@ public void addPoint(Point point) {
      * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    /**
     @@ -39,8 +44,11 @@ public void addPoint(double x, double y) {
      * @return длину ломаной линии
     */
    public double getLength() {
        double sum = 0;
        for (int i = 1; i < points.size(); i++) {
            sum += points.get(i - 1).getLength(points.get(i));
        }
        return sum;
    }

}
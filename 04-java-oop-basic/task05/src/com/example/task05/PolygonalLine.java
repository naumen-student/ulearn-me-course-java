package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    ArrayList<Point> points = new ArrayList<Point>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            this.points.add(new Point(points[i].getX(), points[i].getY()));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += points.get(i).getLength(points.get(i - 1));
        }
        return length;
    }

}

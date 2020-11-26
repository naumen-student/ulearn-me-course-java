package com.example.task05;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private ArrayList<Point> points = new ArrayList<>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points = new ArrayList<>();
        for (Point pnow : points) {
            this.points.add(new Point(pnow.getX(), pnow.getY()));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        this.points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        int i;
        double result = 0;
        for (i = 1; i < points.size(); i++) {
            result += points.get(i).getLength(points.get(i - 1));
        }
        return result;
    }

}

package com.example.task05;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    private ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        // TODO: реализовать
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
        // TODO: реализовать
        this.points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        // TODO: реализовать
        this.points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать
        throw new AssertionError();
        double res = 0;
        for (int i = 1; i < points.size(); i++) {
            res += points.get(i).getLength(points.get(i - 1));
        }
        return res;
    }

}

package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private final List<Point> points = new ArrayList<>();
    private double length = 0;

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        Arrays.stream(points).forEach(this::addPoint);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if (points.size() != 0)
            length += points.get(points.size() - 1).getLength(point);
        this.points.add(point);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        return length;
    }
}



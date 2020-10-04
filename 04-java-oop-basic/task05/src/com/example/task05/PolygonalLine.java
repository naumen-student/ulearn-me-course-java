package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private final ArrayList<Point> points = new ArrayList<>();
    private double length = 0;
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points.addAll(Arrays.asList(points));
        calculateLength();
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        this.points.add(point);
        calculateLength();
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
        calculateLength();
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        return this.length;
    }

    private void calculateLength(){
        if (this.length != 0) this.length = 0;
        for (int i = 1; i < this.points.size(); i++) {
            this.length += this.points.get(i-1).getLength(this.points.get(i));
        }
    }
}

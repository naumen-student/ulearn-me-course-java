package com.example.task05;

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

    public PolygonalLine() {this.points = new ArrayList<>();}

    public void setPoints(Point[] points) {
        // TODO: реализовать
        for (Point point : points) addPoint(point);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // TODO: реализовать
        addPoint(point.getX(), point.getY());
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        // TODO: реализовать
        points.add(new Point(x,y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать
        double result = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            result += points.get(i).getLength(points.get(i + 1));
        }
        return result;
    }

}

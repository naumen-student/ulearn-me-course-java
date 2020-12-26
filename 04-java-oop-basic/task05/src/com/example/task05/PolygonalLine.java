package com.example.task05;

import java.util.*;
/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> pointList = new ArrayList<Point>();

    public void setPoints(Point[] points) {
        for (Point point : points) {
            pointList.add(point.clone());
        }
    }



    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(Point point) {

        pointList.add(point.clone());
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {

        Double result = 0d;
        for (int i = 1; i < pointList.size(); i++) {
            result += pointList.get(i).getLength(pointList.get(i - 1));
        }
        return result;
    }
}

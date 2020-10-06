package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    ArrayList<Point> pointList;

    public PolygonalLine(){
        this.pointList = new ArrayList<>();
    }
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (Point point : points){
            this.pointList.add(new Point(point.getX(), point.getY()));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        this.addPoint(point.getX(), point.getY());
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.pointList.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double sum = 0;
        for (int i = 1; i < this.pointList.size(); i++){
            sum += this.pointList.get(i).getLength(this.pointList.get(i - 1));
        }
        return sum;
    }

}

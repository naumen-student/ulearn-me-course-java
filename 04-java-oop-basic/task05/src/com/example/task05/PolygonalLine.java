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
        // TODO: реализовать
        for (Point p : points)
            this.points.add(new Point(p.getX(), p.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // TODO: реализовать
        points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        // TODO: реализовать
        addPoint(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать
//        throw new AssertionError();
        double addit = 0;
        for (int i = 1; i < points.size(); i++) {
            addit += points.get(i - 1).getLength(points.get(i));
        }
        return addit;
    }

}

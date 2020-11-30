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
    private ArrayList <Point> all_points = new ArrayList<Point>();
    //private Point[] all_points = new Point[];
    //private list <Point> all_points = new Arra
   // private final Lis


    public void setPoints(Point[] points) {
        // TODO: реализовать
        for (Point point : points) {
            this.all_points.add(new Point(point.getX(), point.getY()));
        }

    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // TODO: реализовать
        all_points.add(new Point(point.getX(), point.getY()));


    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        // TODO: реализовать
        all_points.add(new Point(x,y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать
        double len = 0;
        Point last = all_points.get(0);
        for (Point point : all_points){
            len += last.getLength(point);
            last = point;

        }
        return len;


     //   throw new AssertionError();
    }

}



package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points;
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points=new Point[points.length];
        for (int i=0;i< points.length;i++)
            this.points[i]=new Point(points[i].getX(),points[i].getY());
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if(points!=null) {
            Point[] bufPoints = points;
            points = new Point[points.length + 1];
            for (int i = 0; i < bufPoints.length; i++)
                points[i] = bufPoints[i];
            points[points.length - 1] = new Point(point.getX(), point.getY());
        }
        else points=new Point[]{new Point(point.getX(),point.getY())};
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
       addPoint(new Point(x,y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length=0;
        for (int i=1;i< points.length;i++)
            length+=points[i-1].getLength(points[i]);
        return length;
    }

}

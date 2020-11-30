package com.example.task05;

public class Point {

    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    private final double x;
    private final double y;
    public Point(double x, double y){
        this.x = x;
        this.y  =y;
    }
    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
    public double getX() {
        // TODO: реализовать
        //throw new AssertionError();
        return x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        // TODO: реализовать
        //throw new AssertionError();
        return y;
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        // TODO: реализовать
        //throw new AssertionError();
        return Math.sqrt(Math.pow(this.x - point.getX(),2) + Math.pow(this.y - point.getY(),2));
    }

}

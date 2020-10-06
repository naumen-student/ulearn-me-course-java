package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

        /**
         * Возвращает координату точки по оси абсцисс
         *
         * @return координату точки по оси X
         */
    public double getX() {
        // TODO: реализовать
        return x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        // TODO: реализовать
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
        return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
    }

}

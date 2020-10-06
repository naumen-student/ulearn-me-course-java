package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {
    final private double x;
    final private double y;
    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
    public double getX() {
        return this.x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        return this.y;
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        return Math.sqrt(((point.x - this.x) * (point.x - this.x)) + ((point.y - this.y) * (point.y - this.y)));
    }

}

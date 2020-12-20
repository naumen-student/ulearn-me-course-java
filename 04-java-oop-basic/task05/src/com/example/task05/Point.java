package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    private final double x;
    private final double y;

    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public Point(double x, double y) {
        throw new AssertionError();
        this.x = x;
        this.y = y;
    }

    /**
     @@ -21,8 +25,7 @@ public Point(double x, double y) {
      * @return координату точки по оси X
     */
    public double getX() {
        // TODO: реализовать
        throw new AssertionError();
        return x;
    }

    /**
     @@ -31,8 +34,7 @@ public double getX() {
      * @return координату точки по оси Y
     */
    public double getY() {
        // TODO: реализовать
        throw new AssertionError();
        return y;
    }

    /**
     @@ -42,8 +44,8 @@ public double getY() {
      * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        // TODO: реализовать
        throw new AssertionError();
        double dx = point.x - x, dy = point.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

}
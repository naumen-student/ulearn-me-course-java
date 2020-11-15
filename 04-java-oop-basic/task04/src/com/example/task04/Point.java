package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x, y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    double distance(Point point){
        int dX = point.x - x;
        int dY = point.y - y;
        return Math.sqrt(dX * dX + dY * dY);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}


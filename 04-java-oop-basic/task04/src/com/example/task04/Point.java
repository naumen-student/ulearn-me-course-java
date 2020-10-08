package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    private final int x;
    private final int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return String.format("(%1$,%2$)", x, y);
    }
}
package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    double distance(Point point){
        int deltaX = point.x - x;
        int deltaY = point.y - y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    @Override
    public String toString() {
        return String.format("(%d %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}

package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip(){
        var vr = x;
        x = -y;
        y = -vr;
    }

    public static double distance(Point point){
        return ((x- point.x)**2+(y - point.y)**2)**(1/2);
    }
}

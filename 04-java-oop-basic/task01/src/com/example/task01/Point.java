package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    void flip(){
        x *= -1;
        y *= -1;
        int tx;
        tx = x;
        x = y;
        y = tx;
    }

    double distance(Point point){
        int X = x - point.x;
        int Y = y - point.y;
        return Math.sqrt(X*X + Y*Y);
    }

    public String toString(){
        String str;
        str = "(" + x + ", " + y + ")";
        return str;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}

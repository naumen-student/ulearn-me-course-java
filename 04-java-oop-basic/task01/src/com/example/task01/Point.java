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

    public Point(int newX, int newY){
        x = newX;
        y = newY;
    }

    public void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }

    public Point(){}

    public double distance(Point point){
        return Math.abs(Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2)));
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}

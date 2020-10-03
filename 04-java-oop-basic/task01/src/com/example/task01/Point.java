package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int temp = -x;
        x = -y;
        y = temp;
    }

    public double distance(Point point){
        return Math.sqrt((point.x-x) * (point.x-x) + (point.y-y) * (point.y-y));
    }

    public String toString(){
        return "({x}, {y})";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}

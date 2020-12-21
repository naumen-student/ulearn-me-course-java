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

    public Point(){
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void flip(){
        int tempY = this.y;
        this.y = -1 * x;
        this.x = -1 * tempY;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }

    public String toString(){
        return "(" + x +"," + " " + "y" + ")";
    }
}

package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    //int x;
    //int y;
    public int x;
    public int y;
    //public Point(){}

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int res = -x;
        x = -y;
        y = res;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow((point.x - x),2) + Math.pow((point.y - y),2));
    }

    public String toString(){
        return "({x}, {y})";
       // return String.format("(%d, %d)", x, y);
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}

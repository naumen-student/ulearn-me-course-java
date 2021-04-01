package com.example.task04;

public class Point {
    final int x;
    final int y;

    public Point(int X, int Y) {
        x = X;
        y = Y;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow((x - point.x),2)+Math.pow((y - point.y),2));
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);

        void print() {
            String pointToString = String.format("(%d, %d)", x, y);
            System.out.println(pointToString);
        }
    }
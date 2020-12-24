package com.example.task01;

public class Point{
    public int x;
    public int y;

    public Point(){
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int tempX = x;
        x = -y;
        y = -tempX;
    }

    public double distance(Point point){
        return Math.sqrt((point.x - x) * (point.x - x)
                + (point.y - y) * (point.y - y));
    }

    @Override
    public String toString(){
        return String.format("(%d,%d)", x, y);
    }

    public String print(){
        return toString();
    }
}

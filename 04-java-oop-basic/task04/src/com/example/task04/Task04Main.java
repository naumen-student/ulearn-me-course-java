package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

    public Line(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.length = Math.sqrt((p1.x - p2.y) * (p1.x - p2.y) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    public Point getP1()
    {
        return p1;
    }

package com.example.task05;

import java.util.ArrayList;

public class Task05Main {
    public static void main(String[] args) {
        Point[] poin = {
                new Point(1, 2),
                new Point(4, 6),
                new Point(7, 5)
        };
       PolygonalLine pline = new PolygonalLine();
       pline.setPoints(poin);
       System.out.println(pline.getLength());
    }
}

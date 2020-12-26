package com.example.task04;

import java.awt.*;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(0,1), new Point(0,5));
        System.out.println(line.isCollinearLine(new Point(0,3)));
    }
}

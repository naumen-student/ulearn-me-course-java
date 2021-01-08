package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(7, 7));
        System.out.println(line.toString());
        System.out.println(line.isCollinearLine(new Point(2,2)));//true
        System.out.println(line.isCollinearLine(new Point(-2,2)));//false
        System.out.println(line.isCollinearLine(new Point(3,2)));//false
        Line line1 = new Line(new Point(0, 0), new Point(3, 6));
        System.out.println(line1.toString());
        System.out.println(line1.isCollinearLine(new Point(1,2)));//true
        System.out.println(line1.isCollinearLine(new Point(2,4)));//true
        Line line2 = new Line(new Point(-4, 2), new Point(4, -2));
        System.out.println(line2.toString());
        System.out.println(line2.isCollinearLine(new Point(-2,1)));//true
        System.out.println(line2.isCollinearLine(new Point(0,0)));//true
        System.out.println(line2.isCollinearLine(new Point(3,-2)));//false
    }
}

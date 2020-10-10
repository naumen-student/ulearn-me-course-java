package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
      Line line = new Line(new Point(1,0),new Point(4,0));
      System.out.println(line.isCollinearLine(new Point(3,0)));
      System.out.println(line.isCollinearLine(new Point(4,5)));
      System.out.println(line.isCollinearLine(new Point(5,0)));
      System.out.println(line.toString());
    }
}

package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(0, 0, 37230);
        TimeSpan time2 = new TimeSpan(10, 20, 30);
        time2.add(new TimeSpan(50, 60, 30));
        time2.subtract(new TimeSpan(-31, -60, 5));
        System.out.println(time1.toString());
        System.out.println(time2.toString());
    }
}

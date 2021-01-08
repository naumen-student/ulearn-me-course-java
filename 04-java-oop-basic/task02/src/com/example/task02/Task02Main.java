package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan ts = new TimeSpan( 10, 12, 60);
        ts.add(new TimeSpan( 13));
        ts.subtract(new TimeSpan( 0, 5));
        System.out.println(ts.toString());
    }
}

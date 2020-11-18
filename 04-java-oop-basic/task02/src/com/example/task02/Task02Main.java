package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan timeSpan = new TimeSpan(1, 0, 0);
        System.out.println(timeSpan);
        timeSpan.subtract(new TimeSpan(0, 0, 1));
        System.out.println(timeSpan);
        timeSpan.add(new TimeSpan(0, 1, 1));
        System.out.println(timeSpan);
    }
}

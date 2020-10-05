package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan test = new TimeSpan(10, 20, 0);
        test.add(new TimeSpan(1, 40, 0));
        System.out.println(test);
        test.subtract(new TimeSpan(1, 3, 59));
        System.out.println(test);
    }
}

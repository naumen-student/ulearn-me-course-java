package com.example.task05;

public class Salary implements Mail {
    String from;
    String to;
    int salary;

    Salary(String from, String to, int salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public Integer getContent() {
        return salary;
    }
}

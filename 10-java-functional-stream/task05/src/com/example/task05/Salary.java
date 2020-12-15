package com.example.task05;

public class Salary implements IMessages<Integer> {

    private final String from;
    private final String to;
    private final Integer salary;

    public Salary(String from, String to, Integer salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Integer getContent() {
        return salary;
    }

}

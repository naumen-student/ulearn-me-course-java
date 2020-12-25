package com.example.task05;

public class Salary implements IContent<Integer>{
    private final String company;
    private final String recipient;
    private final int salary;

    public Salary(String company, String recipient, Integer salary) {
        this.company = company;
        this.recipient = recipient;
        this.salary = salary;
    }

    public String getFrom() {
        return company;
    }

    public String getTo() {
        return recipient;
    }

    public Integer getContent() {
        return salary;
    }

}
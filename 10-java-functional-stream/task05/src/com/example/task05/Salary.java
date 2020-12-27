package com.example.task05;

public class Salary implements IContent<Integer> {
    private final String company;
    private final String receiver;
    private final int salary;

    public Salary(String company, String receiver, Integer salary){
        this.company = company;
        this.receiver = receiver;
        this.salary = salary;
    }

    public String getTo() {
        return receiver;
    }

    public String getFrom() {
        return company;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
}

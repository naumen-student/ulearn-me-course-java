package com.example.task05;

public class Salary implements IMailContent<Integer> {

    private final String company;
    private final String name;
    private final Integer salary;

    public Salary(String company, String name, Integer salary){
        this.company = company;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getFrom() {
        return company;
    }

    @Override
    public String getTo() {
        return name;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
}
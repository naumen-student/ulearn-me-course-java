package com.example.task05;

public class Salary implements IntMail<Integer>{

    public final String company;
    public final String name;
    public final int salary;

    public Salary(String company, String name, int salary) {
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

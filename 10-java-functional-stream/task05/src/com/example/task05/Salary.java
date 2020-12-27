package com.example.task05;

public class Salary implements IContent<Integer>{
    private final String company;
    private final String person;
    private final int salary;

    public Salary(String company, String person, Integer salary) {
        this.person = person;
        this.company = company;
        this.salary = salary;
    }

    public String getFrom() {
        return company;
    }

    public String getTo() {
        return person;
    }

    public Integer getContent() {
        return salary;
    }
}
package com.example.task05;

public class Solver implements IContent<Integer> {

    private final String company;
    private final int salary;
    private final String person;

    public Solver(String company, String person, Integer salary) {
        this.company = company;
        this.salary = salary;
        this.person = person;
    }

    public String getTo() {
        return person;
    }

    @Override
    public Integer getContent() {
        return salary;
    }

    @Override
    public String getFrom() {
        return company;
    }
}
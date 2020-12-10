package com.example.task05;

public class Solver implements IContent<Integer> {

    private final String company;
    private final String person;
    private final int salary;

    public Solver(String company, String person, Integer salary) {
        this.company = company;
        this.person = person;
        this.salary = salary;
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
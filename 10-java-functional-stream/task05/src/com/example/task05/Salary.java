
package com.example.task05;

public class Salary implements IContent<Integer> {

    private final String company;
    private final String person;
    private final int salary;

    public Salary(String company, String person, Integer salary) {
        this.company = company;
        this.person = person;
        this.salary = salary;
    }

    @Override
    public String getFrom() {
        return company;
    }

    public String getTo() {
        return person;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
} 
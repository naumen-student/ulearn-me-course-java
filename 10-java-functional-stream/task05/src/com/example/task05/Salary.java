package com.example.task05;

public class Salary implements IData<Integer>{

    private final String company;
    private final String receiver;
    private final Integer salary;

    public Salary(String company, String receiver, Integer salary){
        this.company = company;
        this.receiver = receiver;
        this.salary = salary;
    }

    @Override
    public String getFrom() {
        return company;
    }

    @Override
    public String getTo() {
        return receiver;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
}

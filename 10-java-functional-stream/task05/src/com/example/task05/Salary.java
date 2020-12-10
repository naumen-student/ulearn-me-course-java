package com.example.task05;

public class Salary implements IMessages {

    private String from;
    private String to;
    private Integer salary;

    public Salary(String from, String to, Integer salary){
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public Integer getContent() {
        return salary;
    }

    @Override
    public Object getSalary() {
        return null;
    }

}

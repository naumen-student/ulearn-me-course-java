package com.example.task05;

public class Salary implements Message<Integer> {
    private String employer;
    private String payee;
    private Integer salary;

    public Salary(String employer, String payee, Integer salary){
        this.employer = employer;
        this.payee = payee;
        this.salary = salary;
    }

    @Override
    public String getFrom(){
        return employer;
    }

    @Override
    public String getTo(){
        return payee;
    }

    @Override
    public Integer getContent(){
        return salary;
    }
}

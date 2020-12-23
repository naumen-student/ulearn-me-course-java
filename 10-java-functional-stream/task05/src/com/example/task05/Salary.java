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

    public String getFrom() {
        return company;
    }

    public String getTo(){
        return receiver;
    }

    public Integer getContent() {
        return salary;
    }
}
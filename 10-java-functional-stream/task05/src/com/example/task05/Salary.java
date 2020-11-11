package com.example.task05;

public class Salary implements IHaveReceiverAndContent<String, Integer>{
    private final String company;
    private final String reciever;
    private final Integer salary;

    public Salary(String company, String reciever, Integer salary){
        this.company = company;
        this.reciever = reciever;
        this.salary = salary;
    }

    public String getTo(){
        return reciever;
    }

    public Integer getContent(){
        return salary;
    }
}

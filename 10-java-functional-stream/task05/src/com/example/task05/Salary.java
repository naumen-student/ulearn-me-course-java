package com.example.task05;

public class Salary implements IMessage<Integer>{
    private final String from;
    private final String to;
    private final int payment;

    public Salary(String from, String to, int payment){
        this.from = from;
        this.to = to;
        this.payment = payment;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public Integer getContent() {
        return this.payment;
    }
}

package com.example.task05;

public class Salary implements ISendingInformation<String, Integer> {
    private final String sender;
    private final String recipient;
    private final Integer salary;

    public Salary(String sender, String recipient, Integer salary){
        this.sender = sender;
        this.recipient = recipient;
        this.salary = salary;

    }

    public String getFrom() {
        return sender;
    }

    public String getTo() {
        return recipient;
    }

    public Integer getContent() {
        return salary;
    }
}

package com.example.task05;

public class Salary implements Post<Integer> {
    private final String to;
    private final String from;
    private final Integer content;

    public Salary(String from, String to, Integer content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public Integer getContent() {
        return content;
    }
}

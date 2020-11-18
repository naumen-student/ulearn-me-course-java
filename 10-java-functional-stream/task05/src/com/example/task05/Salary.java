package com.example.task05;

public class Salary implements IMessage<Integer>
{
    private final String from;
    private final String to;
    private final int payment;

    public Salary(String from, String to, int payment)
    {
        this.from = from;
        this.to = to;
        this.payment = payment;
    }

    @Override
    public String getFrom()
    {
        return this.from;
    }

    @Override
    public String getTo()
    {
        return this.to;
    }

    @Override
    public Integer getContent()
    {
        return this.payment;
    }
}
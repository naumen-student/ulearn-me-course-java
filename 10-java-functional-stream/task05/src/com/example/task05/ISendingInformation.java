package com.example.task05;

public interface ISendingInformation<TFirst, TSecond> {

    public TFirst getFrom();

    public TFirst getTo();

    public TSecond getContent();

}

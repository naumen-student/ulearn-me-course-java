package com.example.task05;

public interface IMessage<T> {
    String getFrom();
    String getTo();
    T getContent();
}
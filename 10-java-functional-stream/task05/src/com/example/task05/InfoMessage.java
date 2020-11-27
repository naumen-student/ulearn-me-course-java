package com.example.task05;

public interface InfoMessage<T> {
    String getFrom();
    String getTo();
    T getContent();
}

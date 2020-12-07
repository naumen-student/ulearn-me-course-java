package com.example.task05;

public interface Message<T> {
    String getTo();
    String getFrom();
    T getContent();
}

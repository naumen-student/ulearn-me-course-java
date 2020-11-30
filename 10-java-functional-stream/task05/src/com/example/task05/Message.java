package com.example.task05;

public interface Message<T> {
    String getFrom();
    String getTo();
    T getContent();
}

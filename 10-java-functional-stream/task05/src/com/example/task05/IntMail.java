package com.example.task05;

public interface IntMail<T> {
    String getFrom();
    String getTo();
    T getContent();
}

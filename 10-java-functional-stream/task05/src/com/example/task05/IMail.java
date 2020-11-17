package com.example.task05;

public interface IMail<T> {
    String getFrom();

    String getTo();

    T getContent();
}

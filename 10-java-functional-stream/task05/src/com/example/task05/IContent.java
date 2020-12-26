package com.example.task05;

public interface IContent<T> {
    String getFrom();

    String getTo();

    T getContent();
}

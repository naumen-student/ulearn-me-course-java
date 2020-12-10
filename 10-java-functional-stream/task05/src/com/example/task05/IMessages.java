package com.example.task05;

public interface IMessages<T> {
    String getTo();
    String getFrom();
    T getContent();
}


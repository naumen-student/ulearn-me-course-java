package com.example.task05;

public interface IMessages<T> {
    String getFrom();
    String getTo();
    T getContent();
}

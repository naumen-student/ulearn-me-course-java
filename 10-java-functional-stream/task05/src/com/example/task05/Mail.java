package com.example.task05;

public interface Mail <T> {
    String getTo();
    String getFrom();
    T getContent();
}

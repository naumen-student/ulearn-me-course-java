package com.example.task05;

public interface Post<T>{
    String getTo();
    String getFrom();
    T getContent();
}

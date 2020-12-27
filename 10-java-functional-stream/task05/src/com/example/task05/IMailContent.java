package com.example.task05;

public interface IMailContent<T> {

    String getFrom();

    String getTo();

    T getContent();

}
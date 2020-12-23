package com.example.task05;

interface IData<T> {
    String getFrom();

    String getTo();

    T getContent();
}
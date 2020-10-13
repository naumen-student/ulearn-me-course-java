package com.example.task04;

public interface MessageHandler{
    void HandleMessage(String template, Object... messageArgs);
}
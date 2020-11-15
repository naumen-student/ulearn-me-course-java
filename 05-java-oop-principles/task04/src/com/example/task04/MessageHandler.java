package com.example.task04;

import java.io.FileNotFoundException;

public interface MessageHandler {
    public void log(String message) throws FileNotFoundException;
}

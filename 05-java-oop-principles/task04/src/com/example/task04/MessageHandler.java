package com.example.task04;

import java.io.IOException;

public interface MessageHandler {
    public void handle(String message) throws IOException;
}

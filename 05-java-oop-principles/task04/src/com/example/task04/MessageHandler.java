package com.example.task04;

import java.io.IOException;

public interface MessageHandler {
    void handleMessage(String message) throws IOException;
}

package com.example.task04;

import java.io.IOException;

public interface MessageHandler {
    void handleLog(String log) throws IOException;
}

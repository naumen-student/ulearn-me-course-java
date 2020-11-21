package com.example.task04;

import java.io.IOException;
import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    final int limit;
    ArrayList<String> logs = new ArrayList<String>();
    MessageHandler handler;

    public MemoryHandler(int limit, MessageHandler handler) {
        this.limit = limit;
        this.handler = handler;
    }

    @Override
    public void handlerLog(String message) throws IOException {
        logs.add(message);
        if (logs.size() == limit) {
            for (String log : logs)
                handler.handlerLog(log);
            logs.clear();
        }
    }

    public void logAll(String message) throws IOException {
        for (String log : logs)
            handler.handlerLog(log);
        logs.clear();
    }
}

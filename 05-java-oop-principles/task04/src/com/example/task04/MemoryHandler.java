package com.example.task04;

import java.io.IOException;
import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    private final ArrayList<String> logs = new ArrayList<String>();
    private final MessageHandler messageHandler;
    private final long limitOfLogs;

    public MemoryHandler(MessageHandler messageHandler, int limitOfLogs) {
        this.messageHandler = messageHandler;
        this.limitOfLogs = limitOfLogs;
    }

    @Override
    public void handleLog(String log) throws IOException {
        logs.add(log);
        if (logs.size() == limitOfLogs) {
            for (String s : logs) {
                messageHandler.handleLog(s);
            }
            logs.clear();
        }
    }
}
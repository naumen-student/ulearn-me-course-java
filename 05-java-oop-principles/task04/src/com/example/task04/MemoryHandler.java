package com.example.task04;

import java.io.IOException;
import java.util.ArrayList;

public class MemoryHandler implements MessageHandler{

    private final MessageHandler mainHandler;
    private final ArrayList<String> logs;
    private final int logsLimit;

    public MemoryHandler(MessageHandler mainHandler, int logsLimit) {
        this.mainHandler = mainHandler;
        this.logsLimit = logsLimit;
        logs = new ArrayList<>();
    }

    @Override
    public void handleLog(String log) throws IOException {
        logs.add(log);
        if (logs.size() == logsLimit) {
            writeLogs();
        }
    }

    public void writeLogs() throws IOException {
        for (String l: logs) {
            mainHandler.handleLog(l);
        }
        logs.clear();
    }
}

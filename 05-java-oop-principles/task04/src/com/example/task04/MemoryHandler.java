package com.example.task04;
import java.util.ArrayList;

public class MemoryHandler extends MessageHandler {
    private final long size;
    private final ArrayList<String> messageSaver = new ArrayList<>();
    private final MessageHandler handler;

    public MemoryHandler(long size, MessageHandler handler) {
        this.handler = handler;
        this.size = size;
    }

    @Override
    public void log(String msg) {
        messageSaver.add(msg);
        if (messageSaver.size() >= size) {
            for (String savedMessage : messageSaver) {
                handler.log(savedMessage);
            }
            messageSaver.clear();
        }
    }
}
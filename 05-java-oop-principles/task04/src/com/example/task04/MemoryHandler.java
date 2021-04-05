package com.example.task04;

import java.io.IOException;
import java.util.ArrayList;

public class MemoryHandler implements MessageHandler{

    private final int limit;
    private final MessageHandler handler;
    private final ArrayList<String> list = new ArrayList<>();

    public MemoryHandler(int limit, MessageHandler handler) {
        this.limit = limit;
        this.handler = handler;
    }

    @Override
    public void log(String message) throws IOException {
        list.add(message);
        if(list.size() >= limit) {
            for(int i = 0; i < list.size(); i++){
                handler.log(message);
            }
            list.clear();
        }
    }
}

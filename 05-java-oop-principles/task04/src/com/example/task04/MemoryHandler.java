package com.example.task04;

import java.util.LinkedList;

public class MemoryHandler implements MessageHandler {
    private MessageHandler function;
    private LinkedList<String> messagesList = new LinkedList<>();
    private long size;

    public MemoryHandler(MessageHandler function, long size){
        this.function = function;
        this.size = size;
    }

    @Override
    public void messageHandler(String message) {
        messagesList.add(message);
        if(messagesList.size() >= size)
            for (int i = 0; i < messagesList.size(); i++)
                function.messageHandler(messagesList.pollLast());
    }
}

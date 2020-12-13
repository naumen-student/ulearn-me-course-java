package com.example.task04;
import java.util.ArrayDeque;

public class MemoryHandler implements MessageHandler {
    private final ArrayDeque<String> messages;
    private final MessageHandler handler;
    private final int capacity;

    public MemoryHandler(MessageHandler handler, int capacity) {
        this.handler = handler;
        this.capacity = capacity;
        messages = new ArrayDeque<>(capacity);
    }

    @Override
    public void handle(String message) {
        messages.addLast(message);
        if (messages.size() >= capacity) {
            send();
        }
    }

    public void send() {
        while (messages.size() != 0) {
            handler.handle(messages.getFirst());
        }
    }
}
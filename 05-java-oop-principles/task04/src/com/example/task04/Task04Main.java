package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler
{
    private final long size;
    private final ArrayList<String> messageList = new ArrayList<>();
    private final MessageHandler handler;

    public MemoryHandler(long size, MessageHandler handler)
    {
        this.size = size;
        this.handler = handler;
    }

    @Override
    public void logMes(String message)
    {
        messageList.add(message);
        if (messageList.size() >= size)
        {
            for (String savedMessage : messageList)
            {
                handler.logMes(savedMessage);
            }
            messageList.clear();
        }
    }
}
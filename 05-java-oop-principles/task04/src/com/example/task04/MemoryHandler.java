package com.example.task04;

import java.util.ArrayList;
import java.util.List;

public class MemoryHandler implements MessageHandler {

    private ArrayList<String> messages = new ArrayList<String>();;
    private int volume;
    private MessageHandler proxy;
    private int part = 1;

    public void setPart(int part) {
        this.part = part;
    }

    public void setProxy(MessageHandler proxy) {
        this.proxy = proxy;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void outMessage(String message) {
        for(int i = 0; i < part; i++) {
            if (i > messages.size() - 1)
                break;
            proxy.outMessage(messages.get((messages.size() - 1) - i));
        }
    }

    public void saveMessages(String message){
        if (messages == null)
            return;
        messages.add(message);
    }
}

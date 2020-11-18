package com.example.task05;

public class MailMessage implements IMessage<String>{
    private final String from;
    private final String to;
    private final String content;

    public MailMessage(String from, String to, String content){
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getFrom() {
        return this.from;
    }

    @Override
    public String getTo() {
        return this.to;
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
package com.example.task05;

public class MailMessage implements Mail {
    private String from;
    private String to;
    private String content;

    MailMessage(String from, String to, String content) {
        this.content = content;
        this.from = from;
        this.to = to;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }
}

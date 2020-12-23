package com.example.task05;

public class MailMessage implements IntMail<String>{
    public final String from;
    public final String to;
    public final String message;

    public MailMessage(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

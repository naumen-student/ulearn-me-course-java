package com.example.task05;

public class MailMessage implements IntMail<String> {

    public final String from;
    public final String to;
    public final String text;

    public MailMessage(String from, String to, String text) {
        this.from = from;
        this.to = to;
        this.text = text;
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
    public String getContent() {
        return text;
    }
}

package com.example.task05;

public class Message implements IContent<String> {
    private final String from;
    private final String to;
    private final String content;

    public Message(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }
}

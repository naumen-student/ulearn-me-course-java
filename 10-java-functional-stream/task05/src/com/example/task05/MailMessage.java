package com.example.task05;

public class MailMessage implements IMessages {
    private String from;
    private String to;
    private String content;

    public MailMessage(String from, String to, String content){
        this.from = from;
        this.to = to;
        this.content = content;
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
        return content;
    }

    @Override
    public Object getSalary() {
        return null;
    }
}

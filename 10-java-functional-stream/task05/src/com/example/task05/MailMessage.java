package com.example.task05;

public class MailMessage implements ISendingInformation<String,String> {
    private final String sender;
    private final String recipient;
    private final String content;

    public MailMessage(String sender, String recipient, String content){
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public String getFrom() {
        return sender;
    }

    public String getTo() {
        return recipient;
    }

    public String getContent() {
        return content;
    }
}

package com.example.task05;

public class MailMessage extends IMessage<String>{
    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}

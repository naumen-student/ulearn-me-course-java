package com.example.task05;

public class MailMessage extends Content<String> {
    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}

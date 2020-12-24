package com.example.task05;

public class MailMessage extends IServiceItem {
    public MailMessage(String from, String to, String message) {
        super(from, to, message);
    }

    public String getContent() {
        return (String) this.getSent();
    }
}

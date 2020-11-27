package com.example.task05;

public class MailMessage implements InfoMessage<String> {
    private String from;
    private String to;
    private String message;

    public MailMessage(String from, String to, String message){
        this.from = from;
        this.to = to;
        this.message = message;
    }

    @Override
    public String getFrom(){
        return from;
    }

    @Override
    public String getTo(){
        return to;
    }

    @Override
    public String getContent(){
        return message;
    }
}

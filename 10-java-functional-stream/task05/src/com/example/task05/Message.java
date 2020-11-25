package com.example.task05;

public abstract class Message<T> {
    private final String from;
    private final String to;
    private final T content;

    public Message(String author, String to, T content){
        this.from = author;
        this.to = to;
        this.content = content;
    }

    public String getFrom(){
        return from;
    }

    public String getTo(){
        return to;
    }

    public T getContent(){
        return content;
    }
}

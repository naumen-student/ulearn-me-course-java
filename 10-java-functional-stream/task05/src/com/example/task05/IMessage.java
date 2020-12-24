package com.example.task05;

public abstract class IMessage<T> {
    private final T sent;
    private final String from;
    private final String to;

    public IMessage(String from, String to, T sent){
        this.from = from;
        this.to = to;
        this.sent = sent;
    }

    public T getSent() {return sent; }

    public String getFrom() {return from; }

    public String getTo() {return to; }

}

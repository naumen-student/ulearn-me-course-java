package com.example.task03;

public class Milliseconds implements TimeUnit {

    private final long amount;

    public Milliseconds(long amount) {
        this.amount = amount;
    }

    @Override
    public long toMillis() {
        return amount;
    }

    @Override
    public long toSeconds() {
        if(amount % 1000 < 500)
            return amount / 1000;
        else
            return amount / 1000 + 1;
    }

    @Override
    public long toMinutes() {
        if(amount % 60000 < 30000)
            return amount / 60000;
        else
            return amount / 60000 + 1;
    }

    public long toHours(){
        if(amount % 360000 < 180000)
            return amount / 360000;
        else
            return amount / 360000 + 1;
    }
}
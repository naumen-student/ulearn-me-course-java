package com.example.task03;

import java.rmi.MarshalException;

/**
 * Интервал в миллисекундах
 */
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
        return Math.round(amount * 1.0 / 1000);
    }

    @Override
    public long toMinutes() {
        return Math.round(amount * 1.0 / 1000 / 60);
    }

    public long toHours(){
        return Math.round(amount * 1.0 / 1000 / 60 / 60);
    }

    public long getHours(){
        return this.toHours();
    }
}

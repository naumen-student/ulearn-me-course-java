package com.example.task03;

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
        return Math.round(amount / 1000.0);
    }

    @Override
    public long toMinutes() {
        if(amount /60000.0 == 0.5){
            return 1;
        }
        else return Math.round(amount /60000.0);
    }
}

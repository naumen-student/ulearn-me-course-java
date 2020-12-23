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
        if(amount%1000>=500)
            return (amount/1000) + 1;
        return amount/1000;
    }

    @Override
    public long toMinutes() {
        if(amount%60000 >= 30000)
            return (amount / 60000) + 1;
        return amount / 60000;
    }

    @Override
    public long toHours() {return amount; }
}

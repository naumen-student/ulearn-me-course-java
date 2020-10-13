package com.example.task03;

/**
 * Интервал в миллисекундах
 */
public class Milliseconds implements TimeUnit {

    private final long num;

    public Milliseconds(long num) {this.num = num;}

    @Override
    public long toMillis() {return num;}

    @Override
    public long toSeconds() {return Math.round((double) num / 1000);}

    @Override
    public long toMinutes() {return Math.round((double) num / 1000 / 60);}

    @Override
    public long getHours() {return Math.round((double) num / 1000 / 60 / 60);}
}

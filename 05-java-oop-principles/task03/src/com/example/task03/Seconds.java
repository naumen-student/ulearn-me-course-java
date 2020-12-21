package com.example.task03;
/**
 * Интервал в секундах
 */
public class Seconds implements TimeUnit {

    private final long amount;

    public Seconds(long amount) {
        this.amount = amount;
    }
    @@ -24,5 +23,11 @@ public long toSeconds() {
        @Override
        public long toMinutes() {
            return Math.round(amount / 60);
            return Math.round((double) amount / 60);
        }

        @Override
        public long toHours() {
            return Math.round((double) amount / (60 * 60));
        }
    }
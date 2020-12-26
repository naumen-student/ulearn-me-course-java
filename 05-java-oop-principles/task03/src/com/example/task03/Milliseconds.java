package com.example.task03;

public class Milliseconds implements TimeUnit {

    private final long amount;
    @@ -18,11 +15,16 @@ public long toMillis() {

        @Override
        public long toSeconds() {
            return (Math.round((double) amount / 1000));
        }

        @Override
        public long toMinutes() {
            return Math.round((double) amount / 1000 / 60);
        }

        @Override
        public long getHours() {
            return Math.round((double) amount / 1000 / 60 / 60);
        }
    }

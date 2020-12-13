package com.example.task03;

    public class Task03Main implements TimeUnit {
        private final long amount;

        public Task03Main(long amount) {
            this.amount = amount;
        }

        @Override
        public long toMillis() {
            return amount * 3600 * 1000;
        }

        @Override
        public long toSeconds() {
            return amount * 3600;
        }

        @Override
        public long toMinutes() {
            return amount * 60;
        }

        @Override
        public long toHours() {
            return amount;
        }
    }

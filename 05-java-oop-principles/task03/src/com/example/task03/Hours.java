package com.example.task03;

public class Hours implements TimeUnit {

    private long hours;

    public Hours(long hours) {
        if (hours >= 0)
            this.hours = hours;
    }

    @Override
    public long toMillis() {
        return hours * 3600000;
    }

    @Override
    public long toSeconds() {
        return hours * 3600;
    }

    @Override
    public long toMinutes() {
        return hours * 60;
    }

    @Override
    public long toHours() {
        return hours;
    }
}

package com.example.task03;

public class Hours implements TimeUnit {

    private final long num;

    public Hours(long num) {this.num = num;}

    @Override
    public long toMillis() {return num * 60 * 60 * 1000;}

    @Override
    public long toSeconds() {return num * 60 * 60;}

    @Override
    public long toMinutes() {return num * 60;}

    @Override
    public long getHours() {return num;}
} 
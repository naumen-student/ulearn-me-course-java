package com.example.task03;

public class Hours implements TimeUnit {

    private  long amount;

    public  Hours(long amount)
    {
        this.amount=amount;
    }

    @Override
    public long toMillis() {
        return Math.round( 1.0*amount/60/60/1000);
    }

    @Override
    public long toSeconds() {
       return Math.round( 1.0*amount/60/60);
    }

    @Override
    public long toMinutes() {
        return Math.round( 1.0*amount/60);
    }

    @Override
    public long toHours() {
        return amount;
    }
}

package com.example.task02;

public class TimeSpan {
    public TimeSpan(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    private int h;
    private int m;
    private int s;

    public int getHours(){
        return this.h;
    }

    public void setHours(int h){
        this.h = h;
    }

    public int getMinutes(){
        return this.m;
    }

    public void setMinutes(int m){
        this.m = m;
    }

    public int getSeconds(){
        return this.s;
    }

    public void setSeconds(int s){
        this.s = s;
    }

    public void add(TimeSpan time){
        this.s += time.s;
        this.m += time.m;
        this.h += time.h;
        toFormat ();
    }

    public void subtract(TimeSpan time){
        this.s -= time.s;
        this.m -= time.m;
        this.h -= time.h;
        toFormat ();
    }

    private void toFormat(){
        this.m += this.s / 60;
        this.s %= 60;
        this.h += this.m / 60;
        this.m %= 60;
        this.h %= 24;
    }

    public String toString(){
        return String.format ("H: {0}, M: {1}, S: {2}", this.h, this.m, this.s);
    }
}


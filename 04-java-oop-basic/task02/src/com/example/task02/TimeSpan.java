package com.example.task02;

import java.sql.Time;

public class TimeSpan {
    private int hour, min, sec;

    public TimeSpan(){
        hour = 0;
        min = 0;
        sec = 0;
    }

    public TimeSpan(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    void setHour(int h){
        hour = h;
    }

    int getHour(){
        return hour;
    }

    void setMin(int m){
        min = m;
    }

    int getMin(){
        return min;
    }

    void setSec(int s){
        this.sec = s;
    }

    int getSec(){
        return sec;
    }

    void add(TimeSpan time){
        hour += time.hour;
        min += time.min;
        sec += time.sec;
    }

    void subtract(TimeSpan time){
        hour -= time.hour;
        min -= time.min;
        sec -= time.sec;
    }

    public String toString(){
        return "(" + hour + ":" + min + ":" + sec + ")";
    }
}

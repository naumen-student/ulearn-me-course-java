package com.example.task02;

public class TimeSpan{
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getMinute(){
        return minute;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getSecond(){
        return second;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void add(TimeSpan timeSpan){
        hour += timeSpan.hour;
        minute += timeSpan.minute;
        second += timeSpan.second;
        normalize();
    }

    public void subtract(TimeSpan timeSpan){
        hour -= timeSpan.hour;
        minute -= timeSpan.minute;
        second -= timeSpan.second;
        normalize();
    }

    private void normalize(){
        minute += second / 60;
        second = second % 60;
        hour += minute / 60;
        minute = minute % 60;
    }

    @Override
    public String toString(){
        return "TimeSpan{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}

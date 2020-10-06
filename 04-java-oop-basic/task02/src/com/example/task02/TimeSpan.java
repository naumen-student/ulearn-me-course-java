package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minuts;
    private int hours;

    public TimeSpan(int seconds, int minuts, int hours) {
        this.seconds = seconds;
        this.minuts = minuts;
        this.hours = hours;
    }

    public int getSeconds() {return seconds;}

    public int getMinuts() {return  minuts;}

    public int getHours() {return  hours;}

    public void setSeconds(int seconds) {this.seconds = seconds;}

    public void setMinuts(int minuts) {this.minuts = minuts;}

    public void setHours(int hours) {this.hours = hours;}

    void add(TimeSpan time) {
        seconds += time.seconds;
        minuts += time.minuts;
        hours += time.hours;
    }

    void subtract(TimeSpan time) {
        seconds -= time.seconds;
        minuts -= time.minuts;
        hours -= time.hours;
    }

    public String toString() {
        return String.format("Hours:%d, Minutes:%d, Seconds:%d", hours, minuts, seconds);
    }
}

package com.example.task02;

import java.sql.Time;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours(){
        return this.hours;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void add(TimeSpan time){
        doOperation(1, time);
    }

    public void subtract(TimeSpan time){
        doOperation(-1, time);
    }

    public String toString(){
        return String.format("%d hours %d minutes %d seconds", this.hours, this.minutes, this.seconds);
    }

    private void doOperation(int sign, TimeSpan time){
        this.hours += sign * time.getHours();
        this.minutes += sign * time.getMinutes();
        this.seconds += sign * time.getSeconds();

        if (this.seconds < 0){
            this.minutes--;
            this.seconds = 60 + this.seconds;
        }

        if (this.seconds > 59){
            this.minutes++;
            this.seconds %= 60;
        }

        if (this.minutes < 0){
            this.hours--;
            this.minutes = 60 + this.minutes;
        }

        if (this.minutes > 59){
            this.hours++;
            this.minutes %= 60;
        }
    }
}

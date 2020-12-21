package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours(){
        return this.hours;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }
    public void setHours(int h){
        this.hours = h;
    }
    public void setMinutes(int m){
        this.minutes = m;
    }
    public void setSeconds(int s){
        this.seconds = s;
    }

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void add (TimeSpan time){
        this.hours += time.hours;
        if (this.minutes + time.minutes >= 60) {
            this.hours++;
            this.minutes = (this.minutes + time.minutes) % 60;
        }
        else this.minutes += time.minutes;

        if (this.seconds + time.minutes >= 60) {
            this.minutes++;
            this.seconds = (this.seconds + time.seconds) % 60;
        }
        else this.seconds += time.seconds;
    }

    void subtract(TimeSpan time){
        this.hours -= time.hours;
        if (this.minutes - time.minutes < 0) {
            this.hours--;
            this.minutes -= 60 - (Math.abs(this.minutes - time.minutes));
        }
        else this.minutes -= time.minutes;

        if (this.seconds - time.seconds < 0){
            this.minutes--;
            this.seconds -= 60 - (Math.abs(this.seconds - time.seconds));
        }
        else this.seconds -= time.seconds;
    }

    public String toString(){
        return String.format("%d:%d:%d",hours,minutes,seconds);
    }
}

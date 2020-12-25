package com.example.task02;

public class TimeSpan {
    private int hours;
    private int mins;
    private int secs;

    public TimeSpan(int hh, int mm, int ss) {
        this.hours = hh;
        this.mins = mm;
        this.secs = ss;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public int getSecs() { return secs; }

    public void setSecs(int secs) {
        this.secs = secs;
    }

    void add(TimeSpan time) {
        this.secs += time.secs;
        if (this.secs > 59) {
            this.mins += 1;
            this.secs -= 60;
        }
        this.mins += time.mins;
        if (this.mins > 59) {
            this.hours += 1;
            this.mins -= 60;
        }
        this.hours += time.hours;
    }

    void subtract(TimeSpan time) {
        this.hours -= time.hours;
        if (time.mins > this.mins) {
            this.hours -= 1;
            setMins(60 + this.mins - time.mins);
        }
        if (time.secs > this.secs) {
            this.mins -= 1;
            setSecs(60 + this.secs - time.secs);
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, mins, secs);
    }
}

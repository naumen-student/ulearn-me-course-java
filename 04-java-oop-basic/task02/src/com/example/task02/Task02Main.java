package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int seconds, int minutes, int hours){
        this.hours = hours + minutes / 60 + seconds / 3600;
        this.minutes = (minutes + (seconds / 60)) % 60;
        this.seconds = seconds % 60;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0)
            throw new IllegalArgumentException("Секунды не могут быть отрицательным параметром");
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0)
            throw new IllegalArgumentException("Минуты не могут быть отрицательным параметром");
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0)
            throw new IllegalArgumentException("Часы не могут быть отрицательным параметром");
        this.hours = hours;
    }

    public void add(TimeSpan time) {
        TimeSpan result = new TimeSpan(toSeconds() + time.toSeconds(), 0, 0);
        seconds = result.getSeconds();
        minutes = result.getMinutes();
        hours = result.getHours();
    }

    public void subtract(TimeSpan time) {
        if (toSeconds() < time.toSeconds()) {
            throw new ArithmeticException("Невозможно сделать интервал отрицательным");
        }
        else {
            TimeSpan result = new TimeSpan(toSeconds() - time.toSeconds(), 0, 0);
            seconds = result.getSeconds();
            minutes = result.getMinutes();
            hours = result.getHours();
        }
    }

    private int toSeconds() {
        return seconds + minutes * 60 + hours * 3600;
    }

    @Override
    public String toString() {
        return String.format("s: %d, m: %d, h: %d", seconds, minutes, hours);
    }
}
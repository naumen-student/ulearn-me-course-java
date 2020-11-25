package com.example.task02;

class TimeSpan {
    private int hour, minute, second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int get_hour() {
        return this.hour;
    }

    public int set_hour(int hour) {
        this.hour = hour;
    }

    public int get_minute() {
        return this.minute;
    }

    public int set_minute(int minute) {
        this.minute = minute;
    }

    public int get_second() {
        return this.second;
    }

    public int set_second(int second) {
        this.second = second;
    }

    void add(TimeSpan time) {
        this.hour += time.hour;
        this.minute += time.minute;
        this.second += time.second;
        toFormat();
    }

    void subtract(TimeSpan time) {
        this.hour -= time.hour;
        this.minute -= time.minute;
        this.second -= time.second;
        toFormat();
    }

    private void toFormat() {
        this.minute += this.second / 60;
        this.second %= 60;
        this.hour += this.minute / 60;
        this.minute %= 60;
        this.hour %= 24;
    }

    public String toString() {
        return String.format("Час: {0}, Минута: {1}, Секунда: {2}", this.hour, this.minute, this.second);
    }
}

package com.example.task02;

public class TimeSpan {
    private int sec;
    private int minute;
    private int hour;

    public TimeSpan(int sec, int minute, int hour){
        this.sec = sec;
        this.minute = minute;
        this.hour = hour;
    }



    public int get_Sec() {
        return sec;
    }

    public int get_Minute() {
        return minute;
    }

    public int get_hour() {
        return hour;
    }

    public void set_Sec(int sec) {
        this.sec = sec;
    }

    public void set_Minute(int minute) {
        this.minute = minute;
    }

    public void set_Hour(int hour) {
        this.hour = hour;
    }

    public void add(TimeSpan time) {
        int all_time_now = hour * 3600 + minute * 60 + sec;
        int to_add = time.get_hour() * 3600 + time.get_Minute() * 60 + time.get_Sec();

        all_time_now += to_add;

        this.hour = all_time_now / 3600;
        all_time_now %= 3600;
        this.minute = all_time_now / 60;
        all_time_now %= 60;
        this.sec = all_time_now;
    }

    void subtract(TimeSpan time) {
        int all_time_now = hour * 3600 + minute * 60 + sec;
        int to_del = time.get_hour() * 3600 + time.get_Minute() * 60 + time.get_Sec();

        all_time_now -= to_del;

        this.hour = all_time_now / 3600;
        all_time_now %= 3600;
        this.minute = all_time_now / 60;
        all_time_now %= 60;
        this.sec = all_time_now;
    }

    public String toString() {
        return Integer.toString(hour)+Integer.toString(minute)+Integer.toString(sec);
    }
}
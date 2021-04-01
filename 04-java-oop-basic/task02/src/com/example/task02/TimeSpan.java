package com.example.task02;

public class TimeSpan {
    private int s;
    private int m;
    private int h;

    public TimeSpan(int s, int m, int h){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public void setS(int s){this.s = s;}
    public void setM(int m){this.m = m;}
    public void setH(int h){this.h = h;}

    public int getS(){return s;}
    public int getM(){return m;}
    public int getH(){return h;}

    void add(TimeSpan time){
        s = time.s;
        m = time.m;
        h = time.h;
    }

    void subtract(TimeSpan time){
        int sec = h * 3600 + m * 60 + s;
        int secNew = time.getH() * 3600 + time.getM() * 60 + time.getS();
        sec -= secNew;
        h = sec % 3600;
        m = (sec - (h * 3600)) % 60;
        s = (sec- (h * 3600) - (s * 60)) % 60;
    }

    public String toString(){
        return String.format("%d:%d:%d",h,m,s);
    }

}
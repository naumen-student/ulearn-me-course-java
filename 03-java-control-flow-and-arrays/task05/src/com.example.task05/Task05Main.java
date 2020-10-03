package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        System.out.println(getMin(5,4,3));
    }

    static int getMin(int a, int b, int c) {
        int tab[] = {a,b,c};
        int minVal = tab[0];

        for(int i = 0; i < tab.length; i++){
            if(tab[i] < minVal)
                minVal = tab[i];
        }
        return minVal;
    }
}
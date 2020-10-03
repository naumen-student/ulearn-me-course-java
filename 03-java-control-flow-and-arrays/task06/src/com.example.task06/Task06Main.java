package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {
        int tab[] = {a,b,c,d};
        int maxVal = tab[0];

        for(int i = 0; i < tab.length; i++){
            if(tab[i] > maxVal)
                maxVal = tab[i];
        }
        return maxVal;
    }

}
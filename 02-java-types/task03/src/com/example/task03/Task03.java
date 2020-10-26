package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {
        int metre = centimetre;
        for (int i = 0; i < 2; i++) {
            if ((metre % 100 != 0) && (metre >= 100)) {
                metre = metre / 100;
                return metre;
            }
        }
       return 0;
    }

    public static void main(String[] args) {

        int result = getMetreFromCentimetre(345);
        System.out.println(result);

    }

}

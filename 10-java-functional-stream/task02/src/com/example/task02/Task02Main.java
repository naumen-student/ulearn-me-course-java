package com.example.task02;

import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Collections;

public class Task02Main {

    public static void main(String[] args) {


        cycleGrayCode(2)
                .limit(10)
                .forEach(System.out::println);


    }

    public static IntStream cycleGrayCode(int n) {
        if (n < 1 || n > 16) throw new IllegalArgumentException();
        ArrayList<Integer> grayCodeList = new ArrayList<>();
        grayCodeList.add(0);
        grayCodeList.add(1);
        for (int power = 1; power < n; power++) {
            grayCodeList = getGrayCode(grayCodeList, power);
        }

        final ArrayList<Integer> result = new ArrayList<>(grayCodeList);
        return IntStream.iterate(0, x -> x + 1).map(x -> result.get(x % result.size()));
    }

    private static ArrayList<Integer> getGrayCode(ArrayList<Integer> lastStepList, int power) {
        ArrayList<Integer> result = new ArrayList<>(lastStepList);
        Collections.reverse(lastStepList);
        result.addAll(lastStepList);
        for (int i = result.size() / 2; i < result.size(); i++) {
            result.set(i, result.get(i) + (int) Math.pow(2, power));
        }
        return result;
    }

}

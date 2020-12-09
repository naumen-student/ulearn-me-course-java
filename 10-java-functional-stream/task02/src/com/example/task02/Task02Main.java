package com.example.task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class Task02Main {

    public static void main(String[] args) {
        cycleGrayCode(2).limit(10).forEach(System.out::println);
    }

    private static ArrayList<Integer> getCodeList(ArrayList<Integer> lastList, int pow) {
        ArrayList<Integer> res = new ArrayList<>(lastList);
        Collections.reverse(lastList);
        res.addAll(lastList);
        for (int i = res.size() / 2; i < res.size(); i++)
            res.set(i, res.get(i) + (int) Math.pow(2, pow));
        return res;
    }

    public static IntStream cycleGrayCode(int n) {
        if (n < 1 || n > 16) throw new IllegalArgumentException();
        ArrayList<Integer> codeList = new ArrayList<>();
        codeList.add(0);
        codeList.add(1);
        for (int pow = 1; pow < n; pow++)
            codeList = getCodeList(codeList, pow);
        final ArrayList<Integer> res = new ArrayList<>(codeList);
        return IntStream.iterate(0, x -> x + 1).map(x -> res.get(x % res.size()));
    }
}

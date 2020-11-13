package com.example.task02;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Task02Main {

    public static void main(String[] args) {
        cycleGrayCode(2);
        /*
        cycleGrayCode(2)
                .limit(10)
                .forEach(System.out::println);
        */

    }

    public static IntStream cycleGrayCode(int n) {
        return IntStream.generate(new GrayCodeSupplier(n));
    }

    static class GrayCodeSupplier implements IntSupplier
    {
        private  final int max;
        private  int current=-1;

        public GrayCodeSupplier(int n)
        {
            if (n<1 || n>16)
                throw  new IllegalArgumentException();
            this.max=(int)Math.pow(2,n);
        }
        @Override
        public int getAsInt() {
            current++;
            if (current>=max)
                current=0;
            return current^ current>>1;
        }
    }
}

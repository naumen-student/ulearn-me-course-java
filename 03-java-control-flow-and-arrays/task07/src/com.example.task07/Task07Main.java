package com.example.task07;

import java.util.Arrays;

public class Task07Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        @@ -15,8 +17,7 @@ public static void main(String[] args) {
        }

        static int sum(int[] arr) {
            //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
            return 0;
            return Arrays.stream(arr).sum();
        }

    }
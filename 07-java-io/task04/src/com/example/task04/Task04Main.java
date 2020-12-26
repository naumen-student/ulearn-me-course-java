package com.example.task04;

import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        Scanner in = new Scanner(System.in);
        double res = 0;
        String str;
        while(in.hasNextLine()){
            str = in.nextLine();
            String[] arr = str.split(" ");
            for(int i = 0; i < arr.length; i++){
                try {
                    res += Double.parseDouble(arr[i]);
                }
                catch (NumberFormatException e){
                    continue;
                }
                catch (NullPointerException e){

                }
            }
        }

        System.out.printf("%.6f", res);
    }
}

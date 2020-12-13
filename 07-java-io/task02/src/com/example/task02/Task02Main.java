package com.example.task02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) throws IOException {
            int first, next = System.in.read();
            while (true){
                if(next == -1){
                    break;
                }
                first = next;
                next = System.in.read();
                if(first == 13 && next == 10){
                    continue;
                }
                else{
                    System.out.write(first);
                }
            }
        }
    }

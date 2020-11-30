package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        try{
            codeWithNPE();
        }
        catch (NullPointerException e){
            System.out.println("error caught");
        }
    }

    static void codeWithNPE() {
        throw new NullPointerException();
    }
}

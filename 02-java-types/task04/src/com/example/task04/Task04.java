package com.example.task04;

import com.github.javaparser.ast.expr.LambdaExpr;
import jdk.dynalink.Operation;
import jdk.nashorn.internal.ir.CallNode;

import javax.swing.*;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Task04 {
    public static float calculate(int a, int b, String operation) {
        switch (operation)
        {
            case "*":
                return  a*b;
            case "/":
                return 1.0f*a/b;
            case "+":
                return a+b;
            case "-":
                return a-b;
            default:
                throw new UnsupportedOperationException(operation + "not supported");
        }
    }

    public static void main(String[] args) {
    }

}

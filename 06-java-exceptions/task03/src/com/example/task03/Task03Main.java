package com.example.task03;

import org.graalvm.compiler.hotspot.stubs.DivisionByZeroExceptionStub;
import sun.jvm.hotspot.oops.CheckedExceptionElement;

public class Task03Main {
    public static void main(String[] args) {

    }

    public static void throwCheckedException() throws Exception {
        throw new Exception("Checked exception");
    }
}
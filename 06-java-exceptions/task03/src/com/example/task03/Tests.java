package com.example.task03;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testThrowCheckedException() {
        try {
            Task03Main.throwCheckedException();
            Assert.fail("fail because exception was not thrown");
        } catch (Exception e) {
            Assert.assertFalse("method should throw checked exception", e instanceof RuntimeException);
        }
    }

}
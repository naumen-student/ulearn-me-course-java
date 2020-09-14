package com.example.task01;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testCanGetDriverLicense() {
        Assert.assertTrue("В 18 можно получить права", Task01Main.canGetDriverLicense(18));
        Assert.assertTrue("В 19 можно получить права", Task01Main.canGetDriverLicense(19));
        Assert.assertTrue("В 99 можно получить права", Task01Main.canGetDriverLicense(99));

        Assert.assertFalse("В 17 нельзя получить права", Task01Main.canGetDriverLicense(17));
        Assert.assertFalse("В 7 нельзя получить права", Task01Main.canGetDriverLicense(7));
        Assert.assertFalse("В 1 нельзя получить права", Task01Main.canGetDriverLicense(1));
    }

}

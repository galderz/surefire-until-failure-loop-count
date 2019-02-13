package com.acme.maven.surefire.untilfailure;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.fail;

public class UntilFailureLoopCountTest {

    @Test
    public void testEventualFailure() {
        Random r = new Random();
        final int i = r.nextInt(10);
        if (i == 5)
            fail("Just messing with your testing");
    }

}

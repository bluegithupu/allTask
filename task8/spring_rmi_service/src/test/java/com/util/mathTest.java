package com.util;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class mathTest {
    math math1 = new math();

    @Test
    public void add() {
        assertEquals(5,math1.add(2,3));
        assertEquals(5,math1.add(4,2));
    }

    @Test
    public void trueorfalse(){
        //false通过。
        assertFalse(1>2);
        //true
        assertTrue(1==1);
    }

}
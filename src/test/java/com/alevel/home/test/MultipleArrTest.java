package com.alevel.home.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleArrTest {

    @Test
    public void multKTest() {
        int k = 3;
        MultipleArr aar = new MultipleArr(new int[]{1, 2, 5, 3, 6, 12, 10, 15});
        int expected[] = new int[]{3, 6, 12, 15};
        assertArrayEquals(expected, aar.MultK(k).arr);

    }
}
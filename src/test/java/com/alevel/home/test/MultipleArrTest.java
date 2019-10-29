package com.alevel.home.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleArrTest {

    private MultipleArr arr;

    @Before
    public void before() {
        System.out.println("before running");
        arr = new MultipleArr();
    }

    @Test
    public void multKTest() {
        int k = 3;
        int[] result = arr.MultK(new int[]{1, 2, 5, 3, 6, 12, 10, 15}, k);
        int expected[] = new int[]{3, 6, 12, 15};
        assertArrayEquals(expected, result);

    }
}
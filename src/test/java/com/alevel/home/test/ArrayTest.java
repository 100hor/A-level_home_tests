package com.alevel.home.test;

import com.alevel.home.test.Array;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class ArrayTest {

    private Array arr;

    @Before
    public void before() {
        System.out.println("before running blabla");
        arr = new Array();
    }

    @Test
    public void sortTest() {
        int[] result = arr.Sort(new int[]{5, 6, 9, 7, 1, 3, 4, 2, 8});
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, result);
    }
}
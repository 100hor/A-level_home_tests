package com.alevel.home.test;
import com.alevel.home.test.Array;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest{


    @Test
    public void sortTest() {
        Array unsorted = new Array(new int[]{5, 6, 9, 7, 1, 3, 4, 2, 8});
        Array expected = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Array sorted = unsorted.Sort();
        assertArrayEquals(expected.arr,sorted.arr);
    }
}
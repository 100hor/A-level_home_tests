package com.alevel.home.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class HAppTest {

    private static HApp hApp;

    @Before
    public void before() {
        System.out.println("before running");
        hApp = new HApp();
    }

    @Test
    public void FindMaxMinTest() {
        int result[] = hApp.FindMaxМin(new int[]{3, 1, 2});
        int expected[] = new int[]{3, 1};
        assertArrayEquals(expected, result);
    }


}
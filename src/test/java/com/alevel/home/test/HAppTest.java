package com.alevel.home.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class HAppTest {

    private static HApp hApp;
    @BeforeClass
    public static void before(){
        System.out.println("before running");
        hApp = new HApp();
    }
    @Test
    public void FindMaxTest(){
        int result = hApp.FindMax(new int[]{3, 1, 2});
        assertEquals(3,result);
    }
    @Test
    public void FindMinTest(){
        int result = hApp.FindMin(new int[]{3, 1, 2});
        assertEquals(1,result);
    }

}
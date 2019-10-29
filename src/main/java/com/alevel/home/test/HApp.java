package com.alevel.home.test;

public class HApp {

    public int[] FindMaxМin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            } else if (arr[i] < min) {
                min = arr[i];
            }

        }
        return new int[]{max, min};
    }


}

package com.alevel.home.test;

public class MultipleArr {
    public int arr[];

    public MultipleArr(int arr[]) {
        this.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }



    public MultipleArr MultK(int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % k == 0){
                count++;
            }
        }

        int marr[] = new int[count];
        int tmp = count;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % k == 0){
                marr[tmp - count] = arr[i];
                count--;
            }
        }
        return new MultipleArr(marr);
    }
}

package com.array.program;

import java.util.Arrays;

public class SecondLargestNo {
    public static void main(String[] args) {
        int arr[] = {1, 23, 32, 23, 44, 65, 67};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}

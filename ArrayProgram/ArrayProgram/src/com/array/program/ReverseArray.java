package com.array.program;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 23, 32, 23, 44, 65, 67,97,96,23,87};
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

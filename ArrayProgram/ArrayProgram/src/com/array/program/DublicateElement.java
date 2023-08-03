package com.array.program;

public class DublicateElement {
    public static void main(String[] args) {
        int arr[] = {1, 23, 87, 23, 44, 44, 67,97,96,23,87};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< i;j++)
            if(arr[i]==arr[j]){
                System.out.print(arr[i]+" ");
            }
        }

    }
}

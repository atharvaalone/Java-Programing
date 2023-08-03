package com.array.program;

public class EvenPostion {
    public static void main(String[] args) {
        int arr[] = {1, 23, 32, 23, 44, 65, 67,97,96,23,87};
        for(int i=1;i<=arr.length;i++){
            if(i%2==0){
                System.out.println(arr[i-1]);
            }
        }
    }
}

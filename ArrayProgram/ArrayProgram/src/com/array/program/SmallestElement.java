package com.array.program;

public class SmallestElement {
    public static void main(String[] args) {

                int arr[] = {1, 23, 32, 23, 44, 65, 67};
                int smallest = arr[0];

                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < smallest) {
                       smallest = arr[i];
                    }
                }

                System.out.println("The largest element in the array is: " + smallest);
            }
        }




// code for finding max and min element in the array
package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin  {
    public static void main(String[] args) {
       int arr[]={2,3,46,1,243};
        Arrays.sort(arr);
        System.out.println("Maximum element is "+arr[arr.length-1]);
        System.out.println("Minimum element "+arr[0]);



    }


}

package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Implement a program that shuffles the elements of an ArrayList using the Collections class and prints the shuffled list.
public class Shuffle {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(534);
        list.add(23);
        Collections.shuffle(list);
        System.out.println(list);
 }
}

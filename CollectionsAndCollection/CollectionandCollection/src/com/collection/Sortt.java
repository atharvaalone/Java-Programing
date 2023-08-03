package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to sort a list of strings in alphabetical order using the Collections class.
public class Sortt {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Swraj");
        list.add("Gaotam");
        list.add("Atharva");
        list.add("Hyder");
        Collections.sort(list);
        System.out.println(list);
    }


}

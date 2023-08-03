package com.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionAndCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Atharva");
        list.add("Gaoutam");
        list.add("Raj");
        list.add("Ram");
        System.out.println("Original list values :" + list);
        Collections.sort(list);
        System.out.println("Sorted value are " + list);
        System.out.println("Reverse value are "+);

        Collections.shuffle(list);
        System.out.println("Shuffle " + list);


    }

}

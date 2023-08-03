package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


class ShoppingCart{
    private List<String> items;

    public ShoppingCart(){
        items = new ArrayList<>();
    }

    public void addItems(String item){
        items.add(item);
    }
    public void removeItems(String item){
        items.remove(item);
// items.removeAll(item);
    }

    public List<String> printValues(){
        return Collections.unmodifiableList(items);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItems("Shirt");
        cart.addItems("TShirt");
        cart.addItems("Jeans");
        List<String> values = cart.printValues();
        System.out.println(values);
        cart.removeItems("TShirt");
        System.out.println("After cart values are :"+values);
    }


}
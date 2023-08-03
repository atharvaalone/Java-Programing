package com.nullpointer;


public class AgeValid {

    public static void main(String[] args) {
        validString();
    }

    public static void validString() {
        try {
            String text = null;
            if (text == null) {
                throw new NullPointer("Invalid character please enter some character");
            }
            int length = text.length();
            System.out.println("The length is " + length);
        } catch (NullPointer e) {
            e.printStackTrace();
        }
    }
}



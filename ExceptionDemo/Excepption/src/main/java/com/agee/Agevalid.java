package com.agee;

import org.example.InvalidAgeException;
class InvalidAgeExaception extends Exception {

    public InvalidAgeExaception(String message){
        super(message);
    }
}

public class Agevalid {
    public static void main(String[] args) {
        try {
            int age = 10;
            if (age < 18) {
                throw new InvalidAgeExaception("Age must be 18 or Above");
            } else {
                System.out.println("Age is Valid.......");
            }

        } catch (InvalidAgeExaception e) {
            e.printStackTrace();
        }
    }
}



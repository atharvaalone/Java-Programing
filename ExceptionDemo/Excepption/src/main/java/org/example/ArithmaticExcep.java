package org.example;

public class ArithmaticExcep {
    public static void main(String[]args){
        try{
            int result= divideNumver(10,0);
        }catch (ArithmeticException ex){
            ex.printStackTrace();
        }
    }
    public static int divideNumver(int a,int b){
        return a/b;
    }
}

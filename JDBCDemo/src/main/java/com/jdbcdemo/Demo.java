package com.jdbcdemo;

public class Demo {
  static int i=10;
    public void showdata(){
        System.out.println(Demo.i);
   }
    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.showdata();
    }
}

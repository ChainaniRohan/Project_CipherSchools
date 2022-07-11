package com.cipherSchool.class3;

public class Demo {
    //    private int a;
//    protected int b;
    protected int c;
//    int d; //default
}
// the other half code is in class2\DemoDriver.java

class Driver {
    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.c = 35;
        System.out.println("Data: " + ob.c);
    }
}
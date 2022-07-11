package com.cipherSchool.Class1;

public class a {
    //java is considerd as Pure OOP langurage.

    //int x = 15; this is primitive data type not an object!
    //Integer X = new Integer(15); this is integer class object!
    // These classes are known as wrappwr classes!

    /*
       * JVM, JRE & JDK
       * JVM - java virtual Machine
       * JRE - java Runtime Environment
       * JDK - jva development Kit
       *
       * Task of jvm:
       * load the byte code
       * verifies the code
       * provide jre for execution!
       * execution of code
       *
       * jvm is a platform for java whereas C or C++ are directly Handled by OS and ther platform is OS
       * therefore java is known as portable or platform independent Language!
       * || Write once , Run Anywhere||
       *
       * But,JVM IS platform Dependent! as it intract with OS.
       *
       * SPEED OF EXECUTION --> C>C++>JAVA>PYTHON
       *
       * #include <stdio.h>
       * int main()
       * {
       *   printf("hello");
       *   return 0;
       * }
       *
       * if i save the C code in prgrm.cpp (C++ File) file
       * this means every c program is c++ program but every c++ program is no c program
       */
    /*
       * CLASS AND OBJECT!
       *
       * Class is a collection of similar Objects!
       * Object is instance of a Class!
       *
       * example
       * 10 Similar audi cars at one place!
       * can We call it a class?
       * No , this is just 10 objects!
       *
       * CLASS: is just a blueprint or set of Fetures not a Physical object
       * OBJECT; is a physical objcet containg set of fetures or implimentation of fetures of  class
    */

    // CLASS CONTAINS: Data Members, Methods, Constructor, Block.

    int x; // data member

    //Method/Member Function
    void show(){
        System.out.println("Data: "+ x);
    }
    public static void main(String[] args) {
        a ob = new a(); // object creation
        ob.x = 25;
        ob.show();
    }
}

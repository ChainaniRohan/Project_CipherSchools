package com.cipherSchool.Class6;
import java.util.Scanner;

/*
* // DAY 6

/* Method Overriding :- Redefinging parent class method in child class (Below code is example of method Overriding!)
Here, decision regarding which definition of accl() id to be invoked is done at Runtime
Binding takes place at runtime, so its called Dynamic Binding or Late Binding

Conditions of Method Overriding: 1) function Signature must be same!
                                 2) We cannot make it more stricter!
                                   (We can keep the same level of stricteness or Lower!)
                                 3)

Hence Runtime Polymorphism is Involved!..

class vehical {
    void accl() {
        System.out.println("Accelerating at 100kmph!");
    }
    void brake() {
        System.out.println("Braking!...");
    }
}

class Main extends vehical {
    void accl() {
        System.out.println("Accelerating at 220kmph!");
    }
    public static void main(String[] args) {
        Main ob = new Main();
        ob.accl();
        ob.brake();
    }
}



// Printing Object (Overriding toString())
import java.util.Scanner;
class test {
    int data;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter test data: ");
        data = sc.nextInt();

    }

    // void show() {
    //     System.out.println(data);
    // }

    public String toString() {
        // return String.valueOf(data);
        return Integer.toString(data);
    }

}

class Main {
    public static void main(String[] args) {

        // int b = 53;
        test ob = new test();
        ob.input();
        // ob.show();
        System.out.println(ob); // tryies to call ob.toString() method
        // System.out.println("Value : " + b);
    }
}


class sum {
    int a, b, res;
    sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add() {
        res = a + b;
    }

    public String toString() {
        return "Sum = " + res;
    }
}

class Main {
    public static void main(String[] args) {
        sum s = new sum(22,58);
        s.add();
        System.out.println(s);
    }
}

// Done with Polymorphism!


Abstranction can be Implemented using:
a) Abstract class (>0% & <=100%)
b) interface (100% Abstraction)

inttantiation: creation of Object
Abstract Class : A class which can't be instantiated.(cannot creat object)

if a class contain an "Abstract Method" than the class must be Abstract class!

Abstract Method: A Method has no definition!(or can't be defined) (No function Body)

Note: if a clss is Abstract than its not necessery that all its methods would be Abstract
      but if a method is Abstract than its class will be Abstract!

Abstract method will contain both Abstract method(s) and concrete/compleate method(s).


//Implementation of Abstract class!

+> We Must Implement an abstract class!
+> A child class of abstract class can Implement it
+> The child class must define all the abstract method of parent abstract class.

//level 1  user
abstract class music {
    //abstract method
    abstract void play();
    //compleate method
    void bass() {
        System.out.println("Extar bass...");
    }

}
// Level 2 User!
class musicDevice extends music {
    void play() {
        System.out.println("Playing Music...");
    }
}

// level - 3 user
class Main{
    public static void main(String[] args) {
        musicDevice m = new musicDevice();
        m.play();
        m.bass();
    }
}


//New!
// Implementation of Interface!
// All Methods are abstract and also public by default!
//All data member are final, static and public by default!
// We need to create an implementing class to drive interface!


interface music {
    void play(); //by default it is abstract and public
    void bass();
}

class musicDevice implements music {
    public void play() {
        System.out.println("Playing Music!...");
    }

    public void bass() {
        System.out.println("Extraa Basss!...");
    }
}

class Main{
    public static void main(String[] args) {
        musicDevice m = new musicDevice();
        m.play();
        m.bass();
    }
}




// Multiple Inheritance Using Class is not supported but bu using Interface is possible in Java!

interface drawable {
    void paint();

}

interface sketchable {
    void paint();
}

interface printable extends drawable, sketchable {

}

class print implements printable {
    public void paint() {
        System.out.println("Painting!...");
    }
}

class Main {
    public static void main(String[] args) {
        print p = new print();
        p.paint();
    }
}


// for loop

import java.util.Scanner;
class Main {
    static void display(int a[]) {
        System.out.print("Array elements: ");
        for(int i = 0; i<a.length; i++) {
            System.out.print (a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[], n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter array elements: ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        display(arr);
    }
}

*/
// for each Loop (enhanced For Loop in Java! )
// it is not used much it is mostly used when we have to just display all elements of  Array!
// it is not used for modifications,etc...!




class Main {
    static void display(int a[]) {
        System.out.print("Array elements: ");

        for(int i : a) {
            System.out.println(i + " ");
        }

        // for(int i = 0; i<a.length; i++) {
        //     System.out.print (a[i] + " ");
        // }
    }
    public static void main(String[] args) {
        int arr[], n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter array elements: ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        display(arr);
    }
}
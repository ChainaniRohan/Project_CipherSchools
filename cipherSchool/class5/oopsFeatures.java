package com.cipherSchool.class5;

/*
* OOPs FEATURES!! (Pillars of OOPs)
* 1) Encapsulation : Binding up of data member and method together into a single unit.
*                    (like cpusule medicine is mixture of diff medecines)
* it means data members and methods are bound to work together as a single Unit!
* it gives the benifit of data hiding!
*
* 2) Inheritance : creating a new class from an Existing Class.
*                  New class is called as Child/Derived/Sub Class and
*                  existing class is called as Parent/Base/Super class.
*                  In the process, Child class will inherit properties
*                  of the Parent class.
*
* 3) Polymorphism : Existing in Different Forms.
*
* 4) Abstraction : Providing necessary features while hiding implementation detials.
*                  e.g. : ADT: Abstract Data Type (Stack,Queue,Tree...)
*/

/*
* Inheritance : "IS A" relationship!
* TYPES OF INHERITANCE:
* Single
* Multilevel
* Hierarchical
* Multiple
* Hybrid : Combination of Any two or more Inheritence
*/

/*
Advantages of Inheritance: Code ReUsabiliaty
 */

/*
//Single Inheritance!
class Animal {
    int Legs = 4;
    void run() {
        System.out.println("Running");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Roaring!");
    }

    public static void main(String[] args) {
        Lion l = new Lion();
        Animal a = new Animal();
        l.roar();
        l.run();

        a.run();
//        a.roar(); //Error: Parent object can't access child members!
    }
}
*/

/*
//Multilevel Inheritance!
class Animal {
    void run() {
        System.out.println("Running");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Roaring!");
    }
}
class cub extends Lion {
    void play() {
        System.out.println("Playing!");
    }
    public static void main(String[] args) {
        cub c = new cub();

        c.play();
        c.run();
        c.roar();
    }
}
*/

/*
//Hierarchical Inheritance!

class Animal {
    void run() {
        System.out.println("Running");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Roaring!");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking!");
    }
}
class Drive {
    public static void main(String[] arg s) {
        Lion l = new Lion();
        Dog d = new Dog();

        l.run();
        l.roar();

        d.run();
        d.bark();

//        l.bark(); Sibling cannot use each others object!
//        d.roar();
    }
}
*/
/*
// Multiple Inheritance!
class A {
    void show() {

    }
}

class B {
    void show(){

    }
}

class c extends A, B {
    void fun(){

    }
    public static void main(String[] args){
        C ob = new c();
        ob.show(); // Ambiguity in method invocation!
        //java dose'nt support multiople inheritance due to this
    }
}

//Diamond Problem! // also a example of hybrid inheritance!
*/
/*
// Hybrid Inheritance!
// Super Keyword : it invokes Parent class method in child class!
// example:- super and super()
class A {
    int x;
    public A() {
        System.out.println("Class A Counstructor!");
    }
    void showA() {
        System.out.println("Class A data: " + x);
    }
}

class B extends A {
    int y;
    public B() {
        super(); //super() method invokes parent constructor!
        System.out.println("Class B Counstructor!");
    }
    void showB() {
        System.out.println("Class B Data : " + y);
        super.showA();
    }
}

public class Main{
    public static void main (String[] args) {
        B ob = new B();
        ob.showB();
    }
}
//invocation order is from parent to child so by
//default Parent class Counstructor is invoked!
*/
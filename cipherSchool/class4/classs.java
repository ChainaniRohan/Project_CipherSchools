package com.cipherSchool;

//public class class4 {
//}
/*
   CONSTRUCTOR!!
* class Test{
       //
    Test() {

    }
}
*
* Test ob = new Test(); // creates object !
*
* it will implicitly invoke test constructor and constructor will creat object.
*

Task of Constructor:
1.Create Object
2.Initialize the object

Test ob = new Test();

new Test() => Invokes the constructor
Test ob    => Reference Variable!

 Test obj = new Test();

 Test ob1 = obj;
 */

/*
class Test {
    int a = 20;
    void show() {
        System.out.println("Test Class Method! " + a);
    }

    public static void main(String[] args) {
        new Test().show(); // Anonymous Object (Which dose not have any name) : Use it only once!
    }
}
*/

// Note: when user does not mention any constructor, Only then JVM places a default constructor in the class!

/*
 * Default Constructor
 * public Dummy() {}
class Dummy {
        int a;
        void show() {
        System.out.println("Dummy Class Method! " + a);
        }

public static void main(String[] args) {
        Dummy ob = new Dummy();
        ob.a = 20;
        ob.show();
        }
}
*/
/*
class Dummy {
    int a;
    public Dummy() {
        a = 20; // Inilatiozation of Data Member!
    }
    void show() {
        System.out.println("Default Dummy Class Method! " + a);
    }

    public static void main(String[] args) {
        Dummy ob = new Dummy();
        ob.show();
        ob.a = 35;
        ob.show();
    }
}
*/


class Duummy {
    int a;
    public Duummy() {
        a = 20; // Inilatiozation of Data Member!
    }
    void show() {
        System.out.println("Default Duummy Class Method! " + a);
    }

    public static void main(String[] args) {
        Duummy ob1 = new Duummy();
        Duummy ob2 = new Duummy();
        ob1.show();
        ob2.show();
    }
}

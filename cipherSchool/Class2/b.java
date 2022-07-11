package com.cipherSchool.Class2;
import java.util.Scanner;

    /*
    * DataTypes
    * Primitive:int ,short(int) ,long(int) ,double(float) ,boolean ,char ,float!
    * Non-Primitive: Array, String, Class, etc!
    *
    * WRAPPER CLASSES: Integer, Float, Double, Byte, Short, Boolean, Character, Long!
    *
    * Autoboxing & Auto-Unboxing:
    * boxing:-it means converting primitive data type to
    * Non-Primitive data type(class type or Wrapper class type)!
    * Unboxing:- vice versa
    *
    * int x = 20;
    * Integer i = x;(Autoboxing)
    *
    * Integer y = new Integer(35);
    * int a = y; (Auto-Unboxing)
    */

/*
*STATIC & NON-STATIC:-
* Static Variable: static int x (x is static variable)
* Non-Static Variable : int y (y is non-static variable)
*
* DIFFERENCE BTW STATIC AND NON-STATIC:-
* if there are 2 or 3 or more no of object then the all the objects
* will have there own memory for non static variable whereas for
* static vaiable there will be one memory allocated for all objects
* and it will store the highest value of static variabe assigned !
*
* */

import java.util.Scanner;

//OOp Methodology
class testDatatype {
    static int x;// static
    int y; // NOn-Static

    void show(){
        System.out.println("data: "+ x + " " + y);
    }
}
// Driver Class
class testDrive {
    public static void main(String[] args) {
        testDatatype ob1 = new testDatatype(); //when object of one class is created in another class it is known as
        testDatatype ob2 = new testDatatype();//Composition ("has a" Relationship)
        ob1.x= 15;
        ob1.y = 25;

        ob2.x = 30;
        ob2.y = 50;

        ob1.show();
        ob2.show();
    }
}

class Student {
    String name;
    int regno;
    static int sem;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Reg No.: ");
        regno = sc.nextInt();
        System.out.println("Enter Semester: ");
        sem = sc.nextInt();

    }

    void show() {
        System.out.println("Detials:- ");
        System.out.println("Name: " + name);
        System.out.println("Reg No.: " + regno);
        System.out.println("Semester: " + sem);

    }
}

class Database {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.input();
        s2.input();

        s1.show();
        s2.show();
    }
}